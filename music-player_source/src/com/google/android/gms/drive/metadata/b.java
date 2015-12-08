// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata;

import com.google.android.gms.internal.gt;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class b
{

    private final String a;
    private final Set b;
    private final int c;

    protected b(String s, int i)
    {
        a = (String)gt.a(s, "fieldName");
        b = Collections.singleton(s);
        c = i;
    }

    protected b(String s, Collection collection)
    {
        a = (String)gt.a(s, "fieldName");
        b = Collections.unmodifiableSet(new HashSet(collection));
        c = 0x3e8fa0;
    }

    public final String a()
    {
        return a;
    }

    public String toString()
    {
        return a;
    }
}
