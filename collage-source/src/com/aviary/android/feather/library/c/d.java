// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.c;

import com.aviary.android.feather.common.a.a;
import it.sephiroth.android.library.b.c;

public class d
{

    private static final com.aviary.android.feather.common.a.a.c a;

    public d()
    {
    }

    public static int a(c c1)
    {
        c1 = c1.d(c.j);
        if (c1 == null)
        {
            return 0;
        } else
        {
            return c.b(c1.shortValue());
        }
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a("ExifUtils", com.aviary.android.feather.common.a.a.d.a);
    }
}
