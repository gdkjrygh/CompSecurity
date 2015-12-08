// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import Jr;
import android.animation.Animator;
import com.snapchat.android.ui.ClipCircleViewGroup;

// Referenced classes of package com.snapchat.android.discover.ui:
//            OpenChannelAnimationView, ChannelView

final class b extends Jr
{

    private b a;
    private ChannelView b;
    private OpenChannelAnimationView c;

    public final void onAnimationEnd(Animator animator)
    {
        OpenChannelAnimationView.a(c);
        if (a != null)
        {
            a.a(b);
        }
        if (!ClipCircleViewGroup.h)
        {
            animator = b;
            animator.c = true;
            animator.invalidate();
        }
    }

    A(OpenChannelAnimationView openchannelanimationview, A a1, ChannelView channelview)
    {
        c = openchannelanimationview;
        a = a1;
        b = channelview;
        super();
    }
}
