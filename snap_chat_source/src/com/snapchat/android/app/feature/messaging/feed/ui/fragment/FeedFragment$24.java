// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import LY;
import android.view.View;
import android.widget.TextView;
import com.snapchat.android.util.emoji.Emoji;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            FeedFragment

final class a
    implements 
{

    private FeedFragment a;

    public final void a(View view)
    {
        String s = a.getString(0x7f08019c, new Object[] {
            LY.a(Emoji.POOP)
        });
        ((TextView)view).setText(s);
    }

    Q(FeedFragment feedfragment)
    {
        a = feedfragment;
        super();
    }
}
