// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.connect;

import com.google.common.collect.ImmutableList;
import dli;

// Referenced classes of package com.spotify.mobile.android.connect:
//            DiscoveryClient

public class FeatureFlagOverrideValue
{

    public FeatureFlagOverrideValue a;
    public dli b;

    public static FeatureFlagOverrideValue a()
    {
        FeatureFlagOverrideValue.mValue mvalue = new <init>();
        class FeatureFlagOverrideValue extends Enum
        {

            public static final FeatureFlagOverrideValue a;
            public static final FeatureFlagOverrideValue b;
            private static FeatureFlagOverrideValue c;
            private static final FeatureFlagOverrideValue d[];
            private final String mValue;

            public static FeatureFlagOverrideValue valueOf(String s)
            {
                return (FeatureFlagOverrideValue)Enum.valueOf(com/spotify/mobile/android/connect/DiscoveryClient$DiscoveryConfiguration$FeatureFlagOverrideValue, s);
            }

            public static FeatureFlagOverrideValue[] values()
            {
                return (FeatureFlagOverrideValue[])d.clone();
            }

            static 
            {
                a = new FeatureFlagOverrideValue("NONE", 0, "NONE");
                c = new FeatureFlagOverrideValue("ENABLED", 1, "ENABLED");
                b = new FeatureFlagOverrideValue("DISABLED", 2, "DISABLED");
                d = (new FeatureFlagOverrideValue[] {
                    a, c, b
                });
            }

            private FeatureFlagOverrideValue(String s, int i, String s1)
            {
                super(s, i);
                mValue = s1;
            }
        }

        mvalue.a = FeatureFlagOverrideValue.a;
        dli dli1;
        if ("debug".equals("release") || "partners".equals("release"))
        {
            dli1 = (dli)DiscoveryClient.a.get(1);
        } else
        {
            dli1 = (dli)DiscoveryClient.a.get(0);
        }
        mvalue.b = dli1;
        return mvalue;
    }

    public FeatureFlagOverrideValue()
    {
    }
}
