// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base;


// Referenced classes of package com.facebook.base:
//            a

public class b
{

    private static boolean a;

    public b()
    {
    }

    public static final boolean a()
    {
        return a;
    }

    public static final String b()
    {
        if (a())
        {
            return "com.facebook.wakizashi";
        } else
        {
            return "com.facebook.katana";
        }
    }

    static 
    {
        a = a.a;
    }
}
