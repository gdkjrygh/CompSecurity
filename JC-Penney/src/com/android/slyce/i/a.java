// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.i;

import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class a extends Handler
    implements android.hardware.Camera.AutoFocusCallback
{

    private static int d = 0;
    private Camera a;
    private boolean b;
    private boolean c;

    protected a(Camera camera)
    {
        b = false;
        c = false;
        android.hardware.Camera.Parameters parameters = camera.getParameters();
        if (parameters.getSupportedFocusModes().contains("auto"))
        {
            parameters.setFocusMode("auto");
        }
        camera.setParameters(parameters);
        a = camera;
    }

    private void b()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        a.cancelAutoFocus();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.e("AutoFocusManager", "Unexpected Runtime Exception while cancelling autofocus");
        return;
    }

    private void c(boolean flag, Rect rect)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        if (flag)
        {
            try
            {
                a(rect);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Rect rect)
            {
                Log.e("AutoFocusManager", "Unexpected Runtime Exception while calling autofocus");
            }
            break MISSING_BLOCK_LABEL_35;
        }
        a.autoFocus(this);
        return;
    }

    protected void a()
    {
        b();
        removeMessages(d);
    }

    public void a(Rect rect)
    {
        android.hardware.Camera.Parameters parameters = a.getParameters();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new android.hardware.Camera.Area(rect, 1000));
        parameters.setFocusAreas(arraylist);
        parameters.setMeteringAreas(arraylist);
        a.setParameters(parameters);
        Log.i("AutoFocusManager", "doTouchFocus with focus areas");
        a.autoFocus(this);
        return;
        rect;
        Log.i("AutoFocusManager", "Unable to perform focus areas");
        a.autoFocus(this);
        return;
        rect;
        a.autoFocus(this);
        throw rect;
    }

    protected void a(boolean flag, Rect rect)
    {
        if (a == null)
        {
            return;
        } else
        {
            b();
            c(flag, rect);
            c = true;
            return;
        }
    }

    protected void b(boolean flag, Rect rect)
    {
        if (!c)
        {
            c = true;
            a();
            a(flag, rect);
        }
    }

    public void handleMessage(Message message)
    {
        if (message.what == d && a != null)
        {
            b();
            c(false, null);
            c = true;
        }
    }

    public void onAutoFocus(boolean flag, Camera camera)
    {
        sendEmptyMessageDelayed(d, 2000L);
        c = false;
        b = flag;
        Log.i("AutoFocusManager", (new StringBuilder()).append("onAutoFocus success = ").append(flag).toString());
    }

}
