// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.net.http.SslError;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkResourceClientInternal, ReflectionHelper, XWalkViewBridge, XWalkViewInternal

public class XWalkResourceClientBridge extends XWalkResourceClientInternal
{

    private static final String WRAPPER_CLASS = "org.xwalk.core.Object";
    private Method onLoadFinishedXWalkViewInternalStringMethod;
    private Method onLoadStartedXWalkViewInternalStringMethod;
    private Method onProgressChangedXWalkViewInternalintMethod;
    private Method onReceivedLoadErrorXWalkViewInternalintStringStringMethod;
    private Method onReceivedSslErrorXWalkViewInternalValueCallbackSslErrorMethod;
    private Method shouldInterceptLoadRequestXWalkViewInternalStringMethod;
    private Method shouldOverrideUrlLoadingXWalkViewInternalStringMethod;
    private Object wrapper;

    public XWalkResourceClientBridge(XWalkViewBridge xwalkviewbridge, Object obj)
    {
        super(xwalkviewbridge);
        wrapper = obj;
        try
        {
            reflectionInit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (XWalkViewBridge xwalkviewbridge)
        {
            ReflectionHelper.handleException(xwalkviewbridge);
        }
    }

    private void reflectionInit()
        throws NoSuchMethodException, ClassNotFoundException
    {
        Class class1 = wrapper.getClass();
        onLoadStartedXWalkViewInternalStringMethod = ReflectionHelper.loadMethod(class1, "onLoadStarted", new Object[] {
            "org.xwalk.core.XWalkView", java/lang/String
        });
        onLoadFinishedXWalkViewInternalStringMethod = ReflectionHelper.loadMethod(class1, "onLoadFinished", new Object[] {
            "org.xwalk.core.XWalkView", java/lang/String
        });
        onProgressChangedXWalkViewInternalintMethod = ReflectionHelper.loadMethod(class1, "onProgressChanged", new Object[] {
            "org.xwalk.core.XWalkView", Integer.TYPE
        });
        shouldInterceptLoadRequestXWalkViewInternalStringMethod = ReflectionHelper.loadMethod(class1, "shouldInterceptLoadRequest", new Object[] {
            "org.xwalk.core.XWalkView", java/lang/String
        });
        onReceivedLoadErrorXWalkViewInternalintStringStringMethod = ReflectionHelper.loadMethod(class1, "onReceivedLoadError", new Object[] {
            "org.xwalk.core.XWalkView", Integer.TYPE, java/lang/String, java/lang/String
        });
        shouldOverrideUrlLoadingXWalkViewInternalStringMethod = ReflectionHelper.loadMethod(class1, "shouldOverrideUrlLoading", new Object[] {
            "org.xwalk.core.XWalkView", java/lang/String
        });
        onReceivedSslErrorXWalkViewInternalValueCallbackSslErrorMethod = ReflectionHelper.loadMethod(class1, "onReceivedSslError", new Object[] {
            "org.xwalk.core.XWalkView", android/webkit/ValueCallback, android/net/http/SslError
        });
    }

    public Object getWrapper()
    {
        return wrapper;
    }

    public void onLoadFinished(XWalkViewBridge xwalkviewbridge, String s)
    {
        ReflectionHelper.invokeMethod(onLoadFinishedXWalkViewInternalStringMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), s
        });
    }

    public void onLoadFinished(XWalkViewInternal xwalkviewinternal, String s)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onLoadFinished((XWalkViewBridge)xwalkviewinternal, s);
            return;
        } else
        {
            super.onLoadFinished(xwalkviewinternal, s);
            return;
        }
    }

    public void onLoadFinishedSuper(XWalkViewBridge xwalkviewbridge, String s)
    {
        super.onLoadFinished(xwalkviewbridge, s);
    }

    public void onLoadStarted(XWalkViewBridge xwalkviewbridge, String s)
    {
        ReflectionHelper.invokeMethod(onLoadStartedXWalkViewInternalStringMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), s
        });
    }

    public void onLoadStarted(XWalkViewInternal xwalkviewinternal, String s)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onLoadStarted((XWalkViewBridge)xwalkviewinternal, s);
            return;
        } else
        {
            super.onLoadStarted(xwalkviewinternal, s);
            return;
        }
    }

    public void onLoadStartedSuper(XWalkViewBridge xwalkviewbridge, String s)
    {
        super.onLoadStarted(xwalkviewbridge, s);
    }

    public void onProgressChanged(XWalkViewBridge xwalkviewbridge, int i)
    {
        ReflectionHelper.invokeMethod(onProgressChangedXWalkViewInternalintMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), Integer.valueOf(i)
        });
    }

    public void onProgressChanged(XWalkViewInternal xwalkviewinternal, int i)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onProgressChanged((XWalkViewBridge)xwalkviewinternal, i);
            return;
        } else
        {
            super.onProgressChanged(xwalkviewinternal, i);
            return;
        }
    }

    public void onProgressChangedSuper(XWalkViewBridge xwalkviewbridge, int i)
    {
        super.onProgressChanged(xwalkviewbridge, i);
    }

    public void onReceivedLoadError(XWalkViewBridge xwalkviewbridge, int i, String s, String s1)
    {
        ReflectionHelper.invokeMethod(onReceivedLoadErrorXWalkViewInternalintStringStringMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), Integer.valueOf(i), s, s1
        });
    }

    public void onReceivedLoadError(XWalkViewInternal xwalkviewinternal, int i, String s, String s1)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onReceivedLoadError((XWalkViewBridge)xwalkviewinternal, i, s, s1);
            return;
        } else
        {
            super.onReceivedLoadError(xwalkviewinternal, i, s, s1);
            return;
        }
    }

    public void onReceivedLoadErrorSuper(XWalkViewBridge xwalkviewbridge, int i, String s, String s1)
    {
        super.onReceivedLoadError(xwalkviewbridge, i, s, s1);
    }

    public void onReceivedSslError(XWalkViewBridge xwalkviewbridge, ValueCallback valuecallback, SslError sslerror)
    {
        ReflectionHelper.invokeMethod(onReceivedSslErrorXWalkViewInternalValueCallbackSslErrorMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), valuecallback, sslerror
        });
    }

    public void onReceivedSslError(XWalkViewInternal xwalkviewinternal, ValueCallback valuecallback, SslError sslerror)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            onReceivedSslError((XWalkViewBridge)xwalkviewinternal, valuecallback, sslerror);
            return;
        } else
        {
            super.onReceivedSslError(xwalkviewinternal, valuecallback, sslerror);
            return;
        }
    }

    public void onReceivedSslErrorSuper(XWalkViewBridge xwalkviewbridge, ValueCallback valuecallback, SslError sslerror)
    {
        super.onReceivedSslError(xwalkviewbridge, valuecallback, sslerror);
    }

    public WebResourceResponse shouldInterceptLoadRequest(XWalkViewBridge xwalkviewbridge, String s)
    {
        return (WebResourceResponse)ReflectionHelper.invokeMethod(shouldInterceptLoadRequestXWalkViewInternalStringMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), s
        });
    }

    public WebResourceResponse shouldInterceptLoadRequest(XWalkViewInternal xwalkviewinternal, String s)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            return shouldInterceptLoadRequest((XWalkViewBridge)xwalkviewinternal, s);
        } else
        {
            return super.shouldInterceptLoadRequest(xwalkviewinternal, s);
        }
    }

    public WebResourceResponse shouldInterceptLoadRequestSuper(XWalkViewBridge xwalkviewbridge, String s)
    {
        s = super.shouldInterceptLoadRequest(xwalkviewbridge, s);
        xwalkviewbridge = s;
        if (s == null)
        {
            xwalkviewbridge = null;
        }
        return xwalkviewbridge;
    }

    public boolean shouldOverrideUrlLoading(XWalkViewBridge xwalkviewbridge, String s)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(shouldOverrideUrlLoadingXWalkViewInternalStringMethod, wrapper, new Object[] {
            xwalkviewbridge.getWrapper(), s
        })).booleanValue();
    }

    public boolean shouldOverrideUrlLoading(XWalkViewInternal xwalkviewinternal, String s)
    {
        if (xwalkviewinternal instanceof XWalkViewBridge)
        {
            return shouldOverrideUrlLoading((XWalkViewBridge)xwalkviewinternal, s);
        } else
        {
            return super.shouldOverrideUrlLoading(xwalkviewinternal, s);
        }
    }

    public boolean shouldOverrideUrlLoadingSuper(XWalkViewBridge xwalkviewbridge, String s)
    {
        return super.shouldOverrideUrlLoading(xwalkviewbridge, s);
    }
}
