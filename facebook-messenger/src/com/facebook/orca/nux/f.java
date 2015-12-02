// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.view.animation.Animation;

// Referenced classes of package com.facebook.orca.nux:
//            e

class f
    implements android.view.animation.Animation.AnimationListener
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        a.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
