// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzar, zzbf, zzat, zzct

class zzas extends Thread
    implements zzar
{

    private static zzas zzayL;
    private volatile boolean mClosed;
    private final Context mContext;
    private volatile boolean zzCK;
    private final LinkedBlockingQueue zzayK = new LinkedBlockingQueue();
    private volatile zzat zzayM;

    private zzas(Context context)
    {
        super("GAThread");
        zzCK = false;
        mClosed = false;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        start();
    }

    static zzat zza(zzas zzas1)
    {
        return zzas1.zzayM;
    }

    static zzat zza(zzas zzas1, zzat zzat)
    {
        zzas1.zzayM = zzat;
        return zzat;
    }

    static zzas zzam(Context context)
    {
        if (zzayL == null)
        {
            zzayL = new zzas(context);
        }
        return zzayL;
    }

    static Context zzb(zzas zzas1)
    {
        return zzas1.mContext;
    }

    private String zzf(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    public void run()
    {
_L2:
        if (mClosed)
        {
            break; /* Loop/switch isn't completed */
        }
        Runnable runnable = (Runnable)zzayK.take();
        if (!zzCK)
        {
            runnable.run();
        }
        continue; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        try
        {
            zzbf.zzaa(interruptedexception.toString());
        }
        catch (Throwable throwable)
        {
            zzbf.zzZ((new StringBuilder("Error on Google TagManager Thread: ")).append(zzf(throwable)).toString());
            zzbf.zzZ("Google TagManager is shutting down.");
            zzCK = true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void zzc(Runnable runnable)
    {
        zzayK.add(runnable);
    }

    void zzd(String s, long l)
    {
        zzc(new Runnable(this, l, s) {

            final zzar zzayN;
            final long zzayO;
            final zzas zzayP;
            final String zzzC;

            public void run()
            {
                if (zzas.zza(zzayP) == null)
                {
                    zzct zzct1 = zzct.zztR();
                    zzct1.zza(zzas.zzb(zzayP), zzayN);
                    zzas.zza(zzayP, zzct1.zztS());
                }
                zzas.zza(zzayP).zzf(zzayO, zzzC);
            }

            
            {
                zzayP = zzas.this;
                zzayN = zzar1;
                zzayO = l;
                zzzC = s;
                super();
            }
        });
    }

    public void zzdb(String s)
    {
        zzd(s, System.currentTimeMillis());
    }
}
