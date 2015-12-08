// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

// Referenced classes of package org.apache.cordova:
//            CordovaChromeClient

class val.res
    implements android.content.kListener
{

    final CordovaChromeClient this$0;
    final EditText val$input;
    final JsPromptResult val$res;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = val$input.getText().toString();
        val$res.confirm(dialoginterface);
    }

    stener()
    {
        this$0 = final_cordovachromeclient;
        val$input = edittext;
        val$res = JsPromptResult.this;
        super();
    }
}
