// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;


// Referenced classes of package com.soundcloud.android.skippy:
//            NetworkConnectivityListener

public static final class  extends Enum
{

    private static final NOT_CONNECTED $VALUES[];
    public static final NOT_CONNECTED CONNECTED;
    public static final NOT_CONNECTED NOT_CONNECTED;
    public static final NOT_CONNECTED UNKNOWN;
    public static final NOT_CONNECTED values[] = values();

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/skippy/NetworkConnectivityListener$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        CONNECTED = new <init>("CONNECTED", 1);
        NOT_CONNECTED = new <init>("NOT_CONNECTED", 2);
        $VALUES = (new .VALUES[] {
            UNKNOWN, CONNECTED, NOT_CONNECTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
