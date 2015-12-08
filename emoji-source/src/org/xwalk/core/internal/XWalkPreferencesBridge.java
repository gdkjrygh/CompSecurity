// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


// Referenced classes of package org.xwalk.core.internal:
//            XWalkPreferencesInternal

public class XWalkPreferencesBridge extends XWalkPreferencesInternal
{

    private static final String WRAPPER_CLASS = "org.xwalk.core.Object";
    private Object wrapper;

    public XWalkPreferencesBridge()
    {
    }

    public static boolean getBooleanValue(String s)
    {
        return XWalkPreferencesInternal.getBooleanValue(s);
    }

    public static int getIntegerValue(String s)
    {
        return XWalkPreferencesInternal.getIntegerValue(s);
    }

    public static String getStringValue(String s)
    {
        return XWalkPreferencesInternal.getStringValue(s);
    }

    public static boolean getValue(String s)
    {
        return XWalkPreferencesInternal.getValue(s);
    }

    private void reflectionInit()
        throws NoSuchMethodException, ClassNotFoundException
    {
        wrapper.getClass();
    }

    public static void setValue(String s, int i)
    {
        XWalkPreferencesInternal.setValue(s, i);
    }

    public static void setValue(String s, String s1)
    {
        XWalkPreferencesInternal.setValue(s, s1);
    }

    public static void setValue(String s, boolean flag)
    {
        XWalkPreferencesInternal.setValue(s, flag);
    }

    public Object getWrapper()
    {
        return wrapper;
    }
}
