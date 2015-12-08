// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;


// Referenced classes of package org.xwalk.core:
//            ReflectionHelper

public class XWalkPreferences
{

    public static final String ALLOW_UNIVERSAL_ACCESS_FROM_FILE = "allow-universal-access-from-file";
    public static final String ANIMATABLE_XWALK_VIEW = "animatable-xwalk-view";
    private static final String BRIDGE_CLASS = "org.xwalk.core.internal.XWalkPreferencesBridge";
    public static final String JAVASCRIPT_CAN_OPEN_WINDOW = "javascript-can-open-window";
    public static final String PROFILE_NAME = "profile-name";
    public static final String REMOTE_DEBUGGING = "remote-debugging";
    public static final String SUPPORT_MULTIPLE_WINDOWS = "support-multiple-windows";
    private Object bridge;

    public XWalkPreferences()
    {
    }

    public static boolean getBooleanValue(String s)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(ReflectionHelper.loadMethod(ReflectionHelper.loadClass("org.xwalk.core.internal.XWalkPreferencesBridge"), "getBooleanValue", new Object[] {
            java/lang/String
        }), null, new Object[] {
            s
        })).booleanValue();
    }

    public static int getIntegerValue(String s)
    {
        return ((Integer)ReflectionHelper.invokeMethod(ReflectionHelper.loadMethod(ReflectionHelper.loadClass("org.xwalk.core.internal.XWalkPreferencesBridge"), "getIntegerValue", new Object[] {
            java/lang/String
        }), null, new Object[] {
            s
        })).intValue();
    }

    public static String getStringValue(String s)
    {
        return (String)ReflectionHelper.invokeMethod(ReflectionHelper.loadMethod(ReflectionHelper.loadClass("org.xwalk.core.internal.XWalkPreferencesBridge"), "getStringValue", new Object[] {
            java/lang/String
        }), null, new Object[] {
            s
        });
    }

    public static boolean getValue(String s)
    {
        return ((Boolean)ReflectionHelper.invokeMethod(ReflectionHelper.loadMethod(ReflectionHelper.loadClass("org.xwalk.core.internal.XWalkPreferencesBridge"), "getValue", new Object[] {
            java/lang/String
        }), null, new Object[] {
            s
        })).booleanValue();
    }

    public static void setValue(String s, int i)
    {
        ReflectionHelper.invokeMethod(ReflectionHelper.loadMethod(ReflectionHelper.loadClass("org.xwalk.core.internal.XWalkPreferencesBridge"), "setValue", new Object[] {
            java/lang/String, Integer.TYPE
        }), null, new Object[] {
            s, Integer.valueOf(i)
        });
    }

    public static void setValue(String s, String s1)
    {
        ReflectionHelper.invokeMethod(ReflectionHelper.loadMethod(ReflectionHelper.loadClass("org.xwalk.core.internal.XWalkPreferencesBridge"), "setValue", new Object[] {
            java/lang/String, java/lang/String
        }), null, new Object[] {
            s, s1
        });
    }

    public static void setValue(String s, boolean flag)
    {
        ReflectionHelper.invokeMethod(ReflectionHelper.loadMethod(ReflectionHelper.loadClass("org.xwalk.core.internal.XWalkPreferencesBridge"), "setValue", new Object[] {
            java/lang/String, Boolean.TYPE
        }), null, new Object[] {
            s, Boolean.valueOf(flag)
        });
    }

    Object getBridge()
    {
        return bridge;
    }
}
