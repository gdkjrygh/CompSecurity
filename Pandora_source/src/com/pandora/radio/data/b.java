// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import com.pandora.radio.util.i;
import java.io.Serializable;

public class b
    implements Serializable
{

    private final String a;
    private final String b;

    public b()
    {
        this(null, null);
    }

    public b(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public boolean c()
    {
        return !i.a(a) && !i.a(b);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (b)obj;
            if (a != ((b) (obj)).a)
            {
                return false;
            }
            if (b != ((b) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int k = 0;
        int j;
        if (a != null)
        {
            j = a.hashCode();
        } else
        {
            j = 0;
        }
        if (b != null)
        {
            k = b.hashCode();
        }
        return j * 31 + k;
    }

    public String toString()
    {
        return String.format("AdId{ creativeId: %s, lineId: %s}", new Object[] {
            a, b
        });
    }
}
