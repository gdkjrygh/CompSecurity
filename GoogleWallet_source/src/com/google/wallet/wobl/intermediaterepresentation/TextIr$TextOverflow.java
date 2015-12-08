// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.wallet.wobl.exception.WoblMalformedDocException;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            TextIr

public static final class  extends Enum
{

    private static final ELLIPSIS $VALUES[];
    public static final ELLIPSIS CLIP;
    public static final ELLIPSIS ELLIPSIS;

    public static  of(String s)
        throws WoblMalformedDocException
    {
        if (s.equalsIgnoreCase("ellipsis"))
        {
            return ELLIPSIS;
        }
        if (s.equalsIgnoreCase("clip"))
        {
            return CLIP;
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Unknown text-overflow value: ".concat(s);
        } else
        {
            s = new String("Unknown text-overflow value: ");
        }
        throw new WoblMalformedDocException(s);
    }

    public static CLIP valueOf(String s)
    {
        return (CLIP)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/TextIr$TextOverflow, s);
    }

    public static CLIP[] values()
    {
        return (CLIP[])$VALUES.clone();
    }

    static 
    {
        CLIP = new <init>("CLIP", 0);
        ELLIPSIS = new <init>("ELLIPSIS", 1);
        $VALUES = (new .VALUES[] {
            CLIP, ELLIPSIS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
