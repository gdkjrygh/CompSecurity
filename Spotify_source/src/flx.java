// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.sso.AuthorizationResponse;

public final class flx extends AuthorizationResponse
{

    private flx(com.spotify.mobile.android.sso.AuthorizationResponse.Type type, String s, String s1, String s2, int i)
    {
        super(type, s, s1, s2, i);
    }

    flx(com.spotify.mobile.android.sso.AuthorizationResponse.Type type, String s, String s1, String s2, int i, byte byte0)
    {
        this(type, s, s1, s2, i);
    }

    public static flx a(Uri uri)
    {
        String s = null;
        fly fly1 = new fly((byte)0);
        if (uri == null)
        {
            fly1.a = com.spotify.mobile.android.sso.AuthorizationResponse.Type.d;
            return fly1.a();
        }
        String s1 = uri.getQueryParameter("error");
        if (s1 != null)
        {
            fly1.d = s1;
            fly1.a = com.spotify.mobile.android.sso.AuthorizationResponse.Type.c;
            return fly1.a();
        }
        s1 = uri.getQueryParameter("code");
        if (s1 != null)
        {
            fly1.b = s1;
            fly1.a = com.spotify.mobile.android.sso.AuthorizationResponse.Type.a;
            return fly1.a();
        }
        uri = uri.getEncodedFragment();
        if (uri != null && uri.length() > 0)
        {
            String as[] = uri.split("&");
            int j = as.length;
            int i = 0;
            Uri uri1;
            for (uri = null; i < j; uri = uri1)
            {
                String as1[] = as[i].split("=");
                String s2 = s;
                uri1 = uri;
                if (as1.length == 2)
                {
                    if (as1[0].startsWith("access_token"))
                    {
                        uri = Uri.decode(as1[1]);
                    }
                    s2 = s;
                    uri1 = uri;
                    if (as1[0].startsWith("expires_in"))
                    {
                        s2 = Uri.decode(as1[1]);
                        uri1 = uri;
                    }
                }
                i++;
                s = s2;
            }

            fly1.c = uri;
            if (s != null)
            {
                try
                {
                    fly1.e = Integer.parseInt(s);
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri) { }
            }
            fly1.a = com.spotify.mobile.android.sso.AuthorizationResponse.Type.b;
            return fly1.a();
        } else
        {
            fly1.a = com.spotify.mobile.android.sso.AuthorizationResponse.Type.e;
            return fly1.a();
        }
    }
}
