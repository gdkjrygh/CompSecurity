// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Iterator;

public class x
{

    private final String a;

    private x(String s)
    {
        a = s;
    }

    public static x a(String s)
    {
        return new x(s);
    }

    CharSequence a(Object obj)
    {
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
        return a(new StringBuilder(), iterable).toString();
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
