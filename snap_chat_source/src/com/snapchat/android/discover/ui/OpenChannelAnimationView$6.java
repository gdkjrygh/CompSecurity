// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import Jr;
import android.animation.Animator;

// Referenced classes of package com.snapchat.android.discover.ui:
//            OpenChannelAnimationView

public final class a extends Jr
{

    private b a;
    private OpenChannelAnimationView b;

    public final void onAnimationEnd(Animator animator)
    {
        OpenChannelAnimationView.b(b);
        if (a != null)
        {
            a.a(OpenChannelAnimationView.c(b));
        }
    }

    public A(OpenChannelAnimationView openchannelanimationview, A a1)
    {
        b = openchannelanimationview;
        a = a1;
        super();
    }
}
