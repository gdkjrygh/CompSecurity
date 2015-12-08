// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public class bcv extends qss
{

    public bcv()
    {
        super("traf");
    }

    public final bcw e()
    {
        for (Iterator iterator = d().iterator(); iterator.hasNext();)
        {
            baz baz1 = (baz)iterator.next();
            if (baz1 instanceof bcw)
            {
                return (bcw)baz1;
            }
        }

        return null;
    }
}
