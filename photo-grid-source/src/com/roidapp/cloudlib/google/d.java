// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.a;
import com.google.android.gms.auth.b;
import com.roidapp.baselib.c.aj;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.google:
//            GoogleAuthActivity, e, f, g

final class d
    implements Runnable
{

    private WeakReference a;
    private String b;

    d(GoogleAuthActivity googleauthactivity, String s)
    {
        a = new WeakReference(googleauthactivity);
        b = s;
    }

    public final void run()
    {
        Object obj;
        obj = (new StringBuilder()).append("oauth2:").append(" https://www.googleapis.com/auth/userinfo.profile").toString();
        obj = (new StringBuilder()).append(((String) (obj))).append(" https://www.googleapis.com/auth/userinfo.email").toString();
        Object obj2 = com.google.android.gms.auth.b.a(aj.a(), b, ((String) (obj)));
        obj = null;
_L2:
        GoogleAuthActivity googleauthactivity;
        googleauthactivity = (GoogleAuthActivity)a.get();
        if (googleauthactivity != null)
        {
            com.roidapp.cloudlib.common.a.c(aj.a(), ((String) (obj2)));
            if (!TextUtils.isEmpty(((CharSequence) (obj2))))
            {
                break MISSING_BLOCK_LABEL_168;
            }
            if (obj == null || com.roidapp.cloudlib.google.GoogleAuthActivity.a(googleauthactivity))
            {
                break; /* Loop/switch isn't completed */
            }
            com.roidapp.cloudlib.google.GoogleAuthActivity.b(googleauthactivity);
            googleauthactivity.runOnUiThread(new e(this, googleauthactivity, ((android.content.Intent) (obj))));
        }
        return;
        obj2;
        obj = ((com.google.android.gms.auth.d) (obj2)).a();
        ((com.google.android.gms.auth.d) (obj2)).printStackTrace();
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        ((IOException) (obj1)).printStackTrace();
        obj1 = null;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        ((a) (obj1)).printStackTrace();
        obj1 = null;
        obj2 = null;
        if (true) goto _L2; else goto _L1
_L1:
        googleauthactivity.runOnUiThread(new f(this, googleauthactivity));
        return;
        obj1 = new Bundle();
        obj2 = (HttpURLConnection)(new URL((new StringBuilder("https://www.googleapis.com/oauth2/v1/userinfo?alt=json&access_token=")).append(((String) (obj2))).toString())).openConnection();
        if (((HttpURLConnection) (obj2)).getResponseCode() != 200) goto _L4; else goto _L3
_L3:
        String s1;
        Object obj4;
        obj2 = ((HttpURLConnection) (obj2)).getInputStream();
        obj4 = new JSONObject(com.roidapp.cloudlib.google.GoogleAuthActivity.a(((InputStream) (obj2))));
        String s = ((JSONObject) (obj4)).optString("email");
        s1 = ((JSONObject) (obj4)).optString("gender");
        obj4 = ((JSONObject) (obj4)).optString("locale");
        ((Bundle) (obj1)).putString("email", s);
        if (s1 == null) goto _L6; else goto _L5
_L5:
        if (!s1.equalsIgnoreCase("male")) goto _L8; else goto _L7
_L7:
        ((Bundle) (obj1)).putString("gender", "1");
_L6:
        ((Bundle) (obj1)).putString("locale", ((String) (obj4)));
        ((InputStream) (obj2)).close();
_L4:
        googleauthactivity.runOnUiThread(new g(this, googleauthactivity, ((Bundle) (obj1))));
        return;
_L8:
        if (!s1.equalsIgnoreCase("female")) goto _L6; else goto _L9
_L9:
        ((Bundle) (obj1)).putString("gender", "0");
          goto _L6
        Object obj3;
        obj3;
        ((IOException) (obj3)).printStackTrace();
          goto _L4
        obj3;
        ((JSONException) (obj3)).printStackTrace();
          goto _L4
    }
}
