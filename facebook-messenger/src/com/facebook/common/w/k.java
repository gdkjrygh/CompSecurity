// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;

import com.google.common.a.gb;
import com.google.common.base.Joiner;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.facebook.common.w:
//            l

public class k
{

    public k()
    {
    }

    public static String a(Iterable iterable)
    {
        return (new StringBuilder()).append("(").append(Joiner.on(',').join(iterable)).append(")").toString();
    }

    public static String a(String s, Iterable iterable)
    {
        iterable = c(iterable);
        s = (new StringBuilder("CASE ")).append(s).append(" ");
        iterable = iterable.iterator();
        for (int i = 0; iterable.hasNext(); i++)
        {
            String s1 = (String)iterable.next();
            s.append("WHEN ").append(s1).append(" THEN ").append(i).append(" ");
        }

        s.append("END");
        return s.toString();
    }

    public static transient String a(String as[])
    {
        return b(Arrays.asList(as));
    }

    public static String b(Iterable iterable)
    {
        iterable = c(iterable);
        return (new StringBuilder()).append("(").append(Joiner.on(',').join(iterable)).append(")").toString();
    }

    private static Iterable c(Iterable iterable)
    {
        return gb.a(iterable, new l());
    }
}
