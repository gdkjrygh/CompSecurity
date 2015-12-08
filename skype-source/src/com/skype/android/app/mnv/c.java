// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


final class c extends Enum
{

    private static final c $VALUES[];
    public static final c ADD_PHONE_VERIFY_BY_SMS;
    public static final c ADD_PHONE_VERIFY_BY_VOICE;
    public static final c ADD_VERIFIED_SOURCE_MSA;
    public static final c DELETE_PHONE;
    public static final c EDIT_PHONE_VERIFY_BY_SMS;
    public static final c EDIT_PHONE_VERIFY_BY_VOICE;
    public static final c EDIT_RESEND_PIN_BY_SMS;
    public static final c EDIT_RESEND_PIN_BY_VOICE;
    public static final c EDIT_SEARCHABLE;
    public static final c EDIT_VERIFY_PIN;
    public static final c PRE_CHECK;
    private final String method;
    private final String payload;

    private c(String s, int i, String s1, String s2)
    {
        super(s, i);
        method = s1;
        payload = s2;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/skype/android/app/mnv/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    public final String getMethod()
    {
        return method;
    }

    public final String getPayload()
    {
        return payload;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(method).append(" => '").append(payload).append("'").toString();
    }

    static 
    {
        PRE_CHECK = new c("PRE_CHECK", 0, "GET", "");
        ADD_PHONE_VERIFY_BY_SMS = new c("ADD_PHONE_VERIFY_BY_SMS", 1, "POST", "{\"Attributes\":[{\"Name\":\"PersonalContactProfile.Phones\",\"Add\":[{\"Name\":\"%s\",\"Country\":\"%s\",\"Searchable\":true,\"Label\":\"Phone_Other\",\"VerifyMethod\":\"SMS\",\"VerifyLanguage\":\"%s\"}]}]}");
        EDIT_PHONE_VERIFY_BY_SMS = new c("EDIT_PHONE_VERIFY_BY_SMS", 2, "POST", "{\"Attributes\":[{\"Name\":\"PersonalContactProfile.Phones\",\"Edit\":[{\"Name\":\"%s\",\"Country\":\"%s\",\"Searchable\":true,\"VerifyMethod\":\"SMS\",\"VerifyLanguage\":\"%s\"}]}]}");
        ADD_PHONE_VERIFY_BY_VOICE = new c("ADD_PHONE_VERIFY_BY_VOICE", 3, "POST", "{\"Attributes\":[{\"Name\":\"PersonalContactProfile.Phones\",\"Add\":[{\"Name\":\"%s\",\"Country\":\"%s\",\"Searchable\":true,\"Label\":\"Phone_Other\",\"VerifyMethod\":\"voice\",\"VerifyLanguage\":\"%s\"}]}]}");
        EDIT_PHONE_VERIFY_BY_VOICE = new c("EDIT_PHONE_VERIFY_BY_VOICE", 4, "POST", "{\"Attributes\":[{\"Name\":\"PersonalContactProfile.Phones\",\"Edit\":[{\"Name\":\"%s\",\"Country\":\"%s\",\"Searchable\":true,\"VerifyMethod\":\"voice\",\"VerifyLanguage\":\"%s\"}]}]}");
        ADD_VERIFIED_SOURCE_MSA = new c("ADD_VERIFIED_SOURCE_MSA", 5, "POST", "{\"Attributes\":[{\"Name\":\"PersonalContactProfile.Phones\",\"Add\":[{\"Name\":\"%s\",\"Country\":\"%s\",\"Searchable\":true,\"Label\":\"Phone_Other\"}]}]}");
        EDIT_RESEND_PIN_BY_SMS = new c("EDIT_RESEND_PIN_BY_SMS", 6, "POST", "{\"Attributes\":[{\"Name\":\"PersonalContactProfile.Phones\",\"Edit\":[{\"Name\":\"%s\",\"Country\":\"%s\",\"Searchable\":true,\"VerifyMethod\":\"SMS\",\"VerifyLanguage\":\"%s\"}]}]}");
        EDIT_RESEND_PIN_BY_VOICE = new c("EDIT_RESEND_PIN_BY_VOICE", 7, "POST", "{\"Attributes\":[{\"Name\":\"PersonalContactProfile.Phones\",\"Edit\":[{\"Name\":\"%s\",\"Country\":\"%s\",\"Searchable\":true,\"VerifyMethod\":\"voice\",\"VerifyLanguage\":\"%s\"}]}]}");
        EDIT_VERIFY_PIN = new c("EDIT_VERIFY_PIN", 8, "POST", "{\"Attributes\":[{\"Name\":\"PersonalContactProfile.Phones\",\"Edit\":[{\"Name\":\"%s\",\"Country\":\"%s\",\"Token\":\"%s\"}]}]}");
        EDIT_SEARCHABLE = new c("EDIT_SEARCHABLE", 9, "POST", "{\"Attributes\":[{\"Name\":\"PersonalContactProfile.Phones\",\"Edit\":[{\"Name\":\"%s\",\"Country\":\"%s\",\"Searchable\":true}]}]}");
        DELETE_PHONE = new c("DELETE_PHONE", 10, "POST", "{\"Attributes\":[{\"Name\":\"PersonalContactProfile.Phones\",\"Delete\":[{\"Name\":\"%s\",\"Country\":\"%s\"}]}]}");
        $VALUES = (new c[] {
            PRE_CHECK, ADD_PHONE_VERIFY_BY_SMS, EDIT_PHONE_VERIFY_BY_SMS, ADD_PHONE_VERIFY_BY_VOICE, EDIT_PHONE_VERIFY_BY_VOICE, ADD_VERIFIED_SOURCE_MSA, EDIT_RESEND_PIN_BY_SMS, EDIT_RESEND_PIN_BY_VOICE, EDIT_VERIFY_PIN, EDIT_SEARCHABLE, 
            DELETE_PHONE
        });
    }
}
