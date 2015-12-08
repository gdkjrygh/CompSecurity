// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Iterator;

public final class Joiner
{

    private final String separator;

    private Joiner(String s)
    {
        separator = s;
    }

    private StringBuilder appendTo(StringBuilder stringbuilder, Iterable iterable)
    {
        iterable = iterable.iterator();
        if (iterable.hasNext())
        {
            stringbuilder.append(toString(iterable.next()));
            for (; iterable.hasNext(); stringbuilder.append(toString(iterable.next())))
            {
                stringbuilder.append(separator);
            }

        }
        return stringbuilder;
    }

    public static Joiner on(String s)
    {
        return new Joiner(s);
    }

    private static CharSequence toString(Object obj)
    {
        if (obj instanceof CharSequence)
        {
            return (CharSequence)obj;
        } else
        {
            return obj.toString();
        }
    }

    public final String join(Iterable iterable)
    {
        return appendTo(new StringBuilder(), iterable).toString();
    }
}
