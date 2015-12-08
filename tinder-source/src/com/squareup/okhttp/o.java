// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class o
{
    public static final class a
    {

        final List a = new ArrayList(20);

        private a c(String s, String s1)
        {
            a.add(s);
            a.add(s1.trim());
            return this;
        }

        private static void d(String s, String s1)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("name == null");
            }
            if (s.isEmpty())
            {
                throw new IllegalArgumentException("name is empty");
            }
            int k = s.length();
            for (int i = 0; i < k; i++)
            {
                char c1 = s.charAt(i);
                if (c1 <= '\037' || c1 >= '\177')
                {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", new Object[] {
                        Integer.valueOf(c1), Integer.valueOf(i), s
                    }));
                }
            }

            if (s1 == null)
            {
                throw new IllegalArgumentException("value == null");
            }
            k = s1.length();
            for (int j = 0; j < k; j++)
            {
                char c2 = s1.charAt(j);
                if (c2 <= '\037' || c2 >= '\177')
                {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", new Object[] {
                        Integer.valueOf(c2), Integer.valueOf(j), s1
                    }));
                }
            }

        }

        final a a(String s)
        {
            int i = s.indexOf(":", 1);
            if (i != -1)
            {
                return c(s.substring(0, i), s.substring(i + 1));
            }
            if (s.startsWith(":"))
            {
                return c("", s.substring(1));
            } else
            {
                return c("", s);
            }
        }

        public final a a(String s, String s1)
        {
            d(s, s1);
            return c(s, s1);
        }

        public final o a()
        {
            return new o(this, (byte)0);
        }

        public final a b(String s)
        {
            int j;
            for (int i = 0; i < a.size(); i = j + 2)
            {
                j = i;
                if (s.equalsIgnoreCase((String)a.get(i)))
                {
                    a.remove(i);
                    a.remove(i);
                    j = i - 2;
                }
            }

            return this;
        }

        public final a b(String s, String s1)
        {
            d(s, s1);
            b(s);
            c(s, s1);
            return this;
        }

        public a()
        {
        }
    }


    public final String a[];

    private o(a a1)
    {
        a = (String[])a1.a.toArray(new String[a1.a.size()]);
    }

    o(a a1, byte byte0)
    {
        this(a1);
    }

    public final a a()
    {
        a a1 = new a();
        Collections.addAll(a1.a, a);
        return a1;
    }

    public final String a(int i)
    {
        i *= 2;
        if (i < 0 || i >= a.length)
        {
            return null;
        } else
        {
            return a[i];
        }
    }

    public final String a(String s)
    {
        String as[] = a;
        for (int i = as.length - 2; i >= 0; i -= 2)
        {
            if (s.equalsIgnoreCase(as[i]))
            {
                return as[i + 1];
            }
        }

        return null;
    }

    public final String b(int i)
    {
        i = i * 2 + 1;
        if (i < 0 || i >= a.length)
        {
            return null;
        } else
        {
            return a[i];
        }
    }

    public final Date b(String s)
    {
        s = a(s);
        if (s != null)
        {
            return g.a(s);
        } else
        {
            return null;
        }
    }

    public final Map b()
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        int j = a.length / 2;
        for (int i = 0; i < j; i++)
        {
            String s = a(i);
            List list = (List)linkedhashmap.get(s);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList(2);
                linkedhashmap.put(s, obj);
            }
            ((List) (obj)).add(b(i));
        }

        return linkedhashmap;
    }

    public final List c(String s)
    {
        int j = a.length / 2;
        ArrayList arraylist = null;
        for (int i = 0; i < j;)
        {
            ArrayList arraylist1 = arraylist;
            if (s.equalsIgnoreCase(a(i)))
            {
                arraylist1 = arraylist;
                if (arraylist == null)
                {
                    arraylist1 = new ArrayList(2);
                }
                arraylist1.add(b(i));
            }
            i++;
            arraylist = arraylist1;
        }

        if (arraylist != null)
        {
            return Collections.unmodifiableList(arraylist);
        } else
        {
            return Collections.emptyList();
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        for (int j = a.length / 2; i < j; i++)
        {
            stringbuilder.append(a(i)).append(": ").append(b(i)).append("\n");
        }

        return stringbuilder.toString();
    }
}
