// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media.search;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.util.logging.Logger;
import dmi;
import ecc;
import java.io.IOException;

// Referenced classes of package com.spotify.mobile.android.service.media.search:
//            WebApiSearch

public final class a
    implements dmi
{

    private ecc a;
    private WebApiSearch b;

    public final void a(int i, Object obj)
    {
        obj = (String)obj;
        try
        {
            obj = (sponse)b.a.readValue(((String) (obj)), com/spotify/mobile/android/service/media/search/WebApiSearch$Response);
            a.a(((sponse) (obj)));
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

    public sponse(WebApiSearch webapisearch, ecc ecc1)
    {
        b = webapisearch;
        a = ecc1;
        super();
    }
}
