// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.os.Message;
import android.util.Log;
import android.webkit.WebView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package org.apache.cordova:
//            NativeToJsMessageQueue

private class <init> extends <init>
{

    private static final int EXECUTE_JS = 194;
    boolean initFailed;
    Method sendMessageMethod;
    final NativeToJsMessageQueue this$0;
    Object webViewCore;

    private void initReflection()
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = NativeToJsMessageQueue.access$600(NativeToJsMessageQueue.this);
        obj2 = android/webkit/WebView;
        obj = obj1;
        Object obj3 = android/webkit/WebView.getDeclaredField("mProvider");
        obj = obj1;
        ((Field) (obj3)).setAccessible(true);
        obj = obj1;
        obj1 = ((Field) (obj3)).get(NativeToJsMessageQueue.access$600(NativeToJsMessageQueue.this));
        obj = obj1;
        obj3 = obj1.getClass();
        obj2 = obj3;
        obj = obj1;
_L2:
        try
        {
            Field field = ((Class) (obj2)).getDeclaredField("mWebViewCore");
            field.setAccessible(true);
            webViewCore = field.get(obj);
            if (webViewCore != null)
            {
                sendMessageMethod = webViewCore.getClass().getDeclaredMethod("sendMessage", new Class[] {
                    android/os/Message
                });
                sendMessageMethod.setAccessible(true);
            }
            return;
        }
        catch (Throwable throwable)
        {
            initFailed = true;
            Log.e("JsMessageQueue", "PrivateApiBridgeMode failed to find the expected APIs.", throwable);
            return;
        }
        Throwable throwable1;
        throwable1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    void onNativeToJsMessageAvailable()
    {
        Message message;
        if (sendMessageMethod == null && !initFailed)
        {
            initReflection();
        }
        if (sendMessageMethod == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        message = Message.obtain(null, 194, NativeToJsMessageQueue.access$500(NativeToJsMessageQueue.this));
        sendMessageMethod.invoke(webViewCore, new Object[] {
            message
        });
        return;
        Throwable throwable;
        throwable;
        Log.e("JsMessageQueue", "Reflection message bridge failed.", throwable);
        return;
    }

    private ()
    {
        this$0 = NativeToJsMessageQueue.this;
        super(NativeToJsMessageQueue.this, null);
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
