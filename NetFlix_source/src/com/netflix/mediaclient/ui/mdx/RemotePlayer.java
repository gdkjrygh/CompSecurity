// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.Subtitle;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.ServiceManagerUtils;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.mdx.events.MdxEventHandler;
import com.netflix.mediaclient.ui.mdx.events.MdxEventHandlerFactory;
import com.netflix.mediaclient.util.ThreadUtils;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            RemotePlaybackListener, MdxTargetCapabilities, RemoteDialog

public class RemotePlayer extends BroadcastReceiver
    implements RemotePlaybackListener
{
    public class RemoteTargetState
    {

        public final boolean buffering;
        public final int duration;
        public final boolean paused;
        public final int positionInSeconds;
        public final boolean showMiniPlayer;
        final RemotePlayer this$0;
        public final int volume;

        public String toString()
        {
            return (new StringBuilder()).append("RemoteTargetState [paused=").append(paused).append(", buffering=").append(buffering).append(", position(seconds)=").append(positionInSeconds).append(", duration=").append(duration).append(", volume=").append(volume).append(", showMiniPlayer=").append(showMiniPlayer).append("]").toString();
        }

        private RemoteTargetState(boolean flag, boolean flag1, int i, int j, int k, boolean flag2)
        {
            this$0 = RemotePlayer.this;
            super();
            paused = flag;
            buffering = flag1;
            positionInSeconds = i;
            duration = j;
            volume = k;
            showMiniPlayer = flag2;
        }

    }

    public static interface RemoteTargetUiListener
    {

        public abstract void cancelDialog();

        public abstract void endOfPlayback();

        public abstract void error(int i, String s);

        public abstract void mdxStateChanged(boolean flag);

        public abstract void showDialog(RemoteDialog remotedialog);

        public abstract void targetListChanged();

        public abstract void updateDuration(int i);

        public abstract void updateLanguage(Language language);

        public abstract void updateTargetCapabilities(MdxTargetCapabilities mdxtargetcapabilities);

        public abstract void updateUi(RemoteTargetState remotetargetstate);

        public abstract void updateVideoMetadata();
    }


    private static final Set SHOW_MINI_PLAYER_STATES = new HashSet() {

            
            {
                add("PLAY");
                add("PROGRESS");
                add("PLAYING");
                add("PAUSE");
                add("STALLED");
                add("AUTO_ADVANCE");
                add("prepause");
                add("preseek");
                add("preplay");
            }
    };
    private static final int SKIP_BACK_TIME_SECONDS = -30;
    private static final String STATUS_AUTO_ADVANCE = "AUTO_ADVANCE";
    private static final String STATUS_END_PLAYBACK = "END_PLAYBACK";
    private static final String STATUS_PAUSE = "PAUSE";
    private static final String STATUS_PLAY = "PLAY";
    private static final String STATUS_PLAYING = "PLAYING";
    private static final String STATUS_PREPAUSE = "prepause";
    private static final String STATUS_PREPLAY = "preplay";
    private static final String STATUS_PRESEEK = "preseek";
    private static final String STATUS_PROGRESS = "PROGRESS";
    private static final String STATUS_STALLED = "STALLED";
    private static final String STATUS_STOP = "STOP";
    private static final String TAG = "mdx_remote_player";
    private final NetflixActivity mActivity;
    private Language mCachedLanguage;
    private final RemoteTargetUiListener mCallback;
    private MdxTargetCapabilities mCapabilities;
    private int mDuration;
    private final MdxEventHandlerFactory mMdxEventFactory = new MdxEventHandlerFactory();
    private int mPositionInSeconds;
    private boolean mReady;
    private boolean mReceiverIsRegistered;
    private boolean mRequestForLanguageDataSent;
    private String mState;
    private int mVolume;
    private boolean mVolumeControllEnabled;
    private boolean userDidPlayPause;
    private boolean userDidSeek;

    public RemotePlayer(NetflixActivity netflixactivity, RemoteTargetUiListener remotetargetuilistener)
    {
        mState = "PLAY";
        Log.v("mdx_remote_player", "Remote player created");
        if (netflixactivity == null)
        {
            throw new IllegalArgumentException("activity can not be null!");
        }
        if (remotetargetuilistener == null)
        {
            throw new IllegalArgumentException("owner can not be null!");
        } else
        {
            mActivity = netflixactivity;
            mCallback = remotetargetuilistener;
            registerReceiver();
            return;
        }
    }

    private Intent createIntent(String s)
    {
        ServiceManager servicemanager = mActivity.getServiceManager();
        if (ServiceManagerUtils.isMdxAgentAvailable(servicemanager))
        {
            return com.netflix.mediaclient.service.mdx.MdxAgent.Utils.createIntent(mActivity, s, servicemanager.getMdx().getCurrentTarget());
        } else
        {
            return null;
        }
    }

    private void registerReceiver()
    {
        IntentFilter intentfilter = new IntentFilter("com.netflix.mediaclient.intent.action.MDXUPDATE_READY");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_NOTREADY");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_AUDIOSUB");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_CAPABILITY");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_DIALOGCANCEL");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_DIALOGSHOW");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_ERROR");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_MOVIEMETADATA_AVAILABLE");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_MOVIEMETADA");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_STATE");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_TARGETLIST");
        intentfilter.addCategory("com.netflix.mediaclient.intent.category.MDX");
        intentfilter.setPriority(999);
        try
        {
            mActivity.registerReceiver(this, intentfilter);
            mReceiverIsRegistered = true;
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("mdx_remote_player", "Failed to register ", throwable);
        }
    }

    private void resetLanguageData()
    {
        Log.v("mdx_remote_player", "Resetting language data...");
        mRequestForLanguageDataSent = false;
        mCachedLanguage = null;
    }

    private void skip(int i)
    {
        if (Log.isLoggable("mdx_remote_player", 3))
        {
            Log.d("mdx_remote_player", (new StringBuilder()).append("Skip by ").append(i).toString());
        }
        Intent intent = createIntent("com.netflix.mediaclient.intent.action.MDX_SKIP");
        if (intent != null)
        {
            intent.putExtra("time", i);
            mActivity.startService(intent);
        }
        mState = "PLAY";
    }

    private void unregisterReceiver()
    {
        try
        {
            if (mReceiverIsRegistered)
            {
                mReceiverIsRegistered = false;
                mActivity.unregisterReceiver(this);
            }
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("mdx_remote_player", "Failed to unregister ", throwable);
        }
    }

    public void cancelDialog()
    {
        mCallback.cancelDialog();
    }

    public void changeLanguage(Language language)
    {
        if (language == null)
        {
            Log.e("mdx_remote_player", "Language is null!");
        } else
        {
            if (language.getSelectedAudio() == null)
            {
                Log.e("mdx_remote_player", "Language selected audio is null!");
                return;
            }
            if (language.getSelectedSubtitle() == null)
            {
                Log.e("mdx_remote_player", "Language selected subtitle is null!");
                return;
            }
            resetLanguageData();
            Intent intent = createIntent("com.netflix.mediaclient.intent.action.MDX_SETAUDIOSUB");
            if (intent != null)
            {
                intent.putExtra("audioTrackId", language.getSelectedAudio().getId());
                intent.putExtra("subtitleTrackId", language.getSelectedSubtitle().getId());
                mActivity.startService(intent);
                return;
            }
        }
    }

    public void destroy()
    {
        unregisterReceiver();
    }

    public void error(int i, String s)
    {
        resetLanguageData();
        mCallback.error(i, s);
    }

    public MdxTargetCapabilities getCapabilities()
    {
        return mCapabilities;
    }

    public int getDuration()
    {
        return mDuration;
    }

    public Language getLanguage()
    {
        if (Log.isLoggable("mdx_remote_player", 2))
        {
            Log.v("mdx_remote_player", (new StringBuilder()).append("getLanguage: ").append(mCachedLanguage).toString());
        }
        return mCachedLanguage;
    }

    public int getPositionInSeconds()
    {
        return mPositionInSeconds;
    }

    public String getState()
    {
        return mState;
    }

    public int getVolume()
    {
        return mVolume;
    }

    public boolean isPaused()
    {
        return "PAUSE".equalsIgnoreCase(mState) || "prepause".equalsIgnoreCase(mState);
    }

    public boolean isPlaying()
    {
        return "PLAYING".equalsIgnoreCase(mState) || "preplay".equalsIgnoreCase(mState);
    }

    public boolean isReady()
    {
        return mReady;
    }

    public boolean isStalled()
    {
        return "PLAY".equalsIgnoreCase(mState) || "PROGRESS".equalsIgnoreCase(mState) || "STALLED".equalsIgnoreCase(mState);
    }

    public boolean isStopped()
    {
        return "STOP".equalsIgnoreCase(mState);
    }

    public boolean isVolumeControllEnabled()
    {
        return mVolumeControllEnabled;
    }

    public void mdxStateChanged(boolean flag)
    {
        mReady = flag;
        mCallback.mdxStateChanged(flag);
    }

    public void onReceive(Context context, Intent intent)
    {
        ThreadUtils.assertOnMain();
        if (Log.isLoggable("mdx_remote_player", 2))
        {
            Log.v("mdx_remote_player", (new StringBuilder()).append("Received intent ").append(intent).toString());
        }
        context = mMdxEventFactory.getHandler(intent.getAction());
        if (context != null)
        {
            context.handle(this, intent);
            return;
        } else
        {
            Log.e("mdx_remote_player", (new StringBuilder()).append("Event not supported ").append(intent.getAction()).toString());
            return;
        }
    }

    public void pause()
    {
        mActivity.startService(createIntent("com.netflix.mediaclient.intent.action.MDX_PAUSE"));
        mState = "PAUSE";
        userDidPlayPause = true;
    }

    public void play(Asset asset)
    {
        if (!com.netflix.mediaclient.service.mdx.MdxAgent.Utils.playVideo(mActivity, asset, false))
        {
            return;
        } else
        {
            userDidPlayPause = true;
            mState = "preplay";
            return;
        }
    }

    public void requestAudioAndSubtitleData()
    {
        Log.d("mdx_remote_player", "Sending request for subtitle/audio data...");
        mActivity.startService(createIntent("com.netflix.mediaclient.intent.action.MDX_GETAUDIOSUB"));
    }

    public void resume()
    {
        mActivity.startService(createIntent("com.netflix.mediaclient.intent.action.MDX_RESUME"));
        mState = "PLAYING";
        userDidPlayPause = true;
    }

    public void seek(int i)
    {
        if (Log.isLoggable("mdx_remote_player", 3))
        {
            Log.d("mdx_remote_player", (new StringBuilder()).append("Seek to ").append(i).toString());
        }
        Intent intent = createIntent("com.netflix.mediaclient.intent.action.MDX_SEEK");
        if (intent != null)
        {
            intent.putExtra("time", i);
            mActivity.startService(intent);
        }
        mState = "PLAY";
    }

    public void sendDialogResponse(String s)
    {
        if (Log.isLoggable("mdx_remote_player", 3))
        {
            Log.d("mdx_remote_player", (new StringBuilder()).append("User selected ").append(s).toString());
        }
        Intent intent = createIntent("com.netflix.mediaclient.intent.action.MDX_DIALOGRESP");
        if (intent != null)
        {
            intent.putExtra("data", s);
            mActivity.startService(intent);
        }
    }

    public void setVolume(int i)
    {
        if (mVolume <= 0 && i <= 0)
        {
            Log.d("mdx_remote_player", "Volume is already less than 0 and it can not be turned down more. Do nothing.");
        } else
        {
            if (mVolume >= 100 && i >= 100)
            {
                Log.d("mdx_remote_player", "Volume is already more than 100 and it can not be turned up more. Do nothing.");
                return;
            }
            int j = i;
            if (i > 100)
            {
                j = 100;
            }
            i = j;
            if (j < 0)
            {
                i = 0;
            }
            mVolume = i;
            if (Log.isLoggable("mdx_remote_player", 3))
            {
                Log.d("mdx_remote_player", (new StringBuilder()).append("Set volume to ").append(mVolume).toString());
            }
            Intent intent = createIntent("com.netflix.mediaclient.intent.action.MDX_SETVOLUME");
            if (intent != null)
            {
                intent.putExtra("volume", mVolume);
                mActivity.startService(intent);
                return;
            }
        }
    }

    public boolean shouldIgnorePlayPauseUpdates()
    {
        return userDidPlayPause || userDidSeek;
    }

    public boolean shouldIgnoreVideoPositionUpdates()
    {
        return userDidPlayPause || userDidSeek;
    }

    public void showDialog(RemoteDialog remotedialog)
    {
        mCallback.showDialog(remotedialog);
    }

    public void skipBackThirtySeconds()
    {
        skip(-30);
    }

    public void stop(boolean flag)
    {
        Log.d("mdx_remote_player", "stop sending...");
        mActivity.startService(createIntent("com.netflix.mediaclient.intent.action.MDX_STOP"));
        Log.d("mdx_remote_player", "stop sent");
        mState = "STOP";
        if (flag)
        {
            mActivity.finish();
        }
    }

    public void sync()
    {
        mActivity.startService(createIntent("com.netflix.mediaclient.intent.action.MDX_GETCAPABILITY"));
        mActivity.startService(createIntent("com.netflix.mediaclient.intent.action.MDX_GETSTATE"));
    }

    public void targetListChanged()
    {
        mCallback.targetListChanged();
    }

    public void updateDuration(int i)
    {
        mDuration = i;
        mCallback.updateDuration(i);
    }

    public void updateLanguage(Language language)
    {
        if (Log.isLoggable("mdx_remote_player", 2))
        {
            Log.v("mdx_remote_player", (new StringBuilder()).append("updateLanguage: ").append(language).toString());
        }
        mCachedLanguage = language;
        mCallback.updateLanguage(language);
    }

    public void updateState(String s, int i, int j)
    {
        if ("END_PLAYBACK".equalsIgnoreCase(s))
        {
            Log.d("mdx_remote_player", "DESTROY: end of playback");
            resetLanguageData();
            mCallback.endOfPlayback();
        } else
        if ("PLAYING".equalsIgnoreCase(s))
        {
            if (shouldIgnorePlayPauseUpdates())
            {
                Log.d("mdx_remote_player", "PLAYING: Do nothing, user just did trickplay");
                return;
            }
            if (!mRequestForLanguageDataSent)
            {
                requestAudioAndSubtitleData();
                mRequestForLanguageDataSent = true;
            } else
            {
                Log.d("mdx_remote_player", "Video is playing");
            }
        } else
        if ("PAUSE".equalsIgnoreCase(s))
        {
            if (shouldIgnorePlayPauseUpdates())
            {
                Log.d("mdx_remote_player", "PAUSE: Do nothing, user just did trickplay");
                return;
            }
            Log.d("mdx_remote_player", "Paused...");
        } else
        {
            if ("prepause".equalsIgnoreCase(s))
            {
                Log.d("mdx_remote_player", "PREPAUSE: Start listening to play/pause from target again");
                userDidPlayPause = false;
                return;
            }
            if ("preplay".equalsIgnoreCase(s))
            {
                Log.d("mdx_remote_player", "PREPLAY: Start listening to play/pause from target again");
                userDidPlayPause = false;
                resetLanguageData();
                return;
            }
            if ("preseek".equalsIgnoreCase(s))
            {
                Log.d("mdx_remote_player", "PRESEEK: Start listening to video position updates from target again");
                userDidSeek = false;
                return;
            }
            if ("PLAY".equalsIgnoreCase(s))
            {
                Log.d("mdx_remote_player", "Play, do nothing...");
            } else
            if ("PROGRESS".equalsIgnoreCase(s))
            {
                Log.d("mdx_remote_player", "Progress...");
            } else
            {
                if (!"STALLED".equalsIgnoreCase(s))
                {
                    continue;
                }
                Log.d("mdx_remote_player", "Stalled...");
            }
        }
        do
        {
            mState = s;
            mPositionInSeconds = i;
            mVolume = j;
            mCallback.updateUi(new RemoteTargetState(isPaused(), isStalled(), i, mDuration, j, SHOW_MINI_PLAYER_STATES.contains(s)));
            do
            {
                return;
            } while (!Log.isLoggable("mdx_remote_player", 3));
            Log.d("mdx_remote_player", (new StringBuilder()).append("Not supported state ").append(s).append(". Do nothing.").toString());
            return;
        } while (true);
    }

    public void updateTargetCapabilities(MdxTargetCapabilities mdxtargetcapabilities)
    {
        mCapabilities = mdxtargetcapabilities;
        mCallback.updateTargetCapabilities(mdxtargetcapabilities);
    }

    public void updateVideoMetadata()
    {
        mCallback.updateVideoMetadata();
    }

}
