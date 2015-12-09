// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.auth.BasicScheme;

public class dcj
{

    public dcj()
    {
    }

    public static HttpRequestBase a(Uri uri, dbu dbu1, dch dch1, String s)
    {
        dbt.a(dcj, "buildRefreshTokenRequest:uri=[%s],info=[%s],option=[%s],refresh_token=[%s]", new Object[] {
            uri, dbu1, dch1, s
        });
        dci dci1 = new dci();
        dci1.a(dch1.c);
        dci1.a("grant_type", "refresh_token");
        dci1.a("client_id", dbu1.a);
        dci1.a("client_secret", dbu1.b);
        dci1.a("redirect_uri", dbu1.c);
        dci1.a("scope", dbu1.d);
        dci1.a("refresh_token", s);
        dci1.a("service_entity", dch1.a);
        uri = new HttpPost(uri.toString());
        uri.setEntity(dci1.a("UTF-8"));
        dbu1 = new UsernamePasswordCredentials(dbu1.a, dbu1.b);
        uri.addHeader((new BasicScheme()).authenticate(dbu1, uri));
        return uri;
    }

    public static HttpRequestBase a(Uri uri, dbu dbu1, dch dch1, String s, String s1)
    {
        dbt.a(dcj, "buildTokenByGrantCodeRequest:uri=[%s],info=[%s],option=[%s],grantCode=[%s],duid=[%s]", new Object[] {
            uri, dbu1, dch1, s, s1
        });
        dci dci1 = new dci();
        dci1.a(dch1.c);
        dci1.a("grant_type", "authorization_code");
        dci1.a("client_id", dbu1.a);
        dci1.a("client_secret", dbu1.b);
        dci1.a("redirect_uri", dbu1.c);
        dci1.a("scope", dbu1.d);
        dci1.a("code", s);
        dci1.a("service_entity", dch1.a);
        if (!TextUtils.isEmpty(s1))
        {
            dci1.a("duid", s1);
        }
        uri = new HttpPost(uri.toString());
        uri.setEntity(dci1.a("UTF-8"));
        dbu1 = new UsernamePasswordCredentials(dbu1.a, dbu1.b);
        uri.addHeader((new BasicScheme()).authenticate(dbu1, uri));
        return uri;
    }

    public static HttpRequestBase a(Uri uri, dbu dbu1, String s)
    {
        dbt.a(dcj, "buildValidateTokenRequest:uri=[%s],info=[%s],token=[%s],return_sid=[%s]", new Object[] {
            uri, dbu1, s, "true"
        });
        uri = uri.buildUpon();
        uri.appendPath(s);
        uri = new HttpGet(uri.build().toString());
        dbu1 = new UsernamePasswordCredentials(dbu1.a, dbu1.b);
        uri.addHeader((new BasicScheme()).authenticate(dbu1, uri));
        return uri;
    }
}
