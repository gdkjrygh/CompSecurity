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
    implements android.view.ner
{

    private a a;

    public final void onClick(View view)
    {
        view.setVisibility(8);
        FeedFragment.a(a.a).setVisibility(0);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/android/app/feature/messaging/feed/ui/fragment/FeedFragment$1

/* anonymous class */
    final class FeedFragment._cls1
        implements PI.a
    {

        final FeedFragment a;

        public final void a(View view)
        {
            ((TextView)FeedFragment.b(a).a()).setOnClickListener(new FeedFragment._cls1._cls1(this));
        }

            
            {
                a = feedfragment;
                super();
            }
    }

}
