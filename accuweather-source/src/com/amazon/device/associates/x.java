// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            bl

class x
{

    private static bl a = null;

    x()
    {
    }

    static void a(bl bl1)
    {
        a = bl1;
    }

    static void a(String s, String s1)
    {
        if (a != null && b())
        {
            a.b(s, s1);
        }
    }

    static boolean a()
    {
        if (a == null)
        {
            return false;
        } else
        {
            return a.a();
        }
    }

    static void b(String s, String s1)
    {
        if (a != null && a())
        {
            a.a(s, s1);
        }
    }

    static boolean b()
    {
        if (a == null)
        {
            return false;
        } else
        {
            return a.b();
        }
    }

}
