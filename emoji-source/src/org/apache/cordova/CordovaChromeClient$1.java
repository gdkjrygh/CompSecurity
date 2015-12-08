// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.DialogInterface;
import org.xwalk.core.XWalkJavascriptResult;

// Referenced classes of package org.apache.cordova:
//            CordovaChromeClient

class val.result
    implements android.content.kListener
{

    final CordovaChromeClient this$0;
    final XWalkJavascriptResult val$result;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        val$result.confirm();
    }

    stener()
    {
        this$0 = final_cordovachromeclient;
        val$result = XWalkJavascriptResult.this;
        super();
    }
}
