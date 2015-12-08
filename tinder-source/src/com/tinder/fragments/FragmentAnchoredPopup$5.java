// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import com.facebook.a.e;
import com.facebook.a.g;
import com.tinder.utils.ad;

// Referenced classes of package com.tinder.fragments:
//            FragmentAnchoredPopup

final class a
    implements g
{

    final FragmentAnchoredPopup a;

    public final void onSpringActivate(e e1)
    {
    }

    public final void onSpringAtRest(e e1)
    {
        com.tinder.fragments.FragmentAnchoredPopup.g(a);
        FragmentAnchoredPopup.a(a, null);
        a.j.setVisibility(8);
        if (FragmentAnchoredPopup.i(a) != null)
        {
            FragmentAnchoredPopup.i(a).run();
        }
    }

    public final void onSpringEndStateChange(e e1)
    {
    }

    public final void onSpringUpdate(e e1)
    {
        ad.a(a.d, (float)Math.min(1.0D, e1.d.d));
        ad.c(a.g, (float)e1.d.g);
        ad.c(a.l, (float)e1.d.l);
    }

    (FragmentAnchoredPopup fragmentanchoredpopup)
    {
        a = fragmentanchoredpopup;
        super();
    }
}
