// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//            uw

public abstract class uv
{

    private static final ExecutorService a = Executors.newFixedThreadPool(2, new uw((byte)0));

    public static ExecutorService a()
    {
        return a;
    }

}
