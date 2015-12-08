// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.webkit.WebView;

// Referenced classes of package me.grantland.twitter:
//            TwitterActivity

private class <init> extends Handler
{

    final TwitterActivity this$0;

    public void handleMessage(Message message)
    {
        Bundle bundle = message.getData();
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            TwitterActivity.access$0(TwitterActivity.this).loadUrl(bundle.getString("url"));
            break;
        }
    }

    private ()
    {
        this$0 = TwitterActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
