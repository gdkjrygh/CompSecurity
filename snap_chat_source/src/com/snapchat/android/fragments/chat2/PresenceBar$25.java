// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat2;

import android.animation.ValueAnimator;

// Referenced classes of package com.snapchat.android.fragments.chat2:
//            PresenceBar

final class a
    implements android.animation.nimatorUpdateListener
{

    private PresenceBar a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        PresenceBar.b(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
        a.invalidate();
    }

    er(PresenceBar presencebar)
    {
        a = presencebar;
        super();
    }
}
