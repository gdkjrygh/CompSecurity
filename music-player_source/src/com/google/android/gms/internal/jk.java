// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            je

public final class jk
{

    private static int a = 10000;
    private static int b = 1000;
    private final String c;
    private final int d;
    private final BlockingQueue e;

    public final void a(je je1)
    {
        je1.a(c);
        je1.a(d);
        e.offer(je1.a());
    }

}
