// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.strings;

import com.soundcloud.java.checks.Preconditions;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class Joiner
{

    private final String separator;

    private Joiner(Joiner joiner)
    {
        separator = joiner.separator;
    }

    Joiner(Joiner joiner, _cls1 _pcls1)
    {
        this(joiner);
    }

    Joiner(String s)
    {
        separator = (String)Preconditions.checkNotNull(s);
    }

    private static Iterable iterable(final Object first, final Object second, final Object rest[])
    {
        Preconditions.checkNotNull(((Object) (rest)));
        return new _cls3();
    }

    public Appendable appendTo(Appendable appendable, Iterable iterable1)
        throws IOException
    {
        return appendTo(appendable, iterable1.iterator());
    }

    public final transient Appendable appendTo(Appendable appendable, Object obj, Object obj1, Object aobj[])
        throws IOException
    {
        return appendTo(appendable, iterable(obj, obj1, aobj));
    }

    public Appendable appendTo(Appendable appendable, Iterator iterator)
        throws IOException
    {
        Preconditions.checkNotNull(appendable);
        if (iterator.hasNext())
        {
            appendable.append(toString(iterator.next()));
            for (; iterator.hasNext(); appendable.append(toString(iterator.next())))
            {
                appendable.append(separator);
            }

        }
        return appendable;
    }

    public final Appendable appendTo(Appendable appendable, Object aobj[])
        throws IOException
    {
        return appendTo(appendable, ((Iterable) (Arrays.asList(aobj))));
    }

    public final StringBuilder appendTo(StringBuilder stringbuilder, Iterable iterable1)
    {
        return appendTo(stringbuilder, iterable1.iterator());
    }

    public final transient StringBuilder appendTo(StringBuilder stringbuilder, Object obj, Object obj1, Object aobj[])
    {
        return appendTo(stringbuilder, iterable(obj, obj1, aobj));
    }

    public final StringBuilder appendTo(StringBuilder stringbuilder, Iterator iterator)
    {
        try
        {
            appendTo(((Appendable) (stringbuilder)), iterator);
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
        return join(iterable1.iterator());
    }

    public final transient String join(Object obj, Object obj1, Object aobj[])
    {
        return join(iterable(obj, obj1, aobj));
    }

    public final String join(Iterator iterator)
    {
        return appendTo(new StringBuilder(), iterator).toString();
    }

    public final String join(Object aobj[])
    {
        return join(((Iterable) (Arrays.asList(aobj))));
    }

    public Joiner skipNulls()
    {
        return new _cls2(this);
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

    public Joiner useForNull(String s)
    {
        Preconditions.checkNotNull(s);
        return new _cls1(s);
    }


    private class _cls3 extends AbstractList
    {

        final Object val$first;
        final Object val$rest[];
        final Object val$second;

        public final Object get(int i)
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

        public final int size()
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


    private class _cls2 extends Joiner
    {

        final Joiner this$0;

        public Appendable appendTo(Appendable appendable, Iterator iterator)
            throws IOException
        {
            Preconditions.checkNotNull(appendable, "appendable");
            Preconditions.checkNotNull(iterator, "parts");
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
                appendable.append(toString(obj));
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
                    appendable.append(separator);
                    appendable.append(toString(obj1));
                }
            } while (true);
            return appendable;
        }

        public Joiner useForNull(String s)
        {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        _cls2(Joiner joiner1)
        {
            this$0 = Joiner.this;
            super(joiner1, null);
        }
    }


    private class _cls1 extends Joiner
    {

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

        public Joiner useForNull(String s)
        {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        _cls1(String s)
        {
            this$0 = Joiner.this;
            nullText = s;
            super(final_joiner1, null);
        }
    }

}
