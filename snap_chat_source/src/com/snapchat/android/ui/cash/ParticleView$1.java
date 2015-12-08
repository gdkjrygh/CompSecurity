// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.cash;

import android.animation.Animator;

// Referenced classes of package com.snapchat.android.ui.cash:
//            ParticleView

final class it> extends com.snapchat.android.ui.a
{

    private ParticleView a;
    private ParticleView b;

    public final void onAnimationEnd(Animator animator)
    {
        ParticleView.a(b).a(a);
    }

    (ParticleView particleview, ParticleView particleview1)
    {
        b = particleview;
        a = particleview1;
        super();
    }
}
