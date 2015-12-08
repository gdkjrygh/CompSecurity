// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;

public class dr
{
    public static final class a
    {

        private final dr a;
        private final String b;

        public final StringBuilder a(StringBuilder stringbuilder, Iterator iterator)
        {
            try
            {
                dv.a(stringbuilder);
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

        private a(dr dr1, String s)
        {
            a = dr1;
            b = (String)dv.a(s);
        }

        a(dr dr1, String s, byte byte0)
        {
            this(dr1, s);
        }
    }


    final String a;

    private dr(dr dr1)
    {
        a = dr1.a;
    }

    dr(dr dr1, byte byte0)
    {
        this(dr1);
    }

    dr(String s)
    {
        a = (String)dv.a(s);
    }

    public static dr a(String s)
    {
        return new dr(s);
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

    public dr a()
    {
        return new dr(this) {

            private dr b;

            public final Appendable a(Appendable appendable, Iterator iterator)
            {
                dv.a(appendable, "appendable");
                dv.a(iterator, "parts");
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Object obj = iterator.next();
                    if (obj == null)
                    {
                        continue;
                    }
                    appendable.append(b.a(obj));
                    break;
                } while (true);
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Object obj1 = iterator.next();
                    if (obj1 != null)
                    {
                        appendable.append(b.a);
                        appendable.append(b.a(obj1));
                    }
                } while (true);
                return appendable;
            }

            public final dr b(String s)
            {
                throw new UnsupportedOperationException("already specified skipNulls");
            }

            public final a c(String s)
            {
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }

            
            {
                b = dr.this;
                super(dr2, (byte)0);
            }
        };
    }

    public Appendable a(Appendable appendable, Iterator iterator)
    {
        dv.a(appendable);
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
        dv.a(obj);
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

    public dr b(String s)
    {
        dv.a(s);
        return new dr(this, s) {

            private String b;
            private dr c;

            public final dr a()
            {
                throw new UnsupportedOperationException("already specified useForNull");
            }

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

            public final dr b(String s1)
            {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            
            {
                c = dr.this;
                b = s;
                super(dr2, (byte)0);
            }
        };
    }

    public a c(String s)
    {
        return new a(this, s, (byte)0);
    }

    // Unreferenced inner class dr$3

/* anonymous class */
    public static final class _cls3 extends AbstractList
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
