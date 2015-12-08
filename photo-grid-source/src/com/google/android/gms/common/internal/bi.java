// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Iterator;

public final class bi
{

    private final String a;

    private bi(String s)
    {
        a = s;
    }

    public static bi a(String s)
    {
        return new bi(s);
    }

    private static CharSequence a(Object obj)
    {
        if (obj instanceof CharSequence)
        {
            return (CharSequence)obj;
        } else
        {
            return obj.toString();
        }
    }

    public final StringBuilder a(StringBuilder stringbuilder, Iterable iterable)
    {
        iterable = iterable.iterator();
        if (iterable.hasNext())
        {
            stringbuilder.append(a(iterable.next()));
            for (; iterable.hasNext(); stringbuilder.append(a(iterable.next())))
            {
                stringbuilder.append(a);
            }

        }
        return stringbuilder;
    }
}
