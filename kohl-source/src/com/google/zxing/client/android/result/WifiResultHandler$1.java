// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import android.widget.Toast;

// Referenced classes of package com.google.zxing.client.android.result:
//            WifiResultHandler

class val.activity
    implements Runnable
{

    final WifiResultHandler this$0;
    final Activity val$activity;

    public void run()
    {
        Toast.makeText(val$activity.getApplicationContext(), com.google.zxing.client.android.ng_network, 0).show();
    }

    ()
    {
        this$0 = final_wifiresulthandler;
        val$activity = Activity.this;
        super();
    }
}
