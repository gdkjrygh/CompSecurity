// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;

public final class OpacityMapping extends Enum
{

    private static final OpacityMapping $VALUES[];
    private static final String TAG = "nf_subtitles";
    public static final OpacityMapping none;
    public static final OpacityMapping opaque;
    public static final OpacityMapping semiTransparent;
    private String mLookupValue;
    private Float mSize;

    private OpacityMapping(String s, int i, Float float1, String s1)
    {
        super(s, i);
        mSize = float1;
        mLookupValue = s1;
    }

    public static Float lookup(String s)
    {
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Float) (obj));
_L2:
        obj = values();
        int j = obj.length;
        for (int i = 0; i < j; i++)
        {
            OpacityMapping opacitymapping = obj[i];
            if (opacitymapping.mLookupValue.equalsIgnoreCase(s))
            {
                return opacitymapping.getSize();
            }
        }

        Float float1;
        try
        {
            float1 = Float.valueOf(s);
            if (float1.floatValue() >= opaque.getSize().floatValue())
            {
                return opaque.getSize();
            }
        }
        catch (Throwable throwable)
        {
            Log.e("nf_subtitles", (new StringBuilder()).append("Failed to parse opacityt value ").append(s).toString(), throwable);
            return null;
        }
        obj = float1;
        if (float1.floatValue() >= none.getSize().floatValue()) goto _L4; else goto _L3
_L3:
        obj = none.getSize();
        return ((Float) (obj));
    }

    public static String opacityToHex(Float float1)
    {
        if (float1 == null)
        {
            return "FF";
        }
        if (float1.floatValue() <= 0.0F)
        {
            return "00";
        }
        if (float1.floatValue() >= 1.0F)
        {
            return "FF";
        } else
        {
            return Integer.toHexString((int)(255F * float1.floatValue()));
        }
    }

    public static OpacityMapping valueOf(String s)
    {
        return (OpacityMapping)Enum.valueOf(com/netflix/mediaclient/service/player/subtitles/OpacityMapping, s);
    }

    public static OpacityMapping[] values()
    {
        return (OpacityMapping[])$VALUES.clone();
    }

    public String getLookupValue()
    {
        return mLookupValue;
    }

    public Float getSize()
    {
        return mSize;
    }

    static 
    {
        none = new OpacityMapping("none", 0, Float.valueOf(0.0F), "NONE");
        semiTransparent = new OpacityMapping("semiTransparent", 1, Float.valueOf(0.5F), "SEMI_TRANSPARENT");
        opaque = new OpacityMapping("opaque", 2, Float.valueOf(1.0F), "OPAQUE");
        $VALUES = (new OpacityMapping[] {
            none, semiTransparent, opaque
        });
    }
}
