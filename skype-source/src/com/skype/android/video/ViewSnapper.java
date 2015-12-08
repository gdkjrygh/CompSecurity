// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video;

import android.graphics.Rect;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.LinkedList;

public class ViewSnapper
{
    public static final class HorizontalSnap extends Enum
    {

        private static final HorizontalSnap $VALUES[];
        public static final HorizontalSnap CENTER;
        public static final HorizontalSnap LEFT;
        public static final HorizontalSnap NONE;
        public static final HorizontalSnap RIGHT;

        public static HorizontalSnap valueOf(String s)
        {
            return (HorizontalSnap)Enum.valueOf(com/skype/android/video/ViewSnapper$HorizontalSnap, s);
        }

        public static HorizontalSnap[] values()
        {
            return (HorizontalSnap[])$VALUES.clone();
        }

        static 
        {
            NONE = new HorizontalSnap("NONE", 0);
            LEFT = new HorizontalSnap("LEFT", 1);
            CENTER = new HorizontalSnap("CENTER", 2);
            RIGHT = new HorizontalSnap("RIGHT", 3);
            $VALUES = (new HorizontalSnap[] {
                NONE, LEFT, CENTER, RIGHT
            });
        }

        private HorizontalSnap(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class VerticalSnap extends Enum
    {

        private static final VerticalSnap $VALUES[];
        public static final VerticalSnap BOTTOM;
        public static final VerticalSnap CENTER;
        public static final VerticalSnap NONE;
        public static final VerticalSnap TOP;

        public static VerticalSnap valueOf(String s)
        {
            return (VerticalSnap)Enum.valueOf(com/skype/android/video/ViewSnapper$VerticalSnap, s);
        }

        public static VerticalSnap[] values()
        {
            return (VerticalSnap[])$VALUES.clone();
        }

        static 
        {
            NONE = new VerticalSnap("NONE", 0);
            TOP = new VerticalSnap("TOP", 1);
            CENTER = new VerticalSnap("CENTER", 2);
            BOTTOM = new VerticalSnap("BOTTOM", 3);
            $VALUES = (new VerticalSnap[] {
                NONE, TOP, CENTER, BOTTOM
            });
        }

        private VerticalSnap(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface ViewSnapperListener
    {

        public abstract void onDragStarted();

        public abstract void onDragStopped();

        public abstract void onDragUpdated();
    }


    private boolean dragging;
    private HorizontalSnap horizontalSnap;
    private Rect innerRect;
    private int internalOffsetX;
    private int internalOffsetY;
    private LinkedList listeners;
    private int offsetX;
    private int offsetY;
    private Rect outerRect;
    private int previousX;
    private int previousY;
    private int snapThreshold;
    private VerticalSnap verticalSnap;

    public ViewSnapper(Rect rect)
    {
        snapThreshold = 50;
        horizontalSnap = HorizontalSnap.NONE;
        verticalSnap = VerticalSnap.NONE;
        listeners = new LinkedList();
        innerRect = rect;
    }

    private void checkBounds(boolean flag)
    {
        if (outerRect != null && outerRect.width() != 0 && outerRect.height() != 0)
        {
            HorizontalSnap horizontalsnap;
            VerticalSnap verticalsnap;
            if (flag)
            {
                horizontalsnap = horizontalSnap;
                verticalsnap = verticalSnap;
                horizontalSnap = HorizontalSnap.NONE;
                verticalSnap = VerticalSnap.NONE;
            } else
            {
                horizontalsnap = HorizontalSnap.NONE;
                horizontalSnap = horizontalsnap;
                verticalsnap = VerticalSnap.NONE;
                verticalSnap = verticalsnap;
            }
            if (horizontalsnap == HorizontalSnap.LEFT || innerRect.left < outerRect.left + snapThreshold)
            {
                innerRect.offset(outerRect.left - innerRect.left, 0);
                horizontalSnap = HorizontalSnap.LEFT;
            }
            if (verticalsnap == VerticalSnap.TOP || innerRect.top < outerRect.top + snapThreshold)
            {
                innerRect.offset(0, outerRect.top - innerRect.top);
                verticalSnap = VerticalSnap.TOP;
            }
            if (horizontalsnap == HorizontalSnap.RIGHT || innerRect.right > outerRect.right - snapThreshold && horizontalSnap == HorizontalSnap.NONE)
            {
                innerRect.offset(outerRect.right - innerRect.right, 0);
                horizontalSnap = HorizontalSnap.RIGHT;
            }
            if (verticalsnap == VerticalSnap.BOTTOM || innerRect.bottom > outerRect.bottom - snapThreshold && verticalSnap == VerticalSnap.NONE)
            {
                innerRect.offset(0, outerRect.bottom - innerRect.bottom);
                verticalSnap = VerticalSnap.BOTTOM;
            }
            if ((horizontalSnap == HorizontalSnap.LEFT || horizontalSnap == HorizontalSnap.RIGHT) && (verticalsnap == VerticalSnap.CENTER || verticalsnap == VerticalSnap.NONE && Math.abs(innerRect.centerY() - outerRect.centerY()) < snapThreshold))
            {
                innerRect.offsetTo(innerRect.left, outerRect.centerY() - innerRect.height() / 2);
                verticalSnap = VerticalSnap.CENTER;
            }
            if ((verticalSnap == VerticalSnap.TOP || verticalSnap == VerticalSnap.BOTTOM) && (horizontalsnap == HorizontalSnap.CENTER || horizontalsnap == HorizontalSnap.NONE && Math.abs(innerRect.centerX() - outerRect.centerX()) < snapThreshold))
            {
                innerRect.offsetTo(outerRect.centerX() - innerRect.width() / 2, innerRect.top);
                horizontalSnap = HorizontalSnap.CENTER;
                return;
            }
        }
    }

    public void addViewSnapperListener(ViewSnapperListener viewsnapperlistener)
    {
        listeners.add(viewsnapperlistener);
    }

    public Rect getCurrentPosition()
    {
        return innerRect;
    }

    public HorizontalSnap getHorizontalSnap()
    {
        return horizontalSnap;
    }

    public VerticalSnap getVerticalSnap()
    {
        return verticalSnap;
    }

    public boolean isViewTouched(MotionEvent motionevent)
    {
        return innerRect.contains((int)motionevent.getX(), (int)motionevent.getY());
    }

    public void onTouchEvent(MotionEvent motionevent)
    {
        int i;
        int j;
        i = (int)motionevent.getX();
        j = (int)motionevent.getY();
        offsetX = offsetX + (i - previousX);
        offsetY = offsetY + (j - previousY);
        previousX = i;
        previousY = j;
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 84
    //                   0 85
    //                   1 162
    //                   2 209;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (innerRect.contains(i, j))
        {
            dragging = true;
            internalOffsetX = i - innerRect.left;
            internalOffsetY = j - innerRect.top;
            motionevent = listeners.iterator();
            while (motionevent.hasNext()) 
            {
                ((ViewSnapperListener)motionevent.next()).onDragStarted();
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (dragging)
        {
            for (motionevent = listeners.iterator(); motionevent.hasNext(); ((ViewSnapperListener)motionevent.next()).onDragStopped()) { }
        }
        dragging = false;
        return;
_L4:
        if (dragging)
        {
            innerRect.offsetTo(offsetX - internalOffsetX, offsetY - internalOffsetY);
            checkBounds(false);
            motionevent = listeners.iterator();
            while (motionevent.hasNext()) 
            {
                ((ViewSnapperListener)motionevent.next()).onDragUpdated();
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setBounds(Rect rect)
    {
        if (rect.equals(outerRect))
        {
            return;
        } else
        {
            outerRect = rect;
            checkBounds(true);
            return;
        }
    }

    public void setSnapThreshold(float f)
    {
        snapThreshold = (int)((float)innerRect.width() * f);
        checkBounds(true);
    }

    public void setSnapThreshold(int i)
    {
        snapThreshold = i;
        checkBounds(true);
    }

    public void snapTo(HorizontalSnap horizontalsnap, VerticalSnap verticalsnap)
    {
        horizontalSnap = horizontalsnap;
        verticalSnap = verticalsnap;
        checkBounds(true);
    }

    public void updateRect(Rect rect)
    {
        Rect rect1 = innerRect;
        innerRect = rect;
        innerRect.offsetTo(rect1.centerX() - innerRect.width() / 2, rect1.centerY() - innerRect.height() / 2);
        checkBounds(true);
    }

    public void updateRectSize(int i, int j)
    {
        updateRect(new Rect(0, 0, i, j));
    }
}
