// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.fragment.utils;


public final class FragmentAction extends Enum
{

    public static final FragmentAction ACTION_DRAWER_CLOSE;
    public static final FragmentAction ACTION_DRAWER_OPEN;
    public static final FragmentAction CANCLE;
    public static final FragmentAction CLEAN_ACTION_UPDATE_COLOR;
    public static final FragmentAction ChangeTab;
    public static final FragmentAction GOOGLE_PLUS_LOGIN_FAILED;
    public static final FragmentAction GOOGLE_PLUS_LOGIN_SUCCESS;
    public static final FragmentAction LOCK_SCREEN_SAVING;
    public static final FragmentAction REFRESH;
    public static final FragmentAction RESULT_ACTION_FINISH;
    public static final FragmentAction RESULT_ACTION_SKIP_DRAWER;
    public static final FragmentAction RESULT_ACTION_SKIP_SUB_MODULE;
    public static final FragmentAction RESULT_ACTION_SWITCH_TAB;
    public static final FragmentAction SYSTEM_APP_UNINSTALL_CANCLE;
    public static final FragmentAction SYSTEM_APP_UNINSTALL_CONFIRM;
    private static final FragmentAction a[];

    private FragmentAction(String s, int i)
    {
        super(s, i);
    }

    public static FragmentAction valueOf(String s)
    {
        return (FragmentAction)Enum.valueOf(com/qihoo/security/ui/fragment/utils/FragmentAction, s);
    }

    public static FragmentAction[] values()
    {
        return (FragmentAction[])a.clone();
    }

    static 
    {
        GOOGLE_PLUS_LOGIN_SUCCESS = new FragmentAction("GOOGLE_PLUS_LOGIN_SUCCESS", 0);
        GOOGLE_PLUS_LOGIN_FAILED = new FragmentAction("GOOGLE_PLUS_LOGIN_FAILED", 1);
        LOCK_SCREEN_SAVING = new FragmentAction("LOCK_SCREEN_SAVING", 2);
        SYSTEM_APP_UNINSTALL_CONFIRM = new FragmentAction("SYSTEM_APP_UNINSTALL_CONFIRM", 3);
        SYSTEM_APP_UNINSTALL_CANCLE = new FragmentAction("SYSTEM_APP_UNINSTALL_CANCLE", 4);
        CANCLE = new FragmentAction("CANCLE", 5);
        REFRESH = new FragmentAction("REFRESH", 6);
        ACTION_DRAWER_OPEN = new FragmentAction("ACTION_DRAWER_OPEN", 7);
        ACTION_DRAWER_CLOSE = new FragmentAction("ACTION_DRAWER_CLOSE", 8);
        RESULT_ACTION_FINISH = new FragmentAction("RESULT_ACTION_FINISH", 9);
        RESULT_ACTION_SWITCH_TAB = new FragmentAction("RESULT_ACTION_SWITCH_TAB", 10);
        RESULT_ACTION_SKIP_SUB_MODULE = new FragmentAction("RESULT_ACTION_SKIP_SUB_MODULE", 11);
        RESULT_ACTION_SKIP_DRAWER = new FragmentAction("RESULT_ACTION_SKIP_DRAWER", 12);
        CLEAN_ACTION_UPDATE_COLOR = new FragmentAction("CLEAN_ACTION_UPDATE_COLOR", 13);
        ChangeTab = new FragmentAction("ChangeTab", 14);
        a = (new FragmentAction[] {
            GOOGLE_PLUS_LOGIN_SUCCESS, GOOGLE_PLUS_LOGIN_FAILED, LOCK_SCREEN_SAVING, SYSTEM_APP_UNINSTALL_CONFIRM, SYSTEM_APP_UNINSTALL_CANCLE, CANCLE, REFRESH, ACTION_DRAWER_OPEN, ACTION_DRAWER_CLOSE, RESULT_ACTION_FINISH, 
            RESULT_ACTION_SWITCH_TAB, RESULT_ACTION_SKIP_SUB_MODULE, RESULT_ACTION_SKIP_DRAWER, CLEAN_ACTION_UPDATE_COLOR, ChangeTab
        });
    }
}
