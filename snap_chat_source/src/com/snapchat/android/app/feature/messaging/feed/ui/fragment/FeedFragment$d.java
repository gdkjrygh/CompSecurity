// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import Fi;
import afA;
import in.srain.cube.views.ptr.PtrFrameLayout;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class <init>
    implements afA
{

    boolean a;
    private FeedFragment b;

    public final void a(PtrFrameLayout ptrframelayout)
    {
    }

    public final void a(PtrFrameLayout ptrframelayout, boolean flag, byte byte0, int i, int j, float f, float f1)
    {
        if (!a)
        {
            FeedFragment.n(b).c();
            a = true;
        }
    }

    public final void b(PtrFrameLayout ptrframelayout)
    {
    }

    public final void c(PtrFrameLayout ptrframelayout)
    {
    }

    public final void d(PtrFrameLayout ptrframelayout)
    {
    }

    private (FeedFragment feedfragment)
    {
        b = feedfragment;
        super();
    }

    b(FeedFragment feedfragment, byte byte0)
    {
        this(feedfragment);
    }
}
