// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.nuance.nmdp.speechkit.DataUploadCommand;
import com.nuance.nmdp.speechkit.DataUploadResult;
import com.nuance.nmdp.speechkit.GenericCommand;
import com.nuance.nmdp.speechkit.GenericResult;
import com.nuance.nmdp.speechkit.Recognition;
import com.nuance.nmdp.speechkit.Recognizer;
import com.nuance.nmdp.speechkit.SpeechError;
import com.nuance.nmdp.speechkit.SpeechKit;
import com.nuance.nmdp.speechkit.Vocalizer;
import com.nuance.nmdp.speechkit.recognitionresult.DetailedResult;
import com.nuance.nmdp.speechkit.util.dataupload.Action;
import com.nuance.nmdp.speechkit.util.dataupload.Data;
import com.nuance.nmdp.speechkit.util.dataupload.DataBlock;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            MMWebView, MMLog, MMSDK

public class NVASpeechKit
{
    static class AudioLevelTracker
    {

        private static final double MAX = 80D;
        private static final double MIN = 40D;
        private static final double NORMALIZE_FACTOR = 4.0040040040040044D;
        private static final double SCALE = 9.9900000000000002D;
        double audioLevel;
        int audioLevelCount;
        double averageLevel;
        boolean isTrackingAudioSample;

        private static double normalize(double d)
        {
            return Math.min(9.9900000000000002D, Math.max(Math.floor(d - 40D) / 4.0040040040040044D, 0.0D));
        }

        public boolean isTrackingAudioSample()
        {
            return isTrackingAudioSample;
        }

        public void reset()
        {
            averageLevel = 0.0D;
            audioLevelCount = 0;
            isTrackingAudioSample = false;
        }

        public void startTrackingAudioSample()
        {
            reset();
            isTrackingAudioSample = true;
        }

        public boolean update(double d)
        {
            double d1 = averageLevel;
            double d2 = audioLevel;
            audioLevel = d;
            audioLevelCount = audioLevelCount + 1;
            for (averageLevel = ((double)(audioLevelCount - 1) * d1 + d) / (double)audioLevelCount; isTrackingAudioSample || audioLevel == d2;)
            {
                return false;
            }

            return true;
        }


        public AudioLevelTracker()
        {
            reset();
        }
    }

    public static final class CustomWordsOp extends Enum
    {

        private static final CustomWordsOp $VALUES[];
        public static final CustomWordsOp Add;
        public static final CustomWordsOp Remove;

        public static CustomWordsOp valueOf(String s)
        {
            return (CustomWordsOp)Enum.valueOf(com/millennialmedia/android/NVASpeechKit$CustomWordsOp, s);
        }

        public static CustomWordsOp[] values()
        {
            return (CustomWordsOp[])$VALUES.clone();
        }

        static 
        {
            Add = new CustomWordsOp("Add", 0);
            Remove = new CustomWordsOp("Remove", 1);
            $VALUES = (new CustomWordsOp[] {
                Add, Remove
            });
        }

        private CustomWordsOp(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface Listener
    {

        public abstract void onAudioLevelUpdate(double d);

        public abstract void onAudioSampleUpdate(double d);

        public abstract void onCustomWordsAdded();

        public abstract void onCustomWordsDeleted();

        public abstract void onError();

        public abstract void onResults();

        public abstract void onStateChange(State state1);
    }

    public class Result
    {

        public final int resultScore;
        public final String resultString;
        final NVASpeechKit this$0;

        public int getResultScore()
        {
            return resultScore;
        }

        public String getResultString()
        {
            return resultString;
        }

        public Result(String s, double d)
        {
            this$0 = NVASpeechKit.this;
            super();
            resultString = s;
            resultScore = (int)d;
        }
    }

    public static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State ERROR;
        public static final State PROCESSING;
        public static final State READY;
        public static final State RECORDING;
        public static final State VOCALIZING;
        private String name;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/millennialmedia/android/NVASpeechKit$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        public String toString()
        {
            return name;
        }

        static 
        {
            ERROR = new State("ERROR", 0, "error");
            VOCALIZING = new State("VOCALIZING", 1, "vocalizing");
            RECORDING = new State("RECORDING", 2, "recording");
            READY = new State("READY", 3, "ready");
            PROCESSING = new State("PROCESSING", 4, "processing");
            $VALUES = (new State[] {
                ERROR, VOCALIZING, RECORDING, READY, PROCESSING
            });
        }

        private State(String s, int i, String s1)
        {
            super(s, i);
            name = s1;
        }
    }


    static final float AUDIO_LEVEL_CHANGE_INTERVAL = 0.25F;
    static final float AUDIO_LEVEL_MAX = 90F;
    private static final int AUDIO_LEVEL_UPDATE_FREQUENCY = 50;
    private static final int AUDIO_SAMPLE_PERIOD = 2000;
    static final float SAMPLING_BG_INTERVAL = 0.1F;
    private static final String TAG = "NVASpeechKit";
    private static String nuanceIdCache = null;
    HandShake.NuanceCredentials _credentials;
    public Result _results[];
    private Runnable audioLevelCallback;
    private AudioLevelTracker audioLevelTracker;
    private Runnable audioSampleCallback;
    private com.nuance.nmdp.speechkit.GenericCommand.Listener commandListener;
    private com.nuance.nmdp.speechkit.DataUploadCommand.Listener dataUploadListener;
    private String nuance_transaction_session_id;
    private String packageName;
    private DataUploadCommand pendingDataUploadCommand;
    private CustomWordsOp pendingDataUploadCommandType;
    private SpeechKit sk;
    private Recognizer skCurrentRecognizer;
    private Vocalizer skCurrentVocalizer;
    private com.nuance.nmdp.speechkit.Recognizer.Listener skRecogListener;
    private com.nuance.nmdp.speechkit.Vocalizer.Listener skVocalListener;
    private Listener speechKitListener;
    private Handler speeckKitHandler;
    private State state;
    private WeakReference webViewRef;

    public NVASpeechKit(MMWebView mmwebview)
    {
        _results = null;
        audioLevelTracker = new AudioLevelTracker();
        audioSampleCallback = new Runnable() {

            final NVASpeechKit this$0;

            public void run()
            {
                endRecording();
            }

            
            {
                this$0 = NVASpeechKit.this;
                super();
            }
        };
        audioLevelCallback = new Runnable() {

            final NVASpeechKit this$0;

            public void run()
            {
                if (skCurrentRecognizer != null)
                {
                    double d = AudioLevelTracker.normalize(skCurrentRecognizer.getAudioLevel());
                    MMLog.d("NVASpeechKit", (new StringBuilder()).append("audiolevel changed: level=").append(d).toString());
                    if (audioLevelTracker.update(d) && speechKitListener != null)
                    {
                        speechKitListener.onAudioLevelUpdate(d);
                    }
                    if (state == State.RECORDING || audioLevelTracker.isTrackingAudioSample)
                    {
                        speeckKitHandler.postDelayed(audioLevelCallback, 50L);
                    }
                }
            }

            
            {
                this$0 = NVASpeechKit.this;
                super();
            }
        };
        commandListener = new com.nuance.nmdp.speechkit.GenericCommand.Listener() {

            final NVASpeechKit this$0;

            public void onComplete(GenericCommand genericcommand, GenericResult genericresult, SpeechError speecherror)
            {
                if (speecherror != null)
                {
                    MMLog.e("NVASpeechKit", (new StringBuilder()).append("GenericCommand listener. Error: ").append(speecherror.getErrorDetail()).toString());
                } else
                {
                    MMLog.d("NVASpeechKit", (new StringBuilder()).append("GenericCommand listener. Success: ").append(genericresult.getQueryResult()).toString());
                }
                notifySpeechResults();
            }

            
            {
                this$0 = NVASpeechKit.this;
                super();
            }
        };
        dataUploadListener = new com.nuance.nmdp.speechkit.DataUploadCommand.Listener() {

            final NVASpeechKit this$0;

            private void notifyListener(DataUploadCommand datauploadcommand)
            {
                if (speechKitListener != null && pendingDataUploadCommand == datauploadcommand)
                {
                    if (pendingDataUploadCommandType == CustomWordsOp.Add)
                    {
                        speechKitListener.onCustomWordsAdded();
                    } else
                    {
                        speechKitListener.onCustomWordsDeleted();
                    }
                }
                pendingDataUploadCommand = null;
            }

            public void onError(DataUploadCommand datauploadcommand, SpeechError speecherror)
            {
                MMLog.e("NVASpeechKit", (new StringBuilder()).append("DataUploadCommand listener error. command:").append(datauploadcommand.toString()).append(" Error:").append(speecherror.getErrorDetail()).toString());
                notifyListener(datauploadcommand);
            }

            public void onResults(DataUploadCommand datauploadcommand, DataUploadResult datauploadresult)
            {
                MMLog.d("NVASpeechKit", (new StringBuilder()).append("DataUploadCommand listener successful command:").append(datauploadcommand.toString()).append(" isVocRegenerated:").append(datauploadresult.isVocRegenerated()).append(" results:").append(datauploadresult.toString()).toString());
                notifyListener(datauploadcommand);
            }

            
            {
                this$0 = NVASpeechKit.this;
                super();
            }
        };
        speechKitListener = new Listener() {

            final NVASpeechKit this$0;

            public void onAudioLevelUpdate(double d)
            {
                audioLevelChange(d);
            }

            public void onAudioSampleUpdate(double d)
            {
                backgroundAudioLevel(d);
            }

            public void onCustomWordsAdded()
            {
            }

            public void onCustomWordsDeleted()
            {
            }

            public void onError()
            {
            }

            public void onResults()
            {
                JSONArray jsonarray = resultsToJSON(getResults());
                recognitionResult(jsonarray.toString());
            }

            public void onStateChange(State state1)
            {
                static class _cls8
                {

                    static final int $SwitchMap$com$millennialmedia$android$NVASpeechKit$State[];

                    static 
                    {
                        $SwitchMap$com$millennialmedia$android$NVASpeechKit$State = new int[State.values().length];
                        try
                        {
                            $SwitchMap$com$millennialmedia$android$NVASpeechKit$State[State.ERROR.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            $SwitchMap$com$millennialmedia$android$NVASpeechKit$State[State.PROCESSING.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$millennialmedia$android$NVASpeechKit$State[State.READY.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$millennialmedia$android$NVASpeechKit$State[State.RECORDING.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$millennialmedia$android$NVASpeechKit$State[State.VOCALIZING.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls8..SwitchMap.com.millennialmedia.android.NVASpeechKit.State[state1.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    voiceStateChangeError();
                    return;

                case 2: // '\002'
                    voiceStateChangeProcessing();
                    return;

                case 3: // '\003'
                    voiceStateChangeReady();
                    return;

                case 4: // '\004'
                    voiceStateChangeRecording();
                    return;

                case 5: // '\005'
                    voiceStateChangeVocalizing();
                    break;
                }
            }

            
            {
                this$0 = NVASpeechKit.this;
                super();
            }
        };
        if (mmwebview != null)
        {
            webViewRef = new WeakReference(mmwebview);
            initInternalData(mmwebview.getContext().getApplicationContext());
        }
        state = State.READY;
    }

    private String byte2Str(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 0; i < abyte0.length; i++)
        {
            int j = abyte0[i] & 0xff;
            String s = Integer.toHexString(j);
            if (j < 16)
            {
                stringbuffer.append('0');
            }
            stringbuffer.append(s);
        }

        return stringbuffer.toString();
    }

    private void cancelAudioLevelCallbacks()
    {
        if (speeckKitHandler != null)
        {
            speeckKitHandler.removeCallbacks(audioSampleCallback);
            speeckKitHandler.removeCallbacks(audioLevelCallback);
        }
    }

    private com.nuance.nmdp.speechkit.Recognizer.Listener createRecognizerListener()
    {
        return new com.nuance.nmdp.speechkit.Recognizer.Listener() {

            final NVASpeechKit this$0;

            public void onError(Recognizer recognizer, SpeechError speecherror)
            {
                MMLog.d("NVASpeechKit", (new StringBuilder()).append("Speech Kit Error code:").append(speecherror.getErrorCode()).append(" detail:").append(speecherror.getErrorDetail()).append(" suggestions:").append(speecherror.getSuggestion()).toString());
                cancelAudioLevelCallbacks();
                handleSpeechError(speecherror);
                skCurrentRecognizer = null;
                if (sk != null)
                {
                    MMLog.d("NVASpeechKit", (new StringBuilder()).append("Recognizer.Listener.onError: session id [").append(sk.getSessionId()).append("]").toString());
                }
            }

            public void onRecordingBegin(Recognizer recognizer)
            {
                MMLog.d("NVASpeechKit", "recording begins");
                _results = null;
                if (!audioLevelTracker.isTrackingAudioSample())
                {
                    setState(State.RECORDING);
                }
                startProgress(recognizer);
                if (audioLevelTracker.isTrackingAudioSample())
                {
                    speeckKitHandler.removeCallbacks(audioSampleCallback);
                    speeckKitHandler.postDelayed(audioSampleCallback, 2000L);
                }
            }

            public void onRecordingDone(Recognizer recognizer)
            {
                MMLog.d("NVASpeechKit", "recording has ended");
                cancelAudioLevelCallbacks();
                if (!audioLevelTracker.isTrackingAudioSample())
                {
                    setState(State.PROCESSING);
                }
                if (sk != null)
                {
                    nuance_transaction_session_id = sk.getSessionId();
                }
            }

            public void onResults(Recognizer recognizer, Recognition recognition)
            {
                MMLog.d("NVASpeechKit", "recording results returned.");
                cancelAudioLevelCallbacks();
                if (!audioLevelTracker.isTrackingAudioSample)
                {
                    processResults(recognition.getDetailedResults());
                    if (nuance_transaction_session_id != null)
                    {
                        MMLog.d("NVASpeechKit", (new StringBuilder()).append("Recognizer.Listener.onResults: session id [").append(nuance_transaction_session_id).append("]").toString());
                    }
                    logEvent();
                    return;
                } else
                {
                    _results = new Result[0];
                    notifySpeechResults();
                    return;
                }
            }

            
            {
                this$0 = NVASpeechKit.this;
                super();
            }
        };
    }

    private com.nuance.nmdp.speechkit.Vocalizer.Listener createVocalizerListener()
    {
        return new com.nuance.nmdp.speechkit.Vocalizer.Listener() {

            final NVASpeechKit this$0;

            public void onSpeakingBegin(Vocalizer vocalizer, String s, Object obj)
            {
                MMLog.d("NVASpeechKit", (new StringBuilder()).append("Vocalization begins. text=").append(s).toString());
                setState(State.VOCALIZING);
            }

            public void onSpeakingDone(Vocalizer vocalizer, String s, SpeechError speecherror, Object obj)
            {
                MMLog.d("NVASpeechKit", "Vocalization has ended.");
                if (speecherror != null)
                {
                    MMLog.e("NVASpeechKit", (new StringBuilder()).append("Vocalizer error: ").append(speecherror.getErrorDetail()).toString());
                    handleSpeechError(speecherror);
                    return;
                } else
                {
                    setState(State.READY);
                    return;
                }
            }

            
            {
                this$0 = NVASpeechKit.this;
                super();
            }
        };
    }

    private String getAdId()
    {
        if (webViewRef != null)
        {
            MMWebView mmwebview = (MMWebView)webViewRef.get();
            if (mmwebview != null)
            {
                return mmwebview.getAdId();
            }
        }
        return "DEFAULT_AD_ID";
    }

    private MMWebView getMMWebView()
    {
        if (webViewRef != null)
        {
            return (MMWebView)webViewRef.get();
        } else
        {
            return null;
        }
    }

    private String getSpeechError(SpeechError speecherror)
    {
        if (speecherror == null)
        {
            return "No Error given";
        } else
        {
            return (new StringBuilder()).append("Speech Kit Error code:").append(speecherror.getErrorCode()).append(" detail:").append(speecherror.getErrorDetail()).append(" suggestions:").append(speecherror.getSuggestion()).toString();
        }
    }

    private void handleSpeechError(SpeechError speecherror)
    {
        switch (speecherror.getErrorCode())
        {
        case 3: // '\003'
        case 4: // '\004'
        default:
            if (speechKitListener != null)
            {
                speechKitListener.onError();
                setState(State.ERROR);
                voiceError(getSpeechError(speecherror));
            }
            return;

        case 2: // '\002'
            if (!audioLevelTracker.isTrackingAudioSample)
            {
                setState(State.PROCESSING);
            }
            _results = new Result[0];
            notifySpeechResults();
            return;

        case 5: // '\005'
            setState(State.READY);
            skCurrentRecognizer = null;
            return;
        }
    }

    private void initInternalData(Context context)
    {
        if (packageName == null)
        {
            packageName = context.getApplicationContext().getPackageName();
        }
    }

    private void notifySpeechResults()
    {
        if (speechKitListener != null && _results != null)
        {
            if (audioLevelTracker.isTrackingAudioSample)
            {
                speechKitListener.onAudioSampleUpdate(audioLevelTracker.averageLevel);
                audioLevelTracker.reset();
            } else
            {
                speechKitListener.onResults();
            }
        }
        setState(State.READY);
        skCurrentRecognizer = null;
    }

    private void processResults(List list)
    {
        MMLog.d("NVASpeechKit", "processResults called.");
        _results = new Result[list.size()];
        int i = 0;
        for (list = list.iterator(); list.hasNext();)
        {
            DetailedResult detailedresult = (DetailedResult)list.next();
            _results[i] = new Result(detailedresult.toString(), detailedresult.getConfidenceScore());
            i++;
        }

    }

    private void releaseWebView()
    {
        if (getMMWebView() != null)
        {
            webViewRef.clear();
        }
    }

    private JSONArray resultsToJSON(Result aresult[])
    {
        JSONArray jsonarray;
        int i;
        jsonarray = new JSONArray();
        i = 0;
_L2:
        Object obj;
        obj = jsonarray;
        if (i >= aresult.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new JSONObject();
        ((JSONObject) (obj)).put("score", (new StringBuilder()).append("").append(aresult[i].getResultScore()).toString());
        ((JSONObject) (obj)).put("result", aresult[i].getResultString());
        jsonarray.put(obj);
        i++;
        if (true) goto _L2; else goto _L1
        aresult;
        MMLog.e("NVASpeechKit", "JSON creation error.", aresult);
        obj = null;
_L1:
        return ((JSONArray) (obj));
    }

    private void setState(State state1)
    {
        this;
        JVM INSTR monitorenter ;
        MMLog.d("NVASpeechKit", (new StringBuilder()).append("recording results returned. state=").append(state1).toString());
        State state2 = state;
        state = state1;
        if (speechKitListener != null && state != state2)
        {
            speechKitListener.onStateChange(state1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        state1;
        throw state1;
    }

    private void startProgress(Recognizer recognizer)
    {
        speeckKitHandler.removeCallbacks(audioLevelCallback);
        speeckKitHandler.postDelayed(audioLevelCallback, 50L);
    }

    private byte[] string2Byte(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        byte abyte0[] = null;
_L4:
        return abyte0;
_L2:
        byte abyte1[] = new byte[s.length() / 2];
        int i = 0;
        do
        {
            abyte0 = abyte1;
            if (i >= abyte1.length)
            {
                continue;
            }
            abyte1[i] = (byte)Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    void audioLevelChange(double d)
    {
        MMWebView mmwebview = getMMWebView();
        if (mmwebview != null)
        {
            mmwebview.loadUrl((new StringBuilder()).append("javascript:MMJS.sdk.audioLevelChange(").append(d).append(")").toString());
        }
    }

    void backgroundAudioLevel(double d)
    {
        MMWebView mmwebview = getMMWebView();
        if (mmwebview != null)
        {
            mmwebview.loadUrl((new StringBuilder()).append("javascript:MMJS.sdk.backgroundAudioLevel(").append(d).append(")").toString());
        }
    }

    public void cancelRecording()
    {
        if (skCurrentRecognizer != null)
        {
            MMLog.d("NVASpeechKit", "cancel RECORDING");
            skCurrentRecognizer.cancel();
            skCurrentRecognizer = null;
            setState(State.READY);
        }
    }

    public boolean endRecording()
    {
        if (skCurrentRecognizer != null)
        {
            MMLog.d("NVASpeechKit", "end RECORDING");
            skCurrentRecognizer.stopRecording();
            skCurrentRecognizer = null;
            return true;
        } else
        {
            return false;
        }
    }

    String getNuanceId()
    {
        Object obj3 = null;
        this;
        JVM INSTR monitorenter ;
        if (nuanceIdCache == null) goto _L2; else goto _L1
_L1:
        Object obj = nuanceIdCache;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        Object obj2;
        obj = null;
        obj2 = obj;
        MMWebView mmwebview;
        if (webViewRef == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        mmwebview = (MMWebView)webViewRef.get();
        obj2 = obj;
        if (mmwebview == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj2 = mmwebview.getContext();
        obj = obj3;
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = android.provider.Settings.Secure.getString(((Context) (obj2)).getContentResolver(), "android_id");
        obj = obj3;
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = MMSDK.byteArrayToString(MessageDigest.getInstance("SHA1").digest(((String) (obj2)).getBytes()));
        nuanceIdCache = ((String) (obj));
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        MMLog.e("NVASpeechKit", "Problem with nuanceid", ((Throwable) (obj1)));
        obj1 = obj3;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Result[] getResults()
    {
        return _results;
    }

    String getSessionId()
    {
        if (sk != null)
        {
            return sk.getSessionId();
        } else
        {
            return "";
        }
    }

    public State getState()
    {
        this;
        JVM INSTR monitorenter ;
        State state1 = state;
        this;
        JVM INSTR monitorexit ;
        return state1;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean initialize(HandShake.NuanceCredentials nuancecredentials, Context context)
    {
        MMLog.d("NVASpeechKit", "initialize called.");
        if (nuancecredentials == null || context == null)
        {
            return false;
        }
        _credentials = nuancecredentials;
        if (sk != null)
        {
            try
            {
                sk.connect();
            }
            catch (IllegalStateException illegalstateexception)
            {
                sk = null;
            }
        }
        if (sk == null)
        {
            byte abyte0[] = string2Byte(nuancecredentials.appKey);
            MMLog.d("NVASpeechKit", nuancecredentials.toString());
            sk = SpeechKit.initialize(context, "1.0", nuancecredentials.appID, nuancecredentials.server, nuancecredentials.port, false, abyte0, com.nuance.nmdp.speechkit.SpeechKit.CmdSetType.NVC);
            skVocalListener = createVocalizerListener();
            skRecogListener = createRecognizerListener();
            speeckKitHandler = new Handler(Looper.getMainLooper());
            sk.connect();
            setState(State.READY);
            return true;
        } else
        {
            MMLog.d("NVASpeechKit", "Already initialized. Skipping.");
            return false;
        }
    }

    public void logEvent()
    {
        if (sk == null)
        {
            return;
        }
        com.nuance.nmdp.speechkit.util.pdx.PdxValue.Dictionary dictionary = new com.nuance.nmdp.speechkit.util.pdx.PdxValue.Dictionary();
        dictionary.put("nva_ad_network_id", "MillenialMedia");
        dictionary.put("nva_device_id", getNuanceId());
        dictionary.put("nva_ad_publisher_id", packageName);
        String s1 = "";
        String s = s1;
        if (_credentials != null)
        {
            s = s1;
            if (!TextUtils.isEmpty(_credentials.sessionID))
            {
                s = _credentials.sessionID;
                dictionary.put("nva_ad_session_id", _credentials.sessionID);
            }
        }
        s1 = getAdId();
        if (!TextUtils.isEmpty(s1))
        {
            dictionary.put("nva_ad_id", s1);
        }
        if (nuance_transaction_session_id != null)
        {
            dictionary.put("nva_nvc_session_id", nuance_transaction_session_id);
            String s2 = nuance_transaction_session_id;
            nuance_transaction_session_id = null;
        } else
        {
            sk.getSessionId();
        }
        MMLog.d("NVASpeechKit", (new StringBuilder()).append("Sending log revision command to server. sessionId[").append(sk.getSessionId()).append("] deviceId[").append(getNuanceId()).append("] adId[").append(s1).append("] mmSessionId[").append(s).append("]").toString());
        sk.createLogRevisionCmd("NVA_LOG_EVENT", dictionary, sk.getSessionId(), commandListener, speeckKitHandler).start();
    }

    void recognitionResult(String s)
    {
        MMWebView mmwebview = getMMWebView();
        if (mmwebview != null)
        {
            mmwebview.loadUrl((new StringBuilder()).append("javascript:MMJS.sdk.recognitionResult(").append(s).append(")").toString());
        }
    }

    public void release()
    {
        MMLog.d("NVASpeechKit", "release called.");
        stopActions();
        cancelAudioLevelCallbacks();
        if (sk != null)
        {
            sk.release();
            setState(State.READY);
            sk = null;
        }
        pendingDataUploadCommand = null;
        releaseWebView();
    }

    public void setSpeechKitListener(Listener listener)
    {
        speechKitListener = listener;
    }

    public boolean startRecording(String s)
    {
        MMLog.d("NVASpeechKit", "RECORDING INVOKED.");
        if (state == State.READY && sk != null)
        {
            nuance_transaction_session_id = null;
            skCurrentRecognizer = sk.createRecognizer("dictation", 1, s, skRecogListener, speeckKitHandler);
            MMLog.d("NVASpeechKit", "START RECORDING");
            skCurrentRecognizer.start();
            return true;
        } else
        {
            return false;
        }
    }

    public void startSampleRecording()
    {
        audioLevelTracker.startTrackingAudioSample();
        startRecording("en_US");
    }

    public void stopActions()
    {
        if (sk == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        sk.cancelCurrent();
        return;
        Exception exception;
        exception;
        MMLog.e("NVASpeechKit", "No speech kit to disconnect.", exception);
        return;
    }

    public boolean textToSpeech(String s, String s1)
    {
        MMLog.d("NVASpeechKit", "TTS INVOKED.");
        if (state == State.READY && sk != null)
        {
            skCurrentVocalizer = sk.createVocalizerWithLanguage(s1, skVocalListener, speeckKitHandler);
            skCurrentVocalizer.speakString(s, this);
            return true;
        } else
        {
            return false;
        }
    }

    public void updateCustomWords(CustomWordsOp customwordsop, String as[])
    {
        if (sk == null)
        {
            return;
        }
        DataBlock datablock = new DataBlock();
        Object obj1 = (new StringBuilder()).append("Creating dataupload command and ");
        Object obj;
        int k;
        if (customwordsop == CustomWordsOp.Add)
        {
            obj = "adding";
        } else
        {
            obj = "deleting";
        }
        MMLog.d("NVASpeechKit", ((StringBuilder) (obj1)).append(((String) (obj))).append(" words.").toString());
        obj1 = new Data("nva_custom_word_uploads", com.nuance.nmdp.speechkit.util.dataupload.Data.DataType.CUSTOMWORDS);
        if (customwordsop == CustomWordsOp.Add)
        {
            obj = com.nuance.nmdp.speechkit.util.dataupload.Action.ActionType.ADD;
        } else
        {
            obj = com.nuance.nmdp.speechkit.util.dataupload.Action.ActionType.REMOVE;
        }
        obj = new Action(((com.nuance.nmdp.speechkit.util.dataupload.Action.ActionType) (obj)));
        k = as.length;
        for (int i = 0; i < k; i++)
        {
            String s = as[i];
            ((Action) (obj)).addWord(s);
            MMLog.d("NVASpeechKit", (new StringBuilder()).append("\tword: '").append(s).append("'").toString());
        }

        ((Data) (obj1)).addAction(((Action) (obj)));
        datablock.addData(((Data) (obj1)));
        int j = datablock.getChecksum();
        pendingDataUploadCommandType = customwordsop;
        pendingDataUploadCommand = sk.createDataUploadCmd(datablock, j, j, dataUploadListener, speeckKitHandler);
        pendingDataUploadCommand.start();
    }

    void voiceError(String s)
    {
        MMWebView mmwebview = getMMWebView();
        if (mmwebview != null)
        {
            mmwebview.loadUrl((new StringBuilder()).append("javascript:MMJS.sdk.voiceError('").append(s).append("')").toString());
        }
    }

    void voiceStateChangeError()
    {
        MMWebView mmwebview = getMMWebView();
        if (mmwebview != null)
        {
            mmwebview.loadUrl("javascript:MMJS.sdk.voiceStateChange('error')");
        }
    }

    void voiceStateChangeProcessing()
    {
        MMWebView mmwebview = getMMWebView();
        if (mmwebview != null)
        {
            mmwebview.loadUrl("javascript:MMJS.sdk.voiceStateChange('processing')");
        }
    }

    void voiceStateChangeReady()
    {
        MMWebView mmwebview = getMMWebView();
        if (mmwebview != null)
        {
            mmwebview.loadUrl("javascript:MMJS.sdk.voiceStateChange('ready')");
        }
    }

    void voiceStateChangeRecording()
    {
        MMWebView mmwebview = getMMWebView();
        if (mmwebview != null)
        {
            mmwebview.loadUrl("javascript:MMJS.sdk.voiceStateChange('recording')");
        }
    }

    void voiceStateChangeVocalizing()
    {
        MMWebView mmwebview = getMMWebView();
        if (mmwebview != null)
        {
            mmwebview.loadUrl("javascript:MMJS.sdk.voiceStateChange('vocalizing')");
        }
    }




/*
    static Recognizer access$002(NVASpeechKit nvaspeechkit, Recognizer recognizer)
    {
        nvaspeechkit.skCurrentRecognizer = recognizer;
        return recognizer;
    }

*/










/*
    static String access$1702(NVASpeechKit nvaspeechkit, String s)
    {
        nvaspeechkit.nuance_transaction_session_id = s;
        return s;
    }

*/










/*
    static DataUploadCommand access$802(NVASpeechKit nvaspeechkit, DataUploadCommand datauploadcommand)
    {
        nvaspeechkit.pendingDataUploadCommand = datauploadcommand;
        return datauploadcommand;
    }

*/

}
