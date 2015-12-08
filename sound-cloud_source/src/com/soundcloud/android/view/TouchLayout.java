// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.soundcloud.android.utils.InputObject;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;

public abstract class TouchLayout extends RelativeLayout
    implements android.view.View.OnTouchListener
{
    private static class TouchThread extends Thread
    {

        private final ArrayBlockingQueue inputQueue;
        private final WeakReference mLayoutRef;
        private boolean stopped;

        public void feedInput(InputObject inputobject)
        {
            this;
            JVM INSTR monitorenter ;
            inputQueue.put(inputobject);
_L2:
            this;
            JVM INSTR monitorexit ;
            return;
            inputobject;
            getClass().getSimpleName();
            inputobject.getMessage();
            if (true) goto _L2; else goto _L1
_L1:
            inputobject;
            throw inputobject;
        }

        public void run()
        {
_L2:
            Object obj1;
            if (stopped)
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = null;
            Object obj = (InputObject)inputQueue.take();
            if (((InputObject) (obj)).eventType != 2)
            {
                break MISSING_BLOCK_LABEL_48;
            }
            obj1 = (TouchLayout)mLayoutRef.get();
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_48;
            }
            ((TouchLayout) (obj1)).processInputObject(((InputObject) (obj)));
            if (obj != null)
            {
                ((InputObject) (obj)).returnToPool();
            }
            continue; /* Loop/switch isn't completed */
            obj;
            obj = null;
_L5:
            if (obj != null)
            {
                ((InputObject) (obj)).returnToPool();
            }
            if (true) goto _L2; else goto _L1
            Exception exception;
            exception;
            obj = obj1;
            obj1 = exception;
_L4:
            if (obj != null)
            {
                ((InputObject) (obj)).returnToPool();
            }
            throw obj1;
_L1:
            return;
            obj1;
            if (true) goto _L4; else goto _L3
_L3:
            InterruptedException interruptedexception;
            interruptedexception;
              goto _L5
        }


/*
        static boolean access$102(TouchThread touchthread, boolean flag)
        {
            touchthread.stopped = flag;
            return flag;
        }

*/

        private TouchThread(TouchLayout touchlayout)
        {
            inputQueue = new ArrayBlockingQueue(20);
            stopped = false;
            mLayoutRef = new WeakReference(touchlayout);
        }

        TouchThread(TouchLayout touchlayout, _cls1 _pcls1)
        {
            this(touchlayout);
        }
    }


    private static final int INPUT_QUEUE_SIZE = 20;
    private ArrayBlockingQueue inputObjectPool;
    private TouchThread touchThread;

    public TouchLayout(Context context)
    {
        super(context);
        init();
    }

    public TouchLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public TouchLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        inputObjectPool = new ArrayBlockingQueue(20);
        for (int i = 0; i < 20; i++)
        {
            inputObjectPool.add(new InputObject(inputObjectPool));
        }

        touchThread = new TouchThread(this, null);
        touchThread.start();
        setOnTouchListener(this);
    }

    private void processInputObject(InputObject inputobject)
    {
        switch (inputobject.action)
        {
        default:
            return;

        case 3: // '\003'
            processDownInput(inputobject);
            return;

        case 4: // '\004'
            processMoveInput(inputobject);
            return;

        case 5: // '\005'
            processUpInput(inputobject);
            return;

        case 6: // '\006'
            processPointer1DownInput(inputobject);
            return;

        case 7: // '\007'
            processPointer1UpInput(inputobject);
            break;
        }
    }

    public void onDestroy()
    {
        if (touchThread != null)
        {
            touchThread.stopped = true;
            touchThread.interrupt();
            touchThread = null;
        }
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (touchThread == null)
        {
            return false;
        }
        int j;
        if ((motionevent.getAction() == 2 || motionevent.getAction() == 0) && getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionevent.getAction() == 1 && getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        j = motionevent.getHistorySize();
        if (j <= 0) goto _L2; else goto _L1
_L1:
        int i = 0;
_L3:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        InputObject inputobject = (InputObject)inputObjectPool.take();
        inputobject.useEventHistory(view, motionevent, i);
        touchThread.feedInput(inputobject);
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        try
        {
            InputObject inputobject1 = (InputObject)inputObjectPool.take();
            inputobject1.useEvent(view, motionevent);
            touchThread.feedInput(inputobject1);
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        return true;
    }

    public abstract void processDownInput(InputObject inputobject);

    public abstract void processMoveInput(InputObject inputobject);

    public abstract void processPointer1DownInput(InputObject inputobject);

    public abstract void processPointer1UpInput(InputObject inputobject);

    public abstract void processUpInput(InputObject inputobject);

}
