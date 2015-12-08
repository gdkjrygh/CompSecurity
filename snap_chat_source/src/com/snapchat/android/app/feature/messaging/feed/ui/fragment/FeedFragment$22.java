// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import PI;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class a
    implements 
{

    final FeedFragment a;

    public final void a(View view)
    {
        FeedFragment.f(a).a().setOnClickListener(new android.view.View.OnClickListener() {

            private FeedFragment._cls22 a;

            public final void onClick(View view1)
            {
                ((EditText)FeedFragment.g(a.a).a()).setText("");
            }

            
            {
                a = FeedFragment._cls22.this;
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
