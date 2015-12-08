// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            zzic, zzij, zzgq, zzab, 
//            zzho, zzhx

public class zzfz
    implements Runnable
{
    public final class zza extends AsyncTask
    {

        private final WebView zzvG;
        private Bitmap zzvH;
        final zzfz zzvI;

        protected final Object doInBackground(Object aobj[])
        {
            return zza((Void[])aobj);
        }

        protected final void onPostExecute(Object obj)
        {
            zza((Boolean)obj);
        }

        protected final void onPreExecute()
        {
            this;
            JVM INSTR monitorenter ;
            zzvH = Bitmap.createBitmap(zzfz.zza(zzvI), zzfz.zzb(zzvI), android.graphics.Bitmap.Config.ARGB_8888);
            zzvG.setVisibility(0);
            zzvG.measure(android.view.View.MeasureSpec.makeMeasureSpec(zzfz.zza(zzvI), 0), android.view.View.MeasureSpec.makeMeasureSpec(zzfz.zzb(zzvI), 0));
            zzvG.layout(0, 0, zzfz.zza(zzvI), zzfz.zzb(zzvI));
            Canvas canvas = new Canvas(zzvH);
            zzvG.draw(canvas);
            zzvG.invalidate();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        protected final transient Boolean zza(Void avoid[])
        {
            this;
            JVM INSTR monitorenter ;
            int i1;
            int j1;
            i1 = zzvH.getWidth();
            j1 = zzvH.getHeight();
            if (i1 != 0 && j1 != 0) goto _L2; else goto _L1
_L1:
            avoid = Boolean.valueOf(false);
_L3:
            this;
            JVM INSTR monitorexit ;
            return avoid;
_L2:
            int i;
            int j;
            i = 0;
            j = 0;
_L4:
            int k;
            if (i < i1)
            {
                k = 0;
                break MISSING_BLOCK_LABEL_52;
            }
            boolean flag;
            if ((double)j / ((double)(i1 * j1) / 100D) > 0.10000000000000001D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            avoid = Boolean.valueOf(flag);
              goto _L3
            avoid;
            throw avoid;
            if (zzvH.getPixel(i, k) != 0)
            {
                l = j + 1;
            }
            k += 10;
            j = l;
            int l;
            if (k < j1)
            {
                l = j;
                break MISSING_BLOCK_LABEL_62;
            }
            i += 10;
              goto _L4
        }

        protected final void zza(Boolean boolean1)
        {
            zzfz.zzc(zzvI);
            if (boolean1.booleanValue() || zzvI.zzdE() || zzfz.zzd(zzvI) <= 0L)
            {
                zzvI.zzvF = boolean1.booleanValue();
                zzfz.zze(zzvI).zza(zzvI.zzmu, true);
            } else
            if (zzfz.zzd(zzvI) > 0L)
            {
                if (zzhx.zzA(2))
                {
                    zzhx.zzY("Ad not detected, scheduling another run.");
                }
                zzfz.zzg(zzvI).postDelayed(zzvI, zzfz.zzf(zzvI));
                return;
            }
        }

        public zza(WebView webview)
        {
            zzvI = zzfz.this;
            super();
            zzvG = webview;
        }
    }


    private final int zzli;
    private final int zzlj;
    protected final zzic zzmu;
    private final Handler zzvA;
    private final long zzvB;
    private long zzvC;
    private zzid.zza zzvD;
    protected boolean zzvE;
    protected boolean zzvF;

    public zzfz(zzid.zza zza1, zzic zzic1, int i, int j)
    {
        this(zza1, zzic1, i, j, 200L, 50L);
    }

    public zzfz(zzid.zza zza1, zzic zzic1, int i, int j, long l, long l1)
    {
        zzvB = l;
        zzvC = l1;
        zzvA = new Handler(Looper.getMainLooper());
        zzmu = zzic1;
        zzvD = zza1;
        zzvE = false;
        zzvF = false;
        zzlj = j;
        zzli = i;
    }

    static int zza(zzfz zzfz1)
    {
        return zzfz1.zzli;
    }

    static int zzb(zzfz zzfz1)
    {
        return zzfz1.zzlj;
    }

    static long zzc(zzfz zzfz1)
    {
        long l = zzfz1.zzvC - 1L;
        zzfz1.zzvC = l;
        return l;
    }

    static long zzd(zzfz zzfz1)
    {
        return zzfz1.zzvC;
    }

    static zzid.zza zze(zzfz zzfz1)
    {
        return zzfz1.zzvD;
    }

    static long zzf(zzfz zzfz1)
    {
        return zzfz1.zzvB;
    }

    static Handler zzg(zzfz zzfz1)
    {
        return zzfz1.zzvA;
    }

    public void run()
    {
        if (zzmu == null || zzdE())
        {
            zzvD.zza(zzmu, true);
            return;
        } else
        {
            (new zza(zzmu.getWebView())).execute(new Void[0]);
            return;
        }
    }

    public void zza(zzgq zzgq1)
    {
        zza(zzgq1, new zzij(this, zzmu, zzgq1.zzwP));
    }

    public void zza(zzgq zzgq1, zzij zzij1)
    {
        zzmu.setWebViewClient(zzij1);
        zzic zzic1 = zzmu;
        if (TextUtils.isEmpty(zzgq1.zzus))
        {
            zzij1 = null;
        } else
        {
            zzij1 = zzab.zzaM().zzS(zzgq1.zzus);
        }
        zzic1.loadDataWithBaseURL(zzij1, zzgq1.zzwG, "text/html", "UTF-8", null);
    }

    public void zzdC()
    {
        zzvA.postDelayed(this, zzvB);
    }

    public void zzdD()
    {
        this;
        JVM INSTR monitorenter ;
        zzvE = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean zzdE()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzvE;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean zzdF()
    {
        return zzvF;
    }
}
