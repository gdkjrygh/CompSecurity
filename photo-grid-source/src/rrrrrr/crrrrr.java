// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.immersion.hapticmediasdk.MediaTaskManager;
import com.immersion.hapticmediasdk.controllers.MediaController;
import java.util.concurrent.atomic.AtomicInteger;

public class crrrrr extends Handler
{

    public static int b042104210421042104210421 = 0;
    public static int b042104210421042104210421 = 2;
    public static int b042104210421042104210421 = 1;
    public static int b042104210421042104210421 = 1;
    public final MediaController b041704170417041704170417;

    public crrrrr(MediaController mediacontroller, Looper looper)
    {
        b041704170417041704170417 = mediacontroller;
        super(looper);
    }

    public static int b042104210421042104210421()
    {
        return 35;
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 6 8: default 209
    //                   6 32
    //                   7 188
    //                   8 200;
           goto _L1 _L2 _L3 _L4
_L1:
        break MISSING_BLOCK_LABEL_209;
_L2:
        int i;
        int j;
        if (MediaController.b041104110411041104110411(b041704170417041704170417).get() != message.arg1)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        i = MediaController.b043B043B043B043B043B043B(b041704170417041704170417).get();
        j = message.arg2;
        if (i != j)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        try
        {
            message = MediaController.b043B043B043B043B043B043B(b041704170417041704170417);
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        i = b042104210421042104210421;
        switch ((i * (b042104210421042104210421 + i)) % b042104210421042104210421)
        {
        default:
            b042104210421042104210421 = 55;
            b042104210421042104210421 = b042104210421042104210421();
            break;

        case 0: // '\0'
            break;
        }
        if (message.getSDKStatus() != com.immersion.hapticmediasdk.HapticContentSDK.SDKStatus.PAUSED_DUE_TO_BUFFERING) goto _L6; else goto _L5
_L5:
        message = b041704170417041704170417;
        MediaController.b043B043B043B043B043B043B(message).transitToState(com.immersion.hapticmediasdk.HapticContentSDK.SDKStatus.PLAYING);
        return;
_L6:
        MediaController mediacontroller;
        message = b041704170417041704170417;
        mediacontroller = b041704170417041704170417;
        try
        {
            MediaController.b043B043B043B043B043B043B(message, MediaController.b041104110411041104110411(mediacontroller).get(), SystemClock.uptimeMillis());
            b041704170417041704170417.playbackStarted();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
_L3:
        MediaController.b043B043B043B043B043B043B(b041704170417041704170417, message.arg1);
        return;
_L4:
        MediaController.b043B043B043B043B043B043B(b041704170417041704170417, message);
        return;
    }
}
