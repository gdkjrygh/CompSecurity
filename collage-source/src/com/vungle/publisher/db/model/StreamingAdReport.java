// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import com.vungle.publisher.bi;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            AdReport

public class StreamingAdReport extends AdReport
{
    public static class Factory extends AdReport.BaseFactory
    {

        StreamingAdPlay.Factory b;
        StreamingAd.Factory d;
        Provider e;

        public final volatile int a(List list)
        {
            return super.a(list);
        }

        protected final volatile Ad.Factory a()
        {
            return d;
        }

        protected final volatile AdPlay.Factory b()
        {
            return b;
        }

        protected final volatile Object[] b(int i)
        {
            return new Integer[i];
        }

        protected final Ad.b c()
        {
            return Ad.b.b;
        }

        protected final volatile bi[] c(int i)
        {
            return new StreamingAdReport[i];
        }

        protected final bi c_()
        {
            return (StreamingAdReport)e.get();
        }

        public final volatile List d()
        {
            return super.d();
        }

        public final volatile List d(int i)
        {
            return super.d(i);
        }

        protected final String e_()
        {
            return "ad_report";
        }

        protected Factory()
        {
        }
    }


    Factory p;
    StreamingAdPlay.Factory q;

    protected StreamingAdReport()
    {
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return p;
    }

    protected final volatile AdPlay.Factory c()
    {
        return q;
    }
}
