// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.content.Context;
import android.hardware.input.InputManager;
import android.view.InputDevice;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.chromium.base.ThreadUtils;

// Referenced classes of package org.chromium.content.browser.input:
//            GamepadDevice

public class GamepadList
{
    private static class LazyHolder
    {

        private static final GamepadList INSTANCE = new GamepadList();



        private LazyHolder()
        {
        }
    }


    static final boolean $assertionsDisabled;
    private static final int MAX_GAMEPADS = 4;
    private int mAttachedToWindowCounter;
    private final GamepadDevice mGamepadDevices[];
    private android.hardware.input.InputManager.InputDeviceListener mInputDeviceListener = new android.hardware.input.InputManager.InputDeviceListener() {

        final GamepadList this$0;

        public void onInputDeviceAdded(int i)
        {
            onInputDeviceAddedImpl(i);
        }

        public void onInputDeviceChanged(int i)
        {
            onInputDeviceChangedImpl(i);
        }

        public void onInputDeviceRemoved(int i)
        {
            onInputDeviceRemovedImpl(i);
        }

            
            {
                this$0 = GamepadList.this;
                super();
            }
    };
    private InputManager mInputManager;
    private boolean mIsGamepadAccessed;
    private final Object mLock;

    private GamepadList()
    {
        mLock = new Object();
        mGamepadDevices = new GamepadDevice[4];
    }


    private void attachedToWindow(Context context)
    {
        int i = mAttachedToWindowCounter;
        mAttachedToWindowCounter = i + 1;
        if (i == 0)
        {
            mInputManager = (InputManager)context.getSystemService("input");
            synchronized (mLock)
            {
                initializeDevices();
            }
            mInputManager.registerInputDeviceListener(mInputDeviceListener, null);
        }
        return;
        exception;
        context;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void detachedFromWindow()
    {
        int i = mAttachedToWindowCounter - 1;
        mAttachedToWindowCounter = i;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        int j = 0;
_L2:
        if (j >= 4)
        {
            break; /* Loop/switch isn't completed */
        }
        mGamepadDevices[j] = null;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        mInputManager.unregisterInputDeviceListener(mInputDeviceListener);
        mInputManager = null;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        while (!isGamepadSupported() || !isGamepadEvent(keyevent)) 
        {
            return false;
        }
        return getInstance().handleKeyEvent(keyevent);
    }

    private GamepadDevice getDevice(int i)
    {
        if (!$assertionsDisabled && (i < 0 || i >= 4))
        {
            throw new AssertionError();
        } else
        {
            return mGamepadDevices[i];
        }
    }

    private GamepadDevice getDeviceById(int i)
    {
        for (int j = 0; j < 4; j++)
        {
            GamepadDevice gamepaddevice = mGamepadDevices[j];
            if (gamepaddevice != null && gamepaddevice.getId() == i)
            {
                return gamepaddevice;
            }
        }

        return null;
    }

    private int getDeviceCount()
    {
        int j = 0;
        for (int i = 0; i < 4;)
        {
            int k = j;
            if (getDevice(i) != null)
            {
                k = j + 1;
            }
            i++;
            j = k;
        }

        return j;
    }

    private GamepadDevice getGamepadForEvent(InputEvent inputevent)
    {
        return getDeviceById(inputevent.getDeviceId());
    }

    private static GamepadList getInstance()
    {
        if (!$assertionsDisabled && !isGamepadSupported())
        {
            throw new AssertionError();
        } else
        {
            return LazyHolder.INSTANCE;
        }
    }

    private int getNextAvailableIndex()
    {
        for (int i = 0; i < 4; i++)
        {
            if (getDevice(i) == null)
            {
                return i;
            }
        }

        return -1;
    }

    private void grabGamepadData(long l)
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i >= 4)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        GamepadDevice gamepaddevice = getDevice(i);
        if (gamepaddevice == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        gamepaddevice.updateButtonsAndAxesMapping();
        nativeSetGamepadData(l, i, gamepaddevice.isStandardGamepad(), true, gamepaddevice.getName(), gamepaddevice.getTimestamp(), gamepaddevice.getAxes(), gamepaddevice.getButtons());
        break MISSING_BLOCK_LABEL_96;
        nativeSetGamepadData(l, i, false, false, null, 0L, null, null);
        break MISSING_BLOCK_LABEL_96;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean handleKeyEvent(KeyEvent keyevent)
    {
label0:
        {
            synchronized (mLock)
            {
                if (mIsGamepadAccessed)
                {
                    break label0;
                }
            }
            return false;
        }
        GamepadDevice gamepaddevice = getGamepadForEvent(keyevent);
        if (gamepaddevice != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        keyevent;
        obj;
        JVM INSTR monitorexit ;
        throw keyevent;
        boolean flag = gamepaddevice.handleKeyEvent(keyevent);
        obj;
        JVM INSTR monitorexit ;
        return flag;
    }

    private boolean handleMotionEvent(MotionEvent motionevent)
    {
label0:
        {
            synchronized (mLock)
            {
                if (mIsGamepadAccessed)
                {
                    break label0;
                }
            }
            return false;
        }
        GamepadDevice gamepaddevice = getGamepadForEvent(motionevent);
        if (gamepaddevice != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        motionevent;
        obj;
        JVM INSTR monitorexit ;
        throw motionevent;
        boolean flag = gamepaddevice.handleMotionEvent(motionevent);
        obj;
        JVM INSTR monitorexit ;
        return flag;
    }

    private void initializeDevices()
    {
        int ai[] = mInputManager.getInputDeviceIds();
        for (int i = 0; i < ai.length; i++)
        {
            InputDevice inputdevice = InputDevice.getDevice(ai[i]);
            if (isGamepadDevice(inputdevice))
            {
                registerGamepad(inputdevice);
            }
        }

    }

    private boolean isDeviceConnected(int i)
    {
        return i < 4 && getDevice(i) != null;
    }

    private static boolean isGamepadDevice(InputDevice inputdevice)
    {
        while (inputdevice == null || (inputdevice.getSources() & 0x1000010) != 0x1000010) 
        {
            return false;
        }
        return true;
    }

    public static boolean isGamepadEvent(KeyEvent keyevent)
    {
        int i = keyevent.getKeyCode();
        switch (i)
        {
        default:
            return KeyEvent.isGamepadButton(i);

        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
            return true;
        }
    }

    public static boolean isGamepadEvent(MotionEvent motionevent)
    {
        return (motionevent.getSource() & 0x1000010) == 0x1000010;
    }

    private static boolean isGamepadSupported()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    private native void nativeSetGamepadData(long l, int i, boolean flag, boolean flag1, String s, long l1, float af[], float af1[]);

    static void notifyForGamepadsAccess(boolean flag)
    {
        if (!isGamepadSupported())
        {
            return;
        }
        GamepadList gamepadlist = getInstance();
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gamepadlist.setIsGamepadAccessed(flag);
    }

    public static void onAttachedToWindow(Context context)
    {
        if (!$assertionsDisabled && !ThreadUtils.runningOnUiThread())
        {
            throw new AssertionError();
        }
        if (!isGamepadSupported())
        {
            return;
        } else
        {
            getInstance().attachedToWindow(context);
            return;
        }
    }

    public static void onDetachedFromWindow()
    {
        if (!$assertionsDisabled && !ThreadUtils.runningOnUiThread())
        {
            throw new AssertionError();
        }
        if (!isGamepadSupported())
        {
            return;
        } else
        {
            getInstance().detachedFromWindow();
            return;
        }
    }

    public static boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        while (!isGamepadSupported() || !isGamepadEvent(motionevent)) 
        {
            return false;
        }
        return getInstance().handleMotionEvent(motionevent);
    }

    private void onInputDeviceAddedImpl(int i)
    {
        InputDevice inputdevice = InputDevice.getDevice(i);
        if (!isGamepadDevice(inputdevice))
        {
            return;
        }
        synchronized (mLock)
        {
            registerGamepad(inputdevice);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void onInputDeviceChangedImpl(int i)
    {
    }

    private void onInputDeviceRemovedImpl(int i)
    {
        synchronized (mLock)
        {
            unregisterGamepad(i);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean registerGamepad(InputDevice inputdevice)
    {
        int i = getNextAvailableIndex();
        if (i == -1)
        {
            return false;
        } else
        {
            inputdevice = new GamepadDevice(i, inputdevice);
            mGamepadDevices[i] = inputdevice;
            return true;
        }
    }

    private void setIsGamepadAccessed(boolean flag)
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        mIsGamepadAccessed = flag;
        if (!flag) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        if (i >= 4) goto _L2; else goto _L3
_L3:
        GamepadDevice gamepaddevice = getDevice(i);
        if (gamepaddevice != null) goto _L5; else goto _L4
_L5:
        gamepaddevice.clearData();
          goto _L4
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void unregisterGamepad(int i)
    {
        GamepadDevice gamepaddevice = getDeviceById(i);
        if (gamepaddevice == null)
        {
            return;
        } else
        {
            i = gamepaddevice.getIndex();
            mGamepadDevices[i] = null;
            return;
        }
    }

    static void updateGamepadData(long l)
    {
        if (!isGamepadSupported())
        {
            return;
        } else
        {
            getInstance().grabGamepadData(l);
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/input/GamepadList.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }



}
