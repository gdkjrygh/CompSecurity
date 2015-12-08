// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;

static final class > extends Handler
{

    public final void handleMessage(Message message)
    {
        lang.Object obj = (eMessage)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            aq.c(obj.a, obj.b[0]);
            return;

        case 2: // '\002'
            aq.c();
            break;
        }
    }

    private >()
    {
    }

    >(byte byte0)
    {
        this();
    }
}
