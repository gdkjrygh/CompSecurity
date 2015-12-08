// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.util.network;

import com.snapchat.android.Timber;
import java.util.Locale;

// Referenced classes of package com.snapchat.android.discover.util.network:
//            DiscoverEndpointManager

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN DEVICE_NOT_SUPPORTED;
    public static final UNKNOWN NOT_SUPPORTED;
    public static final UNKNOWN REGION_NOT_SUPPORTED;
    public static final UNKNOWN SUPPORTED;
    public static final UNKNOWN UNKNOWN;

    public static  fromString(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
          = valueOf(s.toUpperCase(Locale.ENGLISH));
        return ;
        Exception exception;
        exception;
        Timber.e("DiscoverEndpointManager", "Unknown compatibility value %s", new Object[] {
            s
        });
        return NOT_SUPPORTED;
    }

    public static NOT_SUPPORTED valueOf(String s)
    {
        return (NOT_SUPPORTED)Enum.valueOf(com/snapchat/android/discover/util/network/DiscoverEndpointManager$Compatibility, s);
    }

    public static NOT_SUPPORTED[] values()
    {
        return (NOT_SUPPORTED[])$VALUES.clone();
    }

    static 
    {
        SUPPORTED = new <init>("SUPPORTED", 0);
        NOT_SUPPORTED = new <init>("NOT_SUPPORTED", 1);
        REGION_NOT_SUPPORTED = new <init>("REGION_NOT_SUPPORTED", 2);
        DEVICE_NOT_SUPPORTED = new <init>("DEVICE_NOT_SUPPORTED", 3);
        UNKNOWN = new <init>("UNKNOWN", 4);
        $VALUES = (new .VALUES[] {
            SUPPORTED, NOT_SUPPORTED, REGION_NOT_SUPPORTED, DEVICE_NOT_SUPPORTED, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
