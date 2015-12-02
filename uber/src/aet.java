// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public final class aet extends aen
{

    private final ov a;

    public aet(ov ov1)
    {
        a = ov1;
    }

    private Bundle a(String s, int i, String s1)
    {
        Bundle bundle;
        of.e((new StringBuilder("Server parameters: ")).append(s).toString());
        Iterator iterator;
        String s2;
        try
        {
            bundle = new Bundle();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            of.d("Could not get Server Parameters Bundle.", s);
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

        if (a instanceof kb)
        {
            bundle.putString("adJson", s1);
            bundle.putInt("tagForChildDirectedTreatment", i);
        }
        return bundle;
    }

    public final aaf a()
    {
        if (!(a instanceof ow))
        {
            of.e((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        aaf aaf;
        try
        {
            aaf = aai.a(((ow)a).d());
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
        if (!(a instanceof oy))
        {
            of.e((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        of.a("Requesting interstitial ad from adapter.");
        oy oy1 = (oy)a;
        if (adrequestparcel.e == null) goto _L2; else goto _L1
_L1:
        Object obj = new HashSet(adrequestparcel.e);
_L5:
        aes aes1 = new aes(new Date(adrequestparcel.b), adrequestparcel.d, ((java.util.Set) (obj)), adrequestparcel.k, adrequestparcel.f, adrequestparcel.g);
        if (adrequestparcel.m == null) goto _L4; else goto _L3
_L3:
        obj = adrequestparcel.m.getBundle(oy1.getClass().getName());
_L6:
        oy1.a((Context)aai.a(aaf), new aeu(aep), a(s, adrequestparcel.g, s1), aes1, ((Bundle) (obj)));
        return;
_L2:
        obj = null;
          goto _L5
_L4:
        obj = null;
          goto _L6
        aaf;
        of.d("Could not request interstitial ad from adapter.", aaf);
        throw new RemoteException();
          goto _L5
    }

    public final void a(aaf aaf, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, aep aep)
    {
        a(aaf, adsizeparcel, adrequestparcel, s, null, aep);
    }

    public final void a(aaf aaf, AdSizeParcel adsizeparcel, AdRequestParcel adrequestparcel, String s, String s1, aep aep)
    {
        Object obj1;
        obj1 = null;
        if (!(a instanceof ow))
        {
            of.e((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        of.a("Requesting banner ad from adapter.");
        Object obj;
        ow ow1;
        ow1 = (ow)a;
        if (adrequestparcel.e == null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        obj = new HashSet(adrequestparcel.e);
_L1:
        aes aes1 = new aes(new Date(adrequestparcel.b), adrequestparcel.d, ((java.util.Set) (obj)), adrequestparcel.k, adrequestparcel.f, adrequestparcel.g);
        obj = obj1;
        try
        {
            if (adrequestparcel.m != null)
            {
                obj = adrequestparcel.m.getBundle(ow1.getClass().getName());
            }
            ow1.a((Context)aai.a(aaf), new aeu(aep), a(s, adrequestparcel.g, s1), pe.a(adsizeparcel.f, adsizeparcel.c, adsizeparcel.b), aes1, ((Bundle) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aaf aaf)
        {
            of.d("Could not request banner ad from adapter.", aaf);
        }
        break MISSING_BLOCK_LABEL_217;
        obj = null;
          goto _L1
        throw new RemoteException();
    }

    public final void b()
    {
        if (!(a instanceof oy))
        {
            of.e((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        of.a("Showing interstitial from adapter.");
        try
        {
            ((oy)a).e();
            return;
        }
        catch (Throwable throwable)
        {
            of.d("Could not show interstitial from adapter.", throwable);
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
            of.d("Could not destroy adapter.", throwable);
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
            of.d("Could not pause adapter.", throwable);
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
            of.d("Could not resume adapter.", throwable);
        }
        throw new RemoteException();
    }
}
