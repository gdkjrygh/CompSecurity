// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.QRBS.activity:
//            MyResultActivity

class val.text
    implements android.view.r
{

    final MyResultActivity this$0;
    private final String val$text;

    public void onClick(View view)
    {
        view = (new StringBuilder("http://www.google.com/m/products?q=")).append(val$text).toString();
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(view)));
    }

    ()
    {
        this$0 = final_myresultactivity;
        val$text = String.this;
        super();
    }
}
