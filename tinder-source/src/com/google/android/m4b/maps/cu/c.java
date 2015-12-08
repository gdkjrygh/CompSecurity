// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cu;

import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.cu:
//            j, g, a

public final class c
{

    protected final Class a;
    boolean b;
    private int c;
    private int d;

    final int a(Object obj)
    {
        int i = j.a(d);
        switch (c)
        {
        default:
            i = c;
            throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());

        case 10: // '\n'
            obj = (g)obj;
            return com.google.android.m4b.maps.cu.a.a(i) * 2 + ((g) (obj)).e();

        case 11: // '\013'
            return com.google.android.m4b.maps.cu.a.a(i, (g)obj);
        }
    }

    final void a(Object obj, a a1)
    {
        a1.b(d);
        c;
        JVM INSTR tableswitch 10 11: default 114
    //                   10 80
    //                   11 105;
           goto _L1 _L2 _L3
_L1:
        int i = c;
        throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
_L2:
        try
        {
            obj = (g)obj;
            int k = j.a(d);
            ((g) (obj)).a(a1);
            a1.c(k, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        a1.a((g)obj);
        return;
    }
}
