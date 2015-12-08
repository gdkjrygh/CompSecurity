// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.anim;


// Referenced classes of package com.google.android.apps.translate.anim:
//            f

final class g
    implements Runnable
{

    final android.view.animation.Animation.AnimationListener a;
    final f b;

    g(f f, android.view.animation.Animation.AnimationListener animationlistener)
    {
        b = f;
        a = animationlistener;
        super();
    }

    public final void run()
    {
        a.onAnimationEnd(b);
    }
}
