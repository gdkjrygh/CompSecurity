// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import com.vungle.publisher.bi;
import com.vungle.publisher.bj;
import com.vungle.publisher.protocol.message.RequestAdResponse;
import com.vungle.publisher.protocol.message.RequestStreamingAdResponse;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            Ad, StreamingVideo

public class StreamingAd extends Ad
{
    public static class Factory extends Ad.Factory
    {

        Provider d;
        StreamingVideo.Factory e;

        public final volatile int a(List list)
        {
            return super.a(list);
        }

        public final volatile Ad a(RequestAdResponse requestadresponse)
        {
            return a((RequestStreamingAdResponse)requestadresponse);
        }

        public final StreamingAd a(RequestStreamingAdResponse requeststreamingadresponse)
        {
            requeststreamingadresponse = (StreamingAd)super.a(requeststreamingadresponse);
            requeststreamingadresponse.a(Ad.a.e);
            return requeststreamingadresponse;
        }

        public final StreamingAd a(String s)
        {
            return (StreamingAd)super.a(Ad.b.b, s);
        }

        protected final volatile Video.Factory a()
        {
            return e;
        }

        public final volatile boolean a(Ad ad)
        {
            return super.a(ad);
        }

        protected final Ad.b b()
        {
            return Ad.b.b;
        }

        protected final volatile Object[] b(int i)
        {
            return new String[i];
        }

        protected final volatile bi[] c(int i)
        {
            return new StreamingAd[i];
        }

        protected final bi c_()
        {
            return (StreamingAd)d.get();
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
            return "ad";
        }

        public Factory()
        {
        }
    }


    Factory v;

    protected StreamingAd()
    {
    }

    public final bj a(com.vungle.publisher.bj.b b)
    {
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1.a[b.ordinal()])
        {
        default:
            super.a(b);
            return null;

        case 1: // '\001'
            return (StreamingVideo)k();
        }
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return v;
    }

    protected final volatile Ad.Factory c()
    {
        return v;
    }
}
