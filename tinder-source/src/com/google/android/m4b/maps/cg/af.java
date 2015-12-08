// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import java.util.HashSet;
import java.util.Set;

public final class af
{
    public static interface a
    {

        public abstract void b();
    }


    final Set a = new HashSet();

    public af()
    {
    }

    public final void a(a a1)
    {
        a.add(a1);
    }

    public final void b(a a1)
    {
        a.remove(a1);
    }
}
