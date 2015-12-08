// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public abstract class mua
{

    public final Context a;
    public final ay b;
    public boolean c;

    public mua(Context context, ay ay)
    {
        a = context;
        b = ay;
    }

    public abstract void a(am am);

    public abstract void a(String s);

    public final void a(String s, String s1)
    {
        a(s, null, s1, false);
    }

    public abstract void a(String s, String s1, String s2, boolean flag);

    public final void a(mtf mtf1, boolean flag)
    {
        String s1 = mtf1.b(a);
        String s = s1;
        if (s1 == null)
        {
            s = mtf1.e();
        }
        a(s, null, mtf1.d, flag);
    }

    public abstract boolean a(mue mue);
}
