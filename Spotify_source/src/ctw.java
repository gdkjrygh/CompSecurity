// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;

public class ctw
{

    final String a;

    private ctw(ctw ctw1)
    {
        a = ctw1.a;
    }

    ctw(ctw ctw1, byte byte0)
    {
        this(ctw1);
    }

    private ctw(String s)
    {
        a = (String)ctz.a(s);
    }

    public static ctw a(char c)
    {
        return new ctw(String.valueOf(c));
    }

    public static ctw a(String s)
    {
        return new ctw(s);
    }

    CharSequence a(Object obj)
    {
        ctz.a(obj);
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

    public final transient String a(Object obj, Object obj1, Object aobj[])
    {
        ctz.a(((Object) (aobj)));
        return a(((Iterable) (new AbstractList(aobj, obj, obj1) {

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

            
            {
                a = aobj;
                b = obj;
                c = obj1;
                super();
            }
        })));
    }

    public final StringBuilder a(StringBuilder stringbuilder, Iterator iterator)
    {
        try
        {
            ctz.a(stringbuilder);
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

    public ctw b(String s)
    {
        ctz.a(s);
        return new ctw(this, s) {

            private String b;
            private ctw c;

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

            public final ctw b(String s1)
            {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            
            {
                c = ctw.this;
                b = s;
                super(ctw2, (byte)0);
            }
        };
    }
}
