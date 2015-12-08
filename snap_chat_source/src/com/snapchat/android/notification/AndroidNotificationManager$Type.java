// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;


// Referenced classes of package com.snapchat.android.notification:
//            AndroidNotificationManager

public static final class a extends Enum
{

    private static final ADD_COLLABORATOR_TO_COLLABORATOR $VALUES[];
    public static final ADD_COLLABORATOR_TO_COLLABORATOR ADDFRIEND;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR ADD_COLLABORATOR_TO_COLLABORATOR;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR ADD_COLLABORATOR_TO_OWNER;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR CASH;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR CASH_MESSAGE;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR CHAT;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR CHAT_SCREENSHOT;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR EMAIL_VERIFIED;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR FAILED_CASH;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR FAILED_CHAT_NOT_FRIENDS;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR FAILED_SNAP_AND_CHAT;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR HERE_SCREENSHOT;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR REPLAY;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR SCREENSHOT;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR SNAP;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR STORIES;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR TYPING;
    public static final ADD_COLLABORATOR_TO_COLLABORATOR UPLOAD_LOGS_REQUEST;
    private final int a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/snapchat/android/notification/AndroidNotificationManager$Type, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public final int getNotificationId()
    {
        return a;
    }

    public final String getTypeNotificationAction()
    {
        return (new StringBuilder("LANDING_PAGE_ACTION_FROM_NOTIF_TYPE")).append(name()).toString();
    }

    static 
    {
        SNAP = new <init>("SNAP", 0, 0);
        CHAT = new <init>("CHAT", 1, 0);
        ADDFRIEND = new <init>("ADDFRIEND", 2, 1);
        REPLAY = new <init>("REPLAY", 3, 2);
        TYPING = new <init>("TYPING", 4, 3);
        SCREENSHOT = new <init>("SCREENSHOT", 5, 4);
        CHAT_SCREENSHOT = new <init>("CHAT_SCREENSHOT", 6, 5);
        HERE_SCREENSHOT = new <init>("HERE_SCREENSHOT", 7, 6);
        STORIES = new <init>("STORIES", 8, 7);
        CASH = new <init>("CASH", 9, 11);
        CASH_MESSAGE = new <init>("CASH_MESSAGE", 10, 13);
        FAILED_SNAP_AND_CHAT = new <init>("FAILED_SNAP_AND_CHAT", 11, 8);
        FAILED_CHAT_NOT_FRIENDS = new <init>("FAILED_CHAT_NOT_FRIENDS", 12, 9);
        UPLOAD_LOGS_REQUEST = new <init>("UPLOAD_LOGS_REQUEST", 13, 10);
        FAILED_CASH = new <init>("FAILED_CASH", 14, 12);
        EMAIL_VERIFIED = new <init>("EMAIL_VERIFIED", 15, 15);
        ADD_COLLABORATOR_TO_OWNER = new <init>("ADD_COLLABORATOR_TO_OWNER", 16, 16);
        ADD_COLLABORATOR_TO_COLLABORATOR = new <init>("ADD_COLLABORATOR_TO_COLLABORATOR", 17, 17);
        $VALUES = (new .VALUES[] {
            SNAP, CHAT, ADDFRIEND, REPLAY, TYPING, SCREENSHOT, CHAT_SCREENSHOT, HERE_SCREENSHOT, STORIES, CASH, 
            CASH_MESSAGE, FAILED_SNAP_AND_CHAT, FAILED_CHAT_NOT_FRIENDS, UPLOAD_LOGS_REQUEST, FAILED_CASH, EMAIL_VERIFIED, ADD_COLLABORATOR_TO_OWNER, ADD_COLLABORATOR_TO_COLLABORATOR
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        a = j;
    }
}
