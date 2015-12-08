// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.db.model.AdReport;
import com.vungle.publisher.db.model.StreamingAd;
import com.vungle.publisher.db.model.StreamingAdReport;
import com.vungle.publisher.db.model.StreamingVideo;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            ReportStreamingAd, ReportAd

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
        adreport = (StreamingAdReport)adreport;
        ReportStreamingAd reportstreamingad = (ReportStreamingAd)super.actory(adreport);
        if (reportstreamingad != null)
        {
            reportstreamingad.l = ((StreamingVideo)((StreamingAd)adreport.e()).k()).c;
        }
        return reportstreamingad;
    }

    protected final Object a()
    {
        return new ReportStreamingAd();
    }

    protected final volatile Object[] a(int i)
    {
        return new ReportStreamingAd[i];
    }

    protected final volatile actory b()
    {
        return c;
    }

    PlayFactory()
    {
    }
}
