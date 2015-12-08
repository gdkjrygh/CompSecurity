// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.a.a:
//            ad, w

public final class aa
{

    private final w a;
    private final String b;

    private aa(w w1, String s)
    {
        a = w1;
        b = (String)ad.a(s);
    }

    aa(w w1, String s, byte byte0)
    {
        this(w1, s);
    }

    public final String a(Map map)
    {
        map = map.entrySet().iterator();
        return a(new StringBuilder(), ((Iterator) (map))).toString();
    }

    public final StringBuilder a(StringBuilder stringbuilder, Iterator iterator)
    {
        try
        {
            ad.a(stringbuilder);
            if (iterator.hasNext())
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                stringbuilder.append(a.a(entry.getKey()));
                stringbuilder.append(b);
                stringbuilder.append(a.a(entry.getValue()));
                java.util.Map.Entry entry1;
                for (; iterator.hasNext(); stringbuilder.append(a.a(entry1.getValue())))
                {
                    stringbuilder.append(w.a(a));
                    entry1 = (java.util.Map.Entry)iterator.next();
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
}
