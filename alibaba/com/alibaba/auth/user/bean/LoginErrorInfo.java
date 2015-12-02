// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.auth.user.bean;


// Referenced classes of package com.alibaba.auth.user.bean:
//            SnsAuthInfo

public class LoginErrorInfo
{

    public static final int SNS_LOGIN_AUTH_FAILED = 3000;
    public static final int SNS_LOGIN_AUTH_SUCCESS_CHECK_SNS_BIND_STATUS_FAILED = 4000;
    public static final int SNS_LOGIN_AUTH_SUCCESS_LOGIN_FAILED_EMAIL_HAS_BEEN_REGISTERED = 5000;
    public static final int SNS_LOGIN_AUTH_SUCCESS_LOGIN_FAILED_EXCEED_MAX_REGISTER_TIMES = 5001;
    public static final int SNS_LOGIN_AUTH_SUCCESS_LOGIN_FAILED_OTHER_ERROR = 5002;
    public int err_code;
    public String err_msg;
    public SnsAuthInfo snsAuthInfo;

    public LoginErrorInfo()
    {
    }
}
