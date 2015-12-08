// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.internal.t;
import com.google.android.gms.location.places.d;
import java.util.Arrays;

public final class f
    implements d
{

    private final String a;
    private final int b;
    private final int c;
    private final CharSequence d;
    private int e;

    public f(String s, int i, int j, CharSequence charsequence, int k)
    {
        a = s;
        b = i;
        c = j;
        d = charsequence;
        e = k;
    }

    public final Object a()
    {
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof f))
            {
                return false;
            }
            obj = (f)obj;
            if (((f) (obj)).b != b || ((f) (obj)).c != c || !t.a(((f) (obj)).a, a) || !t.a(((f) (obj)).d, d))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c), a, d
        });
    }
}
