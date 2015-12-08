// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.signin;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.games.signin:
//            SignInClient

final class this._cls0 extends Handler
{

    final SignInClient this$0;

    public final void handleMessage(Message message)
    {
        if (!isConnected())
        {
            return;
        } else
        {
            ((this._cls0)message.obj).liverCallback();
            return;
        }
    }

    ()
    {
        this$0 = SignInClient.this;
        super();
    }
}
