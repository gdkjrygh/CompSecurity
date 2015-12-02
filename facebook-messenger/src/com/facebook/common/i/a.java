// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.i;

import java.util.LinkedList;

public abstract class a
{

    private LinkedList a;

    public a()
    {
    }

    protected abstract void a();

    protected abstract boolean b();

    public final boolean c()
    {
        return !b() && (a == null || a.isEmpty());
    }

    LinkedList d()
    {
        return a;
    }
}
