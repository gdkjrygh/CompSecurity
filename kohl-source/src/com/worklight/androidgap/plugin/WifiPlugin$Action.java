// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;


// Referenced classes of package com.worklight.androidgap.plugin:
//            WifiPlugin

static final class  extends Enum
{

    private static final ACQUIRE_WIFI $VALUES[];
    public static final ACQUIRE_WIFI ACQUIRE_WIFI;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/worklight/androidgap/plugin/WifiPlugin$Action, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ACQUIRE_WIFI = new <init>("ACQUIRE_WIFI", 0);
        $VALUES = (new .VALUES[] {
            ACQUIRE_WIFI
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
