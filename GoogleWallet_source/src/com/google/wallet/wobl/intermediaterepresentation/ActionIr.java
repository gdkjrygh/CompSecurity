// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.common.base.Optional;
import com.google.wallet.wobl.exception.WoblMalformedDocException;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            TextIr

public class ActionIr extends TextIr
{
    public static final class ActionIcon extends Enum
    {

        private static final ActionIcon $VALUES[];
        public static final ActionIcon CHECKMARK;
        public static final ActionIcon LINK;
        public static final ActionIcon MAIL;
        public static final ActionIcon MAP;
        public static final ActionIcon NAVIGATION;
        public static final ActionIcon NONE;
        public static final ActionIcon PHONE;
        public static final ActionIcon RECEIPT;
        private String iconName;

        public static ActionIcon of(String s)
            throws WoblMalformedDocException
        {
            ActionIcon aactionicon[] = values();
            int j = aactionicon.length;
            for (int i = 0; i < j; i++)
            {
                ActionIcon actionicon = aactionicon[i];
                if (actionicon.iconName.equalsIgnoreCase(s))
                {
                    return actionicon;
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

        public static ActionIcon valueOf(String s)
        {
            return (ActionIcon)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/ActionIr$ActionIcon, s);
        }

        public static ActionIcon[] values()
        {
            return (ActionIcon[])$VALUES.clone();
        }

        static 
        {
            CHECKMARK = new ActionIcon("CHECKMARK", 0, "checkmark");
            LINK = new ActionIcon("LINK", 1, "link");
            MAIL = new ActionIcon("MAIL", 2, "mail");
            MAP = new ActionIcon("MAP", 3, "map");
            NAVIGATION = new ActionIcon("NAVIGATION", 4, "navigation");
            NONE = new ActionIcon("NONE", 5, "none");
            PHONE = new ActionIcon("PHONE", 6, "phone");
            RECEIPT = new ActionIcon("RECEIPT", 7, "receipt");
            $VALUES = (new ActionIcon[] {
                CHECKMARK, LINK, MAIL, MAP, NAVIGATION, NONE, PHONE, RECEIPT
            });
        }

        private ActionIcon(String s, int i, String s1)
        {
            super(s, i);
            iconName = s1;
        }
    }


    private Optional icon;

    public ActionIr()
    {
    }

    public Optional getIcon()
    {
        return icon;
    }

    public Optional getMaxLines()
    {
        return Optional.of(Integer.valueOf(1));
    }

    public void setIcon(ActionIcon actionicon)
    {
        icon = Optional.of(actionicon);
    }
}
