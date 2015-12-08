// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.webkit.WebView;

// Referenced classes of package me.grantland.twitter:
//            TwitterDialog

private class <init> extends Handler
{

    final TwitterDialog this$0;

    public void handleMessage(Message message)
    {
        Bundle bundle = message.getData();
        switch (message.what)
        {
        case 0: // '\0'
        default:
            return;

        case -1: 
            TwitterDialog.access$0(TwitterDialog.this, (Throwable)bundle.getSerializable("error"));
            return;

        case 1: // '\001'
            TwitterDialog.access$1(TwitterDialog.this).loadUrl(bundle.getString("url"));
            return;

        case 2: // '\002'
            TwitterDialog.access$2(TwitterDialog.this, bundle.getString("access_token"), bundle.getString("access_secret"));
            break;
        }
    }

    private ()
    {
        this$0 = TwitterDialog.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
