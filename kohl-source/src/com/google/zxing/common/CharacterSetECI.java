// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import com.google.zxing.FormatException;
import java.util.HashMap;
import java.util.Map;

public final class CharacterSetECI extends Enum
{

    private static final CharacterSetECI $VALUES[];
    public static final CharacterSetECI ASCII;
    public static final CharacterSetECI Big5;
    public static final CharacterSetECI Cp1250;
    public static final CharacterSetECI Cp1251;
    public static final CharacterSetECI Cp1252;
    public static final CharacterSetECI Cp1256;
    public static final CharacterSetECI Cp437;
    public static final CharacterSetECI EUC_KR;
    public static final CharacterSetECI GB18030;
    public static final CharacterSetECI ISO8859_1;
    public static final CharacterSetECI ISO8859_10;
    public static final CharacterSetECI ISO8859_11;
    public static final CharacterSetECI ISO8859_13;
    public static final CharacterSetECI ISO8859_14;
    public static final CharacterSetECI ISO8859_15;
    public static final CharacterSetECI ISO8859_16;
    public static final CharacterSetECI ISO8859_2;
    public static final CharacterSetECI ISO8859_3;
    public static final CharacterSetECI ISO8859_4;
    public static final CharacterSetECI ISO8859_5;
    public static final CharacterSetECI ISO8859_6;
    public static final CharacterSetECI ISO8859_7;
    public static final CharacterSetECI ISO8859_8;
    public static final CharacterSetECI ISO8859_9;
    private static final Map NAME_TO_ECI;
    public static final CharacterSetECI SJIS;
    public static final CharacterSetECI UTF8;
    public static final CharacterSetECI UnicodeBigUnmarked;
    private static final Map VALUE_TO_ECI;
    private final String otherEncodingNames[];
    private final int values[];

    private CharacterSetECI(String s, int i, int j)
    {
        this(s, i, new int[] {
            j
        }, new String[0]);
    }

    private transient CharacterSetECI(String s, int i, int j, String as[])
    {
        super(s, i);
        values = (new int[] {
            j
        });
        otherEncodingNames = as;
    }

    private transient CharacterSetECI(String s, int i, int ai[], String as[])
    {
        super(s, i);
        values = ai;
        otherEncodingNames = as;
    }

    public static CharacterSetECI getCharacterSetECIByName(String s)
    {
        return (CharacterSetECI)NAME_TO_ECI.get(s);
    }

    public static CharacterSetECI getCharacterSetECIByValue(int i)
        throws FormatException
    {
        if (i < 0 || i >= 900)
        {
            throw FormatException.getFormatInstance();
        } else
        {
            return (CharacterSetECI)VALUE_TO_ECI.get(Integer.valueOf(i));
        }
    }

    public static CharacterSetECI valueOf(String s)
    {
        return (CharacterSetECI)Enum.valueOf(com/google/zxing/common/CharacterSetECI, s);
    }

    public static CharacterSetECI[] values()
    {
        return (CharacterSetECI[])$VALUES.clone();
    }

    public int getValue()
    {
        return values[0];
    }

    static 
    {
        Cp437 = new CharacterSetECI("Cp437", 0, new int[] {
            0, 2
        }, new String[0]);
        ISO8859_1 = new CharacterSetECI("ISO8859_1", 1, new int[] {
            1, 3
        }, new String[] {
            "ISO-8859-1"
        });
        ISO8859_2 = new CharacterSetECI("ISO8859_2", 2, 4, new String[] {
            "ISO-8859-2"
        });
        ISO8859_3 = new CharacterSetECI("ISO8859_3", 3, 5, new String[] {
            "ISO-8859-3"
        });
        ISO8859_4 = new CharacterSetECI("ISO8859_4", 4, 6, new String[] {
            "ISO-8859-4"
        });
        ISO8859_5 = new CharacterSetECI("ISO8859_5", 5, 7, new String[] {
            "ISO-8859-5"
        });
        ISO8859_6 = new CharacterSetECI("ISO8859_6", 6, 8, new String[] {
            "ISO-8859-6"
        });
        ISO8859_7 = new CharacterSetECI("ISO8859_7", 7, 9, new String[] {
            "ISO-8859-7"
        });
        ISO8859_8 = new CharacterSetECI("ISO8859_8", 8, 10, new String[] {
            "ISO-8859-8"
        });
        ISO8859_9 = new CharacterSetECI("ISO8859_9", 9, 11, new String[] {
            "ISO-8859-9"
        });
        ISO8859_10 = new CharacterSetECI("ISO8859_10", 10, 12, new String[] {
            "ISO-8859-10"
        });
        ISO8859_11 = new CharacterSetECI("ISO8859_11", 11, 13, new String[] {
            "ISO-8859-11"
        });
        ISO8859_13 = new CharacterSetECI("ISO8859_13", 12, 15, new String[] {
            "ISO-8859-13"
        });
        ISO8859_14 = new CharacterSetECI("ISO8859_14", 13, 16, new String[] {
            "ISO-8859-14"
        });
        ISO8859_15 = new CharacterSetECI("ISO8859_15", 14, 17, new String[] {
            "ISO-8859-15"
        });
        ISO8859_16 = new CharacterSetECI("ISO8859_16", 15, 18, new String[] {
            "ISO-8859-16"
        });
        SJIS = new CharacterSetECI("SJIS", 16, 20, new String[] {
            "Shift_JIS"
        });
        Cp1250 = new CharacterSetECI("Cp1250", 17, 21, new String[] {
            "windows-1250"
        });
        Cp1251 = new CharacterSetECI("Cp1251", 18, 22, new String[] {
            "windows-1251"
        });
        Cp1252 = new CharacterSetECI("Cp1252", 19, 23, new String[] {
            "windows-1252"
        });
        Cp1256 = new CharacterSetECI("Cp1256", 20, 24, new String[] {
            "windows-1256"
        });
        UnicodeBigUnmarked = new CharacterSetECI("UnicodeBigUnmarked", 21, 25, new String[] {
            "UTF-16BE", "UnicodeBig"
        });
        UTF8 = new CharacterSetECI("UTF8", 22, 26, new String[] {
            "UTF-8"
        });
        ASCII = new CharacterSetECI("ASCII", 23, new int[] {
            27, 170
        }, new String[] {
            "US-ASCII"
        });
        Big5 = new CharacterSetECI("Big5", 24, 28);
        GB18030 = new CharacterSetECI("GB18030", 25, 29, new String[] {
            "GB2312", "EUC_CN", "GBK"
        });
        EUC_KR = new CharacterSetECI("EUC_KR", 26, 30, new String[] {
            "EUC-KR"
        });
        $VALUES = (new CharacterSetECI[] {
            Cp437, ISO8859_1, ISO8859_2, ISO8859_3, ISO8859_4, ISO8859_5, ISO8859_6, ISO8859_7, ISO8859_8, ISO8859_9, 
            ISO8859_10, ISO8859_11, ISO8859_13, ISO8859_14, ISO8859_15, ISO8859_16, SJIS, Cp1250, Cp1251, Cp1252, 
            Cp1256, UnicodeBigUnmarked, UTF8, ASCII, Big5, GB18030, EUC_KR
        });
        VALUE_TO_ECI = new HashMap();
        NAME_TO_ECI = new HashMap();
        CharacterSetECI acharacterseteci[] = values();
        int l = acharacterseteci.length;
        for (int i = 0; i < l; i++)
        {
            CharacterSetECI characterseteci = acharacterseteci[i];
            Object aobj[] = characterseteci.values;
            int i1 = aobj.length;
            for (int j = 0; j < i1; j++)
            {
                int j1 = aobj[j];
                VALUE_TO_ECI.put(Integer.valueOf(j1), characterseteci);
            }

            NAME_TO_ECI.put(characterseteci.name(), characterseteci);
            aobj = characterseteci.otherEncodingNames;
            i1 = aobj.length;
            for (int k = 0; k < i1; k++)
            {
                String s = aobj[k];
                NAME_TO_ECI.put(s, characterseteci);
            }

        }

    }
}
