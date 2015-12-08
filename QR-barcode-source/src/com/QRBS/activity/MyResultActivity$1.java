// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.util.Log;
import android.view.View;
import com.scannerfire.utils.EncodeUtils;

// Referenced classes of package com.QRBS.activity:
//            MyResultActivity

class val.text
    implements android.view.r
{

    final MyResultActivity this$0;
    private final String val$text;

    public void onClick(View view)
    {
        Log.d("", "SHARE");
        (new EncodeUtils(MyResultActivity.this)).start(val$text, label);
    }

    ()
    {
        this$0 = final_myresultactivity;
        val$text = String.this;
        super();
    }
}
