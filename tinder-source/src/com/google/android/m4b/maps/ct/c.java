// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;


// Referenced classes of package com.google.android.m4b.maps.ct:
//            t, h, m, d, 
//            q, e, a, w, 
//            b

public abstract class c
    implements t
{

    private static final h a = h.a();

    public c()
    {
    }

    private q b(d d1, h h1)
    {
        try
        {
            d1 = d1.d();
            h1 = (q)a(d1, h1);
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            throw d1;
        }
        d1.a(0);
        return h1;
        d1;
        d1.a = h1;
        throw d1;
    }

    public final Object a(d d1, h h1)
    {
        h1 = b(d1, h1);
        if (h1 != null && !h1.j())
        {
            if (h1 instanceof a)
            {
                d1 = new w();
            } else
            if (h1 instanceof b)
            {
                d1 = new w();
            } else
            {
                d1 = new w();
            }
            d1 = new m(d1.getMessage());
            d1.a = h1;
            throw d1;
        } else
        {
            return h1;
        }
    }

}
