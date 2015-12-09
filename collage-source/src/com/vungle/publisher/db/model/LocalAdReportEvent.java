// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import com.vungle.publisher.bi;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            AdReportEvent

public class LocalAdReportEvent extends AdReportEvent
{
    static class Factory extends AdReportEvent.Factory
    {

        Provider a;

        protected final volatile Object[] b(int i)
        {
            return new Integer[i];
        }

        protected final volatile bi[] c(int i)
        {
            return new LocalAdReportEvent[i];
        }

        protected final bi c_()
        {
            return (LocalAdReportEvent)a.get();
        }

        protected final String e_()
        {
            return "ad_report_event";
        }

        protected Factory()
        {
        }
    }


    Factory e;
    LocalAdPlay.Factory f;

    protected LocalAdReportEvent()
    {
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return e;
    }
}
