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

    final a a;

    public final void onSpringActivate(e e1)
    {
        a.a.j.setVisibility(0);
        a.a.h = true;
    }

    public final void onSpringAtRest(e e1)
    {
        com.tinder.fragments.FragmentAnchoredPopup.g(a.a);
        if (FragmentAnchoredPopup.h(a.a) != null)
        {
            FragmentAnchoredPopup.h(a.a).run();
        }
    }

    public final void onSpringEndStateChange(e e1)
    {
    }

    public final void onSpringUpdate(e e1)
    {
        ad.a(a.a.d, (float)Math.min(1.0D, e1.d.d));
        ad.c(a.a.g, (float)e1.d.g);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/FragmentAnchoredPopup$4

/* anonymous class */
    final class FragmentAnchoredPopup._cls4
        implements Runnable
    {

        final FragmentAnchoredPopup a;

        public final void run()
        {
            FragmentAnchoredPopup.f(a).a(0.0D).b(1.0D).a(new FragmentAnchoredPopup._cls4._cls1(this));
        }

            
            {
                a = fragmentanchoredpopup;
                super();
            }
    }

}
