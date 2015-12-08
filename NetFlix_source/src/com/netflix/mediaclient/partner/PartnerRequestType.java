// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner;


public final class PartnerRequestType extends Enum
{

    private static final PartnerRequestType $VALUES[];
    public static final PartnerRequestType getExternalSignUpService;
    public static final PartnerRequestType getExternalSsoService;
    public static final PartnerRequestType getExternalUserData;
    public static final PartnerRequestType getExternalUserToken;
    public static final PartnerRequestType requestExternalUserAuth;
    public static final PartnerRequestType requestExternalUserConfirmation;
    private String intentName;
    private int requestCode;

    private PartnerRequestType(String s, int i, int j, String s1)
    {
        super(s, i);
        requestCode = j;
        intentName = s1;
    }

    public static boolean iSignup(PartnerRequestType partnerrequesttype)
    {
        return getExternalSignUpService.equals(partnerrequesttype) || getExternalUserData.equals(partnerrequesttype) || requestExternalUserConfirmation.equals(partnerrequesttype);
    }

    public static boolean iSso(PartnerRequestType partnerrequesttype)
    {
        return getExternalSsoService.equals(partnerrequesttype) || getExternalUserToken.equals(partnerrequesttype) || requestExternalUserAuth.equals(partnerrequesttype);
    }

    public static PartnerRequestType valueOf(String s)
    {
        return (PartnerRequestType)Enum.valueOf(com/netflix/mediaclient/partner/PartnerRequestType, s);
    }

    public static PartnerRequestType[] values()
    {
        return (PartnerRequestType[])$VALUES.clone();
    }

    public String getIntentName()
    {
        return intentName;
    }

    public int getRequestCode()
    {
        return requestCode;
    }

    static 
    {
        getExternalSsoService = new PartnerRequestType("getExternalSsoService", 0, 1, "com.netflix.mediaclient.intent.action.SSO_getExternalSsoService");
        getExternalUserToken = new PartnerRequestType("getExternalUserToken", 1, 2, "com.netflix.mediaclient.intent.action.SSO_getExternalUserToken");
        requestExternalUserAuth = new PartnerRequestType("requestExternalUserAuth", 2, 3, "com.netflix.mediaclient.intent.action.SSO_requestExternalUserAuthorization");
        getExternalSignUpService = new PartnerRequestType("getExternalSignUpService", 3, 4, "com.netflix.mediaclient.intent.action.SSO_getExternalSignUpService");
        getExternalUserData = new PartnerRequestType("getExternalUserData", 4, 5, "com.netflix.mediaclient.intent.action.SSO_getExternalUserData");
        requestExternalUserConfirmation = new PartnerRequestType("requestExternalUserConfirmation", 5, 6, "com.netflix.mediaclient.intent.action.SSO_requestExternalUserConfirmation");
        $VALUES = (new PartnerRequestType[] {
            getExternalSsoService, getExternalUserToken, requestExternalUserAuth, getExternalSignUpService, getExternalUserData, requestExternalUserConfirmation
        });
    }
}
