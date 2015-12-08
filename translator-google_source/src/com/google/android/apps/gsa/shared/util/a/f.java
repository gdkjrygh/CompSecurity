// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.a;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.t;
import java.util.Iterator;

final class f extends AbstractFuture
{

    ImmutableList a;

    f(ImmutableList immutablelist)
    {
        a = immutablelist;
    }

    protected final boolean a(Object obj)
    {
        return super.a(obj);
    }

    protected final boolean a(Throwable throwable)
    {
        return super.a(throwable);
    }

    public final boolean cancel(boolean flag)
    {
        if (super.cancel(flag))
        {
            for (com.google.common.collect.ej ej = a.iterator(); ej.hasNext(); ((t)ej.next()).cancel(flag)) { }
            a = null;
            return true;
        } else
        {
            return false;
        }
    }
}
