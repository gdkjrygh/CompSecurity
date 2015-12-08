// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui;

import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.mixpanel.d;
import com.fitbit.mixpanel.e;
import com.fitbit.mixpanel.g;
import com.fitbit.synclair.ui.a.f;
import com.fitbit.synclair.ui.controller.SynclairType;
import com.fitbit.synclair.ui.controller.c;
import com.fitbit.synclair.ui.states.SynclairScreenState;
import com.fitbit.util.SimpleConfirmDialogFragment;

// Referenced classes of package com.fitbit.synclair.ui:
//            SynclairActivity

class a
    implements com.fitbit.util.Fragment.a
{

    final SynclairActivity a;

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        simpleconfirmdialogfragment = a.D().f().u();
        if (SynclairType.a.name().equalsIgnoreCase(a.e))
        {
            if (a.D() != null && a.D().f().r())
            {
                a.D().f().a(SynclairScreenState.g);
                return;
            }
            if (SynclairScreenState.g.equals(simpleconfirmdialogfragment) || SynclairScreenState.f.equals(simpleconfirmdialogfragment))
            {
                com.fitbit.mixpanel.f.a(new e(com.fitbit.synclair.c.j().k().a()));
            } else
            {
                com.fitbit.mixpanel.f.a(new d(com.fitbit.synclair.c.j().k().a()));
            }
        }
        if (SynclairType.b.name().equalsIgnoreCase(a.e) && SynclairScreenState.g.equals(simpleconfirmdialogfragment))
        {
            com.fitbit.mixpanel.f.a(new g(a.L()));
        }
        a.I();
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    t(SynclairActivity synclairactivity)
    {
        a = synclairactivity;
        super();
    }
}
