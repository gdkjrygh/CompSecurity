// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.utils;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.util.Log;
import android.util.Range;
import com.skype.android.video.hw.HWFeatureSelectiveFields;
import com.skype.android.video.hw.format.Capabilities;
import com.skype.android.video.hw.format.ColorFormat;
import com.skype.android.video.hw.format.H264Level;
import com.skype.android.video.hw.format.H264Profile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class CodecUtils
{
    private static class CapabilitiesHandler
    {

        private static Map decoderCapabilities;
        private static Map encoderCapabilities;

        public static String[] enumCodecs(boolean flag)
        {
            Map map;
            if (flag)
            {
                map = getEncoderCapabilities();
            } else
            {
                map = getDecoderCapabilities();
            }
            return (String[])map.keySet().toArray(new String[map.size()]);
        }

        public static Map getDecoderCapabilities()
        {
            com/skype/android/video/hw/utils/CodecUtils$CapabilitiesHandler;
            JVM INSTR monitorenter ;
            Map map;
            if (decoderCapabilities == null)
            {
                decoderCapabilities = CodecUtils.getAllCapabilities(false);
            }
            map = decoderCapabilities;
            com/skype/android/video/hw/utils/CodecUtils$CapabilitiesHandler;
            JVM INSTR monitorexit ;
            return map;
            Exception exception;
            exception;
            throw exception;
        }

        public static Map getEncoderCapabilities()
        {
            com/skype/android/video/hw/utils/CodecUtils$CapabilitiesHandler;
            JVM INSTR monitorenter ;
            Map map;
            if (encoderCapabilities == null)
            {
                encoderCapabilities = CodecUtils.getAllCapabilities(true);
            }
            map = encoderCapabilities;
            com/skype/android/video/hw/utils/CodecUtils$CapabilitiesHandler;
            JVM INSTR monitorexit ;
            return map;
            Exception exception;
            exception;
            throw exception;
        }

        private CapabilitiesHandler()
        {
        }
    }


    public static final String MEDIA_TYPE = "video/avc";
    public static final String omxCapableHW[] = {
        "OMX.Intel.hw_ve.h264", "OMX.Exynos.AVC.Encoder", "OMX.MTK.VIDEO.ENCODER.AVC"
    };

    public CodecUtils()
    {
    }

    public static String[] enumDecoders()
    {
        String as[] = CapabilitiesHandler.enumCodecs(false);
        Arrays.sort(as);
        return as;
    }

    public static String[] enumEncoders()
    {
        String as[] = CapabilitiesHandler.enumCodecs(true);
        Arrays.sort(as);
        return as;
    }

    private static Map getAllCapabilities(boolean flag)
    {
        boolean flag2;
        int i;
        MediaCodecInfo amediacodecinfo[];
        Object obj;
        HashMap hashmap;
        Object obj1;
        Capabilities capabilities;
        StringBuilder stringbuilder;
        boolean flag1;
        int j;
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        hashmap = new HashMap();
        if (!flag1 && !flag2) goto _L2; else goto _L1
_L1:
        if (i == 0) goto _L4; else goto _L3
_L3:
        amediacodecinfo = (new MediaCodecList(1)).getCodecInfos();
        j = amediacodecinfo.length;
        i = 0;
_L13:
        if (i >= j) goto _L2; else goto _L5
_L5:
        obj1 = amediacodecinfo[i];
        if (((MediaCodecInfo) (obj1)).isEncoder() != flag || (flag ? !flag1 : !flag2)) goto _L7; else goto _L6
_L6:
        getCodecCapabilities(hashmap, ((MediaCodecInfo) (obj1)));
          goto _L7
_L14:
        if (i >= MediaCodecList.getCodecCount()) goto _L2; else goto _L8
_L8:
        obj = MediaCodecList.getCodecInfoAt(i);
        if (((MediaCodecInfo) (obj)).isEncoder() == flag && (flag ? flag1 : flag2))
        {
            break MISSING_BLOCK_LABEL_143;
        } else
        {
            break MISSING_BLOCK_LABEL_302;
        }
        try
        {
            getCodecCapabilities(hashmap, ((MediaCodecInfo) (obj)));
            break MISSING_BLOCK_LABEL_302;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", "Exception caught", ((Throwable) (obj)));
            }
        }
          goto _L9
_L2:
        obj1 = hashmap.values().iterator();
_L12:
        if (!((Iterator) (obj1)).hasNext()) goto _L9; else goto _L10
_L10:
        capabilities = (Capabilities)((Iterator) (obj1)).next();
        if (!Log.isLoggable("SLIQ", 4)) goto _L12; else goto _L11
_L11:
        stringbuilder = new StringBuilder("video/avc");
        if (flag)
        {
            obj = " encoder detected: ";
        } else
        {
            obj = " decoder detected: ";
        }
        Log.i("SLIQ", stringbuilder.append(((String) (obj))).append(capabilities).toString());
          goto _L12
_L9:
        return hashmap;
_L7:
        i++;
          goto _L13
_L4:
        i = 0;
          goto _L14
        i++;
          goto _L14
    }

    private static void getCodecCapabilities(Map map, MediaCodecInfo mediacodecinfo)
    {
        Object obj;
        Object obj1;
        Range range;
        Range range1;
        Range range2;
        String as[];
        android.media.MediaCodecInfo.CodecCapabilities codeccapabilities;
        String s;
        boolean flag;
        int i;
        int j;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        as = mediacodecinfo.getSupportedTypes();
        j = as.length;
        i = 0;
_L5:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_641;
        }
        if (!"video/avc".equalsIgnoreCase(as[i]) || mediacodecinfo.getName().toLowerCase().startsWith("omx.google.")) goto _L2; else goto _L1
_L1:
        codeccapabilities = mediacodecinfo.getCapabilitiesForType("video/avc");
        obj1 = codeccapabilities.getClass();
        obj = null;
        obj1 = (MediaFormat)((Class) (obj1)).getDeclaredMethod("getCapabilitiesInfoFormat", new Class[0]).invoke(codeccapabilities, new Object[0]);
        obj = obj1;
_L3:
        if (codeccapabilities.colorFormats.length > 0 && codeccapabilities.profileLevels.length > 0)
        {
            range = null;
            range1 = null;
            range2 = null;
            Object obj2 = Boolean.valueOf(false);
            if (flag)
            {
                obj2 = codeccapabilities.getVideoCapabilities();
                range = ((android.media.MediaCodecInfo.VideoCapabilities) (obj2)).getSupportedWidths();
                range1 = ((android.media.MediaCodecInfo.VideoCapabilities) (obj2)).getSupportedHeights();
                range2 = ((android.media.MediaCodecInfo.VideoCapabilities) (obj2)).getBitrateRange();
                Object obj3 = Boolean.valueOf(false);
                obj2 = obj3;
                if (obj != null)
                {
                    s = ((MediaFormat) (obj)).getString("vt-version");
                    if (s != null)
                    {
                        obj2 = Boolean.valueOf(true);
                        (new StringBuilder()).append(mediacodecinfo.getName()).append(" vt-version returned: ").append(s);
                    } else
                    {
                        Log.e("SLIQ", (new StringBuilder()).append(mediacodecinfo.getName()).append(" vt-version returned: null").toString());
                        obj2 = obj3;
                    }
                }
                if (((Boolean) (obj2)).booleanValue())
                {
                    (new StringBuilder()).append(mediacodecinfo.getName()).append(" supports VTVideoCapabilities:");
                    (new StringBuilder("getVersion() =>                     ")).append(((MediaFormat) (obj)).getString("vt-version"));
                    (new StringBuilder("isLowLatencySupported() =>          ")).append(((MediaFormat) (obj)).getString("vt-low-latency"));
                    (new StringBuilder("getMaxInstances() =>                ")).append(((MediaFormat) (obj)).getString("vt-max-instances"));
                    (new StringBuilder("getMaxTemporalLayerCount() =>       ")).append(((MediaFormat) (obj)).getString("vt-max-temporal-layer-count"));
                    (new StringBuilder("getMaxRefFrames() =>                ")).append(((MediaFormat) (obj)).getString("vt-max-ref-frames"));
                    (new StringBuilder("getMaxLTRFrames() =>                ")).append(((MediaFormat) (obj)).getString("vt-max-ltr-frames"));
                    (new StringBuilder("getMaxLevel() =>                    ")).append(((MediaFormat) (obj)).getString("vt-max-level"));
                    (new StringBuilder("getSliceControlModesBM() =>         ")).append(((MediaFormat) (obj)).getString("vt-slice-control-modes-bitmask"));
                    (new StringBuilder("getMaxMacroblockProcessingRate() => ")).append(((MediaFormat) (obj)).getString("vt-max-macroblock-processing-rate"));
                    (new StringBuilder("getSupportedDownScaleFactor() =>    ")).append(((MediaFormat) (obj)).getString("vt-down-scale-factor"));
                    (new StringBuilder("getMinScaleFactor() =>              ")).append(((MediaFormat) (obj)).getString("vt-min-scale-factor"));
                } else
                {
                    (new StringBuilder()).append(mediacodecinfo.getName()).append(" does not support VTVideoCapabilities.");
                }
            }
            obj3 = mediacodecinfo.getName();
            if (!((Boolean) (obj2)).booleanValue())
            {
                obj = null;
            }
            obj = mapCapabilities(((String) (obj3)), codeccapabilities, range, range1, range2, ((MediaFormat) (obj)));
            map.put(mediacodecinfo.getName(), obj);
        }
_L2:
        i++;
        continue; /* Loop/switch isn't completed */
        obj2;
        Log.w("SLIQ", "Could not find getCapabilitiesInfoFormat");
          goto _L3
        obj2;
        Log.w("SLIQ", "Could not find getCapabilitiesInfoFormat");
          goto _L3
        obj2;
        Log.w("SLIQ", "Could not find getCapabilitiesInfoFormat");
          goto _L3
        obj2;
        Log.w("SLIQ", "Could not find getCapabilitiesInfoFormat");
          goto _L3
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static Capabilities getDecoderCapabilities(String s)
    {
        return (Capabilities)CapabilitiesHandler.getDecoderCapabilities().get(s);
    }

    public static Capabilities getEncoderCapabilities(String s)
    {
        return (Capabilities)CapabilitiesHandler.getEncoderCapabilities().get(s);
    }

    public static EnumSet getHWMode()
    {
        int j = getHWModefromNative();
        Object obj = new HashSet();
        HWFeatureSelectiveFields ahwfeatureselectivefields[] = HWFeatureSelectiveFields.values();
        int k = ahwfeatureselectivefields.length;
        for (int i = 0; i < k; i++)
        {
            HWFeatureSelectiveFields hwfeatureselectivefields = ahwfeatureselectivefields[i];
            if ((hwfeatureselectivefields.getValue() & j) != 0)
            {
                ((Set) (obj)).add(hwfeatureselectivefields);
            }
        }

        if (((Set) (obj)).isEmpty())
        {
            obj = Collections.emptySet();
        } else
        {
            obj = EnumSet.copyOf(((Collection) (obj)));
        }
        return (EnumSet)obj;
    }

    public static native int getHWModefromNative();

    private static Capabilities mapCapabilities(String s, android.media.MediaCodecInfo.CodecCapabilities codeccapabilities, Range range, Range range1, Range range2, MediaFormat mediaformat)
    {
        HashSet hashset = new HashSet();
        Object obj = new HashSet();
        android.media.MediaCodecInfo.CodecProfileLevel acodecprofilelevel[] = codeccapabilities.profileLevels;
        int j = acodecprofilelevel.length;
        int i = 0;
        do
        {
            if (i < j)
            {
                android.media.MediaCodecInfo.CodecProfileLevel codecprofilelevel = acodecprofilelevel[i];
                try
                {
                    hashset.add(H264Profile.fromOmx(codecprofilelevel.profile));
                }
                catch (NoSuchElementException nosuchelementexception1)
                {
                    if (Log.isLoggable("SLIQ", 4))
                    {
                        Log.i("SLIQ", (new StringBuilder("OMX H.264 profile ")).append(codecprofilelevel.profile).append(" is not supported").toString());
                    }
                }
                try
                {
                    ((Set) (obj)).add(H264Level.fromOmx(codecprofilelevel.level));
                }
                catch (NoSuchElementException nosuchelementexception2)
                {
                    if (Log.isLoggable("SLIQ", 4))
                    {
                        Log.i("SLIQ", (new StringBuilder("OMX H.264 level ")).append(codecprofilelevel.level).append(" is not supported").toString());
                    }
                }
                i++;
                continue;
            }
            Object obj1 = new HashSet();
            codeccapabilities = codeccapabilities.colorFormats;
            j = codeccapabilities.length;
            i = 0;
            do
            {
                if (i >= j)
                {
                    break;
                }
                int k = codeccapabilities[i];
                try
                {
                    ((Set) (obj1)).add(ColorFormat.fromOmx(k));
                }
                catch (NoSuchElementException nosuchelementexception)
                {
                    if (Log.isLoggable("SLIQ", 4))
                    {
                        Log.i("SLIQ", (new StringBuilder("OMX color format ")).append(k).append(" is not supported").toString());
                    }
                }
                i++;
            } while (true);
            if (hashset.isEmpty())
            {
                codeccapabilities = Collections.emptySet();
            } else
            {
                codeccapabilities = EnumSet.copyOf(hashset);
            }
            if (((Set) (obj)).isEmpty())
            {
                obj = Collections.emptySet();
            } else
            {
                obj = EnumSet.copyOf(((Collection) (obj)));
            }
            if (((Set) (obj1)).isEmpty())
            {
                obj1 = Collections.emptySet();
            } else
            {
                obj1 = EnumSet.copyOf(((Collection) (obj1)));
            }
            return new Capabilities(s, codeccapabilities, ((Set) (obj)), ((Set) (obj1)), range, range1, range2, mediaformat);
        } while (true);
    }

    public static void overrideHWMode(HWFeatureSelectiveFields hwfeatureselectivefields)
    {
        overrideHWModeToNative(hwfeatureselectivefields.getValue());
    }

    public static native void overrideHWModeToNative(int i);


}
