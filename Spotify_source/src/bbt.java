// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class bbt extends Handler
{

    private bbo a;

    public bbt(bbo bbo1, Looper looper)
    {
        a = bbo1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            bbo.a(a, message.obj);
            return;

        case 1: // '\001'
            bbo.b(a, message.obj);
            break;
        }
    }
}
