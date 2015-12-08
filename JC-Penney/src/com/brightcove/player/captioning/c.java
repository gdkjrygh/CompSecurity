// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;

import java.util.BitSet;

// Referenced classes of package com.brightcove.player.captioning:
//            a, BrightcoveCaptionFormat

final class c
    implements BrightcoveCaptionFormat.Builder
{

    private final BitSet a = new BitSet();
    private String b;
    private String c;

    c()
    {
    }

    public BrightcoveCaptionFormat build()
    {
        int i = 0;
        if (a.cardinality() < 2)
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (; i < 2; i++)
            {
                if (!a.get(i))
                {
                    stringbuilder.append(' ').append((new String[] {
                        "type", "language"
                    })[i]);
                }
            }

            throw new IllegalStateException((new StringBuilder()).append("Missing required properties:").append(stringbuilder).toString());
        } else
        {
            a a1 = new a(b, c, null);
            a1.validate();
            return a1;
        }
    }

    public BrightcoveCaptionFormat.Builder language(String s)
    {
        c = s;
        a.set(1);
        return this;
    }

    public BrightcoveCaptionFormat.Builder type(String s)
    {
        b = s;
        a.set(0);
        return this;
    }
}
