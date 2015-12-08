// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkJavascriptResultHandlerInternal, ReflectionHelper

public class XWalkJavascriptResultHandlerBridge extends XWalkJavascriptResultHandlerInternal
{

    private static final String WRAPPER_CLASS = "org.xwalk.core.Object";
    private Method cancelMethod;
    private Method confirmMethod;
    private Method confirmWithResultStringMethod;
    private XWalkJavascriptResultHandlerInternal internal;
    private Object wrapper;

    XWalkJavascriptResultHandlerBridge(XWalkJavascriptResultHandlerInternal xwalkjavascriptresulthandlerinternal)
    {
        internal = null;
        internal = xwalkjavascriptresulthandlerinternal;
        wrapper = ReflectionHelper.createInstance("XWalkJavascriptResultHandlerBridgeConstructor", new Object[] {
            this
        });
        try
        {
            reflectionInit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (XWalkJavascriptResultHandlerInternal xwalkjavascriptresulthandlerinternal)
        {
            ReflectionHelper.handleException(xwalkjavascriptresulthandlerinternal);
        }
    }

    private void reflectionInit()
        throws NoSuchMethodException, ClassNotFoundException
    {
        Class class1 = wrapper.getClass();
        confirmMethod = ReflectionHelper.loadMethod(class1, "confirm", new Object[0]);
        confirmWithResultStringMethod = ReflectionHelper.loadMethod(class1, "confirmWithResult", new Object[] {
            java/lang/String
        });
        cancelMethod = ReflectionHelper.loadMethod(class1, "cancel", new Object[0]);
    }

    public void cancel()
    {
        ReflectionHelper.invokeMethod(cancelMethod, wrapper, new Object[0]);
    }

    public void cancelSuper()
    {
        if (internal == null)
        {
            super.cancel();
            return;
        } else
        {
            internal.cancel();
            return;
        }
    }

    public void confirm()
    {
        ReflectionHelper.invokeMethod(confirmMethod, wrapper, new Object[0]);
    }

    public void confirmSuper()
    {
        if (internal == null)
        {
            super.confirm();
            return;
        } else
        {
            internal.confirm();
            return;
        }
    }

    public void confirmWithResult(String s)
    {
        ReflectionHelper.invokeMethod(confirmWithResultStringMethod, wrapper, new Object[] {
            s
        });
    }

    public void confirmWithResultSuper(String s)
    {
        if (internal == null)
        {
            super.confirmWithResult(s);
            return;
        } else
        {
            internal.confirmWithResult(s);
            return;
        }
    }

    public Object getWrapper()
    {
        return wrapper;
    }

    static 
    {
        ReflectionHelper.registerConstructor("XWalkJavascriptResultHandlerBridgeConstructor", "org.xwalk.core.XWalkJavascriptResultHandler", new Object[] {
            java/lang/Object
        });
    }
}
