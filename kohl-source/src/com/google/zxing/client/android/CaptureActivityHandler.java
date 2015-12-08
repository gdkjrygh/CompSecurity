// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.zxing.Result;
import com.google.zxing.client.android.camera.CameraManager;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.google.zxing.client.android:
//            DecodeThread, ViewfinderResultPointCallback, CaptureActivity

public final class CaptureActivityHandler extends Handler
{
    private static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State DONE;
        public static final State PREVIEW;
        public static final State SUCCESS;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/zxing/client/android/CaptureActivityHandler$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            PREVIEW = new State("PREVIEW", 0);
            SUCCESS = new State("SUCCESS", 1);
            DONE = new State("DONE", 2);
            $VALUES = (new State[] {
                PREVIEW, SUCCESS, DONE
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = com/google/zxing/client/android/CaptureActivityHandler.getSimpleName();
    private final CaptureActivity activity;
    private final CameraManager cameraManager;
    private final DecodeThread decodeThread;
    private State state;

    CaptureActivityHandler(CaptureActivity captureactivity, Collection collection, Map map, String s, CameraManager cameramanager)
    {
        activity = captureactivity;
        decodeThread = new DecodeThread(captureactivity, collection, map, s, new ViewfinderResultPointCallback(captureactivity.getViewfinderView()));
        decodeThread.start();
        state = State.SUCCESS;
        cameraManager = cameramanager;
        cameramanager.startPreview();
        restartPreviewAndDecode();
    }

    private void restartPreviewAndDecode()
    {
        if (state == State.SUCCESS)
        {
            state = State.PREVIEW;
            cameraManager.requestPreviewFrame(decodeThread.getHandler(), R.id.decode);
            activity.drawViewfinder();
        }
    }

    public void handleMessage(Message message)
    {
        if (message.what == R.id.restart_preview)
        {
            Log.d(TAG, "Got restart preview message");
            restartPreviewAndDecode();
        } else
        {
            if (message.what == R.id.decode_succeeded)
            {
                Log.d(TAG, "Got decode succeeded message");
                state = State.SUCCESS;
                Bundle bundle = message.getData();
                Bitmap bitmap = null;
                Object obj1 = null;
                float f = 1.0F;
                if (bundle != null)
                {
                    byte abyte0[] = bundle.getByteArray("barcode_bitmap");
                    bitmap = obj1;
                    if (abyte0 != null)
                    {
                        bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, null).copy(android.graphics.Bitmap.Config.ARGB_8888, true);
                    }
                    f = bundle.getFloat("barcode_scaled_factor");
                }
                activity.handleDecode((Result)message.obj, bitmap, f);
                return;
            }
            if (message.what == R.id.decode_failed)
            {
                state = State.PREVIEW;
                cameraManager.requestPreviewFrame(decodeThread.getHandler(), R.id.decode);
                return;
            }
            if (message.what == R.id.return_scan_result)
            {
                Log.d(TAG, "Got return scan result message");
                activity.setResult(-1, (Intent)message.obj);
                activity.finish();
                return;
            }
            if (message.what == R.id.launch_product_query)
            {
                Log.d(TAG, "Got product query message");
                String s = (String)message.obj;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(0x80000);
                intent.setData(Uri.parse(s));
                ResolveInfo resolveinfo = activity.getPackageManager().resolveActivity(intent, 0x10000);
                Object obj = null;
                message = obj;
                if (resolveinfo != null)
                {
                    message = obj;
                    if (resolveinfo.activityInfo != null)
                    {
                        message = resolveinfo.activityInfo.packageName;
                        Log.d(TAG, (new StringBuilder()).append("Using browser in package ").append(message).toString());
                    }
                }
                if ("com.android.browser".equals(message) || "com.android.chrome".equals(message))
                {
                    intent.setPackage(message);
                    intent.addFlags(0x10000000);
                    intent.putExtra("com.android.browser.application_id", message);
                }
                try
                {
                    activity.startActivity(intent);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    Log.w(TAG, (new StringBuilder()).append("Can't find anything to handle VIEW of URI ").append(s).toString());
                }
                return;
            }
        }
    }

    public void quitSynchronously()
    {
        state = State.DONE;
        cameraManager.stopPreview();
        Message.obtain(decodeThread.getHandler(), R.id.quit).sendToTarget();
        try
        {
            decodeThread.join(500L);
        }
        catch (InterruptedException interruptedexception) { }
        removeMessages(R.id.decode_succeeded);
        removeMessages(R.id.decode_failed);
    }

}
