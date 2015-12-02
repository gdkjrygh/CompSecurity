// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.quc;


// Referenced classes of package com.qihoo.security.quc:
//            AccountLog

public static final class value extends Enum
{

    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_APP_MGR_UNINSTALL_NUM;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_BACKUP_APP_SUCCESS_NUM;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_BLOCKED_SMS_COUNT;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_BLOCK_BLACKLIST_COUNT;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_BLOCK_TELEPHONE_NUMBER_COUNT;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_CHECKUP_CALENDAR;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_CLEANUP;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_CLEAN_TOTAL_SIZE;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_FIND_MALWARE_COUNT;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_FLOAT_VIEW_CLEANUP;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_FLOAT_VIEW_SWITCHER;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_FLOAT_WINDOW_USEED_NUM;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_KILL_MALWARE_COUNT;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_NOTIFICATION_TOOLS;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_SHAKE_HIGHEST_SCORE;
    public static final DATA_FLOAT_WINDOW_USEED_NUM DATA_SHARE_COUNT;
    private static final DATA_FLOAT_WINDOW_USEED_NUM a[];
    public final int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/qihoo/security/quc/AccountLog$FUNC_DATA_LIST, s);
    }

    public static value[] values()
    {
        return (value[])a.clone();
    }

    static 
    {
        DATA_CLEANUP = new <init>("DATA_CLEANUP", 0, 8001);
        DATA_FIND_MALWARE_COUNT = new <init>("DATA_FIND_MALWARE_COUNT", 1, 8002);
        DATA_KILL_MALWARE_COUNT = new <init>("DATA_KILL_MALWARE_COUNT", 2, 8003);
        DATA_BLOCK_TELEPHONE_NUMBER_COUNT = new <init>("DATA_BLOCK_TELEPHONE_NUMBER_COUNT", 3, 8004);
        DATA_FLOAT_VIEW_CLEANUP = new <init>("DATA_FLOAT_VIEW_CLEANUP", 4, 8005);
        DATA_FLOAT_VIEW_SWITCHER = new <init>("DATA_FLOAT_VIEW_SWITCHER", 5, 8006);
        DATA_NOTIFICATION_TOOLS = new <init>("DATA_NOTIFICATION_TOOLS", 6, 8007);
        DATA_BLOCK_BLACKLIST_COUNT = new <init>("DATA_BLOCK_BLACKLIST_COUNT", 7, 8008);
        DATA_BLOCKED_SMS_COUNT = new <init>("DATA_BLOCKED_SMS_COUNT", 8, 8009);
        DATA_SHAKE_HIGHEST_SCORE = new <init>("DATA_SHAKE_HIGHEST_SCORE", 9, 8010);
        DATA_CLEAN_TOTAL_SIZE = new <init>("DATA_CLEAN_TOTAL_SIZE", 10, 8011);
        DATA_BACKUP_APP_SUCCESS_NUM = new <init>("DATA_BACKUP_APP_SUCCESS_NUM", 11, 8012);
        DATA_APP_MGR_UNINSTALL_NUM = new <init>("DATA_APP_MGR_UNINSTALL_NUM", 12, 8013);
        DATA_CHECKUP_CALENDAR = new <init>("DATA_CHECKUP_CALENDAR", 13, 8014);
        DATA_SHARE_COUNT = new <init>("DATA_SHARE_COUNT", 14, 8015);
        DATA_FLOAT_WINDOW_USEED_NUM = new <init>("DATA_FLOAT_WINDOW_USEED_NUM", 15, 8016);
        a = (new a[] {
            DATA_CLEANUP, DATA_FIND_MALWARE_COUNT, DATA_KILL_MALWARE_COUNT, DATA_BLOCK_TELEPHONE_NUMBER_COUNT, DATA_FLOAT_VIEW_CLEANUP, DATA_FLOAT_VIEW_SWITCHER, DATA_NOTIFICATION_TOOLS, DATA_BLOCK_BLACKLIST_COUNT, DATA_BLOCKED_SMS_COUNT, DATA_SHAKE_HIGHEST_SCORE, 
            DATA_CLEAN_TOTAL_SIZE, DATA_BACKUP_APP_SUCCESS_NUM, DATA_APP_MGR_UNINSTALL_NUM, DATA_CHECKUP_CALENDAR, DATA_SHARE_COUNT, DATA_FLOAT_WINDOW_USEED_NUM
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
