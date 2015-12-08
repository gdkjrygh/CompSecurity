// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            HereAnalytics

public static final class  extends Enum
{

    private static final HERE_CONFIRMED $VALUES[];
    public static final HERE_CONFIRMED HERE_ADL_CONNECTED;
    public static final HERE_CONFIRMED HERE_ADL_REMOTE_PEER_JOINED;
    public static final HERE_CONFIRMED HERE_AVAILABLE;
    public static final HERE_CONFIRMED HERE_CONFIRMED;
    public static final HERE_CONFIRMED HERE_PUBLISHED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/HereAnalytics$SetupPhase, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        HERE_AVAILABLE = new <init>("HERE_AVAILABLE", 0);
        HERE_ADL_CONNECTED = new <init>("HERE_ADL_CONNECTED", 1);
        HERE_ADL_REMOTE_PEER_JOINED = new <init>("HERE_ADL_REMOTE_PEER_JOINED", 2);
        HERE_PUBLISHED = new <init>("HERE_PUBLISHED", 3);
        HERE_CONFIRMED = new <init>("HERE_CONFIRMED", 4);
        $VALUES = (new .VALUES[] {
            HERE_AVAILABLE, HERE_ADL_CONNECTED, HERE_ADL_REMOTE_PEER_JOINED, HERE_PUBLISHED, HERE_CONFIRMED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
