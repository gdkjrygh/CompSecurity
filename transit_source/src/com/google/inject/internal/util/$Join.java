// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.inject.internal.util:
//            $Preconditions, $Lists

public final class $Join
{
    public static class JoinException extends RuntimeException
    {

        private static final long serialVersionUID = 1L;

        private JoinException(IOException ioexception)
        {
            super(ioexception);
        }

    }


    private $Join()
    {
    }

    private static void appendOneEntry(Appendable appendable, String s, java.util.Map.Entry entry)
        throws IOException
    {
        appendOneToken(appendable, entry.getKey());
        appendable.append(s);
        appendOneToken(appendable, entry.getValue());
    }

    private static void appendOneToken(Appendable appendable, Object obj)
        throws IOException
    {
        appendable.append(toCharSequence(obj));
    }

    public static Appendable join(Appendable appendable, String s, Iterable iterable)
    {
        return join(appendable, s, iterable.iterator());
    }

    public static transient Appendable join(Appendable appendable, String s, Object obj, Object aobj[])
    {
        $Preconditions.checkNotNull(((Object) (aobj)));
        return join(appendable, s, ((Iterable) ($Lists.newArrayList(obj, aobj))));
    }

    public static Appendable join(Appendable appendable, String s, String s1, Map map)
    {
        $Preconditions.checkNotNull(appendable);
        $Preconditions.checkNotNull(s);
        $Preconditions.checkNotNull(s1);
        map = map.entrySet().iterator();
        if (map.hasNext())
        {
            try
            {
                appendOneEntry(appendable, s, (java.util.Map.Entry)map.next());
                for (; map.hasNext(); appendOneEntry(appendable, s, (java.util.Map.Entry)map.next()))
                {
                    appendable.append(s1);
                }

            }
            // Misplaced declaration of an exception variable
            catch (Appendable appendable)
            {
                throw new JoinException(appendable);
            }
        }
        return appendable;
    }

    public static Appendable join(Appendable appendable, String s, Iterator iterator)
    {
        $Preconditions.checkNotNull(appendable);
        $Preconditions.checkNotNull(s);
        if (iterator.hasNext())
        {
            try
            {
                appendOneToken(appendable, iterator.next());
                for (; iterator.hasNext(); appendOneToken(appendable, iterator.next()))
                {
                    appendable.append(s);
                }

            }
            // Misplaced declaration of an exception variable
            catch (Appendable appendable)
            {
                throw new JoinException(appendable);
            }
        }
        return appendable;
    }

    public static Appendable join(Appendable appendable, String s, Object aobj[])
    {
        return join(appendable, s, ((Iterable) (Arrays.asList(aobj))));
    }

    public static String join(String s, Iterable iterable)
    {
        return join(s, iterable.iterator());
    }

    public static transient String join(String s, Object obj, Object aobj[])
    {
        $Preconditions.checkNotNull(((Object) (aobj)));
        return join(s, ((Iterable) ($Lists.newArrayList(obj, aobj))));
    }

    public static String join(String s, String s1, Map map)
    {
        return ((StringBuilder)join(((Appendable) (new StringBuilder())), s, s1, map)).toString();
    }

    public static String join(String s, Iterator iterator)
    {
        StringBuilder stringbuilder = new StringBuilder();
        join(((Appendable) (stringbuilder)), s, iterator);
        return stringbuilder.toString();
    }

    public static String join(String s, Object aobj[])
    {
        return join(s, ((Iterable) (Arrays.asList(aobj))));
    }

    private static CharSequence toCharSequence(Object obj)
    {
        if (obj instanceof CharSequence)
        {
            return (CharSequence)obj;
        } else
        {
            return String.valueOf(obj);
        }
    }
}
