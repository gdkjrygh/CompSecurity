// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class AccessTokenSource extends Enum
{

    public static final AccessTokenSource CLIENT_TOKEN;
    private static final AccessTokenSource ENUM$VALUES[];
    public static final AccessTokenSource FACEBOOK_APPLICATION_NATIVE;
    public static final AccessTokenSource FACEBOOK_APPLICATION_SERVICE;
    public static final AccessTokenSource FACEBOOK_APPLICATION_WEB;
    public static final AccessTokenSource NONE;
    public static final AccessTokenSource TEST_USER;
    public static final AccessTokenSource WEB_VIEW;
    private final boolean canExtendToken;

    private AccessTokenSource(String s, int i, boolean flag)
    {
        super(s, i);
        canExtendToken = flag;
    }

    public static AccessTokenSource valueOf(String s)
    {
        return (AccessTokenSource)Enum.valueOf(com/facebook/AccessTokenSource, s);
    }

    public static AccessTokenSource[] values()
    {
        AccessTokenSource aaccesstokensource[] = ENUM$VALUES;
        int i = aaccesstokensource.length;
        AccessTokenSource aaccesstokensource1[] = new AccessTokenSource[i];
        System.arraycopy(aaccesstokensource, 0, aaccesstokensource1, 0, i);
        return aaccesstokensource1;
    }

    boolean canExtendToken()
    {
        return canExtendToken;
    }

    static 
    {
        NONE = new AccessTokenSource("NONE", 0, false);
        FACEBOOK_APPLICATION_WEB = new AccessTokenSource("FACEBOOK_APPLICATION_WEB", 1, true);
        FACEBOOK_APPLICATION_NATIVE = new AccessTokenSource("FACEBOOK_APPLICATION_NATIVE", 2, true);
        FACEBOOK_APPLICATION_SERVICE = new AccessTokenSource("FACEBOOK_APPLICATION_SERVICE", 3, true);
        WEB_VIEW = new AccessTokenSource("WEB_VIEW", 4, false);
        TEST_USER = new AccessTokenSource("TEST_USER", 5, true);
        CLIENT_TOKEN = new AccessTokenSource("CLIENT_TOKEN", 6, true);
        ENUM$VALUES = (new AccessTokenSource[] {
            NONE, FACEBOOK_APPLICATION_WEB, FACEBOOK_APPLICATION_NATIVE, FACEBOOK_APPLICATION_SERVICE, WEB_VIEW, TEST_USER, CLIENT_TOKEN
        });
    }
}
