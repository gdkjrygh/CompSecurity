// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.google.common.base:
//            Preconditions

public class Joiner
{

    private final String separator;

    private Joiner(String s)
    {
        separator = (String)Preconditions.checkNotNull(s);
    }

    private static Iterable iterable(final Object first, final Object second, final Object rest[])
    {
        Preconditions.checkNotNull(((Object) (rest)));
        return new _cls3();
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

    CharSequence toString(Object obj)
    {
        Preconditions.checkNotNull(obj);
        if (obj instanceof CharSequence)
        {
            return (CharSequence)obj;
        } else
        {
            return obj.toString();
        }
    }

    public MapJoiner withKeyValueSeparator(String s)
    {
        return new MapJoiner(s, null);
    }


    private class _cls3 extends AbstractList
    {

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

        _cls3()
        {
            rest = aobj;
            first = obj;
            second = obj1;
            super();
        }
    }


    private class MapJoiner
    {

        private final Joiner joiner;
        private final String keyValueSeparator;

        public Appendable appendTo(Appendable appendable, Iterable iterable1)
        {
            Preconditions.checkNotNull(appendable);
            iterable1 = iterable1.iterator();
            if (iterable1.hasNext())
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterable1.next();
                appendable.append(joiner.toString(entry.getKey()));
                appendable.append(keyValueSeparator);
                appendable.append(joiner.toString(entry.getValue()));
                java.util.Map.Entry entry1;
                for (; iterable1.hasNext(); appendable.append(joiner.toString(entry1.getValue())))
                {
                    appendable.append(joiner.separator);
                    entry1 = (java.util.Map.Entry)iterable1.next();
                    appendable.append(joiner.toString(entry1.getKey()));
                    appendable.append(keyValueSeparator);
                }

            }
            return appendable;
        }

        public StringBuilder appendTo(StringBuilder stringbuilder, Iterable iterable1)
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

        public StringBuilder appendTo(StringBuilder stringbuilder, Map map)
        {
            return appendTo(stringbuilder, ((Iterable) (map.entrySet())));
        }

        private MapJoiner(String s)
        {
            joiner = Joiner.this;
            keyValueSeparator = (String)Preconditions.checkNotNull(s);
        }

        MapJoiner(String s, _cls1 _pcls1)
        {
            this(s);
        }
    }

}
