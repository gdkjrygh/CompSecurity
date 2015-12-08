// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.d.b;

import java.util.AbstractList;
import java.util.ArrayList;

public final class e extends AbstractList
{

    private final ArrayList a = new ArrayList(0);

    public e()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!super.equals(obj))
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (e)obj;
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((e) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((e) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final Object get(int i)
    {
        return a.get(i);
    }

    public final int hashCode()
    {
        int j = super.hashCode();
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return i + j * 31;
    }

    public final int size()
    {
        return a.size();
    }
}
