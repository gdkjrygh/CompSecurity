// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import android.content.Context;
import com.microsoft.onlineid.internal.e.f;
import java.util.Date;

public final class c
{

    private final f a;

    public c(Context context)
    {
        a = new f(context);
    }

    public final Date a()
    {
        return new Date((new Date()).getTime() - a.c());
    }

    public final void a(long l)
    {
        long l1 = (new Date()).getTime();
        a.a(l1 - l);
    }

    public final long b()
    {
        return a.c();
    }
}
