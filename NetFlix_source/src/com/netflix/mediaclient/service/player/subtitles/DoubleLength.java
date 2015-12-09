// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.SubtitleUtils;

// Referenced classes of package com.netflix.mediaclient.service.player.subtitles:
//            CellResolution

public class DoubleLength
{

    public static final DoubleLength SIMPLE_SDH_EXTENT = new DoubleLength(10F, 10F);
    public static final DoubleLength ZERO = new DoubleLength(0.0F, 0.0F);
    private float mFirst;
    private float mSecond;

    private DoubleLength()
    {
    }

    private DoubleLength(float f, float f1)
    {
        mFirst = f;
        mSecond = f1;
    }

    public static boolean canUse(DoubleLength doublelength)
    {
        return doublelength != null && doublelength.isValid();
    }

    public static DoubleLength createInstance(String s, CellResolution cellresolution)
    {
        if (!StringUtils.isEmpty(s))
        {
            if ((s = StringUtils.safeSplit(s, " ")) != null && s.length >= 2)
            {
                int i = 0;
                if (cellresolution != null)
                {
                    i = cellresolution.getWidthCount();
                }
                cellresolution = SubtitleUtils.parseMargin(s[0], i);
                s = SubtitleUtils.parseMargin(s[1], i);
                if (cellresolution != null && s != null)
                {
                    return new DoubleLength(cellresolution.floatValue(), s.floatValue());
                }
            }
        }
        return null;
    }

    private boolean valid(float f)
    {
        return f > 0.0F && f <= 1.0F;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof DoubleLength))
            {
                return false;
            }
            obj = (DoubleLength)obj;
            if (Float.floatToIntBits(mFirst) != Float.floatToIntBits(((DoubleLength) (obj)).mFirst))
            {
                return false;
            }
            if (Float.floatToIntBits(mSecond) != Float.floatToIntBits(((DoubleLength) (obj)).mSecond))
            {
                return false;
            }
        }
        return true;
    }

    public float getFirstLength()
    {
        return mFirst;
    }

    public float getSecondLength()
    {
        return mSecond;
    }

    public int hashCode()
    {
        return (Float.floatToIntBits(mFirst) + 31) * 31 + Float.floatToIntBits(mSecond);
    }

    public boolean isValid()
    {
        return valid(mFirst) && valid(mSecond);
    }

    public String toString()
    {
        return (new StringBuilder()).append("DoubleLength [mFirst=").append(mFirst).append(", mSecond=").append(mSecond).append("]").toString();
    }

}
