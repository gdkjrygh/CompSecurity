// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.a;

import org.c.b.c;
import org.c.d.k;

public abstract class a extends c
{

    public a(String s)
    {
        super(s);
    }

    public a(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof a))
            {
                return false;
            }
            obj = (a)obj;
            if (!getMessage().equals(((a) (obj)).getMessage()) || !k.nullSafeEquals(getCause(), ((a) (obj)).getCause()))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return getMessage().hashCode();
    }
}
