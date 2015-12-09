// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui.controller;

import com.fitbit.data.bl.an;
import com.fitbit.data.domain.device.Device;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.synclair.SynclairManager;
import com.fitbit.synclair.c;
import com.fitbit.synclair.config.bean.DeviceScreenBean;
import com.fitbit.synclair.ui.SynclairActivity;
import com.fitbit.synclair.ui.a.f;
import com.fitbit.synclair.ui.states.SynclairScreenState;
import com.fitbit.synclair.ui.states.a;
import com.fitbit.synclair.ui.states.a.d;
import com.fitbit.synclair.ui.states.a.e;
import com.fitbit.util.p;
import java.util.List;

// Referenced classes of package com.fitbit.synclair.ui.controller:
//            c, SynclairType

public class b extends com.fitbit.synclair.ui.controller.c
{

    public b(SynclairActivity synclairactivity)
    {
        b = synclairactivity;
        d = com.fitbit.synclair.ui.states.a.b(com.fitbit.synclair.ui.controller.SynclairType.a, synclairactivity.L());
        c = com.fitbit.synclair.ui.states.a.a(com.fitbit.synclair.ui.controller.SynclairType.a, synclairactivity.L());
    }

    private Device H()
    {
        Device device = null;
        String s1 = c().p();
        if (s1 != null)
        {
            device = an.a().a(s1);
        }
        return device;
    }

    public com.fitbit.synclair.ui.states.c.b a(SynclairScreenState synclairscreenstate, int i1)
    {
        Object obj1 = null;
    /* anonymous class not found */
    class _anm1 {}

        com.fitbit.synclair.ui.controller._cls1.a[synclairscreenstate.ordinal()];
        JVM INSTR tableswitch 1 21: default 108
    //                   1 125
    //                   2 142
    //                   3 159
    //                   4 176
    //                   5 193
    //                   6 210
    //                   7 227
    //                   8 227
    //                   9 244
    //                   10 261
    //                   11 284
    //                   12 336
    //                   13 407
    //                   14 478
    //                   15 516
    //                   16 552
    //                   17 588
    //                   18 624
    //                   19 679
    //                   20 696
    //                   21 773;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L1:
        Object obj = obj1;
_L23:
        return new com.fitbit.synclair.ui.states.c.a(synclairscreenstate, ((DeviceScreenBean) (obj)), g());
_L2:
        obj = ((com.fitbit.synclair.config.bean.b)a).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.l);
        continue; /* Loop/switch isn't completed */
_L3:
        obj = ((com.fitbit.synclair.config.bean.b)a).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.k);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = ((com.fitbit.synclair.config.bean.b)a).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.g);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = ((com.fitbit.synclair.config.bean.b)a).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.i);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = ((com.fitbit.synclair.config.bean.b)a).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.c);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = ((com.fitbit.synclair.config.bean.b)a).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.d);
        continue; /* Loop/switch isn't completed */
_L8:
        obj = ((com.fitbit.synclair.config.bean.b)a).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.f);
        continue; /* Loop/switch isn't completed */
_L9:
        obj = ((com.fitbit.synclair.config.bean.b)a).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.j);
        continue; /* Loop/switch isn't completed */
_L10:
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.d);
        obj = ((com.fitbit.synclair.config.bean.b)a).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.b);
        continue; /* Loop/switch isn't completed */
_L11:
        List list = ((com.fitbit.synclair.config.bean.b)a).b(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.a);
        obj = obj1;
        if (list != null)
        {
            obj = obj1;
            if (list.size() > i1)
            {
                obj = (DeviceScreenBean)list.get(i1);
            }
        }
        continue; /* Loop/switch isn't completed */
_L12:
        obj = obj1;
        if (((com.fitbit.synclair.config.bean.b)a).d())
        {
            List list1 = ((com.fitbit.synclair.config.bean.b)a).c().b(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.a);
            obj = obj1;
            if (list1 != null)
            {
                obj = obj1;
                if (list1.size() > i1)
                {
                    obj = (DeviceScreenBean)list1.get(i1);
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L13:
        obj = obj1;
        if (((com.fitbit.synclair.config.bean.b)a).d())
        {
            List list2 = ((com.fitbit.synclair.config.bean.b)a).c().b(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.s);
            obj = obj1;
            if (list2 != null)
            {
                obj = obj1;
                if (list2.size() > i1)
                {
                    obj = (DeviceScreenBean)list2.get(i1);
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L14:
        if (((com.fitbit.synclair.config.bean.b)a).d())
        {
            obj = ((com.fitbit.synclair.config.bean.b)a).c().c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.b);
        } else
        {
            obj = null;
        }
        continue; /* Loop/switch isn't completed */
_L15:
        obj = obj1;
        if (((com.fitbit.synclair.config.bean.b)a).d())
        {
            obj = ((com.fitbit.synclair.config.bean.b)a).c().c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.n);
        }
        continue; /* Loop/switch isn't completed */
_L16:
        obj = obj1;
        if (((com.fitbit.synclair.config.bean.b)a).d())
        {
            obj = ((com.fitbit.synclair.config.bean.b)a).c().c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.o);
        }
        continue; /* Loop/switch isn't completed */
_L17:
        obj = obj1;
        if (((com.fitbit.synclair.config.bean.b)a).d())
        {
            obj = ((com.fitbit.synclair.config.bean.b)a).c().c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.m);
        }
        continue; /* Loop/switch isn't completed */
_L18:
        if (b.B() > 1 || n().b())
        {
            obj = ((com.fitbit.synclair.config.bean.b)a).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.f);
        } else
        {
            obj = ((com.fitbit.synclair.config.bean.b)a).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.e);
        }
        continue; /* Loop/switch isn't completed */
_L19:
        obj = ((com.fitbit.synclair.config.bean.b)a).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.h);
        continue; /* Loop/switch isn't completed */
_L20:
        obj = H();
        if (obj != null)
        {
            UISavedState.a(((Device) (obj)));
        }
        if (!com.fitbit.util.p.a(((Device) (obj))))
        {
            UISavedState.j();
        }
        List list3 = ((com.fitbit.synclair.config.bean.b)a).b(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.s);
        obj = obj1;
        if (list3 != null)
        {
            obj = obj1;
            if (list3.size() > i1 + 1)
            {
                obj = (DeviceScreenBean)list3.get(i1);
            }
        }
        continue; /* Loop/switch isn't completed */
_L21:
        List list4 = ((com.fitbit.synclair.config.bean.b)a).b(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.s);
        obj = obj1;
        if (list4 != null)
        {
            obj = obj1;
            if (list4.size() > 0)
            {
                obj = (DeviceScreenBean)list4.get(list4.size() - 1);
            }
        }
        if (true) goto _L23; else goto _L22
_L22:
    }

    public void a()
    {
        e = SynclairScreenState.a;
    }

    public void a(boolean flag)
    {
        n().c(flag);
    }

    public void a(boolean flag, boolean flag1)
    {
        n().e(flag);
        n().d(flag1);
    }

    public int b()
    {
        return 0x7f080556;
    }

    public c c()
    {
        return com.fitbit.synclair.c.j();
    }

    public void d()
    {
        b.s(c().a(b.h()));
    }

    public boolean e()
    {
        boolean flag = true;
        com.fitbit.synclair.ui.controller._cls1.a[e.ordinal()];
        JVM INSTR lookupswitch 3: default 48
    //                   11: 52
    //                   12: 94
    //                   20: 147;
           goto _L1 _L2 _L3 _L4
_L1:
        flag = false;
_L6:
        return flag;
_L2:
        List list = ((com.fitbit.synclair.config.bean.b)a).b(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.a);
        boolean flag1;
        if (list != null && list.size() >= f + 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag1;
_L3:
        if (((com.fitbit.synclair.config.bean.b)a).d())
        {
            List list1 = ((com.fitbit.synclair.config.bean.b)a).c().b(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.a);
            if (list1 == null || list1.size() < f + 2)
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        List list2 = ((com.fitbit.synclair.config.bean.b)a).b(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.s);
        if (list2 == null || list2.size() < f + 3)
        {
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void f()
    {
        f = 0;
        e = d.a();
        List list = ((com.fitbit.synclair.config.bean.b)a).b(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.a);
        if (list == null || list.isEmpty())
        {
            D();
            return;
        } else
        {
            B();
            return;
        }
    }

    protected String g()
    {
        return "com.fitbit.synclair.PairingManager.ACTION_CHANGED";
    }

    public void h()
    {
        a = (new com.fitbit.synclair.config.a.c()).a(b, c().n());
    }

    public com.fitbit.synclair.ui.SynclairActivity.ExitMessageTypes i()
    {
        Boolean boolean1 = G();
        if (boolean1 == null)
        {
            return null;
        }
        if (boolean1.booleanValue())
        {
            return com.fitbit.synclair.ui.SynclairActivity.ExitMessageTypes.a;
        }
        if (o())
        {
            return com.fitbit.synclair.ui.SynclairActivity.ExitMessageTypes.c;
        } else
        {
            return com.fitbit.synclair.ui.SynclairActivity.ExitMessageTypes.b;
        }
    }

    public SynclairManager j()
    {
        return c();
    }

    public void k()
    {
        com.fitbit.synclair.ui.states.a.b b1 = n();
        boolean flag;
        if (c().q() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b1.a(flag);
    }

    public void l()
    {
        boolean flag1 = true;
        boolean flag;
        if (((com.fitbit.synclair.config.bean.b)t()).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.i) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (b.D().g() instanceof com.fitbit.synclair.a)
        {
            GalileoTrackerType galileotrackertype = ((com.fitbit.synclair.a)b.D().g()).g();
            if (flag && galileotrackertype != GalileoTrackerType.g && galileotrackertype != GalileoTrackerType.f && galileotrackertype != GalileoTrackerType.e)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        n().b(flag);
    }

    public void m()
    {
        if (d instanceof e)
        {
            boolean flag;
            if (((com.fitbit.synclair.config.bean.b)t()).c(com.fitbit.synclair.config.bean.DeviceBaseConfigBean.SynclairScreenType.h) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((e)d).f(flag);
        }
    }

    public com.fitbit.synclair.ui.states.a.b n()
    {
        return (com.fitbit.synclair.ui.states.a.b)d;
    }

    public boolean o()
    {
        return n().b();
    }

    public boolean p()
    {
        return n().c();
    }

    public void q()
    {
        boolean flag1 = true;
        a(true);
        com.fitbit.synclair.ui.states.a.b b1 = n();
        boolean flag = flag1;
        if (!com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus.b.equals(com.fitbit.synclair.c.j().z()))
        {
            if (com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus.c.equals(com.fitbit.synclair.c.j().z()))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        b1.d(flag);
        super.q();
    }

    public boolean r()
    {
        return o() && Boolean.FALSE.equals(s());
    }

    public Boolean s()
    {
        if (e == null)
        {
            return null;
        }
        boolean flag;
        if (SynclairScreenState.g.equals(e) || SynclairScreenState.h.equals(e) || SynclairScreenState.i.equals(e))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }
}
