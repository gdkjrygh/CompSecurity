// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class cfq extends cfb
{

    private final bkz a;
    private cfr b;

    public cfq(bkz bkz1)
    {
        a = bkz1;
    }

    private Bundle a(String s, int i1, String s1)
    {
        Bundle bundle;
        bka.e((new StringBuilder("Server parameters: ")).append(s).toString());
        Iterator iterator;
        String s2;
        try
        {
            bundle = new Bundle();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bka.c("Could not get Server Parameters Bundle.", s);
            throw new RemoteException();
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        s = new JSONObject(s);
        bundle = new Bundle();
        for (iterator = s.keys(); iterator.hasNext(); bundle.putString(s2, s.getString(s2)))
        {
            s2 = (String)iterator.next();
        }

        if (a instanceof ayk)
        {
            bundle.putString("adJson", s1);
            bundle.putInt("tagForChildDirectedTreatment", i1);
        }
        return bundle;
    }

    public final byb a()
    {
        if (!(a instanceof bla))
        {
            bka.e((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        byb byb;
        try
        {
            byb = bye.a(((bla)a).d());
        }
        catch (Throwable throwable)
        {
            bka.c("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return byb;
    }

    public final void a(byb byb, AdRequestParcel adrequestparcel, String s, bju bju, String s1)
    {
        bju = null;
        if (!(a instanceof bll))
        {
            bka.e((new StringBuilder("MediationAdapter is not a MediationRewardedVideoAdAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        bka.a("Initialize rewarded video adapter.");
        bll bll1 = (bll)a;
        if (adrequestparcel.e == null) goto _L2; else goto _L1
_L1:
        s = new HashSet(adrequestparcel.e);
_L4:
        if (adrequestparcel.b != -1L)
        {
            try
            {
                bju = new Date(adrequestparcel.b);
            }
            // Misplaced declaration of an exception variable
            catch (byb byb)
            {
                bka.c("Could not initialize rewarded video adapter.", byb);
                throw new RemoteException();
            }
        }
        new cfp(bju, adrequestparcel.d, s, adrequestparcel.k, adrequestparcel.f, adrequestparcel.g);
        if (adrequestparcel.m != null)
        {
            adrequestparcel.m.getBundle(bll1.getClass().getName());
        }
        bye.a(byb);
        new bjx();
        a(s1, adrequestparcel.g, null);
        return;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(byb byb, AdRequestParcel adrequestparcel, String s, cfd cfd)
    {
        a(byb, adrequestparcel, s, ((String) (null)), cfd);
    }

    public final void a(byb byb, AdRequestParcel adrequestparcel, String s, String s1, cfd cfd)
    {
        if (!(a instanceof blc))
        {
            bka.e((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        bka.a("Requesting interstitial ad from adapter.");
        blc blc1 = (blc)a;
        if (adrequestparcel.e == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.e);
_L5:
        Object obj1;
        if (adrequestparcel.b == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.b);
            }
            // Misplaced declaration of an exception variable
            catch (byb byb)
            {
                bka.c("Could not request interstitial ad from adapter.", byb);
                throw new RemoteException();
            }
        }
        obj1 = new cfp(((Date) (obj1)), adrequestparcel.d, ((java.util.Set) (obj)), adrequestparcel.k, adrequestparcel.f, adrequestparcel.g);
        if (adrequestparcel.m == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        obj = adrequestparcel.m.getBundle(blc1.getClass().getName());
_L3:
        blc1.a((Context)bye.a(byb), new cfr(cfd), a(s, adrequestparcel.g, s1), ((bky) (obj1)), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(byb byb, AdRequestParcel adrequestparcel, String s, String s1, cfd cfd, NativeAdOptionsParcel nativeadoptionsparcel, List list)
    {
        if (!(a instanceof ble))
        {
            bka.e((new StringBuilder("MediationAdapter is not a MediationNativeAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        ble ble1 = (ble)a;
        if (adrequestparcel.e == null) goto _L2; else goto _L1
_L1:
        HashSet hashset = new HashSet(adrequestparcel.e);
_L5:
        Date date;
        if (adrequestparcel.b == -1L)
        {
            date = null;
        } else
        {
            try
            {
                date = new Date(adrequestparcel.b);
            }
            // Misplaced declaration of an exception variable
            catch (byb byb)
            {
                bka.c("Could not request interstitial ad from adapter.", byb);
                throw new RemoteException();
            }
        }
        list = new cfu(date, adrequestparcel.d, hashset, adrequestparcel.k, adrequestparcel.f, adrequestparcel.g, nativeadoptionsparcel, list);
        if (adrequestparcel.m == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        nativeadoptionsparcel = adrequestparcel.m.getBundle(ble1.getClass().getName());
_L3:
        b = new cfr(cfd);
        ble1.a((Context)bye.a(byb), b, a(s, adrequestparcel.g, s1), list, nativeadoptionsparcel);
        return;
        nativeadoptionsparcel = null;
          goto _L3
_L2:
        hashset = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(byb byb, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, cfd cfd)
    {
        a(byb, adsizeparcel, adrequestparcel, s, null, cfd);
    }

    public final void a(byb byb, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, cfd cfd)
    {
        if (!(a instanceof bla))
        {
            bka.e((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        bka.a("Requesting banner ad from adapter.");
        bla bla1 = (bla)a;
        if (adrequestparcel.e == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.e);
_L5:
        Object obj1;
        if (adrequestparcel.b == -1L)
        {
            obj1 = null;
        } else
        {
            try
            {
                obj1 = new Date(adrequestparcel.b);
            }
            // Misplaced declaration of an exception variable
            catch (byb byb)
            {
                bka.c("Could not request banner ad from adapter.", byb);
                throw new RemoteException();
            }
        }
        obj1 = new cfp(((Date) (obj1)), adrequestparcel.d, ((java.util.Set) (obj)), adrequestparcel.k, adrequestparcel.f, adrequestparcel.g);
        if (adrequestparcel.m == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        obj = adrequestparcel.m.getBundle(bla1.getClass().getName());
_L3:
        bla1.a((Context)bye.a(byb), new cfr(cfd), a(s, adrequestparcel.g, s1), bln.a(adsizeparcel.f, adsizeparcel.c, adsizeparcel.b), ((bky) (obj1)), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(AdRequestParcel adrequestparcel, String s)
    {
        Date date;
        date = null;
        if (!(a instanceof bll))
        {
            bka.e((new StringBuilder("MediationAdapter is not a MediationRewardedVideoAdAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        bka.a("Requesting rewarded video ad from adapter.");
        bll bll1 = (bll)a;
        if (adrequestparcel.e == null) goto _L2; else goto _L1
_L1:
        HashSet hashset = new HashSet(adrequestparcel.e);
_L4:
        if (adrequestparcel.b != -1L)
        {
            try
            {
                date = new Date(adrequestparcel.b);
            }
            // Misplaced declaration of an exception variable
            catch (AdRequestParcel adrequestparcel)
            {
                bka.c("Could not load rewarded video ad from adapter.", adrequestparcel);
                throw new RemoteException();
            }
        }
        new cfp(date, adrequestparcel.d, hashset, adrequestparcel.k, adrequestparcel.f, adrequestparcel.g);
        if (adrequestparcel.m != null)
        {
            adrequestparcel.m.getBundle(bll1.getClass().getName());
        }
        a(s, adrequestparcel.g, null);
        return;
_L2:
        hashset = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        if (!(a instanceof blc))
        {
            bka.e((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        bka.a("Showing interstitial from adapter.");
        try
        {
            ((blc)a).e();
            return;
        }
        catch (Throwable throwable)
        {
            bka.c("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final void c()
    {
        try
        {
            a.a();
            return;
        }
        catch (Throwable throwable)
        {
            bka.c("Could not destroy adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final void d()
    {
        try
        {
            a.b();
            return;
        }
        catch (Throwable throwable)
        {
            bka.c("Could not pause adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final void e()
    {
        try
        {
            a.c();
            return;
        }
        catch (Throwable throwable)
        {
            bka.c("Could not resume adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final void f()
    {
        if (!(a instanceof bll))
        {
            bka.e((new StringBuilder("MediationAdapter is not a MediationRewardedVideoAdAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        } else
        {
            bka.a("Show rewarded video ad from adapter.");
            return;
        }
    }

    public final boolean g()
    {
        if (!(a instanceof bll))
        {
            bka.e((new StringBuilder("MediationAdapter is not a MediationRewardedVideoAdAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        bka.a("Check if adapter is initialized.");
        boolean flag;
        try
        {
            flag = ((bll)a).d();
        }
        catch (Throwable throwable)
        {
            bka.c("Could not check if adapter is initialized.", throwable);
            throw new RemoteException();
        }
        return flag;
    }

    public final cfj h()
    {
        blg blg = b.a;
        if (blg instanceof blh)
        {
            return new cfs((blh)blg);
        } else
        {
            return null;
        }
    }

    public final cfm i()
    {
        blg blg = b.a;
        if (blg instanceof bli)
        {
            return new cft((bli)blg);
        } else
        {
            return null;
        }
    }

    public final Bundle j()
    {
        if (!(a instanceof cll))
        {
            bka.e((new StringBuilder("MediationAdapter is not a v2 MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            return new Bundle();
        } else
        {
            return ((cll)a).e();
        }
    }

    public final Bundle k()
    {
        if (!(a instanceof clm))
        {
            bka.e((new StringBuilder("MediationAdapter is not a v2 MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            return new Bundle();
        } else
        {
            return ((clm)a).d();
        }
    }

    public final Bundle l()
    {
        return new Bundle();
    }
}
