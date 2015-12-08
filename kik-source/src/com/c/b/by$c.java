// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;

// Referenced classes of package com.c.b:
//            c, by, av, g, 
//            aq

public static final class ect extends c
{

    private static by a(g g)
    {
        ing ing = by.c();
        try
        {
            ing.a(g);
        }
        // Misplaced declaration of an exception variable
        catch (g g)
        {
            throw g.a(ing.c());
        }
        // Misplaced declaration of an exception variable
        catch (g g)
        {
            throw (new av(g.getMessage())).a(ing.c());
        }
        return ing.c();
    }

    public final volatile Object a(g g, aq aq)
    {
        return a(g);
    }

    public ect()
    {
    }
}
