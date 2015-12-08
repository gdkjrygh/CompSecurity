// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class brc
    implements brf
{

    private bra a;

    brc(bra bra1)
    {
        a = bra1;
        super();
    }

    public final boolean a()
    {
        for (Iterator iterator = bra.b(a).iterator(); iterator.hasNext();)
        {
            if (((brd)iterator.next()).b())
            {
                return true;
            }
        }

        return false;
    }
}
