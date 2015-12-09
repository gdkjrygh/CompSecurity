// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.spotlets.openaccess.model.Artist;
import com.spotify.mobile.android.spotlets.openaccess.model.TopTracks;
import java.io.IOException;

public final class exm
{

    private static final ObjectMapper b;
    final exr a;
    private final exn c;

    public exm(Context context, exn exn)
    {
        c = exn;
        a = exr.a(context, exh.a, exh.b, exh.c);
    }

    static ObjectMapper a()
    {
        return b;
    }

    static exn a(exm exm1)
    {
        return exm1.c;
    }

    static 
    {
        b = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    // Unreferenced inner class exm$1

/* anonymous class */
    final class _cls1
        implements dmi
    {

        private exm a;

        public final void a(int i, Object obj)
        {
            obj = (String)obj;
            try
            {
                obj = (Artist)exm.a().readValue(((String) (obj)), com/spotify/mobile/android/spotlets/openaccess/model/Artist);
                exm.a(a).a(((Artist) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                exm.a(a).a(((Throwable) (obj)));
            }
        }

        public final void a(Throwable throwable, String s)
        {
            exm.a(a).a(throwable);
        }

            
            {
                a = exm.this;
                super();
            }
    }


    // Unreferenced inner class exm$2

/* anonymous class */
    final class _cls2
        implements dmi
    {

        private exm a;

        public final void a(int i, Object obj)
        {
            obj = (String)obj;
            try
            {
                obj = (TopTracks)exm.a().readValue(((String) (obj)), com/spotify/mobile/android/spotlets/openaccess/model/TopTracks);
                exm.a(a).a(((TopTracks) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                exm.a(a).b(((Throwable) (obj)));
            }
        }

        public final void a(Throwable throwable, String s)
        {
            exm.a(a).b(throwable);
        }

            
            {
                a = exm.this;
                super();
            }
    }

}
