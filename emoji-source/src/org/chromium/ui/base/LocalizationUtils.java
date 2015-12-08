// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.base;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import org.chromium.base.ApiCompatibilityUtils;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.LocaleUtils;

public class LocalizationUtils
{

    public static final int LEFT_TO_RIGHT = 2;
    public static final int RIGHT_TO_LEFT = 1;
    public static final int UNKNOWN_DIRECTION = 0;
    private static Boolean sIsLayoutRtl;

    private LocalizationUtils()
    {
    }

    public static String getDefaultLocale()
    {
        return LocaleUtils.getDefaultLocale();
    }

    private static String getDisplayNameForLocale(Locale locale, Locale locale1)
    {
        return locale.getDisplayName(locale1);
    }

    public static String getDurationString(long l)
    {
        return nativeGetDurationString(l);
    }

    public static int getFirstStrongCharacterDirection(String s)
    {
        return nativeGetFirstStrongCharacterDirection(s);
    }

    private static Locale getJavaLocale(String s, String s1, String s2)
    {
        return new Locale(s, s1, s2);
    }

    public static boolean isLayoutRtl()
    {
        boolean flag = true;
        if (sIsLayoutRtl == null)
        {
            if (ApiCompatibilityUtils.getLayoutDirection(ApplicationStatus.getApplicationContext().getResources().getConfiguration()) != 1)
            {
                flag = false;
            }
            sIsLayoutRtl = Boolean.valueOf(flag);
        }
        return sIsLayoutRtl.booleanValue();
    }

    private static native String nativeGetDurationString(long l);

    private static native int nativeGetFirstStrongCharacterDirection(String s);
}
