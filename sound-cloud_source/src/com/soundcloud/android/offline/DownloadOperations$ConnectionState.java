// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;


// Referenced classes of package com.soundcloud.android.offline:
//            DownloadOperations

static final class  extends Enum
{

    private static final NOT_ALLOWED $VALUES[];
    public static final NOT_ALLOWED CONNECTED;
    public static final NOT_ALLOWED DISCONNECTED;
    public static final NOT_ALLOWED NOT_ALLOWED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/offline/DownloadOperations$ConnectionState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        DISCONNECTED = new <init>("DISCONNECTED", 0);
        CONNECTED = new <init>("CONNECTED", 1);
        NOT_ALLOWED = new <init>("NOT_ALLOWED", 2);
        $VALUES = (new .VALUES[] {
            DISCONNECTED, CONNECTED, NOT_ALLOWED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
