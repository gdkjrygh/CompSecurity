// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.spotlets.openaccess.model.Artist;
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

    (exm exm1)
    {
        a = exm1;
        super();
    }
}
