// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.y:
//            j

public class g
{
    public static final class a
    {

        private final g a;
        private final String b;

        public final StringBuilder a(StringBuilder stringbuilder, Iterator iterator)
        {
            try
            {
                j.a(stringbuilder);
                if (iterator.hasNext())
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    stringbuilder.append(a.a(entry.getKey()));
                    stringbuilder.append(b);
                    stringbuilder.append(a.a(entry.getValue()));
                    java.util.Map.Entry entry1;
                    for (; iterator.hasNext(); stringbuilder.append(a.a(entry1.getValue())))
                    {
                        stringbuilder.append(a.a);
                        entry1 = (java.util.Map.Entry)iterator.next();
                        stringbuilder.append(a.a(entry1.getKey()));
                        stringbuilder.append(b);
                    }

                }
            }
            // Misplaced declaration of an exception variable
            catch (StringBuilder stringbuilder)
            {
                throw new AssertionError(stringbuilder);
            }
            return stringbuilder;
        }

        private a(g g1, String s)
        {
            a = g1;
            b = (String)j.a(s);
        }

        public a(g g1, String s, byte byte0)
        {
            this(g1, s);
        }
    }


    final String a;

    private g(g g1)
    {
        a = g1.a;
    }

    g(g g1, byte byte0)
    {
        this(g1);
    }

    private g(String s)
    {
        a = (String)j.a(s);
    }

    public static g a(char c)
    {
        return new g(String.valueOf(c));
    }

    public static g a(String s)
    {
        return new g(s);
    }

    CharSequence a(Object obj)
    {
        j.a(obj);
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

    public final String a(Object aobj[])
    {
        return a(((Iterable) (Arrays.asList(aobj))));
    }

    public final StringBuilder a(StringBuilder stringbuilder, Iterator iterator)
    {
        try
        {
            j.a(stringbuilder);
            if (iterator.hasNext())
            {
                stringbuilder.append(a(iterator.next()));
                for (; iterator.hasNext(); stringbuilder.append(a(iterator.next())))
                {
                    stringbuilder.append(a);
                }

            }
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw new AssertionError(stringbuilder);
        }
        return stringbuilder;
    }

    public g b(String s)
    {
        j.a(s);
        return new g(this, s) {

            private String b;
            private g c;

            final CharSequence a(Object obj)
            {
                if (obj == null)
                {
                    return b;
                } else
                {
                    return c.a(obj);
                }
            }

            public final g b(String s1)
            {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            
            {
                c = g.this;
                b = s;
                super(g2, (byte)0);
            }
        };
    }

    // Unreferenced inner class com/google/android/m4b/maps/y/g$2

/* anonymous class */
    public static final class _cls2 extends AbstractList
    {

        private Object a[];
        private Object b;
        private Object c;

        public final Object get(int i)
        {
            switch (i)
            {
            default:
                return a[i - 2];

            case 0: // '\0'
                return b;

            case 1: // '\001'
                return c;
            }
        }

        public final int size()
        {
            return a.length + 2;
        }

            public 
            {
                a = aobj;
                b = obj;
                c = obj1;
                super();
            }
    }

}
