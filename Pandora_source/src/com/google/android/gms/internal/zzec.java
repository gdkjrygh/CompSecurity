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
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;

// Referenced classes of package com.google.android.gms.internal:
//            zzgd, zzgl, zzfl

public class zzec
    implements Runnable
{
    protected final class zza extends AsyncTask
    {

        private final WebView zzya;
        private Bitmap zzyb;
        final zzec zzyc;

        protected Object doInBackground(Object aobj[])
        {
            return zza((Void[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            zza((Boolean)obj);
        }

        protected void onPreExecute()
        {
            this;
            JVM INSTR monitorenter ;
            zzyb = Bitmap.createBitmap(zzec.zza(zzyc), com.google.android.gms.internal.zzec.zzb(zzyc), android.graphics.Bitmap.Config.ARGB_8888);
            zzya.setVisibility(0);
            zzya.measure(android.view.View.MeasureSpec.makeMeasureSpec(zzec.zza(zzyc), 0), android.view.View.MeasureSpec.makeMeasureSpec(com.google.android.gms.internal.zzec.zzb(zzyc), 0));
            zzya.layout(0, 0, zzec.zza(zzyc), com.google.android.gms.internal.zzec.zzb(zzyc));
            Canvas canvas = new Canvas(zzyb);
            zzya.draw(canvas);
            zzya.invalidate();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        protected transient Boolean zza(Void avoid[])
        {
            this;
            JVM INSTR monitorenter ;
            int i1;
            int j1;
            i1 = zzyb.getWidth();
            j1 = zzyb.getHeight();
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
            if (zzyb.getPixel(i, k) != 0)
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

        protected void zza(Boolean boolean1)
        {
            zzec.zzc(zzyc);
            if (boolean1.booleanValue() || zzyc.zzee() || zzec.zzd(zzyc) <= 0L)
            {
                zzyc.zzxZ = boolean1.booleanValue();
                zzec.zze(zzyc).zza(zzyc.zznp, true);
            } else
            if (zzec.zzd(zzyc) > 0L)
            {
                if (com.google.android.gms.ads.internal.util.client.zzb.zzC(2))
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaj("Ad not detected, scheduling another run.");
                }
                zzec.zzg(zzyc).postDelayed(zzyc, zzec.zzf(zzyc));
                return;
            }
        }

        public zza(WebView webview)
        {
            zzyc = zzec.this;
            super();
            zzya = webview;
        }
    }


    private final int zzma;
    private final int zzmb;
    protected final zzgd zznp;
    private final Handler zzxU;
    private final long zzxV;
    private long zzxW;
    private zzge.zza zzxX;
    protected boolean zzxY;
    protected boolean zzxZ;

    public zzec(zzge.zza zza1, zzgd zzgd1, int i, int j)
    {
        this(zza1, zzgd1, i, j, 200L, 50L);
    }

    public zzec(zzge.zza zza1, zzgd zzgd1, int i, int j, long l, long l1)
    {
        zzxV = l;
        zzxW = l1;
        zzxU = new Handler(Looper.getMainLooper());
        zznp = zzgd1;
        zzxX = zza1;
        zzxY = false;
        zzxZ = false;
        zzmb = j;
        zzma = i;
    }

    static int zza(zzec zzec1)
    {
        return zzec1.zzma;
    }

    static int zzb(zzec zzec1)
    {
        return zzec1.zzmb;
    }

    static long zzc(zzec zzec1)
    {
        long l = zzec1.zzxW - 1L;
        zzec1.zzxW = l;
        return l;
    }

    static long zzd(zzec zzec1)
    {
        return zzec1.zzxW;
    }

    static zzge.zza zze(zzec zzec1)
    {
        return zzec1.zzxX;
    }

    static long zzf(zzec zzec1)
    {
        return zzec1.zzxV;
    }

    static Handler zzg(zzec zzec1)
    {
        return zzec1.zzxU;
    }

    public void run()
    {
        if (zznp == null || zzee())
        {
            zzxX.zza(zznp, true);
            return;
        } else
        {
            (new zza(zznp.getWebView())).execute(new Void[0]);
            return;
        }
    }

    public void zza(AdResponseParcel adresponseparcel)
    {
        zza(adresponseparcel, new zzgl(this, zznp, adresponseparcel.zzzA));
    }

    public void zza(AdResponseParcel adresponseparcel, zzgl zzgl1)
    {
        zznp.setWebViewClient(zzgl1);
        zzgd zzgd1 = zznp;
        if (TextUtils.isEmpty(adresponseparcel.zzwB))
        {
            zzgl1 = null;
        } else
        {
            zzgl1 = zzh.zzaQ().zzad(adresponseparcel.zzwB);
        }
        zzgd1.loadDataWithBaseURL(zzgl1, adresponseparcel.zzzr, "text/html", "UTF-8", null);
    }

    public void zzec()
    {
        zzxU.postDelayed(this, zzxV);
    }

    public void zzed()
    {
        this;
        JVM INSTR monitorenter ;
        zzxY = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean zzee()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = zzxY;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean zzef()
    {
        return zzxZ;
    }
}
