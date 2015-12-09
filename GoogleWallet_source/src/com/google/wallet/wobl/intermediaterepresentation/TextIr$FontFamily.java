// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.wallet.wobl.exception.WoblMalformedDocException;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            TextIr

public static final class I extends Enum
{

    private static final MONOSPACE $VALUES[];
    public static final MONOSPACE MONOSPACE;
    public static final MONOSPACE NORMAL;
    public static final MONOSPACE SANS_SERIF;
    public static final MONOSPACE SERIF;

    public static I of(String s)
        throws WoblMalformedDocException
    {
        if (s.equalsIgnoreCase("monospace"))
        {
            return MONOSPACE;
        }
        if (s.equalsIgnoreCase("sans-serif"))
        {
            return SANS_SERIF;
        }
        if (s.equalsIgnoreCase("serif"))
        {
            return SERIF;
        }
        if (s.equalsIgnoreCase("normal"))
        {
            return NORMAL;
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Received unknown font-family value: ".concat(s);
        } else
        {
            s = new String("Received unknown font-family value: ");
        }
        throw new WoblMalformedDocException(s);
    }

    public static NORMAL valueOf(String s)
    {
        return (NORMAL)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/TextIr$FontFamily, s);
    }

    public static NORMAL[] values()
    {
        return (NORMAL[])$VALUES.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        SANS_SERIF = new <init>("SANS_SERIF", 1);
        SERIF = new <init>("SERIF", 2);
        MONOSPACE = new <init>("MONOSPACE", 3);
        $VALUES = (new .VALUES[] {
            NORMAL, SANS_SERIF, SERIF, MONOSPACE
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
