// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;


public final class FriendAction extends Enum
{
    public static final class BlockReason extends Enum
    {

        private static final BlockReason $VALUES[];
        public static final BlockReason ANNOYING;
        public static final BlockReason DONT_KNOW_WHOM;
        public static final BlockReason HARASSING_ME;
        public static final BlockReason INAPPROPRIATE_SNAPS;
        public static final BlockReason OTHER;
        private int code;
        private int textId;

        public static BlockReason valueOf(String s)
        {
            return (BlockReason)Enum.valueOf(com/snapchat/android/model/FriendAction$BlockReason, s);
        }

        public static BlockReason[] values()
        {
            return (BlockReason[])$VALUES.clone();
        }

        public final int getCode()
        {
            return code;
        }

        public final int getTextId()
        {
            return textId;
        }

        static 
        {
            INAPPROPRIATE_SNAPS = new BlockReason("INAPPROPRIATE_SNAPS", 0, 1, 0x7f080072);
            HARASSING_ME = new BlockReason("HARASSING_ME", 1, 2, 0x7f080071);
            ANNOYING = new BlockReason("ANNOYING", 2, 3, 0x7f08006f);
            DONT_KNOW_WHOM = new BlockReason("DONT_KNOW_WHOM", 3, 4, 0x7f080070);
            OTHER = new BlockReason("OTHER", 4, 0, 0x7f080073);
            $VALUES = (new BlockReason[] {
                INAPPROPRIATE_SNAPS, HARASSING_ME, ANNOYING, DONT_KNOW_WHOM, OTHER
            });
        }

        private BlockReason(String s, int i, int j, int k)
        {
            super(s, i);
            code = j;
            textId = k;
        }
    }


    private static final FriendAction $VALUES[];
    public static final FriendAction ADD;
    public static final FriendAction BLOCK;
    public static final FriendAction DELETE;
    public static final FriendAction HIDE;
    public static final FriendAction IGNORE;
    public static final FriendAction INVITE;
    public static final FriendAction MULTI_ADD;
    public static final FriendAction NONE;
    public static final FriendAction REMOVE;
    public static final FriendAction REPORT_SPAM;
    public static final FriendAction SET_DISPLAY_NAME;
    public static final FriendAction UNBLOCK;
    private String mServerActionName;

    private FriendAction(String s, int i, String s1)
    {
        super(s, i);
        mServerActionName = s1;
    }

    public static FriendAction valueOf(String s)
    {
        return (FriendAction)Enum.valueOf(com/snapchat/android/model/FriendAction, s);
    }

    public static FriendAction[] values()
    {
        return (FriendAction[])$VALUES.clone();
    }

    public final String getServerActionName()
    {
        return mServerActionName;
    }

    static 
    {
        ADD = new FriendAction("ADD", 0, "add");
        DELETE = new FriendAction("DELETE", 1, "delete");
        BLOCK = new FriendAction("BLOCK", 2, "block");
        UNBLOCK = new FriendAction("UNBLOCK", 3, "unblock");
        REMOVE = new FriendAction("REMOVE", 4, "remove");
        SET_DISPLAY_NAME = new FriendAction("SET_DISPLAY_NAME", 5, "display");
        REPORT_SPAM = new FriendAction("REPORT_SPAM", 6, "report_spam");
        IGNORE = new FriendAction("IGNORE", 7, "ignore");
        HIDE = new FriendAction("HIDE", 8, "hide");
        MULTI_ADD = new FriendAction("MULTI_ADD", 9, "add_all");
        INVITE = new FriendAction("INVITE", 10, null);
        NONE = new FriendAction("NONE", 11, null);
        $VALUES = (new FriendAction[] {
            ADD, DELETE, BLOCK, UNBLOCK, REMOVE, SET_DISPLAY_NAME, REPORT_SPAM, IGNORE, HIDE, MULTI_ADD, 
            INVITE, NONE
        });
    }
}
