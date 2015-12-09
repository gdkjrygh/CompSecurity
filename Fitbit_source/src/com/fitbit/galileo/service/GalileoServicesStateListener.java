// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.data.domain.device.Device;
import com.fitbit.e.a;
import com.fitbit.galileo.a.f;
import com.fitbit.util.bh;
import com.fitbit.util.p;
import com.fitbit.util.threading.c;
import com.fitbit.util.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fitbit.galileo.service:
//            b

public class GalileoServicesStateListener
{
    public static final class GalileoState extends Enum
    {

        public static final GalileoState a;
        public static final GalileoState b;
        public static final GalileoState c;
        public static final GalileoState d;
        public static final GalileoState e;
        private static final GalileoState f[];
        private final boolean isMultiTrackerState;

        public static GalileoState valueOf(String s)
        {
            return (GalileoState)Enum.valueOf(com/fitbit/galileo/service/GalileoServicesStateListener$GalileoState, s);
        }

        public static GalileoState[] values()
        {
            return (GalileoState[])f.clone();
        }

        public boolean a()
        {
            return isMultiTrackerState;
        }

        static 
        {
            a = new GalileoState("IDLE", 0, true);
            b = new GalileoState("NOT_IDLE", 1, true);
            c = new GalileoState("NOT_IDLE_LONG_SEARCH", 2, false);
            d = new GalileoState("SYNCING_WITH_TRACKER", 3, false);
            e = new GalileoState("SYNCING_WITH_SERVER", 4, true);
            f = (new GalileoState[] {
                a, b, c, d, e
            });
        }

        private GalileoState(String s, int i1, boolean flag)
        {
            super(s, i1);
            isMultiTrackerState = flag;
        }
    }


    private static final String b = "GalileoServicesStateListener";
    protected Context a;
    private final Map c = new HashMap();
    private Set d;
    private Set e;
    private String f;
    private com.fitbit.serverinteraction.SynclairApi.SyncTrigger g;
    private boolean h;
    private GalileoState i;
    private c j;

    public GalileoServicesStateListener()
    {
        d = Collections.unmodifiableSet(new HashSet());
        e = Collections.unmodifiableSet(new HashSet());
        f = null;
        i = com.fitbit.galileo.service.GalileoState.a;
        j = new c() {

            final GalileoServicesStateListener a;

            public void a(Intent intent)
            {
                Object obj = intent.getAction();
                if (!"com.fitbit.galileo.GALILEO_TRACKER_SEARCH_IS_TOO_LONG".equals(obj)) goto _L2; else goto _L1
_L1:
                if (com.fitbit.galileo.service.GalileoServicesStateListener.a(a) == GalileoState.b)
                {
                    a.a(com.fitbit.galileo.service.GalileoState.c);
                }
_L4:
                return;
_L2:
                if (!"com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED".equals(obj)) goto _L4; else goto _L3
_L3:
                intent = (BluetoothConnectionServiceStatus)intent.getParcelableExtra("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_NEW_STATUS");
                if (!com.fitbit.bluetooth.connection.e.a(intent)) goto _L4; else goto _L5
_L5:
                intent = p.c(com.fitbit.galileo.a.f.a(com.fitbit.bluetooth.connection.e.c(intent)));
                if (intent == null) goto _L4; else goto _L6
_L6:
                intent = intent.c();
                this;
                JVM INSTR monitorenter ;
                obj = a.a(intent);
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_114;
                }
                if (com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.b(((com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType) (obj))))
                {
                    a.b(intent);
                }
                this;
                JVM INSTR monitorexit ;
                return;
                intent;
                this;
                JVM INSTR monitorexit ;
                throw intent;
            }

            
            {
                a = GalileoServicesStateListener.this;
                super();
            }
        };
    }

    static GalileoState a(GalileoServicesStateListener galileoservicesstatelistener)
    {
        return galileoservicesstatelistener.i;
    }

    public static b a(Context context)
    {
        return com.fitbit.galileo.service.b.b(context);
    }

    private void b(Set set)
    {
        this;
        JVM INSTR monitorenter ;
        if (set == null) goto _L2; else goto _L1
_L1:
        e = Collections.unmodifiableSet(set);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e = Collections.unmodifiableSet(new HashSet());
        if (true) goto _L4; else goto _L3
_L3:
        set;
        throw set;
    }

    public static GalileoServicesStateListener f()
    {
        return com.fitbit.galileo.service.b.b(FitBitApplication.a());
    }

    private void k()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED");
        j.a(intentfilter);
    }

    private void l()
    {
        j.d();
    }

    private void m()
    {
        Intent intent = new Intent();
        intent.setAction("com.fitbit.galileo.GALILEO_SYNC_SERVICE_STATE_CHANGED");
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.fitbit.galileo.ui.sync.SyncUIModel.SHOW_RESTART_BT_REQUEST", h);
        intent.putExtras(bundle);
        z.a(intent);
    }

    private void n()
    {
        Intent intent = new Intent();
        intent.setAction("com.fitbit.galileo.GALILEO_SYNC_SERVICE_CURRENT_DEVICE_CHANGED");
        z.a(intent);
    }

    public com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s == null) goto _L2; else goto _L1
_L1:
        s = (com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType)c.get(s);
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    protected void a()
    {
        k();
    }

    void a(GalileoState galileostate)
    {
        GalileoState galileostate1;
        galileostate1 = galileostate;
        if (galileostate == null)
        {
            galileostate1 = com.fitbit.galileo.service.GalileoState.a;
        }
        this;
        JVM INSTR monitorenter ;
        if (i != galileostate1)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        galileostate = i;
        i = galileostate1;
        if (galileostate1 == com.fitbit.galileo.service.GalileoState.a)
        {
            b(h());
            a(((Set) (null)));
        }
        if (galileostate1.a())
        {
            c(null);
        }
        this;
        JVM INSTR monitorexit ;
        com.fitbit.e.a.a("GalileoServicesStateListener", "Changing Galileo service state from %s to %s", new Object[] {
            galileostate, galileostate1
        });
        m();
        return;
        galileostate;
        this;
        JVM INSTR monitorexit ;
        throw galileostate;
    }

    public void a(com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger)
    {
        this;
        JVM INSTR monitorenter ;
        g = synctrigger;
        this;
        JVM INSTR monitorexit ;
        return;
        synctrigger;
        throw synctrigger;
    }

    public void a(String s, com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType failuretype)
    {
        com.fitbit.e.a.a("GalileoServicesStateListener", "Set fail reason %s with deviceEncodedId %s", new Object[] {
            failuretype, s
        });
        this;
        JVM INSTR monitorenter ;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (failuretype == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        c.put(s, failuretype);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        c.remove(s);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    void a(Set set)
    {
        this;
        JVM INSTR monitorenter ;
        if (set == null) goto _L2; else goto _L1
_L1:
        d = Collections.unmodifiableSet(set);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d = Collections.unmodifiableSet(new HashSet());
        if (true) goto _L4; else goto _L3
_L3:
        set;
        throw set;
    }

    public void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        h = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void b()
    {
        l();
    }

    public void b(String s)
    {
        a(s, null);
    }

    public GalileoState c()
    {
        this;
        JVM INSTR monitorenter ;
        GalileoState galileostate = i;
        this;
        JVM INSTR monitorexit ;
        return galileostate;
        Exception exception;
        exception;
        throw exception;
    }

    void c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!bh.b(f, s))
        {
            f = s;
            n();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        c.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public com.fitbit.serverinteraction.SynclairApi.SyncTrigger e()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger = g;
        this;
        JVM INSTR monitorexit ;
        return synctrigger;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean g()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = h;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public Set h()
    {
        this;
        JVM INSTR monitorenter ;
        Set set = d;
        this;
        JVM INSTR monitorexit ;
        return set;
        Exception exception;
        exception;
        throw exception;
    }

    public Set i()
    {
        this;
        JVM INSTR monitorenter ;
        Set set = e;
        this;
        JVM INSTR monitorexit ;
        return set;
        Exception exception;
        exception;
        throw exception;
    }

    public String j()
    {
        this;
        JVM INSTR monitorenter ;
        String s = f;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
