// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import java.util.List;

final class awz
    implements android.os.Handler.Callback
{

    private aww a;

    awz(aww aww1)
    {
        a = aww1;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            message = (awx)message.obj;
            aww aww1 = a;
            if (aww1.h)
            {
                aww1.b.obtainMessage(2, message).sendToTarget();
            } else
            {
                if (((awx) (message)).b != null)
                {
                    aww1.c();
                    awx awx1 = aww1.g;
                    aww1.g = message;
                    for (int i = aww1.c.size() - 1; i >= 0; i--)
                    {
                        ((awy)aww1.c.get(i)).b();
                    }

                    if (awx1 != null)
                    {
                        aww1.b.obtainMessage(2, awx1).sendToTarget();
                    }
                }
                aww1.f = false;
                aww1.b();
            }
            return true;
        }
        if (message.what == 2)
        {
            message = (awx)message.obj;
            a.d.a(message);
        }
        return false;
    }
}
