// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import java.util.concurrent.ExecutorService;

public final class jna
{

    public final ExecutorService a;
    jnc b;
    public boolean c;

    public jna(String s)
    {
        a = jno.a(s);
    }

    public final void a()
    {
        c.b(c);
        jnc jnc1 = b;
        jnc1.a.a();
        if (jnc1.b != null)
        {
            jnc1.b.interrupt();
        }
    }

    public final void a(jnd jnd1, jnb jnb)
    {
        boolean flag1 = false;
        Looper looper = Looper.myLooper();
        boolean flag;
        if (looper != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        flag = flag1;
        if (!c)
        {
            flag = true;
        }
        c.b(flag);
        c = true;
        b = new jnc(this, looper, jnd1, jnb);
        a.submit(b);
    }
}
