// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.thetransitapp.droid.model.Feed;

// Referenced classes of package com.thetransitapp.droid.widget:
//            LegalAdapter

class val.feed
    implements android.view.tener
{

    final LegalAdapter this$0;
    private final Feed val$feed;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse(val$feed.getLicenceUrl()));
        if (LegalAdapter.access$0(LegalAdapter.this) != null)
        {
            LegalAdapter.access$0(LegalAdapter.this).startActivity(view);
        }
    }

    ()
    {
        this$0 = final_legaladapter;
        val$feed = Feed.this;
        super();
    }
}
