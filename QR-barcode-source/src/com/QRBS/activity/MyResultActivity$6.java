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

class val.text
    implements android.view.r
{

    final MyResultActivity this$0;
    private final String val$text;

    public void onClick(View view)
    {
        view = Utils.URICorrection(val$text, "geo:");
        Intent intent;
        Log.d("", (new StringBuilder("TEXT ->")).append(val$text).toString());
        intent = new Intent("android.intent.action.VIEW");
        if (!view.contains("?"))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        intent.setData(Uri.parse((new StringBuilder(String.valueOf(view))).append("&z=16").toString()));
_L1:
        startActivity(intent);
        return;
        try
        {
            intent.setData(Uri.parse((new StringBuilder(String.valueOf(view))).append("?z=16").toString()));
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            Utils.showToastNotification(a, getString(0x7f080116));
            return;
        }
          goto _L1
    }

    tion()
    {
        this$0 = final_myresultactivity;
        val$text = String.this;
        super();
    }
}
