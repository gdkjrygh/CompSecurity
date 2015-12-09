// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media.search;

import android.content.Context;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.util.logging.Logger;
import dmi;
import dmz;
import ecc;
import exh;
import exr;
import gng;
import gni;
import java.io.IOException;

public final class WebApiSearch
{

    final ObjectMapper a;
    public final exr b;

    public WebApiSearch(Context context)
    {
        a = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        b = exr.a(context, exh.a, exh.b, exh.c);
    }

    // Unreferenced inner class com/spotify/mobile/android/service/media/search/WebApiSearch$1

/* anonymous class */
    public final class _cls1
        implements dmi
    {

        private ecc a;
        private WebApiSearch b;

        public final void a(int i, Object obj)
        {
            obj = (String)obj;
            try
            {
                obj = (Response)b.a.readValue(((String) (obj)), com/spotify/mobile/android/service/media/search/WebApiSearch$Response);
                a.a(((Response) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logger.b(((Throwable) (obj)), "Error while deserializing response", new Object[0]);
            }
            a.a();
        }

        public final void a(Throwable throwable, String s)
        {
            Logger.b(throwable, s, new Object[0]);
            a.a();
        }

            public 
            {
                b = WebApiSearch.this;
                a = ecc1;
                super();
            }

        private class Response
            implements JacksonModel
        {

            private final Tracks mTracks;

            public Tracks getTracks()
            {
                return mTracks;
            }

            public Response(Tracks tracks)
            {
                mTracks = tracks;
            }
        }

    }

}
