// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkExtensionInternal, ReflectionHelper

public class XWalkExtensionBridge extends XWalkExtensionInternal
{

    private static final String WRAPPER_CLASS = "org.xwalk.core.Object";
    private Method broadcastMessageStringMethod;
    private Method onMessageintStringMethod;
    private Method onSyncMessageintStringMethod;
    private Method postMessageintStringMethod;
    private Object wrapper;

    public XWalkExtensionBridge(String s, String s1, Object obj)
    {
        super(s, s1);
        wrapper = obj;
        try
        {
            reflectionInit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ReflectionHelper.handleException(s);
        }
    }

    public XWalkExtensionBridge(String s, String s1, String as[], Object obj)
    {
        super(s, s1, as);
        wrapper = obj;
        try
        {
            reflectionInit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ReflectionHelper.handleException(s);
        }
    }

    private void reflectionInit()
        throws NoSuchMethodException, ClassNotFoundException
    {
        Class class1 = wrapper.getClass();
        postMessageintStringMethod = ReflectionHelper.loadMethod(class1, "postMessage", new Object[] {
            Integer.TYPE, java/lang/String
        });
        broadcastMessageStringMethod = ReflectionHelper.loadMethod(class1, "broadcastMessage", new Object[] {
            java/lang/String
        });
        onMessageintStringMethod = ReflectionHelper.loadMethod(class1, "onMessage", new Object[] {
            Integer.TYPE, java/lang/String
        });
        onSyncMessageintStringMethod = ReflectionHelper.loadMethod(class1, "onSyncMessage", new Object[] {
            Integer.TYPE, java/lang/String
        });
    }

    public void broadcastMessage(String s)
    {
        ReflectionHelper.invokeMethod(broadcastMessageStringMethod, wrapper, new Object[] {
            s
        });
    }

    public void broadcastMessageSuper(String s)
    {
        super.broadcastMessage(s);
    }

    public Object getWrapper()
    {
        return wrapper;
    }

    public void onMessage(int i, String s)
    {
        ReflectionHelper.invokeMethod(onMessageintStringMethod, wrapper, new Object[] {
            Integer.valueOf(i), s
        });
    }

    public String onSyncMessage(int i, String s)
    {
        return (String)ReflectionHelper.invokeMethod(onSyncMessageintStringMethod, wrapper, new Object[] {
            Integer.valueOf(i), s
        });
    }

    public void postMessage(int i, String s)
    {
        ReflectionHelper.invokeMethod(postMessageintStringMethod, wrapper, new Object[] {
            Integer.valueOf(i), s
        });
    }

    public void postMessageSuper(int i, String s)
    {
        super.postMessage(i, s);
    }
}
