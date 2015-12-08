// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;

import Io;

// Referenced classes of package com.snapchat.android.analytics:
//            ProfileEventAnalytics

public static final class  extends Enum
{

    private static final HAS_PICTURE $VALUES[];
    public static final HAS_PICTURE CONTACT_INFO;
    public static final HAS_PICTURE CONTACT_NAME;
    public static final HAS_PICTURE DISPLAY_NAME;
    public static final HAS_PICTURE FRIEND;
    public static final HAS_PICTURE HAS_PICTURE;
    public static final HAS_PICTURE IDENTITY_CELL_INDEX;
    public static final HAS_PICTURE IDENTITY_PROFILE_PAGE;
    public static final HAS_PICTURE IN_MY_CONTACTS;
    public static final HAS_PICTURE LAST_TAKEN_TIMESTAMP;
    public static final HAS_PICTURE REASON;
    public static final HAS_PICTURE SOURCE;
    public static final HAS_PICTURE STATUS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/ProfileEventAnalytics$ProfilePageMetricParams, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final String nameInLowerCase()
    {
        return Io.a(this);
    }

    static 
    {
        DISPLAY_NAME = new <init>("DISPLAY_NAME", 0);
        IDENTITY_CELL_INDEX = new <init>("IDENTITY_CELL_INDEX", 1);
        FRIEND = new <init>("FRIEND", 2);
        STATUS = new <init>("STATUS", 3);
        REASON = new <init>("REASON", 4);
        IDENTITY_PROFILE_PAGE = new <init>("IDENTITY_PROFILE_PAGE", 5);
        SOURCE = new <init>("SOURCE", 6);
        CONTACT_NAME = new <init>("CONTACT_NAME", 7);
        CONTACT_INFO = new <init>("CONTACT_INFO", 8);
        IN_MY_CONTACTS = new <init>("IN_MY_CONTACTS", 9);
        LAST_TAKEN_TIMESTAMP = new <init>("LAST_TAKEN_TIMESTAMP", 10);
        HAS_PICTURE = new <init>("HAS_PICTURE", 11);
        $VALUES = (new .VALUES[] {
            DISPLAY_NAME, IDENTITY_CELL_INDEX, FRIEND, STATUS, REASON, IDENTITY_PROFILE_PAGE, SOURCE, CONTACT_NAME, CONTACT_INFO, IN_MY_CONTACTS, 
            LAST_TAKEN_TIMESTAMP, HAS_PICTURE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
