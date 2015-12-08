// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.c.b:
//            bl

final class bm
    implements ThreadFactory
{

    bm()
    {
    }

    public final Thread newThread(Runnable runnable)
    {
        return new bl(runnable);
    }
}
