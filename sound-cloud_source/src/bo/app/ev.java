// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package bo.app:
//            fa, ex, ew, ey

public class ev
{

    final String a;

    private ev(ev ev1)
    {
        a = ev1.a;
    }

    ev(ev ev1, byte byte0)
    {
        this(ev1);
    }

    private ev(String s)
    {
        a = (String)fa.a(s);
    }

    public static ev a()
    {
        return new ev(",");
    }

    public static ev a(String s)
    {
        return new ev(s);
    }

    private StringBuilder a(StringBuilder stringbuilder, Iterator iterator)
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

    public Appendable a(Appendable appendable, Iterator iterator)
    {
        fa.a(appendable);
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
        fa.a(obj);
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

    public ev b()
    {
        return new ex(this, this);
    }

    public ev b(String s)
    {
        fa.a(s);
        return new ew(this, this, s);
    }

    public ey c(String s)
    {
        return new ey(this, s, (byte)0);
    }
}
