// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;


public final class  extends Enum
{

    private static final VEHICLE_INSPECTION $VALUES[];
    public static final VEHICLE_INSPECTION VEHICLE_INSPECTION;
    public static final VEHICLE_INSPECTION VEHICLE_REGISTRATION;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/ui/settings/SettingsScreens$CapturedCarDocumentScreen$DocumentType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VEHICLE_REGISTRATION = new <init>("VEHICLE_REGISTRATION", 0);
        VEHICLE_INSPECTION = new <init>("VEHICLE_INSPECTION", 1);
        $VALUES = (new .VALUES[] {
            VEHICLE_REGISTRATION, VEHICLE_INSPECTION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
