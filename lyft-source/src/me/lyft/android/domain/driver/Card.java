// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.driver;

import java.util.List;
import me.lyft.android.common.INullable;

// Referenced classes of package me.lyft.android.domain.driver:
//            ExpressPayCard

public class Card
    implements INullable
{

    List dials;
    String footer;
    String infoUrl;
    Style style;
    String subTitle;
    String title;

    public Card(Style style1, String s, String s1, String s2, List list, String s3)
    {
        style = style1;
        title = s;
        subTitle = s1;
        infoUrl = s2;
        dials = list;
        footer = s3;
    }

    public static Card empty()
    {
        return NullCard.getInstance();
    }

    public List getDials()
    {
        return dials;
    }

    public String getFooter()
    {
        return footer;
    }

    public String getInfoUrl()
    {
        return infoUrl;
    }

    public Style getStyle()
    {
        return style;
    }

    public String getSubTitle()
    {
        return subTitle;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isExpressPayCard()
    {
        return this instanceof ExpressPayCard;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullCard extends Card
    {
        private class Style extends Enum
        {

            private static final Style $VALUES[];
            public static final Style DARK;
            public static final Style EXPRESSPAY;
            public static final Style GLOWSTACHE;
            public static final Style LIGHT;

            public static Style valueOf(String s)
            {
                return (Style)Enum.valueOf(me/lyft/android/domain/driver/Card$Style, s);
            }

            public static Style[] values()
            {
                return (Style[])$VALUES.clone();
            }

            static 
            {
                GLOWSTACHE = new Style("GLOWSTACHE", 0);
                LIGHT = new Style("LIGHT", 1);
                DARK = new Style("DARK", 2);
                EXPRESSPAY = new Style("EXPRESSPAY", 3);
                $VALUES = (new Style[] {
                    GLOWSTACHE, LIGHT, DARK, EXPRESSPAY
                });
            }

            private Style(String s, int i)
            {
                super(s, i);
            }
        }


        private static final Card INSTANCE = new NullCard();

        static Card getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        private NullCard()
        {
            super(Style.LIGHT, "", "", "", Collections.emptyList(), "");
        }
    }

}
