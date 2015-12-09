// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;


// Referenced classes of package com.brightcove.player.captioning:
//            BrightcoveCaptionFormat, b

final class a extends BrightcoveCaptionFormat
{

    private final String a;
    private final String b;

    private a(String s, String s1)
    {
        if (s == null)
        {
            throw new NullPointerException("Null type");
        }
        a = s;
        if (s1 == null)
        {
            throw new NullPointerException("Null language");
        } else
        {
            b = s1;
            return;
        }
    }

    a(String s, String s1, b b1)
    {
        this(s, s1);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof BrightcoveCaptionFormat)
            {
                if (!a.equals(((BrightcoveCaptionFormat) (obj = (BrightcoveCaptionFormat)obj)).type()) || !b.equals(((BrightcoveCaptionFormat) (obj)).language()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (a.hashCode() ^ 0xf4243) * 0xf4243 ^ b.hashCode();
    }

    public String language()
    {
        return b;
    }

    public String toString()
    {
        return (new StringBuilder()).append("BrightcoveCaptionFormat{type=").append(a).append(", ").append("language=").append(b).append("}").toString();
    }

    public String type()
    {
        return a;
    }
}
