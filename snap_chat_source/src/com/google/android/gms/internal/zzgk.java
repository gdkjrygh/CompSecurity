// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl, zzgl, zzgq, zzgo, 
//            zzba, zzhx, zzab, zzlv, 
//            zzhg, zzdk, zzk, zzg, 
//            zzz, zzhw, zzan

public class zzgk extends zzhl
    implements zzgl.zza
{
    static final class zza extends Exception
    {

        private final int zzvR;

        public final int getErrorCode()
        {
            return zzvR;
        }

        public zza(String s, int i)
        {
            super(s);
            zzvR = i;
        }
    }


    private final Context mContext;
    Object zznh;
    zzdk zzsf;
    private final Object zzvM = new Object();
    zzgq zzvO;
    private final zzgj.zza zzwe;
    private final zzgo.zza zzwf;
    private final zzk zzwg;
    zzhl zzwh;

    public zzgk(Context context, zzgo.zza zza1, zzk zzk1, zzgj.zza zza2)
    {
        zznh = new Object();
        zzwe = zza2;
        mContext = context;
        zzwf = zza1;
        zzwg = zzk1;
    }

    static zzgj.zza zza(zzgk zzgk1)
    {
        return zzgk1.zzwe;
    }

    public void onStop()
    {
        synchronized (zzvM)
        {
            if (zzwh != null)
            {
                zzwh.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    zzhl zza(zzgo zzgo1)
    {
        return zzgl.zza(mContext, zzgo1, this);
    }

    protected zzba zzb(zzgo zzgo1)
    {
        if (zzvO.zzwL == null)
        {
            throw new zza("The ad response must specify one of the supported ad sizes.", 0);
        }
        Object aobj[] = zzvO.zzwL.split("x");
        if (aobj.length != 2)
        {
            throw new zza((new StringBuilder("Invalid ad size format from the ad response: ")).append(zzvO.zzwL).toString(), 0);
        }
        int l;
        int i1;
        int j1;
        try
        {
            l = Integer.parseInt(aobj[0]);
            i1 = Integer.parseInt(aobj[1]);
        }
        // Misplaced declaration of an exception variable
        catch (zzgo zzgo1)
        {
            throw new zza((new StringBuilder("Invalid ad size number from the ad response: ")).append(zzvO.zzwL).toString(), 0);
        }
        aobj = zzgo1.zzlV.zzpc;
        j1 = aobj.length;
        zzba zzba1;
        int j;
        int k;
        for (int i = 0; i < j1; i++)
        {
            zzba1 = aobj[i];
            float f = mContext.getResources().getDisplayMetrics().density;
            if (zzba1.width == -1)
            {
                j = (int)((float)zzba1.widthPixels / f);
            } else
            {
                j = zzba1.width;
            }
            if (zzba1.height == -2)
            {
                k = (int)((float)zzba1.heightPixels / f);
            } else
            {
                k = zzba1.height;
            }
            if (l == j && i1 == k)
            {
                return new zzba(zzba1, zzgo1.zzlV.zzpc);
            }
        }

        throw new zza((new StringBuilder("The ad size from the ad response was not one of the requested sizes: ")).append(zzvO.zzwL).toString(), 0);
    }

    public void zzb(zzgq zzgq1)
    {
        synchronized (zznh)
        {
            zzhx.zzY("Received ad response.");
            zzvO = zzgq1;
            zznh.notify();
        }
        return;
        zzgq1;
        obj;
        JVM INSTR monitorexit ;
        throw zzgq1;
    }

    protected boolean zzd(long l)
    {
        l = 60000L - (zzab.zzaQ().elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            zznh.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new zza("Ad request cancelled.", -1);
        }
        return true;
    }

    protected void zzdI()
    {
        if (zzvO.errorCode != -3)
        {
            if (TextUtils.isEmpty(zzvO.zzwG))
            {
                throw new zza("No fill from ad server.", 3);
            }
            zzab.zzaP().zza(mContext, zzvO.zzwv);
            if (zzvO.zzwI)
            {
                try
                {
                    zzsf = new zzdk(zzvO.zzwG);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    throw new zza((new StringBuilder("Could not parse mediation config: ")).append(zzvO.zzwG).toString(), 0);
                }
            }
        }
    }

    public void zzdw()
    {
        Object obj2 = zznh;
        obj2;
        JVM INSTR monitorenter ;
        zzgo zzgo1;
        zzhx.zzY("AdLoaderBackgroundTask started.");
        String s = zzwg.zzC().zza(mContext);
        String s1 = zzz.zzj(mContext).getClientId();
        zzgo1 = new zzgo(zzwf, s, s1);
        int i;
        long l;
        long l1;
        i = -2;
        l1 = -1L;
        l = l1;
        long l2 = zzab.zzaQ().elapsedRealtime();
        l = l1;
        Object obj1 = zza(zzgo1);
        l = l1;
        Object obj = zzvM;
        l = l1;
        obj;
        JVM INSTR monitorenter ;
        zzwh = ((zzhl) (obj1));
        if (zzwh == null)
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
        zzhx.zzaa(exception.getMessage());
_L9:
        if (zzvO != null) goto _L5; else goto _L4
_L4:
        zzvO = new zzgq(i);
_L10:
        zzhw.zzzG.post(new Runnable() {

            final zzgk zzwi;

            public void run()
            {
                zzwi.onStop();
            }

            
            {
                zzwi = zzgk.this;
                super();
            }
        });
_L8:
        boolean flag = TextUtils.isEmpty(zzvO.zzwQ);
        if (flag) goto _L7; else goto _L6
_L6:
        exception = new JSONObject(zzvO.zzwQ);
_L11:
        obj = new zzhe.zza(zzgo1, zzvO, zzsf, ((zzba) (obj)), i, l, zzvO.zzwM, exception);
        zzhw.zzzG.post(new Runnable(((zzhe.zza) (obj))) {

            final zzgk zzwi;
            final zzhe.zza zzwj;

            public void run()
            {
                synchronized (zzwi.zznh)
                {
                    zzgk.zza(zzwi).zza(zzwj);
                }
                return;
                exception1;
                obj3;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                zzwi = zzgk.this;
                zzwj = zza1;
                super();
            }
        });
        obj2;
        JVM INSTR monitorexit ;
        return;
_L1:
        obj;
        JVM INSTR monitorexit ;
        l = l1;
        zzh(l2);
        l = l1;
        l1 = zzab.zzaQ().elapsedRealtime();
        l = l1;
        zzdI();
        l = l1;
        if (zzgo1.zzlV.zzpc == null)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        l = l1;
        obj = zzb(zzgo1);
_L13:
        zzv(zzvO.zzwT);
        l = l1;
          goto _L8
_L3:
        zzhx.zzac(exception.getMessage());
          goto _L9
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L5:
        zzvO = new zzgq(i, zzvO.zzsx);
          goto _L10
        exception;
        zzhx.zzb("Error parsing the JSON for Active View.", exception);
_L7:
        exception = null;
          goto _L11
        exception;
        l = l1;
          goto _L12
        obj = null;
          goto _L13
    }

    protected void zzh(long l)
    {
        do
        {
            if (!zzd(l))
            {
                throw new zza("Timed out waiting for ad response.", 2);
            }
        } while (zzvO == null);
        synchronized (zzvM)
        {
            zzwh = null;
        }
        if (zzvO.errorCode != -2 && zzvO.errorCode != -3)
        {
            throw new zza((new StringBuilder("There was a problem getting an ad response. ErrorCode: ")).append(zzvO.errorCode).toString(), zzvO.errorCode);
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzv(boolean flag)
    {
        zzab.zzaP().zzz(flag);
        zzan zzan1 = zzab.zzaP().zzo(mContext);
        if (zzan1 != null && !zzan1.isAlive())
        {
            zzhx.zzY("start fetching content...");
            zzan1.zzbt();
        }
    }
}
