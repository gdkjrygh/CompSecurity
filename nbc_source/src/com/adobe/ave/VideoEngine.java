// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.SurfaceHolder;
import com.adobe.ave.drm.DRMError;
import com.adobe.ave.drm.DRMManager;
import java.util.Set;

// Referenced classes of package com.adobe.ave:
//            VideoEngineException, MediaErrorCode, ListenerType, VideoEngineView, 
//            PlayState, DataType, ContainerType, PayloadType, 
//            VideoEngineListener, Timeline, ABRParameters, NetworkingParameters, 
//            SwitchInfo, StreamMetadata, UpdateType, Dictionary

public class VideoEngine
{
    private class EventHandler extends Handler
    {

        private VideoEngine mVideoEngine;
        final VideoEngine this$0;

        public void handleMessage(Message message)
        {
_L2:
            return;
            if (mVideoEngine.mNativeContext == 0L || mVideoEngine.mListener == null) goto _L2; else goto _L1
_L1:
            message.what;
            JVM INSTR lookupswitch 16: default 164
        //                       1: 165
        //                       2: 258
        //                       4: 344
        //                       8: 451
        //                       16: 491
        //                       32: 550
        //                       64: 636
        //                       128: 748
        //                       256: 855
        //                       512: 941
        //                       1024: 1034
        //                       2048: 1086
        //                       4096: 1126
        //                       8192: 1212
        //                       16384: 1357
        //                       32768: 1450;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L19:
            continue; /* Loop/switch isn't completed */
_L3:
            return;
_L4:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.ERROR)) goto _L2; else goto _L20
_L20:
            Object obj1;
            Object aobj[];
            int i;
            int j;
            obj1 = MediaErrorCode.GENERIC_ERROR;
            aobj = MediaErrorCode.values();
            j = aobj.length;
            i = 0;
_L24:
            Object obj = obj1;
            if (i >= j) goto _L22; else goto _L21
_L21:
            obj = aobj[i];
            if (((MediaErrorCode) (obj)).getValue() != message.arg1) goto _L23; else goto _L22
_L22:
            mVideoEngine.mListener.onError(mVideoEngine, ((MediaErrorCode) (obj)), (String)message.obj);
            return;
_L23:
            i++;
              goto _L24
_L5:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.PLAY_STATE)) goto _L2; else goto _L25
_L25:
            obj1 = PlayState.UNINITIALIZED;
            aobj = PlayState.values();
            j = aobj.length;
            i = 0;
_L29:
            obj = obj1;
            if (i >= j) goto _L27; else goto _L26
_L26:
            obj = aobj[i];
            if (((PlayState) (obj)).getValue() != message.arg1) goto _L28; else goto _L27
_L27:
            mVideoEngine.mListener.onPlayState(mVideoEngine, ((PlayState) (obj)));
            return;
_L28:
            i++;
              goto _L29
_L6:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.STREAM_SWITCH)) goto _L2; else goto _L30
_L30:
            obj1 = (customMessage)message.obj;
            obj = SwitchInfo.ABR;
            aobj = SwitchInfo.values();
            j = aobj.length;
            i = 0;
_L34:
            message = ((Message) (obj));
            if (i >= j) goto _L32; else goto _L31
_L31:
            message = aobj[i];
            if (message.getValue() != ((customMessage) (obj1)).m_n1) goto _L33; else goto _L32
_L32:
            mVideoEngine.mListener.onStreamSwitch(mVideoEngine, ((customMessage) (obj1)).m_l1, message, ((customMessage) (obj1)).m_n2, (int)((customMessage) (obj1)).m_l2);
            return;
_L33:
            i++;
              goto _L34
_L7:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.STREAM_METADATA)) goto _L2; else goto _L35
_L35:
            mVideoEngine.mListener.onStreamMetadata(mVideoEngine, (StreamMetadata)message.obj);
            return;
_L8:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.DRM_METADATA)) goto _L2; else goto _L36
_L36:
            message = (customMessage)message.obj;
            mVideoEngine.mListener.onDRMMetadata(mVideoEngine, (byte[])(byte[])((customMessage) (message)).m_obj, ((customMessage) (message)).m_n1, ((customMessage) (message)).m_l1);
            return;
_L9:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.TIMELINE)) goto _L2; else goto _L37
_L37:
            obj1 = UpdateType.INITIAL;
            aobj = UpdateType.values();
            j = aobj.length;
            i = 0;
_L41:
            obj = obj1;
            if (i >= j) goto _L39; else goto _L38
_L38:
            obj = aobj[i];
            if (((UpdateType) (obj)).getValue() != message.arg1) goto _L40; else goto _L39
_L39:
            mVideoEngine.mListener.onTimeline(mVideoEngine, ((UpdateType) (obj)));
            return;
_L40:
            i++;
              goto _L41
_L10:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.DATA)) goto _L2; else goto _L42
_L42:
            obj1 = (customMessage)message.obj;
            obj = DataType.DT_3GPP_CAPTION_METADATA;
            aobj = DataType.values();
            j = aobj.length;
            i = 0;
_L46:
            message = ((Message) (obj));
            if (i >= j) goto _L44; else goto _L43
_L43:
            message = aobj[i];
            if (message.getValue() != ((customMessage) (obj1)).m_n1) goto _L45; else goto _L44
_L44:
            mVideoEngine.mListener.onData(mVideoEngine, ((customMessage) (obj1)).m_l1, message, (byte[])(byte[])((customMessage) (obj1)).m_obj, ((customMessage) (obj1)).m_n2);
            return;
_L45:
            i++;
              goto _L46
_L11:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.MANIFEST_LOAD)) goto _L2; else goto _L47
_L47:
            obj1 = (customMessage)message.obj;
            obj = MediaErrorCode.GENERIC_ERROR;
            aobj = MediaErrorCode.values();
            j = aobj.length;
            i = 0;
_L51:
            message = ((Message) (obj));
            if (i >= j) goto _L49; else goto _L48
_L48:
            message = aobj[i];
            if (message.getValue() != ((customMessage) (obj1)).m_n1) goto _L50; else goto _L49
_L49:
            mVideoEngine.mListener.onManifestLoad(mVideoEngine, message, ((customMessage) (obj1)).m_n2, (int)((customMessage) (obj1)).m_l1, ((customMessage) (obj1)).m_l2);
            return;
_L50:
            i++;
              goto _L51
_L12:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.SEEK_COMPLETE)) goto _L2; else goto _L52
_L52:
            obj1 = MediaErrorCode.GENERIC_ERROR;
            aobj = MediaErrorCode.values();
            j = aobj.length;
            i = 0;
_L56:
            obj = obj1;
            if (i >= j) goto _L54; else goto _L53
_L53:
            obj = aobj[i];
            if (((MediaErrorCode) (obj)).getValue() != message.arg1) goto _L55; else goto _L54
_L54:
            mVideoEngine.mListener.onSeekComplete(mVideoEngine, ((MediaErrorCode) (obj)));
            return;
_L55:
            i++;
              goto _L56
_L13:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.WARNING)) goto _L2; else goto _L57
_L57:
            obj1 = MediaErrorCode.GENERIC_ERROR;
            aobj = MediaErrorCode.values();
            j = aobj.length;
            i = 0;
_L61:
            obj = obj1;
            if (i >= j) goto _L59; else goto _L58
_L58:
            obj = aobj[i];
            if (((MediaErrorCode) (obj)).getValue() != message.arg1) goto _L60; else goto _L59
_L59:
            mVideoEngine.mListener.onWarning(mVideoEngine, ((MediaErrorCode) (obj)), (String)message.obj);
            return;
_L60:
            i++;
              goto _L61
_L14:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.DICTIONARY_DATA)) goto _L2; else goto _L62
_L62:
            message = (customMessage)message.obj;
            mVideoEngine.mListener.onDictionaryData(mVideoEngine, (Dictionary)((customMessage) (message)).m_obj, ((customMessage) (message)).m_l1);
            return;
_L15:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.LOAD_INFO)) goto _L2; else goto _L63
_L63:
            mVideoEngine.mListener.onLoadInfo(mVideoEngine, (String)message.obj);
            return;
_L16:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.TRICK_PLAY_ENDED)) goto _L2; else goto _L64
_L64:
            obj1 = MediaErrorCode.GENERIC_ERROR;
            aobj = MediaErrorCode.values();
            j = aobj.length;
            i = 0;
_L68:
            obj = obj1;
            if (i >= j) goto _L66; else goto _L65
_L65:
            obj = aobj[i];
            if (((MediaErrorCode) (obj)).getValue() != message.arg1) goto _L67; else goto _L66
_L66:
            mVideoEngine.mListener.onTrickPlayEnded(mVideoEngine, ((MediaErrorCode) (obj)));
            return;
_L67:
            i++;
              goto _L68
_L17:
            Log.w("VideoEngine(j)", "Handler : kCTDRMError!!!");
            message = (DRMError)message.obj;
            if (mVideoEngine.mListenerTypeSet.contains(ListenerType.DRM_ERROR))
            {
                mVideoEngine.mListener.onDRMError(mVideoEngine, message);
            }
            if ((message.getMajorError() < (long)MediaErrorCode.AAXS_UnknownConnectionType.getValue() || message.getMajorError() > (long)MediaErrorCode.AAXS_NoDigitalProtectionAvail.getValue()) && (message.getMajorError() < (long)MediaErrorCode.AAXS_NoOPConstraintInPixelConstraints.getValue() || message.getMajorError() > (long)MediaErrorCode.AAXS_MinorErr_DisplayResolutionLargerThanConstraint.getValue())) goto _L2; else goto _L69
_L69:
            try
            {
                mVideoEngine.reset();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                Log.w("VideoEngine(j)", (new StringBuilder()).append("Error while calling VideoEngine.reset() for output protection error: ").append(message).toString());
            }
            return;
_L18:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.BACKGROUND_MANIFEST_ERROR)) goto _L2; else goto _L70
_L70:
            obj1 = MediaErrorCode.GENERIC_ERROR;
            aobj = MediaErrorCode.values();
            j = aobj.length;
            i = 0;
_L75:
            obj = obj1;
            if (i >= j) goto _L72; else goto _L71
_L71:
            obj = aobj[i];
            if (((MediaErrorCode) (obj)).getValue() != message.arg1) goto _L73; else goto _L72
_L72:
            mVideoEngine.mListener.onBackgroundManifestError(mVideoEngine, ((MediaErrorCode) (obj)), (String)message.obj);
            return;
_L73:
            i++;
            if (true) goto _L75; else goto _L74
_L74:
            if (!mVideoEngine.mListenerTypeSet.contains(ListenerType.BACKGROUND_MANIFEST_WARNING)) goto _L2; else goto _L76
_L76:
            obj1 = MediaErrorCode.GENERIC_ERROR;
            aobj = MediaErrorCode.values();
            j = aobj.length;
            i = 0;
_L81:
            obj = obj1;
            if (i >= j) goto _L78; else goto _L77
_L77:
            obj = aobj[i];
            if (((MediaErrorCode) (obj)).getValue() != message.arg1) goto _L79; else goto _L78
_L78:
            mVideoEngine.mListener.onBackgroundManifestWarning(mVideoEngine, ((MediaErrorCode) (obj)), (String)message.obj);
            return;
_L79:
            i++;
            if (true) goto _L81; else goto _L80
_L80:
        }

        public EventHandler(VideoEngine videoengine1, Looper looper)
        {
            this$0 = VideoEngine.this;
            super(looper);
            mVideoEngine = videoengine1;
        }
    }

    private static class customMessage
    {

        long m_l1;
        long m_l2;
        int m_n1;
        int m_n2;
        Object m_obj;

        private customMessage(int i, int j, long l, long l1, Object obj)
        {
            m_n1 = i;
            m_n2 = j;
            m_l1 = l;
            m_l2 = l1;
            m_obj = obj;
        }

        customMessage(int i, int j, long l, long l1, Object obj, 
                _cls1 _pcls1)
        {
            this(i, j, l, l1, obj);
        }
    }


    private static final String TAG = "VideoEngine(j)";
    private static final int kCTBackgroundManifestError = 16384;
    private static final int kCTBackgroundManifestWarning = 32768;
    private static final int kCTDRMError = 8192;
    private static final int kCTDRMMetadata = 16;
    private static final int kCTData = 64;
    private static final int kCTDictionaryData = 1024;
    private static final int kCTError = 1;
    private static final int kCTLoadInfo = 2048;
    private static final int kCTManifestLoad = 128;
    private static final int kCTPlayState = 2;
    private static final int kCTSeekComplete = 256;
    private static final int kCTStreamMetadata = 8;
    private static final int kCTStreamSwitch = 4;
    private static final int kCTTimeline = 32;
    private static final int kCTTrickPlayEnded = 4096;
    private static final int kCTWarning = 512;
    private boolean mEnableCaption;
    private EventHandler mEventHandler;
    private VideoEngineListener mListener;
    private Set mListenerTypeSet;
    private long mNativeContext;
    private VideoEngineView mVideoView;

    public VideoEngine()
        throws VideoEngineException
    {
        mVideoView = null;
        mEnableCaption = false;
        failIfNotUIThread();
        Looper looper = Looper.myLooper();
        if (looper != null)
        {
            mEventHandler = new EventHandler(this, looper);
        } else
        {
            Looper looper1 = Looper.getMainLooper();
            if (looper1 != null)
            {
                mEventHandler = new EventHandler(this, looper1);
            } else
            {
                mEventHandler = null;
            }
        }
        nativeCreateVideoEngine();
    }

    private void failIfNotUIThread()
        throws VideoEngineException
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new VideoEngineException(MediaErrorCode.CALLED_FROM_WRONG_THREAD, null);
        } else
        {
            return;
        }
    }

    public static String getVersionString()
    {
        return nativeGetVersionString();
    }

    private native void nativeAddCustomHeader(String s, String as[], int i)
        throws VideoEngineException;

    private native void nativeAddListener(int i, VideoEngineListener videoenginelistener)
        throws VideoEngineException;

    private native void nativeCreateVideoEngine();

    private native void nativeEnableCaptions(boolean flag)
        throws VideoEngineException;

    private native void nativeFastForward(float f)
        throws VideoEngineException;

    private native void nativeFinalize();

    private native Object nativeGetARCorrectedOutputRectangle()
        throws VideoEngineException;

    private native Timeline nativeGetBackgroundTimeline()
        throws VideoEngineException;

    private native long nativeGetBufferLength()
        throws VideoEngineException;

    private native long nativeGetClientLivePoint()
        throws VideoEngineException;

    private native long nativeGetLocalTime(int i)
        throws VideoEngineException;

    private native int nativeGetPlayState()
        throws VideoEngineException;

    private native int nativeGetQosBufferUnderrunCount()
        throws VideoEngineException;

    private native int nativeGetQosDroppedFrameCount()
        throws VideoEngineException;

    private native long nativeGetQosFileDuration()
        throws VideoEngineException;

    private native int nativeGetQosFileSize()
        throws VideoEngineException;

    private native float nativeGetQosFrameRate()
        throws VideoEngineException;

    private native long nativeGetQosLoadTime()
        throws VideoEngineException;

    private native long nativeGetQosTimeToFirstByte()
        throws VideoEngineException;

    private native long nativeGetTime()
        throws VideoEngineException;

    private native Timeline nativeGetTimeline()
        throws VideoEngineException;

    private static native String nativeGetVersionString();

    private static final native void nativeInitVideoEngine();

    private native void nativeInjectData(int i, long l, byte abyte0[], int j)
        throws VideoEngineException;

    private native void nativeLoad(String s, int i, int j)
        throws VideoEngineException;

    private native void nativeLoadWithBackgroundManifest(String s, int i, int j, String s1)
        throws VideoEngineException;

    private native void nativePause()
        throws VideoEngineException;

    private native void nativePlay()
        throws VideoEngineException;

    private native void nativePrepareBuffer()
        throws VideoEngineException;

    private native void nativeRelease();

    private native void nativeReleaseGPUResources()
        throws VideoEngineException;

    private native void nativeRemoveListener(VideoEngineListener videoenginelistener)
        throws VideoEngineException;

    private native void nativeReset()
        throws VideoEngineException;

    private native void nativeRewind(float f)
        throws VideoEngineException;

    private native void nativeSeek(long l, boolean flag)
        throws VideoEngineException;

    private native void nativeSeekToKeyFrame(long l, boolean flag)
        throws VideoEngineException;

    private native void nativeSeekToLivePoint()
        throws VideoEngineException;

    private native void nativeSeekToLocalTime(int i, long l)
        throws VideoEngineException;

    private native int nativeSelectTrack(int i, int j, int k)
        throws VideoEngineException;

    private native void nativeSetABRParameters(ABRParameters abrparameters);

    private native void nativeSetBandwidth(int i);

    private native void nativeSetBufferTime(long l)
        throws VideoEngineException;

    private native void nativeSetCaptionStyle(String as[], String as1[], int i)
        throws VideoEngineException;

    private native void nativeSetCuePointTags(String as[], int i)
        throws VideoEngineException;

    private native void nativeSetCustomConfiguration(String s)
        throws VideoEngineException;

    private native void nativeSetDRMManager(DRMManager drmmanager)
        throws VideoEngineException;

    private native void nativeSetInitialBufferTime(long l)
        throws VideoEngineException;

    private native void nativeSetMasterUpdateInterval(int i)
        throws VideoEngineException;

    private native void nativeSetNetworkingParameters(NetworkingParameters networkingparameters);

    private native void nativeSetPlaySpeed(float f, boolean flag)
        throws VideoEngineException;

    private native void nativeSetSourceViewport(int i, int j, int k, int l)
        throws VideoEngineException;

    private native void nativeSetSubscribedTags(String as[], int i)
        throws VideoEngineException;

    private native void nativeSetSubscribedTagsForBackgroundManifest(String as[], int i)
        throws VideoEngineException;

    private native void nativeSetSurface(Object obj)
        throws VideoEngineException;

    private native void nativeSetVolume(int i)
        throws VideoEngineException;

    private native void nativeUseRedirectedUrl(boolean flag)
        throws VideoEngineException;

    private native void nativesetLocalStoragePath(String s)
        throws VideoEngineException;

    private static void postEventFromNative(Object obj, int i, int j, int k, Object obj1)
    {
        boolean flag1 = true;
        obj = (VideoEngine)obj;
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((VideoEngine) (obj)).mEventHandler == null)
        {
            flag1 = false;
        }
        if (flag & flag1)
        {
            obj1 = ((VideoEngine) (obj)).mEventHandler.obtainMessage(i, j, k, obj1);
            ((VideoEngine) (obj)).mEventHandler.sendMessage(((Message) (obj1)));
        }
    }

    private static void postEventFromNativeEx(Object obj, int i, int j, int k, long l, long l1, 
            Object obj1)
    {
        obj = (VideoEngine)obj;
        boolean flag;
        boolean flag1;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((VideoEngine) (obj)).mEventHandler != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag & flag1)
        {
            obj1 = new customMessage(j, k, l, l1, obj1);
            obj1 = ((VideoEngine) (obj)).mEventHandler.obtainMessage(i, 0, 0, obj1);
            ((VideoEngine) (obj)).mEventHandler.sendMessage(((Message) (obj1)));
        }
    }

    public void addCustomHeader(String s, String as[], int i)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeAddCustomHeader(s, as, i);
    }

    public void addListener(Set set, VideoEngineListener videoenginelistener)
        throws VideoEngineException
    {
        int j = 0;
        mListenerTypeSet = set;
        if (set.contains(ListenerType.ERROR))
        {
            j = 0 | ListenerType.ERROR.getValue();
        }
        int i = j;
        if (set.contains(ListenerType.PLAY_STATE))
        {
            i = j | ListenerType.PLAY_STATE.getValue();
        }
        j = i;
        if (set.contains(ListenerType.STREAM_SWITCH))
        {
            j = i | ListenerType.STREAM_SWITCH.getValue();
        }
        i = j;
        if (set.contains(ListenerType.STREAM_METADATA))
        {
            i = j | ListenerType.STREAM_METADATA.getValue();
        }
        j = i;
        if (set.contains(ListenerType.DRM_METADATA))
        {
            j = i | ListenerType.DRM_METADATA.getValue();
        }
        i = j;
        if (set.contains(ListenerType.TIMELINE))
        {
            i = j | ListenerType.TIMELINE.getValue();
        }
        j = i;
        if (set.contains(ListenerType.DATA))
        {
            j = i | ListenerType.DATA.getValue();
        }
        i = j;
        if (set.contains(ListenerType.MANIFEST_LOAD))
        {
            i = j | ListenerType.MANIFEST_LOAD.getValue();
        }
        j = i;
        if (set.contains(ListenerType.SEEK_COMPLETE))
        {
            j = i | ListenerType.SEEK_COMPLETE.getValue();
        }
        i = j;
        if (set.contains(ListenerType.WARNING))
        {
            i = j | ListenerType.WARNING.getValue();
        }
        j = i;
        if (set.contains(ListenerType.DICTIONARY_DATA))
        {
            j = i | ListenerType.DICTIONARY_DATA.getValue();
        }
        i = j;
        if (set.contains(ListenerType.LOAD_INFO))
        {
            i = j | ListenerType.LOAD_INFO.getValue();
        }
        j = i;
        if (set.contains(ListenerType.TRICK_PLAY_ENDED))
        {
            j = i | ListenerType.TRICK_PLAY_ENDED.getValue();
        }
        i = j;
        if (set.contains(ListenerType.DRM_ERROR))
        {
            i = j | ListenerType.DRM_ERROR.getValue();
        }
        j = i;
        if (set.contains(ListenerType.BACKGROUND_MANIFEST_ERROR))
        {
            j = i | ListenerType.BACKGROUND_MANIFEST_ERROR.getValue();
        }
        i = j;
        if (set.contains(ListenerType.BACKGROUND_MANIFEST_WARNING))
        {
            i = j | ListenerType.BACKGROUND_MANIFEST_WARNING.getValue();
        }
        if (mListener != null)
        {
            nativeRemoveListener(videoenginelistener);
        }
        mListener = videoenginelistener;
        nativeAddListener(i, videoenginelistener);
    }

    public void enableCaptions(boolean flag)
        throws VideoEngineException
    {
label0:
        {
            failIfNotUIThread();
            nativeEnableCaptions(flag);
            mEnableCaption = flag;
            if (mVideoView != null)
            {
                if (!mEnableCaption)
                {
                    break label0;
                }
                mVideoView.setWillNotDrawCaption(false);
            }
            return;
        }
        mVideoView.setWillNotDrawCaption(true);
    }

    public void fastForward(float f)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeFastForward(f);
    }

    protected void finalize()
    {
        nativeFinalize();
    }

    public Rect getARCorrectedOutputRectangle()
        throws VideoEngineException
    {
        failIfNotUIThread();
        return (Rect)nativeGetARCorrectedOutputRectangle();
    }

    public Timeline getBackgroundTimeline()
        throws VideoEngineException
    {
        failIfNotUIThread();
        return nativeGetBackgroundTimeline();
    }

    public long getBufferLength()
        throws VideoEngineException
    {
        failIfNotUIThread();
        return nativeGetBufferLength();
    }

    public long getClientLivePoint()
        throws VideoEngineException
    {
        failIfNotUIThread();
        return nativeGetClientLivePoint();
    }

    public long getLocalTime(int i)
        throws VideoEngineException
    {
        return nativeGetLocalTime(i);
    }

    public PlayState getPlayState()
        throws VideoEngineException
    {
        failIfNotUIThread();
        PlayState playstate1 = PlayState.UNINITIALIZED;
        int j = nativeGetPlayState();
        PlayState aplaystate[] = PlayState.values();
        int k = aplaystate.length;
        int i = 0;
        do
        {
label0:
            {
                PlayState playstate = playstate1;
                if (i < k)
                {
                    playstate = aplaystate[i];
                    if (playstate.getValue() != j)
                    {
                        break label0;
                    }
                }
                return playstate;
            }
            i++;
        } while (true);
    }

    public int getQosBufferUnderrunCount()
        throws VideoEngineException
    {
        failIfNotUIThread();
        return nativeGetQosBufferUnderrunCount();
    }

    public int getQosDroppedFrameCount()
        throws VideoEngineException
    {
        failIfNotUIThread();
        return nativeGetQosDroppedFrameCount();
    }

    public long getQosFileDuration()
        throws VideoEngineException
    {
        return nativeGetQosFileDuration();
    }

    public int getQosFileSize()
        throws VideoEngineException
    {
        failIfNotUIThread();
        return nativeGetQosFileSize();
    }

    public float getQosFrameRate()
        throws VideoEngineException
    {
        failIfNotUIThread();
        return nativeGetQosFrameRate();
    }

    public long getQosLoadTime()
        throws VideoEngineException
    {
        failIfNotUIThread();
        return nativeGetQosLoadTime();
    }

    public long getQosTimeToFirstByte()
        throws VideoEngineException
    {
        failIfNotUIThread();
        return nativeGetQosTimeToFirstByte();
    }

    public long getTime()
        throws VideoEngineException
    {
        failIfNotUIThread();
        return nativeGetTime();
    }

    public Timeline getTimeline()
        throws VideoEngineException
    {
        failIfNotUIThread();
        return nativeGetTimeline();
    }

    public void injectData(DataType datatype, long l, byte abyte0[], int i)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeInjectData(datatype.getValue(), l, abyte0, i);
    }

    public void load(String s, ContainerType containertype, int i)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeLoad(s, containertype.getValue(), i);
    }

    public void loadWithBackgroundManifest(String s, ContainerType containertype, int i, String s1)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeLoadWithBackgroundManifest(s, containertype.getValue(), i, s1);
    }

    public void pause()
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativePause();
    }

    public void play()
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativePlay();
    }

    public void prepareBuffer()
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativePrepareBuffer();
    }

    public void release()
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeRelease();
    }

    public void releaseGPUResources()
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeReleaseGPUResources();
    }

    public void removeListener(VideoEngineListener videoenginelistener)
        throws VideoEngineException
    {
        nativeRemoveListener(videoenginelistener);
        mListener = null;
        mListenerTypeSet = null;
    }

    public void reset()
        throws VideoEngineException
    {
        failIfNotUIThread();
        enableCaptions(false);
        nativeReset();
    }

    public void rewind(float f)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeRewind(f);
    }

    public void seek(long l, boolean flag)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSeek(l, flag);
    }

    public void seekToKeyFrame(long l, boolean flag)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSeekToKeyFrame(l, flag);
    }

    public void seekToLivePoint()
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSeekToLivePoint();
    }

    public void seekToLocalTime(int i, long l)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSeekToLocalTime(i, l);
    }

    public MediaErrorCode selectTrack(int i, PayloadType payloadtype, int j)
        throws VideoEngineException
    {
        failIfNotUIThread();
        j = nativeSelectTrack(i, payloadtype.getValue(), j);
        MediaErrorCode mediaerrorcode = MediaErrorCode.GENERIC_ERROR;
        MediaErrorCode amediaerrorcode[] = MediaErrorCode.values();
        int k = amediaerrorcode.length;
        i = 0;
        do
        {
label0:
            {
                payloadtype = mediaerrorcode;
                if (i < k)
                {
                    payloadtype = amediaerrorcode[i];
                    if (payloadtype.getValue() != j)
                    {
                        break label0;
                    }
                }
                return payloadtype;
            }
            i++;
        } while (true);
    }

    public void setABRParameters(ABRParameters abrparameters)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetABRParameters(abrparameters);
    }

    public void setBandwidth(int i)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetBandwidth(i);
    }

    public void setBufferTime(long l)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetBufferTime(l);
    }

    public void setCaptionStyle(String as[], String as1[], int i)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetCaptionStyle(as, as1, i);
    }

    public void setCuePointTags(String as[], int i)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetCuePointTags(as, i);
    }

    public void setCustomConfiguration(String s)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetCustomConfiguration(s);
    }

    public void setDRMManager(DRMManager drmmanager)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetDRMManager(drmmanager);
    }

    public void setInitialBufferTime(long l)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetInitialBufferTime(l);
    }

    public void setLocalStoragePath(String s)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativesetLocalStoragePath(s);
    }

    public void setMasterUpdateInterval(int i)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetMasterUpdateInterval(i);
    }

    public void setNetworkingParameters(NetworkingParameters networkingparameters)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetNetworkingParameters(networkingparameters);
    }

    public void setPlaySpeed(float f, boolean flag)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetPlaySpeed(f, flag);
    }

    public void setScreenOnWhilePlaying(boolean flag)
        throws VideoEngineException
    {
        failIfNotUIThread();
        if (mVideoView != null)
        {
            mVideoView.getHolder().setKeepScreenOn(flag);
        }
    }

    public void setSourceViewport(int i, int j, int k, int l)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetSourceViewport(i, j, k, l);
    }

    public void setSubscribedTags(String as[], int i)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetSubscribedTags(as, i);
    }

    public void setSubscribedTagsForBackgroundManifest(String as[], int i)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetSubscribedTagsForBackgroundManifest(as, i);
    }

    public void setView(VideoEngineView videoengineview)
        throws VideoEngineException
    {
label0:
        {
            nativeSetSurface(videoengineview);
            if (videoengineview == null)
            {
                mVideoView.setNativeInstance(0L);
            }
            mVideoView = videoengineview;
            if (mVideoView != null)
            {
                if (!mEnableCaption)
                {
                    break label0;
                }
                mVideoView.setWillNotDrawCaption(false);
            }
            return;
        }
        mVideoView.setWillNotDrawCaption(true);
    }

    public void setVolume(int i)
        throws VideoEngineException
    {
        failIfNotUIThread();
        nativeSetVolume(i);
    }

    public void useRedirectedUrl(boolean flag)
        throws VideoEngineException
    {
        boolean flag1 = true;
        failIfNotUIThread();
        if (flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        nativeUseRedirectedUrl(flag);
    }

    static 
    {
        System.loadLibrary("AVEAndroid");
        nativeInitVideoEngine();
    }



}
