// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;


// Referenced classes of package com.android.slyce.report.c:
//            ac, ah

class af
    implements Runnable
{

    final ac a;
    private volatile boolean b;

    public af(ac ac1)
    {
        a = ac1;
        super();
        b = true;
    }

    public void a()
    {
        b = false;
        ac.a(a).post(this);
    }

    public void b()
    {
        b = true;
        ac.a(a).removeCallbacks(this);
    }

    public void run()
    {
        if (!b)
        {
            android.os.Message message = ac.a(a).obtainMessage(1);
            ac.a(a).sendMessage(message);
        }
        ac.a(a).postDelayed(this, 30000L);
    }
}
