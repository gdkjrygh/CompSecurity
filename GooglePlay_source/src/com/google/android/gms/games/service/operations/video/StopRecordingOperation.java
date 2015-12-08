// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.video;

import android.content.Context;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.Lockable;
import com.google.android.gms.games.broker.VideoAgent;

public final class StopRecordingOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    private final String mPackageName;

    public StopRecordingOperation(String s)
    {
        mPackageName = s;
    }

    public final void execute(Context context, DataBroker databroker)
    {
        context = mPackageName;
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mVideoAgent
        });
        VideoAgent videoagent = databroker.mVideoAgent;
        boolean flag;
        boolean flag1;
        if (videoagent.mRecordingSession != null && videoagent.mRecordingSession.wasThirdPartyLaunch)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!videoagent.isRecording() && videoagent.mVideoRecordingOverlay == null)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (!flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        if (videoagent.isStopping() || context == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        if (context.equals(videoagent.mRecordingSession.mPackageName))
        {
            VideoAgent.sendMessage(videoagent.mProcessingHandler, 3, 1);
        }
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mVideoAgent
        });
        return;
        context;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mVideoAgent
        });
        throw context;
    }

    public final void postExecute()
    {
    }
}
