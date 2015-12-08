// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d.b;

import com.c.b.aq;
import com.c.b.av;
import com.c.b.c;

final class g extends c
{

    g()
    {
    }

    private static a.g b(com.c.b.g g1, aq aq)
    {
        try
        {
            g1 = new a.g(g1, aq, (byte)0);
        }
        // Misplaced declaration of an exception variable
        catch (com.c.b.g g1)
        {
            if (g1.getCause() instanceof av)
            {
                throw (av)g1.getCause();
            } else
            {
                throw g1;
            }
        }
        return g1;
    }

    public final Object a(com.c.b.g g1, aq aq)
    {
        return b(g1, aq);
    }
}
