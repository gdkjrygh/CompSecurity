// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2;


// Referenced classes of package com.htc.lib2:
//            Hms

public static final class  extends Enum
{

    private static final COMPATIBLE $VALUES[];
    public static final COMPATIBLE COMPATIBLE;
    public static final COMPATIBLE ERROR_HSP_NOT_ENABLED;
    public static final COMPATIBLE ERROR_HSP_NOT_INSTALLED;
    public static final COMPATIBLE ERROR_HSP_NOT_SUPPORTED;
    public static final COMPATIBLE ERROR_UNKNOWN;
    public static final COMPATIBLE HMS_APP_UPDATE_REQUIRED;
    public static final COMPATIBLE HSP_UPDATE_REQUIRED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/htc/lib2/Hms$CompatibilityStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ERROR_UNKNOWN = new <init>("ERROR_UNKNOWN", 0);
        ERROR_HSP_NOT_SUPPORTED = new <init>("ERROR_HSP_NOT_SUPPORTED", 1);
        ERROR_HSP_NOT_INSTALLED = new <init>("ERROR_HSP_NOT_INSTALLED", 2);
        ERROR_HSP_NOT_ENABLED = new <init>("ERROR_HSP_NOT_ENABLED", 3);
        HMS_APP_UPDATE_REQUIRED = new <init>("HMS_APP_UPDATE_REQUIRED", 4);
        HSP_UPDATE_REQUIRED = new <init>("HSP_UPDATE_REQUIRED", 5);
        COMPATIBLE = new <init>("COMPATIBLE", 6);
        $VALUES = (new .VALUES[] {
            ERROR_UNKNOWN, ERROR_HSP_NOT_SUPPORTED, ERROR_HSP_NOT_INSTALLED, ERROR_HSP_NOT_ENABLED, HMS_APP_UPDATE_REQUIRED, HSP_UPDATE_REQUIRED, COMPATIBLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
