// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.spotlets.openaccess.model.TopTracks;
import java.io.IOException;

final class ang.Object
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

    (exm exm1)
    {
        a = exm1;
        super();
    }
}
