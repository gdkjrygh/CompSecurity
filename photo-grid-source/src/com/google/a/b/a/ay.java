// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.an;
import com.google.a.c.a;
import com.google.a.k;

final class ay
    implements an
{

    final Class a;
    final am b;

    ay(Class class1, am am)
    {
        a = class1;
        b = am;
        super();
    }

    public final am a(k k, a a1)
    {
        if (a.isAssignableFrom(a1.a()))
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
