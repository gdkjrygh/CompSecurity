// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;

import java.util.concurrent.ThreadFactory;

final class a
    implements ThreadFactory
{

    final String a;

    public final Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, a);
    }

    (String s)
    {
        a = s;
        super();
    }
}
