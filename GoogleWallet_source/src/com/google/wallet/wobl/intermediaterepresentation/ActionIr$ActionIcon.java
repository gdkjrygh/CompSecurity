// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.wallet.wobl.exception.WoblMalformedDocException;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            ActionIr

public static final class iconName extends Enum
{

    private static final RECEIPT $VALUES[];
    public static final RECEIPT CHECKMARK;
    public static final RECEIPT LINK;
    public static final RECEIPT MAIL;
    public static final RECEIPT MAP;
    public static final RECEIPT NAVIGATION;
    public static final RECEIPT NONE;
    public static final RECEIPT PHONE;
    public static final RECEIPT RECEIPT;
    private String iconName;

    public static iconName of(String s)
        throws WoblMalformedDocException
    {
        iconName aiconname[] = values();
        int j = aiconname.length;
        for (int i = 0; i < j; i++)
        {
            iconName iconname = aiconname[i];
            if (iconname.iconName.equalsIgnoreCase(s))
            {
                return iconname;
            }
        }

        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Uncognized icon type in Action: ".concat(s);
        } else
        {
            s = new String("Uncognized icon type in Action: ");
        }
        throw new WoblMalformedDocException(s);
    }

    public static iconName valueOf(String s)
    {
        return (iconName)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/ActionIr$ActionIcon, s);
    }

    public static iconName[] values()
    {
        return (iconName[])$VALUES.clone();
    }

    static 
    {
        CHECKMARK = new <init>("CHECKMARK", 0, "checkmark");
        LINK = new <init>("LINK", 1, "link");
        MAIL = new <init>("MAIL", 2, "mail");
        MAP = new <init>("MAP", 3, "map");
        NAVIGATION = new <init>("NAVIGATION", 4, "navigation");
        NONE = new <init>("NONE", 5, "none");
        PHONE = new <init>("PHONE", 6, "phone");
        RECEIPT = new <init>("RECEIPT", 7, "receipt");
        $VALUES = (new .VALUES[] {
            CHECKMARK, LINK, MAIL, MAP, NAVIGATION, NONE, PHONE, RECEIPT
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        iconName = s1;
    }
}
