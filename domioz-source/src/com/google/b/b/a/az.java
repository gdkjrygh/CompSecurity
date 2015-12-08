// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.am;
import com.google.b.c.a;
import com.google.b.k;

final class az
    implements am
{

    final Class a;
    final al b;

    az(Class class1, al al)
    {
        a = class1;
        b = al;
        super();
    }

    public final al a(k k, a a1)
    {
        if (a.isAssignableFrom(a1.getRawType()))
        {
            return b;
        } else
        {
            return null;
        }
    }

    public final String toString()
    {
        return (new StringBuilder("Factory[typeHierarchy=")).append(a.getName()).append(",adapter=").append(b).append("]").toString();
    }
}
