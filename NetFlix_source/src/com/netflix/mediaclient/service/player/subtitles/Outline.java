// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.player.subtitles:
//            CharacterEdgeTypeMapping, ColorMapping

public final class Outline
{
    public static class Shadow
    {

        public static final Shadow DEPRESSED = new Shadow(1.0F, 0, 2);
        public static final Shadow DROP_SHADOW = new Shadow(1.0F, 2, 2);
        public static final Shadow RAISED = new Shadow(1.0F, 0, -2);
        public static final Shadow UNIFORM = new Shadow(0.0F, 0, 0);
        public final int dx;
        public final int dy;
        public final float radius;


        private Shadow(float f, int i, int j)
        {
            radius = f;
            dx = i;
            dy = j;
        }
    }


    private static Integer DEFAULT_OUTLINE_BLUR = Integer.valueOf(0);
    private static Integer DEFAULT_OUTLINE_WIDTH = Integer.valueOf(2);
    private String mEdgeColor;
    private CharacterEdgeTypeMapping mEdgeType;
    private Integer mOutlineBlur;
    private Integer mOutlineWidth;

    private Outline()
    {
        mEdgeType = CharacterEdgeTypeMapping.NONE;
    }

    public Outline(CharacterEdgeTypeMapping characteredgetypemapping, String s, Integer integer, Integer integer1)
    {
        mEdgeType = CharacterEdgeTypeMapping.NONE;
        mEdgeType = characteredgetypemapping;
        mEdgeColor = s;
        mOutlineWidth = integer;
        mOutlineBlur = integer1;
    }

    static Outline createInstance(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            return null;
        }
        Outline outline = new Outline();
        if (CharacterEdgeTypeMapping.NONE.getLookupValue().equalsIgnoreCase(s))
        {
            outline.mEdgeType = CharacterEdgeTypeMapping.NONE;
        } else
        {
            String as[] = StringUtils.safeSplit(s, " ");
            int i = 0;
            if (StringUtils.startsWithDigit(s))
            {
                if (as.length < 1)
                {
                    return null;
                }
            } else
            {
                if (as.length < 2)
                {
                    return null;
                }
                i = 1;
                outline.mEdgeColor = ColorMapping.findColor(as[0]);
            }
            outline.mOutlineWidth = StringUtils.safeParsePixelSize(as[i]);
            i++;
            if (i < as.length)
            {
                outline.mOutlineBlur = StringUtils.safeParsePixelSize(as[i]);
            }
        }
        if (outline.mOutlineBlur != null)
        {
            outline.mEdgeType = CharacterEdgeTypeMapping.DROP_SHADOW;
            return outline;
        } else
        {
            outline.mEdgeType = CharacterEdgeTypeMapping.UNIFORM;
            return outline;
        }
    }

    public static Outline getDefaultOutline()
    {
        return new Outline(CharacterEdgeTypeMapping.UNIFORM, "000000", DEFAULT_OUTLINE_WIDTH, DEFAULT_OUTLINE_BLUR);
    }

    public String getEdgeColor()
    {
        return mEdgeColor;
    }

    public CharacterEdgeTypeMapping getEdgeType()
    {
        return mEdgeType;
    }

    public Integer getOutlineBlur()
    {
        return mOutlineBlur;
    }

    public Integer getOutlineWidth()
    {
        return mOutlineWidth;
    }

    public Shadow getShadow()
    {
        if (mEdgeType == null)
        {
            return null;
        } else
        {
            return mEdgeType.getShadow();
        }
    }

    public boolean isOutlineRequired()
    {
        return !CharacterEdgeTypeMapping.NONE.equals(mEdgeType) && mEdgeType != null;
    }

    public boolean isStrokeTextRequired()
    {
        return CharacterEdgeTypeMapping.UNIFORM.equals(mEdgeType);
    }

    public void setEdgeColor(String s)
    {
        mEdgeColor = s;
    }

    public void setEdgeType(CharacterEdgeTypeMapping characteredgetypemapping)
    {
        mEdgeType = characteredgetypemapping;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Outline [mEdgeType=").append(mEdgeType).append(", mEdgeColor=").append(mEdgeColor).append(", mOutlineWidth=").append(mOutlineWidth).append(", mOutlineBlur=").append(mOutlineBlur).append("]").toString();
    }

}
