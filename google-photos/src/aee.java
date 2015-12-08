// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public abstract class aee
{

    public final aex a;
    int b;

    private aee(aex aex)
    {
        b = 0x80000000;
        a = aex;
    }

    aee(aex aex, byte byte0)
    {
        this(aex);
    }

    public final int a()
    {
        if (0x80000000 == b)
        {
            return 0;
        } else
        {
            return e() - b;
        }
    }

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();
}
