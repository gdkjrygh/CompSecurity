// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.progress;

import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.android.view.ListenableHorizontalScrollView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.playback.ui.progress:
//            ProgressHelper

public class ScrubController
{
    public static class Factory
    {

        private final PlaySessionController playSessionController;
        private final SeekHandler.Factory seekHandlerFactory;

        public ScrubController create(ListenableHorizontalScrollView listenablehorizontalscrollview)
        {
            return new ScrubController(listenablehorizontalscrollview, playSessionController, seekHandlerFactory);
        }

        public Factory(PlaySessionController playsessioncontroller, SeekHandler.Factory factory)
        {
            playSessionController = playsessioncontroller;
            seekHandlerFactory = factory;
        }
    }

    public static interface OnScrubListener
    {

        public abstract void displayScrubPosition(float f);

        public abstract void scrubStateChanged(int i);
    }

    private class ScrollListener
        implements com.soundcloud.android.view.ListenableHorizontalScrollView.OnScrollListener
    {

        final ScrubController this$0;

        public void onScroll(int i, int j)
        {
            if (isScrubbing() && progressHelper != null)
            {
                float f = Math.max(0.0F, Math.min(1.0F, progressHelper.getProgressFromPosition(i)));
                seekHandler.removeMessages(0);
                seekHandler.sendMessageDelayed(seekHandler.obtainMessage(0, Float.valueOf(f)), 250L);
                for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((OnScrubListener)iterator.next()).displayScrubPosition(f)) { }
            }
        }

        private ScrollListener()
        {
            this$0 = ScrubController.this;
            super();
        }

        ScrollListener(_cls1 _pcls1)
        {
            this();
        }
    }

    private class TouchListener
        implements android.view.View.OnTouchListener
    {

        final ScrubController this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (motionevent.getAction() == 0)
            {
                dragging = true;
                setScrubState(1);
            } else
            if (motionevent.getAction() == 1 || motionevent.getAction() == 3 || isOutsideBounds(view, motionevent))
            {
                dragging = false;
                onRelease();
                return false;
            }
            return false;
        }

        private TouchListener()
        {
            this$0 = ScrubController.this;
            super();
        }

        TouchListener(_cls1 _pcls1)
        {
            this();
        }
    }


    static final int MSG_PERFORM_SEEK = 0;
    public static final int SCRUB_STATE_CANCELLED = 2;
    public static final int SCRUB_STATE_NONE = 0;
    public static final int SCRUB_STATE_SCRUBBING = 1;
    static final int SEEK_DELAY = 250;
    private boolean dragging;
    private long duration;
    private final Set listeners = new HashSet();
    private Float pendingSeek;
    private final PlaySessionController playSessionController;
    private ProgressHelper progressHelper;
    private int scrubState;
    private final Rect scrubViewBounds = new Rect();
    private final Handler seekHandler;

    ScrubController(ListenableHorizontalScrollView listenablehorizontalscrollview, PlaySessionController playsessioncontroller, SeekHandler.Factory factory)
    {
        playSessionController = playsessioncontroller;
        seekHandler = factory.create(this);
        listenablehorizontalscrollview.setOnScrollListener(new ScrollListener(null));
        listenablehorizontalscrollview.setOnTouchListener(new TouchListener(null));
    }

    private boolean isOutsideBounds(View view, MotionEvent motionevent)
    {
        scrubViewBounds.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        return !scrubViewBounds.contains(view.getLeft() + (int)motionevent.getX(), view.getTop() + (int)motionevent.getY());
    }

    private boolean isScrubbing()
    {
        boolean flag = false;
        if (scrubState == 1 || seekHandler.hasMessages(0))
        {
            flag = true;
        }
        return flag;
    }

    private void onRelease()
    {
label0:
        {
            if (!seekHandler.hasMessages(0))
            {
                if (pendingSeek != null)
                {
                    break label0;
                }
                setScrubState(2);
            }
            return;
        }
        finishSeek(pendingSeek);
    }

    private void setScrubState(int i)
    {
        scrubState = i;
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((OnScrubListener)iterator.next()).scrubStateChanged(scrubState)) { }
    }

    public void addScrubListener(OnScrubListener onscrublistener)
    {
        listeners.add(onscrublistener);
    }

    void finishSeek(Float float1)
    {
        long l = (long)(float1.floatValue() * (float)duration);
        playSessionController.seek(l);
        setScrubState(0);
        pendingSeek = null;
    }

    public boolean isDragging()
    {
        return dragging;
    }

    public void setDuration(long l)
    {
        duration = l;
    }

    public void setPendingSeek(Float float1)
    {
        pendingSeek = float1;
    }

    public void setProgressHelper(ProgressHelper progresshelper)
    {
        progressHelper = progresshelper;
    }






/*
    static boolean access$602(ScrubController scrubcontroller, boolean flag)
    {
        scrubcontroller.dragging = flag;
        return flag;
    }

*/



}
