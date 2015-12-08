// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

final class e
{

    public final String a;
    public final Object b;

    e(String s, Object obj)
    {
        a = s;
        b = obj;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof e)
        {
            if (a.equals(((e) (obj = (e)obj)).a) && b.equals(((e) (obj)).b))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Integer[] {
            Integer.valueOf(a.hashCode()), Integer.valueOf(b.hashCode())
        });
    }

    public final String toString()
    {
        return (new StringBuilder("Key: ")).append(a).append(" value: ").append(b.toString()).toString();
    }
}
