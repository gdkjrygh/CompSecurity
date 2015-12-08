// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            HereAnalytics

public static final class  extends Enum
{

    private static final CONNECTED $VALUES[];
    public static final CONNECTED CONNECTED;
    public static final CONNECTED CONNECTING;
    public static final CONNECTED DISCONNECTED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/HereAnalytics$OutgoingVideoState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DISCONNECTED = new <init>("DISCONNECTED", 0);
        CONNECTING = new <init>("CONNECTING", 1);
        CONNECTED = new <init>("CONNECTED", 2);
        $VALUES = (new .VALUES[] {
            DISCONNECTED, CONNECTING, CONNECTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
