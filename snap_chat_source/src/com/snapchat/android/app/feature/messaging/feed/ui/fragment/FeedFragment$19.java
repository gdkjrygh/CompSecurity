// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class a
    implements android.view.ener
{

    private FeedFragment a;

    public final void onClick(View view)
    {
        a.getActivity().onBackPressed();
    }

    Q(FeedFragment feedfragment)
    {
        a = feedfragment;
        super();
    }
}
