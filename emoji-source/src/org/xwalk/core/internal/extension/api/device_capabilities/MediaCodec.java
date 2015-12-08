// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.device_capabilities;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.device_capabilities:
//            XWalkMediaCodec, DeviceCapabilities

class MediaCodec extends XWalkMediaCodec
{

    public MediaCodec(DeviceCapabilities devicecapabilities)
    {
        mDeviceCapabilities = devicecapabilities;
        mAudioCodecsSet = new HashSet();
        mVideoCodecsSet = new HashSet();
        getCodecsList();
    }

    public JSONObject getCodecsInfo()
    {
        Object obj;
        JSONArray jsonarray;
        JSONArray jsonarray1;
        obj = new JSONObject();
        jsonarray = new JSONArray();
        jsonarray1 = new JSONArray();
        try
        {
            JSONObject jsonobject;
            for (Iterator iterator = mAudioCodecsSet.iterator(); iterator.hasNext(); jsonarray.put(jsonobject))
            {
                XWalkMediaCodec.AudioCodecElement audiocodecelement = (XWalkMediaCodec.AudioCodecElement)iterator.next();
                jsonobject = new JSONObject();
                jsonobject.put("format", audiocodecelement.codecName);
            }

        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return mDeviceCapabilities.setErrorMessage(((JSONException) (obj)).toString());
        }
        JSONObject jsonobject1;
        for (Iterator iterator1 = mVideoCodecsSet.iterator(); iterator1.hasNext(); jsonarray1.put(jsonobject1))
        {
            XWalkMediaCodec.VideoCodecElement videocodecelement = (XWalkMediaCodec.VideoCodecElement)iterator1.next();
            jsonobject1 = new JSONObject();
            jsonobject1.put("format", videocodecelement.codecName);
            jsonobject1.put("encode", videocodecelement.isEncoder);
            jsonobject1.put("hwAccel", videocodecelement.hwAccel);
        }

        ((JSONObject) (obj)).put("audioCodecs", jsonarray);
        ((JSONObject) (obj)).put("videoCodecs", jsonarray1);
        return ((JSONObject) (obj));
    }

    public void getCodecsList()
    {
        int i;
        int l;
        l = MediaCodecList.getCodecCount();
        i = 0;
_L10:
        MediaCodecInfo mediacodecinfo;
        String s;
        String as[];
        int j;
        boolean flag;
        int i1;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        mediacodecinfo = MediaCodecList.getCodecInfoAt(i);
        s = mediacodecinfo.getName().toUpperCase();
        flag = false;
        as = AUDIO_CODEC_NAMES;
        i1 = as.length;
        j = 0;
_L7:
        int k = ((flag) ? 1 : 0);
        if (j >= i1) goto _L2; else goto _L1
_L1:
        String s1 = as[j];
        if (!s.contains(s1)) goto _L4; else goto _L3
_L3:
        mAudioCodecsSet.add(new XWalkMediaCodec.AudioCodecElement(this, s1));
        k = 1;
_L2:
        if (!k) goto _L6; else goto _L5
_L5:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        j++;
          goto _L7
_L6:
        as = VIDEO_CODEC_NAMES;
        k = as.length;
        j = 0;
_L8:
        if (j < k)
        {
label0:
            {
                String s2 = as[j];
                if (!s.contains(s2))
                {
                    break label0;
                }
                boolean flag1 = mediacodecinfo.isEncoder();
                mVideoCodecsSet.add(new XWalkMediaCodec.VideoCodecElement(this, s2, flag1, false));
            }
        }
          goto _L5
        j++;
          goto _L8
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
