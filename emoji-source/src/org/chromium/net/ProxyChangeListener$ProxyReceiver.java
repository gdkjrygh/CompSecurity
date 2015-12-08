// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package org.chromium.net:
//            ProxyChangeListener

private class <init> extends BroadcastReceiver
{

    final ProxyChangeListener this$0;

    private <init> extractNewProxy(Intent intent)
    {
        Object obj;
        Object obj1;
        Method method;
        int i;
        if (android.os.fig <= 19)
        {
            obj = "android.net.ProxyProperties";
            obj1 = "proxy";
        } else
        {
            obj = "android.net.ProxyInfo";
            obj1 = "android.intent.extra.PROXY_INFO";
        }
        try
        {
            intent = ((Intent) (intent.getExtras().get(((String) (obj1)))));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("ProxyChangeListener", (new StringBuilder()).append("Using no proxy configuration due to exception:").append(intent).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("ProxyChangeListener", (new StringBuilder()).append("Using no proxy configuration due to exception:").append(intent).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("ProxyChangeListener", (new StringBuilder()).append("Using no proxy configuration due to exception:").append(intent).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("ProxyChangeListener", (new StringBuilder()).append("Using no proxy configuration due to exception:").append(intent).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("ProxyChangeListener", (new StringBuilder()).append("Using no proxy configuration due to exception:").append(intent).toString());
            return null;
        }
        if (intent == null)
        {
            return null;
        }
        obj1 = Class.forName(((String) (obj)));
        obj = ((Class) (obj1)).getDeclaredMethod("getHost", new Class[0]);
        method = ((Class) (obj1)).getDeclaredMethod("getPort", new Class[0]);
        obj = (String)((Method) (obj)).invoke(intent, new Object[0]);
        i = ((Integer)method.invoke(intent, new Object[0])).intValue();
        if (android.os.fig != 19)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        intent = (String)((Class) (obj1)).getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(intent, new Object[0]);
        if (TextUtils.isEmpty(intent))
        {
            break MISSING_BLOCK_LABEL_252;
        }
        intent = new nit>(((String) (obj)), i, intent);
        return intent;
        if (android.os.fig <= 19)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        intent = (Uri)((Class) (obj1)).getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(intent, new Object[0]);
        if (Uri.EMPTY.equals(intent))
        {
            break MISSING_BLOCK_LABEL_252;
        }
        intent = new nit>(((String) (obj)), i, intent.toString());
        return intent;
        intent = new nit>(((String) (obj)), i, null);
        return intent;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE"))
        {
            ProxyChangeListener.access$000(ProxyChangeListener.this, extractNewProxy(intent));
        }
    }

    private ()
    {
        this$0 = ProxyChangeListener.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
