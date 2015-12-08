// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

public final class kcs
{

    private final String a;

    public kcs(String s)
    {
        a = s;
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
