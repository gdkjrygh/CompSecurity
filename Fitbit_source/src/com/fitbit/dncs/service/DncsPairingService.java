// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.connection.BluetoothConnectionController;
import com.fitbit.bluetooth.g;
import com.fitbit.data.domain.device.Device;
import com.fitbit.dncs.DncsPairingManager;
import com.fitbit.e.a;
import com.fitbit.util.p;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.dncs.service:
//            b, a, DncsPairingError, DncsUnPairTrackerOperation, 
//            DncsPairTrackerOperation, DncsOperation

public class DncsPairingService extends Service
{

    public static final String a = "com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_STARTED";
    public static final String b = "com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_FINISHED";
    private static final String c = "DncsPairingService";
    private static final String d = "com.fitbit.dncs.service.DncsPairingService.EXTRA_OPERATION_INFO";
    private static final String e = "com.fitbit.dncs.service.DncsPairingService.EXTRA_OPERATION_ERROR";
    private b f;
    private com.fitbit.dncs.service.a g;

    public DncsPairingService()
    {
        f = com.fitbit.dncs.service.b.a();
    }

    public static com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo a(Intent intent)
    {
        if (intent != null && ("com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_FINISHED".equals(intent.getAction()) || "com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_STARTED".equals(intent.getAction())))
        {
            return (com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo)intent.getParcelableExtra("com.fitbit.dncs.service.DncsPairingService.EXTRA_OPERATION_INFO");
        } else
        {
            return null;
        }
    }

    static DncsPairingError a(DncsPairingService dncspairingservice, com.fitbit.dncs.service.a a1)
    {
        return dncspairingservice.a(a1);
    }

    private DncsPairingError a(com.fitbit.dncs.service.a a1)
    {
        Object obj = null;
        if (a1.c().e())
        {
            a1 = (DncsPairingError)a1.d();
            obj = a1;
            if (a1 == null)
            {
                obj = com.fitbit.dncs.service.DncsPairingError.a;
            }
        }
        return ((DncsPairingError) (obj));
    }

    static com.fitbit.dncs.service.a a(DncsPairingService dncspairingservice)
    {
        return dncspairingservice.g;
    }

    private void a()
    {
        if (g != null)
        {
            com.fitbit.e.a.a("DncsPairingService", "Cancelling current operation", new Object[0]);
            g.b();
        }
    }

    public static void a(Context context)
    {
        Context context1 = context;
        if (context == null)
        {
            context1 = FitBitApplication.a().getApplicationContext();
        }
        context1.startService(new Intent(context1, com/fitbit/dncs/service/DncsPairingService));
    }

    private void a(Device device)
    {
        DncsOperation.a a1 = new DncsOperation.a() {

            final DncsPairingService a;

            private void a()
            {
                BluetoothConnectionController.a().b(com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer.e);
                if (com.fitbit.dncs.service.DncsPairingService.a(a).q())
                {
                    com.fitbit.dncs.service.DncsPairingService.a(a, com.fitbit.dncs.service.DncsPairingService.a(a).n());
                }
                com.fitbit.dncs.service.DncsPairingService.a(a, DncsPairingService.b(a).b(), com.fitbit.dncs.service.DncsPairingService.a(a, com.fitbit.dncs.service.DncsPairingService.a(a)));
                DncsPairingService.b(a).a(null);
                DncsPairingService.b(a, null);
                a.stopSelf();
            }

            public void a(DncsOperation dncsoperation)
            {
                if (dncsoperation != com.fitbit.dncs.service.DncsPairingService.a(a))
                {
                    return;
                } else
                {
                    com.fitbit.e.a.a("DncsPairingService", "Operation started: %s", new Object[] {
                        com.fitbit.dncs.service.DncsPairingService.a(a)
                    });
                    return;
                }
            }

            public void a(DncsOperation dncsoperation, boolean flag)
            {
                if (dncsoperation != com.fitbit.dncs.service.DncsPairingService.a(a))
                {
                    return;
                } else
                {
                    com.fitbit.e.a.a("DncsPairingService", "Operation finished: %s", new Object[] {
                        com.fitbit.dncs.service.DncsPairingService.a(a)
                    });
                    a();
                    return;
                }
            }

            
            {
                a = DncsPairingService.this;
                super();
            }
        };
        com.fitbit.e.a.a("DncsPairingService", "Starting unpair operation", new Object[0]);
        g = new DncsUnPairTrackerOperation(device, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer.e, a1);
        g.a();
    }

    private void a(Device device, com.fitbit.dncs.ui.DncsPairingRequestDialogController.DncsPairingTrigger dncspairingtrigger)
    {
        DncsOperation.a a1 = new DncsOperation.a() {

            final DncsPairingService a;

            private void a()
            {
                BluetoothConnectionController.a().b(com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer.e);
                if (com.fitbit.dncs.service.DncsPairingService.a(a).q())
                {
                    com.fitbit.dncs.service.DncsPairingService.a(a, com.fitbit.dncs.service.DncsPairingService.a(a).n());
                }
                com.fitbit.dncs.service.DncsPairingService.a(a, DncsPairingService.b(a).b(), com.fitbit.dncs.service.DncsPairingService.a(a, com.fitbit.dncs.service.DncsPairingService.a(a)));
                DncsPairingService.b(a).a(null);
                DncsPairingService.b(a, null);
                a.stopSelf();
            }

            public void a(DncsOperation dncsoperation)
            {
                if (dncsoperation != com.fitbit.dncs.service.DncsPairingService.a(a))
                {
                    return;
                } else
                {
                    com.fitbit.e.a.a("DncsPairingService", "Operation started: %s", new Object[] {
                        com.fitbit.dncs.service.DncsPairingService.a(a)
                    });
                    return;
                }
            }

            public void a(DncsOperation dncsoperation, boolean flag)
            {
                if (dncsoperation != com.fitbit.dncs.service.DncsPairingService.a(a))
                {
                    return;
                } else
                {
                    com.fitbit.e.a.a("DncsPairingService", "Operation finished: %s", new Object[] {
                        com.fitbit.dncs.service.DncsPairingService.a(a)
                    });
                    a();
                    return;
                }
            }

            
            {
                a = DncsPairingService.this;
                super();
            }
        };
        com.fitbit.e.a.a("DncsPairingService", "Starting pair operation", new Object[0]);
        g = new DncsPairTrackerOperation(device, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer.e, dncspairingtrigger, a1);
        g.a();
    }

    private void a(com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo dncspairingtaskinfo)
    {
        if (dncspairingtaskinfo != null)
        {
            Intent intent = new Intent("com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_STARTED");
            intent.putExtra("com.fitbit.dncs.service.DncsPairingService.EXTRA_OPERATION_INFO", dncspairingtaskinfo);
            z.a(intent);
        }
    }

    private void a(com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo dncspairingtaskinfo, DncsPairingError dncspairingerror)
    {
        if (dncspairingtaskinfo != null)
        {
            Intent intent = new Intent("com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_FINISHED");
            intent.putExtra("com.fitbit.dncs.service.DncsPairingService.EXTRA_OPERATION_INFO", dncspairingtaskinfo);
            if (dncspairingerror != null)
            {
                intent.putExtra("com.fitbit.dncs.service.DncsPairingService.EXTRA_OPERATION_ERROR", dncspairingerror.name());
            }
            z.a(intent);
        }
    }

    static void a(DncsPairingService dncspairingservice, com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo dncspairingtaskinfo, DncsPairingError dncspairingerror)
    {
        dncspairingservice.a(dncspairingtaskinfo, dncspairingerror);
    }

    static void a(DncsPairingService dncspairingservice, String s)
    {
        dncspairingservice.a(s);
    }

    private void a(String s)
    {
        com.fitbit.multipledevice.a.a().a(s, com.fitbit.serverinteraction.SynclairApi.SyncTrigger.a, true);
    }

    public static DncsPairingError b(Intent intent)
    {
        if (intent != null && "com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_FINISHED".equals(intent.getAction()))
        {
            intent = intent.getStringExtra("com.fitbit.dncs.service.DncsPairingService.EXTRA_OPERATION_ERROR");
            if (intent != null)
            {
                return DncsPairingError.valueOf(intent);
            }
        }
        return null;
    }

    static com.fitbit.dncs.service.a b(DncsPairingService dncspairingservice, com.fitbit.dncs.service.a a1)
    {
        dncspairingservice.g = a1;
        return a1;
    }

    static b b(DncsPairingService dncspairingservice)
    {
        return dncspairingservice.f;
    }

    private void b()
    {
        if (g == null)
        {
            stopSelf();
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        com.fitbit.e.a.a("DncsPairingService", "Create service.", new Object[0]);
        f.a(null);
    }

    public void onDestroy()
    {
        super.onDestroy();
        com.fitbit.e.a.a("DncsPairingService", "Destroy service.", new Object[0]);
        BluetoothConnectionController.a().b(com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer.e);
        f.a(null);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        i = 1;
        intent = f.b();
        com.fitbit.e.a.a("DncsPairingService", "Started. Current = %s", new Object[] {
            intent
        });
        if (intent == null) goto _L2; else goto _L1
_L1:
        com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo dncspairingtaskinfo = DncsPairingManager.a().a(((com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo) (intent)).a);
        com.fitbit.e.a.a("DncsPairingService", "Existing = %s", new Object[] {
            dncspairingtaskinfo
        });
        if (dncspairingtaskinfo == null || !((com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo) (intent)).a.equals(dncspairingtaskinfo.a) || ((com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo) (intent)).b.a() != dncspairingtaskinfo.b.a())
        {
            a();
        }
_L4:
        b();
        return 2;
_L2:
        intent = DncsPairingManager.a().d();
        com.fitbit.e.a.a("DncsPairingService", "New = %s", new Object[] {
            intent
        });
        if (intent != null)
        {
            Device device = p.d(((com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo) (intent)).a);
            if (device != null)
            {
                if (!com.fitbit.bluetooth.g.g())
                {
                    com.fitbit.e.a.a("DncsPairingService", "Bluetooth is disabled", new Object[0]);
                    i = 0;
                }
                if (com.fitbit.bluetooth.g.h())
                {
                    com.fitbit.e.a.a("DncsPairingService", "Bluetooth access is restricted", new Object[0]);
                    i = 0;
                }
                if (i != 0)
                {
                    f.a(intent);
                    a(intent);
                    if (((com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo) (intent)).b.a())
                    {
                        if (((com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo) (intent)).c == 0)
                        {
                            com.fitbit.savedstate.g.a(device, false);
                        }
                        if (((com.fitbit.dncs.DncsPairingManager.DncsPairingTaskInfo) (intent)).b == com.fitbit.dncs.DncsPairingManager.DncsPairingType.b)
                        {
                            intent = com.fitbit.dncs.ui.DncsPairingRequestDialogController.DncsPairingTrigger.b;
                        } else
                        {
                            intent = com.fitbit.dncs.ui.DncsPairingRequestDialogController.DncsPairingTrigger.a;
                        }
                        a(device, intent);
                    } else
                    {
                        a(device);
                    }
                }
            } else
            {
                a(intent, DncsPairingError.d);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
