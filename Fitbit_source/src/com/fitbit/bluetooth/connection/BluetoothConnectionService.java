// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.app.Service;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import com.fitbit.bluetooth.AirlinkSession;
import com.fitbit.bluetooth.commands.CommandName;
import com.fitbit.bluetooth.commands.f;
import com.fitbit.e.a;
import com.fitbit.util.threading.FitbitHandlerThread;
import com.fitbit.util.threading.c;
import com.fitbit.util.threading.d;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            e, g, h, d, 
//            BluetoothConnectionServiceStatus

public class BluetoothConnectionService extends Service
{
    public static final class CommandCompletionReason extends Enum
    {

        public static final CommandCompletionReason a;
        public static final CommandCompletionReason b;
        public static final CommandCompletionReason c;
        private static final CommandCompletionReason d[];

        public static CommandCompletionReason valueOf(String s1)
        {
            return (CommandCompletionReason)Enum.valueOf(com/fitbit/bluetooth/connection/BluetoothConnectionService$CommandCompletionReason, s1);
        }

        public static CommandCompletionReason[] values()
        {
            return (CommandCompletionReason[])d.clone();
        }

        static 
        {
            a = new CommandCompletionReason("SUCCESS", 0);
            b = new CommandCompletionReason("FAIL", 1);
            c = new CommandCompletionReason("CANCEL", 2);
            d = (new CommandCompletionReason[] {
                a, b, c
            });
        }

        private CommandCompletionReason(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    public static final String a = "com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_CONNECT";
    public static final String b = "com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_DISCONNECT";
    public static final String c = "com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_EXECUTE_COMMAND";
    public static final String d = "com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_EXECUTE_CANCEL";
    public static final String e = "com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_CONNECTED";
    public static final String f = "com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_DISCONNECTED";
    public static final String g = "com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_COMMAND_FINISHED";
    public static final String h = "com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_STARTED";
    public static final String i = "com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_ACTION_UUID";
    public static final String j = "com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_COMMAND";
    public static final String k = "com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_TRACKER_ID";
    public static final String l = "com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_COMMAND_COMPLETION_REASON";
    public static final String m = "com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_SUCCESS";
    public static final String n = "com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_RESULT";
    private static final String o = "BluetoothConnectionService";
    private static final long p = 0x1d4c0L;
    private final c q;
    private final d r;
    private g s;
    private com.fitbit.bluetooth.commands.d t;
    private com.fitbit.bluetooth.connection.d u;
    private boolean v;
    private com.fitbit.bluetooth.commands.d.a w;

    public BluetoothConnectionService()
    {
        q = new c(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a) {

            final BluetoothConnectionService a;

            public void a(Intent intent)
            {
                if (com.fitbit.bluetooth.connection.BluetoothConnectionService.a(a))
                {
                    com.fitbit.e.a.a("BluetoothConnectionService", "Unable to process broadcast %s. Service is stopping", new Object[] {
                        intent.getAction()
                    });
                } else
                {
                    if ("com.fitbit.bluetooth.connection.ConnectionStateContext.ACTION_CONNECTION_OPENED".equals(intent.getAction()))
                    {
                        com.fitbit.bluetooth.connection.BluetoothConnectionService.a(a, intent);
                        return;
                    }
                    if ("com.fitbit.bluetooth.connection.ConnectionStateContext.ACTION_CONNECTION_CLOSED".equals(intent.getAction()))
                    {
                        BluetoothConnectionService.b(a, intent);
                        return;
                    }
                    if ("com.fitbit.bluetooth.dncs.ACTION_DEVICE_SUBSCRIBED".equals(intent.getAction()))
                    {
                        BluetoothConnectionService.b(a).a(BluetoothConnectionService.b(a).b().i().d(true).a());
                        return;
                    }
                    if ("com.fitbit.bluetooth.dncs.ACTION_DEVICE_DISCONNECTED".equals(intent.getAction()))
                    {
                        BluetoothConnectionService.b(a).a(BluetoothConnectionService.b(a).b().i().d(false).a());
                        return;
                    }
                }
            }

            
            {
                a = BluetoothConnectionService.this;
                super(threadname);
            }
        };
        r = new d(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a);
        v = false;
        w = new com.fitbit.bluetooth.commands.d.a() {

            final BluetoothConnectionService a;

            public void a()
            {
                if (com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a) == null)
                {
                    com.fitbit.e.a.a("BluetoothConnectionService", "Current command does not exists but onCommandCancelled received", new Object[0]);
                    return;
                } else
                {
                    com.fitbit.e.a.a("BluetoothConnectionService", "Command %s cancelled", new Object[] {
                        com.fitbit.bluetooth.commands.f.a(com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a))
                    });
                    com.fitbit.bluetooth.connection.BluetoothConnectionService.a(a, com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a), com.fitbit.bluetooth.connection.CommandCompletionReason.c, null);
                    com.fitbit.bluetooth.connection.BluetoothConnectionService.a(a, null);
                    return;
                }
            }

            public void a(boolean flag, Bundle bundle)
            {
                boolean flag3 = true;
                boolean flag1 = true;
                if (com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a) == null)
                {
                    com.fitbit.e.a.a("BluetoothConnectionService", "Current command does not exists but onCommandExecuted received with success: %s and result: %s", new Object[] {
                        Boolean.valueOf(flag), bundle
                    });
                    return;
                }
                Object obj = com.fitbit.bluetooth.commands.f.a(com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a));
                com.fitbit.e.a.a("BluetoothConnectionService", "Command %s executed with success = %s and result: %s", new Object[] {
                    obj, Boolean.valueOf(flag), bundle
                });
                if (!flag)
                {
                    com.fitbit.e.a.e("BluetoothConnectionService", "Command %s failed with result: %s", new Object[] {
                        obj, bundle
                    });
                }
                if (obj == CommandName.a)
                {
                    flag3 = com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a).o().getBoolean("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE", false);
                    obj = BluetoothConnectionService.b(a);
                    Object obj1 = BluetoothConnectionService.b(a).b().i();
                    com.fitbit.bluetooth.commands.d d1;
                    if (!flag3 || !flag)
                    {
                        flag1 = false;
                    }
                    ((com.fitbit.bluetooth.connection.d) (obj)).a(((BluetoothConnectionServiceStatus.a) (obj1)).b(flag1).a());
                } else
                if (obj == CommandName.b)
                {
                    boolean flag2 = com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a).o().getBoolean("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE", false);
                    obj = BluetoothConnectionService.b(a);
                    BluetoothConnectionServiceStatus.a a1 = BluetoothConnectionService.b(a).b().i();
                    if (flag2 && flag)
                    {
                        flag2 = flag3;
                    } else
                    {
                        flag2 = false;
                    }
                    ((com.fitbit.bluetooth.connection.d) (obj)).a(a1.c(flag2).a());
                } else
                if (obj == CommandName.c)
                {
                    if (bundle != null && flag)
                    {
                        obj = (AirlinkSession)bundle.getParcelable(com.fitbit.bluetooth.commands.d.h);
                    } else
                    {
                        obj = null;
                    }
                    BluetoothConnectionService.b(a).a(BluetoothConnectionService.b(a).b().i().a(flag, ((AirlinkSession) (obj))).a());
                } else
                if (obj == CommandName.d)
                {
                    BluetoothConnectionService.b(a).a(BluetoothConnectionService.b(a).b().i().a(false, null).a());
                }
                obj1 = a;
                d1 = com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a);
                if (flag)
                {
                    obj = com.fitbit.bluetooth.connection.CommandCompletionReason.a;
                } else
                {
                    obj = CommandCompletionReason.b;
                }
                com.fitbit.bluetooth.connection.BluetoothConnectionService.a(((BluetoothConnectionService) (obj1)), d1, ((CommandCompletionReason) (obj)), bundle);
                com.fitbit.bluetooth.connection.BluetoothConnectionService.a(a, null);
            }

            
            {
                a = BluetoothConnectionService.this;
                super();
            }
        };
    }

    static com.fitbit.bluetooth.commands.d a(BluetoothConnectionService bluetoothconnectionservice, com.fitbit.bluetooth.commands.d d1)
    {
        bluetoothconnectionservice.t = d1;
        return d1;
    }

    private void a()
    {
        if (!v)
        {
            com.fitbit.e.a.a("BluetoothConnectionService", "Stopping service", new Object[0]);
            v = true;
            q.d();
            c();
            if (t != null)
            {
                a(t, CommandCompletionReason.b, null);
                t = null;
            }
            stopSelf();
        }
    }

    private void a(com.fitbit.bluetooth.commands.d d1, CommandCompletionReason commandcompletionreason, Bundle bundle)
    {
        CommandName commandname;
        if (d1 != null)
        {
            if ((commandname = com.fitbit.bluetooth.commands.f.a(d1)) != null)
            {
                Intent intent = new Intent("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_COMMAND_FINISHED");
                intent.putExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_COMMAND", commandname);
                intent.putExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_COMMAND_COMPLETION_REASON", commandcompletionreason);
                intent.putExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_RESULT", bundle);
                commandcompletionreason = com.fitbit.bluetooth.connection.e.b(t.o());
                if (commandcompletionreason != null)
                {
                    intent.putExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_ACTION_UUID", commandcompletionreason);
                }
                if (d1.p() != null)
                {
                    intent.putExtra("android.bluetooth.device.extra.DEVICE", d1.p().l());
                }
                z.a(intent);
                return;
            }
        }
    }

    static void a(BluetoothConnectionService bluetoothconnectionservice, Intent intent)
    {
        bluetoothconnectionservice.e(intent);
    }

    static void a(BluetoothConnectionService bluetoothconnectionservice, com.fitbit.bluetooth.commands.d d1, CommandCompletionReason commandcompletionreason, Bundle bundle)
    {
        bluetoothconnectionservice.a(d1, commandcompletionreason, bundle);
    }

    static boolean a(BluetoothConnectionService bluetoothconnectionservice)
    {
        return bluetoothconnectionservice.v;
    }

    static com.fitbit.bluetooth.connection.d b(BluetoothConnectionService bluetoothconnectionservice)
    {
        return bluetoothconnectionservice.u;
    }

    private void b()
    {
        c();
        r.a(new Runnable() {

            final BluetoothConnectionService a;

            public void run()
            {
                com.fitbit.e.a.a("BluetoothConnectionService", "Connection timeout fired!", new Object[0]);
                com.fitbit.bluetooth.connection.BluetoothConnectionService.f(a);
                if (com.fitbit.bluetooth.connection.BluetoothConnectionService.c(a) != null)
                {
                    com.fitbit.bluetooth.connection.BluetoothConnectionService.c(a).h();
                }
            }

            
            {
                a = BluetoothConnectionService.this;
                super();
            }
        }, 0x1d4c0L);
    }

    static void b(BluetoothConnectionService bluetoothconnectionservice, Intent intent)
    {
        bluetoothconnectionservice.f(intent);
    }

    private boolean b(Intent intent)
    {
        intent = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (s != null)
        {
            com.fitbit.e.a.a("BluetoothConnectionService", "Unable to open connection: previous connection exists.", new Object[0]);
            return false;
        }
        b();
        s = com.fitbit.bluetooth.connection.h.a(intent);
        if (!s.g())
        {
            s = null;
        }
        return true;
    }

    static g c(BluetoothConnectionService bluetoothconnectionservice)
    {
        return bluetoothconnectionservice.s;
    }

    private void c()
    {
        com.fitbit.e.a.a("BluetoothConnectionService", "Reset connection timer", new Object[0]);
        r.a();
    }

    private boolean c(Intent intent)
    {
        if (s == null)
        {
            com.fitbit.e.a.a("BluetoothConnectionService", "Unable to close connection: connection does not exist.", new Object[0]);
            return false;
        } else
        {
            return s.h();
        }
    }

    static boolean c(BluetoothConnectionService bluetoothconnectionservice, Intent intent)
    {
        return bluetoothconnectionservice.b(intent);
    }

    static com.fitbit.bluetooth.commands.d d(BluetoothConnectionService bluetoothconnectionservice)
    {
        return bluetoothconnectionservice.t;
    }

    private boolean d(Intent intent)
    {
        if (s == null)
        {
            com.fitbit.e.a.a("BluetoothConnectionService", "Unable to execute command: connection does not exist.", new Object[0]);
            return false;
        }
        if (t != null)
        {
            com.fitbit.e.a.a("BluetoothConnectionService", "Unable to execute command: previous command exists.", new Object[0]);
            return false;
        }
        t = com.fitbit.bluetooth.commands.f.a(s, intent, w);
        if (t == null)
        {
            com.fitbit.e.a.a("BluetoothConnectionService", String.format("Unable to execute command: unrecognized command, [%s].", new Object[] {
                intent.getStringExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_COMMAND")
            }), new Object[0]);
            return false;
        } else
        {
            com.fitbit.e.a.a("BluetoothConnectionService", "Execute command: %s", new Object[] {
                com.fitbit.bluetooth.commands.f.a(t)
            });
            return t.l();
        }
    }

    static boolean d(BluetoothConnectionService bluetoothconnectionservice, Intent intent)
    {
        return bluetoothconnectionservice.c(intent);
    }

    private void e(Intent intent)
    {
        c();
        com.fitbit.e.a.a("BluetoothConnectionService", "Connection opened", new Object[0]);
        intent.setAction("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_CONNECTED");
        BluetoothConnectionServiceStatus.a a1 = new BluetoothConnectionServiceStatus.a();
        a1.a(true);
        a1.a((BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"));
        a1.d(u.b().g());
        u.a(a1.a(), intent);
        z.a(intent);
    }

    static void e(BluetoothConnectionService bluetoothconnectionservice)
    {
        bluetoothconnectionservice.a();
    }

    static boolean e(BluetoothConnectionService bluetoothconnectionservice, Intent intent)
    {
        return bluetoothconnectionservice.d(intent);
    }

    private void f(Intent intent)
    {
        c();
        com.fitbit.e.a.a("BluetoothConnectionService", "Connection closed", new Object[0]);
        intent.setAction("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_DISCONNECTED");
        u.a(new BluetoothConnectionServiceStatus(), intent);
        s = null;
        a();
    }

    static void f(BluetoothConnectionService bluetoothconnectionservice)
    {
        bluetoothconnectionservice.c();
    }

    protected boolean a(Intent intent)
    {
        if (s == null)
        {
            com.fitbit.e.a.a("BluetoothConnectionService", "Unable to cancel command: connection does not exist.", new Object[0]);
            return false;
        }
        if (t == null)
        {
            com.fitbit.e.a.a("BluetoothConnectionService", "Unable to cancel command: command does not exist.", new Object[0]);
            return false;
        } else
        {
            com.fitbit.e.a.a("BluetoothConnectionService", "Cancel command: %s", new Object[] {
                com.fitbit.bluetooth.commands.f.a(t)
            });
            t.m();
            return true;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        com.fitbit.e.a.a("BluetoothConnectionService", "Service created", new Object[0]);
        u = com.fitbit.bluetooth.connection.d.a();
        u.a(new BluetoothConnectionServiceStatus());
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.bluetooth.connection.ConnectionStateContext.ACTION_CONNECTION_OPENED");
        intentfilter.addAction("com.fitbit.bluetooth.connection.ConnectionStateContext.ACTION_CONNECTION_CLOSED");
        intentfilter.addAction("com.fitbit.bluetooth.dncs.ACTION_DEVICE_SUBSCRIBED");
        intentfilter.addAction("com.fitbit.bluetooth.dncs.ACTION_DEVICE_DISCONNECTED");
        q.a(intentfilter);
    }

    public void onDestroy()
    {
        super.onDestroy();
        u.a(new BluetoothConnectionServiceStatus());
        q.d();
        c();
        com.fitbit.e.a.a("BluetoothConnectionService", "Service destroyed", new Object[0]);
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a, new Runnable(intent) {

            final Intent a;
            final BluetoothConnectionService b;

            public void run()
            {
                if (a != null)
                {
                    String s1 = a.getAction();
                    android.os.ParcelUuid parceluuid = com.fitbit.bluetooth.connection.e.b(a.getExtras());
                    if (com.fitbit.bluetooth.connection.BluetoothConnectionService.a(b))
                    {
                        com.fitbit.e.a.a("BluetoothConnectionService", "Unable to process action. Service is stopping. Restarting...", new Object[0]);
                        b.startService(a);
                    } else
                    {
                        boolean flag;
                        if ("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_CONNECT".equals(s1))
                        {
                            flag = com.fitbit.bluetooth.connection.BluetoothConnectionService.c(b, a);
                        } else
                        if ("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_DISCONNECT".equals(s1))
                        {
                            flag = com.fitbit.bluetooth.connection.BluetoothConnectionService.d(b, a);
                        } else
                        if ("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_EXECUTE_COMMAND".equals(s1))
                        {
                            flag = BluetoothConnectionService.e(b, a);
                        } else
                        if ("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_EXECUTE_CANCEL".equals(s1))
                        {
                            flag = b.a(a);
                        } else
                        {
                            flag = false;
                        }
                        if (parceluuid != null)
                        {
                            Intent intent1 = new Intent("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_STARTED");
                            intent1.putExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_SUCCESS", flag);
                            intent1.putExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_ACTION_UUID", parceluuid);
                            z.a(intent1);
                        }
                        if (!flag)
                        {
                            com.fitbit.e.a.a("BluetoothConnectionService", "Unable to process action: %s", new Object[] {
                                s1
                            });
                            if (com.fitbit.bluetooth.connection.BluetoothConnectionService.c(b) == null && com.fitbit.bluetooth.connection.BluetoothConnectionService.d(b) == null)
                            {
                                BluetoothConnectionService.e(b);
                                return;
                            }
                        }
                    }
                }
            }

            
            {
                b = BluetoothConnectionService.this;
                a = intent;
                super();
            }
        });
        return 1;
    }
}
