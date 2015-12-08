// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.analytics;

import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.discover.model.MediaState;
import hJ;
import kG;
import wH;

public final class DiscoverUsageAnalytics
{
    public static final class ViewStatus extends Enum
    {

        private static final ViewStatus $VALUES[];
        public static final ViewStatus COMPLETED;
        public static final ViewStatus ERROR;
        public static final ViewStatus INCOMPLETE;

        public static ViewStatus valueOf(String s)
        {
            return (ViewStatus)Enum.valueOf(com/snapchat/android/discover/analytics/DiscoverUsageAnalytics$ViewStatus, s);
        }

        public static ViewStatus[] values()
        {
            return (ViewStatus[])$VALUES.clone();
        }

        public final boolean wasFullView()
        {
            return equals(COMPLETED);
        }

        static 
        {
            INCOMPLETE = new ViewStatus("INCOMPLETE", 0);
            COMPLETED = new ViewStatus("COMPLETED", 1);
            ERROR = new ViewStatus("ERROR", 2);
            $VALUES = (new ViewStatus[] {
                INCOMPLETE, COMPLETED, ERROR
            });
        }

        private ViewStatus(String s, int i)
        {
            super(s, i);
        }
    }


    public final BlizzardEventLogger a;
    public final kG b;

    public DiscoverUsageAnalytics()
    {
        BlizzardEventLogger blizzardeventlogger = BlizzardEventLogger.a();
        kG kg = kG.a();
        new wH();
        this(blizzardeventlogger, kg);
    }

    private DiscoverUsageAnalytics(BlizzardEventLogger blizzardeventlogger, kG kg)
    {
        a = blizzardeventlogger;
        b = kg;
    }

    public static hJ a(com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype)
    {
        public static final class _cls1
        {

            public static final int a[];
            public static final int b[];
            static final int c[];

            static 
            {
                c = new int[com.snapchat.android.discover.model.DSnapPanel.MediaType.values().length];
                try
                {
                    c[com.snapchat.android.discover.model.DSnapPanel.MediaType.IMAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    c[com.snapchat.android.discover.model.DSnapPanel.MediaType.VIDEO.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    c[com.snapchat.android.discover.model.DSnapPanel.MediaType.LOCAL_WEBPAGE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    c[com.snapchat.android.discover.model.DSnapPanel.MediaType.REMOTE_VIDEO.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                b = new int[MediaState.values().length];
                try
                {
                    b[MediaState.AD_RESOLVE_ERROR_CODE_INTERNAL_ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    b[MediaState.AD_RESOLVE_ERROR_CODE_INVALID_REQUEST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    b[MediaState.AD_RESOLVE_ERROR_CODE_NETWORK_ERROR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    b[MediaState.AD_RESOLVE_ERROR_CODE_NO_FILL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    b[MediaState.AD_RESOLVE_ERROR_CODE_UNKNOWN.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[MediaState.AD_RESOLVE_CONTENT_NO_FILL.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[MediaState.AD_RESOLVE_TIMEOUT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[MediaState.AD_RESOLVE_CLIENT_ERROR.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                a = new int[com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod.values().length];
                try
                {
                    a[com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod.SWIPE_BEGINNING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod.SWIPE_END.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod.ENTER_BACKGROUND.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod.SWIPE_DOWN.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod.AUTO_ADVANCE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.snapchat.android.ui.SwipeOutTracker.SwipeToExitMethod.BACK_PRESSED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.c[mediatype.ordinal()])
        {
        default:
            Timber.e("DiscoverAnalytics", "Unsupported top snap media type, returning null.", new Object[0]);
            return null;

        case 1: // '\001'
            return hJ.IMAGE;

        case 2: // '\002'
            return hJ.VIDEO;
        }
    }

    public static hJ a(com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype, boolean flag)
    {
        switch (_cls1.c[mediatype.ordinal()])
        {
        default:
            Timber.e("DiscoverAnalytics", "Unsupported longform media type, returning null.", new Object[0]);
            return null;

        case 1: // '\001'
        case 3: // '\003'
            return hJ.IMAGE;

        case 2: // '\002'
        case 4: // '\004'
            break;
        }
        if (flag)
        {
            return hJ.VIDEO_NO_SOUND;
        } else
        {
            return hJ.VIDEO;
        }
    }

    public static String a(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info)
    {
        if (info == null)
        {
            return "unavailable";
        }
        if (info.isLimitAdTrackingEnabled())
        {
            return "optout";
        } else
        {
            return info.getId();
        }
    }

    public static hJ b(com.snapchat.android.discover.model.DSnapPanel.MediaType mediatype)
    {
        switch (_cls1.c[mediatype.ordinal()])
        {
        default:
            Timber.e("DiscoverAnalytics", "Unsupported longform media type, returning null.", new Object[0]);
            return null;

        case 3: // '\003'
            return hJ.TEXT;

        case 4: // '\004'
            return hJ.VIDEO;
        }
    }
}
