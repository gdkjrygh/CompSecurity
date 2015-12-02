// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.statistic;


public class EventID
{

    public static final int COMMIT_EVENT = 19999;
    private static final int ERROR = 0;
    public static final int ERROR_ONCAUGHTEXCEPTION = 2;
    public static final int ERROR_UNCAUGHTEXCEPTION = 1;
    private static final int NETWORK = 4000;
    public static final int NETWORK_DOWNLOAD = 4008;
    public static final int NETWORK_PUSH_ARRIVE = 4002;
    public static final int NETWORK_PUSH_DISPLAY = 4003;
    public static final int NETWORK_PUSH_VIEW = 4004;
    public static final int NETWORK_SEARCH = 4005;
    public static final int NETWORK_TRAFFIC = 4007;
    public static final int NETWORK_WEBPAGE = 4006;
    private static final int PAGE = 2000;
    public static final int PAGE_CREATE = 2003;
    public static final int PAGE_CTL = 2100;
    public static final int PAGE_CTL_CLICKED = 2101;
    public static final int PAGE_CTL_ITEM_SELECTED = 2102;
    public static final int PAGE_CTL_LONG_CLICKED = 2103;
    public static final int PAGE_DESTORY = 2004;
    public static final int PAGE_EASYTRACE = 6300;
    public static final int PAGE_EASYTRACE_CTRLCLICK = 6401;
    public static final int PAGE_EASYTRACE_ENTER = 6301;
    public static final int PAGE_EASYTRACE_LEAVE = 6302;
    public static final int PAGE_ENTER = 2001;
    public static final int PAGE_ENTER_2005 = 2005;
    public static final int PAGE_H5 = 2006;
    public static final int PAGE_LEAVE = 2002;
    private static final int SHARE = 5000;
    public static final int SHARE_WEIBO = 5001;
    private static final int SYSTEM = 1000;
    public static final int SYS_BACKGROUND = 1010;
    public static final int SYS_END = 1004;
    public static final int SYS_FIRST_START = 1002;
    public static final int SYS_FOREGROUND = 1009;
    public static final int SYS_INSTALLED = 1001;
    public static final int SYS_LOCATION = 1005;
    public static final int SYS_LOGIN_IN = 1007;
    public static final int SYS_LOGIN_OUT = 1008;
    public static final int SYS_REGISTER = 1006;
    public static final int SYS_SESSION = 1011;
    static final int SYS_SOFTWARE_DEGRADE = 1013;
    static final int SYS_SOFTWARE_REMOVE = 1014;
    static final int SYS_SOFTWARE_UPDATE = 1012;
    public static final int SYS_START = 1003;
    public static final int TRADE = 8001;
    private static final int USERTRACK = 6000;
    public static final int USERTRACK_ERROR = 6001;
    private static final int USERTRACK_INTEGRALITY = 6600;
    public static final int USERTRACK_INTEGRALITY_LOAD_SO_LIBRARY = 6601;
    public static final int USERTRACK_INTEGRALITY_SD_CARD_INFO = 6602;
    public static final int USERTRACK_ONCAUGHTEXCEPTION = 6002;
    public static final int USERTRACK_PERFORMANCE = 6003;

    public EventID()
    {
    }
}
