// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.res.Resources;
import android.widget.Toast;
import com.tinder.e.ak;
import com.tinder.enums.PaywallPerk;
import com.tinder.enums.SwipeType;
import com.tinder.managers.a;
import com.tinder.managers.y;
import com.tinder.model.Paywall;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;

// Referenced classes of package com.tinder.fragments:
//            bd

final class a
    implements ak
{

    final bd a;

    public final void a()
    {
        a.b();
    }

    public final void b()
    {
        SparksEvent sparksevent = new SparksEvent("Undo.Undo");
        if (bd.o(a) != null)
        {
            boolean flag;
            if (bd.D(a) == SwipeType.LIKE_BUTTON || bd.D(a) == SwipeType.LIKE_SWIPE)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            sparksevent.put("like", Boolean.valueOf(flag));
            sparksevent.put("otherId", bd.o(a).getId());
            sparksevent.put("recTraveling", Boolean.valueOf(bd.o(a).isRecAndPassporting()));
            sparksevent.put("didSuperLike", Boolean.valueOf(bd.o(a).isSuperLike()));
            sparksevent.put("superLike", Boolean.valueOf(bd.g(a)));
        }
        sparksevent.put("userTraveling", Boolean.valueOf(a.e.b()));
        com.tinder.managers.a.a(sparksevent);
        if (a.getActivity() != null && (a.getActivity() instanceof Paywall))
        {
            ((Paywall)a.getActivity()).launchPlusSubscriptionPaywall(0, PaywallPerk.UNDO);
        }
    }

    public final void c()
    {
        Toast.makeText(bd.E(a), a.getResources().getString(0x7f0600ab), 1).show();
    }

    es(bd bd1)
    {
        a = bd1;
        super();
    }
}
