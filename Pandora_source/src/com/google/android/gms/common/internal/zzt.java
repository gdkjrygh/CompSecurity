// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Iterator;

public class zzt
{

    private final String separator;

    private zzt(String s)
    {
        separator = s;
    }

    public static zzt zzbR(String s)
    {
        return new zzt(s);
    }

    public final String zza(Iterable iterable)
    {
        return zza(new StringBuilder(), iterable).toString();
    }

    public final StringBuilder zza(StringBuilder stringbuilder, Iterable iterable)
    {
        iterable = iterable.iterator();
        if (iterable.hasNext())
        {
            stringbuilder.append(zzp(iterable.next()));
            for (; iterable.hasNext(); stringbuilder.append(zzp(iterable.next())))
            {
                stringbuilder.append(separator);
            }

        }
        return stringbuilder;
    }

    CharSequence zzp(Object obj)
    {
        if (obj instanceof CharSequence)
        {
            return (CharSequence)obj;
        } else
        {
            return obj.toString();
        }
    }
}
