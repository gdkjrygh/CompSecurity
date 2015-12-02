// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import com.facebook.common.g.a;
import com.facebook.fbservice.service.ServiceException;
import com.google.common.base.Throwables;

public abstract class ac extends a
{

    public ac()
    {
    }

    protected abstract void a(ServiceException serviceexception);

    protected final void b(Throwable throwable)
    {
        if (throwable instanceof ServiceException)
        {
            a((ServiceException)throwable);
            return;
        } else
        {
            c(throwable);
            return;
        }
    }

    protected void c(Throwable throwable)
    {
        Throwables.propagate(throwable);
    }
}
