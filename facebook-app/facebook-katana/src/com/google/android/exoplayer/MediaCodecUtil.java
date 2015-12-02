// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.util.Util;
import java.util.HashMap;

// Referenced classes of package com.google.android.exoplayer:
//            DecoderInfo

public final class MediaCodecUtil
{

    private static final HashMap a = new HashMap();

    private MediaCodecUtil()
    {
    }

    public static int a()
    {
        int i = 0;
        Object obj = b("video/avc", false);
        if (obj == null)
        {
            return 0;
        }
        obj = (android.media.MediaCodecInfo.CodecCapabilities)((Pair) (obj)).second;
        int j = 0;
        for (; i < ((android.media.MediaCodecInfo.CodecCapabilities) (obj)).profileLevels.length; i++)
        {
            j = Math.max(a(((android.media.MediaCodecInfo.CodecCapabilities) (obj)).profileLevels[i].level), j);
        }

        return j;
    }

    private static int a(int i)
    {
        char c = '\u6300';
        switch (i)
        {
        default:
            c = '\uFFFF';
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            return c;

        case 8: // '\b'
            return 0x18c00;

        case 16: // '\020'
            return 0x18c00;

        case 32: // ' '
            return 0x18c00;

        case 64: // '@'
            return 0x31800;

        case 128: 
            return 0x65400;

        case 256: 
            return 0x65400;

        case 512: 
            return 0xe1000;

        case 1024: 
            return 0x140000;

        case 2048: 
            return 0x200000;

        case 4096: 
            return 0x200000;

        case 8192: 
            return 0x220000;

        case 16384: 
            return 0x564000;

        case 32768: 
            return 0x900000;
        }
    }

    private static Pair a(CodecKey codeckey, MediaCodecListCompat mediacodeclistcompat)
    {
        try
        {
            codeckey = b(codeckey, mediacodeclistcompat);
        }
        // Misplaced declaration of an exception variable
        catch (CodecKey codeckey)
        {
            throw new DecoderQueryException(codeckey, (byte)0);
        }
        return codeckey;
    }

    public static DecoderInfo a(String s, boolean flag)
    {
        s = b(s, flag);
        if (s == null)
        {
            return null;
        } else
        {
            return new DecoderInfo((String)((Pair) (s)).first, a((android.media.MediaCodecInfo.CodecCapabilities)((Pair) (s)).second));
        }
    }

    private static boolean a(android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
    {
        if (Util.a >= 19)
        {
            return b(codeccapabilities);
        } else
        {
            return false;
        }
    }

    private static boolean a(MediaCodecInfo mediacodecinfo, String s, boolean flag)
    {
        while (mediacodecinfo.isEncoder() || !s.startsWith("OMX.") || !flag && s.endsWith(".secure") || Util.a == 16 && ("dlxu".equals(Util.b) || "protou".equals(Util.b) || "C6602".equals(Util.b) || "C6603".equals(Util.b)) && s.equals("OMX.qcom.audio.decoder.mp3") || Util.a <= 19 && Util.b != null && Util.b.startsWith("serrano") && "samsung".equals(Util.c) && s.equals("OMX.SEC.vp8.dec")) 
        {
            return false;
        }
        return true;
    }

    private static Pair b(CodecKey codeckey, MediaCodecListCompat mediacodeclistcompat)
    {
        String s1 = codeckey.a;
        int k = mediacodeclistcompat.a();
        boolean flag = mediacodeclistcompat.b();
        for (int i = 0; i < k; i++)
        {
            MediaCodecInfo mediacodecinfo = mediacodeclistcompat.a(i);
            String s2 = mediacodecinfo.getName();
            if (!a(mediacodecinfo, s2, flag))
            {
                continue;
            }
            String as[] = mediacodecinfo.getSupportedTypes();
            for (int j = 0; j < as.length; j++)
            {
                String s = as[j];
                if (!s.equalsIgnoreCase(s1))
                {
                    continue;
                }
                android.media.MediaCodecInfo.CodecCapabilities codeccapabilities = mediacodecinfo.getCapabilitiesForType(s);
                boolean flag1 = mediacodeclistcompat.a(codeckey.a, codeccapabilities);
                if (!flag)
                {
                    HashMap hashmap = a;
                    CodecKey codeckey1;
                    if (codeckey.b)
                    {
                        codeckey1 = new CodecKey(s1, false);
                    } else
                    {
                        codeckey1 = codeckey;
                    }
                    hashmap.put(codeckey1, Pair.create(s2, codeccapabilities));
                    if (flag1)
                    {
                        HashMap hashmap1 = a;
                        if (codeckey.b)
                        {
                            codeckey1 = codeckey;
                        } else
                        {
                            codeckey1 = new CodecKey(s1, true);
                        }
                        hashmap1.put(codeckey1, Pair.create((new StringBuilder()).append(s2).append(".secure").toString(), codeccapabilities));
                    }
                } else
                {
                    HashMap hashmap2 = a;
                    CodecKey codeckey2;
                    if (codeckey.b == flag1)
                    {
                        codeckey2 = codeckey;
                    } else
                    {
                        codeckey2 = new CodecKey(s1, flag1);
                    }
                    hashmap2.put(codeckey2, Pair.create(s2, codeccapabilities));
                }
                if (a.containsKey(codeckey))
                {
                    return (Pair)a.get(codeckey);
                }
            }

        }

        return null;
    }

    private static Pair b(String s, boolean flag)
    {
        com/google/android/exoplayer/MediaCodecUtil;
        JVM INSTR monitorenter ;
        CodecKey codeckey = new CodecKey(s, flag);
        if (!a.containsKey(codeckey)) goto _L2; else goto _L1
_L1:
        Object obj = (Pair)a.get(codeckey);
_L5:
        com/google/android/exoplayer/MediaCodecUtil;
        JVM INSTR monitorexit ;
        return ((Pair) (obj));
_L2:
        if (Util.a < 21)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        obj = new MediaCodecListCompatV21(flag);
_L3:
        Pair pair = a(codeckey, ((MediaCodecListCompat) (obj)));
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
        if (Util.a < 21)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = a(codeckey, new MediaCodecListCompatV16((byte)0));
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.w("MediaCodecUtil", (new StringBuilder("MediaCodecList API didn't list secure decoder for: ")).append(s).append(". Assuming: ").append((String)((Pair) (obj)).first).toString());
        continue; /* Loop/switch isn't completed */
        obj = new MediaCodecListCompatV16((byte)0);
          goto _L3
        s;
        throw s;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static boolean b(android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
    {
        return codeccapabilities.isFeatureSupported("adaptive-playback");
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


    private class CodecKey
    {

        public final String a;
        public final boolean b;

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || obj.getClass() != com/google/android/exoplayer/MediaCodecUtil$CodecKey)
                {
                    return false;
                }
                obj = (CodecKey)obj;
                if (!TextUtils.equals(a, ((CodecKey) (obj)).a) || b != ((CodecKey) (obj)).b)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int i;
            char c;
            if (a == null)
            {
                i = 0;
            } else
            {
                i = a.hashCode();
            }
            if (b)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return c + (i + 31) * 31;
        }

        public CodecKey(String s, boolean flag)
        {
            a = s;
            b = flag;
        }
    }


    private class MediaCodecListCompat
    {

        public abstract int a();

        public abstract MediaCodecInfo a(int i);

        public abstract boolean a(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities);

        public abstract boolean b();
    }


    private class MediaCodecListCompatV21
        implements MediaCodecListCompat
    {

        private final int a;
        private MediaCodecInfo b[];

        private void c()
        {
            if (b == null)
            {
                b = (new MediaCodecList(a)).getCodecInfos();
            }
        }

        public final int a()
        {
            c();
            return b.length;
        }

        public final MediaCodecInfo a(int i)
        {
            c();
            return b[i];
        }

        public final boolean a(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
        {
            return codeccapabilities.isFeatureSupported("secure-playback");
        }

        public final boolean b()
        {
            return true;
        }

        public MediaCodecListCompatV21(boolean flag)
        {
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            a = i;
        }
    }


    private class MediaCodecListCompatV16
        implements MediaCodecListCompat
    {

        public final int a()
        {
            return MediaCodecList.getCodecCount();
        }

        public final MediaCodecInfo a(int i)
        {
            return MediaCodecList.getCodecInfoAt(i);
        }

        public final boolean a(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities)
        {
            return "video/avc".equals(s);
        }

        public final boolean b()
        {
            return false;
        }

        private MediaCodecListCompatV16()
        {
        }

        MediaCodecListCompatV16(byte byte0)
        {
            this();
        }
    }

}
