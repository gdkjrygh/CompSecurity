// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkNavigationHistoryInternal, ReflectionHelper, XWalkNavigationItemBridge, XWalkNavigationItemInternal

public class XWalkNavigationHistoryBridge extends XWalkNavigationHistoryInternal
{

    private static final String WRAPPER_CLASS = "org.xwalk.core.Object";
    private Method canGoBackMethod;
    private Method canGoForwardMethod;
    private Method clearMethod;
    private Class enumDirectionClass;
    private Method enumDirectionClassValueOfMethod;
    private Method getCurrentIndexMethod;
    private Method getCurrentItemMethod;
    private Method getItemAtintMethod;
    private Method hasItemAtintMethod;
    private XWalkNavigationHistoryInternal internal;
    private Method navigateDirectionInternalintMethod;
    private Method sizeMethod;
    private Object wrapper;

    XWalkNavigationHistoryBridge(XWalkNavigationHistoryInternal xwalknavigationhistoryinternal)
    {
        internal = null;
        internal = xwalknavigationhistoryinternal;
        wrapper = ReflectionHelper.createInstance("XWalkNavigationHistoryBridgeConstructor", new Object[] {
            this
        });
        try
        {
            reflectionInit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (XWalkNavigationHistoryInternal xwalknavigationhistoryinternal)
        {
            ReflectionHelper.handleException(xwalknavigationhistoryinternal);
        }
    }

    private Object ConvertDirectionInternal(XWalkNavigationHistoryInternal.DirectionInternal directioninternal)
    {
        return ReflectionHelper.invokeMethod(enumDirectionClassValueOfMethod, null, new Object[] {
            directioninternal.toString()
        });
    }

    private void reflectionInit()
        throws NoSuchMethodException, ClassNotFoundException
    {
        Class class1 = wrapper.getClass();
        enumDirectionClass = class1.getClassLoader().loadClass("org.xwalk.core.XWalkNavigationHistory$Direction");
        enumDirectionClassValueOfMethod = enumDirectionClass.getMethod("valueOf", new Class[] {
            java/lang/String
        });
        sizeMethod = ReflectionHelper.loadMethod(class1, "size", new Object[0]);
        hasItemAtintMethod = ReflectionHelper.loadMethod(class1, "hasItemAt", new Object[] {
            Integer.TYPE
        });
        getItemAtintMethod = ReflectionHelper.loadMethod(class1, "getItemAt", new Object[] {
            Integer.TYPE
        });
        getCurrentItemMethod = ReflectionHelper.loadMethod(class1, "getCurrentItem", new Object[0]);
        canGoBackMethod = ReflectionHelper.loadMethod(class1, "canGoBack", new Object[0]);
        canGoForwardMethod = ReflectionHelper.loadMethod(class1, "canGoForward", new Object[0]);
        navigateDirectionInternalintMethod = ReflectionHelper.loadMethod(class1, "navigate", new Object[] {
            enumDirectionClass, Integer.TYPE
        });
        getCurrentIndexMethod = ReflectionHelper.loadMethod(class1, "getCurrentIndex", new Object[0]);
        clearMethod = ReflectionHelper.loadMethod(class1, "clear", new Object[0]);
    }

    public boolean canGoBack()
    {
        return ((Boolean)ReflectionHelper.invokeMethod(canGoBackMethod, wrapper, new Object[0])).booleanValue();
    }

    public boolean canGoBackSuper()
    {
        if (internal == null)
        {
            return super.canGoBack();
        } else
        {
            return internal.canGoBack();
        }
    }

    public boolean canGoForward()
    {
        return ((Boolean)ReflectionHelper.invokeMethod(canGoForwardMethod, wrapper, new Object[0])).booleanValue();
    }

    public boolean canGoForwardSuper()
    {
        if (internal == null)
        {
            return super.canGoForward();
        } else
        {
            return internal.canGoForward();
        }
    }

    public void clear()
    {
        ReflectionHelper.invokeMethod(clearMethod, wrapper, new Object[0]);
    }

    public void clearSuper()
    {
        if (internal == null)
        {
            super.clear();
            return;
        } else
        {
            internal.clear();
            return;
        }
    }

    public int getCurrentIndex()
    {
        return ((Integer)ReflectionHelper.invokeMethod(getCurrentIndexMethod, wrapper, new Object[0])).intValue();
    }

    public int getCurrentIndexSuper()
    {
        if (internal == null)
        {
            return super.getCurrentIndex();
        } else
        {
            return internal.getCurrentIndex();
        }
    }

    public XWalkNavigationItemInternal getCurrentItem()
    {
        return (XWalkNavigationItemBridge)ReflectionHelper.getBridgeOrWrapper(ReflectionHelper.invokeMethod(getCurrentItemMethod, wrapper, new Object[0]));
    }

    public XWalkNavigationItemBridge getCurrentItemSuper()
    {
        XWalkNavigationItemInternal xwalknavigationiteminternal;
        if (internal == null)
        {
            xwalknavigationiteminternal = super.getCurrentItem();
        } else
        {
            xwalknavigationiteminternal = internal.getCurrentItem();
        }
        if (xwalknavigationiteminternal == null)
        {
            return null;
        }
        if (xwalknavigationiteminternal instanceof XWalkNavigationItemBridge)
        {
            return (XWalkNavigationItemBridge)xwalknavigationiteminternal;
        } else
        {
            return new XWalkNavigationItemBridge(xwalknavigationiteminternal);
        }
    }

    public XWalkNavigationItemInternal getItemAt(int i)
    {
        return (XWalkNavigationItemBridge)ReflectionHelper.getBridgeOrWrapper(ReflectionHelper.invokeMethod(getItemAtintMethod, wrapper, new Object[] {
            Integer.valueOf(i)
        }));
    }

    public XWalkNavigationItemBridge getItemAtSuper(int i)
    {
        XWalkNavigationItemInternal xwalknavigationiteminternal;
        if (internal == null)
        {
            xwalknavigationiteminternal = super.getItemAt(i);
        } else
        {
            xwalknavigationiteminternal = internal.getItemAt(i);
        }
        if (xwalknavigationiteminternal == null)
        {
            return null;
        }
        if (xwalknavigationiteminternal instanceof XWalkNavigationItemBridge)
        {
            return (XWalkNavigationItemBridge)xwalknavigationiteminternal;
        } else
        {
            return new XWalkNavigationItemBridge(xwalknavigationiteminternal);
        }
    }

    public Object getWrapper()
    {
        return wrapper;
    }

    public boolean hasItemAt(int i)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(hasItemAtintMethod, wrapper, new Object[] {
            Integer.valueOf(i)
        })).booleanValue();
    }

    public boolean hasItemAtSuper(int i)
    {
        if (internal == null)
        {
            return super.hasItemAt(i);
        } else
        {
            return internal.hasItemAt(i);
        }
    }

    public void navigate(XWalkNavigationHistoryInternal.DirectionInternal directioninternal, int i)
    {
        ReflectionHelper.invokeMethod(navigateDirectionInternalintMethod, wrapper, new Object[] {
            ConvertDirectionInternal(directioninternal), Integer.valueOf(i)
        });
    }

    public void navigateSuper(XWalkNavigationHistoryInternal.DirectionInternal directioninternal, int i)
    {
        if (internal == null)
        {
            super.navigate(directioninternal, i);
            return;
        } else
        {
            internal.navigate(directioninternal, i);
            return;
        }
    }

    public int size()
    {
        return ((Integer)ReflectionHelper.invokeMethod(sizeMethod, wrapper, new Object[0])).intValue();
    }

    public int sizeSuper()
    {
        if (internal == null)
        {
            return super.size();
        } else
        {
            return internal.size();
        }
    }

    static 
    {
        ReflectionHelper.registerConstructor("XWalkNavigationHistoryBridgeConstructor", "org.xwalk.core.XWalkNavigationHistory", new Object[] {
            java/lang/Object
        });
    }
}
