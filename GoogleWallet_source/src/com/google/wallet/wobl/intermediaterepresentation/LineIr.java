// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.common.base.Optional;
import com.google.wallet.wobl.exception.WoblMalformedDocException;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            IntermediateRepresentation

public class LineIr extends IntermediateRepresentation
{
    public static final class Orientation extends Enum
    {

        private static final Orientation $VALUES[];
        public static final Orientation HORIZONTAL;
        public static final Orientation VERTICAL;

        public static Orientation of(String s)
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

        public static Orientation valueOf(String s)
        {
            return (Orientation)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/LineIr$Orientation, s);
        }

        public static Orientation[] values()
        {
            return (Orientation[])$VALUES.clone();
        }

        static 
        {
            HORIZONTAL = new Orientation("HORIZONTAL", 0);
            VERTICAL = new Orientation("VERTICAL", 1);
            $VALUES = (new Orientation[] {
                HORIZONTAL, VERTICAL
            });
        }

        private Orientation(String s, int i)
        {
            super(s, i);
        }
    }


    private String color;
    private Optional length;
    private Orientation orientation;
    private Optional thickness;

    public LineIr()
    {
    }

    public String getColor()
    {
        return color;
    }

    public Optional getLength()
    {
        return length;
    }

    public Orientation getOrientation()
    {
        return orientation;
    }

    public Optional getThickness()
    {
        return thickness;
    }

    public void setColor(String s)
    {
        color = s;
    }

    public void setLength(Optional optional)
    {
        length = optional;
    }

    public void setOrientation(Orientation orientation1)
    {
        orientation = orientation1;
    }

    public void setThickness(Optional optional)
    {
        thickness = optional;
    }
}
