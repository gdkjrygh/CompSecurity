// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.IGamesService;
import com.google.android.gms.games.video.VideoConfiguration;
import com.google.android.gms.games.video.Videos;

public final class VideosImpl
    implements Videos
{

    public VideosImpl()
    {
    }

    public final PendingResult launchGameForRecordingRestricted(final GoogleApiClient final_googleapiclient, final String gameId, final String packageName, VideoConfiguration videoconfiguration)
    {
        return final_googleapiclient.execute(new com.google.android.gms.games.Games.BaseGamesApiMethodImpl(videoconfiguration) {

            final VideosImpl this$0;
            final VideoConfiguration val$configuration;
            final String val$gameId;
            final String val$packageName;

            public final volatile Result createFailedResult(Status status)
            {
                return status;
            }

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = gameId;
                String s1 = packageName;
                VideoConfiguration videoconfiguration1 = configuration;
                ((IGamesService)client.getService()).launchGameForRecordingRestricted(new com.google.android.gms.games.internal.GamesClientImpl.StartRecordingBinderCallback(this), s, s1, videoconfiguration1);
            }

            
            {
                this$0 = VideosImpl.this;
                gameId = s;
                packageName = s1;
                configuration = videoconfiguration;
                super(final_googleapiclient);
            }
        });
    }
}
