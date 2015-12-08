// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import Fi;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class a
    implements com.snapchat.android.ui.snapview.View.a
{

    private FeedFragment a;

    public final void a(int i, float f)
    {
        Fi fi = FeedFragment.n(a);
        if (i >= 2) goto _L2; else goto _L1
_L1:
        f = 0.0F;
_L4:
        fi.a(f);
        return;
_L2:
        if (i > 2)
        {
            f = 1.0F;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    Q(FeedFragment feedfragment)
    {
        a = feedfragment;
        super();
    }
}
