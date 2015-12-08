// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;

import android.net.http.SslError;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core:
//            ReflectionHelper, XWalkView

public class XWalkResourceClient
{

    private static final String BRIDGE_CLASS = "org.xwalk.core.internal.XWalkResourceClientBridge";
    public static final int ERROR_AUTHENTICATION = -4;
    public static final int ERROR_BAD_URL = -12;
    public static final int ERROR_CONNECT = -6;
    public static final int ERROR_FAILED_SSL_HANDSHAKE = -11;
    public static final int ERROR_FILE = -13;
    public static final int ERROR_FILE_NOT_FOUND = -14;
    public static final int ERROR_HOST_LOOKUP = -2;
    public static final int ERROR_IO = -7;
    public static final int ERROR_OK = 0;
    public static final int ERROR_PROXY_AUTHENTICATION = -5;
    public static final int ERROR_REDIRECT_LOOP = -9;
    public static final int ERROR_TIMEOUT = -8;
    public static final int ERROR_TOO_MANY_REQUESTS = -15;
    public static final int ERROR_UNKNOWN = -1;
    public static final int ERROR_UNSUPPORTED_AUTH_SCHEME = -3;
    public static final int ERROR_UNSUPPORTED_SCHEME = -10;
    private Object bridge;
    private Method onLoadFinishedXWalkViewInternalStringMethod;
    private Method onLoadStartedXWalkViewInternalStringMethod;
    private Method onProgressChangedXWalkViewInternalintMethod;
    private Method onReceivedLoadErrorXWalkViewInternalintStringStringMethod;
    private Method onReceivedSslErrorXWalkViewInternalValueCallbackSslErrorMethod;
    private Method shouldInterceptLoadRequestXWalkViewInternalStringMethod;
    private Method shouldOverrideUrlLoadingXWalkViewInternalStringMethod;

    public XWalkResourceClient(XWalkView xwalkview)
    {
        bridge = ReflectionHelper.createInstance("XWalkResourceClientInternalXWalkViewInternalConstructor", new Object[] {
            xwalkview.getBridge(), this
        });
        try
        {
            reflectionInit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (XWalkView xwalkview)
        {
            ReflectionHelper.handleException(xwalkview);
        }
    }

    private void reflectionInit()
        throws NoSuchMethodException, ClassNotFoundException
    {
        Class class1 = bridge.getClass();
        onLoadStartedXWalkViewInternalStringMethod = ReflectionHelper.loadMethod(class1, "onLoadStartedSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", java/lang/String
        });
        onLoadFinishedXWalkViewInternalStringMethod = ReflectionHelper.loadMethod(class1, "onLoadFinishedSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", java/lang/String
        });
        onProgressChangedXWalkViewInternalintMethod = ReflectionHelper.loadMethod(class1, "onProgressChangedSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", Integer.TYPE
        });
        shouldInterceptLoadRequestXWalkViewInternalStringMethod = ReflectionHelper.loadMethod(class1, "shouldInterceptLoadRequestSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", java/lang/String
        });
        onReceivedLoadErrorXWalkViewInternalintStringStringMethod = ReflectionHelper.loadMethod(class1, "onReceivedLoadErrorSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", Integer.TYPE, java/lang/String, java/lang/String
        });
        shouldOverrideUrlLoadingXWalkViewInternalStringMethod = ReflectionHelper.loadMethod(class1, "shouldOverrideUrlLoadingSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", java/lang/String
        });
        onReceivedSslErrorXWalkViewInternalValueCallbackSslErrorMethod = ReflectionHelper.loadMethod(class1, "onReceivedSslErrorSuper", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", android/webkit/ValueCallback, android/net/http/SslError
        });
    }

    Object getBridge()
    {
        return bridge;
    }

    public void onLoadFinished(XWalkView xwalkview, String s)
    {
        ReflectionHelper.invokeMethod(onLoadFinishedXWalkViewInternalStringMethod, bridge, new Object[] {
            xwalkview.getBridge(), s
        });
    }

    public void onLoadStarted(XWalkView xwalkview, String s)
    {
        ReflectionHelper.invokeMethod(onLoadStartedXWalkViewInternalStringMethod, bridge, new Object[] {
            xwalkview.getBridge(), s
        });
    }

    public void onProgressChanged(XWalkView xwalkview, int i)
    {
        ReflectionHelper.invokeMethod(onProgressChangedXWalkViewInternalintMethod, bridge, new Object[] {
            xwalkview.getBridge(), Integer.valueOf(i)
        });
    }

    public void onReceivedLoadError(XWalkView xwalkview, int i, String s, String s1)
    {
        ReflectionHelper.invokeMethod(onReceivedLoadErrorXWalkViewInternalintStringStringMethod, bridge, new Object[] {
            xwalkview.getBridge(), Integer.valueOf(i), s, s1
        });
    }

    public void onReceivedSslError(XWalkView xwalkview, ValueCallback valuecallback, SslError sslerror)
    {
        ReflectionHelper.invokeMethod(onReceivedSslErrorXWalkViewInternalValueCallbackSslErrorMethod, bridge, new Object[] {
            xwalkview.getBridge(), valuecallback, sslerror
        });
    }

    public WebResourceResponse shouldInterceptLoadRequest(XWalkView xwalkview, String s)
    {
        return (WebResourceResponse)ReflectionHelper.invokeMethod(shouldInterceptLoadRequestXWalkViewInternalStringMethod, bridge, new Object[] {
            xwalkview.getBridge(), s
        });
    }

    public boolean shouldOverrideUrlLoading(XWalkView xwalkview, String s)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(shouldOverrideUrlLoadingXWalkViewInternalStringMethod, bridge, new Object[] {
            xwalkview.getBridge(), s
        })).booleanValue();
    }

    static 
    {
        ReflectionHelper.registerConstructor("XWalkResourceClientInternalXWalkViewInternalConstructor", "org.xwalk.core.internal.XWalkResourceClientBridge", new Object[] {
            "org.xwalk.core.internal.XWalkViewBridge", java/lang/Object
        });
    }
}
