// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;

public final class kag extends Handler
{

    public final void handleMessage(Message message)
    {
        boolean flag = true;
        if (message.what != 1)
        {
            flag = false;
        }
        b.b(flag);
        message = (kah)message.obj;
        throw new NullPointerException();
    }
}
