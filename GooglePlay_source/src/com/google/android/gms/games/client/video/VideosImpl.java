// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client.video;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.client.IPlayGamesService;
import com.google.android.gms.games.client.PlayGamesClientImpl;
import com.google.android.gms.games.video.VideoConfiguration;

// Referenced classes of package com.google.android.gms.games.client.video:
//            Videos

public final class VideosImpl
    implements Videos
{

    public VideosImpl()
    {
    }

    public final PendingResult launchGameForRecording(final GoogleApiClient final_googleapiclient, final String gameId, final String packageName, VideoConfiguration videoconfiguration)
    {
        return final_googleapiclient.execute(new com.google.android.gms.games.client.PlayGames.BasePlayGamesApiMethodImpl(videoconfiguration) {

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
                client = (PlayGamesClientImpl)client;
                String s = gameId;
                String s1 = packageName;
                VideoConfiguration videoconfiguration1 = configuration;
                ((IPlayGamesService)client.getService()).launchGameForRecording(new com.google.android.gms.games.client.PlayGamesClientImpl.StartRecordingBinderCallback(this), s, s1, videoconfiguration1);
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
