// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.br;

import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.br:
//            b

public final class a extends b
{

    public final Object a;
    private final b c;

    public a(b b1, Object obj)
    {
        String s;
        if (obj != null)
        {
            s = obj.toString();
        } else
        {
            s = null;
        }
        super(s, true);
        j.a(obj);
        c = b1;
        a = obj;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (a)obj;
            if (!b.a(c, ((a) (obj)).c) || !a.equals(((a) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i;
        if (c != null)
        {
            i = c.hashCode();
        } else
        {
            i = 0;
        }
        return i * 31 + a.hashCode();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[KeyedLabelSource: ");
        if (c != null)
        {
            stringbuilder.append(c);
            stringbuilder.append(", ");
        }
        stringbuilder.append(a);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
