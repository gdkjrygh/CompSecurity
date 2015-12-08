// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

public class gk
    implements android.os.IBinder.DeathRecipient
{

    private final Object a;
    private gl b;
    private boolean c;

    public gk()
    {
        c = false;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new gy(new gm(this));
            return;
        } else
        {
            a = new gn(this);
            return;
        }
    }

    static gl a(gk gk1)
    {
        return gk1.b;
    }

    static void a(gk gk1, Handler handler)
    {
        gk1.b = new gl(gk1, handler.getLooper());
    }

    static boolean a(gk gk1, boolean flag)
    {
        gk1.c = flag;
        return flag;
    }

    static boolean b(gk gk1)
    {
        return gk1.c;
    }

    static Object c(gk gk1)
    {
        return gk1.a;
    }

    public void a()
    {
    }

    public void a(fw fw)
    {
    }

    public void a(ib ib)
    {
    }

    public void binderDied()
    {
        a();
    }
}
