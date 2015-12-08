// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.pcmhost;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.util.Log;
import com.microsoft.media.RtcPalEnvironment;

// Referenced classes of package com.skype.pcmhost:
//            jniInput, jniCallback, HwOffload, Interop

public class PcmHost
    implements jniInput
{
    public static final class AudioRoute extends Enum
    {

        private static final AudioRoute $VALUES[];
        public static final AudioRoute BLUETOOTH;
        public static final AudioRoute EARPIECE;
        public static final AudioRoute HEADSET_WITHOUT_MIC;
        public static final AudioRoute HEADSET_WITH_MIC;
        public static final AudioRoute SPEAKER;

        public static AudioRoute valueOf(String s)
        {
            return (AudioRoute)Enum.valueOf(com/skype/pcmhost/PcmHost$AudioRoute, s);
        }

        public static AudioRoute[] values()
        {
            return (AudioRoute[])$VALUES.clone();
        }

        static 
        {
            EARPIECE = new AudioRoute("EARPIECE", 0);
            SPEAKER = new AudioRoute("SPEAKER", 1);
            BLUETOOTH = new AudioRoute("BLUETOOTH", 2);
            HEADSET_WITH_MIC = new AudioRoute("HEADSET_WITH_MIC", 3);
            HEADSET_WITHOUT_MIC = new AudioRoute("HEADSET_WITHOUT_MIC", 4);
            $VALUES = (new AudioRoute[] {
                EARPIECE, SPEAKER, BLUETOOTH, HEADSET_WITH_MIC, HEADSET_WITHOUT_MIC
            });
        }

        private AudioRoute(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class AudioRouteStates extends Enum
    {

        private static final AudioRouteStates $VALUES[];
        public static final AudioRouteStates EARPIECE;
        public static final AudioRouteStates HEADSET;
        public static final AudioRouteStates SCO_CONNECTED;
        public static final AudioRouteStates SCO_CONNECTING;
        public static final AudioRouteStates SPEAKER;

        public static AudioRouteStates valueOf(String s)
        {
            return (AudioRouteStates)Enum.valueOf(com/skype/pcmhost/PcmHost$AudioRouteStates, s);
        }

        public static AudioRouteStates[] values()
        {
            return (AudioRouteStates[])$VALUES.clone();
        }

        static 
        {
            EARPIECE = new AudioRouteStates("EARPIECE", 0);
            HEADSET = new AudioRouteStates("HEADSET", 1);
            SPEAKER = new AudioRouteStates("SPEAKER", 2);
            SCO_CONNECTING = new AudioRouteStates("SCO_CONNECTING", 3);
            SCO_CONNECTED = new AudioRouteStates("SCO_CONNECTED", 4);
            $VALUES = (new AudioRouteStates[] {
                EARPIECE, HEADSET, SPEAKER, SCO_CONNECTING, SCO_CONNECTED
            });
        }

        private AudioRouteStates(String s, int i)
        {
            super(s, i);
        }
    }

    public static class clientCallback
    {

        public void callbackStopRingoutTone()
        {
        }

        public void callbackWithError(String s)
        {
        }

        public void callbackWithoutError(String s)
        {
        }

        public clientCallback()
        {
        }
    }


    public static final int PCMIF_ERROR = 1;
    public static final int PCMIF_ERROR_ALREADY_RUNNING = 5;
    public static final int PCMIF_ERROR_NOT_INITIALIZED = 3;
    public static final int PCMIF_ERROR_PROP_NOT_SUPPORTED = 2;
    public static final int PCMIF_ERROR_SIZE = 6;
    public static final int PCMIF_ERROR_UNKNOWN_DEVICE = 4;
    public static final int PCMIF_OK = 0;
    private static final String TAG = "PcmHost";
    private static Context mAppContext = null;
    private static BroadcastReceiver sBTReceiver = null;
    private clientCallback _clientCallback;
    private boolean _clientRouting;
    private HwOffload _hwoffload;
    private jniCallback _jniHost;
    private final boolean _manageAudioManagerModes;
    private AudioManager _manager;
    private AudioRoute _rememberedRoute;
    private boolean _requestedBluetooth;
    private AudioRouteStates _routeState;
    private AudioRoute _routeStateForClient;
    private int gTrackChannelConfig;
    private int gTrackMinSize;
    private int gTrackSampleRate;
    public int trackID;

    public PcmHost(Context context)
    {
        this(context, "/tmp/", true, true, false, null);
    }

    public PcmHost(Context context, int i, int j, boolean flag, boolean flag1)
    {
        this(context, "/tmp/", flag, flag1, false, null);
    }

    public PcmHost(Context context, String s, boolean flag, boolean flag1, boolean flag2, clientCallback clientcallback)
    {
        _requestedBluetooth = false;
        _routeState = AudioRouteStates.EARPIECE;
        _rememberedRoute = AudioRoute.EARPIECE;
        _clientRouting = false;
        _routeStateForClient = AudioRoute.EARPIECE;
        trackID = 0;
        gTrackSampleRate = 0;
        gTrackChannelConfig = 0;
        gTrackMinSize = 0;
        _manageAudioManagerModes = flag1;
        _manager = (AudioManager)context.getSystemService("audio");
        _jniHost = new jniCallback();
        _clientRouting = flag2;
        if (_clientRouting)
        {
            _clientCallback = clientcallback;
        }
        _jniHost.Setup(this, s);
        mAppContext = context;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            _hwoffload = new HwOffload();
            _jniHost.SetupHwOffload(_hwoffload);
        }
    }

    public PcmHost(Context context, boolean flag, boolean flag1)
    {
        this(context, "/tmp/", flag, flag1, false, null);
    }

    public PcmHost(Context context, boolean flag, boolean flag1, boolean flag2, clientCallback clientcallback)
    {
        this(context, "/tmp/", flag, flag1, flag2, clientcallback);
    }

    private AudioRouteStates GetRouteStateWhenScoIsDisconnected()
    {
        if (_manager.isSpeakerphoneOn())
        {
            return AudioRouteStates.SPEAKER;
        }
        if (_manager.isWiredHeadsetOn())
        {
            return AudioRouteStates.HEADSET;
        } else
        {
            return AudioRouteStates.EARPIECE;
        }
    }

    private void LogRouteState()
    {
        AudioRouteStates audioroutestates;
        if (_routeState != AudioRouteStates.EARPIECE && _routeState != AudioRouteStates.SPEAKER && _routeState != AudioRouteStates.HEADSET)
        {
            audioroutestates = AudioRouteStates.SCO_CONNECTED;
        }
    }

    private int RecorderBufferSize(int i, int j)
    {
        int k = AudioRecord.getMinBufferSize(i, j, 2);
        j = k;
        if (k < 0)
        {
            (new StringBuilder()).append(i).append(" not supported by the recorder");
            j = 0;
        }
        return j;
    }

    private void UpdateRouteState()
    {
        if (_routeState != AudioRouteStates.SCO_CONNECTED && _routeState != AudioRouteStates.SCO_CONNECTING)
        {
            _routeState = GetRouteStateWhenScoIsDisconnected();
        }
    }

    private void _setVoiceRoute(AudioRoute audioroute)
    {
        (new StringBuilder("_setVoiceRoute(")).append(audioroute).append(")");
        AudioRoute audioroute1;
        boolean flag;
        if (RtcPalEnvironment.IsPalInitialized())
        {
            try
            {
                RtcPalEnvironment.setActiveEndpoint(Interop.SkypeToLyncEndpoint(audioroute));
                (new StringBuilder("_setVoiceRoute(")).append(audioroute).append(") routed to Lync stack");
            }
            catch (UnsatisfiedLinkError unsatisfiedlinkerror)
            {
                Log.e("PcmHost", "_setVoiceRoute - error calling Lync stack, stack may be unloaded", unsatisfiedlinkerror);
            }
        }
        if (!_clientRouting) goto _L2; else goto _L1
_L1:
        audioroute1 = _routeStateForClient;
        _routeStateForClient = audioroute;
        if (audioroute1 == audioroute) goto _L4; else goto _L3
_L3:
        flag = RoutingChangeCallback(audioRouteToInt(audioroute), audioRouteToInt(audioroute1), 0);
        (new StringBuilder("RoutingChangeCallback(")).append(audioRouteToInt(audioroute)).append(", ").append(audioRouteToInt(audioroute1)).append(", 0)");
        if (_clientCallback != null && (audioroute1 != AudioRoute.BLUETOOTH && audioroute != AudioRoute.BLUETOOTH || flag))
        {
            _clientCallback.callbackWithoutError(routingStateToString(audioroute));
        }
_L6:
        return;
_L4:
        if (_clientCallback != null)
        {
            _clientCallback.callbackWithoutError(routingStateToString(audioroute));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        UpdateRouteState();
        LogRouteState();
        AudioRouteStates audioroutestates = _routeState;
        if ((_routeState == AudioRouteStates.SCO_CONNECTED || _routeState == AudioRouteStates.SCO_CONNECTING) && audioroute != AudioRoute.BLUETOOTH)
        {
            stopBluetooth();
        } else
        if (audioroute == AudioRoute.BLUETOOTH && _jniHost.IsDefaultEndpointBluetooth())
        {
            startBluetooth();
        }
        if (_routeState != AudioRouteStates.SPEAKER && audioroute == AudioRoute.SPEAKER)
        {
            _manager.setSpeakerphoneOn(true);
        }
        if (_routeState == AudioRouteStates.SPEAKER && audioroute != AudioRoute.SPEAKER)
        {
            _manager.setSpeakerphoneOn(false);
        }
        UpdateRouteState();
        LogRouteState();
        if (audioroute == AudioRoute.BLUETOOTH || audioroutestates == AudioRouteStates.SCO_CONNECTING || audioroutestates == AudioRouteStates.SCO_CONNECTED || audioroutestates != _routeState)
        {
            RoutingChangeCallback(audioRouteToInt(audioroute), audioStateToInt(audioroutestates), 0);
            (new StringBuilder("RoutingChangeCallback(")).append(audioRouteToInt(audioroute)).append(", ").append(audioStateToInt(audioroutestates)).append(", 0)");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private int audioRouteToInt(AudioRoute audioroute)
    {
        if (audioroute != AudioRoute.EARPIECE)
        {
            if (audioroute == AudioRoute.SPEAKER)
            {
                return 2;
            }
            if (audioroute == AudioRoute.BLUETOOTH)
            {
                return 3;
            }
            if (audioroute == AudioRoute.HEADSET_WITH_MIC)
            {
                return 4;
            }
            if (audioroute == AudioRoute.HEADSET_WITHOUT_MIC)
            {
                return 5;
            }
        }
        return 1;
    }

    private int audioStateToInt(AudioRouteStates audioroutestates)
    {
        if (audioroutestates != AudioRouteStates.EARPIECE)
        {
            if (audioroutestates == AudioRouteStates.SPEAKER)
            {
                return 2;
            }
            if (audioroutestates != AudioRouteStates.HEADSET)
            {
                audioroutestates = AudioRouteStates.SCO_CONNECTED;
                return 3;
            }
        }
        return 1;
    }

    private static final String audioStateToString(int i)
    {
        if (i == 2)
        {
            return "SCO Connecting";
        }
        if (i == 1)
        {
            return "SCO Connected";
        }
        if (i == 0)
        {
            return "SCO Disconnected";
        }
        if (i == -1)
        {
            return "SCO Error";
        } else
        {
            return (new StringBuilder("Unexpected audio state ")).append(i).toString();
        }
    }

    private void cleanTrack(AudioTrack audiotrack)
    {
        if (audiotrack != null)
        {
            audiotrack.release();
        }
    }

    private int getFakeAudioTrackSessionID()
    {
        Log.i("PcmHost", "getFakeAudioTrackSessionID +++");
        gTrackMinSize = AudioTrack.getMinBufferSize(gTrackSampleRate, gTrackChannelConfig, 2);
        if (gTrackMinSize < 0)
        {
            return 0;
        }
        int j = gTrackSampleRate;
        Object obj;
        byte byte0;
        if (gTrackChannelConfig == 1)
        {
            byte0 = 4;
        } else
        {
            byte0 = 12;
        }
        try
        {
            obj = new AudioTrack(0, j, byte0, 2, gTrackMinSize, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("PcmHost", "Exception occured in new AudioRecord(): ", ((Throwable) (obj)));
            cleanTrack(null);
            return 0;
        }
        if (((AudioTrack) (obj)).getState() != 1)
        {
            Log.e("PcmHost", "AudioTrack failed to initialize, no audio session ID!");
            cleanTrack(((AudioTrack) (obj)));
            return 0;
        } else
        {
            int i = ((AudioTrack) (obj)).getAudioSessionId();
            Log.i("PcmHost", (new StringBuilder("AudioTrack session ID is ")).append(i).toString());
            cleanTrack(((AudioTrack) (obj)));
            Log.i("PcmHost", "getFakeAudioTrackSessionID ---");
            return i;
        }
    }

    private AudioRouteStates mapScoToAudioRouteState(int i)
    {
        if (i == 2)
        {
            return AudioRouteStates.SCO_CONNECTING;
        }
        if (i == 1)
        {
            return AudioRouteStates.SCO_CONNECTED;
        } else
        {
            return GetRouteStateWhenScoIsDisconnected();
        }
    }

    private static final String routingStateToString(AudioRoute audioroute)
    {
        if (audioroute == AudioRoute.EARPIECE)
        {
            return "EARPIECE";
        }
        if (audioroute == AudioRoute.SPEAKER)
        {
            return "SPEAKER";
        }
        if (audioroute == AudioRoute.BLUETOOTH)
        {
            return "BLUETOOTH";
        }
        if (audioroute == AudioRoute.HEADSET_WITH_MIC)
        {
            return "HEADSET_WITH_MIC";
        }
        if (audioroute == AudioRoute.HEADSET_WITHOUT_MIC)
        {
            return "HEADSET_WITHOUT_MIC";
        } else
        {
            return "";
        }
    }

    private void setMode(int i)
    {
        if (_manageAudioManagerModes)
        {
            _manager.setMode(i);
        }
    }

    private void startBluetooth()
    {
        if (!_requestedBluetooth && android.os.Build.VERSION.SDK_INT >= 8)
        {
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                setMode(0);
            }
            _manager.startBluetoothSco();
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                _manager.setBluetoothScoOn(true);
            }
            _requestedBluetooth = true;
        }
    }

    private void stopBluetooth()
    {
        if (_requestedBluetooth && android.os.Build.VERSION.SDK_INT >= 8)
        {
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                _manager.setBluetoothScoOn(false);
            }
            _manager.stopBluetoothSco();
            setMode(3);
            _requestedBluetooth = false;
        }
    }

    public int GetAudioStreamType(int i)
    {
        int j;
        j = -1;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        int k = gTrackSampleRate;
        Object obj;
        if (gTrackChannelConfig == 1)
        {
            j = 4;
        } else
        {
            j = 12;
        }
        try
        {
            obj = new AudioTrack(0, k, j, 2, gTrackMinSize, 1, i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("PcmHost", "Exception occured in new AudioRecord(): ", ((Throwable) (obj)));
            cleanTrack(null);
            return 0;
        }
        if (((AudioTrack) (obj)).getState() != 1)
        {
            Log.e("PcmHost", "AudioTrack failed to initialize, no audio session ID!");
            cleanTrack(((AudioTrack) (obj)));
            return 0;
        }
        j = ((AudioTrack) (obj)).getStreamType();
        cleanTrack(((AudioTrack) (obj)));
        return j;
    }

    public int GetAudioTrackSessionID(int i, int j)
    {
        gTrackSampleRate = i;
        gTrackChannelConfig = j;
        j = getFakeAudioTrackSessionID();
        i = getFakeAudioTrackSessionID();
        if (j != 0 && i != 0 && j != i)
        {
            j = i - j;
            trackID = i + j;
            if (getFakeAudioTrackSessionID() == trackID)
            {
                trackID = trackID + j;
                (new StringBuilder("Successfully got track sessionID=")).append(trackID);
                return trackID;
            }
        }
        return 0;
    }

    public int GetMute(int i, int ai[])
    {
        (new StringBuilder("JAVA GetMute(")).append(i).append(")");
        return 0;
    }

    public int GetRecorderPreferredSampleRate(boolean flag)
    {
        Object obj;
        Object obj1;
        Object obj2;
        AudioRecord audiorecord;
        int i;
        int k;
        int l;
        int j = 2;
        byte byte0;
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            j = 16;
        }
        i = 0;
        flag1 = false;
        if (flag)
        {
            byte0 = 7;
        } else
        {
            byte0 = 0;
        }
        obj = null;
_L6:
        l = (new int[] {
            48000, 44100, 16000, 8000, 22050
        })[i];
        k = RecorderBufferSize(l, j);
        if (k <= 0) goto _L2; else goto _L1
_L1:
        audiorecord = new AudioRecord(byte0, l, j, 2, k);
        obj1 = audiorecord;
        obj2 = audiorecord;
        if (audiorecord.getState() == 1)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        obj2 = audiorecord;
        Log.e("PcmHost", (new StringBuilder("AudioRecorder failed to initialize at rate=")).append(l).toString());
        obj2 = audiorecord;
        audiorecord.release();
        obj1 = null;
        obj = obj1;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        k = i;
_L5:
        i = ((flag1) ? 1 : 0);
        if (k < 5)
        {
            j = l;
            i = j;
            if (obj1 != null)
            {
                ((AudioRecord) (obj1)).release();
                i = j;
            }
        }
        return i;
        obj1;
_L9:
        obj2 = obj;
        Log.e("PcmHost", (new StringBuilder("Exception occured in new AudioRecord() with sample_rate=: ")).append(l).toString(), ((Throwable) (obj1)));
        obj2 = obj;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        obj2 = obj;
        ((AudioRecord) (obj)).release();
        obj2 = null;
        obj1 = obj2;
        k = i;
        if (obj2 != null) goto _L5; else goto _L4
_L4:
        obj = obj2;
_L2:
        i++;
        obj1 = obj;
        k = i;
        if (i >= 5) goto _L5; else goto _L6
        Exception exception;
        exception;
        obj2 = obj;
        obj = exception;
_L8:
        exception = ((Exception) (obj2));
        k = i;
        if (obj2 != null) goto _L5; else goto _L7
_L7:
        throw obj;
        obj;
          goto _L8
        exception;
        obj = audiorecord;
          goto _L9
    }

    public int GetVolumeParameters(int i, int ai[])
    {
        (new StringBuilder("JAVA GetVolumeParameters(")).append(i).append(")");
        return 0;
    }

    public int Init()
    {
        if (_clientRouting)
        {
            return 0;
        } else
        {
            sBTReceiver = new BroadcastReceiver() {

                final PcmHost this$0;

                public void onReceive(Context context, Intent intent)
                {
                    context = intent.getAction();
                    (new StringBuilder("onReceive() action = '")).append(context).append("'");
                    if ("android.intent.action.HEADSET_PLUG".equals(context))
                    {
                        if (_manager.isWiredHeadsetOn())
                        {
                            if (_routeState == AudioRouteStates.SPEAKER)
                            {
                                _rememberedRoute = AudioRoute.SPEAKER;
                            }
                            if (_routeState == AudioRouteStates.SCO_CONNECTED || _routeState == AudioRouteStates.SCO_CONNECTING)
                            {
                                _rememberedRoute = AudioRoute.BLUETOOTH;
                            }
                            _setVoiceRoute(AudioRoute.HEADSET_WITH_MIC);
                            return;
                        } else
                        {
                            _setVoiceRoute(_rememberedRoute);
                            return;
                        }
                    }
                    int i = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                    if (context.equals("android.media.SCO_AUDIO_STATE_CHANGED"))
                    {
                        (new StringBuilder("SCO - audio state CHANGED to '")).append(PcmHost.audioStateToString(i)).append("'");
                    } else
                    if (context.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"))
                    {
                        (new StringBuilder("SCO - audio state UPDATED to '")).append(PcmHost.audioStateToString(i)).append("'");
                    } else
                    {
                        (new StringBuilder("Ignoring SCO audio state change '")).append(PcmHost.audioStateToString(i)).append("'");
                    }
                    _routeState = mapScoToAudioRouteState(i);
                }

            
            {
                this$0 = PcmHost.this;
                super();
            }
            };
            IntentFilter intentfilter = new IntentFilter("android.media.SCO_AUDIO_STATE_CHANGED");
            intentfilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            intentfilter.addAction("android.intent.action.HEADSET_PLUG");
            mAppContext.registerReceiver(sBTReceiver, intentfilter);
            return 0;
        }
    }

    public boolean RoutingChangeCallback(int i, int j, int k)
    {
        return _jniHost.RoutingChangeCallback(i, j, k);
    }

    public int SetInputBoost(int i)
    {
        (new StringBuilder("JAVA SetInputBoost(")).append(i).append(")");
        return 2;
    }

    public int SetMute(int i, int j)
    {
        (new StringBuilder("JAVA SetMute(")).append(i).append(", ").append(j).append(")");
        return 0;
    }

    public int SetRoute(String s)
    {
        (new StringBuilder("JAVA SetRoute(")).append(s).append(")");
        setMode(3);
        if (s.equals("EARPIECE") || s.equals("0_1") || s.equals("1_1") || s.equals("2_1"))
        {
            _setVoiceRoute(AudioRoute.EARPIECE);
            return 0;
        }
        if (s.equals("SPEAKER") || s.equals("0_2") || s.equals("1_2") || s.equals("2_2"))
        {
            _setVoiceRoute(AudioRoute.SPEAKER);
            return 0;
        }
        if (s.equals("BLUETOOTH") || s.equals("0_3") || s.equals("1_3") || s.equals("2_3"))
        {
            _setVoiceRoute(AudioRoute.BLUETOOTH);
            return 0;
        }
        if (s.equals("HEADSET_WITH_MIC") || s.equals("0_4") || s.equals("1_4") || s.equals("2_4"))
        {
            _setVoiceRoute(AudioRoute.HEADSET_WITH_MIC);
            setHeadsetMicStatus(true);
            return 0;
        }
        if (s.equals("HEADSET_WITHOUT_MIC") || s.equals("0_5") || s.equals("1_5") || s.equals("2_5"))
        {
            _setVoiceRoute(AudioRoute.HEADSET_WITHOUT_MIC);
            setHeadsetMicStatus(false);
            return 0;
        } else
        {
            return 4;
        }
    }

    public int SetVolume(int i, int j)
    {
        (new StringBuilder("JAVA SetVolume(")).append(i).append(", ").append(j).append(")");
        return 2;
    }

    public void StopRingoutTone()
    {
        if (_clientCallback != null)
        {
            _clientCallback.callbackStopRingoutTone();
        }
    }

    public int Uninit()
    {
        if (_clientRouting)
        {
            return 0;
        }
        try
        {
            mAppContext.unregisterReceiver(sBTReceiver);
        }
        catch (IllegalArgumentException illegalargumentexception) { }
        _setVoiceRoute(AudioRoute.EARPIECE);
        return 0;
    }

    public void setHeadsetMicStatus(boolean flag)
    {
        if (!RtcPalEnvironment.IsPalInitialized())
        {
            break MISSING_BLOCK_LABEL_30;
        }
        RtcPalEnvironment.setHeadsetWithMicStatus(flag);
        (new StringBuilder("setHeadsetMicStatus(")).append(flag).append(") routed to Lync stack");
        return;
        UnsatisfiedLinkError unsatisfiedlinkerror;
        unsatisfiedlinkerror;
        Log.e("PcmHost", "setHeadsetMicStatus - error calling Lync stack, stack may be unloaded", unsatisfiedlinkerror);
        return;
    }





/*
    static AudioRouteStates access$102(PcmHost pcmhost, AudioRouteStates audioroutestates)
    {
        pcmhost._routeState = audioroutestates;
        return audioroutestates;
    }

*/



/*
    static AudioRoute access$202(PcmHost pcmhost, AudioRoute audioroute)
    {
        pcmhost._rememberedRoute = audioroute;
        return audioroute;
    }

*/



}
