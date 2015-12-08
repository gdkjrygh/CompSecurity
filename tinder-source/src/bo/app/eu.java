// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package bo.app:
//            ez, ew, ev, ex

public class eu
{

    final String a;

    private eu(eu eu1)
    {
        a = eu1.a;
    }

    eu(eu eu1, byte byte0)
    {
        this(eu1);
    }

    private eu(String s)
    {
        a = (String)ez.a(s);
    }

    public static eu a()
    {
        return new eu(",");
    }

    public static eu a(String s)
    {
        return new eu(s);
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
        ez.a(appendable);
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
        ez.a(obj);
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

    public eu b()
    {
        return new ew(this, this);
    }

    public eu b(String s)
    {
        ez.a(s);
        return new ev(this, this, s);
    }

    public ex c(String s)
    {
        return new ex(this, s, (byte)0);
    }
}
