// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b;

import java.util.Comparator;

// Referenced classes of package org.a.a.b:
//            b

private static final class ng extends Enum
    implements Comparator
{

    public static final a a;
    private static final a b[];

    public static ng valueOf(String s)
    {
        return (ng)Enum.valueOf(org/a/a/b/b$a, s);
    }

    public static final ng[] values()
    {
        return (ng[])b.clone();
    }

    public final int compare(Object obj, Object obj1)
    {
        return ((Comparable)obj).compareTo(obj1);
    }

    static 
    {
        a = new <init>("INSTANCE");
        b = (new b[] {
            a
        });
    }

    private ng(String s)
    {
        super(s, 0);
    }
}
