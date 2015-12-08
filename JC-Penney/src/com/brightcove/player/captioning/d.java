// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;


// Referenced classes of package com.brightcove.player.captioning:
//            BrightcoveCaptionStyle, e

final class d extends BrightcoveCaptionStyle
{

    private final int a;
    private final String b;
    private final String c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    private d(int l, String s, String s1, int i1, int j1, int k1, int l1, 
            int i2, int j2, int k2, int l2)
    {
        a = l;
        if (s == null)
        {
            throw new NullPointerException("Null fontSize");
        }
        b = s;
        if (s1 == null)
        {
            throw new NullPointerException("Null typeface");
        } else
        {
            c = s1;
            d = i1;
            e = j1;
            f = k1;
            g = l1;
            h = i2;
            i = j2;
            j = k2;
            k = l2;
            return;
        }
    }

    d(int l, String s, String s1, int i1, int j1, int k1, int l1, 
            int i2, int j2, int k2, int l2, e e1)
    {
        this(l, s, s1, i1, j1, k1, l1, i2, j2, k2, l2);
    }

    public int backgroundColor()
    {
        return h;
    }

    public int backgroundOpacity()
    {
        return i;
    }

    public int edgeColor()
    {
        return g;
    }

    public int edgeType()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof BrightcoveCaptionStyle)
            {
                if (a != ((BrightcoveCaptionStyle) (obj = (BrightcoveCaptionStyle)obj)).preset() || !b.equals(((BrightcoveCaptionStyle) (obj)).fontSize()) || !c.equals(((BrightcoveCaptionStyle) (obj)).typeface()) || d != ((BrightcoveCaptionStyle) (obj)).foregroundColor() || e != ((BrightcoveCaptionStyle) (obj)).foregroundOpacity() || f != ((BrightcoveCaptionStyle) (obj)).edgeType() || g != ((BrightcoveCaptionStyle) (obj)).edgeColor() || h != ((BrightcoveCaptionStyle) (obj)).backgroundColor() || i != ((BrightcoveCaptionStyle) (obj)).backgroundOpacity() || j != ((BrightcoveCaptionStyle) (obj)).windowColor() || k != ((BrightcoveCaptionStyle) (obj)).windowOpacity())
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

    public String fontSize()
    {
        return b;
    }

    public int foregroundColor()
    {
        return d;
    }

    public int foregroundOpacity()
    {
        return e;
    }

    public int hashCode()
    {
        return ((((((((((a ^ 0xf4243) * 0xf4243 ^ b.hashCode()) * 0xf4243 ^ c.hashCode()) * 0xf4243 ^ d) * 0xf4243 ^ e) * 0xf4243 ^ f) * 0xf4243 ^ g) * 0xf4243 ^ h) * 0xf4243 ^ i) * 0xf4243 ^ j) * 0xf4243 ^ k;
    }

    public int preset()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append("BrightcoveCaptionStyle{preset=").append(a).append(", ").append("fontSize=").append(b).append(", ").append("typeface=").append(c).append(", ").append("foregroundColor=").append(d).append(", ").append("foregroundOpacity=").append(e).append(", ").append("edgeType=").append(f).append(", ").append("edgeColor=").append(g).append(", ").append("backgroundColor=").append(h).append(", ").append("backgroundOpacity=").append(i).append(", ").append("windowColor=").append(j).append(", ").append("windowOpacity=").append(k).append("}").toString();
    }

    public String typeface()
    {
        return c;
    }

    public int windowColor()
    {
        return j;
    }

    public int windowOpacity()
    {
        return k;
    }
}
