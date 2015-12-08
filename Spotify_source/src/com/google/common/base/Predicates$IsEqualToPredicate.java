// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import cua;
import java.io.Serializable;

class <init>
    implements cua, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Object target;

    public final boolean a(Object obj)
    {
        return target.equals(obj);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof target)
        {
            obj = (target)obj;
            return target.equals(((target) (obj)).target);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return target.hashCode();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(target));
        return (new StringBuilder(s.length() + 20)).append("Predicates.equalTo(").append(s).append(")").toString();
    }

    private (Object obj)
    {
        target = obj;
    }

    target(Object obj, byte byte0)
    {
        this(obj);
    }
}
