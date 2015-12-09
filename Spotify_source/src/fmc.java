// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public final class fmc extends fmb
{

    public fmc()
    {
    }

    public final Intent a(Bundle bundle)
    {
        Intent intent = new Intent();
        intent.putExtra("REPLY", bundle);
        return intent;
    }

    public final Intent a(String s)
    {
        Intent intent = new Intent();
        intent.putExtra("ERROR", s);
        return intent;
    }

    public final Bundle a(String s, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putString("ACCESS_TOKEN", s);
        bundle.putString("RESPONSE_TYPE", "token");
        bundle.putInt("EXPIRES_IN", i);
        return bundle;
    }

    public final String a(Intent intent)
    {
        return intent.getStringExtra("CLIENT_ID");
    }

    public final Bundle b(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("AUTHORIZATION_CODE", s);
        bundle.putString("RESPONSE_TYPE", "code");
        return bundle;
    }

    public final String b(Intent intent)
    {
        return intent.getStringExtra("REDIRECT_URI");
    }

    public final com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType c(Intent intent)
    {
        intent = intent.getStringExtra("RESPONSE_TYPE");
        if (intent != null)
        {
            if (intent.equals("token"))
            {
                return com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType.a;
            }
            if (intent.equals("code"))
            {
                return com.spotify.mobile.android.sso.AuthorizationRequest.ResponseType.b;
            }
        }
        return null;
    }

    public final String[] d(Intent intent)
    {
        return intent.getStringArrayExtra("SCOPES");
    }
}
