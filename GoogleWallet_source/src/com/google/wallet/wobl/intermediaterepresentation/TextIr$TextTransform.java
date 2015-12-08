// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.wallet.wobl.common.WoblStringUtil;
import com.google.wallet.wobl.exception.WoblMalformedDocException;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            TextIr

public static abstract class <init> extends Enum
{

    private static final LOWERCASE $VALUES[];
    public static final LOWERCASE CAPITALIZE;
    public static final LOWERCASE LOWERCASE;
    public static final LOWERCASE NONE;
    public static final LOWERCASE UPPERCASE;

    public static <init> of(String s)
        throws WoblMalformedDocException
    {
        if (s.equalsIgnoreCase("capitalize"))
        {
            return CAPITALIZE;
        }
        if (s.equalsIgnoreCase("uppercase"))
        {
            return UPPERCASE;
        }
        if (s.equalsIgnoreCase("lowercase"))
        {
            return LOWERCASE;
        }
        if (s.equalsIgnoreCase("none"))
        {
            return NONE;
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Unknown text-transform value: ".concat(s);
        } else
        {
            s = new String("Unknown text-transform value: ");
        }
        throw new WoblMalformedDocException(s);
    }

    public static NONE valueOf(String s)
    {
        return (NONE)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/TextIr$TextTransform, s);
    }

    public static NONE[] values()
    {
        return (NONE[])$VALUES.clone();
    }

    public abstract String apply(String s);

    static 
    {
        NONE = new TextIr.TextTransform("NONE", 0) {

            public final String apply(String s)
            {
                return s;
            }

        };
        CAPITALIZE = new TextIr.TextTransform("CAPITALIZE", 1) {

            public final String apply(String s)
            {
                return WoblStringUtil.toTitleCase(s);
            }

        };
        UPPERCASE = new TextIr.TextTransform("UPPERCASE", 2) {

            public final String apply(String s)
            {
                return s.toUpperCase();
            }

        };
        LOWERCASE = new TextIr.TextTransform("LOWERCASE", 3) {

            public final String apply(String s)
            {
                return s.toLowerCase();
            }

        };
        $VALUES = (new .VALUES[] {
            NONE, CAPITALIZE, UPPERCASE, LOWERCASE
        });
    }

    private _cls4(String s, int i)
    {
        super(s, i);
    }

    _cls4(String s, int i, _cls4 _pcls4)
    {
        this(s, i);
    }
}
