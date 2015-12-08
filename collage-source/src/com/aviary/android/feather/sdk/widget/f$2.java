// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.view.animation.Animation;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            f

class a
    implements android.view.animation.ation.AnimationListener
{

    final f a;

    public void onAnimationEnd(Animation animation)
    {
        f.b(a);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    Listener(f f1)
    {
        a = f1;
        super();
    }
}
