// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair;

import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.data.bl.o;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTracker;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.a.f;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.mixpanel.MixPanelTrackingHelper;
import com.fitbit.synclair.config.bean.DeviceBaseConfigBean;
import com.fitbit.synclair.operation.BaseSynclairOperation;
import com.fitbit.synclair.operation.b;
import com.fitbit.synclair.operation.g;
import com.fitbit.synclair.operation.h;
import com.fitbit.synclair.operation.j;
import com.fitbit.synclair.operation.m;
import com.fitbit.synclair.operation.n;
import com.fitbit.synclair.operation.q;
import com.fitbit.synclair.operation.u;

// Referenced classes of package com.fitbit.synclair:
//            a

public class c extends com.fitbit.synclair.a
{
    private static class a
    {

        public static c a = new c();


        private a()
        {
        }
    }

    public static interface b
    {

        public abstract void a();
    }


    public static final String d = "com.fitbit.synclair.PairingManager.ACTION_CHANGED";
    private static final String f = "PairingManager";
    private TrackerType g;
    private String h;
    private com.fitbit.synclair.config.bean.b i;
    private GalileoTracker j;
    private String k;
    private String l;
    private com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus m;
    private b n;
    private final com.fitbit.util.threading.c o;

    private c()
    {
        super(new BluetoothWorker(com.fitbit.galileo.bluetooth.BluetoothWorker.BluetoothWorkerName.b));
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        o = new com.fitbit.util.threading.c() {

            final c a;

            protected void a(Intent intent)
            {
                if (com.fitbit.synclair.c.a(a) != null && com.fitbit.synclair.c.b(a) != null && "com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_DISCONNECTED".equals(intent.getAction()))
                {
                    com.fitbit.synclair.c.b(a).a();
                }
            }

            
            {
                a = c.this;
                super();
            }
        };
    }


    static GalileoTracker a(c c1)
    {
        return c1.j;
    }

    static GalileoTracker a(c c1, GalileoTracker galileotracker)
    {
        c1.j = galileotracker;
        return galileotracker;
    }

    static com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus a(c c1, com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus firmwareupdatestatus)
    {
        c1.m = firmwareupdatestatus;
        return firmwareupdatestatus;
    }

    static com.fitbit.synclair.config.bean.b a(c c1, com.fitbit.synclair.config.bean.b b1)
    {
        c1.i = b1;
        return b1;
    }

    static String a(c c1, String s1)
    {
        c1.l = s1;
        return s1;
    }

    static b b(c c1)
    {
        return c1.n;
    }

    static String b(c c1, String s1)
    {
        c1.k = s1;
        return s1;
    }

    static String c(c c1, String s1)
    {
        c1.h = s1;
        return s1;
    }

    public static c j()
    {
        return com.fitbit.synclair.a.a;
    }

    public void A()
    {
        j = null;
        g = com.fitbit.data.bl.o.a().a(h);
        h = null;
    }

    public void a(b b1)
    {
label0:
        {
            if (n != b1)
            {
                n = b1;
                if (n == null)
                {
                    break label0;
                }
                o.a(new IntentFilter("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_DISCONNECTED"));
            }
            return;
        }
        o.d();
    }

    protected void a(BaseSynclairOperation basesynclairoperation)
    {
        super.a(basesynclairoperation);
        static class _cls6
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.values().length];
                try
                {
                    a[com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.g.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.h.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.i.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.b.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.fitbit.synclair._cls6.a[basesynclairoperation.c().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            i = null;
            // fall through

        case 2: // '\002'
            j = null;
            b = null;
            a = null;
            // fall through

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            l = null;
            k = null;
            return;

        case 6: // '\006'
            i = null;
            break;
        }
        k = null;
    }

    public boolean a(TrackerType trackertype)
    {
        String s2 = m();
        String s1;
        if (trackertype != null)
        {
            s1 = trackertype.a();
        } else
        {
            s1 = null;
        }
        com.fitbit.e.a.a(s2, "startManager(%s)", new Object[] {
            s1
        });
        if (G())
        {
            MixPanelTrackingHelper.a(com.fitbit.mixpanel.MixPanelTrackingHelper.PairingStatus.c);
            g = trackertype;
            if (H())
            {
                return true;
            }
            J();
        }
        return false;
    }

    public boolean a(Object obj)
    {
        com.fitbit.e.a.a(m(), "startOperationToSendSelectedExercises(%s)", new Object[] {
            obj
        });
        return a(((BaseSynclairOperation) (new n(l, obj))), new SynclairManager.a(this));
    }

    public boolean a(String s1)
    {
        com.fitbit.e.a.a(m(), "startOperationToPairTracker(%s)", new Object[] {
            s1
        });
        if (j == null || g == null)
        {
            return false;
        }
        if (GalileoTrackerType.e == j.f())
        {
            return a(((BaseSynclairOperation) (new h(e, j, s1, g))), ((SynclairManager.a) (new SynclairManager.a() {

                final c a;

                protected volatile void a(BaseSynclairOperation basesynclairoperation)
                {
                    a((h)basesynclairoperation);
                }

                protected void a(h h1)
                {
                    com.fitbit.synclair.c.a(a, ((com.fitbit.galileo.protocol.commands.b.a)h1.d()).c());
                    com.fitbit.synclair.c.b(a, ((com.fitbit.galileo.protocol.commands.b.a)h1.d()).b());
                    c.c(a, ((com.fitbit.galileo.protocol.commands.b.a)h1.d()).a());
                    com.fitbit.synclair.c.a(a, ((com.fitbit.galileo.protocol.commands.b.a)h1.d()).d());
                    super.a(h1);
                }

            
            {
                a = c.this;
                super(c.this);
            }
            })));
        } else
        {
            return a(((BaseSynclairOperation) (new g(e, j, s1, g))), ((SynclairManager.a) (new SynclairManager.a() {

                final c a;

                protected volatile void a(BaseSynclairOperation basesynclairoperation)
                {
                    a((g)basesynclairoperation);
                }

                protected void a(g g1)
                {
                    com.fitbit.synclair.c.a(a, ((com.fitbit.galileo.protocol.commands.b.a)g1.d()).c());
                    com.fitbit.synclair.c.b(a, ((com.fitbit.galileo.protocol.commands.b.a)g1.d()).b());
                    c.c(a, ((com.fitbit.galileo.protocol.commands.b.a)g1.d()).a());
                    com.fitbit.synclair.c.a(a, ((com.fitbit.galileo.protocol.commands.b.a)g1.d()).d());
                    super.a(g1);
                }

            
            {
                a = c.this;
                super(c.this);
            }
            })));
        }
    }

    public boolean b(String s1)
    {
        com.fitbit.e.a.a(m(), "startOperationToSendGreeting(%s)", new Object[] {
            s1
        });
        return a(new m(l, s1), new SynclairManager.a(this));
    }

    protected void f()
    {
        g = null;
        i = null;
        j = null;
        l = null;
        k = null;
        m = null;
        a(((b) (null)));
        super.f();
    }

    public GalileoTrackerType g()
    {
        return c;
    }

    public TrackerType k()
    {
        return g;
    }

    protected String l()
    {
        return "com.fitbit.synclair.PairingManager.ACTION_CHANGED";
    }

    protected String m()
    {
        return "PairingManager";
    }

    public com.fitbit.synclair.config.bean.b n()
    {
        return i;
    }

    public DeviceBaseConfigBean o()
    {
        return n();
    }

    public String p()
    {
        return l;
    }

    public String q()
    {
        return k;
    }

    public boolean r()
    {
        return j != null && e.a(com.fitbit.galileo.a.f.a(j.a()));
    }

    public boolean s()
    {
        return l != null;
    }

    public boolean t()
    {
        com.fitbit.e.a.a(m(), "startOperationToLoadConfig()", new Object[0]);
        return a(new com.fitbit.synclair.operation.f(g), new SynclairManager.a() {

            final c a;

            protected volatile void a(BaseSynclairOperation basesynclairoperation)
            {
                a((com.fitbit.synclair.operation.f)basesynclairoperation);
            }

            protected void a(com.fitbit.synclair.operation.f f1)
            {
                com.fitbit.synclair.c.a(a, (com.fitbit.synclair.config.bean.b)f1.d());
                super.a(f1);
            }

            
            {
                a = c.this;
                super(c.this);
            }
        });
    }

    public boolean u()
    {
        com.fitbit.e.a.a(m(), "startOperationToSearchTracker()", new Object[0]);
        GalileoTrackerType galileotrackertype = GalileoTrackerType.a(g.a());
        return a(new j(e, galileotrackertype), new SynclairManager.a() {

            final c a;

            protected volatile void a(BaseSynclairOperation basesynclairoperation)
            {
                a((j)basesynclairoperation);
            }

            protected void a(j j1)
            {
                com.fitbit.synclair.c.a(a, (GalileoTracker)j1.d());
                a.b = com.fitbit.synclair.c.a(a).a();
                a.c = com.fitbit.synclair.c.a(a).f();
                a.a = com.fitbit.synclair.c.a(a).e();
                super.a(j1);
            }

            
            {
                a = c.this;
                super(c.this);
            }
        });
    }

    public boolean v()
    {
        com.fitbit.e.a.a(m(), "startOperationToDisplayCode()", new Object[0]);
        if (j == null || g == null)
        {
            return false;
        }
        if (GalileoTrackerType.e == j.f())
        {
            return a(new com.fitbit.synclair.operation.c(e, j), new SynclairManager.a(this));
        } else
        {
            return a(new com.fitbit.synclair.operation.b(e, j), new SynclairManager.a(this));
        }
    }

    public boolean w()
    {
        com.fitbit.e.a.a(m(), "startOperationToTapTracker()", new Object[0]);
        return a(new u(e, j), new SynclairManager.a(this));
    }

    public boolean x()
    {
        com.fitbit.e.a.a(m(), "startOperationToSyncTrackerTypes()", new Object[0]);
        return a(new q(), new SynclairManager.a(this));
    }

    public boolean y()
    {
        for (GalileoTrackerType galileotrackertype = GalileoTrackerType.a(g.a()); !GalileoTrackerType.d.equals(galileotrackertype) && !GalileoTrackerType.g.equals(galileotrackertype) || galileotrackertype.equals(GalileoTrackerType.a(h));)
        {
            return false;
        }

        return true;
    }

    public com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus z()
    {
        return m;
    }
}
