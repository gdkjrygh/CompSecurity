// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.client;

import android.app.PendingIntent;
import junit.framework.Assert;

public final class f
{

    private Object a;
    private PendingIntent b;

    public f()
    {
    }

    public final f a(PendingIntent pendingintent)
    {
        b = pendingintent;
        Assert.assertNull(a);
        return this;
    }

    public final f a(Object obj)
    {
        a = obj;
        Assert.assertNull(b);
        return this;
    }

    public final boolean a()
    {
        return b == null;
    }

    public final boolean b()
    {
        return b != null;
    }

    public final Object c()
    {
        return a;
    }

    public final PendingIntent d()
    {
        return b;
    }
}
