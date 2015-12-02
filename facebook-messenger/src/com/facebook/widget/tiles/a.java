// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.tiles;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

public class a
{

    private final String a;
    private final int b;
    private final int c;

    public a(String s, int i, int j)
    {
        a = (String)Preconditions.checkNotNull(s);
        b = i;
        c = j;
    }

    public int a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (a)obj;
            return Objects.equal(a, ((a) (obj)).a);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
