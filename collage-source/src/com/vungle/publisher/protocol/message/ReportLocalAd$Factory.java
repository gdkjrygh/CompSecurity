// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.db.model.AdReport;
import com.vungle.publisher.db.model.LocalAd;
import com.vungle.publisher.db.model.LocalAdReport;
import com.vungle.publisher.db.model.LocalVideo;
import com.vungle.publisher.db.model.LocalViewableDelegate;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            ReportLocalAd, ReportAd

public static class PlayFactory extends PlayFactory
{
    static class PlayFactory extends ReportAd.Play.Factory
    {

        UserActionFactory a;

        PlayFactory()
        {
        }
    }

    static class PlayFactory.UserActionFactory extends ReportAd.Play.UserAction.Factory
    {

        PlayFactory.UserActionFactory()
        {
        }
    }


    PlayFactory b;
     c;

    public final ReportAd a(AdReport adreport)
    {
        adreport = (LocalAdReport)adreport;
        ReportLocalAd reportlocalad = (ReportLocalAd)super.Factory(adreport);
        if (reportlocalad != null)
        {
            reportlocalad.a = Integer.valueOf(adreport.A());
            reportlocalad.m = on.Factory(adreport.f());
            reportlocalad.l = ((LocalVideo)((LocalAd)adreport.e()).k()).b.b;
        }
        return reportlocalad;
    }

    protected final Object a()
    {
        return new ReportLocalAd();
    }

    protected final volatile Object[] a(int i)
    {
        return new ReportLocalAd[i];
    }

    protected final volatile on.Factory b()
    {
        return c;
    }

    PlayFactory()
    {
    }
}
