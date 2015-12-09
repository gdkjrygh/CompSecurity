// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.spotlets.openaccess.model.Album;
import java.io.IOException;

public final class exj
{

    private static final ObjectMapper b;
    final exr a;
    private final exk c;

    public exj(Context context, exk exk)
    {
        c = exk;
        a = exr.a(context, exh.a, exh.b, exh.c);
    }

    static ObjectMapper a()
    {
        return b;
    }

    static exk a(exj exj1)
    {
        return exj1.c;
    }

    static 
    {
        b = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    // Unreferenced inner class exj$1

/* anonymous class */
    final class _cls1
        implements dmi
    {

        private exj a;

        public final void a(int i, Object obj)
        {
            obj = (String)obj;
            try
            {
                obj = (Album)exj.a().readValue(((String) (obj)), com/spotify/mobile/android/spotlets/openaccess/model/Album);
                exj.a(a).a(((Album) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                exj.a(a).a(((Throwable) (obj)));
            }
        }

        public final void a(Throwable throwable, String s)
        {
            exj.a(a).a(throwable);
        }

            
            {
                a = exj.this;
                super();
            }
    }

}
