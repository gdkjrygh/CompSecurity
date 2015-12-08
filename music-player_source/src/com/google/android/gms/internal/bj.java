// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.a.a.a.a;
import com.google.a.a.b;
import com.google.a.a.c;
import com.google.a.a.d;
import com.google.a.a.e;
import com.google.a.a.h;
import com.google.android.gms.a.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            be, ek, bk, z, 
//            ab, bl, bg

public final class bj extends be
{

    private final b a;
    private final h b;

    public bj(b b1, h h)
    {
        a = b1;
        b = h;
    }

    private e a(String s, int i, String s1)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        try
        {
            JSONObject jsonobject = new JSONObject(s);
            s = new HashMap(jsonobject.length());
            String s2;
            for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); s.put(s2, jsonobject.getString(s2)))
            {
                s2 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.internal.ek.a("Could not get MediationServerParameters.", s);
            throw new RemoteException();
        }
_L4:
        Class class1 = a.c();
        e e1;
        e1 = null;
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        e1 = (e)class1.newInstance();
        e1.a(s);
        if (!(e1 instanceof a))
        {
            break; /* Loop/switch isn't completed */
        }
        s = (a)e1;
        s.b = s1;
        s.c = i;
        return e1;
_L2:
        s = new HashMap(0);
        if (true) goto _L4; else goto _L3
_L3:
        return e1;
    }

    public final com.google.android.gms.a.c a()
    {
        if (!(a instanceof c))
        {
            com.google.android.gms.internal.ek.d((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.a.c c1;
        try
        {
            c1 = f.a(((c)a).e());
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.ek.a("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return c1;
    }

    public final void a(com.google.android.gms.a.c c1, ab ab1, z z1, String s, bg bg)
    {
        a(c1, ab1, z1, s, null, bg);
    }

    public final void a(com.google.android.gms.a.c c1, ab ab1, z z1, String s, String s1, bg bg)
    {
        if (!(a instanceof c))
        {
            com.google.android.gms.internal.ek.d((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.internal.ek.a("Requesting banner ad from adapter.");
        try
        {
            c c2 = (c)a;
            new bk(bg);
            f.a(c1);
            a(s, z1.h, s1);
            new com.google.a.c(com.google.android.gms.ads.f.a(ab1.g, ab1.d, ab1.c));
            com.google.android.gms.internal.bl.a(z1);
            c1 = b;
            c2.d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.a.c c1)
        {
            com.google.android.gms.internal.ek.a("Could not request banner ad from adapter.", c1);
        }
        throw new RemoteException();
    }

    public final void a(com.google.android.gms.a.c c1, z z1, String s, bg bg)
    {
        a(c1, z1, s, null, bg);
    }

    public final void a(com.google.android.gms.a.c c1, z z1, String s, String s1, bg bg)
    {
        if (!(a instanceof d))
        {
            com.google.android.gms.internal.ek.d((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.internal.ek.a("Requesting interstitial ad from adapter.");
        try
        {
            d d1 = (d)a;
            new bk(bg);
            f.a(c1);
            a(s, z1.h, s1);
            com.google.android.gms.internal.bl.a(z1);
            c1 = b;
            d1.d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.a.c c1)
        {
            com.google.android.gms.internal.ek.a("Could not request interstitial ad from adapter.", c1);
        }
        throw new RemoteException();
    }

    public final void b()
    {
        if (!(a instanceof d))
        {
            com.google.android.gms.internal.ek.d((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.internal.ek.a("Showing interstitial from adapter.");
        try
        {
            ((d)a).e();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.ek.a("Could not show interstitial from adapter.", throwable);
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
            com.google.android.gms.internal.ek.a("Could not destroy adapter.", throwable);
        }
        throw new RemoteException();
    }
}
