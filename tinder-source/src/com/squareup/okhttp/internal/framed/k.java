// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.util.concurrent.CountDownLatch;

public final class k
{

    final CountDownLatch a = new CountDownLatch(1);
    long b;
    long c;

    k()
    {
        b = -1L;
        c = -1L;
    }
}
