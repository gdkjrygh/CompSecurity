// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

final class d.os.Handler extends Handler
{

    private ari a;

    public final void handleMessage(Message message)
    {
        ari ari1 = a;
        if (message.what == ari1.d)
        {
            message = message.getData();
            if (message.getString("com.facebook.platform.status.ERROR_TYPE") != null)
            {
                ari1.b(null);
            } else
            {
                ari1.b(message);
            }
            ari1.a.unbindService(ari1);
        }
    }

    (ari ari1)
    {
        a = ari1;
        super();
    }
}
