// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.save;


public final class SaveMediaNotificationsToShow extends Enum
{

    private static final SaveMediaNotificationsToShow $VALUES[];
    public static final SaveMediaNotificationsToShow ALL;
    public static final SaveMediaNotificationsToShow FAIL_ONLY;
    public static final SaveMediaNotificationsToShow NONE;

    private SaveMediaNotificationsToShow(String s, int i)
    {
        super(s, i);
    }

    public static SaveMediaNotificationsToShow valueOf(String s)
    {
        return (SaveMediaNotificationsToShow)Enum.valueOf(com/snapchat/android/util/save/SaveMediaNotificationsToShow, s);
    }

    public static SaveMediaNotificationsToShow[] values()
    {
        return (SaveMediaNotificationsToShow[])$VALUES.clone();
    }

    static 
    {
        NONE = new SaveMediaNotificationsToShow("NONE", 0);
        FAIL_ONLY = new SaveMediaNotificationsToShow("FAIL_ONLY", 1);
        ALL = new SaveMediaNotificationsToShow("ALL", 2);
        $VALUES = (new SaveMediaNotificationsToShow[] {
            NONE, FAIL_ONLY, ALL
        });
    }
}
