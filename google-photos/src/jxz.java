// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class jxz
{

    public static final int a;
    private static final jxz b = new jxz();

    jxz()
    {
    }

    public static int a(Context context)
    {
        int j = jyc.a(context);
        int i = j;
        if (jyc.b(context, j))
        {
            i = 18;
        }
        return i;
    }

    public static Intent a(int i)
    {
        return jyc.a(i);
    }

    public static jxz a()
    {
        return b;
    }

    public static boolean a(Context context, int i)
    {
        return jyc.b(context, i);
    }

    public static void b(Context context)
    {
        jyc.b(context);
    }

    public static void c(Context context)
    {
        jyc.c(context);
    }

    static 
    {
        a = jyc.a;
    }
}
