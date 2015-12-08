// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import com.lyft.scoop.NullScreen;
import com.lyft.scoop.Screen;
import me.lyft.android.common.DeviceClock;
import me.lyft.android.common.ObjectUtils;
import me.lyft.android.common.ScreenUtils;
import me.lyft.android.common.Strings;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.analytics:
//            Analytics, IgnoreScreenTracking, ScreenTracking

public class ScreenAnalytics
{

    public static final String SLIDING_MENU_SCREEN = "sliding_menu";
    private static String currentScreenName;
    private static boolean isSlidingMenuOpen;
    protected static String prevScreenSent;
    private static long prevScreenSentTime;

    private ScreenAnalytics()
    {
        cleanScreenTracking();
    }

    public static void cleanScreenTracking()
    {
        isSlidingMenuOpen = false;
        currentScreenName = null;
        prevScreenSent = null;
        prevScreenSentTime = DeviceClock.getElapsedTimeMs();
    }

    public static String getCurrentPage()
    {
        return prevScreenSent;
    }

    private static void sendScreenView(String s)
    {
        sendScreenView(s, null);
    }

    private static void sendScreenView(String s, String s1)
    {
        if (Strings.isNullOrEmpty(s))
        {
            L.w(new NullPointerException(), "tracking null screen", new Object[0]);
        } else
        if (!s.equals(prevScreenSent))
        {
            long l = DeviceClock.getElapsedTimeMs();
            long l1 = l - prevScreenSentTime;
            prevScreenSentTime = l;
            String s2 = prevScreenSent;
            prevScreenSent = s;
            if (Strings.isNullOrEmpty(s1))
            {
                s = new ScreenViewEvent(s, s2, l1);
            } else
            {
                s = new ScreenViewEvent(s, s2, l1, s1);
            }
            Analytics.track(s);
            return;
        }
    }

    public static void trackDialogView(Screen screen)
    {
        if (ObjectUtils.hasAnnotation(screen, me/lyft/android/analytics/IgnoreScreenTracking))
        {
            return;
        }
        if (!NullScreen.a(screen))
        {
            ScreenTracking screentracking = (ScreenTracking)screen.getClass().getAnnotation(me/lyft/android/analytics/ScreenTracking);
            if (screentracking != null)
            {
                screen = screentracking.value();
            } else
            {
                screen = ScreenUtils.getFormattedName(screen);
            }
        } else
        if (isSlidingMenuOpen)
        {
            screen = "sliding_menu";
        } else
        {
            screen = currentScreenName;
        }
        sendScreenView(screen);
    }

    public static void trackMenuClose()
    {
        isSlidingMenuOpen = false;
        sendScreenView(currentScreenName);
    }

    public static void trackMenuOpen()
    {
        isSlidingMenuOpen = true;
        sendScreenView("sliding_menu");
    }

    public static void trackScreenView(Screen screen)
    {
        if (ObjectUtils.hasAnnotation(screen, me/lyft/android/analytics/IgnoreScreenTracking))
        {
            return;
        }
        ScreenTracking screentracking = (ScreenTracking)screen.getClass().getAnnotation(me/lyft/android/analytics/ScreenTracking);
        if (screentracking != null)
        {
            screen = screentracking.value();
        } else
        {
            screen = ScreenUtils.getFormattedName(screen);
        }
        trackScreenView(((String) (screen)));
    }

    public static void trackScreenView(String s)
    {
        trackScreenView(s, null);
    }

    public static void trackScreenView(String s, String s1)
    {
        currentScreenName = s;
        sendScreenView(s, s1);
    }

    private class ScreenViewEvent extends Event
    {

        public String getPage()
        {
            return (String)getParameters().get(Parameter.PAGE.toString());
        }

        String getPreviousPage()
        {
            return (String)getParameters().get(Parameter.PREVIOUS_PAGE.toString());
        }

        ScreenViewEvent(String s, String s1, long l)
        {
            super(EventName.PAGE_VIEW);
            putParameter(Parameter.PAGE, s);
            putParameter(Parameter.PREVIOUS_PAGE, s1);
            putParameter(Parameter.PREVIOUS_PAGE_MS, Long.valueOf(l));
            addTracker(RedshiftTrackerExtra.create());
        }

        ScreenViewEvent(String s, String s1, long l, String s2)
        {
            this(s, s1, l);
            putParameter(Parameter.PAGE_VALUE, s2);
        }
    }

}
