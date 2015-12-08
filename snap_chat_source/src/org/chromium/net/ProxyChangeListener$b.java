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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package org.chromium.net:
//            ProxyChangeListener

final class <init> extends BroadcastReceiver
{

    private ProxyChangeListener a;

    private static <init> a(Intent intent)
    {
        Object obj;
        Object obj1;
        Class class1;
        Method method;
        int i;
        if (android.os.ner.a <= 19)
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
            (new StringBuilder("Using no proxy configuration due to exception:")).append(intent);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            (new StringBuilder("Using no proxy configuration due to exception:")).append(intent);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            (new StringBuilder("Using no proxy configuration due to exception:")).append(intent);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            (new StringBuilder("Using no proxy configuration due to exception:")).append(intent);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            (new StringBuilder("Using no proxy configuration due to exception:")).append(intent);
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
        if (android.os. <= 19)
        {
            intent = ((String)method.invoke(obj1, new Object[0])).split(",");
        } else
        {
            intent = (String[])method.invoke(obj1, new Object[0]);
        }
        if (android.os. == 19)
        {
            obj1 = (String)class1.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(obj1, new Object[0]);
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                return new <init>(((String) (obj)), i, ((String) (obj1)), intent);
            }
            break MISSING_BLOCK_LABEL_248;
        }
        if (android.os.ner.a > 19)
        {
            obj1 = (Uri)class1.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(obj1, new Object[0]);
            if (!Uri.EMPTY.equals(obj1))
            {
                return new <init>(((String) (obj)), i, ((Uri) (obj1)).toString(), intent);
            }
        }
        intent = new <init>(((String) (obj)), i, null, intent);
        return intent;
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE"))
        {
            ProxyChangeListener.a(a, a(intent));
        }
    }

    private tion(ProxyChangeListener proxychangelistener)
    {
        a = proxychangelistener;
        super();
    }

    >(ProxyChangeListener proxychangelistener, byte byte0)
    {
        this(proxychangelistener);
    }
}
