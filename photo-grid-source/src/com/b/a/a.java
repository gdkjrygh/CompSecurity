// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import a.a.a.a.p;
import a.a.a.a.q;
import com.b.a.b.e;
import com.b.a.c.h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public final class a extends p
    implements q
{

    public final com.b.a.a.a a;
    public final e b;
    public final h c;
    public final Collection d;

    public a()
    {
        this(new com.b.a.a.a(), new e(), new h());
    }

    a(com.b.a.a.a a1, e e1, h h1)
    {
        a = a1;
        b = e1;
        c = h1;
        d = Collections.unmodifiableCollection(Arrays.asList(new p[] {
            a1, e1, h1
        }));
    }

    public final String a()
    {
        return "2.5.2.79";
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public final Collection c()
    {
        return d;
    }

    protected final volatile Object d()
    {
        return null;
    }
}
