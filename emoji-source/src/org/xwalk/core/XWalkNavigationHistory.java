// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;

import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core:
//            ReflectionHelper, XWalkNavigationItem

public class XWalkNavigationHistory
{
    public static final class Direction extends Enum
    {

        private static final Direction $VALUES[];
        public static final Direction BACKWARD;
        public static final Direction FORWARD;

        public static Direction valueOf(String s)
        {
            return (Direction)Enum.valueOf(org/xwalk/core/XWalkNavigationHistory$Direction, s);
        }

        public static Direction[] values()
        {
            return (Direction[])$VALUES.clone();
        }

        static 
        {
            BACKWARD = new Direction("BACKWARD", 0);
            FORWARD = new Direction("FORWARD", 1);
            $VALUES = (new Direction[] {
                BACKWARD, FORWARD
            });
        }

        private Direction(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String BRIDGE_CLASS = "org.xwalk.core.internal.XWalkNavigationHistoryBridge";
    private Object bridge;
    private Method canGoBackMethod;
    private Method canGoForwardMethod;
    private Method clearMethod;
    private Class enumDirectionClass;
    private Method enumDirectionClassValueOfMethod;
    private Method getCurrentIndexMethod;
    private Method getCurrentItemMethod;
    private Method getItemAtintMethod;
    private Method hasItemAtintMethod;
    private Method navigateDirectionInternalintMethod;
    private Method sizeMethod;

    public XWalkNavigationHistory(Object obj)
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

    private Object ConvertDirection(Direction direction)
    {
        return ReflectionHelper.invokeMethod(enumDirectionClassValueOfMethod, null, new Object[] {
            direction.toString()
        });
    }

    private void reflectionInit()
        throws NoSuchMethodException, ClassNotFoundException
    {
        Class class1 = bridge.getClass();
        enumDirectionClass = class1.getClassLoader().loadClass("org.xwalk.core.internal.XWalkNavigationHistoryInternal$DirectionInternal");
        enumDirectionClassValueOfMethod = enumDirectionClass.getMethod("valueOf", new Class[] {
            java/lang/String
        });
        sizeMethod = ReflectionHelper.loadMethod(class1, "sizeSuper", new Object[0]);
        hasItemAtintMethod = ReflectionHelper.loadMethod(class1, "hasItemAtSuper", new Object[] {
            Integer.TYPE
        });
        getItemAtintMethod = ReflectionHelper.loadMethod(class1, "getItemAtSuper", new Object[] {
            Integer.TYPE
        });
        getCurrentItemMethod = ReflectionHelper.loadMethod(class1, "getCurrentItemSuper", new Object[0]);
        canGoBackMethod = ReflectionHelper.loadMethod(class1, "canGoBackSuper", new Object[0]);
        canGoForwardMethod = ReflectionHelper.loadMethod(class1, "canGoForwardSuper", new Object[0]);
        navigateDirectionInternalintMethod = ReflectionHelper.loadMethod(class1, "navigateSuper", new Object[] {
            enumDirectionClass, Integer.TYPE
        });
        getCurrentIndexMethod = ReflectionHelper.loadMethod(class1, "getCurrentIndexSuper", new Object[0]);
        clearMethod = ReflectionHelper.loadMethod(class1, "clearSuper", new Object[0]);
    }

    public boolean canGoBack()
    {
        return ((Boolean)ReflectionHelper.invokeMethod(canGoBackMethod, bridge, new Object[0])).booleanValue();
    }

    public boolean canGoForward()
    {
        return ((Boolean)ReflectionHelper.invokeMethod(canGoForwardMethod, bridge, new Object[0])).booleanValue();
    }

    public void clear()
    {
        ReflectionHelper.invokeMethod(clearMethod, bridge, new Object[0]);
    }

    Object getBridge()
    {
        return bridge;
    }

    public int getCurrentIndex()
    {
        return ((Integer)ReflectionHelper.invokeMethod(getCurrentIndexMethod, bridge, new Object[0])).intValue();
    }

    public XWalkNavigationItem getCurrentItem()
    {
        return (XWalkNavigationItem)ReflectionHelper.getBridgeOrWrapper(ReflectionHelper.invokeMethod(getCurrentItemMethod, bridge, new Object[0]));
    }

    public XWalkNavigationItem getItemAt(int i)
    {
        return (XWalkNavigationItem)ReflectionHelper.getBridgeOrWrapper(ReflectionHelper.invokeMethod(getItemAtintMethod, bridge, new Object[] {
            Integer.valueOf(i)
        }));
    }

    public boolean hasItemAt(int i)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(hasItemAtintMethod, bridge, new Object[] {
            Integer.valueOf(i)
        })).booleanValue();
    }

    public void navigate(Direction direction, int i)
    {
        ReflectionHelper.invokeMethod(navigateDirectionInternalintMethod, bridge, new Object[] {
            ConvertDirection(direction), Integer.valueOf(i)
        });
    }

    public int size()
    {
        return ((Integer)ReflectionHelper.invokeMethod(sizeMethod, bridge, new Object[0])).intValue();
    }
}
