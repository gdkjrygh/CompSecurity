// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Message;

// Referenced classes of package android.support.design.widget:
//            e

final class a
    implements android.os.ler.Callback
{

    final e a;

    public final boolean handleMessage(Message message)
    {
        e e1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            e1 = a;
            break;
        }
        a a1 = (a)message.obj;
        synchronized (e1.a)
        {
            if (e1.b == a1 || e1.c == a1)
            {
                e.a(a1);
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (e e1)
    {
        a = e1;
        super();
    }
}
