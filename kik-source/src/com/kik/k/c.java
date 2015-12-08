// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.k;

import com.c.b.aq;
import com.c.b.av;
import com.c.b.g;

final class c extends com.c.b.c
{

    c()
    {
    }

    private static a.a b(g g, aq aq)
    {
        try
        {
            g = new a.a(g, aq, (byte)0);
        }
        // Misplaced declaration of an exception variable
        catch (g g)
        {
            if (g.getCause() instanceof av)
            {
                throw (av)g.getCause();
            } else
            {
                throw g;
            }
        }
        return g;
    }

    public final Object a(g g, aq aq)
    {
        return b(g, aq);
    }
}
