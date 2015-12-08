// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            w

public final class r
{
    public static interface a
    {

        public abstract void a(w w);
    }

    public static interface b
    {

        public abstract void a(Object obj);
    }


    public final Object a;
    public final b.a b;
    public final w c;
    public boolean d;

    private r(w w)
    {
        d = false;
        a = null;
        b = null;
        c = w;
    }

    private r(Object obj, b.a a1)
    {
        d = false;
        a = obj;
        b = a1;
        c = null;
    }

    public static r a(w w)
    {
        return new r(w);
    }

    public static r a(Object obj, b.a a1)
    {
        return new r(obj, a1);
    }
}
