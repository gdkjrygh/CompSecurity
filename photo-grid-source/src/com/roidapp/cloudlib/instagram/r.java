// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            m

public final class r
{

    private static String c;
    public List a;
    private int b;

    public r()
    {
        b = 200;
        a = new ArrayList();
    }

    public static String a()
    {
        return c;
    }

    public static void a(String s)
    {
        c = s;
    }

    public static boolean b()
    {
        return !"false".equals(c);
    }

    public final m a(int i)
    {
        return (m)a.get(i);
    }
}
