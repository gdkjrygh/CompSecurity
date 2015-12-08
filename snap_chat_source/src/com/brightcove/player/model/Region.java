// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;

import java.util.Locale;

// Referenced classes of package com.brightcove.player.model:
//            StyledElement, Length

public class Region extends StyledElement
{
    public static final class DisplayAlign extends Enum
    {

        public static final DisplayAlign AFTER;
        public static final DisplayAlign BEFORE;
        public static final DisplayAlign CENTER;
        private static final DisplayAlign a[];

        public static DisplayAlign fromString(String s)
        {
            return valueOf(s.toUpperCase(Locale.US));
        }

        public static DisplayAlign valueOf(String s)
        {
            return (DisplayAlign)Enum.valueOf(com/brightcove/player/model/Region$DisplayAlign, s);
        }

        public static DisplayAlign[] values()
        {
            return (DisplayAlign[])a.clone();
        }

        static 
        {
            BEFORE = new DisplayAlign("BEFORE", 0);
            CENTER = new DisplayAlign("CENTER", 1);
            AFTER = new DisplayAlign("AFTER", 2);
            a = (new DisplayAlign[] {
                BEFORE, CENTER, AFTER
            });
        }

        private DisplayAlign(String s, int i1)
        {
            super(s, i1);
        }
    }


    private Length h;
    private Length i;
    private Length j;
    private Length k;
    private DisplayAlign l;

    public Region()
    {
    }

    public DisplayAlign getDisplayAlign()
    {
        return l;
    }

    public Length getExtentX()
    {
        return j;
    }

    public Length getExtentY()
    {
        return k;
    }

    public Length getOriginX()
    {
        return h;
    }

    public Length getOriginY()
    {
        return i;
    }

    public void setDisplayAlign(DisplayAlign displayalign)
    {
        l = displayalign;
    }

    public void setExtentX(Length length)
    {
        j = length;
    }

    public void setExtentY(Length length)
    {
        k = length;
    }

    public void setOriginX(Length length)
    {
        h = length;
    }

    public void setOriginY(Length length)
    {
        i = length;
    }
}
