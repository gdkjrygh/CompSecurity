// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.wallet.wobl.exception.WoblMalformedDocException;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            TextIr

public static final class  extends Enum
{

    private static final ITALIC $VALUES[];
    public static final ITALIC ITALIC;
    public static final ITALIC NORMAL;

    public static  of(String s)
        throws WoblMalformedDocException
    {
        if (s.equalsIgnoreCase("italic"))
        {
            return ITALIC;
        }
        if (s.equalsIgnoreCase("normal"))
        {
            return NORMAL;
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Received unknown font-style value: ".concat(s);
        } else
        {
            s = new String("Received unknown font-style value: ");
        }
        throw new WoblMalformedDocException(s);
    }

    public static NORMAL valueOf(String s)
    {
        return (NORMAL)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/TextIr$FontStyle, s);
    }

    public static NORMAL[] values()
    {
        return (NORMAL[])$VALUES.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        ITALIC = new <init>("ITALIC", 1);
        $VALUES = (new .VALUES[] {
            NORMAL, ITALIC
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
