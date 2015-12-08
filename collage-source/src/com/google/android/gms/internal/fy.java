// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            gd, gl, fz, dj, 
//            da, dg, db, fw, 
//            di, gw, gg, gs, 
//            bd

public class fy extends zzb
    implements gd
{

    private zzd a;
    private String b;
    private boolean c;
    private HashMap d;

    public fy(Context context, AdSizeParcel adsizeparcel, di di1, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, null, di1, versioninfoparcel, null);
        d = new HashMap();
    }

    public void a()
    {
        z.b("showAd must be called on the main UI thread.");
        if (!b())
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("The reward video has not loaded.");
        } else
        {
            c = true;
            fz fz1 = b(zzos.zzqg.n);
            if (fz1 != null && fz1.a() != null)
            {
                try
                {
                    fz1.a().f();
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call showVideo.", remoteexception);
                }
                return;
            }
        }
    }

    public void a(RewardedVideoAdRequestParcel rewardedvideoadrequestparcel)
    {
        z.b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(rewardedvideoadrequestparcel.zzpZ))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Invalid ad unit id. Aborting.");
            return;
        } else
        {
            c = false;
            zzos.zzpZ = rewardedvideoadrequestparcel.zzpZ;
            super.zza(rewardedvideoadrequestparcel.zzDy);
            return;
        }
    }

    public void a(zzd zzd1)
    {
        z.b("setRewardedVideoAdListener must be called on the main UI thread.");
        a = zzd1;
    }

    public void a(RewardItemParcel rewarditemparcel)
    {
        zzp.zzbJ().a(zzos.context, zzos.zzqb.zzIz, zzos.zzqg, zzos.zzpZ, false, zzos.zzqg.l.j);
        if (a == null)
        {
            return;
        }
        try
        {
            if (zzos.zzqg != null && zzos.zzqg.o != null && !TextUtils.isEmpty(zzos.zzqg.o.h))
            {
                a.zza(new fw(zzos.zzqg.o.h, zzos.zzqg.o.i));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (RewardItemParcel rewarditemparcel)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onRewarded().", rewarditemparcel);
            return;
        }
        a.zza(new fw(rewarditemparcel.type, rewarditemparcel.zzGE));
        return;
    }

    public void a(String s)
    {
        z.b("setUserId must be called on the main UI thread.");
        b = s;
    }

    public fz b(String s)
    {
        Object obj;
        Object obj1;
        obj = (fz)d.get(s);
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj1 = new fz(zzow.a(s), this);
        d.put(s, obj1);
        return ((fz) (obj1));
        obj1;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder()).append("Fail to instantiate adapter ").append(s).toString(), ((Throwable) (obj1)));
        return ((fz) (obj));
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean b()
    {
        z.b("isLoaded must be called on the main UI thread.");
        return zzos.zzqd == null && zzos.zzqe == null && zzos.zzqg != null && !c;
    }

    public void c()
    {
        zza(zzos.zzqg, false);
        if (a == null)
        {
            return;
        }
        try
        {
            a.onRewardedVideoAdOpened();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdOpened().", remoteexception);
        }
    }

    public void d()
    {
        zzp.zzbJ().a(zzos.context, zzos.zzqb.zzIz, zzos.zzqg, zzos.zzpZ, false, zzos.zzqg.l.i);
        if (a == null)
        {
            return;
        }
        try
        {
            a.onRewardedVideoStarted();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onVideoStarted().", remoteexception);
        }
    }

    public void destroy()
    {
        Iterator iterator;
        z.b("destroy must be called on the main UI thread.");
        iterator = d.keySet().iterator();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        fz fz1 = (fz)d.get(s);
        if (fz1 != null)
        {
            try
            {
                if (fz1.a() != null)
                {
                    fz1.a().c();
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Fail to destroy adapter: ").append(s).toString());
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void e()
    {
        if (a == null)
        {
            return;
        }
        try
        {
            a.onRewardedVideoAdClosed();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdClosed().", remoteexception);
        }
    }

    public void f()
    {
        onAdClicked();
    }

    public void g()
    {
        if (a == null)
        {
            return;
        }
        try
        {
            a.onRewardedVideoAdLeftApplication();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdLeftApplication().", remoteexception);
        }
    }

    public void pause()
    {
        Iterator iterator;
        z.b("pause must be called on the main UI thread.");
        iterator = d.keySet().iterator();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        fz fz1 = (fz)d.get(s);
        if (fz1 != null)
        {
            try
            {
                if (fz1.a() != null)
                {
                    fz1.a().d();
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Fail to pause adapter: ").append(s).toString());
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void resume()
    {
        Iterator iterator;
        z.b("resume must be called on the main UI thread.");
        iterator = d.keySet().iterator();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        fz fz1 = (fz)d.get(s);
        if (fz1 != null)
        {
            try
            {
                if (fz1.a() != null)
                {
                    fz1.a().e();
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Fail to resume adapter: ").append(s).toString());
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void zza(gl.a a1, bd bd)
    {
        if (a1.e != -2)
        {
            gw.a.post(new zzgx._cls1(this, a1));
            return;
        } else
        {
            zzos.zzqz = 0;
            zzos.zzqe = new gg(zzos.context, b, a1, this);
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("AdRenderer: ").append(zzos.zzqe.getClass().getName()).toString());
            zzos.zzqe.zzgn();
            return;
        }
    }

    public boolean zza(gl gl1, gl gl2)
    {
        if (a != null)
        {
            try
            {
                a.onRewardedVideoAdLoaded();
            }
            // Misplaced declaration of an exception variable
            catch (gl gl1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdLoaded().", gl1);
            }
        }
        return true;
    }

    protected boolean zze(int i)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Failed to load ad: ").append(i).toString());
        if (a == null)
        {
            return false;
        }
        try
        {
            a.onRewardedVideoAdFailedToLoad(i);
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdFailedToLoad().", remoteexception);
            return false;
        }
        return true;
    }
}
