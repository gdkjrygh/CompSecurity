// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Vibrator;

// Referenced classes of package com.scannerfire.utils:
//            Utils

class val.finish
    implements android.content.terface.OnClickListener
{

    final Utils this$0;
    private final Activity val$app;
    private final boolean val$finish;
    private final Intent val$intent;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (Utils.getVibratePref(val$app))
        {
            getVibrator(val$app).vibrate(60L);
        }
        if (val$intent != null)
        {
            val$app.startActivity(val$intent);
        }
        dialoginterface.dismiss();
        if (val$finish)
        {
            val$app.finish();
        }
    }

    e()
    {
        this$0 = final_utils;
        val$app = activity;
        val$intent = intent1;
        val$finish = Z.this;
        super();
    }
}
