// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.os.SystemClock;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package org.chromium.content.browser.input:
//            GamepadList, GamepadMappings

class GamepadDevice
{

    static final boolean $assertionsDisabled;
    private int mAxes[];
    private final float mAxisValues[] = new float[4];
    private final float mButtonsValues[] = new float[17];
    private int mDeviceId;
    private int mDeviceIndex;
    private String mDeviceName;
    private boolean mIsStandardGamepad;
    private final float mRawAxes[] = new float[256];
    private final float mRawButtons[] = new float[256];
    private long mTimestamp;

    GamepadDevice(int i, InputDevice inputdevice)
    {
        mDeviceIndex = i;
        mDeviceId = inputdevice.getId();
        mDeviceName = inputdevice.getName();
        mTimestamp = SystemClock.uptimeMillis();
        inputdevice = inputdevice.getMotionRanges();
        mAxes = new int[inputdevice.size()];
        i = 0;
        inputdevice = inputdevice.iterator();
        do
        {
            if (!inputdevice.hasNext())
            {
                break;
            }
            android.view.InputDevice.MotionRange motionrange = (android.view.InputDevice.MotionRange)inputdevice.next();
            if ((motionrange.getSource() & 0x10) != 0)
            {
                int j = motionrange.getAxis();
                if (!$assertionsDisabled && j >= 256)
                {
                    throw new AssertionError();
                }
                mAxes[i] = j;
                i++;
            }
        } while (true);
    }

    public void clearData()
    {
        Arrays.fill(mAxisValues, 0.0F);
        Arrays.fill(mRawAxes, 0.0F);
        Arrays.fill(mButtonsValues, 0.0F);
        Arrays.fill(mRawButtons, 0.0F);
    }

    public float[] getAxes()
    {
        return mAxisValues;
    }

    public float[] getButtons()
    {
        return mButtonsValues;
    }

    public int getId()
    {
        return mDeviceId;
    }

    public int getIndex()
    {
        return mDeviceIndex;
    }

    public String getName()
    {
        return mDeviceName;
    }

    public long getTimestamp()
    {
        return mTimestamp;
    }

    public boolean handleKeyEvent(KeyEvent keyevent)
    {
        int i;
        if (!GamepadList.isGamepadEvent(keyevent))
        {
            return false;
        }
        i = keyevent.getKeyCode();
        if (!$assertionsDisabled && i >= 256)
        {
            throw new AssertionError();
        }
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        mRawButtons[i] = 1.0F;
_L4:
        mTimestamp = keyevent.getEventTime();
        return true;
_L2:
        if (keyevent.getAction() == 1)
        {
            mRawButtons[i] = 0.0F;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean handleMotionEvent(MotionEvent motionevent)
    {
        if (!GamepadList.isGamepadEvent(motionevent))
        {
            return false;
        }
        for (int i = 0; i < mAxes.length; i++)
        {
            int j = mAxes[i];
            mRawAxes[j] = motionevent.getAxisValue(j);
        }

        mTimestamp = motionevent.getEventTime();
        return true;
    }

    public boolean isStandardGamepad()
    {
        return mIsStandardGamepad;
    }

    public void updateButtonsAndAxesMapping()
    {
        mIsStandardGamepad = GamepadMappings.mapToStandardGamepad(mAxisValues, mButtonsValues, mRawAxes, mRawButtons, mDeviceName);
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/input/GamepadDevice.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
