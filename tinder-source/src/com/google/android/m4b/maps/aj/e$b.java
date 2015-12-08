// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aj;

import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.m4b.maps.aj:
//            e

static final class a extends a
{

    private final Throwable a;

    public final Object get()
    {
        throw new ExecutionException(a);
    }

    tion(Throwable throwable)
    {
        super((byte)0);
        a = throwable;
    }
}
