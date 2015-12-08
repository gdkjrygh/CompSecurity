// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;


public final class h
{

    private Object a;
    private Object b;

    public h(Object obj, Object obj1)
    {
        a = obj;
        b = obj1;
    }

    public final Object a()
    {
        return a;
    }

    public final Object b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (h)obj;
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((h) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((h) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }
}
