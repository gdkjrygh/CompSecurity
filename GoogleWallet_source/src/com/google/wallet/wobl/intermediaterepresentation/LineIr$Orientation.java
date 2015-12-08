// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.wallet.wobl.exception.WoblMalformedDocException;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            LineIr

public static final class  extends Enum
{

    private static final VERTICAL $VALUES[];
    public static final VERTICAL HORIZONTAL;
    public static final VERTICAL VERTICAL;

    public static  of(String s)
        throws WoblMalformedDocException
    {
        if (s.equalsIgnoreCase("vertical"))
        {
            return VERTICAL;
        }
        if (s.equalsIgnoreCase("horizontal"))
        {
            return HORIZONTAL;
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Unrecognized orientation ".concat(s);
        } else
        {
            s = new String("Unrecognized orientation ");
        }
        throw new WoblMalformedDocException(s);
    }

    public static HORIZONTAL valueOf(String s)
    {
        return (HORIZONTAL)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/LineIr$Orientation, s);
    }

    public static HORIZONTAL[] values()
    {
        return (HORIZONTAL[])$VALUES.clone();
    }

    static 
    {
        HORIZONTAL = new <init>("HORIZONTAL", 0);
        VERTICAL = new <init>("VERTICAL", 1);
        $VALUES = (new .VALUES[] {
            HORIZONTAL, VERTICAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
