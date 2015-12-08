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
import com.google.android.gms.common.internal.bl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            oq, pa, id, il, 
//            ie, oh, ol, ip, 
//            is, pb, qa, ok, 
//            ot, mp, dm

public final class oj extends zzb
    implements oq
{

    private zzd l;
    private String m;
    private boolean n;
    private HashMap o;

    public oj(Context context, AdSizeParcel adsizeparcel, ip ip1, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, null, ip1, versioninfoparcel, null);
        o = new HashMap();
    }

    public final void a(RewardedVideoAdRequestParcel rewardedvideoadrequestparcel)
    {
        bl.b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(rewardedvideoadrequestparcel.zzqh))
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("Invalid ad unit id. Aborting.");
            return;
        } else
        {
            n = false;
            f.zzqh = rewardedvideoadrequestparcel.zzqh;
            super.zzb(rewardedvideoadrequestparcel.zzEn);
            return;
        }
    }

    public final void a(zzd zzd1)
    {
        bl.b("setRewardedVideoAdListener must be called on the main UI thread.");
        l = zzd1;
    }

    public final void a(RewardItemParcel rewarditemparcel)
    {
        zzp.zzbH();
        il.a(f.context, f.zzqj.zzJu, f.zzqo, f.zzqh, false, f.zzqo.l.j);
        if (l == null)
        {
            return;
        }
        try
        {
            if (f.zzqo != null && f.zzqo.o != null && !TextUtils.isEmpty(f.zzqo.o.h))
            {
                l.zza(new oh(f.zzqo.o.h, f.zzqo.o.i));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (RewardItemParcel rewarditemparcel)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onRewarded().", rewarditemparcel);
            return;
        }
        l.zza(new oh(rewarditemparcel.type, rewarditemparcel.zzHv));
        return;
    }

    public final void a(String s)
    {
        bl.b("setUserId must be called on the main UI thread.");
        m = s;
    }

    protected final boolean a(int i1)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaH((new StringBuilder("Failed to load ad: ")).append(i1).toString());
        if (l == null)
        {
            return false;
        }
        try
        {
            l.onRewardedVideoAdFailedToLoad(i1);
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdFailedToLoad().", remoteexception);
            return false;
        }
        return true;
    }

    public final ol b(String s)
    {
        Object obj;
        Object obj1;
        obj = (ol)o.get(s);
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        obj1 = new ol(j.a(s), this);
        o.put(s, obj1);
        return ((ol) (obj1));
        obj1;
_L2:
        com.google.android.gms.ads.internal.util.client.zzb.zzd((new StringBuilder("Fail to instantiate adapter ")).append(s).toString(), ((Throwable) (obj1)));
        return ((ol) (obj));
        Exception exception;
        exception;
        obj = obj1;
        obj1 = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void destroy()
    {
        Iterator iterator;
        bl.b("destroy must be called on the main UI thread.");
        iterator = o.keySet().iterator();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        ol ol1 = (ol)o.get(s);
        if (ol1 != null)
        {
            try
            {
                if (ol1.a() != null)
                {
                    ol1.a().c();
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaH((new StringBuilder("Fail to destroy adapter: ")).append(s).toString());
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void e()
    {
        bl.b("showAd must be called on the main UI thread.");
        if (!f())
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("The reward video has not loaded.");
        } else
        {
            n = true;
            ol ol1 = b(f.zzqo.n);
            if (ol1 != null && ol1.a() != null)
            {
                try
                {
                    ol1.a().f();
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

    public final boolean f()
    {
        bl.b("isLoaded must be called on the main UI thread.");
        return f.zzql == null && f.zzqm == null && f.zzqo != null && !n;
    }

    public final void g()
    {
        a(f.zzqo, false);
        if (l == null)
        {
            return;
        }
        try
        {
            l.onRewardedVideoAdOpened();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdOpened().", remoteexception);
        }
    }

    public final void h()
    {
        zzp.zzbH();
        il.a(f.context, f.zzqj.zzJu, f.zzqo, f.zzqh, false, f.zzqo.l.i);
        if (l == null)
        {
            return;
        }
        try
        {
            l.onRewardedVideoStarted();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onVideoStarted().", remoteexception);
        }
    }

    public final void i()
    {
        if (l == null)
        {
            return;
        }
        try
        {
            l.onRewardedVideoAdClosed();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdClosed().", remoteexception);
        }
    }

    public final void j()
    {
        onAdClicked();
    }

    public final void k()
    {
        if (l == null)
        {
            return;
        }
        try
        {
            l.onRewardedVideoAdLeftApplication();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdLeftApplication().", remoteexception);
        }
    }

    public final void pause()
    {
        Iterator iterator;
        bl.b("pause must be called on the main UI thread.");
        iterator = o.keySet().iterator();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        ol ol1 = (ol)o.get(s);
        if (ol1 != null)
        {
            try
            {
                if (ol1.a() != null)
                {
                    ol1.a().d();
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaH((new StringBuilder("Fail to pause adapter: ")).append(s).toString());
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void resume()
    {
        Iterator iterator;
        bl.b("resume must be called on the main UI thread.");
        iterator = o.keySet().iterator();
_L2:
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        ol ol1 = (ol)o.get(s);
        if (ol1 != null)
        {
            try
            {
                if (ol1.a() != null)
                {
                    ol1.a().e();
                }
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaH((new StringBuilder("Fail to resume adapter: ")).append(s).toString());
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void zza(pb pb1, dm dm)
    {
        if (pb1.e != -2)
        {
            qa.a.post(new ok(this, pb1));
            return;
        } else
        {
            f.zzqH = 0;
            f.zzqm = new ot(f.context, m, pb1, this);
            com.google.android.gms.ads.internal.util.client.zzb.zzaF((new StringBuilder("AdRenderer: ")).append(f.zzqm.getClass().getName()).toString());
            f.zzqm.zzfu();
            return;
        }
    }

    public final boolean zza(pa pa1, pa pa2)
    {
        if (l != null)
        {
            try
            {
                l.onRewardedVideoAdLoaded();
            }
            // Misplaced declaration of an exception variable
            catch (pa pa1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdLoaded().", pa1);
            }
        }
        return true;
    }
}
