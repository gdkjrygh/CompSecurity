// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package bo.app:
//            ff, fc, fb, fd

public class fa
{

    final String a;

    private fa(fa fa1)
    {
        a = fa1.a;
    }

    fa(fa fa1, byte byte0)
    {
        this(fa1);
    }

    private fa(String s)
    {
        a = (String)ff.a(s);
    }

    public static fa a()
    {
        return new fa(",");
    }

    public static fa a(String s)
    {
        return new fa(s);
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
        ff.a(appendable);
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
        ff.a(obj);
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

    public fa b()
    {
        return new fc(this, this);
    }

    public fa b(String s)
    {
        ff.a(s);
        return new fb(this, this, s);
    }

    public fd c(String s)
    {
        return new fd(this, s, (byte)0);
    }
}
