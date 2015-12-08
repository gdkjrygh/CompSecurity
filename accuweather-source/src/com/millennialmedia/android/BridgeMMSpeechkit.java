// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.millennialmedia.android:
//            MMJSObject, MMWebView, NVASpeechKit, HandShake, 
//            MMJSResponse, AdCache, MMLog

public class BridgeMMSpeechkit extends MMJSObject
    implements android.media.MediaPlayer.OnCompletionListener, BridgeMMMedia.Audio.PeriodicListener
{
    private static class SingletonHolder
    {

        public static final SpeechKitHolder INSTANCE = new SpeechKitHolder();


        private SingletonHolder()
        {
        }
    }

    private static class SpeechKitHolder
    {

        private NVASpeechKit _speechKit;

        public NVASpeechKit getSpeechKit()
        {
            return _speechKit;
        }

        public boolean release()
        {
            if (_speechKit == null)
            {
                return false;
            } else
            {
                Utils.ThreadUtils.execute(new Runnable() {

                    final SpeechKitHolder this$0;

                    public void run()
                    {
                        synchronized (SpeechKitHolder.this)
                        {
                            if (_speechKit != null)
                            {
                                _speechKit.cancelRecording();
                                _speechKit.release();
                                _speechKit = null;
                            }
                        }
                        return;
                        exception;
                        speechkitholder;
                        JVM INSTR monitorexit ;
                        throw exception;
                    }

            
            {
                this$0 = SpeechKitHolder.this;
                super();
            }
                });
                return true;
            }
        }

        public void setSpeechKit(NVASpeechKit nvaspeechkit)
        {
            _speechKit = nvaspeechkit;
        }



/*
        static NVASpeechKit access$002(SpeechKitHolder speechkitholder, NVASpeechKit nvaspeechkit)
        {
            speechkitholder._speechKit = nvaspeechkit;
            return nvaspeechkit;
        }

*/

        private SpeechKitHolder()
        {
        }

    }


    private static final String TAG = "BridgeMMSpeechkit";
    private String ADD_CUSTOM_VOICE_WORDS;
    private String CACHE_AUDIO;
    private String DELETE_CUSTOM_VOICE_WORDS;
    private String END_RECORDING;
    private String GET_SESSION_ID;
    private String PLAY_AUDIO;
    private String RELEASE_VOICE;
    private String SAMPLE_BACKGROUND_AUDIO_LEVEL;
    private String START_RECORDING;
    private String STOP_AUDIO;
    private String TEXT_TO_SPEECH;

    BridgeMMSpeechkit()
    {
        START_RECORDING = "startRecording";
        END_RECORDING = "endRecording";
        CACHE_AUDIO = "cacheAudio";
        GET_SESSION_ID = "getSessionId";
        PLAY_AUDIO = "playAudio";
        TEXT_TO_SPEECH = "textToSpeech";
        STOP_AUDIO = "stopAudio";
        SAMPLE_BACKGROUND_AUDIO_LEVEL = "sampleBackgroundAudioLevel";
        RELEASE_VOICE = "releaseVoice";
        ADD_CUSTOM_VOICE_WORDS = "addCustomVoiceWords";
        DELETE_CUSTOM_VOICE_WORDS = "deleteCustomVoiceWords";
    }

    private NVASpeechKit getCreateSpeechKit()
    {
        Object obj = null;
        Object obj1 = (MMWebView)mmWebViewRef.get();
        NVASpeechKit nvaspeechkit = obj;
        if (obj1 != null)
        {
            nvaspeechkit = obj;
            if (((MMWebView) (obj1)).allowSpeechCreationCommands())
            {
                if (getSpeechKitInternal() != null)
                {
                    return getSpeechKitInternal();
                }
                Context context = ((MMWebView) (obj1)).getContext();
                nvaspeechkit = obj;
                if (context != null)
                {
                    NVASpeechKit nvaspeechkit1 = new NVASpeechKit(((MMWebView) (obj1)));
                    setSpeechKit(nvaspeechkit1);
                    obj1 = HandShake.sharedHandShake(context).nuanceCredentials;
                    nvaspeechkit = nvaspeechkit1;
                    if (obj1 != null)
                    {
                        nvaspeechkit1.initialize(((HandShake.NuanceCredentials) (obj1)), context.getApplicationContext());
                        nvaspeechkit = nvaspeechkit1;
                    }
                }
            }
        }
        return nvaspeechkit;
    }

    static SpeechKitHolder getInstance()
    {
        return SingletonHolder.INSTANCE;
    }

    private NVASpeechKit getSpeechKit()
    {
        MMWebView mmwebview = (MMWebView)mmWebViewRef.get();
        if (mmwebview != null && mmwebview.allowRecordingCommands())
        {
            return getSpeechKitInternal();
        } else
        {
            return null;
        }
    }

    static NVASpeechKit getSpeechKitInternal()
    {
        return getInstance().getSpeechKit();
    }

    private NVASpeechKit getSpeechKitRelease()
    {
        return getSpeechKitInternal();
    }

    private MMJSResponse playAudioInternal(Map map)
    {
        Object obj = (Context)contextRef.get();
        String s = (String)map.get("path");
        if (obj != null && s != null)
        {
            BridgeMMMedia.Audio audio = BridgeMMMedia.Audio.sharedAudio(((Context) (obj)));
            if (audio != null)
            {
                if (audio.isPlaying())
                {
                    return MMJSResponse.responseWithError("Audio already playing.");
                }
                if (s.startsWith("http"))
                {
                    return audio.playAudio(Uri.parse(s), Boolean.parseBoolean((String)map.get("repeat")));
                }
                obj = AdCache.getDownloadFile(((Context) (obj)), s);
                if (((File) (obj)).exists())
                {
                    return audio.playAudio(Uri.fromFile(((File) (obj))), Boolean.parseBoolean((String)map.get("repeat")));
                }
            }
        }
        return null;
    }

    static boolean releaseSpeechKit()
    {
        return getInstance().release();
    }

    static void setSpeechKit(NVASpeechKit nvaspeechkit)
    {
        getInstance().release();
        getInstance().setSpeechKit(nvaspeechkit);
    }

    public MMJSResponse addCustomVoiceWords(Map map)
    {
        NVASpeechKit nvaspeechkit = getCreateSpeechKit();
        if (nvaspeechkit == null)
        {
            return MMJSResponse.responseWithError("Unable to create speech kit");
        }
        map = (String)map.get("words");
        if (!TextUtils.isEmpty(map))
        {
            String as[] = map.split(",");
            nvaspeechkit.updateCustomWords(NVASpeechKit.CustomWordsOp.Add, as);
            injectJavascript("javascript:MMJS.sdk.customVoiceWordsAdded()");
            return MMJSResponse.responseWithSuccess((new StringBuilder()).append("Added ").append(map).toString());
        } else
        {
            return null;
        }
    }

    public MMJSResponse cacheAudio(Map map)
    {
        map = (String)map.get("url");
        if (!URLUtil.isValidUrl(map))
        {
            return MMJSResponse.responseWithError("Invalid url");
        }
        if (contextRef != null)
        {
            Context context = (Context)contextRef.get();
            if (context != null && AdCache.downloadComponentExternalStorage(map, map.substring(map.lastIndexOf("/") + 1), context))
            {
                injectJavascript("javascript:MMJS.sdk.audioCached()");
                return MMJSResponse.responseWithSuccess((new StringBuilder()).append("Successfully cached audio at ").append(map).toString());
            }
        }
        return MMJSResponse.responseWithError((new StringBuilder()).append("Failed to cache audio at").append(map).toString());
    }

    public MMJSResponse deleteCustomVoiceWords(Map map)
    {
        NVASpeechKit nvaspeechkit = getCreateSpeechKit();
        if (nvaspeechkit == null)
        {
            return MMJSResponse.responseWithError("Unable to create speech kit");
        }
        map = (String)map.get("words");
        if (!TextUtils.isEmpty(map))
        {
            String as[] = map.split(",");
            nvaspeechkit.updateCustomWords(NVASpeechKit.CustomWordsOp.Remove, as);
            injectJavascript("javascript:MMJS.sdk.customVoiceWordsDeleted()");
            return MMJSResponse.responseWithSuccess((new StringBuilder()).append("Deleted ").append(map).toString());
        } else
        {
            return null;
        }
    }

    public MMJSResponse endRecording(Map map)
    {
        map = getSpeechKit();
        if (map == null)
        {
            return MMJSResponse.responseWithError("Unable to get speech kit");
        }
        map;
        JVM INSTR monitorenter ;
        MMJSResponse mmjsresponse;
        if (!map.endRecording())
        {
            break MISSING_BLOCK_LABEL_38;
        }
        mmjsresponse = MMJSResponse.responseWithSuccess();
        return mmjsresponse;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
        return MMJSResponse.responseWithError("Failed in speechKit");
    }

    MMJSResponse executeCommand(String s, Map map)
    {
        MMJSResponse mmjsresponse = null;
        if (START_RECORDING.equals(s))
        {
            mmjsresponse = startRecording(map);
        } else
        {
            if (END_RECORDING.equals(s))
            {
                return endRecording(map);
            }
            if (CACHE_AUDIO.equals(s))
            {
                return cacheAudio(map);
            }
            if (GET_SESSION_ID.equals(s))
            {
                return getSessionId(map);
            }
            if (PLAY_AUDIO.equals(s))
            {
                return playAudio(map);
            }
            if (TEXT_TO_SPEECH.equals(s))
            {
                return textToSpeech(map);
            }
            if (STOP_AUDIO.equals(s))
            {
                return stopAudio(map);
            }
            if (SAMPLE_BACKGROUND_AUDIO_LEVEL.equals(s))
            {
                return sampleBackgroundAudioLevel(map);
            }
            if (RELEASE_VOICE.equals(s))
            {
                return releaseVoice(map);
            }
            if (ADD_CUSTOM_VOICE_WORDS.equals(s))
            {
                return addCustomVoiceWords(map);
            }
            if (DELETE_CUSTOM_VOICE_WORDS.equals(s))
            {
                return deleteCustomVoiceWords(map);
            }
        }
        return mmjsresponse;
    }

    public MMJSResponse getSessionId(Map map)
    {
        map = getSpeechKit();
        if (map == null)
        {
            return MMJSResponse.responseWithError("No SpeechKit session open.");
        }
        map = map.getSessionId();
        if (!TextUtils.isEmpty(map))
        {
            return MMJSResponse.responseWithSuccess(map);
        } else
        {
            return MMJSResponse.responseWithError("No SpeechKit session open.");
        }
    }

    void injectJavascript(String s)
    {
        MMWebView mmwebview = (MMWebView)mmWebViewRef.get();
        if (mmwebview != null)
        {
            mmwebview.loadUrl(s);
        }
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        injectJavascript("javascript:MMJS.sdk.audioCompleted()");
        mediaplayer = (Context)contextRef.get();
        if (mediaplayer != null)
        {
            mediaplayer = BridgeMMMedia.Audio.sharedAudio(mediaplayer);
            if (mediaplayer != null)
            {
                mediaplayer.removeCompletionListener(this);
                mediaplayer.removePeriodicListener(this);
            }
        }
    }

    public void onUpdate(int i)
    {
        injectJavascript((new StringBuilder()).append("javascript:MMJS.sdk.audioPositionChange(").append(i).append(")").toString());
    }

    public MMJSResponse playAudio(Map map)
    {
        if (getCreateSpeechKit() != null) goto _L2; else goto _L1
_L1:
        map = MMJSResponse.responseWithError("Unable to create speech kit");
_L4:
        return map;
_L2:
        if (!URLUtil.isValidUrl((String)map.get("url")))
        {
            return MMJSResponse.responseWithError("Invalid url");
        }
        Object obj = (String)map.get("url");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = (Context)contextRef.get();
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = BridgeMMMedia.Audio.sharedAudio(((Context) (obj1)));
        if (obj1 != null)
        {
            ((BridgeMMMedia.Audio) (obj1)).addCompletionListener(this);
            ((BridgeMMMedia.Audio) (obj1)).addPeriodicListener(this);
        }
        map.put("path", obj);
        obj = playAudioInternal(map);
        map = ((Map) (obj));
        if (obj != null)
        {
            map = ((Map) (obj));
            if (((MMJSResponse) (obj)).result == 1)
            {
                injectJavascript("javascript:MMJS.sdk.audioStarted()");
                return ((MMJSResponse) (obj));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    public MMJSResponse releaseVoice(Map map)
    {
        if (releaseSpeechKit())
        {
            return MMJSResponse.responseWithError("Unable to get speech kit");
        } else
        {
            return MMJSResponse.responseWithSuccess("released speechkit");
        }
    }

    public MMJSResponse sampleBackgroundAudioLevel(Map map)
    {
        map = getCreateSpeechKit();
        if (map == null)
        {
            return MMJSResponse.responseWithError("Unable to create speech kit");
        } else
        {
            map.startSampleRecording();
            return null;
        }
    }

    public MMJSResponse startRecording(Map map)
    {
        NVASpeechKit nvaspeechkit = getCreateSpeechKit();
        if (nvaspeechkit == null)
        {
            return MMJSResponse.responseWithError("Unable to create speech kit");
        }
        String s = (String)map.get("language");
        map = s;
        if (TextUtils.isEmpty(s))
        {
            map = "en_GB";
        }
        if (nvaspeechkit.startRecording(map))
        {
            return MMJSResponse.responseWithSuccess();
        } else
        {
            return MMJSResponse.responseWithError("Failed in speechKit");
        }
    }

    public MMJSResponse stopAudio(Map map)
    {
        map = getSpeechKit();
        if (map == null)
        {
            return MMJSResponse.responseWithError("Unable to get speech kit");
        }
        map.stopActions();
        if (contextRef != null)
        {
            map = BridgeMMMedia.Audio.sharedAudio((Context)contextRef.get());
            if (map != null)
            {
                return map.stop();
            }
        }
        return MMJSResponse.responseWithSuccess();
    }

    public MMJSResponse textToSpeech(Map map)
    {
        MMLog.d("BridgeMMSpeechkit", "@@-Calling textToSpeech");
        NVASpeechKit nvaspeechkit = getCreateSpeechKit();
        if (nvaspeechkit == null)
        {
            return MMJSResponse.responseWithError("Unable to create speech kit");
        }
        String s = (String)map.get("language");
        String s1 = (String)map.get("text");
        map = s;
        if (TextUtils.isEmpty(s))
        {
            map = "en_GB";
        }
        nvaspeechkit.stopActions();
        if (nvaspeechkit.textToSpeech(s1, map))
        {
            return MMJSResponse.responseWithSuccess();
        } else
        {
            return MMJSResponse.responseWithError("Failed in speechKit");
        }
    }
}
