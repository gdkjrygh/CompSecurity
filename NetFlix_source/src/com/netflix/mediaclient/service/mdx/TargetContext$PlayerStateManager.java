// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.mdx.message.target.PlayerState;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetContext, NotifierInterface

class mTimeMarked4StateTransition
{

    private static final long TIMEOUT_WAITING_FOR_STATE_CHANGE = 30000L;
    private static final long TIME_WINDOW_IGNORE_VOLUME = 3000L;
    private String mCatalogId;
    private String mCurrentState;
    private int mDuration;
    private String mEpisodeId;
    private int mExpectedVolume;
    private boolean mTargetStateTransitionStarted;
    private int mTime;
    private long mTimeMarked4StateTransition;
    private long mTimeSetVolume;
    private int mVolume;
    final TargetContext this$0;

    private void notifyState(String s, PlayerState playerstate)
    {
        mTime = playerstate.getTime();
        if (System.currentTimeMillis() > mTimeSetVolume + 3000L)
        {
            mVolume = playerstate.getVolume();
        } else
        {
            mVolume = mExpectedVolume;
            Log.d("nf_mdx", "TargetContext: PlayerStateManager overide volume");
        }
        if (Log.isLoggable("nf_mdx", 3))
        {
            Log.d("nf_mdx", (new StringBuilder()).append("TargetContext: PlayerStateManager notifyState ").append(mCurrentState).append(", volume = ").append(mVolume).append(", time = ").append(mTime).toString());
        }
        TargetContext.access$1500(TargetContext.this).state(s, mCurrentState, mTime, mVolume);
        if (!StringUtils.safeEquals(mCatalogId, playerstate.getCatalogId()) || !StringUtils.safeEquals(mEpisodeId, playerstate.getEpisodeId()) || mDuration != playerstate.getDuration())
        {
            mCatalogId = playerstate.getCatalogId();
            mEpisodeId = playerstate.getEpisodeId();
            mDuration = playerstate.getDuration();
            TargetContext.access$1500(TargetContext.this).movieMetaData(s, mCatalogId, mEpisodeId, mDuration);
        }
    }

    public void changeState(PlayerState playerstate)
    {
        if (playerstate != null)
        {
            String s;
            String s1;
            if (StringUtils.isNotEmpty(TargetContext.access$1200(TargetContext.this)))
            {
                s = TargetContext.access$1200(TargetContext.this);
            } else
            {
                s = TargetContext.access$900(TargetContext.this);
            }
            s1 = playerstate.getCurrentState();
            if (StringUtils.isEmpty(s1))
            {
                Log.e("nf_mdx", "TargetContext: changeState, new state is null");
                return;
            }
            String s2 = playerstate.getPostplayState();
            if ("PLAYING".equals(s1) && !"PAUSE".equals(mCurrentState) && !"prepause".equals(mCurrentState) && !"preseek".equals(mCurrentState) && !"PLAYING".equals(mCurrentState))
            {
                TargetContext.access$1300(TargetContext.this, s);
            } else
            if ("STOP".equals(s1) || "END_PLAYBACK".equals(s1) || "FATAL_ERROR".equals(s1))
            {
                TargetContext.access$1400(TargetContext.this, s, s2);
            }
            if ("PLAYING".equals(s1) && !s1.equals(mCurrentState))
            {
                TargetContext.access$1500(TargetContext.this).simplePlaybackState(s, false, false, s2);
            } else
            if ("PAUSE".equals(s1) && !s1.equals(mCurrentState))
            {
                TargetContext.access$1500(TargetContext.this).simplePlaybackState(s, true, false, s2);
            }
            if ("PLAY".equals(s1))
            {
                TargetContext.access$1500(TargetContext.this).state(s, "preplay", mTime, mVolume);
            }
            if ("PROGRESS".equals(s1) || "PLAY".equals(s1))
            {
                mTargetStateTransitionStarted = true;
                mTimeMarked4StateTransition = System.currentTimeMillis();
            } else
            if (mTargetStateTransitionStarted)
            {
                mCurrentState = s1;
                notifyState(s, playerstate);
            }
            if (Log.isLoggable("nf_mdx", 3))
            {
                Log.d("nf_mdx", (new StringBuilder()).append("TargetContext: PlayerStateManager state changed to ").append(mCurrentState).toString());
                return;
            }
        }
    }

    public void forceToEndPlayback(String s, String s1)
    {
        mCurrentState = "END_PLAYBACK";
        TargetContext.access$1400(TargetContext.this, s, s1);
    }

    public String getCatalogId()
    {
        return mCatalogId;
    }

    public String getEpisodeId()
    {
        return mEpisodeId;
    }

    public String getTargetPlayerState()
    {
        return mCurrentState;
    }

    public void receivedCommand(String s)
    {
        String s1;
        if (StringUtils.isNotEmpty(TargetContext.access$1200(TargetContext.this)))
        {
            s1 = TargetContext.access$1200(TargetContext.this);
        } else
        {
            s1 = TargetContext.access$900(TargetContext.this);
        }
        if ("PLAYER_PLAY".equals(s))
        {
            mTargetStateTransitionStarted = false;
            mTimeMarked4StateTransition = System.currentTimeMillis();
            mCurrentState = "preplay";
            mCatalogId = new String();
            mEpisodeId = new String();
            mTime = -1;
            mVolume = -1;
            mDuration = -1;
            TargetContext.access$1500(TargetContext.this).simplePlaybackState(s1, false, true, null);
        } else
        if ("PLAYER_RESUME".equals(s))
        {
            mTimeMarked4StateTransition = System.currentTimeMillis();
            mTargetStateTransitionStarted = false;
            mCurrentState = "preplay";
            TargetContext.access$1500(TargetContext.this).simplePlaybackState(s1, false, true, null);
        } else
        if ("PLAYER_PAUSE".endsWith(s))
        {
            mTimeMarked4StateTransition = System.currentTimeMillis();
            mTargetStateTransitionStarted = true;
            mCurrentState = "prepause";
            TargetContext.access$1500(TargetContext.this).simplePlaybackState(s1, true, true, null);
        } else
        {
            if (!"PLAYER_SKIP".equals(s) && !"PLAYER_SET_CURRENT_TIME".equals(s))
            {
                continue;
            }
            mTimeMarked4StateTransition = System.currentTimeMillis();
            mTargetStateTransitionStarted = false;
            mCurrentState = "preseek";
            TargetContext.access$1500(TargetContext.this).simplePlaybackState(s1, false, true, null);
        }
        do
        {
            TargetContext.access$1500(TargetContext.this).state(s1, mCurrentState, mTime, mVolume);
            do
            {
                return;
            } while (!"PLAYER_GET_CURRENT_STATE".equals(s));
            TargetContext.access$1500(TargetContext.this).state(s1, mCurrentState, mTime, mVolume);
            TargetContext.access$1500(TargetContext.this).movieMetaData(s1, mCatalogId, mEpisodeId, mDuration);
        } while (true);
    }

    public void setTargetVolume(int i)
    {
        mExpectedVolume = i;
        mTimeSetVolume = System.currentTimeMillis();
    }

    public void updateState(PlayerState playerstate)
    {
        if (playerstate == null)
        {
            return;
        }
        String s;
        String s1;
        if (StringUtils.isNotEmpty(TargetContext.access$1200(TargetContext.this)))
        {
            s = TargetContext.access$1200(TargetContext.this);
        } else
        {
            s = TargetContext.access$900(TargetContext.this);
        }
        s1 = playerstate.getCurrentState();
        if (StringUtils.isEmpty(s1))
        {
            Log.e("nf_mdx", "TargetContext: updateState, new state is null");
            return;
        }
        String s2 = playerstate.getPostplayState();
        boolean flag;
        if (System.currentTimeMillis() - mTimeMarked4StateTransition >= 30000L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            if ("PLAYING".equals(s1) && mTargetStateTransitionStarted)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if ("preplay".equals(mCurrentState) && !flag)
            {
                Log.d("nf_mdx", "TargetContext: updateState, still in preplay");
                return;
            }
            if ("prepause".equals(mCurrentState) && "PAUSE".equals(s1))
            {
                Log.d("nf_mdx", "TargetContext: updateState, still in prepause");
                return;
            }
            if ("preseek".equals(mCurrentState) && !flag)
            {
                Log.d("nf_mdx", "TargetContext: updateState, still in preseek");
                return;
            }
        }
        if ("PLAYING".equals(s1) && !s1.equals(mCurrentState))
        {
            TargetContext.access$1300(TargetContext.this, s);
            TargetContext.access$1500(TargetContext.this).simplePlaybackState(s, false, false, s2);
        } else
        if ("PAUSE".equals(s1) && !s1.equals(mCurrentState))
        {
            TargetContext.access$1300(TargetContext.this, s);
            TargetContext.access$1500(TargetContext.this).simplePlaybackState(s, true, false, s2);
        }
        if (StringUtils.isEmpty(mCurrentState))
        {
            mCurrentState = s1;
        } else
        if (!s1.equals(mCurrentState))
        {
            mCurrentState = s1;
            Log.e("nf_mdx", (new StringBuilder()).append("TargetContext: updateState, state updated before stateChange from ").append(mCurrentState).append(" to ").append(s1).toString());
        }
        notifyState(s, playerstate);
    }

    ()
    {
        this$0 = TargetContext.this;
        super();
        mTime = -1;
        mVolume = -1;
        mDuration = -1;
        mTargetStateTransitionStarted = true;
        mTimeMarked4StateTransition = 0L;
    }
}
