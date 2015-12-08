// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.az;

import com.google.android.m4b.maps.ak.d;
import com.google.android.m4b.maps.bo.ax;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.bo.n;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class a
{

    public final com.google.android.m4b.maps.ak.c a;
    public final g b;
    final Set c = new HashSet();
    private final ax d;

    public a(com.google.android.m4b.maps.ak.c c1, ax ax1, g g1, String as[])
    {
        a = c1;
        d = ax1;
        c1 = g1;
        if (g1 == null)
        {
            c1 = ax1.a().e();
        }
        b = c1;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            c1 = as[i];
            c.add(com.google.android.m4b.maps.ak.a.a(c1));
        }

    }

    static g a(String s)
    {
        com.google.android.m4b.maps.ba.a a1 = com.google.android.m4b.maps.ba.a.a(s);
        if (a1 != null)
        {
            return g.b(a1.a, a1.b);
        }
        if (s.startsWith("0x1:0x"))
        {
            String s1;
            if (s.length() <= 14)
            {
                String s2 = "0";
                s1 = s.substring(6);
                s = s2;
            } else
            {
                s1 = s.substring(6, s.length() - 8);
                String s3 = s.substring(s.length() - 8);
                s = s1;
                s1 = s3;
            }
            try
            {
                s = new g(com.google.android.m4b.maps.ak.d.b(s), com.google.android.m4b.maps.ak.d.b(s1));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        } else
        {
            return null;
        }
    }

    public static Collection a(Collection collection, n n)
    {
        if (collection.isEmpty())
        {
            return collection;
        }
        LinkedList linkedlist = new LinkedList();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            a a1 = (a)collection.next();
            if (a1.a(n))
            {
                linkedlist.add(a1);
            }
        } while (true);
        return linkedlist;
    }

    public final m a()
    {
        return d.a();
    }

    public final boolean a(n n)
    {
        return d.a(n);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof a)
            {
                if (!((a) (obj = (a)obj)).a.equals(a) || !((a) (obj)).d.equals(d) || !((a) (obj)).b.equals(b) || !((a) (obj)).c.equals(c))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((d.hashCode() * 31 + b.hashCode()) * 31 + c.hashCode()) * 31 + a.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf(a);
        String s1 = String.valueOf(d);
        String s2 = String.valueOf(b);
        String s3 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 11 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("[").append(s).append(" : ").append(s1).append(" : ").append(s2).append(" : ").append(s3).append("]").toString();
    }
}
