// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.db.model.Ad;
import com.vungle.publisher.db.model.AdReport;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            MessageFactory, ReportAd

public static abstract class  extends MessageFactory
{

    protected  a;

    public ReportAd a(AdReport adreport)
    {
        Object obj = null;
        int j = 0;
        if (adreport != null)
        {
            Ad ad = adreport.e();
            ReportAd reportad = (ReportAd)a();
            reportad.b = adreport.l();
            reportad.c = ad.e();
            reportad.d = ad.d();
            reportad.e = Integer.valueOf(adreport.k());
            reportad.f = adreport.h();
            reportad.g = Boolean.valueOf(adreport.g());
            reportad.h = adreport.i();
            com.vungle.publisher.db.model.AdPlay aadplay[] = adreport.t();
            int i;
            if (aadplay == null)
            {
                i = 0;
            } else
            {
                i = aadplay.length;
            }
            adreport = obj;
            if (i > 0)
            {
                 a1[] = new a[i];
                int k = aadplay.length;
                i = 0;
                do
                {
                    adreport = a1;
                    if (j >= k)
                    {
                        break;
                    }
                    a1[i] = tory.a(aadplay[j]);
                    j++;
                    i++;
                } while (true);
            }
            reportad.i = adreport;
            reportad.j = b().b();
            return reportad;
        } else
        {
            return null;
        }
    }

    protected abstract b b();

    protected ()
    {
    }
}
