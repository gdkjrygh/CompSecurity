// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.location.places.zzg;

public class zzp
    implements zzg
{

    private final String a;
    private final int b;
    private final int c;
    private final CharSequence d;
    private int e;

    public zzp(String s, int i, int j, CharSequence charsequence, int k)
    {
        a = s;
        b = i;
        c = j;
        d = charsequence;
        e = k;
    }

    public Object a()
    {
        return b();
    }

    public zzg b()
    {
        return this;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof zzp))
            {
                return false;
            }
            obj = (zzp)obj;
            if (((zzp) (obj)).b != b || ((zzp) (obj)).c != c || !zzt.a(((zzp) (obj)).a, a) || !zzt.a(((zzp) (obj)).d, d))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            Integer.valueOf(b), Integer.valueOf(c), a, d
        });
    }
}
