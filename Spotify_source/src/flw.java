// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;
import java.util.Arrays;

public final class flw extends AuthorizationRequest
{

    public flw(String s, com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType responsetype, String s1, ClientIdentity clientidentity, String as[])
    {
        super(s, responsetype, s1, clientidentity, as);
    }

    public final Uri a()
    {
        android.net.Uri.Builder builder;
        android.net.Uri.Builder builder1;
        builder = new android.net.Uri.Builder();
        builder1 = builder.scheme("https").authority("accounts.spotify.com").appendPath("authorize").appendQueryParameter("client_id", super.b);
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType.values().length];
                try
                {
                    a[com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[super.c.ordinal()];
        JVM INSTR tableswitch 1 2: default 68
    //                   1 172
    //                   2 178;
           goto _L1 _L2 _L3
_L1:
        Object obj = "unknown";
_L5:
        builder1.appendQueryParameter("response_type", ((String) (obj))).appendQueryParameter("redirect_uri", super.a).appendQueryParameter("nosignout", Boolean.TRUE.toString());
        obj = super.d;
        builder.appendQueryParameter("client_app_id", String.format("%s:%s", new Object[] {
            ((ClientIdentity) (obj)).a, ((ClientIdentity) (obj)).b
        }));
        obj = super.e;
        if (obj != null && obj.length > 0)
        {
            builder.appendQueryParameter("scope", ctw.a(" ").a(Arrays.asList(((Object []) (obj)))));
        }
        return builder.build();
_L2:
        obj = "token";
        continue; /* Loop/switch isn't completed */
_L3:
        obj = "code";
        if (true) goto _L5; else goto _L4
_L4:
    }
}
