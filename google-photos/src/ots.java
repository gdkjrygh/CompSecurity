// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;

final class ots
    implements Runnable
{

    private volatile long a;
    private boolean b;
    private otn c;

    ots(otn otn1)
    {
        c = otn1;
        super();
        a();
    }

    private void a()
    {
        a = otn.a(c).k() + (long)otn.c(c);
    }

    static void a(ots ots1)
    {
        ots1.b = true;
    }

    static void b(ots ots1)
    {
        ots1.a();
    }

    public final void run()
    {
_L6:
        if (!b) goto _L2; else goto _L1
_L1:
        boolean flag = true;
          goto _L3
_L2:
        if (otn.a(c).k() <= a) goto _L5; else goto _L4
_L4:
        otn.b(c).open();
        flag = true;
          goto _L3
_L8:
        try
        {
            Thread.sleep(200L);
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
          goto _L6
_L3:
        if (!flag) goto _L8; else goto _L7
_L7:
        return;
_L5:
        flag = false;
          goto _L3
    }
}
