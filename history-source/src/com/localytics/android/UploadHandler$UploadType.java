// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


// Referenced classes of package com.localytics.android:
//            UploadHandler

private static final class  extends Enum
{

    private static final PROFILES $VALUES[];
    public static final PROFILES PROFILES;
    public static final PROFILES SESSIONS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/localytics/android/UploadHandler$UploadType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SESSIONS = new <init>("SESSIONS", 0);
        PROFILES = new <init>("PROFILES", 1);
        $VALUES = (new .VALUES[] {
            SESSIONS, PROFILES
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
