// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.DiscoveryController;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.PairingController;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.RemoteDevice;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.SessionController;
import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import com.netflix.mediaclient.service.mdx.message.controller.Handshake;
import com.netflix.mediaclient.service.mdx.message.controller.PlayerGetCapabilities;
import com.netflix.mediaclient.service.mdx.message.controller.PlayerGetCurrentState;
import com.netflix.mediaclient.service.mdx.message.target.HandshakeAccepted;
import com.netflix.mediaclient.service.mdx.message.target.PinNotRequired;
import com.netflix.mediaclient.service.mdx.message.target.PinRequired;
import com.netflix.mediaclient.service.mdx.message.target.PlayerCurrentState;
import com.netflix.mediaclient.service.mdx.message.target.PlayerState;
import com.netflix.mediaclient.service.mdx.message.target.PlayerStateChanged;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.WebApiUtils;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetStateManager, NotifierInterface

public class TargetContext
    implements TargetStateManager.TargetStateManagerListener
{
    class DeletePair
        implements Runnable
    {

        final TargetContext this$0;

        public void run()
        {
            mController.getPairing().deletePairing(mPairingContext);
            Message message = new Message();
            message.what = 1;
            message.obj = TargetStateManager.TargetContextEvent.DeletePairSucceed;
            mTargetContextHandler.sendMessageDelayed(message, 20L);
        }

        DeletePair()
        {
            this$0 = TargetContext.this;
            super();
        }
    }

    class DoHandShake
        implements Runnable
    {

        final TargetContext this$0;

        public void run()
        {
            Handshake handshake = new Handshake();
            mController.getSession().sendMessage(mSessionId, handshake.messageName(), handshake.messageObject());
        }

        DoHandShake()
        {
            this$0 = TargetContext.this;
            super();
        }
    }

    class DoPair
        implements Runnable
    {

        final TargetContext this$0;

        public void run()
        {
            mController.getPairing().pairingRequest(mUuid);
        }

        DoPair()
        {
            this$0 = TargetContext.this;
            super();
        }
    }

    class DoRegPair
        implements Runnable
    {

        final TargetContext this$0;

        public void run()
        {
            if (mRegistrationAcceptance == 1)
            {
                mController.getPairing().registrationPairingRequest(mUuid);
            } else
            if (mRegistrationAcceptance == 2)
            {
                mController.getPairing().registrationPairingRequest(mUuid, "00000");
                return;
            }
        }

        DoRegPair()
        {
            this$0 = TargetContext.this;
            super();
        }
    }

    class GetCapabilies
        implements Runnable
    {

        final TargetContext this$0;

        public void run()
        {
            PlayerGetCapabilities playergetcapabilities = new PlayerGetCapabilities();
            mController.getSession().sendMessage(mSessionId, playergetcapabilities.messageName(), playergetcapabilities.messageObject());
        }

        GetCapabilies()
        {
            this$0 = TargetContext.this;
            super();
        }
    }

    class GetState
        implements Runnable
    {

        final TargetContext this$0;

        public void run()
        {
            PlayerGetCurrentState playergetcurrentstate = new PlayerGetCurrentState();
            mController.getSession().sendMessage(mSessionId, playergetcurrentstate.messageName(), playergetcurrentstate.messageObject());
        }

        GetState()
        {
            this$0 = TargetContext.this;
            super();
        }
    }

    class LaunchNetflix
        implements Runnable
    {

        final TargetContext this$0;

        public void run()
        {
            mController.getDiscovery().isRemoteDeviceReady(mDialUsn);
            HashMap hashmap = new HashMap();
            hashmap.put("intent", "sync");
            if (StringUtils.isNotEmpty(mDialUsn))
            {
                mController.getDiscovery().launchNetflix(mDialUsn, hashmap);
                return;
            } else
            {
                mController.getDiscovery().launchNetflix(mUsn, hashmap);
                return;
            }
        }

        LaunchNetflix()
        {
            this$0 = TargetContext.this;
            super();
        }
    }

    class PlayerStateManager
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
            mNotifier.state(s, mCurrentState, mTime, mVolume);
            if (!StringUtils.safeEquals(mCatalogId, playerstate.getCatalogId()) || !StringUtils.safeEquals(mEpisodeId, playerstate.getEpisodeId()) || mDuration != playerstate.getDuration())
            {
                mCatalogId = playerstate.getCatalogId();
                mEpisodeId = playerstate.getEpisodeId();
                mDuration = playerstate.getDuration();
                mNotifier.movieMetaData(s, mCatalogId, mEpisodeId, mDuration);
            }
        }

        public void changeState(PlayerState playerstate)
        {
            if (playerstate != null)
            {
                String s;
                String s1;
                if (StringUtils.isNotEmpty(mDialUuid))
                {
                    s = mDialUuid;
                } else
                {
                    s = mUuid;
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
                    playbackStart(s);
                } else
                if ("STOP".equals(s1) || "END_PLAYBACK".equals(s1) || "FATAL_ERROR".equals(s1))
                {
                    playbackEnd(s, s2);
                }
                if ("PLAYING".equals(s1) && !s1.equals(mCurrentState))
                {
                    mNotifier.simplePlaybackState(s, false, false, s2);
                } else
                if ("PAUSE".equals(s1) && !s1.equals(mCurrentState))
                {
                    mNotifier.simplePlaybackState(s, true, false, s2);
                }
                if ("PLAY".equals(s1))
                {
                    mNotifier.state(s, "preplay", mTime, mVolume);
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
            playbackEnd(s, s1);
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
            if (StringUtils.isNotEmpty(mDialUuid))
            {
                s1 = mDialUuid;
            } else
            {
                s1 = mUuid;
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
                mNotifier.simplePlaybackState(s1, false, true, null);
            } else
            if ("PLAYER_RESUME".equals(s))
            {
                mTimeMarked4StateTransition = System.currentTimeMillis();
                mTargetStateTransitionStarted = false;
                mCurrentState = "preplay";
                mNotifier.simplePlaybackState(s1, false, true, null);
            } else
            if ("PLAYER_PAUSE".endsWith(s))
            {
                mTimeMarked4StateTransition = System.currentTimeMillis();
                mTargetStateTransitionStarted = true;
                mCurrentState = "prepause";
                mNotifier.simplePlaybackState(s1, true, true, null);
            } else
            {
                if (!"PLAYER_SKIP".equals(s) && !"PLAYER_SET_CURRENT_TIME".equals(s))
                {
                    continue;
                }
                mTimeMarked4StateTransition = System.currentTimeMillis();
                mTargetStateTransitionStarted = false;
                mCurrentState = "preseek";
                mNotifier.simplePlaybackState(s1, false, true, null);
            }
            do
            {
                mNotifier.state(s1, mCurrentState, mTime, mVolume);
                do
                {
                    return;
                } while (!"PLAYER_GET_CURRENT_STATE".equals(s));
                mNotifier.state(s1, mCurrentState, mTime, mVolume);
                mNotifier.movieMetaData(s1, mCatalogId, mEpisodeId, mDuration);
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
            if (StringUtils.isNotEmpty(mDialUuid))
            {
                s = mDialUuid;
            } else
            {
                s = mUuid;
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
                playbackStart(s);
                mNotifier.simplePlaybackState(s, false, false, s2);
            } else
            if ("PAUSE".equals(s1) && !s1.equals(mCurrentState))
            {
                playbackStart(s);
                mNotifier.simplePlaybackState(s, true, false, s2);
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

        PlayerStateManager()
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

    class StartSession
        implements Runnable
    {

        final TargetContext this$0;

        public void run()
        {
            mController.getSession().startSession(mPairingContext);
        }

        StartSession()
        {
            this$0 = TargetContext.this;
            super();
        }
    }


    private static final long DUPLICATE_MESSAGE_REQUEST_WINDOWS = 2000L;
    private static final int MSG_COMMAND = 2;
    private static final int MSG_EVENT = 1;
    private static final int MSG_PERIODIC = 4;
    private static final int MSG_UPDATETARGET = 3;
    private static final long STATE_CHECK_PERIOD = 25000L;
    private static final String TAG = "nf_mdx";
    private boolean mActivated;
    private String mAudioSubtitleSettingBlob;
    private final Object mAudioSubtitleSettingBlobLock = new Object();
    private final MdxController mController;
    private String mDialUsn;
    private String mDialUuid;
    private String mFriendlyName;
    private String mLastError;
    private int mLaunchStatus;
    private String mLocation;
    private final NotifierInterface mNotifier;
    private String mPairingContext;
    private final PlayerStateManager mPlayerStateManager = new PlayerStateManager();
    private String mPostplayStateBlob;
    private long mPreviousAudioSubExchangeTime;
    private int mRegistrationAcceptance;
    private String mServiceType;
    private int mSessionId;
    private TargetStateManager mStateMachine;
    private String mTargetCapability;
    private Handler mTargetContextHandler;
    private HandlerThread mTargetContextThread;
    private String mTargetPlaybackSessionToken;
    private String mUsn;
    private String mUuid;

    TargetContext(MdxController mdxcontroller, NotifierInterface notifierinterface, RemoteDevice remotedevice, boolean flag)
    {
        mPreviousAudioSubExchangeTime = 0L;
        if (Log.isLoggable("nf_mdx", 3))
        {
            Log.d("nf_mdx", (new StringBuilder()).append("TargetContext: for device ").append(remotedevice).toString());
        }
        updateTargetProperty(remotedevice);
        mSessionId = -1;
        mController = mdxcontroller;
        mNotifier = notifierinterface;
        boolean flag1 = StringUtils.isNotEmpty(mPairingContext);
        mTargetContextThread = new HandlerThread("MDX TargetContext");
        mTargetContextThread.start();
        mTargetContextHandler = new Handler(mTargetContextThread.getLooper()) {

            final TargetContext this$0;

            public void handleMessage(Message message)
            {
                switch (message.what)
                {
                default:
                    return;

                case 2: // '\002'
                    if (Log.isLoggable("nf_mdx", 3))
                    {
                        Log.d("nf_mdx", (new StringBuilder()).append("TargetContext: received a command at state ").append(mStateMachine.mCurrentState.getName()).toString());
                    }
                    message = (Runnable)message.obj;
                    mStateMachine.addUiCommand(message);
                    mStateMachine.receivedEvent(TargetStateManager.TargetContextEvent.SessionCommandReceived);
                    return;

                case 1: // '\001'
                    message = (TargetStateManager.TargetContextEvent)message.obj;
                    mStateMachine.receivedEvent(message);
                    return;

                case 3: // '\003'
                    boolean flag2 = StringUtils.isNotEmpty(mPairingContext);
                    Log.d("nf_mdx", (new StringBuilder()).append("TargetContext: MSG_UPDATETARGET ").append(flag2).append(", ").append(mRegistrationAcceptance).append(", ").append(mActivated).append(", ").append(mLaunchStatus).toString());
                    mStateMachine.updateTarget(flag2, mRegistrationAcceptance, mActivated, mLaunchStatus);
                    mStateMachine.receivedEvent(TargetStateManager.TargetContextEvent.TargetUpdate);
                    return;

                case 4: // '\004'
                    break;
                }
                if (mStateMachine.isSessionActive())
                {
                    requestStateCheck();
                    return;
                } else
                {
                    Log.d("nf_mdx", "TargetContext: MSG_PERIODIC,target is not active");
                    return;
                }
            }

            
            {
                this$0 = TargetContext.this;
                super(looper);
            }
        };
        if (mLaunchStatus == 0)
        {
            mStateMachine = new TargetStateManager(this, TargetStateManager.TargetState.StateNotLaunched, flag);
        } else
        {
            mStateMachine = new TargetStateManager(this, TargetStateManager.TargetState.StateLaunched, flag);
        }
        mStateMachine.setDefaultAction(TargetStateManager.StateId.StateNeedLaunched, new LaunchNetflix());
        mStateMachine.setDefaultAction(TargetStateManager.StateId.StateNoPair, new DoPair());
        mStateMachine.setDefaultAction(TargetStateManager.StateId.StateBadPair, new DeletePair());
        mStateMachine.setDefaultAction(TargetStateManager.StateId.StateNeedRegPair, new DoRegPair());
        mStateMachine.setDefaultAction(TargetStateManager.StateId.StateHasPair, new StartSession());
        mStateMachine.setDefaultAction(TargetStateManager.StateId.StateNeedHandShake, new DoHandShake());
        mStateMachine.addSessionRequest(new GetCapabilies());
        mStateMachine.addSessionRequest(new GetState());
        mStateMachine.start(flag1, mRegistrationAcceptance, mActivated, mLaunchStatus);
    }

    private int determineStateErrorCode(TargetStateManager.TargetState targetstate, String s)
    {
        char c1 = '\u012C';
        if (!TargetStateManager.TargetState.StateNoPair.equals(targetstate) && !TargetStateManager.TargetState.StateNoPairNeedRegPair.equals(targetstate)) goto _L2; else goto _L1
_L1:
        char c = 'h';
_L4:
        return c;
_L2:
        if (TargetStateManager.TargetState.StateHasPair.equals(targetstate) || TargetStateManager.TargetState.StateNeedHandShake.equals(targetstate))
        {
            return 105;
        }
        if (!TargetStateManager.TargetState.StateSendingMessage.equals(targetstate))
        {
            break; /* Loop/switch isn't completed */
        }
        c = c1;
        if (StringUtils.isNotEmpty(s))
        {
            c = c1;
            if (MdxMessage.isUserCommand(s))
            {
                return 105;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        c = c1;
        if (TargetStateManager.TargetState.StateNeedLaunched.equals(targetstate))
        {
            return 100;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private String getTargetProperty(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = new String();
        }
        return s1;
    }

    private void handlePostplayState(String s, String s1)
    {
        if (StringUtils.isNotEmpty(s1) && !s1.equals(mPostplayStateBlob))
        {
            mNotifier.postplayState(s, s1);
        }
        mPostplayStateBlob = s1;
    }

    private void invalidateCachedLanguageData()
    {
        synchronized (mAudioSubtitleSettingBlobLock)
        {
            mAudioSubtitleSettingBlob = null;
            mPreviousAudioSubExchangeTime = 0L;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void playbackEnd(String s, String s1)
    {
        Log.d("nf_mdx", "TargetContext: playbackEnd");
        mNotifier.playbackEnd(s, s1);
    }

    private void playbackStart(String s)
    {
        Log.d("nf_mdx", "TargetContext: playbackStart");
        invalidateCachedLanguageData();
        mNotifier.playbackStart(s);
    }

    private void requestStateCheck()
    {
        mStateMachine.addSessionRequest(new GetState());
        mStateMachine.receivedEvent(TargetStateManager.TargetContextEvent.SessionCommandReceived);
    }

    private void scheduleStateCheck()
    {
        mTargetContextHandler.removeMessages(4);
        Message message = new Message();
        message.what = 4;
        mTargetContextHandler.sendMessageDelayed(message, 25000L);
    }

    public void destroy()
    {
        if (mTargetContextHandler != null)
        {
            mTargetContextHandler.removeMessages(2);
            mTargetContextHandler.removeMessages(1);
            mTargetContextHandler = null;
        }
        if (mTargetContextThread != null)
        {
            mTargetContextThread.quit();
            try
            {
                mTargetContextThread.join();
            }
            catch (InterruptedException interruptedexception)
            {
                Log.e("nf_mdx", "mTargetContextThread interrupted");
            }
            mTargetContextThread = null;
        }
    }

    String getTargetPlaybackSessionToken()
    {
        return mTargetPlaybackSessionToken;
    }

    public com.netflix.mediaclient.util.WebApiUtils.VideoIds getVideoIds()
    {
        String s;
        synchronized (mPlayerStateManager)
        {
            obj = mPlayerStateManager.getCatalogId();
            s = mPlayerStateManager.getEpisodeId();
        }
        try
        {
            obj1 = WebApiUtils.extractIsd(((String) (obj)), s);
        }
        catch (InvalidParameterException invalidparameterexception)
        {
            Log.d("nf_mdx", (new StringBuilder()).append("TargetContext: fail to getVideoIds ").append(((String) (obj))).append(", ").append(s).toString());
            return null;
        }
        return ((com.netflix.mediaclient.util.WebApiUtils.VideoIds) (obj1));
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public boolean hasActiveSession()
    {
        String s;
        synchronized (mPlayerStateManager)
        {
            s = mPlayerStateManager.getTargetPlayerState();
        }
        return StringUtils.isNotEmpty(s) && !"STOP".equals(s) && !"FATAL_ERROR".equals(s) && !"END_PLAYBACK".equals(s);
        exception;
        playerstatemanager;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isThisSession(int i)
    {
        return i == mSessionId;
    }

    public boolean isThisTargetPairingContext(String s)
    {
        return StringUtils.isNotEmpty(s) && mPairingContext.equals(s);
    }

    public boolean isThisTargetUuid(String s)
    {
        return StringUtils.isNotEmpty(mUuid) && mUuid.equals(s) || StringUtils.isNotEmpty(mDialUuid) && mDialUuid.equals(s);
    }

    public void launchResult(boolean flag)
    {
        Message message = new Message();
        message.what = 1;
        if (flag)
        {
            message.obj = TargetStateManager.TargetContextEvent.LaunchSucceed;
        } else
        {
            message.obj = TargetStateManager.TargetContextEvent.LaunchFailed;
        }
        mTargetContextHandler.sendMessage(message);
        Log.d("nf_mdx", "TargetContext: send launchResult");
    }

    public void messageDelivered(int i)
    {
        Message message = new Message();
        message.what = 1;
        message.obj = TargetStateManager.TargetContextEvent.SendMessageSucceed;
        mTargetContextHandler.sendMessage(message);
    }

    public void messageError(int i, String s, String s1)
    {
        mLastError = (new StringBuilder()).append(" message error ").append(s).append(": ").append(s1).toString();
        s1 = new Message();
        s1.what = 1;
        if ("6".equals(s) || "5".equals(s))
        {
            Log.d("nf_mdx", "TargetContext:  MDX_SESSION_INVALID_HMAC");
            s1.obj = TargetStateManager.TargetContextEvent.SendMessageFailedNeedRepair;
        } else
        if ("11".equals(s))
        {
            Log.d("nf_mdx", "TargetContext:  MDX_SESSION_INVALID_SID");
            s1.obj = TargetStateManager.TargetContextEvent.SendMessageFailedNeedNewSession;
        } else
        if ("4".equals(s))
        {
            Log.d("nf_mdx", "TargetContext:  MDX_SESSION_INVALID_NONCE");
            s1.obj = TargetStateManager.TargetContextEvent.SendMessageFailed;
        } else
        if ("10".equals(s))
        {
            Log.d("nf_mdx", "TargetContext:  MDX_SESSION_NETWORK_ERROR");
            s1.obj = TargetStateManager.TargetContextEvent.SendMessageFailed;
        } else
        {
            Log.d("nf_mdx", "TargetContext:  SESSION unknown error");
            s1.obj = TargetStateManager.TargetContextEvent.SendMessageFailedNeedRepair;
        }
        mTargetContextHandler.sendMessage(s1);
    }

    public void messageReceived(int i, String s, JSONObject jsonobject)
    {
        if (i == mSessionId) goto _L2; else goto _L1
_L1:
        Log.e("nf_mdx", (new StringBuilder()).append("messageReceived doesn't match sessionId: ").append(s).toString());
_L4:
        return;
_L2:
        String s1;
        boolean flag;
        if (StringUtils.isNotEmpty(mDialUuid))
        {
            s1 = mDialUuid;
        } else
        {
            s1 = mUuid;
        }
        scheduleStateCheck();
        if (!"HANDSHAKE_ACCEPTED".equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            flag = (new HandshakeAccepted(jsonobject)).isAccepted();
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("nf_mdx", (new StringBuilder()).append("messageReceived failed to parse ").append(s).toString());
            return;
        }
        if (flag)
        {
            s = new Message();
            s.what = 1;
            s.obj = TargetStateManager.TargetContextEvent.HandShakeSucceed;
            mTargetContextHandler.sendMessage(s);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!"PLAYER_CURRENT_STATE".equals(s))
        {
            break MISSING_BLOCK_LABEL_245;
        }
        try
        {
            jsonobject = (new PlayerCurrentState(jsonobject)).getPlayerState();
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("nf_mdx", (new StringBuilder()).append("messageReceived failed to parse ").append(s).toString());
            return;
        }
        if (jsonobject == null) goto _L4; else goto _L5
_L5:
        mTargetPlaybackSessionToken = jsonobject.getXid();
        synchronized (mPlayerStateManager)
        {
            mPlayerStateManager.updateState(jsonobject);
        }
        handlePostplayState(s1, jsonobject.getPostplayState());
        return;
        jsonobject;
        s;
        JVM INSTR monitorexit ;
        throw jsonobject;
        if (!"PLAYER_STATE_CHANGED".equals(s))
        {
            break MISSING_BLOCK_LABEL_340;
        }
        try
        {
            jsonobject = (new PlayerStateChanged(jsonobject)).getPlayerState();
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("nf_mdx", (new StringBuilder()).append("messageReceived failed to parse ").append(s).toString());
            return;
        }
        if (jsonobject == null) goto _L4; else goto _L6
_L6:
        mTargetPlaybackSessionToken = jsonobject.getXid();
        synchronized (mPlayerStateManager)
        {
            mPlayerStateManager.changeState(jsonobject);
        }
        handlePostplayState(s1, jsonobject.getPostplayState());
        return;
        jsonobject;
        s;
        JVM INSTR monitorexit ;
        throw jsonobject;
        if ("PLAYER_CAPABILITIES".equals(s))
        {
            mTargetCapability = jsonobject.toString();
            mNotifier.capability(s1, mTargetCapability);
            return;
        }
        if ("AUDIO_SUBTITLES_CHANGED".equals(s) || "AUDIO_SUBTITLES_SETTINGS".equals(s))
        {
            synchronized (mAudioSubtitleSettingBlobLock)
            {
                mPreviousAudioSubExchangeTime = System.currentTimeMillis();
                mAudioSubtitleSettingBlob = jsonobject.toString();
                mNotifier.audiosub(s1, mAudioSubtitleSettingBlob);
            }
            return;
        }
        break MISSING_BLOCK_LABEL_439;
        jsonobject;
        s;
        JVM INSTR monitorexit ;
        throw jsonobject;
        if ("DIALOG_SHOW".equals(s))
        {
            mNotifier.dialogShow(s1, jsonobject.toString());
            return;
        }
        if ("DIALOG_CANCEL".equals(s))
        {
            mNotifier.dialogCancel(s1, jsonobject.toString());
            return;
        }
        if ("META_DATA_CHANGED".equals(s))
        {
            mNotifier.metaData(s1, jsonobject.toString());
            return;
        }
        if ("PIN_VERIFICATION_SHOW".equals(s))
        {
            try
            {
                Object obj = new PinRequired(jsonobject);
                jsonobject = ((PinRequired) (obj)).getTitle();
                i = ((PinRequired) (obj)).getVideoId();
                int j = ((PinRequired) (obj)).getAncestorVideoId();
                obj = ((PinRequired) (obj)).getAncestorVideoType();
                mNotifier.requestPinVerification(s1, jsonobject, i, j, ((String) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("nf_mdx", (new StringBuilder()).append("messageReceived failed to parse ").append(s).toString());
            }
            return;
        }
        if ("PIN_VERIFICATION_NOT_REQUIRED".equals(s))
        {
            try
            {
                jsonobject = new PinNotRequired(jsonobject);
                mNotifier.abortPinVerification(s1, jsonobject.getIsPinVerified());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("nf_mdx", (new StringBuilder()).append("messageReceived failed to parse ").append(s).toString());
            }
            return;
        } else
        {
            Log.d("nf_mdx", "messageReceived not handle ");
            return;
        }
    }

    public void pairingDeleted()
    {
        Message message = new Message();
        message.what = 1;
        message.obj = TargetStateManager.TargetContextEvent.DeletePairSucceed;
        mTargetContextHandler.sendMessage(message);
    }

    public void pairingFail(String s, String s1)
    {
        mLastError = (new StringBuilder()).append(" pairing error ").append(s).append(": ").append(s1).toString();
        s1 = new Message();
        s1.what = 1;
        if ("30".equals(s) || "USER_MISMATCH".equals(s) || "20".equals(s))
        {
            Log.d("nf_mdx", "TargetContext:  MDX_PAIRING_USER_MISMATCH");
            s1.obj = TargetStateManager.TargetContextEvent.PairFailedNeedRegPair;
        } else
        if ("31".equals(s))
        {
            Log.d("nf_mdx", "TargetContext:  MDX_PAIRING_ALREADY_PAIRED");
            s1.obj = TargetStateManager.TargetContextEvent.PairFailedExistedPair;
        } else
        if ("22".equals(s) || "21".equals(s))
        {
            Log.d("nf_mdx", "TargetContext:  PAIRING CTICKET error ");
            mController.pingNccp();
            s1.obj = TargetStateManager.TargetContextEvent.PairFailed;
        } else
        if ("99".equals(s) | "13".equals(s))
        {
            Log.d("nf_mdx", "TargetContext:  PAIRING NETWORK error ");
            s1.obj = TargetStateManager.TargetContextEvent.PairFailed;
        } else
        if ("11".equals(s) || "12".equals(s))
        {
            Log.d("nf_mdx", "TargetContext:  PAIRING SERVER/TARGET error ");
            s1.obj = TargetStateManager.TargetContextEvent.PairFailed;
        } else
        if ("0".equals(s))
        {
            Log.d("nf_mdx", "TargetContext:  PAIRING NOERROR error ");
            s1.obj = TargetStateManager.TargetContextEvent.PairSucceed;
        } else
        if ("42".equals(s))
        {
            Log.d("nf_mdx", "TargetContext:  MDX_REGISTRATION_PAIRING_IN_PROGRESS error ");
            s1.obj = TargetStateManager.TargetContextEvent.RegistrationInProgress;
        } else
        {
            Log.d("nf_mdx", "TargetContext:  PAIRING unknown error ");
            s1.obj = TargetStateManager.TargetContextEvent.PairFailedNeedRegPair;
        }
        mTargetContextHandler.sendMessage(s1);
    }

    public void pairingSucceed(String s)
    {
        Message message = new Message();
        message.what = 1;
        message.obj = TargetStateManager.TargetContextEvent.PairSucceed;
        synchronized (mPairingContext)
        {
            mPairingContext = s;
        }
        mTargetContextHandler.sendMessage(message);
        return;
        s;
        s1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void removeEvents(TargetStateManager.TargetContextEvent targetcontextevent)
    {
        mTargetContextHandler.removeMessages(1, targetcontextevent);
    }

    public void scheduleEvent(TargetStateManager.TargetContextEvent targetcontextevent, int i)
    {
        Message message = new Message();
        message.what = 1;
        message.obj = targetcontextevent;
        if (i > 0)
        {
            mTargetContextHandler.sendMessageDelayed(message, i);
            return;
        } else
        {
            mTargetContextHandler.sendMessage(message);
            return;
        }
    }

    public void sendCommand(final String messageName, final JSONObject msgObj)
    {
        if (Log.isLoggable("nf_mdx", 3))
        {
            Log.d("nf_mdx", (new StringBuilder()).append("TargetContext: sendCommand: ").append(messageName).append(", msgObj: ").append(msgObj).toString());
        }
        if (!"PLAYER_GET_CAPABILITIES".equals(messageName)) goto _L2; else goto _L1
_L1:
        if (!StringUtils.isNotEmpty(mTargetCapability)) goto _L4; else goto _L3
_L3:
        Log.d("nf_mdx", "TargetContext: reutrn cached CAPABILITY");
        if (StringUtils.isNotEmpty(mDialUuid))
        {
            messageName = mDialUuid;
        } else
        {
            messageName = mUuid;
        }
        mNotifier.capability(messageName, mTargetCapability);
_L8:
        return;
_L2:
        if (!"GET_AUDIO_SUBTITLES".equals(messageName)) goto _L4; else goto _L5
_L5:
        Object obj = mAudioSubtitleSettingBlobLock;
        obj;
        JVM INSTR monitorenter ;
        String s;
        if (!StringUtils.isNotEmpty(mAudioSubtitleSettingBlob))
        {
            break MISSING_BLOCK_LABEL_221;
        }
        Log.d("nf_mdx", "TargetContext: reutrn cached AUDIO_SUBTITLES_SETTING");
        if (!StringUtils.isNotEmpty(mDialUuid))
        {
            break MISSING_BLOCK_LABEL_213;
        }
        s = mDialUuid;
_L6:
        mNotifier.audiosub(s, mAudioSubtitleSettingBlob);
        if (System.currentTimeMillis() - mPreviousAudioSubExchangeTime >= 2000L)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        Log.d("nf_mdx", "TargetContext: no need to get GET_AUDIO_SUBTITLES_SETTING");
        return;
        messageName;
        obj;
        JVM INSTR monitorexit ;
        throw messageName;
        s = mUuid;
          goto _L6
        mPreviousAudioSubExchangeTime = System.currentTimeMillis();
        obj;
        JVM INSTR monitorexit ;
_L4:
        int i;
        Message message = new Message();
        message.what = 2;
        message.obj = new Runnable() {

            final TargetContext this$0;
            final String val$messageName;
            final JSONObject val$msgObj;

            public void run()
            {
                mController.getSession().sendMessage(mSessionId, messageName, msgObj);
            }

            
            {
                this$0 = TargetContext.this;
                messageName = s;
                msgObj = jsonobject;
                super();
            }
        };
        mTargetContextHandler.sendMessage(message);
        if (!"PLAYER_SET_VOLUME".equals(messageName))
        {
            break MISSING_BLOCK_LABEL_316;
        }
        i = msgObj.optInt("volume", -1);
        if (i < 0) goto _L8; else goto _L7
_L7:
        synchronized (mPlayerStateManager)
        {
            mPlayerStateManager.setTargetVolume(i);
        }
        return;
        msgObj;
        messageName;
        JVM INSTR monitorexit ;
        throw msgObj;
        if ("SET_AUDIO_SUBTITLES".equals(messageName))
        {
            invalidateCachedLanguageData();
            return;
        }
        synchronized (mPlayerStateManager)
        {
            mPlayerStateManager.receivedCommand(messageName);
        }
        return;
        messageName;
        msgObj;
        JVM INSTR monitorexit ;
        throw messageName;
    }

    public void sessionEnd()
    {
        Object obj;
        if (StringUtils.isNotEmpty(mDialUuid))
        {
            obj = mDialUuid;
        } else
        {
            obj = mUuid;
        }
        synchronized (mPlayerStateManager)
        {
            mPlayerStateManager.forceToEndPlayback(((String) (obj)), null);
        }
        mNotifier.error(((String) (obj)), 200, "session ended");
        obj = new Message();
        obj.what = 1;
        obj.obj = TargetStateManager.TargetContextEvent.SessionEnd;
        mTargetContextHandler.sendMessage(((Message) (obj)));
        return;
        exception;
        playerstatemanager;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void sessionStarted(int i)
    {
        mSessionId = i;
        Message message = new Message();
        message.what = 1;
        message.obj = TargetStateManager.TargetContextEvent.StartSessionSucceed;
        mTargetContextHandler.sendMessage(message);
    }

    public void stateHasError(TargetStateManager.TargetState targetstate)
    {
        String s;
        String s1;
        int i;
        if (StringUtils.isNotEmpty(mDialUuid))
        {
            s = mDialUuid;
        } else
        {
            s = mUuid;
        }
        i = determineStateErrorCode(targetstate, mController.getSession().getLastMessageName(mSessionId));
        s1 = new String();
        if (targetstate != null)
        {
            s1 = (new StringBuilder()).append(targetstate.getName()).append(" target error").toString();
        }
        mNotifier.error(s, i, s1);
    }

    public void stateHasExhaustedRetry(TargetStateManager.TargetState targetstate)
    {
        String s;
        String s1;
        int i;
        if (StringUtils.isNotEmpty(mDialUuid))
        {
            s = mDialUuid;
        } else
        {
            s = mUuid;
        }
        i = determineStateErrorCode(targetstate, mController.getSession().getLastMessageName(mSessionId));
        s1 = new String();
        if (targetstate != null)
        {
            s1 = (new StringBuilder()).append(targetstate.getName()).append(", failed: ").append(mLastError).toString();
        }
        mNotifier.error(s, i, s1);
    }

    public void stateHasTimedOut(TargetStateManager.TargetState targetstate)
    {
        String s;
        String s1;
        if (StringUtils.isNotEmpty(mDialUuid))
        {
            s = mDialUuid;
        } else
        {
            s = mUuid;
        }
        s1 = new String();
        if (targetstate != null)
        {
            s1 = (new StringBuilder()).append(targetstate.getName()).append(", timeout: ").append(mLastError).toString();
        }
        mNotifier.error(s, 100, s1);
    }

    public void updateTargetProperty(RemoteDevice remotedevice)
    {
        mUsn = getTargetProperty(remotedevice.usn);
        mUuid = getTargetProperty(remotedevice.uuid);
        mLocation = getTargetProperty(remotedevice.location);
        mFriendlyName = getTargetProperty(remotedevice.friendlyName);
        mDialUsn = getTargetProperty(remotedevice.dialUsn);
        mDialUuid = getTargetProperty(remotedevice.dialUuid);
        mPairingContext = getTargetProperty(remotedevice.pairingContext);
        mServiceType = getTargetProperty(remotedevice.serviceType);
        mLaunchStatus = remotedevice.launchStatus;
        mRegistrationAcceptance = remotedevice.registrationAcceptance;
        mActivated = remotedevice.activated;
        if (mTargetContextHandler != null)
        {
            remotedevice = new Message();
            remotedevice.what = 3;
            mTargetContextHandler.sendMessage(remotedevice);
        }
    }
















}
