// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import java.util.HashMap;

public final class jiw
{

    private static final HashMap a = new HashMap();

    private static Pair a(jix jix1, jiz jiz1)
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
            s = jix1.a;
            k = jiz1.a();
            flag = jiz1.b();
        }
        // Misplaced declaration of an exception variable
        catch (jix jix1)
        {
            throw new jiy(jix1);
        }
        j = 0;
_L23:
        if (j >= k) goto _L2; else goto _L1
_L1:
        mediacodecinfo = jiz1.a(j);
        s1 = mediacodecinfo.getName();
        if (mediacodecinfo.isEncoder()) goto _L4; else goto _L3
_L3:
        if (flag) goto _L6; else goto _L5
_L5:
        if (!s1.endsWith(".secure")) goto _L6; else goto _L4
_L19:
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        as = mediacodecinfo.getSupportedTypes();
        i = 0;
_L22:
        if (i >= as.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = as[i];
        if (!((String) (obj)).equalsIgnoreCase(s)) goto _L8; else goto _L7
_L7:
        codeccapabilities = mediacodecinfo.getCapabilitiesForType(((String) (obj)));
        flag1 = jiz1.a(jix1.a, codeccapabilities);
        if (flag) goto _L10; else goto _L9
_L9:
        hashmap = a;
        if (!jix1.b)
        {
            break MISSING_BLOCK_LABEL_587;
        }
        obj = new jix(s, false);
_L24:
        hashmap.put(obj, Pair.create(s1, codeccapabilities));
        if (!flag1) goto _L12; else goto _L11
_L11:
        hashmap = a;
        if (!jix1.b) goto _L14; else goto _L13
_L13:
        obj = jix1;
_L20:
        hashmap.put(obj, Pair.create(String.valueOf(s1).concat(".secure"), codeccapabilities));
_L12:
        if (a.containsKey(jix1))
        {
            return (Pair)a.get(jix1);
        }
          goto _L8
_L6:
        if (jno.a != 16 || !"OMX.qcom.audio.decoder.mp3".equals(s1) || !"dlxu".equals(jno.b) && !"protou".equals(jno.b) && !"C6602".equals(jno.b) && !"C6603".equals(jno.b) && !"C6606".equals(jno.b) && !"C6616".equals(jno.b) && !"L36h".equals(jno.b) && !"SO-02E".equals(jno.b)) goto _L16; else goto _L15
_L16:
        if (jno.a != 16 || !"OMX.qcom.audio.decoder.aac".equals(s1) || !"C1504".equals(jno.b) && !"C1505".equals(jno.b) && !"C1604".equals(jno.b) && !"C1605".equals(jno.b)) goto _L18; else goto _L17
_L18:
        HashMap hashmap1;
        if (jno.a <= 19 && jno.b != null && (jno.b.startsWith("d2") || jno.b.startsWith("serrano")) && "samsung".equals(jno.c) && s1.equals("OMX.SEC.vp8.dec"))
        {
            i = 0;
        } else
        {
            i = 1;
        }
          goto _L19
_L14:
        obj = new jix(s, true);
          goto _L20
_L10:
        hashmap1 = a;
        if (jix1.b != flag1)
        {
            break MISSING_BLOCK_LABEL_529;
        }
        obj = jix1;
_L21:
        hashmap1.put(obj, Pair.create(s1, codeccapabilities));
          goto _L12
        obj = new jix(s, flag1);
          goto _L21
_L8:
        i++;
          goto _L22
        j++;
          goto _L23
_L2:
        return null;
_L4:
        i = 0;
          goto _L19
_L15:
        i = 0;
          goto _L19
_L17:
        i = 0;
          goto _L19
        obj = jix1;
          goto _L24
    }

    public static jid a(String s, boolean flag)
    {
        Object obj = b(s, flag);
        if (obj == null)
        {
            return null;
        }
        s = (String)((Pair) (obj)).first;
        obj = (android.media.MediaCodecInfo.CodecCapabilities)((Pair) (obj)).second;
        if (jno.a >= 19)
        {
            flag = ((android.media.MediaCodecInfo.CodecCapabilities) (obj)).isFeatureSupported("adaptive-playback");
        } else
        {
            flag = false;
        }
        return new jid(s, flag);
    }

    private static Pair b(String s, boolean flag)
    {
        jiw;
        JVM INSTR monitorenter ;
        jix jix1 = new jix(s, flag);
        if (!a.containsKey(jix1)) goto _L2; else goto _L1
_L1:
        Object obj = (Pair)a.get(jix1);
_L5:
        jiw;
        JVM INSTR monitorexit ;
        return ((Pair) (obj));
_L2:
        if (jno.a < 21)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        obj = new jjb(flag);
_L3:
        Pair pair = a(jix1, ((jiz) (obj)));
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
        if (jno.a < 21)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = a(jix1, new jja());
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s1 = (String)((Pair) (obj)).first;
        Log.w("MediaCodecUtil", (new StringBuilder(String.valueOf(s).length() + 63 + String.valueOf(s1).length())).append("MediaCodecList API didn't list secure decoder for: ").append(s).append(". Assuming: ").append(s1).toString());
        continue; /* Loop/switch isn't completed */
        obj = new jja();
          goto _L3
        s;
        throw s;
        if (true) goto _L5; else goto _L4
_L4:
    }

}
