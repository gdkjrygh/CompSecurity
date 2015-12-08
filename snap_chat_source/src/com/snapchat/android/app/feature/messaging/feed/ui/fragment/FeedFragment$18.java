// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import Bt;
import PI;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class a
    implements android.view.Listener
{

    private FeedFragment a;

    public final boolean onLongClick(View view)
    {
        view.setVisibility(8);
        view = (TextView)FeedFragment.b(a).a();
        StringBuilder stringbuilder = new StringBuilder();
        FeedFragment.d(a);
        stringbuilder = stringbuilder.append(Bt.c()).append(" | ");
        FeedFragment.d(a);
        view.setText(stringbuilder.append(Bt.b()).toString());
        FeedFragment.b(a).a(0);
        return true;
    }

    Q(FeedFragment feedfragment)
    {
        a = feedfragment;
        super();
    }
}
