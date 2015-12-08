// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.vungle.publisher.bg;
import com.vungle.publisher.bi;
import com.vungle.publisher.cw;
import com.vungle.publisher.protocol.message.RequestAdResponse;
import com.vungle.publisher.protocol.message.RequestLocalAdResponse;
import java.io.File;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.db.model:
//            Video, LocalViewableDelegate, LocalAd, Ad, 
//            Viewable

public class LocalVideo extends Video
    implements LocalViewableDelegate.a
{
    public static class Factory extends Video.Factory
    {

        private static final com.vungle.publisher.bj.b d;
        Provider a;
        LocalViewableDelegate.Factory b;

        private LocalVideo a(LocalAd localad, RequestLocalAdResponse requestlocaladresponse)
        {
            localad = (LocalVideo)super.a(localad, requestlocaladresponse);
            if (localad != null)
            {
                localad.a = requestlocaladresponse.w;
                localad.a(requestlocaladresponse.v);
                requestlocaladresponse = requestlocaladresponse.m();
                ((LocalVideo) (localad)).b.b = requestlocaladresponse;
                localad.q = d;
            }
            return localad;
        }

        private LocalVideo a(LocalVideo localvideo, Cursor cursor, boolean flag)
        {
            super.a(localvideo, cursor, flag);
            localvideo.b.a(cursor);
            localvideo.a = bg.f(cursor, "checksum");
            return localvideo;
        }

        protected final volatile bi a(bi bi1, Cursor cursor)
        {
            return a((LocalVideo)bi1, cursor, false);
        }

        protected final com.vungle.publisher.bj.b a()
        {
            return d;
        }

        protected final volatile Video a(Ad ad, RequestAdResponse requestadresponse)
        {
            return a((LocalAd)ad, (RequestLocalAdResponse)requestadresponse);
        }

        protected final volatile Video a(Video video, Cursor cursor, boolean flag)
        {
            return a((LocalVideo)video, cursor, flag);
        }

        protected final volatile Viewable a(Viewable viewable, Cursor cursor, boolean flag)
        {
            return a((LocalVideo)viewable, cursor, flag);
        }

        protected final Viewable b(Ad ad, RequestAdResponse requestadresponse)
        {
            return a((LocalAd)ad, (RequestLocalAdResponse)requestadresponse);
        }

        protected final volatile Object[] b(int j)
        {
            return new Integer[j];
        }

        protected final volatile bi[] c(int j)
        {
            return new LocalVideo[j];
        }

        protected final bi c_()
        {
            LocalVideo localvideo = (LocalVideo)a.get();
            localvideo.b = b.a(localvideo);
            return localvideo;
        }

        static 
        {
            d = com.vungle.publisher.bj.b.a;
        }

        protected Factory()
        {
        }
    }


    String a;
    public LocalViewableDelegate b;
    LocalAd.Factory c;
    Factory d;

    protected LocalVideo()
    {
    }

    public final boolean A()
    {
        return b.h();
    }

    public final int B()
    {
        return super.n();
    }

    protected final ContentValues a(boolean flag)
    {
        ContentValues contentvalues = super.a(flag);
        b.a(contentvalues);
        contentvalues.put("checksum", a);
        return contentvalues;
    }

    public final void a(cw cw)
    {
        b.a(cw);
    }

    public final void a(Integer integer)
    {
        b.c = integer;
    }

    protected final volatile com.vungle.publisher.bi.a a_()
    {
        return d;
    }

    public final String g()
    {
        return b.b;
    }

    public final String h()
    {
        return "mp4";
    }

    public final Uri i()
    {
        return Uri.fromFile(new File(b.c()));
    }

    public final String k()
    {
        return b.c();
    }

    public final boolean l()
    {
        return b.e();
    }

    public final int n()
    {
        return b.d();
    }

    protected final StringBuilder p()
    {
        StringBuilder stringbuilder = super.p();
        b.a(stringbuilder);
        bi.a(stringbuilder, "checksum", a, false);
        return stringbuilder;
    }

    public final boolean q()
    {
        return b.f();
    }

    public final boolean t()
    {
        return b.f();
    }

    public final boolean u()
    {
        return b.g();
    }

    protected final volatile Ad.Factory v()
    {
        return c;
    }
}
