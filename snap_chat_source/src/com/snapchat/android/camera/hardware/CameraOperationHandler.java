// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.hardware;

import Mf;
import android.os.Looper;
import android.os.Message;
import com.snapchat.android.Timber;
import com.snapchat.android.util.WaitDoneHandler;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;

public final class CameraOperationHandler extends WaitDoneHandler
{
    public static final class CameraOperationType extends Enum
    {

        private static final CameraOperationType $VALUES[];
        public static final CameraOperationType ADD_CALLBACK_BUFFER;
        public static final CameraOperationType AUTOFOCUS;
        public static final CameraOperationType GET_PARAMETERS;
        public static final CameraOperationType LOCK;
        public static final CameraOperationType OPEN;
        public static final CameraOperationType RECONNECT;
        public static final CameraOperationType RELEASE;
        public static final CameraOperationType SET_CALLBACK_WITH_BUFFER;
        public static final CameraOperationType SET_ORIENTATION;
        public static final CameraOperationType SET_PARAMETERS;
        public static final CameraOperationType SET_TEXTURE;
        public static final CameraOperationType START_PREVIEW;
        public static final CameraOperationType STOP_PREVIEW;
        public static final CameraOperationType UNLOCK;

        public static CameraOperationType valueOf(String s)
        {
            return (CameraOperationType)Enum.valueOf(com/snapchat/android/camera/hardware/CameraOperationHandler$CameraOperationType, s);
        }

        public static CameraOperationType[] values()
        {
            return (CameraOperationType[])$VALUES.clone();
        }

        static 
        {
            OPEN = new CameraOperationType("OPEN", 0);
            RELEASE = new CameraOperationType("RELEASE", 1);
            SET_PARAMETERS = new CameraOperationType("SET_PARAMETERS", 2);
            GET_PARAMETERS = new CameraOperationType("GET_PARAMETERS", 3);
            UNLOCK = new CameraOperationType("UNLOCK", 4);
            LOCK = new CameraOperationType("LOCK", 5);
            RECONNECT = new CameraOperationType("RECONNECT", 6);
            AUTOFOCUS = new CameraOperationType("AUTOFOCUS", 7);
            START_PREVIEW = new CameraOperationType("START_PREVIEW", 8);
            STOP_PREVIEW = new CameraOperationType("STOP_PREVIEW", 9);
            SET_CALLBACK_WITH_BUFFER = new CameraOperationType("SET_CALLBACK_WITH_BUFFER", 10);
            SET_TEXTURE = new CameraOperationType("SET_TEXTURE", 11);
            SET_ORIENTATION = new CameraOperationType("SET_ORIENTATION", 12);
            ADD_CALLBACK_BUFFER = new CameraOperationType("ADD_CALLBACK_BUFFER", 13);
            $VALUES = (new CameraOperationType[] {
                OPEN, RELEASE, SET_PARAMETERS, GET_PARAMETERS, UNLOCK, LOCK, RECONNECT, AUTOFOCUS, START_PREVIEW, STOP_PREVIEW, 
                SET_CALLBACK_WITH_BUFFER, SET_TEXTURE, SET_ORIENTATION, ADD_CALLBACK_BUFFER
            });
        }

        private CameraOperationType(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface a
    {

        public abstract void a();
    }


    public CameraOperationHandler(Looper looper)
    {
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        a a1 = (a)message.obj;
        message = CameraOperationType.values()[message.what];
        if (message != CameraOperationType.ADD_CALLBACK_BUFFER)
        {
            Timber.c("CameraOperationHandler", "Camera Operation [%s] is executing", new Object[] {
                message.name()
            });
        }
        try
        {
            a1.a();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            message = (new StringBuilder("Camera Operation ")).append(message.name()).append(" failed to execute").toString();
            if (ReleaseManager.e())
            {
                Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, message));
            }
            Timber.e("CameraOperationHandler", (new StringBuilder()).append(message).append(": ").append(runtimeexception).toString(), new Object[0]);
            return;
        }
    }
}
