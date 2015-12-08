// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency.a;


// Referenced classes of package io.fabric.sdk.android.services.concurrency.a:
//            a

public final class c
    implements a
{

    private final long a = 1000L;
    private final int b = 8;

    public c()
    {
    }

    public final long a(int i)
    {
        return (long)((double)a * Math.pow(b, i));
    }
}
