// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import java.util.UUID;

// Referenced classes of package com.fitbit.galileo.service:
//            GalileoSyncService_

class a extends org.androidannotations.a._cls1
{

    final UUID a;
    final GalileoSyncService_ b;

    public void a()
    {
        try
        {
            GalileoSyncService_.a(b, a);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    (GalileoSyncService_ galileosyncservice_, String s, int i, String s1, UUID uuid)
    {
        b = galileosyncservice_;
        a = uuid;
        super(s, i, s1);
    }
}
