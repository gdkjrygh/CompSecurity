// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video;

import java.lang.ref.WeakReference;
import java.util.Vector;

// Referenced classes of package com.skype.android.video:
//            DeviceProfile

public final class ControlUnit
{
    public static interface StateListener
    {

        public abstract void onStateChanged(int i, int j, int k);
    }


    public static final int CAMERA_FRONT = 1;
    public static final int CAMERA_REAR = 0;
    public static final int CTRL_CMD_CHANGE_ORIENTATION = 2;
    public static final int CTRL_CMD_PREVIEW_SIZE_CHANGE = 4;
    public static final int CTRL_CMD_TARGET_RESOLUTION_CHANGE = 3;
    public static final int STATE_PREVIEW_RESOLUTION_CHANGED = 272;
    public static final int VIEW_ROLE_PREVIEW = 0;
    public static final int VIEW_WHAT_GLVIEW = 2;
    public static final int VIEW_WHAT_SURFACE = 0;
    public static final int VIEW_WHAT_SURFACE_HOLDER = 3;
    static Vector listeners;

    public ControlUnit()
    {
    }

    public static boolean hasBackCamera()
    {
        boolean flag = false;
        com/skype/android/video/ControlUnit;
        JVM INSTR monitorenter ;
        int i = DeviceProfile.getCameraIndex(0);
        if (i != -1)
        {
            flag = true;
        }
        com/skype/android/video/ControlUnit;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean hasFrontCamera()
    {
        return DeviceProfile.getCameraIndex(1) != -1;
    }

    public static void onStateChanged(int i, int j, int k)
    {
        com/skype/android/video/ControlUnit;
        JVM INSTR monitorenter ;
        Object obj;
        (new StringBuilder("StateChanged!! what:")).append(i).append(" arg1:").append(j).append(" arg2:").append(k);
        obj = listeners;
        if (obj != null) goto _L2; else goto _L1
_L1:
        com/skype/android/video/ControlUnit;
        JVM INSTR monitorexit ;
        return;
_L2:
        int l = 0;
_L4:
        if (l >= listeners.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (StateListener)((WeakReference)listeners.get(l)).get();
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StateListener) (obj)).onStateChanged(i, j, k);
        l++;
        if (true) goto _L4; else goto _L3
_L3:
        listeners.remove(l);
        if (true) goto _L4; else goto _L5
_L5:
        if (true) goto _L1; else goto _L6
_L6:
        Exception exception;
        exception;
        throw exception;
    }

    public static void registerStateListener(StateListener statelistener)
    {
        com/skype/android/video/ControlUnit;
        JVM INSTR monitorenter ;
        if (listeners == null)
        {
            listeners = new Vector();
        }
        listeners.add(new WeakReference(statelistener));
        com/skype/android/video/ControlUnit;
        JVM INSTR monitorexit ;
        return;
        statelistener;
        throw statelistener;
    }

    public static native int registerView(Object obj, int i, int j, int k);

    public static native int sendControlCommand(int i, int j, int k, int l);

    public static boolean unregisterStateListener(StateListener statelistener)
    {
        com/skype/android/video/ControlUnit;
        JVM INSTR monitorenter ;
        if (listeners == null) goto _L2; else goto _L1
_L1:
        boolean flag = listeners.remove(new WeakReference(statelistener));
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        com/skype/android/video/ControlUnit;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        statelistener;
        throw statelistener;
    }

    public static native int unregisterView(int i, int j, int k, int l);
}
