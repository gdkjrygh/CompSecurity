// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;

public final class fck
    implements android.os.Handler.Callback, fco
{

    private Handler a;
    private final fdy b;
    private final fci c;

    public fck(fci fci1, fdy fdy1)
    {
        b = fdy1;
        c = fci1;
        a = new Handler(this);
    }

    private boolean a(int i, long l)
    {
        return a.sendEmptyMessageDelayed(i, l);
    }

    private void b()
    {
        a.removeMessages(1);
        a.removeMessages(2);
        a.removeMessages(3);
    }

    private void c()
    {
        a.sendEmptyMessageDelayed(3, 1000L);
    }

    public final void a()
    {
        b();
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (!flag1)
        {
            b();
            c();
            return;
        }
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        a(byte0, 0L);
    }

    public final boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            b.a(b.b(), false);
            c.b(b.a);
            if (!b.c())
            {
                a(1, 500L);
                return true;
            } else
            {
                c();
                return true;
            }

        case 2: // '\002'
            b.a(b.a(), false);
            c.b(b.a);
            if (!b.d())
            {
                a(2, 500L);
                return true;
            } else
            {
                c();
                return true;
            }

        case 3: // '\003'
            c.b(b.a);
            message = b;
            message.a(((fdy) (message)).a);
            return true;
        }
    }
}
