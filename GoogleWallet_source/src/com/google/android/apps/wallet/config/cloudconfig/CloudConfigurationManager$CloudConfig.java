// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.cloudconfig;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.config.cloudconfig:
//            CloudConfigurationManager

public static final class wobsImageServerAuthority extends Enum
{

    private static final PROD $VALUES[];
    public static final PROD DEVELOPMENT;
    public static final PROD PROD;
    public static final PROD SANDBOX;
    private final String oauthScope;
    private final int paymentsSdkEnvironment;
    private final String scottyImageUploadUrl;
    private final String webLoginService;
    private final String webUrlPrefix;
    private final String wobsImageServerAuthority;

    public static String getGmailServiceName()
    {
        return "mail";
    }

    public static String getGmailUrlPrefix()
    {
        return "https://mail.google.com/mail";
    }

    public static wobsImageServerAuthority valueOf(String s)
    {
        return (wobsImageServerAuthority)Enum.valueOf(com/google/android/apps/wallet/config/cloudconfig/CloudConfigurationManager$CloudConfig, s);
    }

    public static wobsImageServerAuthority[] values()
    {
        return (wobsImageServerAuthority[])$VALUES.clone();
    }

    public final String getOauthScope()
    {
        return oauthScope;
    }

    public final Integer getPaymentsSdkEnvironment()
    {
        return Integer.valueOf(paymentsSdkEnvironment);
    }

    public final String getScottyImageUploadUrl()
    {
        return scottyImageUploadUrl;
    }

    public final String getWhiskyServiceName()
    {
        return webLoginService;
    }

    public final String getWhiskyUrlPrefix()
    {
        return webUrlPrefix;
    }

    public final String getWobsImageServerAuthority()
    {
        return wobsImageServerAuthority;
    }

    static 
    {
        DEVELOPMENT = new <init>("DEVELOPMENT", 0, "oauth2:https://www.googleapis.com/auth/sierrasandbox", "https://proxy-card-dev.corp.google.com/", "sierrasandbox", "", 0, "");
        SANDBOX = new <init>("SANDBOX", 1, "oauth2:https://www.googleapis.com/auth/sierrasandbox", "https://wallet-web.sandbox.google.com/", "sierrasandbox", "https://wallet-objects.sandbox.google.com/walletobjects/images/upload/", 0, "wallet-web.sandbox.google.com");
        PROD = new <init>("PROD", 2, "oauth2:https://www.googleapis.com/auth/sierra", "https://wallet.google.com/", "sierra", "https://wallet.google.com/walletobjects/images/upload/", 1, "wallet.google.com");
        $VALUES = (new .VALUES[] {
            DEVELOPMENT, SANDBOX, PROD
        });
    }

    private (String s, int i, String s1, String s2, String s3, String s4, int j, 
            String s5)
    {
        super(s, i);
        oauthScope = (String)Preconditions.checkNotNull(s1);
        webUrlPrefix = (String)Preconditions.checkNotNull(s2);
        webLoginService = (String)Preconditions.checkNotNull(s3);
        scottyImageUploadUrl = (String)Preconditions.checkNotNull(s4);
        paymentsSdkEnvironment = j;
        wobsImageServerAuthority = (String)Preconditions.checkNotNull(s5);
    }
}
