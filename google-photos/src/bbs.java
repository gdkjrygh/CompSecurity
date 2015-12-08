// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class bbs extends qss
{

    public bbs()
    {
        super("minf");
    }

    public final bca e()
    {
        for (Iterator iterator = d().iterator(); iterator.hasNext();)
        {
            baz baz1 = (baz)iterator.next();
            if (baz1 instanceof bca)
            {
                return (bca)baz1;
            }
        }

        return null;
    }
}
