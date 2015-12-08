// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            r

public class m
{
    public static interface a
    {

        public abstract void a(r r);
    }

    public static interface b
    {

        public abstract void a(Object obj);
    }


    public final Object a;
    public final b.a b;
    public final r c;
    public boolean d;

    private m(r r)
    {
        d = false;
        a = null;
        b = null;
        c = r;
    }

    private m(Object obj, b.a a1)
    {
        d = false;
        a = obj;
        b = a1;
        c = null;
    }

    public static m a(r r)
    {
        return new m(r);
    }

    public static m a(Object obj, b.a a1)
    {
        return new m(obj, a1);
    }

    public boolean a()
    {
        return c == null;
    }
}
