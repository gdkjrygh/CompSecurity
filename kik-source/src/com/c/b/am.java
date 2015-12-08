// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;

// Referenced classes of package com.c.b:
//            c, av, al, g, 
//            aq

final class am extends c
{

    final al a;

    am(al al1)
    {
        a = al1;
        super();
    }

    private al b(g g, aq aq)
    {
        al.a a1 = al.b(al.a(a));
        try
        {
            a1.a(g, aq);
        }
        // Misplaced declaration of an exception variable
        catch (g g)
        {
            throw g.a(a1.d());
        }
        // Misplaced declaration of an exception variable
        catch (g g)
        {
            throw (new av(g.getMessage())).a(a1.d());
        }
        return a1.d();
    }

    public final Object a(g g, aq aq)
    {
        return b(g, aq);
    }
}
