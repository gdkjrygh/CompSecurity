// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.bluetooth;

import java.util.UUID;

// Referenced classes of package com.fitbit.galileo.bluetooth:
//            h, GalileoTaskExecutor, f

class dName extends h
{

    final GalileoTaskExecutor a;

    protected void a(UUID uuid)
    {
        if (uuid.equals(GalileoTaskExecutor.a(a).i()))
        {
            a.j();
        }
    }

    protected void b(UUID uuid)
    {
        if (uuid.equals(GalileoTaskExecutor.a(a).i()))
        {
            GalileoTaskExecutor.b(a);
            a.c();
            a.d();
        }
    }

    protected void c(UUID uuid)
    {
        if (uuid.equals(GalileoTaskExecutor.a(a).i()))
        {
            GalileoTaskExecutor.b(a);
            a.a();
            a.d();
        }
    }

    protected void d(UUID uuid)
    {
        if (uuid.equals(GalileoTaskExecutor.a(a).i()))
        {
            GalileoTaskExecutor.b(a);
            a.b();
            a.d();
        }
    }

    protected void e(UUID uuid)
    {
        if (uuid.equals(GalileoTaskExecutor.a(a).i()))
        {
            a.d();
        }
    }

    dName(GalileoTaskExecutor galileotaskexecutor, com.fitbit.util.threading.readName readname)
    {
        a = galileotaskexecutor;
        super(readname);
    }
}
