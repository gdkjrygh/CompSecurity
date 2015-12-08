// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.io.Serializable;

// Referenced classes of package com.google.android.m4b.maps.y:
//            k, l

static final class <init>
    implements k, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Object a;

    public final boolean a(Object obj)
    {
        return a.equals(obj);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof a)
        {
            obj = (a)obj;
            return a.equals(((a) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("Predicates.equalTo(")).append(a).append(")").toString();
    }

    private (Object obj)
    {
        a = obj;
    }

    a(Object obj, byte byte0)
    {
        this(obj);
    }
}
