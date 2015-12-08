// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c.a.a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package c.a.a:
//            c, f, i, g

public final class a extends ArrayList
    implements c, f, List
{

    private static String a(List list, g g)
    {
        StringBuilder stringbuilder = new StringBuilder();
        try
        {
            a(((Iterable) (list)), ((Appendable) (stringbuilder)), g);
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        return stringbuilder.toString();
    }

    public static void a(Iterable iterable, Appendable appendable, g g)
    {
        if (iterable == null)
        {
            appendable.append("null");
            return;
        }
        boolean flag = true;
        appendable.append('[');
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            Object obj = iterable.next();
            if (flag)
            {
                flag = false;
            } else
            {
                appendable.append(',');
            }
            if (obj == null)
            {
                appendable.append("null");
            } else
            {
                i.a(obj, appendable, g);
            }
        }

        appendable.append(']');
    }

    public final String a()
    {
        return a(((List) (this)), i.a);
    }

    public final String a(g g)
    {
        return a(((List) (this)), g);
    }

    public final void a(Appendable appendable)
    {
        a(((Iterable) (this)), appendable, i.a);
    }

    public final void a(Appendable appendable, g g)
    {
        a(((Iterable) (this)), appendable, g);
    }

    public final String toString()
    {
        return a(this, i.a);
    }
}
