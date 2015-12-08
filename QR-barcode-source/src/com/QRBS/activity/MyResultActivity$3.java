// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;

// Referenced classes of package com.QRBS.activity:
//            MyResultActivity

class val.correctURI
    implements android.view.r
{

    final MyResultActivity this$0;
    private final String val$correctURI;

    public void onClick(View view)
    {
        view = val$correctURI.split("=");
        try
        {
            Log.d("", (new StringBuilder("SPLIT 1->")).append(view[0]).append(" SPLIT 2->").append(view[1]).toString());
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(val$correctURI)));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("http://play.google.com/store/apps/details?id=")).append(view[1]).toString())));
        }
    }

    tion()
    {
        this$0 = final_myresultactivity;
        val$correctURI = String.this;
        super();
    }
}
