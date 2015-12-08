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
    implements android.view.er
{

    private a a;

    public final void onClick(View view)
    {
        ((EditText)FeedFragment.g(a.a).a()).setText("");
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/android/app/feature/messaging/feed/ui/fragment/FeedFragment$22

/* anonymous class */
    final class FeedFragment._cls22
        implements PI.a
    {

        final FeedFragment a;

        public final void a(View view)
        {
            FeedFragment.f(a).a().setOnClickListener(new FeedFragment._cls22._cls1(this));
        }

            
            {
                a = feedfragment;
                super();
            }
    }

}
