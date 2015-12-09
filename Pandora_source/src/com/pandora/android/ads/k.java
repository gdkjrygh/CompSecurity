// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import com.crashlytics.android.d;
import com.pandora.android.PandoraApp;
import com.pandora.android.data.p;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.ad;
import com.pandora.radio.util.i;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;
import p.df.a;

public class k extends ad
{

    private Map a;
    private p b[];

    public transient k(Map map, p ap[])
    {
        super(new String[0]);
        a = map;
        b = ap;
    }

    private String a(p p1, com.pandora.radio.util.a.a a1)
    {
        if (a == null)
        {
            return null;
        }
        if (a1 == null)
        {
            p.df.a.a("ThirdPartyTrackingUrls", "getThirdPartyTrackingUrl: AdvertisingClient.AdInfo is null.  No Google Play Services installed?");
            return null;
        }
        String s1 = (String)a.get(p1.o());
        if (s.a(s1))
        {
            p.df.a.a("ThirdPartyTrackingUrls", "getThirdPartyTrackingUrl: baseUrl is missing for thirdPartyTrackingUrl.");
            return null;
        }
        String s2 = p1.p();
        if (s.a(s2))
        {
            p.df.a.a("ThirdPartyTrackingUrls", "getThirdPartyTrackingUrl: tracking params are missing for thirdPartyTrackingUrl.");
            return null;
        }
        s2 = (new StringBuilder()).append(s1).append(s2).toString();
        boolean flag = s2.contains("__SHA256IDFA__");
        if (flag)
        {
            s1 = "__SHA256IDFA__";
        } else
        {
            s1 = "__SHA1IDFA__";
        }
        p1 = p1.q();
        if (a1.b() && !s.a(p1))
        {
            return s2.replace(s1, p1);
        } else
        {
            return s2.replace(s1, a(a1, flag));
        }
    }

    private String a(com.pandora.radio.util.a.a a1, boolean flag)
    {
        try
        {
            a1 = a1.a();
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("NOT FATAL. Exception generating ");
            if (flag)
            {
                a1 = "SHA-256";
            } else
            {
                a1 = "SHA-1";
            }
            d.a(new IllegalStateException(stringbuilder.append(a1).append(" of Advertising Id").toString(), nosuchalgorithmexception));
            return "";
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        return i.f(a1);
        a1 = i.g(a1);
        return a1;
    }

    public String[] a()
    {
        ArrayList arraylist = new ArrayList();
        com.pandora.radio.util.a.a a1 = ((PandoraApp)b.a.h()).b().a();
        p ap[] = b;
        int l = ap.length;
        for (int j = 0; j < l; j++)
        {
            String s1 = a(ap[j], a1);
            if (!s.a(s1))
            {
                arraylist.add(s1);
            }
        }

        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }
}
