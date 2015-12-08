// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import java.util.List;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            IntermediateRepresentation

public interface HasChildren
{
    public static abstract class RendererLayoutParams
    {

        public static final int MATCH_PARENT = -1;
        public static final int WRAP_CONTENT = -2;
        protected int bottomMargin;
        protected int bottomPadding;
        protected int height;
        protected int leftMargin;
        protected int leftPadding;
        protected int rightMargin;
        protected int rightPadding;
        protected int topMargin;
        protected int topPadding;
        protected int width;

        public int getHeight()
        {
            return height;
        }

        public int[] getMargins()
        {
            return (new int[] {
                topMargin, rightMargin, bottomMargin, leftMargin
            });
        }

        public int[] getPaddings()
        {
            return (new int[] {
                topPadding, rightPadding, bottomPadding, leftPadding
            });
        }

        public int getWidth()
        {
            return width;
        }

        public void setMargins(int i, int j, int k, int l)
        {
            topMargin = i;
            rightMargin = j;
            bottomMargin = k;
            leftMargin = l;
        }

        public void setPaddings(int i, int j, int k, int l)
        {
            topPadding = i;
            rightPadding = j;
            bottomPadding = k;
            leftPadding = l;
        }

        public RendererLayoutParams(int i, int j)
        {
            width = i;
            height = j;
        }
    }


    public abstract void addChild(IntermediateRepresentation intermediaterepresentation);

    public abstract List getChildren();
}
