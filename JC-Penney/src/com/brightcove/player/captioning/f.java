// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;

import java.util.BitSet;

// Referenced classes of package com.brightcove.player.captioning:
//            d, BrightcoveCaptionStyle

final class f
    implements BrightcoveCaptionStyle.Builder
{

    private final BitSet a = new BitSet();
    private int b;
    private String c;
    private String d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    f()
    {
    }

    public BrightcoveCaptionStyle.Builder backgroundColor(int i1)
    {
        i = i1;
        a.set(7);
        return this;
    }

    public BrightcoveCaptionStyle.Builder backgroundOpacity(int i1)
    {
        j = i1;
        a.set(8);
        return this;
    }

    public BrightcoveCaptionStyle build()
    {
        int i1 = 0;
        if (a.cardinality() < 11)
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (; i1 < 11; i1++)
            {
                if (!a.get(i1))
                {
                    stringbuilder.append(' ').append((new String[] {
                        "preset", "fontSize", "typeface", "foregroundColor", "foregroundOpacity", "edgeType", "edgeColor", "backgroundColor", "backgroundOpacity", "windowColor", 
                        "windowOpacity"
                    })[i1]);
                }
            }

            throw new IllegalStateException((new StringBuilder()).append("Missing required properties:").append(stringbuilder).toString());
        } else
        {
            d d1 = new d(b, c, d, e, f, g, h, i, j, k, l, null);
            d1.validate();
            return d1;
        }
    }

    public BrightcoveCaptionStyle.Builder edgeColor(int i1)
    {
        h = i1;
        a.set(6);
        return this;
    }

    public BrightcoveCaptionStyle.Builder edgeType(int i1)
    {
        g = i1;
        a.set(5);
        return this;
    }

    public BrightcoveCaptionStyle.Builder fontSize(String s)
    {
        c = s;
        a.set(1);
        return this;
    }

    public BrightcoveCaptionStyle.Builder foregroundColor(int i1)
    {
        e = i1;
        a.set(3);
        return this;
    }

    public BrightcoveCaptionStyle.Builder foregroundOpacity(int i1)
    {
        f = i1;
        a.set(4);
        return this;
    }

    public BrightcoveCaptionStyle.Builder preset(int i1)
    {
        b = i1;
        a.set(0);
        return this;
    }

    public BrightcoveCaptionStyle.Builder typeface(String s)
    {
        d = s;
        a.set(2);
        return this;
    }

    public BrightcoveCaptionStyle.Builder windowColor(int i1)
    {
        k = i1;
        a.set(9);
        return this;
    }

    public BrightcoveCaptionStyle.Builder windowOpacity(int i1)
    {
        l = i1;
        a.set(10);
        return this;
    }
}
