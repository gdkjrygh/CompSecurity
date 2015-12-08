// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;


// Referenced classes of package com.thetransitapp.droid.util:
//            DateFormatter

public static final class  extends Enum
{

    public static final OTHER DELAY;
    private static final OTHER ENUM$VALUES[];
    public static final OTHER EPOCH;
    public static final OTHER EPOCH_MILLISEC;
    public static final OTHER MINUTES_AGO;
    public static final OTHER MINUTE_DELAY;
    public static final OTHER OTHER;
    public static final OTHER SECONDS_AGO;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/thetransitapp/droid/util/DateFormatter$DateFormatterType, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        DELAY = new <init>("DELAY", 0);
        MINUTE_DELAY = new <init>("MINUTE_DELAY", 1);
        SECONDS_AGO = new <init>("SECONDS_AGO", 2);
        MINUTES_AGO = new <init>("MINUTES_AGO", 3);
        EPOCH = new <init>("EPOCH", 4);
        EPOCH_MILLISEC = new <init>("EPOCH_MILLISEC", 5);
        OTHER = new <init>("OTHER", 6);
        ENUM$VALUES = (new ENUM.VALUES[] {
            DELAY, MINUTE_DELAY, SECONDS_AGO, MINUTES_AGO, EPOCH, EPOCH_MILLISEC, OTHER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
