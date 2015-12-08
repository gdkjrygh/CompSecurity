// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.facebook:
//            AccessToken, q, e

final class f extends Handler
{

    private AccessToken a;
    private e b;

    f(AccessToken accesstoken, e e1)
    {
        super(Looper.getMainLooper());
        a = accesstoken;
        b = e1;
    }

    public final void handleMessage(Message message)
    {
        AccessToken accesstoken = AccessToken.a();
        if (accesstoken != null && accesstoken.equals(a) && message.getData().getString("access_token") != null)
        {
            AccessToken.a(AccessToken.a(a, message.getData()));
        }
        q.f().unbindService(b);
        e.a(b);
    }
}
