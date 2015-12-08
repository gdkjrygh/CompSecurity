// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class oug extends Handler
{

    private ouf a;

    oug(ouf ouf1)
    {
        a = ouf1;
        super();
    }

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            message = String.valueOf(message.toString());
            if (message.length() != 0)
            {
                message = "Unhandled message: ".concat(message);
            } else
            {
                message = new String("Unhandled message: ");
            }
            orw.b(message);
            return;

        case 1: // '\001'
            a.a.c();
            a.b.c();
            a.a.d();
            a.b.d();
            a.c.quit();
            return;
        }
    }
}
