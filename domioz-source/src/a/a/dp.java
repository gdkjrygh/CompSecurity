// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package a.a:
//            du, dr, dq, ds

public class dp
{

    final String a;

    private dp(dp dp1)
    {
        a = dp1.a;
    }

    dp(dp dp1, byte byte0)
    {
        this(dp1);
    }

    private dp(String s)
    {
        a = (String)du.a(s);
    }

    public static dp a()
    {
        return new dp(",");
    }

    public static dp a(String s)
    {
        return new dp(s);
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
        du.a(appendable);
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
        du.a(obj);
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

    public dp b()
    {
        return new dr(this, this);
    }

    public dp b(String s)
    {
        du.a(s);
        return new dq(this, this, s);
    }

    public ds c(String s)
    {
        return new ds(this, s, (byte)0);
    }
}
