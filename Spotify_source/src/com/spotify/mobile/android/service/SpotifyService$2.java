// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import android.os.Bundle;
import com.facebook.AppEventsLogger;
import com.spotify.mobile.android.util.Assertion;
import gjb;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.spotify.mobile.android.service:
//            SpotifyService

final class c
    implements Runnable
{

    private String a;
    private String b;
    private String c;
    private SpotifyService d;

    public final void run()
    {
        if (SpotifyService.o(d) != null)
        {
            gjb gjb1 = SpotifyService.o(d);
            String s = a;
            String s2 = b;
            String s3 = c;
            if (com.spotify.mobile.android.util..O.toString().equals(s) && com.spotify.mobile.android.util.ent.aB.toString().equals(s2))
            {
                AppEventsLogger.a(gjb1.a);
                return;
            }
            if (com.spotify.mobile.android.util..ae.toString().equals(s))
            {
                try
                {
                    String s1 = (new JSONObject(s3)).getString("account-type");
                    Bundle bundle = new Bundle();
                    bundle.putString("fb_registration_method", s1);
                    if (gjb1.b == null)
                    {
                        gjb1.b = AppEventsLogger.b(gjb1.a);
                    }
                    gjb1.b.a("fb_mobile_complete_registration", bundle);
                    return;
                }
                catch (JSONException jsonexception)
                {
                    Assertion.a("mangled json in clientevent", jsonexception);
                }
                return;
            }
        }
    }

    (SpotifyService spotifyservice, String s, String s1, String s2)
    {
        d = spotifyservice;
        a = s;
        b = s1;
        c = s2;
        super();
    }
}
