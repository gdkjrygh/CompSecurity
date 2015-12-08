// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import PI;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class a
    implements t
{

    final FeedFragment a;

    public final void a(View view)
    {
        ((TextView)FeedFragment.b(a).a()).setOnClickListener(new android.view.View.OnClickListener() {

            private FeedFragment._cls1 a;

            public final void onClick(View view1)
            {
                view1.setVisibility(8);
                FeedFragment.a(a.a).setVisibility(0);
            }

            
            {
                a = FeedFragment._cls1.this;
                super();
            }
        });
    }

    _cls1.a(FeedFragment feedfragment)
    {
        a = feedfragment;
        super();
    }
}
