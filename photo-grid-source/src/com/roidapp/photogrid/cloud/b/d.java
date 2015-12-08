// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.b;

import java.util.List;
import java.util.Set;

public final class d
{

    public int a;
    public List b;
    public long c;
    public long d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public Set j;
    public Set k;

    public d()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (d)obj;
            if (a != ((d) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return a;
    }
}
