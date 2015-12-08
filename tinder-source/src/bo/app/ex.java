// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package bo.app:
//            ez, eu

public final class ex
{

    private final eu a;
    private final String b;

    private ex(eu eu1, String s)
    {
        a = eu1;
        b = (String)ez.a(s);
    }

    ex(eu eu1, String s, byte byte0)
    {
        this(eu1, s);
    }

    public final StringBuilder a(StringBuilder stringbuilder, Iterator iterator)
    {
        try
        {
            ez.a(stringbuilder);
            if (iterator.hasNext())
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                stringbuilder.append(a.a(entry.getKey()));
                stringbuilder.append(b);
                stringbuilder.append(a.a(entry.getValue()));
                java.util.Map.Entry entry1;
                for (; iterator.hasNext(); stringbuilder.append(a.a(entry1.getValue())))
                {
                    stringbuilder.append(a.a);
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
