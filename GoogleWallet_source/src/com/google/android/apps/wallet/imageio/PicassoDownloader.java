// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.imageio;

import android.net.Uri;
import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.OkHttpDownloader;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class PicassoDownloader extends OkHttpDownloader
{

    private static final String TAG = com/google/android/apps/wallet/imageio/PicassoDownloader.getSimpleName();
    private final String accountName;
    private final String authScope;
    private final WalletGoogleAuthUtil authUtil;
    private final Set authoritiesRequiringAuth;
    private final AtomicReference cachedAuthToken = new AtomicReference();

    PicassoDownloader(OkHttpClient okhttpclient, Set set, WalletGoogleAuthUtil walletgoogleauthutil, String s, String s1, File file)
    {
        super(okhttpclient);
        authoritiesRequiringAuth = set;
        authUtil = walletgoogleauthutil;
        accountName = s;
        authScope = s1;
        set = new File(file, "picasso-cache");
        try
        {
            okhttpclient.setCache(new Cache(set, 0x1000000L));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OkHttpClient okhttpclient)
        {
            WLog.e(TAG, "could not set up Picasso response cache", okhttpclient);
        }
    }

    private void clearAuthToken(String s)
        throws IOException
    {
        if (!cachedAuthToken.compareAndSet(s, null))
        {
            break MISSING_BLOCK_LABEL_28;
        }
        WLog.i(TAG, "Clearing cached auth token");
        authUtil.clearToken(s);
        return;
        s;
        WLog.e(TAG, "Unexpected exception while clearing token", s);
        return;
        s;
        WLog.e(TAG, "Unexpected exception while clearing token", s);
        return;
    }

    private String getAuthToken()
        throws IOException
    {
        String s = (String)cachedAuthToken.get();
        if (s != null)
        {
            return s;
        }
        String s1 = authUtil.getToken(accountName, authScope);
        if (cachedAuthToken.compareAndSet(null, s1))
        {
            return s1;
        }
        try
        {
            s1 = (String)cachedAuthToken.get();
        }
        catch (UserRecoverableAuthException userrecoverableauthexception)
        {
            throw new IOException(userrecoverableauthexception);
        }
        catch (GoogleAuthException googleauthexception)
        {
            throw new IOException(googleauthexception);
        }
        return s1;
    }

    private static boolean is401(com.squareup.picasso.Downloader.ResponseException responseexception)
    {
        return responseexception.getMessage().startsWith(Integer.toString(401));
    }

    public final com.squareup.picasso.Downloader.Response load(Uri uri, boolean flag)
        throws IOException
    {
        String s = getAuthToken();
        com.squareup.picasso.Downloader.Response response;
        try
        {
            response = super.load(uri, flag);
        }
        catch (com.squareup.picasso.Downloader.ResponseException responseexception)
        {
            WLog.efmt(TAG, responseexception, "Could not load %s", new Object[] {
                uri
            });
            if (is401(responseexception) && authoritiesRequiringAuth.contains(uri.getAuthority()))
            {
                clearAuthToken(s);
                WLog.i(TAG, "Retrying authorized request");
                return super.load(uri, flag);
            } else
            {
                throw responseexception;
            }
        }
        return response;
    }

    protected final HttpURLConnection openConnection(Uri uri)
        throws IOException
    {
        HttpURLConnection httpurlconnection = super.openConnection(uri);
        httpurlconnection.addRequestProperty("Cache-Control", "max-stale=2147483647");
        if (authoritiesRequiringAuth.contains(uri.getAuthority()))
        {
            uri = String.valueOf(getAuthToken());
            if (uri.length() != 0)
            {
                uri = "Bearer ".concat(uri);
            } else
            {
                uri = new String("Bearer ");
            }
            httpurlconnection.setRequestProperty("Authorization", uri);
        }
        return httpurlconnection;
    }

}
