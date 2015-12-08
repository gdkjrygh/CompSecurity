// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;

import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.c.a.a:
//            u, s

public class r
{
    public static final class a
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
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    stringbuilder.append(a.a(entry.getKey()));
                    stringbuilder.append(b);
                    stringbuilder.append(a.a(entry.getValue()));
                    java.util.Map.Entry entry1;
                    for (; iterator.hasNext(); stringbuilder.append(a.a(entry1.getValue())))
                    {
                        stringbuilder.append(r.a(a));
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

        private a(r r1, String s1)
        {
            a = r1;
            b = (String)u.a(s1);
        }

        a(r r1, String s1, byte byte0)
        {
            this(r1, s1);
        }
    }


    private final String a;

    private r(r r1)
    {
        a = r1.a;
    }

    r(r r1, byte byte0)
    {
        this(r1);
    }

    private r(String s1)
    {
        a = (String)u.a(s1);
    }

    public static r a(char c1)
    {
        return new r(String.valueOf(c1));
    }

    public static r a(String s1)
    {
        return new r(s1);
    }

    static String a(r r1)
    {
        return r1.a;
    }

    CharSequence a(Object obj)
    {
        u.a(obj);
        if (obj instanceof CharSequence)
        {
            return (CharSequence)obj;
        } else
        {
            return obj.toString();
        }
    }

    public final String a(Iterable iterable)
    {
        iterable = iterable.iterator();
        return a(new StringBuilder(), ((Iterator) (iterable))).toString();
    }

    public final StringBuilder a(StringBuilder stringbuilder, Iterator iterator)
    {
        try
        {
            u.a(stringbuilder);
            if (iterator.hasNext())
            {
                stringbuilder.append(a(iterator.next()));
                for (; iterator.hasNext(); stringbuilder.append(a(iterator.next())))
                {
                    stringbuilder.append(a);
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

    public r b(String s1)
    {
        u.a(s1);
        return new s(this, this, s1);
    }

    public final a c(String s1)
    {
        return new a(this, s1, (byte)0);
    }
}
