// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.e;


public final class b extends Enum
{

    private static final b $VALUES[];
    public static final b APP_UPGRADE;
    public static final b CHANGE_GROUP;
    public static final b CLIENT_EXPIRE;
    public static final b SERVER_EXPIRE;
    public static final b USER_LOGOUT;
    private final String eventContext;

    private b(String s, int i, String s1)
    {
        super(s, i);
        eventContext = s1;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/facebook/abtest/qe/e/b, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    static 
    {
        APP_UPGRADE = new b("APP_UPGRADE", 0, "app_upgrade");
        USER_LOGOUT = new b("USER_LOGOUT", 1, "user_logout");
        CLIENT_EXPIRE = new b("CLIENT_EXPIRE", 2, "client_expire");
        SERVER_EXPIRE = new b("SERVER_EXPIRE", 3, "server_expire");
        CHANGE_GROUP = new b("CHANGE_GROUP", 4, "change_group");
        $VALUES = (new b[] {
            APP_UPGRADE, USER_LOGOUT, CLIENT_EXPIRE, SERVER_EXPIRE, CHANGE_GROUP
        });
    }

}
