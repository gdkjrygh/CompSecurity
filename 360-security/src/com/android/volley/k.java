// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            VolleyError

public class k
{
    public static interface a
    {

        public abstract void a(VolleyError volleyerror);
    }

    public static interface b
    {

        public abstract void a(Object obj);
    }


    public final Object a;
    public final a.a b;
    public final VolleyError c;
    public boolean d;

    private k(VolleyError volleyerror)
    {
        d = false;
        a = null;
        b = null;
        c = volleyerror;
    }

    private k(Object obj, a.a a1)
    {
        d = false;
        a = obj;
        b = a1;
        c = null;
    }

    public static k a(VolleyError volleyerror)
    {
        return new k(volleyerror);
    }

    public static k a(Object obj, a.a a1)
    {
        return new k(obj, a1);
    }

    public boolean a()
    {
        return c == null;
    }
}
