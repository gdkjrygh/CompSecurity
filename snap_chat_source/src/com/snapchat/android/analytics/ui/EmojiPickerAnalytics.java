// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.ui;

import LB;
import PC;
import android.os.SystemClock;
import com.snapchat.android.analytics.framework.EasyMetric;
import java.util.HashMap;
import java.util.Map;

public final class EmojiPickerAnalytics
{
    public static final class ReportType extends Enum
    {

        private static final ReportType $VALUES[];
        public static final ReportType POSTED;
        public static final ReportType SAVED;
        public static final ReportType SENT;

        public static ReportType valueOf(String s)
        {
            return (ReportType)Enum.valueOf(com/snapchat/android/analytics/ui/EmojiPickerAnalytics$ReportType, s);
        }

        public static ReportType[] values()
        {
            return (ReportType[])$VALUES.clone();
        }

        static 
        {
            SENT = new ReportType("SENT", 0);
            POSTED = new ReportType("POSTED", 1);
            SAVED = new ReportType("SAVED", 2);
            $VALUES = (new ReportType[] {
                SENT, POSTED, SAVED
            });
        }

        private ReportType(String s, int j)
        {
            super(s, j);
        }
    }

    public static final class SnapType extends Enum
    {

        private static final SnapType $VALUES[];
        public static final SnapType IMAGE;
        public static final SnapType VIDEO;

        public static SnapType valueOf(String s)
        {
            return (SnapType)Enum.valueOf(com/snapchat/android/analytics/ui/EmojiPickerAnalytics$SnapType, s);
        }

        public static SnapType[] values()
        {
            return (SnapType[])$VALUES.clone();
        }

        static 
        {
            IMAGE = new SnapType("IMAGE", 0);
            VIDEO = new SnapType("VIDEO", 1);
            $VALUES = (new SnapType[] {
                IMAGE, VIDEO
            });
        }

        private SnapType(String s, int j)
        {
            super(s, j);
        }
    }

