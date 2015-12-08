// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;

import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core:
//            XWalkJavascriptResult, ReflectionHelper

public class XWalkJavascriptResultHandler
    implements XWalkJavascriptResult
{

    private static final String BRIDGE_CLASS = "org.xwalk.core.internal.XWalkJavascriptResultHandlerBridge";
    private Object bridge;
    private Method cancelMethod;
    private Method confirmMethod;
    private Method confirmWithResultStringMethod;

    public XWalkJavascriptResultHandler(Object obj)
    {
        bridge = obj;
        try
        {
            reflectionInit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ReflectionHelper.handleException(((Exception) (obj)));
        }
    }

    private void reflectionInit()
        throws NoSuchMethodException, ClassNotFoundException
    {
        Class class1 = bridge.getClass();
        confirmMethod = ReflectionHelper.loadMethod(class1, "confirmSuper", new Object[0]);
        confirmWithResultStringMethod = ReflectionHelper.loadMethod(class1, "confirmWithResultSuper", new Object[] {
            java/lang/String
        });
        cancelMethod = ReflectionHelper.loadMethod(class1, "cancelSuper", new Object[0]);
    }

    public void cancel()
    {
        ReflectionHelper.invokeMethod(cancelMethod, bridge, new Object[0]);
    }

    public void confirm()
    {
        ReflectionHelper.invokeMethod(confirmMethod, bridge, new Object[0]);
    }

    public void confirmWithResult(String s)
    {
        ReflectionHelper.invokeMethod(confirmWithResultStringMethod, bridge, new Object[] {
            s
        });
    }

    Object getBridge()
    {
        return bridge;
    }
}
