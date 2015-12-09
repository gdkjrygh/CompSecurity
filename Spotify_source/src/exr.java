// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.spotlets.openaccess.spotifywebapi.ClientCredentialsResponse;
import com.spotify.mobile.android.spotlets.openaccess.spotifywebapi.ErrorResponse;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;

public final class exr
{

    final ObjectMapper a;
    final dme b;
    final gip c;
    gin d;
    private final dme e;

    private exr(Context context, String s, String s1, gip gip)
    {
        c = gip;
        gip = (dmj)dmz.a(dmj);
        b = gip.a("https://api.spotify.com");
        b.a((new StringBuilder("SpotifyAndroid/")).append(((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a.versionName).toString());
        e = gip.a("https://accounts.spotify.com");
        e.a("Authorization", grd.a(s, s1));
        d = ((giq)dmz.a(giq)).a(context);
        a = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    public static exr a(Context context, String s, String s1, gip gip)
    {
        return new exr(context, s, s1, gip);
    }

    private String a()
    {
        if (d.f(c))
        {
            try
            {
                JSONArray jsonarray = d.a(c, new JSONArray());
                if (jsonarray.length() == 2)
                {
                    if (jsonarray.getLong(1) >= SystemClock.elapsedRealtime())
                    {
                        return jsonarray.getString(0);
                    }
                } else
                {
                    Assertion.b("Token array is not of length 2");
                }
            }
            catch (JSONException jsonexception)
            {
                Logger.c("Stored token array is malformed", new Object[0]);
            }
        }
        return null;
    }

    public final void a(String s, HashMap hashmap, dmi dmi)
    {
        a(s, hashmap, dmi, true);
    }

    final void a(String s, HashMap hashmap, dmi dmi, boolean flag)
    {
        s = new exs(s, hashmap, dmi, flag) {

            final String a;
            final HashMap b;
            final dmi c;
            final boolean d;
            final exr e;

            public final void a(String s1)
            {
                e.b.a("Authorization", (new StringBuilder("Bearer ")).append(s1).toString());
                e.b.a(a, b, new dmi(this) {

                    private _cls2 a;

                    public final void a(int i, Object obj)
                    {
                        obj = (String)obj;
                        if (obj != null)
                        {
                            a.c.a(i, obj);
                            return;
                        } else
                        {
                            a.c.a(new IllegalArgumentException("Response is null"), "Response is null");
                            return;
                        }
                    }

                    public final void a(Throwable throwable, String s)
                    {
                        if (s != null && a.d && a.e.a(s))
                        {
                            throwable = a.e;
                            ((exr) (throwable)).d.b().a(((exr) (throwable)).c).a();
                            a.e.a(a.a, a.b, a.c, false);
                            return;
                        } else
                        {
                            a.c.a(throwable, s);
                            return;
                        }
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
            }

            public final void a(Throwable throwable, String s1)
            {
                c.a(throwable, s1);
            }

            
            {
                e = exr.this;
                a = s;
                b = hashmap;
                c = dmi1;
                d = flag;
                super();
            }
        };
        hashmap = a();
        if (hashmap != null)
        {
            s.a(hashmap);
            return;
        } else
        {
            hashmap = new HashMap();
            hashmap.put("grant_type", "client_credentials");
            e.b("/api/token", hashmap, new dmi(s) {

                private exs a;
                private exr b;

                public final void a(int i, Object obj)
                {
                    obj = (String)obj;
                    exr exr1;
                    String s1;
                    long l;
                    obj = (ClientCredentialsResponse)b.a.readValue(((String) (obj)), com/spotify/mobile/android/spotlets/openaccess/spotifywebapi/ClientCredentialsResponse);
                    exr1 = b;
                    s1 = ((ClientCredentialsResponse) (obj)).getAccessToken();
                    l = ((ClientCredentialsResponse) (obj)).getExpiresIn().longValue();
                    try
                    {
                        JSONArray jsonarray = new JSONArray();
                        jsonarray.put(0, s1);
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

                public final void a(Throwable throwable, String s1)
                {
                    a.a(throwable, s1);
                }

            
            {
                b = exr.this;
                a = exs1;
                super();
            }
            });
            return;
        }
    }

    final boolean a(String s)
    {
        int i;
        boolean flag;
        try
        {
            s = (ErrorResponse)a.readValue(s, com/spotify/mobile/android/spotlets/openaccess/spotifywebapi/ErrorResponse);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (s.getError() == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        i = s.getError().a;
        if (i == 401)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return true;
        }
        return false;
    }
}
