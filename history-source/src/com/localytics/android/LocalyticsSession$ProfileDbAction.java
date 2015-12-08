// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


// Referenced classes of package com.localytics.android:
//            LocalyticsSession

static final class  extends Enum
{

    private static final SET_ATTRIBUTE $VALUES[];
    public static final SET_ATTRIBUTE SET_ATTRIBUTE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/localytics/android/LocalyticsSession$ProfileDbAction, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SET_ATTRIBUTE = new <init>("SET_ATTRIBUTE", 0);
        $VALUES = (new .VALUES[] {
            SET_ATTRIBUTE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
