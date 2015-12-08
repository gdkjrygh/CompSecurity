// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetManager

public final class SwitchTarget
{
    public static interface SwitchTargetInterface
    {

        public abstract void onSetToNewTarget(String s);
    }


    private static final String TAG = "nf_mdxSwitchTarget";
    private boolean mBeginSwitchTarget;
    SwitchTargetInterface mCallback;
    private String mNewUuid;
    private int mStartTime;
    private TargetManager mTargeManger;
    private int mTrackId;
    private com.netflix.mediaclient.util.WebApiUtils.VideoIds mVideoIds;

    public SwitchTarget(TargetManager targetmanager, SwitchTargetInterface switchtargetinterface)
    {
        mTargeManger = targetmanager;
        mCallback = switchtargetinterface;
    }

    public void startSwitch(String s, String s1, com.netflix.mediaclient.util.WebApiUtils.VideoIds videoids, int i, int j)
    {
        if (mBeginSwitchTarget)
        {
            Log.e("nf_mdxSwitchTarget", "switching already undergoing");
        }
        if (StringUtils.isEmpty(s))
        {
            Log.e("nf_mdxSwitchTarget", "current target is not a mdx target");
            return;
        } else
        {
            mBeginSwitchTarget = true;
            mNewUuid = s1;
            mVideoIds = videoids;
            mStartTime = i;
            mTrackId = j;
            mTargeManger.playerStop(s);
            return;
        }
    }

    public void targetPlaybackStopped(String s)
    {
        if (!mBeginSwitchTarget)
        {
            return;
        }
        mCallback.onSetToNewTarget(mNewUuid);
        if (StringUtils.isNotEmpty(mNewUuid))
        {
            if (Log.isLoggable("nf_mdxSwitchTarget", 3))
            {
                Log.d("nf_mdxSwitchTarget", (new StringBuilder()).append("start playback on ").append(mNewUuid).append(", ").append(mVideoIds.catalogIdUrl).append(", ").append(mVideoIds.episodeIdUrl).append(", ").append(mStartTime).toString());
            }
            mTargeManger.playerPlay(mNewUuid, mVideoIds.catalogIdUrl, mTrackId, mVideoIds.episodeIdUrl, mStartTime);
        }
        mBeginSwitchTarget = false;
    }
}
