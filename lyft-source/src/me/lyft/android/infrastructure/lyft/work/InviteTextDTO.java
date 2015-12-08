// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.work;


public class InviteTextDTO
{

    public final String benefitsUrl;
    public final String emailBody;
    public final String emailSubject;
    public final String smsBody;

    public InviteTextDTO(String s, String s1, String s2, String s3)
    {
        emailSubject = s;
        emailBody = s1;
        smsBody = s2;
        benefitsUrl = s3;
    }

    public String getBenefitsUrl()
    {
        return benefitsUrl;
    }

    public String getEmailBody()
    {
        return emailBody;
    }

    public String getEmailSubject()
    {
        return emailSubject;
    }

    public String getSmsBody()
    {
        return smsBody;
    }
}
