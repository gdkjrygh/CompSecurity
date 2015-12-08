// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            zzfz, zzhx

public final class zzvG extends AsyncTask
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
        zzvH = Bitmap.createBitmap(zzfz.zza(zzvI), zzfz.zzb(zzvI), android.graphics.nfig.ARGB_8888);
        zzvG.setVisibility(0);
        zzvG.measure(android.view.ureSpec.makeMeasureSpec(zzfz.zza(zzvI), 0), android.view.ureSpec.makeMeasureSpec(zzfz.zzb(zzvI), 0));
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

    public (zzfz zzfz1, WebView webview)
    {
        zzvI = zzfz1;
        super();
        zzvG = webview;
    }
}
