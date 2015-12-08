// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.c;
import com.google.ads.mediation.d;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            dt, du, dj, dk, 
//            dl

public final class ds extends di.a
{

    private final c a;
    private final f b;

    public ds(c c1, f f1)
    {
        a = c1;
        b = f1;
    }

    private MediationServerParameters a(String s)
        throws RemoteException
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Iterator iterator;
        try
        {
            obj1 = new JSONObject(s);
            obj = new HashMap(((JSONObject) (obj1)).length());
            iterator = ((JSONObject) (obj1)).keys();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not get MediationServerParameters.", s);
            throw new RemoteException();
        }
        s = ((String) (obj));
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        ((Map) (obj)).put(s, ((JSONObject) (obj1)).getString(s));
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_31;
_L2:
        s = new HashMap(0);
_L3:
        obj1 = a.b();
        obj = null;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj = (MediationServerParameters)((Class) (obj1)).newInstance();
        ((MediationServerParameters) (obj)).a(s);
        return ((MediationServerParameters) (obj));
    }

    public final com.google.android.gms.b.c a()
        throws RemoteException
    {
        if (!(a instanceof d))
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.b.c c1;
        try
        {
            c1 = com.google.android.gms.b.d.a(((d)a).c());
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return c1;
    }

    public final void a(AdRequestParcel adrequestparcel, String s)
    {
    }

    public final void a(com.google.android.gms.b.c c1, AdRequestParcel adrequestparcel, String s, a a1, String s1)
        throws RemoteException
    {
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
        try
        {
            new dt(dj);
            com.google.android.gms.b.d.a(c1);
            int j = adrequestparcel.g;
            a(s);
            com.google.android.gms.internal.du.a(adrequestparcel);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.b.c c1)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not request interstitial ad from adapter.", c1);
        }
        throw new RemoteException();
    }

    public final void a(com.google.android.gms.b.c c1, AdRequestParcel adrequestparcel, String s, String s1, dj dj, NativeAdOptionsParcel nativeadoptionsparcel, List list)
    {
    }

    public final void a(com.google.android.gms.b.c c1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, dj dj)
        throws RemoteException
    {
        a(c1, adsizeparcel, adrequestparcel, s, null, dj);
    }

    public final void a(com.google.android.gms.b.c c1, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, dj dj)
        throws RemoteException
    {
        if (!(a instanceof d))
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.b.a(3);
        try
        {
            new dt(dj);
            com.google.android.gms.b.d.a(c1);
            int j = adrequestparcel.g;
            a(s);
            com.google.android.gms.internal.du.a(adsizeparcel);
            com.google.android.gms.internal.du.a(adrequestparcel);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.b.c c1)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not request banner ad from adapter.", c1);
        }
        throw new RemoteException();
    }

    public final void b()
        throws RemoteException
    {
        if (!(a instanceof e))
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        } else
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
            return;
        }
    }

    public final void c()
        throws RemoteException
    {
    }

    public final void d()
        throws RemoteException
    {
        throw new RemoteException();
    }

    public final void e()
        throws RemoteException
    {
        throw new RemoteException();
    }

    public final void f()
    {
    }

    public final boolean g()
    {
        return true;
    }

    public final dk h()
    {
        return null;
    }

    public final dl i()
    {
        return null;
    }
}
