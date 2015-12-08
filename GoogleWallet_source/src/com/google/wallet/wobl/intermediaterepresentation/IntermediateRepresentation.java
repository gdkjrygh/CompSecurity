// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.wallet.wobl.common.DisplayUnit;
import java.util.ArrayList;
import java.util.List;

public class IntermediateRepresentation
{
    public static final class HorizontalAlign extends Enum
    {

        private static final HorizontalAlign $VALUES[];
        public static final HorizontalAlign CENTER;
        public static final HorizontalAlign LEFT;
        public static final HorizontalAlign RIGHT;
        private final String attributeName;

        public static HorizontalAlign of(String s)
        {
            HorizontalAlign ahorizontalalign[] = values();
            int j = ahorizontalalign.length;
            for (int i = 0; i < j; i++)
            {
                HorizontalAlign horizontalalign = ahorizontalalign[i];
                if (horizontalalign.attributeName.equalsIgnoreCase(s))
                {
                    return horizontalalign;
                }
            }

            return LEFT;
        }

        public static HorizontalAlign valueOf(String s)
        {
            return (HorizontalAlign)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/IntermediateRepresentation$HorizontalAlign, s);
        }

        public static HorizontalAlign[] values()
        {
            return (HorizontalAlign[])$VALUES.clone();
        }

        static 
        {
            LEFT = new HorizontalAlign("LEFT", 0, "left");
            CENTER = new HorizontalAlign("CENTER", 1, "center");
            RIGHT = new HorizontalAlign("RIGHT", 2, "right");
            $VALUES = (new HorizontalAlign[] {
                LEFT, CENTER, RIGHT
            });
        }

        private HorizontalAlign(String s, int i, String s1)
        {
            super(s, i);
            attributeName = s1;
        }
    }

    public static final class VerticalAlign extends Enum
    {

        private static final VerticalAlign $VALUES[];
        public static final VerticalAlign BOTTOM;
        public static final VerticalAlign CENTER;
        public static final VerticalAlign TOP;
        private final String attributeName;

        public static VerticalAlign of(String s)
        {
            VerticalAlign averticalalign[] = values();
            int j = averticalalign.length;
            for (int i = 0; i < j; i++)
            {
                VerticalAlign verticalalign = averticalalign[i];
                if (verticalalign.attributeName.equalsIgnoreCase(s))
                {
                    return verticalalign;
                }
            }

            return TOP;
        }

        public static VerticalAlign valueOf(String s)
        {
            return (VerticalAlign)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/IntermediateRepresentation$VerticalAlign, s);
        }

        public static VerticalAlign[] values()
        {
            return (VerticalAlign[])$VALUES.clone();
        }

        static 
        {
            TOP = new VerticalAlign("TOP", 0, "top");
            CENTER = new VerticalAlign("CENTER", 1, "center");
            BOTTOM = new VerticalAlign("BOTTOM", 2, "bottom");
            $VALUES = (new VerticalAlign[] {
                TOP, CENTER, BOTTOM
            });
        }

        private VerticalAlign(String s, int i, String s1)
        {
            super(s, i);
            attributeName = s1;
        }
    }


    private Optional alpha;
    private Optional backgroundColor;
    private DisplayUnit bottomPadding;
    private HorizontalAlign horizontalAlign;
    private DisplayUnit leftPadding;
    private HasChildren.RendererLayoutParams rendererLayoutParams;
    private DisplayUnit rightPadding;
    private List tapUris;
    private DisplayUnit topPadding;
    private VerticalAlign verticalAlign;
    private DisplayUnit zDepth;

    public IntermediateRepresentation()
    {
        topPadding = DisplayUnit.ZERO;
        rightPadding = DisplayUnit.ZERO;
        bottomPadding = DisplayUnit.ZERO;
        leftPadding = DisplayUnit.ZERO;
        backgroundColor = Optional.absent();
        tapUris = new ArrayList();
        horizontalAlign = HorizontalAlign.LEFT;
        verticalAlign = VerticalAlign.TOP;
        zDepth = DisplayUnit.ZERO;
        alpha = Optional.absent();
    }

    public Optional getAlpha()
    {
        return alpha;
    }

    public Optional getBackgroundColor()
    {
        return backgroundColor;
    }

    public DisplayUnit getBottomPadding()
    {
        return bottomPadding;
    }

    public HorizontalAlign getHorizontalAlignment()
    {
        return horizontalAlign;
    }

    public DisplayUnit getLeftPadding()
    {
        return leftPadding;
    }

    public HasChildren.RendererLayoutParams getRendererLayoutParams()
    {
        return rendererLayoutParams;
    }

    public DisplayUnit getRightPadding()
    {
        return rightPadding;
    }

    public List getTapUris()
    {
        return tapUris;
    }

    public DisplayUnit getTopPadding()
    {
        return topPadding;
    }

    public VerticalAlign getVerticalAlignment()
    {
        return verticalAlign;
    }

    public DisplayUnit getZDepth()
    {
        return zDepth;
    }

    public void setAlpha(Optional optional)
    {
        alpha = optional;
    }

    public void setBackgroundColor(String s)
    {
        backgroundColor = Optional.fromNullable(s);
    }

    public void setHorizontalAlign(HorizontalAlign horizontalalign)
    {
        horizontalAlign = horizontalalign;
    }

    public void setPaddings(DisplayUnit displayunit, DisplayUnit displayunit1, DisplayUnit displayunit2, DisplayUnit displayunit3)
    {
        topPadding = (DisplayUnit)Preconditions.checkNotNull(displayunit);
        rightPadding = (DisplayUnit)Preconditions.checkNotNull(displayunit1);
        bottomPadding = (DisplayUnit)Preconditions.checkNotNull(displayunit2);
        leftPadding = (DisplayUnit)Preconditions.checkNotNull(displayunit3);
    }

    public void setRendererLayoutParams(HasChildren.RendererLayoutParams rendererlayoutparams)
    {
        rendererLayoutParams = rendererlayoutparams;
    }

    public void setTapUris(List list)
    {
        tapUris = list;
    }

    public void setVerticalAlign(VerticalAlign verticalalign)
    {
        verticalAlign = verticalalign;
    }

    public void setZDepth(DisplayUnit displayunit)
    {
        zDepth = displayunit;
    }
}
