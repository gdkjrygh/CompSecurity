// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;


// Referenced classes of package com.fitbit.galileo.service:
//            GalileoSyncService_

class a extends org.androidannotations.a._cls2
{

    final com.fitbit.data.bl.ackerTaskTarget a;
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

    kTarget(GalileoSyncService_ galileosyncservice_, String s, int i, String s1, com.fitbit.data.bl.ackerTaskTarget ackertasktarget)
    {
        b = galileosyncservice_;
        a = ackertasktarget;
        super(s, i, s1);
    }
}
