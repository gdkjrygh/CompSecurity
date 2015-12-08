// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.gs;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.ix;
import com.google.android.gms.internal.k;
import com.google.android.gms.internal.n;
import com.google.android.gms.internal.zzbk;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzc, AdResponseParcel, AdRequestInfoParcel

public class zzb extends gs
    implements zzc.zza
{
    static final class zza extends Exception
    {

        private final int zzCI;

        public int getErrorCode()
        {
            return zzCI;
        }

        public zza(String s, int i)
        {
            super(s);
            zzCI = i;
        }
    }


    private final Context mContext;
    private final Object zzCE = new Object();
    AdResponseParcel zzCG;
    private final zza.zza zzDp;
    private final AdRequestInfoParcel.zza zzDq;
    gs zzDr;
    Object zzpc;
    private final n zzwh;
    db zzye;

    public zzb(Context context, AdRequestInfoParcel.zza zza1, n n1, zza.zza zza2)
    {
        zzpc = new Object();
        zzDp = zza2;
        mContext = context;
        zzDq = zza1;
        zzwh = n1;
    }

    public void onStop()
    {
        synchronized (zzCE)
        {
            if (zzDr != null)
            {
                zzDr.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    gs zzb(AdRequestInfoParcel adrequestinfoparcel)
    {
        return com.google.android.gms.ads.internal.request.zzc.zza(mContext, adrequestinfoparcel, this);
    }

    public void zzb(AdResponseParcel adresponseparcel)
    {
        synchronized (zzpc)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Received ad response.");
            zzCG = adresponseparcel;
            zzpc.notify();
        }
        return;
        adresponseparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adresponseparcel;
    }

    protected AdSizeParcel zzc(AdRequestInfoParcel adrequestinfoparcel)
        throws zza
    {
        if (zzCG.zzEa == null)
        {
            throw new zza("The ad response must specify one of the supported ad sizes.", 0);
        }
        Object aobj[] = zzCG.zzEa.split("x");
        if (aobj.length != 2)
        {
            throw new zza((new StringBuilder()).append("Invalid ad size format from the ad response: ").append(zzCG.zzEa).toString(), 0);
        }
        int i1;
        int j1;
        int k1;
        try
        {
            i1 = Integer.parseInt(aobj[0]);
            j1 = Integer.parseInt(aobj[1]);
        }
        // Misplaced declaration of an exception variable
        catch (AdRequestInfoParcel adrequestinfoparcel)
        {
            throw new zza((new StringBuilder()).append("Invalid ad size number from the ad response: ").append(zzCG.zzEa).toString(), 0);
        }
        aobj = adrequestinfoparcel.zzqf.zzsI;
        k1 = aobj.length;
        AdSizeParcel adsizeparcel;
        int j;
        int l;
        for (int i = 0; i < k1; i++)
        {
            adsizeparcel = aobj[i];
            float f = mContext.getResources().getDisplayMetrics().density;
            if (adsizeparcel.width == -1)
            {
                j = (int)((float)adsizeparcel.widthPixels / f);
            } else
            {
                j = adsizeparcel.width;
            }
            if (adsizeparcel.height == -2)
            {
                l = (int)((float)adsizeparcel.heightPixels / f);
            } else
            {
                l = adsizeparcel.height;
            }
            if (i1 == j && j1 == l)
            {
                return new AdSizeParcel(adsizeparcel, adrequestinfoparcel.zzqf.zzsI);
            }
        }

        throw new zza((new StringBuilder()).append("The ad size from the ad response was not one of the requested sizes: ").append(zzCG.zzEa).toString(), 0);
    }

    public void zzdG()
    {
        Object obj2 = zzpc;
        obj2;
        JVM INSTR monitorenter ;
        AdRequestInfoParcel adrequestinfoparcel;
        long l2;
        com.google.android.gms.ads.internal.util.client.zzb.zzaC("AdLoaderBackgroundTask started.");
        String s = zzwh.a().zzb(mContext);
        String s1 = zzm.zzq(mContext).getClientId();
        l2 = zzp.zzbB().b();
        adrequestinfoparcel = new AdRequestInfoParcel(zzDq, s, s1, l2);
        int i;
        long l;
        long l1;
        i = -2;
        l1 = -1L;
        l = l1;
        Object obj1 = zzb(adrequestinfoparcel);
        l = l1;
        Object obj = zzCE;
        l = l1;
        obj;
        JVM INSTR monitorenter ;
        zzDr = ((gs) (obj1));
        if (zzDr == null)
        {
            throw new zza("Could not start the ad request service.", 0);
        }
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        l = l1;
        throw exception;
        exception;
        obj = null;
_L12:
        i = exception.getErrorCode();
        if (i != 3 && i != -1) goto _L3; else goto _L2
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzaD(exception.getMessage());
_L9:
        if (zzCG != null) goto _L5; else goto _L4
_L4:
        zzCG = new AdResponseParcel(i);
_L10:
        gw.a.post(new Runnable() {

            final zzb zzDs;

            public void run()
            {
                zzDs.onStop();
            }

            
            {
                zzDs = zzb.this;
                super();
            }
        });
_L8:
        boolean flag = TextUtils.isEmpty(zzCG.zzEf);
        if (flag) goto _L7; else goto _L6
_L6:
        exception = new JSONObject(zzCG.zzEf);
_L11:
        obj = new com.google.android.gms.internal.gl.a(adrequestinfoparcel, zzCG, zzye, ((AdSizeParcel) (obj)), i, l, zzCG.zzEb, exception);
        zzDp.zza(((com.google.android.gms.internal.gl.a) (obj)));
        obj2;
        JVM INSTR monitorexit ;
        return;
_L1:
        obj;
        JVM INSTR monitorexit ;
        l = l1;
        zzi(l2);
        l = l1;
        l1 = zzp.zzbB().b();
        l = l1;
        zzfw();
        l = l1;
        if (adrequestinfoparcel.zzqf.zzsI == null)
        {
            break MISSING_BLOCK_LABEL_410;
        }
        l = l1;
        obj = zzc(adrequestinfoparcel);
_L13:
        zzw(zzCG.zzEh);
        l = l1;
          goto _L8
_L3:
        com.google.android.gms.ads.internal.util.client.zzb.zzaE(exception.getMessage());
          goto _L9
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        zzCG = new AdResponseParcel(i, zzCG.zzyA);
          goto _L10
        exception;
        com.google.android.gms.ads.internal.util.client.zzb.zzb("Error parsing the JSON for Active View.", exception);
_L7:
        exception = null;
          goto _L11
        exception;
        l = l1;
          goto _L12
        obj = null;
          goto _L13
    }

    protected boolean zze(long l)
        throws zza
    {
        l = 60000L - (zzp.zzbB().b() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            zzpc.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new zza("Ad request cancelled.", -1);
        }
        return true;
    }

    protected void zzfw()
        throws zza
    {
        if (zzCG.errorCode != -3)
        {
            if (TextUtils.isEmpty(zzCG.body))
            {
                throw new zza("No fill from ad server.", 3);
            }
            zzp.zzbA().a(mContext, zzCG.zzDG);
            if (zzCG.zzDX)
            {
                try
                {
                    zzye = new db(zzCG.body);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    throw new zza((new StringBuilder()).append("Could not parse mediation config: ").append(zzCG.body).toString(), 0);
                }
            }
        }
    }

    protected void zzi(long l)
        throws zza
    {
        do
        {
            if (!zze(l))
            {
                throw new zza("Timed out waiting for ad response.", 2);
            }
        } while (zzCG == null);
        synchronized (zzCE)
        {
            zzDr = null;
        }
        if (zzCG.errorCode != -2 && zzCG.errorCode != -3)
        {
            throw new zza((new StringBuilder()).append("There was a problem getting an ad response. ErrorCode: ").append(zzCG.errorCode).toString(), zzCG.errorCode);
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzw(boolean flag)
    {
        zzp.zzbA().a(flag);
        zzbk zzbk1 = zzp.zzbA().a(mContext);
        if (zzbk1 != null && !zzbk1.isAlive())
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("start fetching content...");
            zzbk1.a();
        }
    }
}
