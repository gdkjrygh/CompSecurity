// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;

import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package com.facebook.orca.broadcast:
//            ComposeBroadcastFragment

class n
    implements android.view.animation.Animation.AnimationListener
{

    final boolean a;
    final ComposeBroadcastFragment b;

    n(ComposeBroadcastFragment composebroadcastfragment, boolean flag)
    {
        b = composebroadcastfragment;
        a = flag;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        if (a && b.u())
        {
            ComposeBroadcastFragment.f(b).showSoftInput(ComposeBroadcastFragment.e(b), 0);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
