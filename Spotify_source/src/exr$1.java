// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.spotlets.openaccess.spotifywebapi.ClientCredentialsResponse;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;

final class ang.Object
    implements dmi
{

    private exs a;
    private exr b;

    public final void a(int i, Object obj)
    {
        obj = (String)obj;
        exr exr1;
        String s;
        long l;
        obj = (ClientCredentialsResponse)b.a.readValue(((String) (obj)), com/spotify/mobile/android/spotlets/openaccess/spotifywebapi/ClientCredentialsResponse);
        exr1 = b;
        s = ((ClientCredentialsResponse) (obj)).getAccessToken();
        l = ((ClientCredentialsResponse) (obj)).getExpiresIn().longValue();
        try
        {
            JSONArray jsonarray = new JSONArray();
            jsonarray.put(0, s);
            jsonarray.put(1, l * 1000L + SystemClock.elapsedRealtime());
            exr1.d.b().a(exr1.c, jsonarray).b();
        }
        catch (JSONException jsonexception)
        {
            try
            {
                Logger.c("Could not store access token", new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a.a(((Throwable) (obj)), ((IOException) (obj)).getMessage());
                return;
            }
        }
        a.a(((ClientCredentialsResponse) (obj)).getAccessToken());
        return;
    }

    public final void a(Throwable throwable, String s)
    {
        a.a(throwable, s);
    }

    (exr exr1, exs exs1)
    {
        b = exr1;
        a = exs1;
        super();
    }
}
