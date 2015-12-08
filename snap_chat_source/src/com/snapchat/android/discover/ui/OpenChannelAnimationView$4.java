// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import android.animation.ValueAnimator;

// Referenced classes of package com.snapchat.android.discover.ui:
//            OpenChannelAnimationView

public final class a
    implements android.animation.eListener
{

    private OpenChannelAnimationView a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.setBackgroundColor(((Integer)valueanimator.getAnimatedValue()).intValue());
    }

    public A(OpenChannelAnimationView openchannelanimationview)
    {
        a = openchannelanimationview;
        super();
    }
}
