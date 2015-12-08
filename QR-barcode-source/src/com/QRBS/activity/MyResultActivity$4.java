// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.scannerfire.utils.Utils;

// Referenced classes of package com.QRBS.activity:
//            MyResultActivity

class val.correctURI
    implements android.view.r
{

    final MyResultActivity this$0;
    private final String val$correctURI;

    public void onClick(View view)
    {
        view = val$correctURI;
        try
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(view)));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Utils.showToastNotification(MyResultActivity.this, getString(0x7f080157));
        }
        Log.d("", (new StringBuilder("ActivityNotFoundException: url is ->")).append(view).toString());
    }

    tion()
    {
        this$0 = final_myresultactivity;
        val$correctURI = String.this;
        super();
    }
}
