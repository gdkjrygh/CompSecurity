// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import bka;
import chq;
import cit;
import ciu;
import cjc;
import cjj;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public abstract class zzgf extends cjc
{

    chq a;
    public final Context b;
    protected final Object c = new Object();
    public final Object d = new Object();
    public final ciu e;
    public AdResponseParcel f;

    public zzgf(Context context, ciu ciu1, chq chq)
    {
        super((byte)0);
        b = context;
        e = ciu1;
        f = ciu1.b;
        a = chq;
    }

    public abstract cit a(int i);

    public final void a()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        int i;
        bka.a("AdRendererBackgroundTask started.");
        i = e.e;
        a(SystemClock.elapsedRealtime());
_L3:
        cit cit = a(i);
        cjj.a.post(new Runnable(cit) {

            private cit a;
            private zzgf b;

            public final void run()
            {
                synchronized (b.c)
                {
                    zzgf zzgf1 = b;
                    cit cit1 = a;
                    zzgf1.a.b(cit1);
                }
                return;
                exception;
                obj2;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = zzgf.this;
                a = cit;
                super();
            }
        });
        return;
        Object obj1;
        obj1;
        i = ((zza) (obj1)).zzDv;
        if (i != 3 && i != -1) goto _L2; else goto _L1
_L1:
        bka.c(((zza) (obj1)).getMessage());
_L4:
        if (f != null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        f = new AdResponseParcel(i);
_L5:
        cjj.a.post(new Runnable() {

            private zzgf a;

            public final void run()
            {
                a.b();
            }

            
            {
                a = zzgf.this;
                super();
            }
        });
          goto _L3
_L2:
        bka.e(((zza) (obj1)).getMessage());
          goto _L4
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        f = new AdResponseParcel(i, f.k);
          goto _L5
    }

    public abstract void a(long l);

    public void b()
    {
    }

    private class zza extends Exception
    {

        final int zzDv;

        public zza(String s, int i)
        {
            super(s);
            zzDv = i;
        }
    }

}
