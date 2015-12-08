// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.ViewConfiguration;
import com.soundcloud.android.utils.InputObject;
import com.soundcloud.android.view.TouchLayout;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.creators.record:
//            TrimHandleView, CreateWaveView, SoundRecorder

public class CreateWaveDisplay extends TouchLayout
{
    public static interface Listener
    {

        public abstract void onAdjustTrimLeft(float f, long l);

        public abstract void onAdjustTrimRight(float f, long l);

        public abstract void onSeek(float f);
    }

    private static final class TouchHandler extends Handler
    {

        private final WeakReference viewRef;

        public final void handleMessage(Message message)
        {
            CreateWaveDisplay createwavedisplay;
            int i;
            boolean flag1;
            flag1 = true;
            i = 0;
            createwavedisplay = (CreateWaveDisplay)viewRef.get();
            if (createwavedisplay != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                message = SoundRecorder.getInstance(createwavedisplay.getContext()).getTrimWindow();
                if (createwavedisplay.isEditing)
                {
                    i = (int)(message[0] * (float)createwavedisplay.waveformWidth);
                }
                float f;
                int j;
                if (createwavedisplay.isEditing)
                {
                    j = (int)(message[1] * (float)createwavedisplay.waveformWidth);
                } else
                {
                    j = createwavedisplay.waveformWidth;
                }
                f = (float)(Math.min(Math.max(i, createwavedisplay.lastSeekX), j) - (long)i) / (float)(j - i);
                if (createwavedisplay.listener != null)
                {
                    createwavedisplay.listener.onSeek(f);
                    return;
                }
                break;

            case 2: // '\002'
                createwavedisplay.lastTrimAction = System.currentTimeMillis();
                if (createwavedisplay.newTrimActionLeft != null && createwavedisplay.newTrimActionLeft.hasMovedFrom(createwavedisplay.lastTrimActionLeft))
                {
                    createwavedisplay.leftHandle.update(createwavedisplay.newTrimActionLeft.position);
                    if (createwavedisplay.listener != null)
                    {
                        createwavedisplay.listener.onAdjustTrimLeft(Math.max(0.0F, (float)createwavedisplay.newTrimActionLeft.position / (float)createwavedisplay.waveformWidth), createwavedisplay.newTrimActionLeft.timestamp - createwavedisplay.lastTrimActionLeft.timestamp);
                    }
                    createwavedisplay.waveformView.invalidate();
                }
                createwavedisplay.lastTrimActionLeft = createwavedisplay.newTrimActionLeft;
                if (createwavedisplay.newTrimActionRight != null && createwavedisplay.newTrimActionRight.hasMovedFrom(createwavedisplay.lastTrimActionRight))
                {
                    createwavedisplay.rightHandle.update(createwavedisplay.waveformWidth - createwavedisplay.newTrimActionRight.position);
                    if (createwavedisplay.listener != null)
                    {
                        createwavedisplay.listener.onAdjustTrimRight(Math.min(1.0F, (float)createwavedisplay.newTrimActionRight.position / (float)createwavedisplay.waveformWidth), createwavedisplay.newTrimActionRight.timestamp - createwavedisplay.lastTrimActionRight.timestamp);
                    }
                    createwavedisplay.waveformView.invalidate();
                }
                createwavedisplay.lastTrimActionRight = createwavedisplay.newTrimActionRight;
                return;

            case 3: // '\003'
                createwavedisplay.lastTrimAction = System.currentTimeMillis();
                createwavedisplay.lastTrimActionLeft = createwavedisplay.newTrimActionLeft;
                createwavedisplay.lastTrimActionRight = createwavedisplay.newTrimActionRight;
                message = createwavedisplay.rightHandle;
                boolean flag;
                if (createwavedisplay.rightHandleTouchIndex != -1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                message.setPressed(flag);
                message = createwavedisplay.leftHandle;
                if (createwavedisplay.leftHandleTouchIndex != -1)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                message.setPressed(flag);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        private TouchHandler(CreateWaveDisplay createwavedisplay)
        {
            viewRef = new WeakReference(createwavedisplay);
        }

        TouchHandler(CreateWaveDisplay createwavedisplay, _cls1 _pcls1)
        {
            this(createwavedisplay);
        }
    }

    private class TrimAction
    {

        int position;
        final CreateWaveDisplay this$0;
        long timestamp;

        public boolean hasMovedFrom(TrimAction trimaction)
        {
            return trimaction != null && trimaction.position != position;
        }

        public TrimAction(long l, int i)
        {
            this$0 = CreateWaveDisplay.this;
            super();
            timestamp = l;
            position = i;
        }
    }


    public static final int MODE_PLAYBACK = 1;
    public static final int MODE_REC = 0;
    private static final long TRIM_REPORT_INTERVAL = 200L;
    private static final int UI_ON_TRIM_STATE = 3;
    private static final int UI_UPDATE_SEEK = 1;
    private static final int UI_UPDATE_TRIM = 2;
    private boolean isEditing;
    private long lastSeekX;
    private long lastTrimAction;
    private TrimAction lastTrimActionLeft;
    private TrimAction lastTrimActionRight;
    private int leftDragOffsetX;
    private final TrimHandleView leftHandle;
    private int leftHandleTouchIndex;
    private Listener listener;
    private int mode;
    private TrimAction newTrimActionLeft;
    private TrimAction newTrimActionRight;
    private int rightDragOffsetX;
    private final TrimHandleView rightHandle;
    private int rightHandleTouchIndex;
    private boolean seekMode;
    private final Handler touchHandler = new TouchHandler(this, null);
    private final int touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    private Rect waveformRect;
    private CreateWaveView waveformView;
    private int waveformWidth;

    public CreateWaveDisplay(Context context)
    {
        super(context);
        leftHandleTouchIndex = -1;
        rightHandleTouchIndex = -1;
        lastSeekX = -1L;
        leftHandle = new TrimHandleView(getContext(), TrimHandleView.HandleType.LEFT);
        rightHandle = new TrimHandleView(getContext(), TrimHandleView.HandleType.RIGHT);
        seekMode = false;
        rightHandleTouchIndex = -1;
        leftHandleTouchIndex = -1;
        refreshWaveView();
    }

    private void calculateWaveformRect()
    {
        if (waveformView != null)
        {
            waveformRect = new Rect();
            waveformView.getHitRect(waveformRect);
        }
    }

    private void processHandleUpFromPointer(int i)
    {
        if (leftHandleTouchIndex == i)
        {
            newTrimActionLeft = null;
            leftHandleTouchIndex = -1;
            leftDragOffsetX = -1;
            if (rightHandleTouchIndex > i)
            {
                rightHandleTouchIndex = rightHandleTouchIndex - 1;
            }
        }
        if (rightHandleTouchIndex == i)
        {
            newTrimActionRight = null;
            rightHandleTouchIndex = -1;
            rightDragOffsetX = -1;
            if (leftHandleTouchIndex > i)
            {
                leftHandleTouchIndex = leftHandleTouchIndex - 1;
            }
        }
        queueTrim(2);
    }

    private CreateWaveView refreshWaveView()
    {
        if (waveformView != null && waveformView.getParent() == this)
        {
            removeView(waveformView);
        }
        waveformView = new CreateWaveView(getContext());
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.bottomMargin = (int)getResources().getDimension(0x7f0b0094);
        addView(waveformView, layoutparams);
        return waveformView;
    }

    private void seekTouch(int i)
    {
        if ((long)i != lastSeekX)
        {
            lastSeekX = i;
            queueUnique(1);
        }
    }

    private void setTouchMode(InputObject inputobject)
    {
        Rect rect1 = null;
        if (mode != 0 && inputobject.actionIndex <= 1)
        {
            Rect rect;
            int i;
            int j;
            if (leftHandle.getParent() == this)
            {
                rect = new Rect();
                leftHandle.getHitRect(rect);
                rect.set(rect.left - touchSlop, rect.top - touchSlop, rect.right, rect.bottom + touchSlop);
            } else
            {
                rect = null;
            }
            if (rightHandle.getParent() == this)
            {
                rect1 = new Rect();
                rightHandle.getHitRect(rect1);
                rect1.set(rect1.left, rect1.top - touchSlop, rect1.right + touchSlop, rect1.bottom + touchSlop);
            }
            if (inputobject.actionIndex == 0)
            {
                i = inputobject.x;
            } else
            {
                i = inputobject.pointerX;
            }
            if (inputobject.actionIndex == 0)
            {
                j = inputobject.y;
            } else
            {
                j = inputobject.pointerY;
            }
            if (rect != null && rect.contains(i, j))
            {
                leftHandleTouchIndex = inputobject.actionIndex;
                return;
            }
            if (rect1 != null && rect1.contains(i, j))
            {
                rightHandleTouchIndex = inputobject.actionIndex;
                return;
            }
            if (inputobject.action == 3 && waveformRect != null && waveformRect.contains(i, j))
            {
                seekMode = true;
                return;
            }
        }
    }

    private void setTrimHandles()
    {
        float af[] = SoundRecorder.getInstance(getContext()).getTrimWindow();
        if (isEditing)
        {
            leftHandle.update((int)((float)waveformWidth * af[0]));
            if (leftHandle.getParent() != this)
            {
                addView(leftHandle);
            }
            rightHandle.update((int)((1.0D - (double)af[1]) * (double)waveformWidth));
            if (rightHandle.getParent() != this)
            {
                addView(rightHandle);
            }
        }
    }

    public void gotoPlaybackMode(boolean flag)
    {
        if (mode != 1)
        {
            mode = 1;
            waveformView.setMode(mode, flag);
        }
    }

    public void gotoRecordMode()
    {
        if (mode != 0)
        {
            mode = 0;
            waveformView.setMode(mode, true);
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        waveformView.onDestroy();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (flag && getWidth() > 0 && waveformView != null && waveformView.getWidth() > 0)
        {
            calculateWaveformRect();
            leftHandle.getLayoutParams().addRule(5, waveformView.getId());
            rightHandle.getLayoutParams().addRule(7, waveformView.getId());
            waveformWidth = waveformView.getWidth();
            setTrimHandles();
        }
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        String s = getClass().getSimpleName();
        mode = bundle.getInt((new StringBuilder()).append(s).append("_mode").toString(), mode);
        setIsEditing(bundle.getBoolean((new StringBuilder()).append(s).append("_inEditMode").toString(), isEditing));
        waveformView.setMode(mode, false);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        String s = getClass().getSimpleName();
        bundle.putInt((new StringBuilder()).append(s).append("_mode").toString(), mode);
        bundle.putBoolean((new StringBuilder()).append(s).append("_inEditMode").toString(), isEditing);
    }

    protected void processDownInput(InputObject inputobject)
    {
        setTouchMode(inputobject);
        if (seekMode)
        {
            seekTouch(inputobject.x);
        } else
        {
            if (leftHandleTouchIndex >= 0 && inputobject.actionIndex == leftHandleTouchIndex)
            {
                queueUnique(3);
                return;
            }
            if (rightHandleTouchIndex >= 0 && inputobject.actionIndex == rightHandleTouchIndex)
            {
                queueUnique(3);
                return;
            }
        }
    }

    protected void processMoveInput(InputObject inputobject)
    {
        if (seekMode)
        {
            seekTouch(inputobject.x);
            return;
        }
        int i;
        if (inputobject.actionIndex == 0)
        {
            i = inputobject.x;
        } else
        {
            i = inputobject.pointerX;
        }
        if (leftHandleTouchIndex >= 0)
        {
            if (leftDragOffsetX == -1)
            {
                leftDragOffsetX = i - leftHandle.getLeft();
            }
            long l1 = System.currentTimeMillis();
            int k = rightHandle.getLeft();
            int l = leftHandle.getWidth();
            int j;
            if (leftHandleTouchIndex == 0)
            {
                j = inputobject.x;
            } else
            {
                j = inputobject.pointerX;
            }
            newTrimActionLeft = new TrimAction(l1, Math.max(0, Math.min(k - l, j - leftDragOffsetX)));
        }
        if (rightHandleTouchIndex >= 0)
        {
            if (rightDragOffsetX == -1)
            {
                rightDragOffsetX = i - rightHandle.getRight();
            }
            l1 = System.currentTimeMillis();
            j = getWidth();
            k = leftHandle.getRight();
            l = rightHandle.getWidth();
            if (rightHandleTouchIndex == 0)
            {
                i = inputobject.x;
            } else
            {
                i = inputobject.pointerX;
            }
            newTrimActionRight = new TrimAction(l1, Math.min(j, Math.max(l + k, i - rightDragOffsetX)));
        }
        queueTrim(2);
    }

    protected void processPointer1DownInput(InputObject inputobject)
    {
        setTouchMode(inputobject);
    }

    protected void processPointer1UpInput(InputObject inputobject)
    {
        processHandleUpFromPointer(inputobject.actionIndex);
    }

    protected void processUpInput(InputObject inputobject)
    {
        processHandleUpFromPointer(inputobject.actionIndex);
        queueUnique(3);
        touchHandler.removeMessages(1);
        lastSeekX = -1L;
        seekMode = false;
    }

    protected void queueTrim(int i)
    {
        if (lastTrimAction == 0L)
        {
            queueUnique(i);
            return;
        }
        long l = Math.max(0L, 200L - System.currentTimeMillis() - lastTrimAction);
        if (touchHandler.hasMessages(i))
        {
            touchHandler.removeMessages(i);
        }
        touchHandler.sendEmptyMessageDelayed(i, l);
    }

    protected void queueUnique(int i)
    {
        if (!touchHandler.hasMessages(i))
        {
            touchHandler.sendEmptyMessage(i);
        }
    }

    public void reset()
    {
        mode = 0;
        waveformView.reset();
    }

    public void setIsEditing(boolean flag)
    {
        if (isEditing != flag)
        {
            isEditing = flag;
            waveformView.setIsEditing(flag);
            if (isEditing)
            {
                setTrimHandles();
            } else
            {
                if (leftHandle.getParent() == this)
                {
                    removeView(leftHandle);
                }
                if (rightHandle.getParent() == this)
                {
                    removeView(rightHandle);
                    return;
                }
            }
        }
    }

    public void setProgress(float f)
    {
        waveformView.setPlaybackProgress(f);
    }

    public void setTrimListener(Listener listener1)
    {
        listener = listener1;
    }

    public void updateAmplitude(float f, boolean flag)
    {
        waveformView.updateAmplitude(f, flag);
    }





/*
    static TrimAction access$1102(CreateWaveDisplay createwavedisplay, TrimAction trimaction)
    {
        createwavedisplay.lastTrimActionRight = trimaction;
        return trimaction;
    }

*/








/*
    static long access$502(CreateWaveDisplay createwavedisplay, long l)
    {
        createwavedisplay.lastTrimAction = l;
        return l;
    }

*/




/*
    static TrimAction access$702(CreateWaveDisplay createwavedisplay, TrimAction trimaction)
    {
        createwavedisplay.lastTrimActionLeft = trimaction;
        return trimaction;
    }

*/


}
