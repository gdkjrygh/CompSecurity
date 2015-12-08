// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;

import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.c.a.a:
//            r, u

public static final class ng
{

    private final r a;
    private final String b;

    public final StringBuilder a(StringBuilder stringbuilder, Iterator iterator)
    {
        try
        {
            u.a(stringbuilder);
            if (iterator.hasNext())
            {
                java.util.Entry entry = (java.util.Entry)iterator.next();
                stringbuilder.append(a.a(entry.getKey()));
                stringbuilder.append(b);
                stringbuilder.append(a.a(entry.getValue()));
                java.util.Entry entry1;
                for (; iterator.hasNext(); stringbuilder.append(a.a(entry1.getValue())))
                {
                    stringbuilder.append(r.a(a));
                    entry1 = (java.util.Entry)iterator.next();
                    stringbuilder.append(a.a(entry1.getKey()));
                    stringbuilder.append(b);
                }

            }
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw new AssertionError(stringbuilder);
        }
        return stringbuilder;
    }

    private ct(r r1, String s)
    {
        a = r1;
        b = (String)u.a(s);
    }

    ng(r r1, String s, byte byte0)
    {
        this(r1, s);
    }
}
