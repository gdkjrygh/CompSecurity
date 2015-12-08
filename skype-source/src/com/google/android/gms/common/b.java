// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.common:
//            e

public final class b
{

    public static final int a;
    private static final b b = new b();

    b()
    {
    }

    public static int a(Context context)
    {
        int j = e.a(context);
        int i = j;
        if (e.b(context, j))
        {
            i = 18;
        }
        return i;
    }

    public static Intent a(int i)
    {
        return e.a(i);
    }

    public static b a()
    {
        return b;
    }

    public static boolean a(Context context, int i)
    {
        return e.b(context, i);
    }

    public static void b(Context context)
    {
        e.c(context);
    }

    static 
    {
        a = e.a;
    }
}
