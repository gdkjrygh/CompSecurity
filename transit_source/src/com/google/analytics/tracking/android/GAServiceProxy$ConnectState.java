// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            GAServiceProxy

private static final class  extends Enum
{

    private static final DISCONNECTED $VALUES[];
    public static final DISCONNECTED BLOCKED;
    public static final DISCONNECTED CONNECTED_LOCAL;
    public static final DISCONNECTED CONNECTED_SERVICE;
    public static final DISCONNECTED CONNECTING;
    public static final DISCONNECTED DISCONNECTED;
    public static final DISCONNECTED PENDING_CONNECTION;
    public static final DISCONNECTED PENDING_DISCONNECT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/analytics/tracking/android/GAServiceProxy$ConnectState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CONNECTING = new <init>("CONNECTING", 0);
        CONNECTED_SERVICE = new <init>("CONNECTED_SERVICE", 1);
        CONNECTED_LOCAL = new <init>("CONNECTED_LOCAL", 2);
        BLOCKED = new <init>("BLOCKED", 3);
        PENDING_CONNECTION = new <init>("PENDING_CONNECTION", 4);
        PENDING_DISCONNECT = new <init>("PENDING_DISCONNECT", 5);
        DISCONNECTED = new <init>("DISCONNECTED", 6);
        $VALUES = (new .VALUES[] {
            CONNECTING, CONNECTED_SERVICE, CONNECTED_LOCAL, BLOCKED, PENDING_CONNECTION, PENDING_DISCONNECT, DISCONNECTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
