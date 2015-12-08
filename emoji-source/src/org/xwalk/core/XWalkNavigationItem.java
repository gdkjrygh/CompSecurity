// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;

import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core:
//            ReflectionHelper

public class XWalkNavigationItem
{

    private static final String BRIDGE_CLASS = "org.xwalk.core.internal.XWalkNavigationItemBridge";
    private Object bridge;
    private Method getOriginalUrlMethod;
    private Method getTitleMethod;
    private Method getUrlMethod;

    public XWalkNavigationItem(Object obj)
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
        getUrlMethod = ReflectionHelper.loadMethod(class1, "getUrlSuper", new Object[0]);
        getOriginalUrlMethod = ReflectionHelper.loadMethod(class1, "getOriginalUrlSuper", new Object[0]);
        getTitleMethod = ReflectionHelper.loadMethod(class1, "getTitleSuper", new Object[0]);
    }

    Object getBridge()
    {
        return bridge;
    }

    public String getOriginalUrl()
    {
        return (String)ReflectionHelper.invokeMethod(getOriginalUrlMethod, bridge, new Object[0]);
    }

    public String getTitle()
    {
        return (String)ReflectionHelper.invokeMethod(getTitleMethod, bridge, new Object[0]);
    }

    public String getUrl()
    {
        return (String)ReflectionHelper.invokeMethod(getUrlMethod, bridge, new Object[0]);
    }
}
