// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import com.aviary.android.feather.common.threading.ThreadPool;
import com.aviary.android.feather.common.threading.a;
import com.aviary.android.feather.common.threading.b;

// Referenced classes of package com.aviary.android.feather.library.services:
//            BaseContextService, IAviaryController

public class ThreadPoolService extends BaseContextService
{

    private final ThreadPool d = new ThreadPool(5, 19);

    public ThreadPoolService(IAviaryController iaviarycontroller)
    {
        super(iaviarycontroller);
    }

    public transient a a(com.aviary.android.feather.common.threading.ThreadPool.b b1, b b2, Object aobj[])
    {
        return d.a(b1, b2, aobj);
    }

    public void b()
    {
        d.a();
    }
}
