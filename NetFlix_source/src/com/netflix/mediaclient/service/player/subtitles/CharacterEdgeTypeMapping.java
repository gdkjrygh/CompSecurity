// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import com.netflix.mediaclient.util.StringUtils;

public final class CharacterEdgeTypeMapping extends Enum
{

    private static final CharacterEdgeTypeMapping $VALUES[];
    public static final CharacterEdgeTypeMapping DEPRESSED;
    public static final CharacterEdgeTypeMapping DROP_SHADOW;
    public static final CharacterEdgeTypeMapping NONE;
    public static final CharacterEdgeTypeMapping RAISED;
    public static final CharacterEdgeTypeMapping UNIFORM;
    private String mLookupValue;
    private Outline.Shadow mShadow;

    private CharacterEdgeTypeMapping(String s, int i, String s1, Outline.Shadow shadow)
    {
        super(s, i);
        mLookupValue = s1;
        mShadow = shadow;
    }

    public static CharacterEdgeTypeMapping lookup(String s)
    {
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        CharacterEdgeTypeMapping characteredgetypemapping = null;
_L4:
        return characteredgetypemapping;
_L2:
        CharacterEdgeTypeMapping acharacteredgetypemapping[] = values();
        int j = acharacteredgetypemapping.length;
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
                CharacterEdgeTypeMapping characteredgetypemapping1 = acharacteredgetypemapping[i];
                characteredgetypemapping = characteredgetypemapping1;
                if (characteredgetypemapping1.mLookupValue.equalsIgnoreCase(s))
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

    public static CharacterEdgeTypeMapping valueOf(String s)
    {
        return (CharacterEdgeTypeMapping)Enum.valueOf(com/netflix/mediaclient/service/player/subtitles/CharacterEdgeTypeMapping, s);
    }

    public static CharacterEdgeTypeMapping[] values()
    {
        return (CharacterEdgeTypeMapping[])$VALUES.clone();
    }

    public String getLookupValue()
    {
        return mLookupValue;
    }

    public Outline.Shadow getShadow()
    {
        return mShadow;
    }

    public String toString()
    {
        return mLookupValue;
    }

    static 
    {
        NONE = new CharacterEdgeTypeMapping("NONE", 0, "NONE", null);
        RAISED = new CharacterEdgeTypeMapping("RAISED", 1, "RAISED", Outline.Shadow.RAISED);
        DEPRESSED = new CharacterEdgeTypeMapping("DEPRESSED", 2, "DEPRESSED", Outline.Shadow.DEPRESSED);
        UNIFORM = new CharacterEdgeTypeMapping("UNIFORM", 3, "UNIFORM", Outline.Shadow.UNIFORM);
        DROP_SHADOW = new CharacterEdgeTypeMapping("DROP_SHADOW", 4, "DROP_SHADOW", Outline.Shadow.DROP_SHADOW);
        $VALUES = (new CharacterEdgeTypeMapping[] {
            NONE, RAISED, DEPRESSED, UNIFORM, DROP_SHADOW
        });
    }
}
