// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.slyce.f.c;
import com.android.slyce.g.a;
import com.android.slyce.j;
import com.android.slyce.k.h;
import org.json.JSONArray;
import org.json.JSONObject;

public class b extends Handler
{

    private final String a = com/android/slyce/e/b.getSimpleName();
    private c b;

    public b(c c1)
    {
        super(Looper.getMainLooper());
        b = c1;
    }

    public void a()
    {
        obtainMessage(7).sendToTarget();
    }

    public void a(long l, String s, String s1)
    {
        obtainMessage(1, new a(l, s, s1)).sendToTarget();
    }

    public void a(com.android.slyce.d.b b1)
    {
        obtainMessage(5, b1).sendToTarget();
    }

    public void a(j j1)
    {
        obtainMessage(0, j1).sendToTarget();
    }

    public void a(String s)
    {
        obtainMessage(2, s).sendToTarget();
    }

    public void a(JSONArray jsonarray)
    {
        obtainMessage(6, jsonarray).sendToTarget();
    }

    public void a(JSONObject jsonobject)
    {
        obtainMessage(3, jsonobject).sendToTarget();
    }

    public void b(String s)
    {
        obtainMessage(4, s).sendToTarget();
    }

    public void b(JSONObject jsonobject)
    {
        obtainMessage(8, jsonobject).sendToTarget();
    }

    public void c(JSONObject jsonobject)
    {
        obtainMessage(9, jsonobject).sendToTarget();
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            message = (j)message.obj;
            b.a(message);
            return;

        case 1: // '\001'
            Object obj = (a)message.obj;
            long l = ((a) (obj)).a;
            message = ((a) (obj)).b;
            obj = ((a) (obj)).c;
            b.a(l, message, ((String) (obj)));
            h.a(a, (new StringBuilder()).append("onSlyceProgress(").append(l).append(", ").append(message).append(", ").append(((String) (obj))).append(")").toString());
            return;

        case 2: // '\002'
            message = (String)message.obj;
            b.a(message);
            h.a(a, (new StringBuilder()).append("onImageDetected(").append(message).append(")").toString());
            return;

        case 3: // '\003'
            message = (JSONObject)message.obj;
            b.a(message);
            h.a(a, (new StringBuilder()).append("onResultsReceived(").append(message).append(")").toString());
            return;

        case 4: // '\004'
            message = (String)message.obj;
            b.b(message);
            h.a(a, (new StringBuilder()).append("onError(").append(message).append(")").toString());
            return;

        case 5: // '\005'
            message = (com.android.slyce.d.b)message.obj;
            b.a(message);
            h.a(a, (new StringBuilder()).append("onSlyceRequestStage(").append(message).append(")").toString());
            return;

        case 6: // '\006'
            message = (JSONArray)message.obj;
            b.a(message);
            h.a(a, (new StringBuilder()).append("onImageInfoReceived(").append(message).append(")").toString());
            return;

        case 7: // '\007'
            b.a();
            h.a(a, "onFinished()");
            return;

        case 8: // '\b'
            message = (JSONObject)message.obj;
            b.b(message);
            h.a(a, (new StringBuilder()).append("onItemDescriptionReceived(").append(message).append(")").toString());
            return;

        case 9: // '\t'
            message = (JSONObject)message.obj;
            break;
        }
        b.c(message);
        h.a(a, (new StringBuilder()).append("onBarcodeInfoReceived(").append(message).append(")").toString());
    }
}
