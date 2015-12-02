// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;


// Referenced classes of package com.facebook.inject:
//            bf

class bg
{

    private Object a;
    private boolean b;

    private bg()
    {
    }

    bg(bf bf)
    {
        this();
    }

    static Object a(bg bg1, Object obj)
    {
        bg1.a = obj;
        return obj;
    }

    static boolean a(bg bg1)
    {
        return bg1.b;
    }

    static boolean a(bg bg1, boolean flag)
    {
        bg1.b = flag;
        return flag;
    }

    static Object b(bg bg1)
    {
        return bg1.a;
    }
}
