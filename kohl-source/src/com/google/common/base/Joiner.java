// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.base:
//            Preconditions

public class Joiner
{
    public static final class MapJoiner
    {

        private final Joiner joiner;
        private final String keyValueSeparator;

        public Appendable appendTo(Appendable appendable, Map map)
            throws IOException
        {
            Preconditions.checkNotNull(appendable);
            map = map.entrySet().iterator();
            if (map.hasNext())
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                appendable.append(joiner.toString(entry.getKey()));
                appendable.append(keyValueSeparator);
                appendable.append(joiner.toString(entry.getValue()));
                java.util.Map.Entry entry1;
                for (; map.hasNext(); appendable.append(joiner.toString(entry1.getValue())))
                {
                    appendable.append(joiner.separator);
                    entry1 = (java.util.Map.Entry)map.next();
                    appendable.append(joiner.toString(entry1.getKey()));
                    appendable.append(keyValueSeparator);
                }

            }
            return appendable;
        }

        public StringBuilder appendTo(StringBuilder stringbuilder, Map map)
        {
            try
            {
                appendTo(((Appendable) (stringbuilder)), map);
            }
            // Misplaced declaration of an exception variable
            catch (StringBuilder stringbuilder)
            {
                throw new AssertionError(stringbuilder);
            }
            return stringbuilder;
        }

        public String join(Map map)
        {
            return appendTo(new StringBuilder(), map).toString();
        }

        public MapJoiner useForNull(String s)
        {
            return new MapJoiner(joiner.useForNull(s), keyValueSeparator);
        }

        private MapJoiner(Joiner joiner1, String s)
        {
            joiner = joiner1;
            keyValueSeparator = (String)Preconditions.checkNotNull(s);
        }

    }


    private final String separator;

    private Joiner(Joiner joiner)
    {
        separator = joiner.separator;
    }


    private Joiner(String s)
    {
        separator = (String)Preconditions.checkNotNull(s);
    }

    private static Iterable iterable(Object obj, Object obj1, Object aobj[])
    {
        Preconditions.checkNotNull(((Object) (aobj)));
        return new AbstractList(aobj, obj, obj1) {

            final Object val$first;
            final Object val$rest[];
            final Object val$second;

            public Object get(int i)
            {
                switch (i)
                {
                default:
                    return rest[i - 2];

                case 0: // '\0'
                    return first;

                case 1: // '\001'
                    return second;
                }
            }

            public int size()
            {
                return rest.length + 2;
            }

            
            {
                rest = aobj;
                first = obj;
                second = obj1;
                super();
            }
        };
    }

    public static Joiner on(char c)
    {
        return new Joiner(String.valueOf(c));
    }

    public static Joiner on(String s)
    {
        return new Joiner(s);
    }

    public Appendable appendTo(Appendable appendable, Iterable iterable1)
        throws IOException
    {
        Preconditions.checkNotNull(appendable);
        iterable1 = iterable1.iterator();
        if (iterable1.hasNext())
        {
            appendable.append(toString(iterable1.next()));
            for (; iterable1.hasNext(); appendable.append(toString(iterable1.next())))
            {
                appendable.append(separator);
            }

        }
        return appendable;
    }

    public final transient Appendable appendTo(Appendable appendable, Object obj, Object obj1, Object aobj[])
        throws IOException
    {
        return appendTo(appendable, iterable(obj, obj1, aobj));
    }

    public final Appendable appendTo(Appendable appendable, Object aobj[])
        throws IOException
    {
        return appendTo(appendable, ((Iterable) (Arrays.asList(aobj))));
    }

    public final StringBuilder appendTo(StringBuilder stringbuilder, Iterable iterable1)
    {
        try
        {
            appendTo(((Appendable) (stringbuilder)), iterable1);
        }
        // Misplaced declaration of an exception variable
        catch (StringBuilder stringbuilder)
        {
            throw new AssertionError(stringbuilder);
        }
        return stringbuilder;
    }

    public final transient StringBuilder appendTo(StringBuilder stringbuilder, Object obj, Object obj1, Object aobj[])
    {
        return appendTo(stringbuilder, iterable(obj, obj1, aobj));
    }

    public final StringBuilder appendTo(StringBuilder stringbuilder, Object aobj[])
    {
        return appendTo(stringbuilder, ((Iterable) (Arrays.asList(aobj))));
    }

    public final String join(Iterable iterable1)
    {
        return appendTo(new StringBuilder(), iterable1).toString();
    }

    public final transient String join(Object obj, Object obj1, Object aobj[])
    {
        return join(iterable(obj, obj1, aobj));
    }

    public final String join(Object aobj[])
    {
        return join(((Iterable) (Arrays.asList(aobj))));
    }

    public Joiner skipNulls()
    {
        return new Joiner(this) {

            final Joiner this$0;

            public Appendable appendTo(Appendable appendable, Iterable iterable1)
                throws IOException
            {
                Preconditions.checkNotNull(appendable, "appendable");
                Preconditions.checkNotNull(iterable1, "parts");
                iterable1 = iterable1.iterator();
                do
                {
                    if (!iterable1.hasNext())
                    {
                        break;
                    }
                    Object obj = iterable1.next();
                    if (obj == null)
                    {
                        continue;
                    }
                    appendable.append(toString(obj));
                    break;
                } while (true);
                do
                {
                    if (!iterable1.hasNext())
                    {
                        break;
                    }
                    Object obj1 = iterable1.next();
                    if (obj1 != null)
                    {
                        appendable.append(separator);
                        appendable.append(toString(obj1));
                    }
                } while (true);
                return appendable;
            }

            public Joiner useForNull(String s)
            {
                Preconditions.checkNotNull(s);
                throw new UnsupportedOperationException("already specified skipNulls");
            }

            public MapJoiner withKeyValueSeparator(String s)
            {
                Preconditions.checkNotNull(s);
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }

            
            {
                this$0 = Joiner.this;
                super(joiner1, null);
            }
        };
    }

    CharSequence toString(Object obj)
    {
        if (obj instanceof CharSequence)
        {
            return (CharSequence)obj;
        } else
        {
            return obj.toString();
        }
    }

    public Joiner useForNull(String s)
    {
        Preconditions.checkNotNull(s);
        return new Joiner(s) {

            final Joiner this$0;
            final String val$nullText;

            public Joiner skipNulls()
            {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            CharSequence toString(Object obj)
            {
                if (obj == null)
                {
                    return nullText;
                } else
                {
                    return Joiner.this.toString(obj);
                }
            }

            public Joiner useForNull(String s1)
            {
                Preconditions.checkNotNull(s1);
                throw new UnsupportedOperationException("already specified useForNull");
            }

            
            {
                this$0 = Joiner.this;
                nullText = s;
                super(final_joiner1, null);
            }
        };
    }

    public MapJoiner withKeyValueSeparator(String s)
    {
        return new MapJoiner(this, s);
    }

}
