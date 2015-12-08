// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationServerParameters;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class cfv extends cfb
{

    private final ayg a;

    public cfv(ayg ayg1)
    {
        a = ayg1;
    }

    private MediationServerParameters a(String s)
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
            bka.c("Could not get MediationServerParameters.", s);
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

    public final byb a()
    {
        if (!(a instanceof ayh))
        {
            bka.e((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        byb byb;
        try
        {
            byb = bye.a(((ayh)a).c());
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
    }

    public final void a(byb byb, AdRequestParcel adrequestparcel, String s, cfd cfd)
    {
        a(byb, adrequestparcel, s, ((String) (null)), cfd);
    }

    public final void a(byb byb, AdRequestParcel adrequestparcel, String s, String s1, cfd cfd)
    {
        if (!(a instanceof ayi))
        {
            bka.e((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        bka.a("Requesting interstitial ad from adapter.");
        try
        {
            new cfw();
            bye.a(byb);
            int i1 = adrequestparcel.g;
            a(s);
            cfy.a(adrequestparcel);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byb byb)
        {
            bka.c("Could not request interstitial ad from adapter.", byb);
        }
        throw new RemoteException();
    }

    public final void a(byb byb, AdRequestParcel adrequestparcel, String s, String s1, cfd cfd, NativeAdOptionsParcel nativeadoptionsparcel, List list)
    {
    }

    public final void a(byb byb, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, cfd cfd)
    {
        a(byb, adsizeparcel, adrequestparcel, s, null, cfd);
    }

    public final void a(byb byb, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, cfd cfd)
    {
        if (!(a instanceof ayh))
        {
            bka.e((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        bka.a("Requesting banner ad from adapter.");
        try
        {
            new cfw();
            bye.a(byb);
            int i1 = adrequestparcel.g;
            a(s);
            cfy.a(adsizeparcel);
            cfy.a(adrequestparcel);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byb byb)
        {
            bka.c("Could not request banner ad from adapter.", byb);
        }
        throw new RemoteException();
    }

    public final void a(AdRequestParcel adrequestparcel, String s)
    {
    }

    public final void b()
    {
        if (!(a instanceof ayi))
        {
            bka.e((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        } else
        {
            bka.a("Showing interstitial from adapter.");
            return;
        }
    }

    public final void c()
    {
    }

    public final void d()
    {
        throw new RemoteException();
    }

    public final void e()
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

    public final cfj h()
    {
        return null;
    }

    public final cfm i()
    {
        return null;
    }

    public final Bundle j()
    {
        return new Bundle();
    }

    public final Bundle k()
    {
        return new Bundle();
    }

    public final Bundle l()
    {
        return new Bundle();
    }
}
