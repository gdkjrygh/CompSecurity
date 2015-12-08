// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkNavigationItemInternal, ReflectionHelper

public class XWalkNavigationItemBridge extends XWalkNavigationItemInternal
{

    private static final String WRAPPER_CLASS = "org.xwalk.core.Object";
    private Method getOriginalUrlMethod;
    private Method getTitleMethod;
    private Method getUrlMethod;
    private XWalkNavigationItemInternal internal;
    private Object wrapper;

    XWalkNavigationItemBridge(XWalkNavigationItemInternal xwalknavigationiteminternal)
    {
        internal = null;
        internal = xwalknavigationiteminternal;
        wrapper = ReflectionHelper.createInstance("XWalkNavigationItemBridgeConstructor", new Object[] {
            this
        });
        try
        {
            reflectionInit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (XWalkNavigationItemInternal xwalknavigationiteminternal)
        {
            ReflectionHelper.handleException(xwalknavigationiteminternal);
        }
    }

    private void reflectionInit()
        throws NoSuchMethodException, ClassNotFoundException
    {
        Class class1 = wrapper.getClass();
        getUrlMethod = ReflectionHelper.loadMethod(class1, "getUrl", new Object[0]);
        getOriginalUrlMethod = ReflectionHelper.loadMethod(class1, "getOriginalUrl", new Object[0]);
        getTitleMethod = ReflectionHelper.loadMethod(class1, "getTitle", new Object[0]);
    }

    public String getOriginalUrl()
    {
        return (String)ReflectionHelper.invokeMethod(getOriginalUrlMethod, wrapper, new Object[0]);
    }

    public String getOriginalUrlSuper()
    {
        String s;
        String s1;
        if (internal == null)
        {
            s = super.getOriginalUrl();
        } else
        {
            s = internal.getOriginalUrl();
        }
        s1 = s;
        if (s == null)
        {
            s1 = null;
        }
        return s1;
    }

    public String getTitle()
    {
        return (String)ReflectionHelper.invokeMethod(getTitleMethod, wrapper, new Object[0]);
    }

    public String getTitleSuper()
    {
        String s;
        String s1;
        if (internal == null)
        {
            s = super.getTitle();
        } else
        {
            s = internal.getTitle();
        }
        s1 = s;
        if (s == null)
        {
            s1 = null;
        }
        return s1;
    }

    public String getUrl()
    {
        return (String)ReflectionHelper.invokeMethod(getUrlMethod, wrapper, new Object[0]);
    }

    public String getUrlSuper()
    {
        String s;
        String s1;
        if (internal == null)
        {
            s = super.getUrl();
        } else
        {
            s = internal.getUrl();
        }
        s1 = s;
        if (s == null)
        {
            s1 = null;
        }
        return s1;
    }

    public Object getWrapper()
    {
        return wrapper;
    }

    static 
    {
        ReflectionHelper.registerConstructor("XWalkNavigationItemBridgeConstructor", "org.xwalk.core.XWalkNavigationItem", new Object[] {
            java/lang/Object
        });
    }
}
