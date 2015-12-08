// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import java.util.BitSet;

public final class cd extends BrightcoveCaptionFormat
{
    public static final class a
        implements com.brightcove.player.captioning.BrightcoveCaptionFormat.Builder
    {

        private final BitSet a = new BitSet();
        private String b;
        private String c;

        public final BrightcoveCaptionFormat build()
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

                throw new IllegalStateException((new StringBuilder("Missing required properties:")).append(stringbuilder).toString());
            } else
            {
                cd cd1 = new cd(b, c, (byte)0);
                cd1.validate();
                return cd1;
            }
        }

        public final com.brightcove.player.captioning.BrightcoveCaptionFormat.Builder language(String s)
        {
            c = s;
            a.set(1);
            return this;
        }

        public final com.brightcove.player.captioning.BrightcoveCaptionFormat.Builder type(String s)
        {
            b = s;
            a.set(0);
            return this;
        }

        public a()
        {
        }
    }


    private final String a;
    private final String b;

    private cd(String s, String s1)
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

    cd(String s, String s1, byte byte0)
    {
        this(s, s1);
    }

    public final boolean equals(Object obj)
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

    public final int hashCode()
    {
        return (a.hashCode() ^ 0xf4243) * 0xf4243 ^ b.hashCode();
    }

    public final String language()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder("BrightcoveCaptionFormat{type=")).append(a).append(", language=").append(b).append("}").toString();
    }

    public final String type()
    {
        return a;
    }
}
