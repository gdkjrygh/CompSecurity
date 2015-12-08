// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzd

public abstract class zzc extends zzd
{
    private class a
        implements Runnable
    {

        final zzc a;

        public void run()
        {
            a.zzNt = false;
            long l = SystemClock.elapsedRealtime();
            boolean flag = a.zzx(l);
            a.zzM(flag);
        }

        private a()
        {
            a = zzc.this;
            super();
        }

    }


    protected final Handler mHandler = new Handler(Looper.getMainLooper());
    protected final long zzNr;
    protected final Runnable zzNs = new a();
    protected boolean zzNt;

    public zzc(String s, String s1, String s2, long l)
    {
        super(s, s1, s2);
        zzNr = l;
        zzM(false);
    }

    protected final void zzM(boolean flag)
    {
label0:
        {
            if (zzNt != flag)
            {
                zzNt = flag;
                if (!flag)
                {
                    break label0;
                }
                mHandler.postDelayed(zzNs, zzNr);
            }
            return;
        }
        mHandler.removeCallbacks(zzNs);
    }

    public void zzjW()
    {
        zzM(false);
    }

    protected abstract boolean zzx(long l);
}
