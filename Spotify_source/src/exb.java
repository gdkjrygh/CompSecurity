// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.ArtistQuestionnaire;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.GenreQuestionnaire;
import java.net.UnknownServiceException;

public final class exb
{

    public exf a;
    public ewx b;
    public GenreQuestionnaire c;
    public ArtistQuestionnaire d;
    public ObjectMapper e;

    public exb(exf exf1, ewx ewx1, GenreQuestionnaire genrequestionnaire, ArtistQuestionnaire artistquestionnaire)
    {
        e = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        a = (exf)ctz.a(exf1);
        b = (ewx)ctz.a(ewx1);
        c = (GenreQuestionnaire)ctz.a(genrequestionnaire);
        d = (ArtistQuestionnaire)ctz.a(artistquestionnaire);
    }

    static boolean a(exb exb1)
    {
        return exb1.a == null;
    }

    // Unreferenced inner class exb$1

/* anonymous class */
    public final class _cls1
        implements ewy
    {

        private exb a;

        public final void a()
        {
            if (exb.a(a))
            {
                return;
            } else
            {
                a.a.H();
                return;
            }
        }

        public final void a(Response response)
        {
            if (exb.a(a))
            {
                return;
            }
            if (response.getStatus() == 200)
            {
                a.a.J();
                return;
            } else
            {
                exf exf1 = a.a;
                new UnknownServiceException((new StringBuilder("Response status is ")).append(response.getStatus()).toString());
                exf1.H();
                return;
            }
        }

            public 
            {
                a = exb.this;
                super();
            }
    }

}
