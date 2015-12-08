// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.net.ProxyChangeListener;

public final class qyd extends BroadcastReceiver
{

    private ProxyChangeListener a;

    public qyd(ProxyChangeListener proxychangelistener)
    {
        a = proxychangelistener;
        super();
    }

    private static qyc a(Intent intent)
    {
        Object obj;
        Object obj1;
        Class class1;
        Method method;
        int i;
        if (android.os.Build.VERSION.SDK_INT <= 19)
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
            obj1 = intent.getExtras().get(((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("ProxyChangeListener", (new StringBuilder("Using no proxy configuration due to exception:")).append(intent).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("ProxyChangeListener", (new StringBuilder("Using no proxy configuration due to exception:")).append(intent).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("ProxyChangeListener", (new StringBuilder("Using no proxy configuration due to exception:")).append(intent).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("ProxyChangeListener", (new StringBuilder("Using no proxy configuration due to exception:")).append(intent).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("ProxyChangeListener", (new StringBuilder("Using no proxy configuration due to exception:")).append(intent).toString());
            return null;
        }
        if (obj1 == null)
        {
            return null;
        }
        class1 = Class.forName(((String) (obj)));
        obj = class1.getDeclaredMethod("getHost", new Class[0]);
        intent = class1.getDeclaredMethod("getPort", new Class[0]);
        method = class1.getDeclaredMethod("getExclusionList", new Class[0]);
        obj = (String)((Method) (obj)).invoke(obj1, new Object[0]);
        i = ((Integer)intent.invoke(obj1, new Object[0])).intValue();
        if (android.os.Build.VERSION.SDK_INT <= 19)
        {
            intent = ((String)method.invoke(obj1, new Object[0])).split(",");
        } else
        {
            intent = (String[])method.invoke(obj1, new Object[0]);
        }
        if (android.os.Build.VERSION.SDK_INT == 19)
        {
            obj1 = (String)class1.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(obj1, new Object[0]);
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                return new qyc(((String) (obj)), i, ((String) (obj1)), intent);
            }
            break MISSING_BLOCK_LABEL_248;
        }
        if (android.os.Build.VERSION.SDK_INT > 19)
        {
            obj1 = (Uri)class1.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(obj1, new Object[0]);
            if (!Uri.EMPTY.equals(obj1))
            {
                return new qyc(((String) (obj)), i, ((Uri) (obj1)).toString(), intent);
            }
        }
        intent = new qyc(((String) (obj)), i, null, intent);
        return intent;
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE"))
        {
            ProxyChangeListener.a(a, a(intent));
        }
    }
}
