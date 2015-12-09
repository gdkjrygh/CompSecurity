// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.bluetooth;


// Referenced classes of package com.fitbit.galileo.bluetooth:
//            GalileoTaskExecutor

class a
    implements Runnable
{

    final GalileoTaskExecutor a;

    public void run()
    {
        a.b();
        a.d();
    }

    (GalileoTaskExecutor galileotaskexecutor)
    {
        a = galileotaskexecutor;
        super();
    }
}
