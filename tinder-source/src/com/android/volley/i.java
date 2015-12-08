// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            VolleyError

public final class i
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

    private i(VolleyError volleyerror)
    {
        d = false;
        a = null;
        b = null;
        c = volleyerror;
    }

    private i(Object obj, a.a a1)
    {
        d = false;
        a = obj;
        b = a1;
        c = null;
    }

    public static i a(VolleyError volleyerror)
    {
        return new i(volleyerror);
    }

    public static i a(Object obj, a.a a1)
    {
        return new i(obj, a1);
    }
}
