// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.spotlets.openaccess.model.Album;
import java.io.IOException;

final class ang.Object
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

    (exj exj1)
    {
        a = exj1;
        super();
    }
}
