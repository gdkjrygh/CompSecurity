// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.qihoo360.mobilesafe.b:
//            c

public class e
{
    public static interface a
    {

        public abstract void a(int i);

        public abstract void setColor(int i);
    }


    Handler a = new Handler() {

        final e a;

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 1: default 24
        //                       1 127;
               goto _L1 _L2
_L1:
            e.b(a);
            if (e.c(a) != null)
            {
                e.c(a).setColor(e.d(a));
            }
            if (e.a(a) > 20) goto _L4; else goto _L3
_L3:
            message = a.a.obtainMessage();
            message.arg1 = e.e(a);
            message.arg2 = e.f(a);
            message.what = 1;
            a.a.sendMessageDelayed(message, 50L);
_L6:
            return;
_L2:
            e.a(a, com.qihoo360.mobilesafe.b.c.a((float)e.a(a) * 0.05F, new int[] {
                message.arg1, message.arg2
            }));
            continue; /* Loop/switch isn't completed */
_L4:
            if (e.c(a) == null) goto _L6; else goto _L5
_L5:
            e.c(a).a(e.d(a));
            return;
            if (true) goto _L1; else goto _L7
_L7:
        }

            
            {
                a = e.this;
                super();
            }
    };
    private int b;
    private int c;
    private int d;
    private int e;
    private final int f;
    private a g;

    public e()
    {
        f = 1;
    }

    public e(int i)
    {
        f = 1;
        e = i;
    }

    static int a(e e1)
    {
        return e1.b;
    }

    static int a(e e1, int i)
    {
        e1.e = i;
        return i;
    }

    static int b(e e1)
    {
        int i = e1.b;
        e1.b = i + 1;
        return i;
    }

    static a c(e e1)
    {
        return e1.g;
    }

    static int d(e e1)
    {
        return e1.e;
    }

    static int e(e e1)
    {
        return e1.c;
    }

    static int f(e e1)
    {
        return e1.d;
    }

    public void a()
    {
        a.removeMessages(1);
        g = null;
    }

    public void a(int i)
    {
        c = e;
        d = i;
        Message message = a.obtainMessage();
        message.arg1 = c;
        message.arg2 = d;
        message.what = 1;
        a.sendMessage(message);
        b = 1;
    }

    public void a(int i, int j)
    {
        e = i;
        c = i;
        d = j;
        Message message = a.obtainMessage();
        message.arg1 = c;
        message.arg2 = d;
        message.what = 1;
        a.sendMessage(message);
        b = 1;
    }

    public void a(a a1)
    {
        g = a1;
    }
}
