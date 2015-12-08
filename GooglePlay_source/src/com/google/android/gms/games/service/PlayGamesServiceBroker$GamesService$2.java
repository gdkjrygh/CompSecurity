// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import com.google.android.gms.games.signin.SignInCache;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesServiceBroker

final class val.msgType extends MessageListener
{

    final this._cls0 this$0;
    final String val$msgType;

    public final void onFound(Message message)
    {
        while (!SignInCache.isSignedIn(cess._mth000(this._cls0.this), cess._mth200(this._cls0.this)) || message == null || !val$msgType.equals(message.type)) 
        {
            return;
        }
        String s = null;
        if (message.content != null)
        {
            s = new String(message.content);
        }
        cess._mth300(this._cls0.this, s);
    }

    ()
    {
        this$0 = final_;
        val$msgType = String.this;
        super();
    }
}
