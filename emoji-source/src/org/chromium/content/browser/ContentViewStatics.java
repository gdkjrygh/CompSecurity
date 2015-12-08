// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import org.chromium.net.ProxyChangeListener;

public class ContentViewStatics
{

    public ContentViewStatics()
    {
    }

    public static void disablePlatformNotifications()
    {
        ProxyChangeListener.setEnabled(false);
    }

    public static void enablePlatformNotifications()
    {
        ProxyChangeListener.setEnabled(true);
    }

    public static String findAddress(String s)
    {
label0:
        {
            if (s == null)
            {
                throw new NullPointerException("addr is null");
            }
            String s1 = nativeFindAddress(s);
            if (s1 != null)
            {
                s = s1;
                if (!s1.isEmpty())
                {
                    break label0;
                }
            }
            s = null;
        }
        return s;
    }

    private static native String nativeFindAddress(String s);

    private static native void nativeSetWebKitSharedTimersSuspended(boolean flag);

    public static void setWebKitSharedTimersSuspended(boolean flag)
    {
        nativeSetWebKitSharedTimersSuspended(flag);
    }
}
