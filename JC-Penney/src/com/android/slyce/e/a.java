// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.e;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.slyce.d.b;
import com.android.slyce.j;
import com.android.slyce.k.h;
import org.json.JSONArray;
import org.json.JSONObject;

public class a extends Handler
{

    private final String a = com/android/slyce/e/a.getSimpleName();
    private com.android.slyce.f.a b;

    public a(com.android.slyce.f.a a1)
    {
        super(Looper.getMainLooper());
        b = a1;
    }

    public void a()
    {
        obtainMessage(11).sendToTarget();
    }

    public void a(float f, float f1)
    {
        obtainMessage(6, ((Object) (new Object[] {
            Float.valueOf(f), Float.valueOf(f1)
        }))).sendToTarget();
    }

    public void a(long l, String s, String s1)
    {
        obtainMessage(7, new com.android.slyce.g.a(l, s, s1)).sendToTarget();
    }

    public void a(Bitmap bitmap)
    {
        obtainMessage(10, bitmap).sendToTarget();
    }

    public void a(b b1)
    {
        obtainMessage(9, b1).sendToTarget();
    }

    public void a(j j1)
    {
        obtainMessage(1, j1).sendToTarget();
    }

    public void a(String s)
    {
        obtainMessage(2, s).sendToTarget();
    }

    public void a(JSONArray jsonarray)
    {
        obtainMessage(3, jsonarray).sendToTarget();
    }

    public void a(JSONObject jsonobject)
    {
        obtainMessage(8, jsonobject).sendToTarget();
    }

    public void a(boolean flag)
    {
        obtainMessage(12, Boolean.valueOf(flag)).sendToTarget();
    }

    public void b(String s)
    {
        obtainMessage(4, s).sendToTarget();
    }

    public void b(JSONObject jsonobject)
    {
        obtainMessage(13, jsonobject).sendToTarget();
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        case 5: // '\005'
        default:
            return;

        case 1: // '\001'
            b.a((j)message.obj);
            return;

        case 2: // '\002'
            message = (String)message.obj;
            b.a(message);
            h.a(a, (new StringBuilder()).append("onCameraImageDetected(").append(message).append(")").toString());
            return;

        case 3: // '\003'
            message = (JSONArray)message.obj;
            b.a(message);
            h.a(a, (new StringBuilder()).append("onCameraImageInfoReceived(").append(message).append(")").toString());
            return;

        case 4: // '\004'
            message = (String)message.obj;
            b.b(message);
            h.a(a, (new StringBuilder()).append("onSlyceCameraError(").append(message).append(")").toString());
            return;

        case 6: // '\006'
            message = ((Message) ((Object[])(Object[])message.obj));
            b.a(((Float)message[0]).floatValue(), ((Float)message[1]).floatValue());
            h.a(a, (new StringBuilder()).append("onTap(").append(((Float)message[0]).floatValue()).append(",").append(((Float)message[1]).floatValue()).append(")").toString());
            return;

        case 7: // '\007'
            Object obj = (com.android.slyce.g.a)message.obj;
            long l = ((com.android.slyce.g.a) (obj)).a;
            message = ((com.android.slyce.g.a) (obj)).b;
            obj = ((com.android.slyce.g.a) (obj)).c;
            b.a(l, message, ((String) (obj)));
            h.a(a, (new StringBuilder()).append("onCameraSlyceProgress(").append(l).append(", ").append(message).append(", ").append(((String) (obj))).append(")").toString());
            return;

        case 8: // '\b'
            message = (JSONObject)message.obj;
            b.a(message);
            h.a(a, (new StringBuilder()).append("onCameraResultsReceived(").append(message).append(")").toString());
            return;

        case 9: // '\t'
            message = (b)message.obj;
            b.a(message);
            h.a(a, (new StringBuilder()).append("onCameraSlyceRequestStage(").append(message).append(")").toString());
            return;

        case 10: // '\n'
            b.a((Bitmap)message.obj);
            h.a(a, "onSnap()");
            return;

        case 11: // '\013'
            b.d_();
            h.a(a, "onCameraFinished()");
            return;

        case 12: // '\f'
            boolean flag = ((Boolean)message.obj).booleanValue();
            b.a(flag);
            h.a(a, (new StringBuilder()).append("onCameraPreviewMode(").append(flag).append(")").toString());
            return;

        case 13: // '\r'
            message = (JSONObject)message.obj;
            break;
        }
        b.b(message);
        h.a(a, (new StringBuilder()).append("onCameraBarcodeInfoReceived(").append(message).append(")").toString());
    }
}
