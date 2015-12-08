// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

// Referenced classes of package org.apache.cordova:
//            CordovaChromeClient

class val.res
    implements android.content.kListener
{

    final CordovaChromeClient this$0;
    final JsPromptResult val$res;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        val$res.cancel();
    }

    stener()
    {
        this$0 = final_cordovachromeclient;
        val$res = JsPromptResult.this;
        super();
    }
}
