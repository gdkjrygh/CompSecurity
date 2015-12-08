// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.sso;

import android.net.Uri;
import android.os.Message;
import flu;
import flx;
import gqv;
import grq;
import grt;
import grv;
import java.io.IOException;
import java.net.HttpCookie;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.spotify.mobile.android.sso:
//            AuthorizationActivity, AuthorizationResponse

final class a
    implements gqv
{

    private HttpCookie a;
    private AuthorizationActivity b;

    public final void a(grq grq, IOException ioexception)
    {
        AuthorizationActivity.a(b).obtainMessage(2, "AUTHENTICATION_SERVICE_UNKNOWN_ERROR").sendToTarget();
    }

    public final void a(grt grt1)
    {
        String s = grt1.e().f();
        grt1.e().close();
        if (grt1.b() || grt1.g())
        {
            Object obj = "";
            if (grt1.g())
            {
                grt1 = grt1.a("Location", "");
            } else
            {
                try
                {
                    grt1 = (new JSONObject(s)).optString("redirect", "");
                }
                // Misplaced declaration of an exception variable
                catch (grt grt1)
                {
                    grt1 = ((grt) (obj));
                }
            }
            grt1 = flx.a(Uri.parse(grt1));
            obj = ((AuthorizationResponse) (grt1)).a;
            if (obj == pe.b || obj == pe.a || obj == pe.c)
            {
                AuthorizationActivity.a(b).obtainMessage(0, grt1).sendToTarget();
                return;
            } else
            {
                AuthorizationActivity.a(b).obtainMessage(1, a).sendToTarget();
                return;
            }
        } else
        {
            AuthorizationActivity.a(b).obtainMessage(2, AuthorizationActivity.a(s)).sendToTarget();
            return;
        }
    }

    pe(AuthorizationActivity authorizationactivity, HttpCookie httpcookie)
    {
        b = authorizationactivity;
        a = httpcookie;
        super();
    }
}
