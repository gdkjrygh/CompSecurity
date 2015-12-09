// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.logging;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.internal.GamesLog;

public final class GamesLogHelper
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

    private final GoogleApiClient mApiClient;
    private boolean mIsUsable;

    public GamesLogHelper(Context context)
    {
        mIsUsable = true;
        Object obj = com.google.android.gms.games.client.PlayGames.PlayGamesOptions.builder();
        obj.unauthenticated = true;
        obj = ((com.google.android.gms.games.client.PlayGames.PlayGamesOptions.Builder) (obj)).build();
        mApiClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context, this, this)).addApi(PlayGames.API, ((com.google.android.gms.common.api.Api.ApiOptions.HasOptions) (obj))).build();
    }

    public static com.google.android.gms.games.proto.PlayGames.PlaylogGamesRequestInfo getRequestInfo(Context context, String s, String s1)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesRequestInfo playloggamesrequestinfo = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesRequestInfo();
        if (s1 != null)
        {
            playloggamesrequestinfo.applicationId = s1;
        }
        playloggamesrequestinfo.instanceId = s;
        playloggamesrequestinfo.clientVersion = "8283000";
        playloggamesrequestinfo.modulesVersion = 0x208a140L;
        try
        {
            playloggamesrequestinfo.appVersionCode = context.getPackageManager().getPackageInfo(s, 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("GamesLogHelper", (new StringBuilder("Could not find package info for package: ")).append(s).toString());
            return playloggamesrequestinfo;
        }
        return playloggamesrequestinfo;
    }

    public final void logEvent(String s, com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension)
    {
        mApiClient.connect();
        PlayGames.logEvent(mApiClient, s, com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension.toByteArray(playloggamesextension));
    }

    public final void onConnected(Bundle bundle)
    {
        mApiClient.disconnect();
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        GamesLog.w("GamesLogHelper", (new StringBuilder("Failed to log event: ")).append(connectionresult).toString());
    }

    public final void onConnectionSuspended(int i)
    {
    }
}
