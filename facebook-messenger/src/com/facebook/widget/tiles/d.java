// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.tiles;

import com.google.common.base.Objects;

// Referenced classes of package com.facebook.widget.tiles:
//            a

public class d
{

    private final a a;
    private final int b;
    private final int c;
    private final int d;

    public d(a a1, int i, int j, int k)
    {
        a = a1;
        b = i;
        c = j;
        d = k;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (d)obj;
            if (b != ((d) (obj)).b)
            {
                return false;
            }
            if (c != ((d) (obj)).c)
            {
                return false;
            }
            if (d != ((d) (obj)).d)
            {
                return false;
            }
            if (!Objects.equal(a, ((d) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((a.hashCode() * 31 + b) * 31 + c) * 31 + d;
    }
}
