// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import android.graphics.Typeface;
import com.netflix.mediaclient.util.StringUtils;

public final class FontFamilyMapping extends Enum
{

    private static final FontFamilyMapping $VALUES[];
    public static final FontFamilyMapping casual;
    public static final FontFamilyMapping cursive;
    public static final FontFamilyMapping defaultType;
    public static final FontFamilyMapping monospace;
    public static final FontFamilyMapping monospaceSansSerif;
    public static final FontFamilyMapping monospaceSansSerifApi;
    public static final FontFamilyMapping monospaceSerif;
    public static final FontFamilyMapping monospaceSerifApi;
    public static final FontFamilyMapping proportionalSansSerif;
    public static final FontFamilyMapping proportionalSansSerifApi;
    public static final FontFamilyMapping proportionalSerif;
    public static final FontFamilyMapping proportionalSerifApi;
    public static final FontFamilyMapping sansSerif;
    public static final FontFamilyMapping serif;
    public static final FontFamilyMapping smallCapitals;
    public static final FontFamilyMapping smallCapitalsApi;
    private String mLookup;
    private Typeface mValue;

    private FontFamilyMapping(String s, int i, Typeface typeface, String s1)
    {
        super(s, i);
        mValue = typeface;
        mLookup = s1;
    }

    public static FontFamilyMapping lookup(String s)
    {
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        FontFamilyMapping fontfamilymapping = null;
_L4:
        return fontfamilymapping;
_L2:
        FontFamilyMapping afontfamilymapping[] = values();
        int j = afontfamilymapping.length;
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
                FontFamilyMapping fontfamilymapping1 = afontfamilymapping[i];
                fontfamilymapping = fontfamilymapping1;
                if (fontfamilymapping1.getLookupValue().equalsIgnoreCase(s))
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

    public static FontFamilyMapping valueOf(String s)
    {
        return (FontFamilyMapping)Enum.valueOf(com/netflix/mediaclient/service/player/subtitles/FontFamilyMapping, s);
    }

    public static FontFamilyMapping[] values()
    {
        return (FontFamilyMapping[])$VALUES.clone();
    }

    public String getLookupValue()
    {
        return mLookup;
    }

    public Typeface getTypeface()
    {
        return mValue;
    }

    static 
    {
        defaultType = new FontFamilyMapping("defaultType", 0, Typeface.SANS_SERIF, "default");
        monospaceSansSerif = new FontFamilyMapping("monospaceSansSerif", 1, Typeface.MONOSPACE, "monospaceSansSerif");
        monospaceSansSerifApi = new FontFamilyMapping("monospaceSansSerifApi", 2, Typeface.MONOSPACE, "monospaced_sans_serif");
        monospaceSerif = new FontFamilyMapping("monospaceSerif", 3, Typeface.MONOSPACE, "monospaceSerif");
        monospaceSerifApi = new FontFamilyMapping("monospaceSerifApi", 4, Typeface.MONOSPACE, "monospaced_serif");
        proportionalSansSerif = new FontFamilyMapping("proportionalSansSerif", 5, Typeface.SANS_SERIF, "proportionalSansSerif");
        proportionalSansSerifApi = new FontFamilyMapping("proportionalSansSerifApi", 6, Typeface.SANS_SERIF, "proportional_sans_serif");
        proportionalSerif = new FontFamilyMapping("proportionalSerif", 7, Typeface.SERIF, "proportionalSerif");
        proportionalSerifApi = new FontFamilyMapping("proportionalSerifApi", 8, Typeface.SERIF, "proportional_serif");
        casual = new FontFamilyMapping("casual", 9, Typeface.SANS_SERIF, "casual");
        cursive = new FontFamilyMapping("cursive", 10, Typeface.SANS_SERIF, "cursive");
        smallCapitals = new FontFamilyMapping("smallCapitals", 11, Typeface.SANS_SERIF, "smallCapitals");
        smallCapitalsApi = new FontFamilyMapping("smallCapitalsApi", 12, Typeface.SANS_SERIF, "small_capitals");
        monospace = new FontFamilyMapping("monospace", 13, Typeface.MONOSPACE, "monospace");
        sansSerif = new FontFamilyMapping("sansSerif", 14, Typeface.SANS_SERIF, "sansSerif");
        serif = new FontFamilyMapping("serif", 15, Typeface.SERIF, "serif");
        $VALUES = (new FontFamilyMapping[] {
            defaultType, monospaceSansSerif, monospaceSansSerifApi, monospaceSerif, monospaceSerifApi, proportionalSansSerif, proportionalSansSerifApi, proportionalSerif, proportionalSerifApi, casual, 
            cursive, smallCapitals, smallCapitalsApi, monospace, sansSerif, serif
        });
    }
}
