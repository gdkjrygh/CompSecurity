// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import com.google.common.base.Throwables;
import com.google.common.d.a.f;

final class b
    implements f
{

    b()
    {
    }

    public void a(Throwable throwable)
    {
        throw Throwables.propagate(throwable);
    }
}
