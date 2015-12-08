// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class zzcm
    implements zzo.zzf
{

    private final Context mContext;
    private final String zzaxw;
    private final ExecutorService zzazT = Executors.newSingleThreadExecutor();

    zzcm(Context context, String s)
    {
        mContext = context;
        zzaxw = s;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        zzazT.shutdown();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
