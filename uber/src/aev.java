// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class aev extends aen
{

    private final ju a;
    private final ka b;

    public aev(ju ju1, ka ka)
    {
        a = ju1;
        b = ka;
    }

    private jx a(String s)
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
            of.d("Could not get MediationServerParameters.", s);
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
        obj = (jx)((Class) (obj1)).newInstance();
        ((jx) (obj)).a(s);
        return ((jx) (obj));
    }

    public final aaf a()
    {
        if (!(a instanceof jv))
        {
            of.e((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        aaf aaf;
        try
        {
            aaf = aai.a(((jv)a).c());
        }
        catch (Throwable throwable)
        {
            of.d("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return aaf;
    }

    public final void a(aaf aaf, AdRequestParcel adrequestparcel, String s, aep aep)
    {
        a(aaf, adrequestparcel, s, null, aep);
    }

    public final void a(aaf aaf, AdRequestParcel adrequestparcel, String s, String s1, aep aep)
    {
        if (!(a instanceof jw))
        {
            of.e((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        of.a("Requesting interstitial ad from adapter.");
        try
        {
            new aew(aep);
            aai.a(aaf);
            int i = adrequestparcel.g;
            a(s);
            aex.a(adrequestparcel);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aaf aaf)
        {
            of.d("Could not request interstitial ad from adapter.", aaf);
        }
        throw new RemoteException();
    }

    public final void a(aaf aaf, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, aep aep)
    {
        a(aaf, adsizeparcel, adrequestparcel, s, null, aep);
    }

    public final void a(aaf aaf, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, aep aep)
    {
        if (!(a instanceof jv))
        {
            of.e((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        of.a("Requesting banner ad from adapter.");
        try
        {
            new aew(aep);
            aai.a(aaf);
            int i = adrequestparcel.g;
            a(s);
            aex.a(adsizeparcel);
            aex.a(adrequestparcel);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aaf aaf)
        {
            of.d("Could not request banner ad from adapter.", aaf);
        }
        throw new RemoteException();
    }

    public final void b()
    {
        if (!(a instanceof jw))
        {
            of.e((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        } else
        {
            of.a("Showing interstitial from adapter.");
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
}
