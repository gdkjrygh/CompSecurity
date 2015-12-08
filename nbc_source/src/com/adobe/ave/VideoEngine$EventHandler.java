// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.adobe.ave.drm.DRMError;
import java.util.Set;

// Referenced classes of package com.adobe.ave:
//            VideoEngine, VideoEngineException, ListenerType, MediaErrorCode, 
//            VideoEngineListener, PlayState, SwitchInfo, StreamMetadata, 
//            UpdateType, DataType, Dictionary

private class mVideoEngine extends Handler
{

    private VideoEngine mVideoEngine;
    final VideoEngine this$0;

    public void handleMessage(Message message)
    {
_L2:
        return;
        if (VideoEngine.access$100(mVideoEngine) == 0L || VideoEngine.access$200(mVideoEngine) == null) goto _L2; else goto _L1
_L1:
        message.what;
        JVM INSTR lookupswitch 16: default 164
    //                   1: 165
    //                   2: 258
    //                   4: 344
    //                   8: 451
    //                   16: 491
    //                   32: 550
    //                   64: 636
    //                   128: 748
    //                   256: 855
    //                   512: 941
    //                   1024: 1034
    //                   2048: 1086
    //                   4096: 1126
    //                   8192: 1212
    //                   16384: 1357
    //                   32768: 1450;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L19:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.ERROR)) goto _L2; else goto _L20
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
        VideoEngine.access$200(mVideoEngine).onError(mVideoEngine, ((MediaErrorCode) (obj)), (String)message.obj);
        return;
_L23:
        i++;
          goto _L24
_L5:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.PLAY_STATE)) goto _L2; else goto _L25
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
        VideoEngine.access$200(mVideoEngine).onPlayState(mVideoEngine, ((PlayState) (obj)));
        return;
_L28:
        i++;
          goto _L29
_L6:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.STREAM_SWITCH)) goto _L2; else goto _L30
_L30:
        obj1 = ()message.obj;
        obj = SwitchInfo.ABR;
        aobj = SwitchInfo.values();
        j = aobj.length;
        i = 0;
_L34:
        message = ((Message) (obj));
        if (i >= j) goto _L32; else goto _L31
_L31:
        message = aobj[i];
        if (message.getValue() != (() (obj1)).m_n1) goto _L33; else goto _L32
_L32:
        VideoEngine.access$200(mVideoEngine).onStreamSwitch(mVideoEngine, (() (obj1)).m_l1, message, (() (obj1)).m_n2, (int)(() (obj1)).m_l2);
        return;
_L33:
        i++;
          goto _L34
_L7:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.STREAM_METADATA)) goto _L2; else goto _L35
_L35:
        VideoEngine.access$200(mVideoEngine).onStreamMetadata(mVideoEngine, (StreamMetadata)message.obj);
        return;
_L8:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.DRM_METADATA)) goto _L2; else goto _L36
_L36:
        message = ()message.obj;
        VideoEngine.access$200(mVideoEngine).onDRMMetadata(mVideoEngine, (byte[])(byte[])(() (message)).m_obj, (() (message)).m_n1, (() (message)).m_l1);
        return;
_L9:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.TIMELINE)) goto _L2; else goto _L37
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
        VideoEngine.access$200(mVideoEngine).onTimeline(mVideoEngine, ((UpdateType) (obj)));
        return;
_L40:
        i++;
          goto _L41
_L10:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.DATA)) goto _L2; else goto _L42
_L42:
        obj1 = ()message.obj;
        obj = DataType.DT_3GPP_CAPTION_METADATA;
        aobj = DataType.values();
        j = aobj.length;
        i = 0;
_L46:
        message = ((Message) (obj));
        if (i >= j) goto _L44; else goto _L43
_L43:
        message = aobj[i];
        if (message.getValue() != (() (obj1)).m_n1) goto _L45; else goto _L44
_L44:
        VideoEngine.access$200(mVideoEngine).onData(mVideoEngine, (() (obj1)).m_l1, message, (byte[])(byte[])(() (obj1)).m_obj, (() (obj1)).m_n2);
        return;
_L45:
        i++;
          goto _L46
_L11:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.MANIFEST_LOAD)) goto _L2; else goto _L47
_L47:
        obj1 = ()message.obj;
        obj = MediaErrorCode.GENERIC_ERROR;
        aobj = MediaErrorCode.values();
        j = aobj.length;
        i = 0;
_L51:
        message = ((Message) (obj));
        if (i >= j) goto _L49; else goto _L48
_L48:
        message = aobj[i];
        if (message.getValue() != (() (obj1)).m_n1) goto _L50; else goto _L49
_L49:
        VideoEngine.access$200(mVideoEngine).onManifestLoad(mVideoEngine, message, (() (obj1)).m_n2, (int)(() (obj1)).m_l1, (() (obj1)).m_l2);
        return;
_L50:
        i++;
          goto _L51
_L12:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.SEEK_COMPLETE)) goto _L2; else goto _L52
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
        VideoEngine.access$200(mVideoEngine).onSeekComplete(mVideoEngine, ((MediaErrorCode) (obj)));
        return;
_L55:
        i++;
          goto _L56
_L13:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.WARNING)) goto _L2; else goto _L57
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
        VideoEngine.access$200(mVideoEngine).onWarning(mVideoEngine, ((MediaErrorCode) (obj)), (String)message.obj);
        return;
_L60:
        i++;
          goto _L61
_L14:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.DICTIONARY_DATA)) goto _L2; else goto _L62
_L62:
        message = ()message.obj;
        VideoEngine.access$200(mVideoEngine).onDictionaryData(mVideoEngine, (Dictionary)(() (message)).m_obj, (() (message)).m_l1);
        return;
_L15:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.LOAD_INFO)) goto _L2; else goto _L63
_L63:
        VideoEngine.access$200(mVideoEngine).onLoadInfo(mVideoEngine, (String)message.obj);
        return;
_L16:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.TRICK_PLAY_ENDED)) goto _L2; else goto _L64
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
        VideoEngine.access$200(mVideoEngine).onTrickPlayEnded(mVideoEngine, ((MediaErrorCode) (obj)));
        return;
_L67:
        i++;
          goto _L68
_L17:
        Log.w("VideoEngine(j)", "Handler : kCTDRMError!!!");
        message = (DRMError)message.obj;
        if (VideoEngine.access$300(mVideoEngine).contains(ListenerType.DRM_ERROR))
        {
            VideoEngine.access$200(mVideoEngine).onDRMError(mVideoEngine, message);
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
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.BACKGROUND_MANIFEST_ERROR)) goto _L2; else goto _L70
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
        VideoEngine.access$200(mVideoEngine).onBackgroundManifestError(mVideoEngine, ((MediaErrorCode) (obj)), (String)message.obj);
        return;
_L73:
        i++;
        if (true) goto _L75; else goto _L74
_L74:
        if (!VideoEngine.access$300(mVideoEngine).contains(ListenerType.BACKGROUND_MANIFEST_WARNING)) goto _L2; else goto _L76
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
        VideoEngine.access$200(mVideoEngine).onBackgroundManifestWarning(mVideoEngine, ((MediaErrorCode) (obj)), (String)message.obj);
        return;
_L79:
        i++;
        if (true) goto _L81; else goto _L80
_L80:
    }

    public (VideoEngine videoengine1, Looper looper)
    {
        this$0 = VideoEngine.this;
        super(looper);
        mVideoEngine = videoengine1;
    }
}
