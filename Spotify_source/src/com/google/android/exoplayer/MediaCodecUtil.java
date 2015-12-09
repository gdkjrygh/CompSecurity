// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import ayn;
import azc;
import azd;
import aze;
import azf;
import bej;
import java.util.HashMap;

public final class MediaCodecUtil
{

    private static final HashMap a = new HashMap();

    public static int a()
    {
        Object obj;
        int j;
        int k;
        j = 0;
        obj = b("video/avc", false);
        if (obj == null)
        {
            return 0;
        }
        obj = (android.media.MediaCodecInfo.CodecCapabilities)((Pair) (obj)).second;
        k = 0;
_L18:
        if (j >= ((android.media.MediaCodecInfo.CodecCapabilities) (obj)).profileLevels.length)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        ((android.media.MediaCodecInfo.CodecCapabilities) (obj)).profileLevels[j].level;
        JVM INSTR lookupswitch 15: default 172
    //                   1: 187
    //                   2: 194
    //                   8: 201
    //                   16: 207
    //                   32: 213
    //                   64: 219
    //                   128: 225
    //                   256: 231
    //                   512: 237
    //                   1024: 243
    //                   2048: 249
    //                   4096: 255
    //                   8192: 261
    //                   16384: 267
    //                   32768: 273;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L16:
        break MISSING_BLOCK_LABEL_273;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        int i = -1;
_L19:
        k = Math.max(i, k);
        j++;
        if (true) goto _L18; else goto _L17
_L17:
        i = 25344;
          goto _L19
_L3:
        i = 25344;
          goto _L19
_L4:
        i = 0x18c00;
          goto _L19
_L5:
        i = 0x18c00;
          goto _L19
_L6:
        i = 0x18c00;
          goto _L19
_L7:
        i = 0x31800;
          goto _L19
_L8:
        i = 0x65400;
          goto _L19
_L9:
        i = 0x65400;
          goto _L19
_L10:
        i = 0xe1000;
          goto _L19
_L11:
        i = 0x140000;
          goto _L19
_L12:
        i = 0x200000;
          goto _L19
_L13:
        i = 0x200000;
          goto _L19
_L14:
        i = 0x220000;
          goto _L19
_L15:
        i = 0x564000;
          goto _L19
        i = 0x900000;
          goto _L19
        return k;
    }

    private static Pair a(azc azc1, azd azd1)
    {
        Object obj;
        String s;
        String s1;
        android.media.MediaCodecInfo.CodecCapabilities codeccapabilities;
        int i;
        int j;
        boolean flag1;
        MediaCodecInfo mediacodecinfo;
        String as[];
        HashMap hashmap;
        int k;
        boolean flag;
        try
        {
            s = azc1.a;
            k = azd1.a();
            flag = azd1.b();
        }
        // Misplaced declaration of an exception variable
        catch (azc azc1)
        {
            throw new DecoderQueryException(azc1, (byte)0);
        }
        j = 0;
_L21:
        if (j >= k) goto _L2; else goto _L1
_L1:
        mediacodecinfo = azd1.a(j);
        s1 = mediacodecinfo.getName();
        if (mediacodecinfo.isEncoder() || !s1.startsWith("OMX.")) goto _L4; else goto _L3
_L3:
        if (flag) goto _L6; else goto _L5
_L5:
        if (!s1.endsWith(".secure")) goto _L6; else goto _L4
_L17:
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        as = mediacodecinfo.getSupportedTypes();
        i = 0;
_L20:
        if (i >= as.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = as[i];
        if (!((String) (obj)).equalsIgnoreCase(s)) goto _L8; else goto _L7
_L7:
        codeccapabilities = mediacodecinfo.getCapabilitiesForType(((String) (obj)));
        flag1 = azd1.a(azc1.a, codeccapabilities);
        if (flag) goto _L10; else goto _L9
_L9:
        hashmap = a;
        if (!azc1.b)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        obj = new azc(s, false);
_L22:
        hashmap.put(obj, Pair.create(s1, codeccapabilities));
        if (!flag1) goto _L12; else goto _L11
_L11:
        hashmap = a;
        if (!azc1.b) goto _L14; else goto _L13
_L13:
        obj = azc1;
_L18:
        hashmap.put(obj, Pair.create((new StringBuilder()).append(s1).append(".secure").toString(), codeccapabilities));
_L12:
        if (a.containsKey(azc1))
        {
            return (Pair)a.get(azc1);
        }
          goto _L8
_L6:
        if (bej.a != 16 || !"dlxu".equals(bej.b) && !"protou".equals(bej.b) && !"C6602".equals(bej.b) && !"C6603".equals(bej.b) || !s1.equals("OMX.qcom.audio.decoder.mp3")) goto _L16; else goto _L15
_L15:
        i = 0;
          goto _L17
_L16:
        HashMap hashmap1;
        if (bej.a <= 19 && bej.b != null && bej.b.startsWith("serrano") && "samsung".equals(bej.c) && s1.equals("OMX.SEC.vp8.dec"))
        {
            i = 0;
        } else
        {
            i = 1;
        }
          goto _L17
_L14:
        obj = new azc(s, true);
          goto _L18
_L10:
        hashmap1 = a;
        if (azc1.b != flag1)
        {
            break MISSING_BLOCK_LABEL_433;
        }
        obj = azc1;
_L19:
        hashmap1.put(obj, Pair.create(s1, codeccapabilities));
          goto _L12
        obj = new azc(s, flag1);
          goto _L19
_L8:
        i++;
          goto _L20
        j++;
          goto _L21
_L2:
        return null;
_L4:
        i = 0;
          goto _L17
        obj = azc1;
          goto _L22
    }

    public static ayn a(String s, boolean flag)
    {
        Object obj = b(s, flag);
        if (obj == null)
        {
            return null;
        }
        s = (String)((Pair) (obj)).first;
        obj = (android.media.MediaCodecInfo.CodecCapabilities)((Pair) (obj)).second;
        if (bej.a >= 19)
        {
            flag = ((android.media.MediaCodecInfo.CodecCapabilities) (obj)).isFeatureSupported("adaptive-playback");
        } else
        {
            flag = false;
        }
        return new ayn(s, flag);
    }

    private static Pair b(String s, boolean flag)
    {
        com/google/android/exoplayer/MediaCodecUtil;
        JVM INSTR monitorenter ;
        azc azc1 = new azc(s, flag);
        if (!a.containsKey(azc1)) goto _L2; else goto _L1
_L1:
        Object obj = (Pair)a.get(azc1);
_L5:
        com/google/android/exoplayer/MediaCodecUtil;
        JVM INSTR monitorexit ;
        return ((Pair) (obj));
_L2:
        if (bej.a < 21)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        obj = new azf(flag);
_L3:
        Pair pair = a(azc1, ((azd) (obj)));
        obj = pair;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = pair;
        if (pair != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = pair;
        if (bej.a < 21)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = a(azc1, new aze((byte)0));
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.w("MediaCodecUtil", (new StringBuilder("MediaCodecList API didn't list secure decoder for: ")).append(s).append(". Assuming: ").append((String)((Pair) (obj)).first).toString());
        continue; /* Loop/switch isn't completed */
        obj = new aze((byte)0);
          goto _L3
        s;
        throw s;
        if (true) goto _L5; else goto _L4
_L4:
    }


    private class DecoderQueryException extends Exception
    {

        private DecoderQueryException(Throwable throwable)
        {
            super("Failed to query underlying media codecs", throwable);
        }

        DecoderQueryException(Throwable throwable, byte byte0)
        {
            this(throwable);
        }
    }

}
