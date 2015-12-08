// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.partner;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.skype.android.util.chained.AbstractChainedRetriever;
import com.skype.android.util.chained.ChainSmith;
import com.skype.android.util.chained.LinkSmith;
import com.skype.android.util.chained.Retriever;

// Referenced classes of package com.skype.android.config.partner:
//            BuildConfigTrackingIDRetriever, FirmwareApkTrackingIDRetriever, OEMDellCorpTrackingIDRetriever, SharedPrefsTrackingIDRetriever

public abstract class TrackingIdSource extends Enum
    implements LinkSmith
{

    private static final TrackingIdSource $VALUES[];
    public static final TrackingIdSource BUILD_CONFIG;
    public static final TrackingIdSource FIRMWARE_APK;
    public static final TrackingIdSource OEM_DELL_INC;
    public static final TrackingIdSource SHARED_PREFS;
    public static final String TRACKING_ID_PLACEHOLDER = "0";

    private TrackingIdSource(String s, int i)
    {
        super(s, i);
    }


    public static Retriever chainTogether(Application application)
    {
        return ChainSmith.a(application, values());
    }

    public static boolean isPlaceholder(String s)
    {
        return TextUtils.isEmpty(s) || "0".equals(s);
    }

    public static TrackingIdSource valueOf(String s)
    {
        return (TrackingIdSource)Enum.valueOf(com/skype/android/config/partner/TrackingIdSource, s);
    }

    public static TrackingIdSource[] values()
    {
        return (TrackingIdSource[])$VALUES.clone();
    }

    public abstract AbstractChainedRetriever createRetriever(Context context);

    public volatile AbstractChainedRetriever createRetriever(Object obj)
    {
        return createRetriever((Context)obj);
    }

    public boolean isApplicable(Context context)
    {
        return true;
    }

    public volatile boolean isApplicable(Object obj)
    {
        return isApplicable((Context)obj);
    }

    static 
    {
        BUILD_CONFIG = new TrackingIdSource("BUILD_CONFIG", 0) {

            public final AbstractChainedRetriever createRetriever(Context context)
            {
                return new BuildConfigTrackingIDRetriever();
            }

            public final volatile AbstractChainedRetriever createRetriever(Object obj)
            {
                return createRetriever((Context)obj);
            }

            public final volatile boolean isApplicable(Object obj)
            {
                return isApplicable((Context)obj);
            }

        };
        FIRMWARE_APK = new TrackingIdSource("FIRMWARE_APK", 1) {

            public final AbstractChainedRetriever createRetriever(Context context)
            {
                return new FirmwareApkTrackingIDRetriever(context);
            }

            public final volatile AbstractChainedRetriever createRetriever(Object obj)
            {
                return createRetriever((Context)obj);
            }

            public final volatile boolean isApplicable(Object obj)
            {
                return isApplicable((Context)obj);
            }

        };
        OEM_DELL_INC = new TrackingIdSource("OEM_DELL_INC", 2) {

            public final AbstractChainedRetriever createRetriever(Context context)
            {
                return new OEMDellCorpTrackingIDRetriever(context);
            }

            public final volatile AbstractChainedRetriever createRetriever(Object obj)
            {
                return createRetriever((Context)obj);
            }

            public final boolean isApplicable(Context context)
            {
                return Build.MANUFACTURER.equalsIgnoreCase("Dell");
            }

            public final volatile boolean isApplicable(Object obj)
            {
                return isApplicable((Context)obj);
            }

        };
        SHARED_PREFS = new TrackingIdSource("SHARED_PREFS", 3) {

            public final AbstractChainedRetriever createRetriever(Context context)
            {
                return new SharedPrefsTrackingIDRetriever(context);
            }

            public final volatile AbstractChainedRetriever createRetriever(Object obj)
            {
                return createRetriever((Context)obj);
            }

            public final volatile boolean isApplicable(Object obj)
            {
                return isApplicable((Context)obj);
            }

        };
        $VALUES = (new TrackingIdSource[] {
            BUILD_CONFIG, FIRMWARE_APK, OEM_DELL_INC, SHARED_PREFS
        });
    }
}
