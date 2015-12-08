// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import android.graphics.Color;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.player.subtitles:
//            OpacityMapping

public final class ColorMapping extends Enum
{

    private static final ColorMapping $VALUES[];
    private static final String TAG = "nf_subtitles";
    public static final ColorMapping aqua;
    public static final ColorMapping black;
    public static final ColorMapping blue;
    public static final ColorMapping cyan;
    public static final ColorMapping fuchsia;
    public static final ColorMapping gray;
    public static final ColorMapping green;
    public static final ColorMapping lime;
    public static final ColorMapping magenta;
    public static final ColorMapping maroon;
    public static final ColorMapping navy;
    public static final ColorMapping olive;
    public static final ColorMapping orange;
    public static final ColorMapping pink;
    public static final ColorMapping purple;
    public static final ColorMapping red;
    public static final ColorMapping silver;
    public static final ColorMapping teal;
    public static final ColorMapping transparent;
    public static final ColorMapping white;
    public static final ColorMapping yellow;
    private String mColorStringValue;
    private String mLookupValue;
    private double mValue;

    private ColorMapping(String s, int i, double d, String s1, String s2)
    {
        super(s, i);
        mValue = d;
        mLookupValue = s1;
        mColorStringValue = s2;
    }

    public static String findColor(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            return null;
        }
        ColorMapping colormapping = lookup(s);
        if (colormapping != null)
        {
            return colormapping.getColorStringValue();
        } else
        {
            return parseColor(s);
        }
    }

    public static ColorMapping lookup(String s)
    {
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        ColorMapping colormapping = null;
_L4:
        return colormapping;
_L2:
        ColorMapping acolormapping[] = values();
        int j = acolormapping.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                ColorMapping colormapping1 = acolormapping[i];
                colormapping = colormapping1;
                if (colormapping1.mLookupValue.equalsIgnoreCase(s))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    private static String parseColor(String s)
    {
        Object obj;
        char ac[];
        obj = null;
        ac = s.toCharArray();
        s = obj;
        if (ac[0] != '#') goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder = new StringBuilder();
        if (ac.length != 7) goto _L4; else goto _L3
_L3:
        stringbuilder.append(ac[1]).append(ac[2]);
        stringbuilder.append(ac[3]).append(ac[4]);
        stringbuilder.append(ac[5]).append(ac[6]);
_L7:
        s = stringbuilder.toString();
_L2:
        return s;
_L4:
        s = obj;
        if (ac.length != 4) goto _L2; else goto _L5
_L5:
        stringbuilder.append(ac[1]).append(ac[1]);
        stringbuilder.append(ac[2]).append(ac[2]);
        stringbuilder.append(ac[3]).append(ac[3]);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static Integer resolveColor(Float float1, String s)
    {
        if (s == null)
        {
            return null;
        }
        float1 = (new StringBuilder()).append("#").append(OpacityMapping.opacityToHex(float1)).append(s).toString();
        int i;
        try
        {
            i = Color.parseColor(float1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_subtitles", (new StringBuilder()).append("Resolve color failed for ").append(float1).toString());
            return null;
        }
        return Integer.valueOf(i);
    }

    public static ColorMapping valueOf(String s)
    {
        return (ColorMapping)Enum.valueOf(com/netflix/mediaclient/service/player/subtitles/ColorMapping, s);
    }

    public static ColorMapping[] values()
    {
        return (ColorMapping[])$VALUES.clone();
    }

    public String getColorStringValue()
    {
        return mColorStringValue;
    }

    public String getLookupValue()
    {
        return mLookupValue;
    }

    public double getValue()
    {
        return mValue;
    }

    static 
    {
        black = new ColorMapping("black", 0, 0.0D, "black", "000000");
        silver = new ColorMapping("silver", 1, 12632256D, "silver", "c0c0c0");
        gray = new ColorMapping("gray", 2, 8421504D, "gray", "808080");
        white = new ColorMapping("white", 3, 16777215D, "white", "ffffff");
        maroon = new ColorMapping("maroon", 4, 8388608D, "maroon", "800000");
        red = new ColorMapping("red", 5, 16711680D, "red", "ff0000");
        purple = new ColorMapping("purple", 6, 8388736D, "purple", "800080");
        fuchsia = new ColorMapping("fuchsia", 7, 16711935D, "fuchsia", "ff00ff");
        magenta = new ColorMapping("magenta", 8, 16711935D, "magenta", "ff00ff");
        green = new ColorMapping("green", 9, 65280D, "green", "00ff00");
        lime = new ColorMapping("lime", 10, 65280D, "lime", "00ff00");
        olive = new ColorMapping("olive", 11, 8421376D, "olive", "808000");
        yellow = new ColorMapping("yellow", 12, 16776960D, "yellow", "ffff00");
        navy = new ColorMapping("navy", 13, 128D, "navy", "000080");
        blue = new ColorMapping("blue", 14, 255D, "blue", "0000ff");
        teal = new ColorMapping("teal", 15, 32896D, "teal", "008080");
        aqua = new ColorMapping("aqua", 16, 65535D, "aqua", "00ffff");
        cyan = new ColorMapping("cyan", 17, 65535D, "cyan", "00ffff");
        orange = new ColorMapping("orange", 18, 16753920D, "orange", "ffa500");
        pink = new ColorMapping("pink", 19, 16761035D, "pink", "ffc0cb");
        transparent = new ColorMapping("transparent", 20, -1D, "transparent", "");
        $VALUES = (new ColorMapping[] {
            black, silver, gray, white, maroon, red, purple, fuchsia, magenta, green, 
            lime, olive, yellow, navy, blue, teal, aqua, cyan, orange, pink, 
            transparent
        });
    }
}
