// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import android.text.TextUtils;
import com.google.android.libraries.translate.e.c;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.o;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.logging.f;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;

// Referenced classes of package com.google.android.libraries.translate.core:
//            Singleton, t, TwsResponseException, m

public final class l
{

    public l()
    {
    }

    public static m a(String s, String s1, String s2, String s3)
    {
        m m1;
        f f1;
        m1 = null;
        f1 = Singleton.b().b(s1, s2);
        BasicNameValuePair basicnamevaluepair;
        c c1;
        basicnamevaluepair = new BasicNameValuePair("q", URLEncoder.encode(s, "UTF-8"));
        StringBuilder stringbuilder = t.a();
        stringbuilder.append("/translate_a/single?client=");
        stringbuilder.append(com.google.android.libraries.translate.core.Singleton.c());
        stringbuilder.append("&dt=t&dt=ld&dt=qc&dt=rm&dt=bd&dj=1");
        c1 = (new c(stringbuilder.toString())).a("sl", s1).a("tl", s2).a("hl", Locale.getDefault().toString()).a("ie", "UTF-8").a("oe", "UTF-8").a("iid", o.b()).a(basicnamevaluepair);
        if (TextUtils.isEmpty(s3)) goto _L2; else goto _L1
_L1:
        if (s3.charAt(0) != '&') goto _L4; else goto _L3
_L3:
        Object obj = s3.substring(1);
_L5:
        c1.a(obj);
_L2:
        Object obj1 = c1.a(true);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        c1.a.remove(basicnamevaluepair);
        obj = c1.a(new BasicNameValuePair("q", s)).a(false);
        ((HttpRequestBase) (obj)).getURI();
        obj = d.b().execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        obj1 = d.b(((HttpResponse) (obj)));
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            break MISSING_BLOCK_LABEL_275;
        }
_L6:
        f1.a(s.length(), s3, null);
        return m1;
_L4:
        obj = s3;
          goto _L5
        s;
        throw new TwsResponseException(s1, s2, -101);
        m1 = m.a(s1, ((String) (obj1)));
          goto _L6
        s;
        s = new TwsResponseException(s1, s2, -201);
_L8:
        Singleton.b().a(s.getErrorCode(), s.getCauseCode(), s.getFromLanguage(), s.getToLanguage());
        throw s;
        s;
        s = new TwsResponseException(s1, s2, -2);
        continue; /* Loop/switch isn't completed */
        s;
        obj = null;
_L9:
        int i;
        if (obj != null)
        {
            i = -1000 - ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        } else
        {
            i = -321;
        }
        s = new TwsResponseException(s1, s2, i);
        if (true) goto _L8; else goto _L7
_L7:
        s;
          goto _L9
    }
}
