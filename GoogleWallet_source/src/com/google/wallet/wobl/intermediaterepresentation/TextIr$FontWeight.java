// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.wallet.wobl.exception.WoblMalformedDocException;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            TextIr

public static final class I extends Enum
{

    private static final BOLD $VALUES[];
    public static final BOLD BOLD;
    public static final BOLD LIGHT;
    public static final BOLD NORMAL;

    public static I of(String s)
        throws WoblMalformedDocException
    {
        if (s.equalsIgnoreCase("bold"))
        {
            return BOLD;
        }
        if (s.equalsIgnoreCase("normal"))
        {
            return NORMAL;
        }
        if (s.equalsIgnoreCase("light"))
        {
            return LIGHT;
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Received unknown font-weight value: ".concat(s);
        } else
        {
            s = new String("Received unknown font-weight value: ");
        }
        throw new WoblMalformedDocException(s);
    }

    public static LIGHT valueOf(String s)
    {
        return (LIGHT)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/TextIr$FontWeight, s);
    }

    public static LIGHT[] values()
    {
        return (LIGHT[])$VALUES.clone();
    }

    static 
    {
        LIGHT = new <init>("LIGHT", 0);
        NORMAL = new <init>("NORMAL", 1);
        BOLD = new <init>("BOLD", 2);
        $VALUES = (new .VALUES[] {
            LIGHT, NORMAL, BOLD
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
