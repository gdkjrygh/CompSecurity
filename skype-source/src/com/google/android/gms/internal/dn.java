// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.a.a;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.b.e;
import com.google.android.gms.ads.b.h;
import com.google.android.gms.ads.b.i;
import com.google.android.gms.ads.b.k;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.d;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            dm, do, dr, dp, 
//            dq, dj, dk, dl

public final class dn extends di.a
{

    private final com.google.android.gms.ads.b.b a;
    private do b;

    public dn(com.google.android.gms.ads.b.b b1)
    {
        a = b1;
    }

    private Bundle a(String s, int j, String s1)
        throws RemoteException
    {
        Bundle bundle;
        com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Server parameters: ")).append(s).toString());
        Iterator iterator;
        String s2;
        try
        {
            bundle = new Bundle();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not get Server Parameters Bundle.", s);
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

        if (a instanceof a)
        {
            bundle.putString("adJson", s1);
            bundle.putInt("tagForChildDirectedTreatment", j);
        }
        return bundle;
    }

    public final com.google.android.gms.b.c a()
        throws RemoteException
    {
        if (!(a instanceof c))
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.b.c c1;
        try
        {
            c1 = com.google.android.gms.b.d.a(((c)a).d());
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return c1;
    }

    public final void a(AdRequestParcel adrequestparcel, String s)
        throws RemoteException
    {
        Date date;
        date = null;
        if (!(a instanceof com.google.android.gms.ads.c.a.a))
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("MediationAdapter is not a MediationRewardedVideoAdAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.b.a(3);
        com.google.android.gms.ads.c.a.a a1 = (com.google.android.gms.ads.c.a.a)a;
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
                com.google.android.gms.ads.internal.util.client.b.b("Could not load rewarded video ad from adapter.", adrequestparcel);
                throw new RemoteException();
            }
        }
        new dm(date, adrequestparcel.d, hashset, adrequestparcel.k, adrequestparcel.f, adrequestparcel.g);
        if (adrequestparcel.m != null)
        {
            adrequestparcel.m.getBundle(a1.getClass().getName());
        }
        a(s, adrequestparcel.g, null);
        return;
_L2:
        hashset = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(com.google.android.gms.b.c c1, AdRequestParcel adrequestparcel, String s, com.google.android.gms.ads.internal.reward.mediation.client.a a1, String s1)
        throws RemoteException
    {
        Date date;
        date = null;
        if (!(a instanceof com.google.android.gms.ads.c.a.a))
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("MediationAdapter is not a MediationRewardedVideoAdAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.b.a(3);
        com.google.android.gms.ads.c.a.a a2 = (com.google.android.gms.ads.c.a.a)a;
        if (adrequestparcel.e == null) goto _L2; else goto _L1
_L1:
        s = new HashSet(adrequestparcel.e);
_L4:
        if (adrequestparcel.b != -1L)
        {
            try
            {
                date = new Date(adrequestparcel.b);
            }
            // Misplaced declaration of an exception variable
            catch (com.google.android.gms.b.c c1)
            {
                com.google.android.gms.ads.internal.util.client.b.b("Could not initialize rewarded video adapter.", c1);
                throw new RemoteException();
            }
        }
        new dm(date, adrequestparcel.d, s, adrequestparcel.k, adrequestparcel.f, adrequestparcel.g);
        if (adrequestparcel.m != null)
        {
            adrequestparcel.m.getBundle(a2.getClass().getName());
        }
        com.google.android.gms.b.d.a(c1);
        new com.google.android.gms.ads.internal.reward.mediation.client.b(a1);
        a(s1, adrequestparcel.g, null);
        return;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(com.google.android.gms.b.c c1, AdRequestParcel adrequestparcel, String s, dj dj)
        throws RemoteException
    {
        a(c1, adrequestparcel, s, ((String) (null)), dj);
    }

    public final void a(com.google.android.gms.b.c c1, AdRequestParcel adrequestparcel, String s, String s1, dj dj)
        throws RemoteException
    {
        if (!(a instanceof e))
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.b.a(3);
        e e1 = (e)a;
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
            catch (com.google.android.gms.b.c c1)
            {
                com.google.android.gms.ads.internal.util.client.b.b("Could not request interstitial ad from adapter.", c1);
                throw new RemoteException();
            }
        }
        obj1 = new dm(((Date) (obj1)), adrequestparcel.d, ((java.util.Set) (obj)), adrequestparcel.k, adrequestparcel.f, adrequestparcel.g);
        if (adrequestparcel.m == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        obj = adrequestparcel.m.getBundle(e1.getClass().getName());
_L3:
        e1.a((Context)com.google.android.gms.b.d.a(c1), new do(dj), a(s, adrequestparcel.g, s1), ((com.google.android.gms.ads.b.a) (obj1)), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(com.google.android.gms.b.c c1, AdRequestParcel adrequestparcel, String s, String s1, dj dj, NativeAdOptionsParcel nativeadoptionsparcel, List list)
        throws RemoteException
    {
        if (!(a instanceof k))
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("MediationAdapter is not a MediationNativeAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        k k1 = (k)a;
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
            catch (com.google.android.gms.b.c c1)
            {
                com.google.android.gms.ads.internal.util.client.b.b("Could not request interstitial ad from adapter.", c1);
                throw new RemoteException();
            }
        }
        list = new dr(date, adrequestparcel.d, hashset, adrequestparcel.k, adrequestparcel.f, adrequestparcel.g, nativeadoptionsparcel, list);
        if (adrequestparcel.m == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        nativeadoptionsparcel = adrequestparcel.m.getBundle(k1.getClass().getName());
_L3:
        b = new do(dj);
        k1.a((Context)com.google.android.gms.b.d.a(c1), b, a(s, adrequestparcel.g, s1), list, nativeadoptionsparcel);
        return;
        nativeadoptionsparcel = null;
          goto _L3
_L2:
        hashset = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(com.google.android.gms.b.c c1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, dj dj)
        throws RemoteException
    {
        a(c1, adsizeparcel, adrequestparcel, s, null, dj);
    }

    public final void a(com.google.android.gms.b.c c1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, dj dj)
        throws RemoteException
    {
        if (!(a instanceof c))
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.b.a(3);
        c c2 = (c)a;
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
            catch (com.google.android.gms.b.c c1)
            {
                com.google.android.gms.ads.internal.util.client.b.b("Could not request banner ad from adapter.", c1);
                throw new RemoteException();
            }
        }
        obj1 = new dm(((Date) (obj1)), adrequestparcel.d, ((java.util.Set) (obj)), adrequestparcel.k, adrequestparcel.f, adrequestparcel.g);
        if (adrequestparcel.m == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        obj = adrequestparcel.m.getBundle(c2.getClass().getName());
_L3:
        c2.a((Context)com.google.android.gms.b.d.a(c1), new do(dj), a(s, adrequestparcel.g, s1), com.google.android.gms.ads.f.a(adsizeparcel.f, adsizeparcel.c, adsizeparcel.b), ((com.google.android.gms.ads.b.a) (obj1)), ((Bundle) (obj)));
        return;
        obj = null;
          goto _L3
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void b()
        throws RemoteException
    {
        if (!(a instanceof e))
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            ((e)a).e();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final void c()
        throws RemoteException
    {
        try
        {
            a.a();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not destroy adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final void d()
        throws RemoteException
    {
        try
        {
            a.b();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not pause adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final void e()
        throws RemoteException
    {
        try
        {
            a.c();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not resume adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final void f()
        throws RemoteException
    {
        if (!(a instanceof com.google.android.gms.ads.c.a.a))
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("MediationAdapter is not a MediationRewardedVideoAdAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        } else
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
            return;
        }
    }

    public final boolean g()
        throws RemoteException
    {
        if (!(a instanceof com.google.android.gms.ads.c.a.a))
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("MediationAdapter is not a MediationRewardedVideoAdAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.b.a(3);
        boolean flag;
        try
        {
            flag = ((com.google.android.gms.ads.c.a.a)a).d();
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not check if adapter is initialized.", throwable);
            throw new RemoteException();
        }
        return flag;
    }

    public final dk h()
    {
        com.google.android.gms.ads.b.g g1 = b.o();
        if (g1 instanceof h)
        {
            return new dp((h)g1);
        } else
        {
            return null;
        }
    }

    public final dl i()
    {
        com.google.android.gms.ads.b.g g1 = b.o();
        if (g1 instanceof i)
        {
            return new dq((i)g1);
        } else
        {
            return null;
        }
    }
}
