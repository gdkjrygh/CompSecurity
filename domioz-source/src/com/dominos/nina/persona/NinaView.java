// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.SlidingDrawer;
import com.nuance.b.e.a.e;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.dominos.nina.persona:
//            NinaBar

public class NinaView extends SlidingDrawer
{

    private static final int TAP_THRESHOLD = 10;
    private Animation detachAnimation;
    private boolean dispatchingEvents;
    private float downEventX;
    private float downEventY;
    private final GestureDetector gestureDetector;
    NinaViewListener listener;
    private boolean locked;
    private final int mTopOffset;
    private final boolean mVertical;
    private NinaBar ninaBar;
    private final float partialHeightRatio;
    private final float partialHeightThreshold;
    e personaMode;
    private final AtomicBoolean showHintsWhenUnlocked;
    private final int tapThreshold;

    public NinaView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NinaView(Context context, AttributeSet attributeset, int i)
    {
        boolean flag = true;
        super(context, attributeset, i);
        showHintsWhenUnlocked = new AtomicBoolean(false);
        listener = null;
        detachAnimation = null;
        Resources resources = getResources();
        tapThreshold = (int)(resources.getDisplayMetrics().density * 10F + 0.5F);
        gestureDetector = new GestureDetector(context, new NinaViewGestureListener(null));
        i = attributeset.getAttributeIntValue("android", "orientation", 1);
        mTopOffset = attributeset.getAttributeIntValue("android", "topOffset", 0);
        if (i != 1)
        {
            flag = false;
        }
        mVertical = flag;
        partialHeightRatio = (float)resources.getInteger(R.integer.nina_hints_partial_height_ratio) / 100F;
        partialHeightThreshold = (float)resources.getInteger(R.integer.nina_hints_partial_height_threshold) / 100F;
    }

    public void closeHints()
    {
        post(new _cls1());
    }

    public void destroy()
    {
        Handler handler = getHandler();
        if (handler != null)
        {
            handler.removeCallbacksAndMessages(null);
        }
        ninaBar.destroy();
    }

    public int getAnimationHeight()
    {
        if (isOpened())
        {
            return 0;
        } else
        {
            return getHandleHeight();
        }
    }

    public int getHandleHeight()
    {
        return ninaBar.handleHeight;
    }

    String getMode(int i)
    {
        switch (i)
        {
        default:
            return "unk";

        case -2147483648: 
            return "AT_MOST";

        case 1073741824: 
            return "EXACTLY";

        case 0: // '\0'
            return "UNSPECIFIED";
        }
    }

    public void lock()
    {
        superLock();
        ninaBar.lock();
    }

    public void onAttachedToWindow()
    {
        if (getAnimation() == null)
        {
            if (detachAnimation != null)
            {
                detachAnimation.reset();
            }
            setAnimation(detachAnimation);
        }
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow()
    {
        detachAnimation = getAnimation();
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ninaBar = (NinaBar)findViewById(R.id.nina_bar);
        ninaBar.ninaView = this;
        setOnDrawerOpenListener(ninaBar.drawerOpenListener);
        setOnDrawerCloseListener(ninaBar.drawerCloseListener);
    }

    protected void onMeasure(int i, int j)
    {
        View view;
        View view1;
        int k;
        int i1;
        int k1;
        int l1;
        k1 = android.view.View.MeasureSpec.getMode(i);
        l1 = android.view.View.MeasureSpec.getSize(i);
        i1 = android.view.View.MeasureSpec.getMode(j);
        k = android.view.View.MeasureSpec.getSize(j);
        if (k1 == 0 || i1 == 0)
        {
            throw new RuntimeException("NinaView cannot have UNSPECIFIED dimensions");
        }
        view = getHandle();
        view1 = getContent();
        measureChild(view, i, j);
        if (!mVertical) goto _L2; else goto _L1
_L1:
        float f = (float)k / (float)l1;
        if (partialHeightThreshold < f)
        {
            float f1 = partialHeightRatio;
            k = (int)((float)k * f1 + 0.5F);
            j = i1;
        } else
        {
            j = 0x40000000;
        }
        view1.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(k - view.getMeasuredHeight() - mTopOffset, j));
        k = view.getMeasuredHeight();
        i1 = mTopOffset;
        k1 = view1.getMeasuredHeight();
        j = view1.getMeasuredWidth();
        i = j;
        if (view.getMeasuredWidth() > j)
        {
            i = view.getMeasuredWidth();
        }
        k = k1 + (k + i1);
        j = i;
        i = k;
_L4:
        setMeasuredDimension(j, i);
        return;
_L2:
        i = view.getMeasuredWidth();
        int l = mTopOffset;
        getContent().measure(android.view.View.MeasureSpec.makeMeasureSpec(l1 - i - l, k1), j);
        i = view.getMeasuredWidth();
        j = mTopOffset;
        l = view1.getMeasuredWidth() + (i + j);
        int j1 = view1.getMeasuredHeight();
        i = j1;
        j = l;
        if (view.getMeasuredHeight() > j1)
        {
            i = view.getMeasuredHeight();
            j = l;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = true;
        int i = motionevent.getAction();
        if (i == 0)
        {
            downEventX = motionevent.getX();
            downEventY = motionevent.getY();
            dispatchingEvents = true;
        }
        boolean flag2 = super.onTouchEvent(motionevent);
        boolean flag3 = gestureDetector.onTouchEvent(motionevent);
        if (dispatchingEvents)
        {
            MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
            motionevent1.offsetLocation(-ninaBar.getLeft(), -ninaBar.getTop());
            float f = Math.abs(motionevent.getX() - downEventX);
            float f1 = Math.abs(motionevent.getY() - downEventY);
            boolean flag;
            if (f > (float)tapThreshold || f1 > (float)tapThreshold)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (2 == i && flag)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            if (flag3 || flag)
            {
                motionevent1.setAction(3);
                dispatchingEvents = false;
            }
            ninaBar.dispatchTouchEvent(motionevent1);
            motionevent1.recycle();
        }
        return flag2;
    }

    public void pause()
    {
        ninaBar.pause();
    }

    public void prepareToListen()
    {
        ninaBar.prepareToListen();
        unlock();
    }

    public void processingComplete(String s)
    {
        lock();
        ninaBar.processingComplete(s);
    }

    public void prompt(String s, PromptTypes prompttypes, boolean flag)
    {
        NinaBar ninabar = ninaBar;
        boolean flag1;
        if (prompttypes == PromptTypes.ALERT)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ninabar.prompt(s, flag1);
        if (flag)
        {
            unlock();
            return;
        } else
        {
            lock();
            return;
        }
    }

    public void raiseHints()
    {
        if (!locked)
        {
            if (!isOpened() && !isMoving())
            {
                animateOpen();
            }
            return;
        } else
        {
            showHintsWhenUnlocked.set(true);
            return;
        }
    }

    public void reset()
    {
        lock();
        ninaBar.reset();
    }

    public void resume()
    {
        ninaBar.resume();
    }

    public void setMode(e e1)
    {
        ninaBar.setMode(e1);
        personaMode = e1;
        if (e.a != personaMode)
        {
            lock();
        }
    }

    public NinaViewListener setNinaViewListener(NinaViewListener ninaviewlistener)
    {
        NinaViewListener ninaviewlistener1 = listener;
        listener = ninaviewlistener;
        return ninaviewlistener1;
    }

    public void setVolumeIntensity(float f)
    {
        ninaBar.setVolumeIntensity(f);
    }

    void superLock()
    {
        super.lock();
        locked = true;
    }

    void superUnlock()
    {
        super.unlock();
        locked = false;
    }

    public void toLimbo(String s)
    {
        lock();
        ninaBar.toLimbo(s);
    }

    public void toListening()
    {
        ninaBar.toListening();
        unlock();
    }

    public void toProcessing()
    {
        lock();
        ninaBar.toProcessing();
    }

    public void toSleep()
    {
        ninaBar.toSleep();
        unlock();
    }

    public void toSleep(String s)
    {
        ninaBar.toSleep(s);
        unlock();
    }

    public void unlock()
    {
        if (e.a == personaMode)
        {
            superUnlock();
            ninaBar.unlock();
            if (showHintsWhenUnlocked.getAndSet(false))
            {
                animateOpen();
                return;
            }
        }
    }


    private class NinaViewGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final NinaView this$0;

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            boolean flag;
            if (f1 > 2.0F * Math.abs(f))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!ninaBar.isEditing() && !isOpened() && flag)
            {
                listener.exit();
                return true;
            } else
            {
                return false;
            }
        }

        private NinaViewGestureListener()
        {
            this$0 = NinaView.this;
            super();
        }

        NinaViewGestureListener(_cls1 _pcls1)
        {
            this();
        }

        private class NinaViewListener
        {

            public abstract void cancelInterpretation();

            public abstract void exit();

            public abstract void interpret(String s);

            public abstract void stopListening();

            public abstract void stopPrompts();

            public abstract void wakeUp();
        }

    }


    private class _cls1
        implements Runnable
    {

        final NinaView this$0;

        public void run()
        {
            close();
            ninaBar.cleanupEdit();
        }

        _cls1()
        {
            this$0 = NinaView.this;
            super();
        }
    }


    private class PromptTypes extends Enum
    {

        private static final PromptTypes $VALUES[];
        public static final PromptTypes ALERT;
        public static final PromptTypes NORMAL;
        public static final PromptTypes SUCCESS;

        public static PromptTypes valueOf(String s)
        {
            return (PromptTypes)Enum.valueOf(com/dominos/nina/persona/NinaView$PromptTypes, s);
        }

        public static PromptTypes[] values()
        {
            return (PromptTypes[])$VALUES.clone();
        }

        static 
        {
            NORMAL = new PromptTypes("NORMAL", 0);
            ALERT = new PromptTypes("ALERT", 1);
            SUCCESS = new PromptTypes("SUCCESS", 2);
            $VALUES = (new PromptTypes[] {
                NORMAL, ALERT, SUCCESS
            });
        }

        private PromptTypes(String s, int i)
        {
            super(s, i);
        }
    }

}
