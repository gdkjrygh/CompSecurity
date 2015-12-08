// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.PedometerMinuteData;
import com.fitbit.e.a;
import com.fitbit.pedometer.schedule.SchedulingPolicy;
import com.fitbit.pedometer.schedule.b;
import com.fitbit.util.o;
import com.htc.lib2.activeservice.HtcActiveManager;
import com.htc.lib2.activeservice.ServiceConnectionListener;
import com.htc.lib2.activeservice.TransportModeListener;
import com.htc.lib2.activeservice.TransportModeRecord;
import com.htc.lib2.activeservice.TransportRecordsQueryResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.pedometer:
//            e, f, j, g, 
//            h, i

public class HtcPedometerAdapter extends e
{
    private static final class RemoteServiceCommand extends Enum
    {

        public static final RemoteServiceCommand a;
        public static final RemoteServiceCommand b;
        public static final RemoteServiceCommand c;
        public static final RemoteServiceCommand d;
        public static final RemoteServiceCommand e;
        public static final RemoteServiceCommand f;
        private static final RemoteServiceCommand g[];

        public static RemoteServiceCommand valueOf(String s)
        {
            return (RemoteServiceCommand)Enum.valueOf(com/fitbit/pedometer/HtcPedometerAdapter$RemoteServiceCommand, s);
        }

        public static RemoteServiceCommand[] values()
        {
            return (RemoteServiceCommand[])g.clone();
        }

        static 
        {
            a = new RemoteServiceCommand("ENABLE", 0);
            b = new RemoteServiceCommand("DISABLE", 1);
            c = new RemoteServiceCommand("START_STREAM", 2);
            d = new RemoteServiceCommand("STOP_STREAM", 3);
            e = new RemoteServiceCommand("FLUSH", 4);
            f = new RemoteServiceCommand("FLUSH_ALL", 5);
            g = (new RemoteServiceCommand[] {
                a, b, c, d, e, f
            });
        }

        private RemoteServiceCommand(String s, int i1)
        {
            super(s, i1);
        }
    }

    static class a extends i
    {

        private static final String a = "HtcDeterminant";
        private static final int b = 5000;

        a()
        {
        /* block-local class not found */
        class _cls1 {}

            a(new _cls1());
        /* block-local class not found */
        class _cls2 {}

            a(new _cls2());
        }
    }


    private static final String b = "HtcPedometerAdapter";
    private static final String c = "com.fitbit.pedometer.HtcPedometerAdapter.LAST_FLUSH_TIME_PREFERENCE_KEY";
    private static final SchedulingPolicy d = new b();
    private HtcActiveManager e;
    private f f;
    private g g;
    private Date h;
    private List i;
    private final Object j = new Object();
    private boolean k;
    private boolean l;
    private volatile boolean m;
    private TransportModeListener n;
    private ServiceConnectionListener o;

    public HtcPedometerAdapter()
    {
        f = new f(false);
        i = new ArrayList();
        n = new TransportModeListener() {

            final HtcPedometerAdapter a;

            public void onTransportModeChanged(TransportModeRecord transportmoderecord)
            {
                com.fitbit.e.a.d("HtcPedometerAdapter", (new StringBuilder()).append("Received record from HtcActiveManager: ").append(transportmoderecord).toString(), new Object[0]);
                com.fitbit.pedometer.e.a(new Runnable(this, transportmoderecord) {

                    final TransportModeRecord a;
                    final _cls1 b;

                    public void run()
                    {
                        boolean flag1 = true;
                        Object obj = new ArrayList();
                        ((ArrayList) (obj)).add(a);
                        com.fitbit.pedometer.h.a().b(((List) (obj)));
                        obj = com.fitbit.pedometer.HtcPedometerAdapter.a(b.a, new TransportModeRecord[] {
                            a
                        });
                        if (obj != null && !((List) (obj)).isEmpty() && com.fitbit.pedometer.HtcPedometerAdapter.a(b.a) != null && b.a.a != null)
                        {
                            com.fitbit.e.a.d("HtcPedometerAdapter", "Storing Pedometer units in LiveDataCollector...", new Object[0]);
                            com.fitbit.pedometer.HtcPedometerAdapter.a(b.a).a(((List) (obj)));
                            b.a.a.a(com.fitbit.pedometer.HtcPedometerAdapter.a(b.a).a(), com.fitbit.pedometer.HtcPedometerAdapter.a(b.a).b(), com.fitbit.pedometer.HtcPedometerAdapter.a(b.a).c());
                            return;
                        }
                        obj = (new StringBuilder()).append("Unable to store Pedometer units in LiveDataCollector: collector is null = ");
                        boolean flag;
                        if (com.fitbit.pedometer.HtcPedometerAdapter.a(b.a) == null)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        obj = ((StringBuilder) (obj)).append(flag).append(", listener is null = ");
                        if (b.a.a == null)
                        {
                            flag = flag1;
                        } else
                        {
                            flag = false;
                        }
                        com.fitbit.e.a.d("HtcPedometerAdapter", ((StringBuilder) (obj)).append(flag).toString(), new Object[0]);
                    }

            
            {
                b = _pcls1;
                a = transportmoderecord;
                super();
            }
                });
            }

            
            {
                a = HtcPedometerAdapter.this;
                super();
            }
        };
        o = new ServiceConnectionListener() {

            final HtcPedometerAdapter a;

            public void onConnected()
            {
                com.fitbit.pedometer.e.a(new Runnable(this) {

                    final _cls2 a;

                    public void run()
                    {
                        Object obj;
                        boolean flag;
                        boolean flag1;
                        flag1 = false;
                        com.fitbit.e.a.d("HtcPedometerAdapter", "Connected to HtcActiveManager.", new Object[0]);
                        com.fitbit.pedometer.HtcPedometerAdapter.a(a.a, false);
                        static class _cls7
                        {

                            static final int a[];

                            static 
                            {
                                a = new int[RemoteServiceCommand.values().length];
                                try
                                {
                                    a[RemoteServiceCommand.c.ordinal()] = 1;
                                }
                                catch (NoSuchFieldError nosuchfielderror5) { }
                                try
                                {
                                    a[RemoteServiceCommand.d.ordinal()] = 2;
                                }
                                catch (NoSuchFieldError nosuchfielderror4) { }
                                try
                                {
                                    a[com.fitbit.pedometer.RemoteServiceCommand.a.ordinal()] = 3;
                                }
                                catch (NoSuchFieldError nosuchfielderror3) { }
                                try
                                {
                                    a[com.fitbit.pedometer.RemoteServiceCommand.b.ordinal()] = 4;
                                }
                                catch (NoSuchFieldError nosuchfielderror2) { }
                                try
                                {
                                    a[RemoteServiceCommand.f.ordinal()] = 5;
                                }
                                catch (NoSuchFieldError nosuchfielderror1) { }
                                try
                                {
                                    a[RemoteServiceCommand.e.ordinal()] = 6;
                                }
                                catch (NoSuchFieldError nosuchfielderror)
                                {
                                    return;
                                }
                            }
                        }

                        Iterator iterator;
                        RemoteServiceCommand remoteservicecommand;
                        int i1;
                        try
                        {
                            com.fitbit.e.a.a("HtcPedometerAdapter", "Checking if HtcActiveManager is enabled...", new Object[0]);
                            com.fitbit.pedometer.HtcPedometerAdapter.b(a.a, com.fitbit.pedometer.HtcPedometerAdapter.b(a.a).isEnabled());
                            com.fitbit.e.a.a("HtcPedometerAdapter", "HtcActiveManager is enabled = %s", new Object[] {
                                Boolean.valueOf(HtcPedometerAdapter.c(a.a))
                            });
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj)
                        {
                            com.fitbit.e.a.d("HtcPedometerAdapter", "Unable to check if HtcActiveManager is enabled", ((Throwable) (obj)), new Object[0]);
                            com.fitbit.pedometer.HtcPedometerAdapter.b(a.a, false);
                        }
                        obj = HtcPedometerAdapter.d(a.a);
                        obj;
                        JVM INSTR monitorenter ;
                        Exception exception;
                        if (!HtcPedometerAdapter.e(a.a).contains(com.fitbit.pedometer.RemoteServiceCommand.b) && !HtcPedometerAdapter.e(a.a).contains(com.fitbit.pedometer.RemoteServiceCommand.a))
                        {
                            flag = false;
                        } else
                        {
                            flag = true;
                        }
                        if (HtcPedometerAdapter.c(a.a) || flag)
                        {
                            break MISSING_BLOCK_LABEL_175;
                        }
                        HtcPedometerAdapter.c(a.a, true);
                        com.fitbit.e.a.a("HtcPedometerAdapter", "Pending commands: %s", new Object[] {
                            HtcPedometerAdapter.e(a.a)
                        });
                        iterator = HtcPedometerAdapter.e(a.a).iterator();
                        flag = false;
_L11:
                        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
                        remoteservicecommand = (RemoteServiceCommand)iterator.next();
                        i1 = com.fitbit.pedometer._cls7.a[remoteservicecommand.ordinal()];
                        i1;
                        JVM INSTR tableswitch 1 6: default 288
                    //                                   1 325
                    //                                   2 339
                    //                                   3 353
                    //                                   4 367
                    //                                   5 430
                    //                                   6 421;
                           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
                        if (false)
                        {
                        }
                        continue; /* Loop/switch isn't completed */
_L4:
                        HtcPedometerAdapter.d(a.a, true);
                        continue; /* Loop/switch isn't completed */
_L5:
                        HtcPedometerAdapter.d(a.a, false);
                        continue; /* Loop/switch isn't completed */
_L6:
                        HtcPedometerAdapter.c(a.a, true);
                        continue; /* Loop/switch isn't completed */
_L7:
                        HtcPedometerAdapter.c(a.a, false);
                        continue; /* Loop/switch isn't completed */
_L2:
                        HtcPedometerAdapter.e(a.a).clear();
                        obj;
                        JVM INSTR monitorexit ;
                        if (flag)
                        {
                            a.a.a(flag1);
                        }
                        return;
                        exception;
                        obj;
                        JVM INSTR monitorexit ;
                        throw exception;
_L8:
                        flag1 = true;
_L9:
                        flag = true;
                        if (true) goto _L11; else goto _L10
_L10:
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
            }

            public void onDisconnected()
            {
                com.fitbit.e.a.a("HtcPedometerAdapter", "Disconnected from HtcActiveService.", new Object[0]);
                com.fitbit.pedometer.HtcPedometerAdapter.a(a, false);
                com.fitbit.pedometer.HtcPedometerAdapter.a(a, new HtcActiveManager(FitBitApplication.a()));
            }

            
            {
                a = HtcPedometerAdapter.this;
                super();
            }
        };
        e = new HtcActiveManager(FitBitApplication.a());
    }

    static g a(HtcPedometerAdapter htcpedometeradapter)
    {
        return htcpedometeradapter.g;
    }

    static HtcActiveManager a(HtcPedometerAdapter htcpedometeradapter, HtcActiveManager htcactivemanager)
    {
        htcpedometeradapter.e = htcactivemanager;
        return htcactivemanager;
    }

    static List a(HtcPedometerAdapter htcpedometeradapter, TransportModeRecord atransportmoderecord[])
    {
        return htcpedometeradapter.a(atransportmoderecord);
    }

    private List a(List list)
    {
        return a((TransportModeRecord[])list.toArray(new TransportModeRecord[list.size()]));
    }

    private static List a(List list, long l1)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext();)
        {
            j j1 = (j)list.next();
            if (l1 <= j1.a())
            {
                arraylist.add(j1);
            } else
            {
                com.fitbit.e.a.e("HtcPedometerAdapter", String.format("Truncated step: %s [%d]", new Object[] {
                    new Date(j1.a()), Long.valueOf(j1.a())
                }), new Object[0]);
            }
        }

        return arraylist;
    }

    private transient List a(TransportModeRecord atransportmoderecord[])
    {
        ArrayList arraylist = new ArrayList();
        int i2 = atransportmoderecord.length;
        for (int i1 = 0; i1 < i2; i1++)
        {
            TransportModeRecord transportmoderecord = atransportmoderecord[i1];
            int k1 = transportmoderecord.getMode();
            int j2 = transportmoderecord.getSteps();
            if (j2 <= 0 || !a(k1))
            {
                continue;
            }
            long l2 = transportmoderecord.getTimestamp();
            long l3 = transportmoderecord.getPeriod();
            long l4 = transportmoderecord.getPeriod() / j2;
            for (int l1 = 0; l1 < j2; l1++)
            {
                j j1 = new j((long)l1 * l4 + (l2 - l3));
                j1.a(transportmoderecord.getMET());
                j1.b(l4);
                arraylist.add(j1);
                if (2 == transportmoderecord.getMode())
                {
                    j1.a(true);
                }
            }

        }

        return arraylist;
    }

    private void a(long l1)
    {
        PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).edit().putLong("com.fitbit.pedometer.HtcPedometerAdapter.LAST_FLUSH_TIME_PREFERENCE_KEY", l1).commit();
    }

    private void a(RemoteServiceCommand remoteservicecommand)
    {
        synchronized (j)
        {
            i.add(remoteservicecommand);
        }
        return;
        remoteservicecommand;
        obj;
        JVM INSTR monitorexit ;
        throw remoteservicecommand;
    }

    private boolean a(int i1)
    {
        return true;
    }

    public static boolean a(PackageManager packagemanager, Intent intent)
    {
        packagemanager = packagemanager.queryIntentActivities(intent, 0x10000);
        return packagemanager != null && !packagemanager.isEmpty();
    }

    static boolean a(HtcPedometerAdapter htcpedometeradapter, boolean flag)
    {
        htcpedometeradapter.m = flag;
        return flag;
    }

    static HtcActiveManager b(HtcPedometerAdapter htcpedometeradapter)
    {
        return htcpedometeradapter.e;
    }

    static boolean b(HtcPedometerAdapter htcpedometeradapter, boolean flag)
    {
        htcpedometeradapter.k = flag;
        return flag;
    }

    static void c(HtcPedometerAdapter htcpedometeradapter, boolean flag)
    {
        htcpedometeradapter.f(flag);
    }

    static boolean c(HtcPedometerAdapter htcpedometeradapter)
    {
        return htcpedometeradapter.k;
    }

    static Object d(HtcPedometerAdapter htcpedometeradapter)
    {
        return htcpedometeradapter.j;
    }

    static void d(HtcPedometerAdapter htcpedometeradapter, boolean flag)
    {
        htcpedometeradapter.g(flag);
    }

    static List e(HtcPedometerAdapter htcpedometeradapter)
    {
        return htcpedometeradapter.i;
    }

    static void f(HtcPedometerAdapter htcpedometeradapter)
    {
        htcpedometeradapter.q();
    }

    private void f(boolean flag)
    {
        com.fitbit.e.a.a("HtcPedometerAdapter", "Switch enabled with permission = %s", new Object[] {
            Boolean.valueOf(flag)
        });
        if (flag)
        {
            try
            {
                com.fitbit.e.a.a("HtcPedometerAdapter", "Called enableWithPermission() with result = %s", new Object[] {
                    Boolean.valueOf(e.enableWithPermission())
                });
                com.fitbit.e.a.a("HtcPedometerAdapter", "HtcActiveManager is enabled = %s", new Object[] {
                    Boolean.valueOf(e.isEnabled())
                });
                return;
            }
            catch (Exception exception)
            {
                j();
                com.fitbit.e.a.e("HtcPedometerAdapter", "Unable to enableWithPermission()/disableWithPermission().", exception, new Object[0]);
                return;
            }
        }
        com.fitbit.e.a.a("HtcPedometerAdapter", "Called disableWithPermission() with result = %s", new Object[] {
            Boolean.valueOf(e.disableWithPermission())
        });
        com.fitbit.e.a.a("HtcPedometerAdapter", "HtcActiveManager is enabled = %s", new Object[] {
            Boolean.valueOf(e.isEnabled())
        });
        return;
    }

    static void g(HtcPedometerAdapter htcpedometeradapter)
    {
        htcpedometeradapter.r();
    }

    private void g(boolean flag)
    {
        com.fitbit.e.a.d("HtcPedometerAdapter", String.format("Switch registered transport mode listener = %s", new Object[] {
            Boolean.valueOf(flag)
        }), new Object[0]);
        if (flag)
        {
            try
            {
                flag = e.registerTransportModeListener(n);
                com.fitbit.e.a.d("HtcPedometerAdapter", (new StringBuilder()).append("Called registerTransportModeListener() with result = ").append(flag).toString(), new Object[0]);
                return;
            }
            catch (Exception exception)
            {
                j();
                com.fitbit.e.a.d("HtcPedometerAdapter", "Unable to (un)registerTransportModeListener().", exception, new Object[0]);
                return;
            }
        }
        e.unregisterTransportModeListener(n);
        return;
    }

    private List n()
    {
        ArrayList arraylist;
        boolean flag;
        long l1;
        long l2;
        long l3;
        com.fitbit.e.a.d("HtcPedometerAdapter", "Querying transport mode records...", new Object[0]);
        arraylist = new ArrayList();
        l3 = System.currentTimeMillis();
        l1 = o();
        l2 = l1;
        flag = false;
_L4:
        Object obj;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        obj = null;
        TransportRecordsQueryResult transportrecordsqueryresult;
        com.fitbit.e.a.d("HtcPedometerAdapter", (new StringBuilder()).append("Querying records from HtcActiveService with startTime = ").append(l2).append(" and endTime = ").append(l3).toString(), new Object[0]);
        transportrecordsqueryresult = e.queryTransportModeRecords(l2, l3);
        obj = transportrecordsqueryresult;
_L2:
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        com.fitbit.e.a.d("HtcPedometerAdapter", "Query result is null.", new Object[0]);
        flag = true;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        j();
        com.fitbit.e.a.e("HtcPedometerAdapter", "Unable to query records from HtcActiveService", exception, new Object[0]);
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        int i1;
        i1 = ((TransportRecordsQueryResult) (obj)).getStatus();
        obj = ((TransportRecordsQueryResult) (obj)).getRecords();
        if (obj != null && ((ArrayList) (obj)).size() != 0)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        l2 = System.currentTimeMillis();
        if (arraylist.size() > 0)
        {
            l1 = ((TransportModeRecord)arraylist.get(arraylist.size() - 1)).getTimestamp() + 1L;
        }
        a(l1);
        com.fitbit.e.a.a("HtcPedometerAdapter", "Mean = %s", new Object[] {
            Double.valueOf((double)(l2 - l3) / (double)arraylist.size())
        });
        return arraylist;
        arraylist.addAll(((java.util.Collection) (obj)));
        if (i1 == 2)
        {
            l2 = ((TransportModeRecord)((ArrayList) (obj)).get(((ArrayList) (obj)).size() - 1)).getTimestamp();
        } else
        {
            flag = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private long o()
    {
        return PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).getLong("com.fitbit.pedometer.HtcPedometerAdapter.LAST_FLUSH_TIME_PREFERENCE_KEY", System.currentTimeMillis());
    }

    private boolean p()
    {
        com.fitbit.e.a.d("HtcPedometerAdapter", "Connecting to HtcActiveManager...", new Object[0]);
        if (!m)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        com.fitbit.e.a.d("HtcPedometerAdapter", "Connecting is already in progress. Skip request...", new Object[0]);
        return true;
        try
        {
            m = true;
            e.connect(o);
        }
        catch (Exception exception)
        {
            m = false;
            j();
            com.fitbit.e.a.e("HtcPedometerAdapter", "Unable to connect to HtcActiveManager.", exception, new Object[0]);
            return false;
        }
        return true;
    }

    private void q()
    {
        com.fitbit.pedometer.e.a(new Runnable() {

            final HtcPedometerAdapter a;

            public void run()
            {
                if (a.a != null)
                {
                    a.a.a();
                }
            }

            
            {
                a = HtcPedometerAdapter.this;
                super();
            }
        });
    }

    private void r()
    {
        com.fitbit.pedometer.e.a(new Runnable() {

            final HtcPedometerAdapter a;

            public void run()
            {
                if (a.a != null)
                {
                    a.a.b();
                }
            }

            
            {
                a = HtcPedometerAdapter.this;
                super();
            }
        });
    }

    public PedometerAdapterHelper.PedometerManufacturer a()
    {
        return com.fitbit.pedometer.PedometerAdapterHelper.PedometerManufacturer.b;
    }

    public void a(boolean flag)
    {
        com.fitbit.e.a.a("HtcPedometerAdapter", "Flushing (withLastMinute = %s)...", new Object[] {
            Boolean.valueOf(flag)
        });
        com.fitbit.e.a.d("HtcPedometerAdapter", "Checking if HtcActiveService is connected on flush...", new Object[0]);
        if (e.isServiceConnected())
        {
            com.fitbit.e.a.d("HtcPedometerAdapter", "HtcActiveService is connected. Flushing data...", new Object[0]);
            org.androidannotations.a.a.a(new Runnable(flag) {

                final boolean a;
                final HtcPedometerAdapter b;

                public void run()
                {
                    HtcPedometerAdapter.f(b);
                    b.d(a);
                    HtcPedometerAdapter.g(b);
                    return;
                    Exception exception;
                    exception;
                    HtcPedometerAdapter.g(b);
                    throw exception;
                }

            
            {
                b = HtcPedometerAdapter.this;
                a = flag;
                super();
            }
            });
        } else
        {
            RemoteServiceCommand remoteservicecommand;
            if (flag)
            {
                remoteservicecommand = RemoteServiceCommand.f;
            } else
            {
                remoteservicecommand = RemoteServiceCommand.e;
            }
            com.fitbit.e.a.d("HtcPedometerAdapter", (new StringBuilder()).append("HtcActiveService is disconnected. Adding pending ").append(remoteservicecommand).append(" command and connecting to service...").toString(), new Object[0]);
            a(remoteservicecommand);
            if (!p())
            {
                r();
                return;
            }
        }
    }

    public void b(boolean flag)
    {
        boolean flag1 = true;
        com.fitbit.e.a.a("HtcPedometerAdapter", "Set streaming data in Live mode = %s", new Object[] {
            Boolean.valueOf(flag)
        });
        Date date = new Date();
        if (flag)
        {
            if (h != null && com.fitbit.util.o.j(h, date) && g != null)
            {
                a.a(g.a(), g.b(), g.c());
            } else
            {
                g = new g();
                a.a(g.a(), g.b(), g.c());
            }
        }
        h = date;
        com.fitbit.e.a.a("HtcPedometerAdapter", "Checking if HtcActiveService is connected on setStreamingDataInLiveMode...", new Object[0]);
        if (e.isServiceConnected())
        {
            com.fitbit.e.a.d("HtcPedometerAdapter", "HtcActiveService is connected. Switching registered transport mode listener...", new Object[0]);
            if (flag)
            {
                flag1 = e.isEnabled();
            }
            if (flag1)
            {
                g(flag);
            } else
            {
                RemoteServiceCommand remoteservicecommand;
                if (flag)
                {
                    remoteservicecommand = RemoteServiceCommand.c;
                } else
                {
                    remoteservicecommand = RemoteServiceCommand.d;
                }
                com.fitbit.e.a.d("HtcPedometerAdapter", (new StringBuilder()).append("HtcActiveService is disabled. Adding pending ").append(remoteservicecommand).append(" command and connecting to service...").toString(), new Object[0]);
                a(com.fitbit.pedometer.RemoteServiceCommand.a);
                a(remoteservicecommand);
                p();
            }
        } else
        {
            RemoteServiceCommand remoteservicecommand1;
            if (flag)
            {
                remoteservicecommand1 = RemoteServiceCommand.c;
            } else
            {
                remoteservicecommand1 = RemoteServiceCommand.d;
            }
            com.fitbit.e.a.d("HtcPedometerAdapter", (new StringBuilder()).append("HtcActiveService is disconnected. Adding pending ").append(remoteservicecommand1).append(" command and connecting to service...").toString(), new Object[0]);
            a(remoteservicecommand1);
            p();
        }
        l = flag;
    }

    public boolean b()
    {
        return k;
    }

    public void c()
    {
        com.fitbit.e.a.a("HtcPedometerAdapter", "Connecting to remote service...", new Object[0]);
        com.fitbit.e.a.d("HtcPedometerAdapter", "Checking if HtcActiveService is already connected...", new Object[0]);
        if (e.isServiceConnected())
        {
            com.fitbit.e.a.d("HtcPedometerAdapter", "HtcActiveService is already connected. Skip request.", new Object[0]);
            return;
        } else
        {
            p();
            return;
        }
    }

    public void c(boolean flag)
    {
        com.fitbit.e.a.a("HtcPedometerAdapter", "Set enabled = %s", new Object[] {
            Boolean.valueOf(flag)
        });
        k = flag;
        com.fitbit.e.a.d("HtcPedometerAdapter", "Checking if HtcActiveService is connected on setEnabled...", new Object[0]);
        if (e.isServiceConnected())
        {
            com.fitbit.e.a.d("HtcPedometerAdapter", "HtcActiveService is connected.", new Object[0]);
            f(flag);
        } else
        {
            RemoteServiceCommand remoteservicecommand;
            if (flag)
            {
                remoteservicecommand = com.fitbit.pedometer.RemoteServiceCommand.a;
            } else
            {
                remoteservicecommand = com.fitbit.pedometer.RemoteServiceCommand.b;
            }
            com.fitbit.e.a.d("HtcPedometerAdapter", "HtcActiveService is disconnected. Adding pending %s command and connection to service...", new Object[] {
                remoteservicecommand
            });
            a(remoteservicecommand);
            if (!p())
            {
                r();
                return;
            }
        }
    }

    public void d()
    {
        com.fitbit.e.a.a("HtcPedometerAdapter", "Disconnecting from remote service...", new Object[0]);
        com.fitbit.e.a.d("HtcPedometerAdapter", "Checking if HtcActiveService is already disconnected...", new Object[0]);
        if (!e.isServiceConnected())
        {
            com.fitbit.e.a.d("HtcPedometerAdapter", "HtcActiveService is already disconnected. Skip request.", new Object[0]);
            return;
        } else
        {
            com.fitbit.e.a.d("HtcPedometerAdapter", "Disconnecting from HtcActiveService...", new Object[0]);
            e.disconnect();
            return;
        }
    }

    protected void d(boolean flag)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            Object obj = n();
            com.fitbit.pedometer.h.a().a(((List) (obj)));
            com.fitbit.e.a.d("HtcPedometerAdapter", (new StringBuilder()).append("Received ").append(((List) (obj)).size()).append(" records from HtcActiveService.").toString(), new Object[0]);
            List list1 = a(a(((List) (obj))), f.c());
            com.fitbit.e.a.d("HtcPedometerAdapter", (new StringBuilder()).append("Received records converted to ").append(list1.size()).append(" pedometer units.").toString(), new Object[0]);
            f.a(list1);
            if (((List) (obj)).size() > 0)
            {
                f.a(((TransportModeRecord)((List) (obj)).get(((List) (obj)).size() - 1)).getTimestamp());
            }
            obj = f.a(flag);
            com.fitbit.e.a.d("HtcPedometerAdapter", (new StringBuilder()).append("Pedometer units processed as ").append(((List) (obj)).size()).append(" PedometerMinuteData objects.").toString(), new Object[0]);
            com.fitbit.e.a.d("HtcPedometerAdapter", "Informing listener about new data...", new Object[0]);
            if (a != null)
            {
                PedometerMinuteData pedometerminutedata;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(pedometerminutedata))
                {
                    pedometerminutedata = (PedometerMinuteData)((Iterator) (obj)).next();
                }

            } else
            {
                com.fitbit.e.a.d("HtcPedometerAdapter", "Unable to inform listener: listener is null", new Object[0]);
            }
            if (l)
            {
                com.fitbit.e.a.d("HtcPedometerAdapter", "Informing listener about new LiveData value...", new Object[0]);
                if (a == null || g == null)
                {
                    break label0;
                }
                l = false;
                List list = f.a();
                g.a(list);
                com.fitbit.pedometer.e.a(new Runnable() {

                    final HtcPedometerAdapter a;

                    public void run()
                    {
                        a.a.a(com.fitbit.pedometer.HtcPedometerAdapter.a(a).a(), com.fitbit.pedometer.HtcPedometerAdapter.a(a).b(), com.fitbit.pedometer.HtcPedometerAdapter.a(a).c());
                    }

            
            {
                a = HtcPedometerAdapter.this;
                super();
            }
                });
            }
            return;
        }
        StringBuilder stringbuilder = (new StringBuilder()).append("Unable to inform listener: collector is null = ");
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder = stringbuilder.append(flag).append(", listener is null = ");
        if (a == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.fitbit.e.a.d("HtcPedometerAdapter", stringbuilder.append(flag).toString(), new Object[0]);
    }

    public void e()
    {
        com.fitbit.e.a.d("HtcPedometerAdapter", "Clearing HTC Pedometer data cache.", new Object[0]);
        g = null;
        f = new f(false);
    }

    public SchedulingPolicy f()
    {
        return d;
    }

}
