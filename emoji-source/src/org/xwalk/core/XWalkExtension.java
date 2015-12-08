// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;

import java.lang.reflect.Method;

// Referenced classes of package org.xwalk.core:
//            ReflectionHelper

public abstract class XWalkExtension
{

    private static final String BRIDGE_CLASS = "org.xwalk.core.internal.XWalkExtensionBridge";
    private Object bridge;
    private Method broadcastMessageStringMethod;
    private Method postMessageintStringMethod;

    public XWalkExtension(String s, String s1)
    {
        bridge = ReflectionHelper.createInstance("XWalkExtensionInternalStringStringConstructor", new Object[] {
            s, s1, this
        });
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

    public XWalkExtension(String s, String s1, String as[])
    {
        bridge = ReflectionHelper.createInstance("XWalkExtensionInternalStringStringString[]Constructor", new Object[] {
            s, s1, as, this
        });
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
        Class class1 = bridge.getClass();
        postMessageintStringMethod = ReflectionHelper.loadMethod(class1, "postMessageSuper", new Object[] {
            Integer.TYPE, java/lang/String
        });
        broadcastMessageStringMethod = ReflectionHelper.loadMethod(class1, "broadcastMessageSuper", new Object[] {
            java/lang/String
        });
    }

    public void broadcastMessage(String s)
    {
        ReflectionHelper.invokeMethod(broadcastMessageStringMethod, bridge, new Object[] {
            s
        });
    }

    Object getBridge()
    {
        return bridge;
    }

    public abstract void onMessage(int i, String s);

    public abstract String onSyncMessage(int i, String s);

    public void postMessage(int i, String s)
    {
        ReflectionHelper.invokeMethod(postMessageintStringMethod, bridge, new Object[] {
            Integer.valueOf(i), s
        });
    }

    static 
    {
        ReflectionHelper.registerConstructor("XWalkExtensionInternalStringStringConstructor", "org.xwalk.core.internal.XWalkExtensionBridge", new Object[] {
            java/lang/String, java/lang/String, java/lang/Object
        });
        ReflectionHelper.registerConstructor("XWalkExtensionInternalStringStringString[]Constructor", "org.xwalk.core.internal.XWalkExtensionBridge", new Object[] {
            java/lang/String, java/lang/String, [Ljava/lang/String;, java/lang/Object
        });
    }
}
