// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.DialogInterface;
import android.webkit.SslErrorHandler;

// Referenced classes of package com.skype.android.app.account:
//            WebActivity

final class val.handler
    implements android.content.e.OnClickListener
{

    final WebActivity this$0;
    final SslErrorHandler val$handler;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        val$handler.proceed();
    }

    ner()
    {
        this$0 = final_webactivity;
        val$handler = SslErrorHandler.this;
        super();
    }
}
