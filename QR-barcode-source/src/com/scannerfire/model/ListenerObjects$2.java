// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;

// Referenced classes of package com.scannerfire.model:
//            ListenerObjects, Mail, MatMsg

class this._cls0
    implements android.view.er
{

    final ListenerObjects this$0;

    public void onClick(View view)
    {
        Log.d("", (new StringBuilder("msg->  ")).append(msg.toString()).toString());
        if (msg != null)
        {
            view = Mail.getString();
        } else
        {
            view = MatMsg.getTO();
        }
        view = new Intent("android.intent.action.SENDTO", Uri.parse((new StringBuilder("mailto:")).append(view).toString()));
        context.startActivity(Intent.createChooser(view, context.getString(0x7f080148)));
    }

    ()
    {
        this$0 = ListenerObjects.this;
        super();
    }
}
