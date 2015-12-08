// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b;


// Referenced classes of package com.android.b:
//            c, ac

public class v
{

    public final Object a;
    public final c b;
    public final ac c;
    public boolean d;

    private v(ac ac)
    {
        d = false;
        a = null;
        b = null;
        c = ac;
    }

    private v(Object obj, c c1)
    {
        d = false;
        a = obj;
        b = c1;
        c = null;
    }

    public static v a(ac ac)
    {
        return new v(ac);
    }

    public static v a(Object obj, c c1)
    {
        return new v(obj, c1);
    }

    public boolean a()
    {
        return c == null;
    }
}
