// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.zzv;

public final class zzi
{
    private final class a extends Handler
    {

        final zzi a;

        public void handleMessage(Message message)
        {
            boolean flag = true;
            if (message.what != 1)
            {
                flag = false;
            }
            zzv.zzQ(flag);
            a.zzb((zzb)message.obj);
        }

        public a(Looper looper)
        {
            a = zzi.this;
            super(looper);
        }
    }

    public static interface zzb
    {

        public abstract void zzk(Object obj);

        public abstract void zzkJ();
    }


    private volatile Object mListener;
    private final a zzQQ;

    zzi(Looper looper, Object obj)
    {
        zzQQ = new a(looper);
        mListener = zzv.zzb(obj, "Listener must not be null");
    }

    public void clear()
    {
        mListener = null;
    }

    public void zza(zzb zzb1)
    {
        zzv.zzb(zzb1, "Notifier must not be null");
        zzb1 = zzQQ.obtainMessage(1, zzb1);
        zzQQ.sendMessage(zzb1);
    }

    void zzb(zzb zzb1)
    {
        Object obj = mListener;
        if (obj == null)
        {
            zzb1.zzkJ();
            return;
        }
        try
        {
            zzb1.zzk(obj);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            zzb1.zzkJ();
            throw runtimeexception;
        }
    }
}
