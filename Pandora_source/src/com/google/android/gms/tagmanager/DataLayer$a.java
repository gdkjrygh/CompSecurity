// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.tagmanager:
//            DataLayer

static final class b
{

    public final String a;
    public final Object b;

    public boolean equals(Object obj)
    {
        if (obj instanceof b)
        {
            if (a.equals(((a) (obj = (a)obj)).a) && b.equals(((b) (obj)).b))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Integer[] {
            Integer.valueOf(a.hashCode()), Integer.valueOf(b.hashCode())
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("Key: ").append(a).append(" value: ").append(b.toString()).toString();
    }

    (String s, Object obj)
    {
        a = s;
        b = obj;
    }
}
