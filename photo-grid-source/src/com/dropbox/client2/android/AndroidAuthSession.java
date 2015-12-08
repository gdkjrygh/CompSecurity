// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.dropbox.client2.session.AbstractSession;
import com.dropbox.client2.session.AccessTokenPair;
import com.dropbox.client2.session.AppKeyPair;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.dropbox.client2.android:
//            AuthActivity

public class AndroidAuthSession extends AbstractSession
{

    public AndroidAuthSession(AppKeyPair appkeypair)
    {
        super(appkeypair);
    }

    public AndroidAuthSession(AppKeyPair appkeypair, AccessTokenPair accesstokenpair)
    {
        super(appkeypair, accesstokenpair);
    }

    public AndroidAuthSession(AppKeyPair appkeypair, com.dropbox.client2.session.Session.AccessType accesstype)
    {
        super(appkeypair, accesstype);
    }

    public AndroidAuthSession(AppKeyPair appkeypair, com.dropbox.client2.session.Session.AccessType accesstype, AccessTokenPair accesstokenpair)
    {
        super(appkeypair, accesstype, accesstokenpair);
    }

    public AndroidAuthSession(AppKeyPair appkeypair, String s)
    {
        super(appkeypair, s);
    }

    public boolean authenticationSuccessful()
    {
        Object obj = AuthActivity.result;
        if (obj != null)
        {
            String s = ((Intent) (obj)).getStringExtra("ACCESS_TOKEN");
            String s1 = ((Intent) (obj)).getStringExtra("ACCESS_SECRET");
            obj = ((Intent) (obj)).getStringExtra("UID");
            if (s != null && !s.equals("") && s1 != null && !s1.equals("") && obj != null && !((String) (obj)).equals(""))
            {
                return true;
            }
        }
        return false;
    }

    public String finishAuthentication()
    {
        Object obj = AuthActivity.result;
        if (obj == null)
        {
            throw new IllegalStateException();
        }
        String s = ((Intent) (obj)).getStringExtra("ACCESS_TOKEN");
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("Invalid result intent passed in. Missing access token.");
        }
        String s1 = ((Intent) (obj)).getStringExtra("ACCESS_SECRET");
        if (s1 == null || s1.length() == 0)
        {
            throw new IllegalArgumentException("Invalid result intent passed in. Missing access secret.");
        }
        obj = ((Intent) (obj)).getStringExtra("UID");
        if (obj == null || ((String) (obj)).length() == 0)
        {
            throw new IllegalArgumentException("Invalid result intent passed in. Missing uid.");
        }
        if (s.equals("oauth2:"))
        {
            setOAuth2AccessToken(s1);
            return ((String) (obj));
        } else
        {
            setAccessTokenPair(new AccessTokenPair(s, s1));
            return ((String) (obj));
        }
    }

    public void startAuthentication(Context context)
    {
        Object obj = getAppKeyPair();
        if (!AuthActivity.checkAppBeforeAuth(context, ((AppKeyPair) (obj)).key, true))
        {
            return;
        }
        AuthActivity.setAuthParams(((AppKeyPair) (obj)).key, ((AppKeyPair) (obj)).secret, null, null);
        obj = new Intent(context, com/dropbox/client2/android/AuthActivity);
        if (!(context instanceof Activity))
        {
            ((Intent) (obj)).addFlags(0x10000000);
        }
        context.startActivity(((Intent) (obj)));
    }

    public void startOAuth2Authentication(Context context)
    {
        startOAuth2Authentication(context, null);
    }

    public void startOAuth2Authentication(Context context, String s, String as[])
    {
        AppKeyPair appkeypair = getAppKeyPair();
        if (!AuthActivity.checkAppBeforeAuth(context, appkeypair.key, true))
        {
            return;
        }
        if (as != null && Arrays.asList(as).contains(s))
        {
            throw new IllegalArgumentException("desiredUid cannot be present in alreadyAuthedUids");
        }
        AuthActivity.setAuthParams(appkeypair.key, null, s, as);
        s = new Intent(context, com/dropbox/client2/android/AuthActivity);
        if (!(context instanceof Activity))
        {
            s.addFlags(0x10000000);
        }
        context.startActivity(s);
    }

    public void startOAuth2Authentication(Context context, String as[])
    {
        startOAuth2Authentication(context, null, as);
    }

    public void unlink()
    {
        super.unlink();
        AuthActivity.result = null;
    }
}
