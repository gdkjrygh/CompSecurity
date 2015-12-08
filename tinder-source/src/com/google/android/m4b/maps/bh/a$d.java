// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bh;

import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bw.a;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.bh:
//            a

public static final class b
    implements Comparable
{

    private final int a;
    private final a b;
    private final String c;

    public final int compareTo(Object obj)
    {
        obj = (b)obj;
        if (a != ((a) (obj)).a)
        {
            return a - ((a) (obj)).a;
        } else
        {
            return b.a(((b) (obj)).b);
        }
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof b) && ((b)obj).a == a && ((a)obj).b.equals(b);
    }

    public final int hashCode()
    {
        return a * 33 ^ b.hashCode();
    }

    public final String toString()
    {
        return c;
    }

    public (ah ah1)
    {
        this(ah1, null, a.a);
    }

    public <init>(ah ah1, Set set, a a1)
    {
        if (ah1.C)
        {
            throw new IllegalArgumentException("Modifier tile types not allowed as base");
        }
        int i = 1 << ah1.E;
        ah1 = new StringBuilder(ah1.toString());
        int j = i;
        if (set != null)
        {
            j = i;
            if (!set.isEmpty())
            {
                ah1.append(" with modifiers ");
                set = set.iterator();
                do
                {
                    if (!set.hasNext())
                    {
                        break;
                    }
                    ah ah2 = (ah)set.next();
                    if (!ah2.C)
                    {
                        throw new IllegalArgumentException("Only modifier tile types allowed");
                    }
                    j = i | 1 << ah2.E;
                    ah1.append(ah2.toString());
                    i = j;
                    if (set.hasNext())
                    {
                        ah1.append(", ");
                        i = j;
                    }
                } while (true);
                j = i;
            }
        }
        if (a1 != a.a)
        {
            set = String.valueOf(a1);
            ah1.append((new StringBuilder(String.valueOf(set).length() + 11)).append(" with mask ").append(set).toString());
        }
        a = j;
        c = ah1.toString();
        b = a1;
    }
}
