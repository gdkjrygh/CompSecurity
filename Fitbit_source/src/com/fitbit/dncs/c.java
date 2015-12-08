// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.app.FragmentActivity;
import com.fitbit.dncs.domain.TrackerBondState;
import com.fitbit.dncs.service.DncsPairingError;
import com.fitbit.dncs.service.DncsPairingService;
import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.a.f;
import com.fitbit.savedstate.g;
import com.fitbit.ui.s;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.TrackerBondErrorDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class c
{
    private static class a
    {

        public static c a = new c();


        private a()
        {
        }
    }


    private static final String a = "TrackerBondErrorHandler";
    private static final String b = (new StringBuilder()).append(com/fitbit/dncs/c.getCanonicalName()).append(".TAG_TRACKER_BOND_ERROR_DIALOG").toString();
    private static final int c = 3;
    private final Map d;
    private FragmentActivity e;
    private final com.fitbit.util.threading.c f;
    private com.fitbit.util.threading.c g = new com.fitbit.util.threading.c() {

        final c a;

        public void a(Intent intent)
        {
            if ("com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_FINISHED".equals(intent.getAction()))
            {
                DncsPairingError dncspairingerror = DncsPairingService.b(intent);
                intent = DncsPairingService.a(intent);
                if (dncspairingerror != null && intent != null)
                {
                    if (((DncsPairingManager.DncsPairingTaskInfo) (intent)).b.a() && p.b(((DncsPairingManager.DncsPairingTaskInfo) (intent)).a) && dncspairingerror == DncsPairingError.e && com.fitbit.savedstate.g.h() >= 3)
                    {
                        c.b(a);
                    } else
                    if (c.c(a) != null && dncspairingerror.b())
                    {
                        s.a(c.c(a), 0x7f0801b4, 0).i();
                        return;
                    }
                }
            }
        }

            
            {
                a = c.this;
                super();
            }
    };

    private c()
    {
        d = new HashMap();
        e = null;
        f = new com.fitbit.util.threading.c() {

            final c a;

            protected void a(Intent intent)
            {
                String s;
                TrackerBondState trackerbondstate;
                TrackerBondState trackerbondstate1;
                if (!g.b.equals(intent.getAction()))
                {
                    break MISSING_BLOCK_LABEL_206;
                }
                s = intent.getStringExtra(g.c);
                if (s == null)
                {
                    break MISSING_BLOCK_LABEL_206;
                }
                trackerbondstate = (TrackerBondState)intent.getParcelableExtra(g.d);
                trackerbondstate1 = (TrackerBondState)intent.getParcelableExtra(g.e);
                com.fitbit.e.a.a("TrackerBondErrorHandler", "State of the tracker %s changed from %s to %s", new Object[] {
                    s, trackerbondstate, trackerbondstate1
                });
                intent = com.fitbit.dncs.c.a(a);
                intent;
                JVM INSTR monitorenter ;
                if (trackerbondstate1 != null) goto _L2; else goto _L1
_L1:
                if (com.fitbit.dncs.c.a(a).containsKey(s))
                {
                    a.a(s);
                }
_L4:
                intent;
                JVM INSTR monitorexit ;
                return;
_L2:
                if (!com.fitbit.dncs.c.a(a).containsKey(s) || trackerbondstate1 == null) goto _L4; else goto _L3
_L3:
                if (trackerbondstate != TrackerBondState.b || trackerbondstate1 != TrackerBondState.a && trackerbondstate1 != TrackerBondState.d) goto _L4; else goto _L5
_L5:
                String s1 = com.fitbit.galileo.a.f.b(com.fitbit.galileo.a.f.a(s));
                if (com.fitbit.bluetooth.g.g() && com.fitbit.bluetooth.g.a(s1))
                {
                    com.fitbit.savedstate.g.a(3);
                    c.b(a);
                }
                a.a(s);
                  goto _L4
                Exception exception;
                exception;
                intent;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = c.this;
                super();
            }
        };
        g.a(new IntentFilter("com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_FINISHED"));
    }


    public static c a()
    {
        return com.fitbit.dncs.a.a;
    }

    static Map a(c c1)
    {
        return c1.d;
    }

    static void b(c c1)
    {
        c1.c();
    }

    static FragmentActivity c(c c1)
    {
        return c1.e;
    }

    private void c()
    {
        boolean flag;
        if (com.fitbit.savedstate.g.h() >= 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            e();
            return;
        } else
        {
            d();
            return;
        }
    }

    private void d()
    {
        if (e != null)
        {
            ad.a(e.getSupportFragmentManager(), b);
        }
    }

    private void e()
    {
        if (e != null)
        {
            TrackerBondErrorDialogFragment trackerbonderrordialogfragment = TrackerBondErrorDialogFragment.a(new com.fitbit.util.SimpleConfirmDialogFragment.a() {

                final c a;

                private void a()
                {
                    com.fitbit.savedstate.g.j();
                }

                public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                {
                    a();
                }

                public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                {
                    a();
                }

                public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                {
                    a();
                }

            
            {
                a = c.this;
                super();
            }
            });
            ad.a(e.getSupportFragmentManager(), b, trackerbonderrordialogfragment, false);
        }
    }

    private void f()
    {
        synchronized (d)
        {
            if (!d.isEmpty())
            {
                com.fitbit.e.a.a("TrackerBondErrorHandler", "Registering trackerBondStateReceiver", new Object[0]);
                f.a(new IntentFilter(g.b));
            }
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void g()
    {
        synchronized (d)
        {
            if (d.isEmpty())
            {
                com.fitbit.e.a.a("TrackerBondErrorHandler", "Unregistering trackerBondStateReceiver", new Object[0]);
                f.d();
            }
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(FragmentActivity fragmentactivity)
    {
        if (e != fragmentactivity)
        {
            d();
            e = fragmentactivity;
            c();
        }
    }

    public void a(String s)
    {
        if (s != null)
        {
            synchronized (d)
            {
                if (d.remove(s) != null)
                {
                    com.fitbit.e.a.a("TrackerBondErrorHandler", "Stop watching for %s", new Object[] {
                        s
                    });
                    g();
                }
            }
            return;
        } else
        {
            return;
        }
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(String s, GalileoTrackerType galileotrackertype)
    {
        if (s != null && galileotrackertype != null && galileotrackertype == GalileoTrackerType.e)
        {
            synchronized (d)
            {
                if (!d.containsKey(s))
                {
                    com.fitbit.e.a.a("TrackerBondErrorHandler", "Start watching for %s", new Object[] {
                        s
                    });
                    d.put(s, galileotrackertype);
                    f();
                }
            }
            return;
        } else
        {
            return;
        }
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void b()
    {
        Map map = d;
        map;
        JVM INSTR monitorenter ;
        for (; !d.isEmpty(); a((String)d.keySet().iterator().next())) { }
        break MISSING_BLOCK_LABEL_53;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
    }

    public void b(FragmentActivity fragmentactivity)
    {
        if (e == fragmentactivity && e != null)
        {
            d();
            e = null;
        }
    }

}
