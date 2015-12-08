// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.vungle.publisher.bg;
import com.vungle.publisher.bi;
import com.vungle.publisher.protocol.message.RequestAdResponse;
import com.vungle.publisher.protocol.message.RequestStreamingAdResponse;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            Video, StreamingAd, Ad, Viewable

public class StreamingVideo extends Video
{
    public static class Factory extends Video.Factory
    {

        private static final com.vungle.publisher.bj.b b;
        Provider a;

        private StreamingVideo a(StreamingAd streamingad, RequestStreamingAdResponse requeststreamingadresponse)
        {
            streamingad = (StreamingVideo)super.a(streamingad, requeststreamingadresponse);
            if (streamingad != null)
            {
                streamingad.c = requeststreamingadresponse.m();
                streamingad.q = b;
            }
            return streamingad;
        }

        private StreamingVideo a(StreamingVideo streamingvideo, Cursor cursor, boolean flag)
        {
            super.a(streamingvideo, cursor, flag);
            streamingvideo.c = bg.f(cursor, "url");
            return streamingvideo;
        }

        protected final volatile bi a(bi bi1, Cursor cursor)
        {
            return a((StreamingVideo)bi1, cursor, false);
        }

        protected final com.vungle.publisher.bj.b a()
        {
            return b;
        }

        protected final volatile Video a(Ad ad, RequestAdResponse requestadresponse)
        {
            return a((StreamingAd)ad, (RequestStreamingAdResponse)requestadresponse);
        }

        protected final volatile Video a(Video video, Cursor cursor, boolean flag)
        {
            return a((StreamingVideo)video, cursor, flag);
        }

        protected final volatile Viewable a(Viewable viewable, Cursor cursor, boolean flag)
        {
            return a((StreamingVideo)viewable, cursor, flag);
        }

        protected final Viewable b(Ad ad, RequestAdResponse requestadresponse)
        {
            return a((StreamingAd)ad, (RequestStreamingAdResponse)requestadresponse);
        }

        protected final volatile Object[] b(int j)
        {
            return new Integer[j];
        }

        protected final volatile bi[] c(int j)
        {
            return new StreamingVideo[j];
        }

        protected final bi c_()
        {
            return (StreamingVideo)a.get();
        }

        static 
        {
            b = com.vungle.publisher.bj.b.d;
        }

        protected Factory()
        {
        }
    }


    StreamingAd.Factory a;
    Factory b;
    public String c;

    protected StreamingVideo()
    {
    }

    protected final ContentValues a(boolean flag)
    {
        ContentValues contentvalues = super.a(flag);
        contentvalues.put("url", c);
        return contentvalues;
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return b;
    }

    public final Uri i()
    {
        return Uri.parse(c);
    }

    protected final StringBuilder p()
    {
        StringBuilder stringbuilder = super.p();
        bi.a(stringbuilder, "url", c, false);
        return stringbuilder;
    }

    protected final volatile Ad.Factory v()
    {
        return a;
    }
}
