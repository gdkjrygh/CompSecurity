// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.google.a.a:
//            ad, z, y, x, 
//            aa

public class w
{

    private final String a;

    private w(w w1)
    {
        a = w1.a;
    }

    w(w w1, byte byte0)
    {
        this(w1);
    }

    private w(String s)
    {
        a = (String)ad.a(s);
    }

    public static w a()
    {
        return new w(",");
    }

    public static w a(String s)
    {
        return new w(s);
    }

    static String a(w w1)
    {
        return w1.a;
    }

    public Appendable a(Appendable appendable, Iterator iterator)
    {
        ad.a(appendable);
        if (iterator.hasNext())
        {
            appendable.append(a(iterator.next()));
            for (; iterator.hasNext(); appendable.append(a(iterator.next())))
            {
                appendable.append(a);
            }

        }
        return appendable;
    }

    CharSequence a(Object obj)
    {
        ad.a(obj);
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

    public final transient String a(Object obj, Object obj1, Object aobj[])
    {
        ad.a(((Object) (aobj)));
        return a(((Iterable) (new z(aobj, obj, obj1))));
    }

    public final StringBuilder a(StringBuilder stringbuilder, Iterator iterator)
    {
        try
        {
            a(((Appendable) (stringbuilder)), iterator);
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw new AssertionError(stringbuilder);
        }
        return stringbuilder;
    }

    public w b()
    {
        return new y(this, this);
    }

    public w b(String s)
    {
        ad.a(s);
        return new x(this, this, s);
    }

    public aa c(String s)
    {
        return new aa(this, s, (byte)0);
    }
}
