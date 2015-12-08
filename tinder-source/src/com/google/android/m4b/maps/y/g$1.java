// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;


// Referenced classes of package com.google.android.m4b.maps.y:
//            g

final class nit> extends g
{

    private String b;
    private g c;

    final CharSequence a(Object obj)
    {
        if (obj == null)
        {
            return b;
        } else
        {
            return c.a(obj);
        }
    }

    public final g b(String s)
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    ption(g g1, g g2, String s)
    {
        c = g1;
        b = s;
        super(g2, (byte)0);
    }
}
