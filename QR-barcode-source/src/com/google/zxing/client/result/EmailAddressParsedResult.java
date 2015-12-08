// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;


// Referenced classes of package com.google.zxing.client.result:
//            ParsedResult, ParsedResultType

public final class EmailAddressParsedResult extends ParsedResult
{

    private final String body;
    private final String emailAddress;
    private final String mailtoURI;
    private final String subject;

    EmailAddressParsedResult(String s, String s1, String s2, String s3)
    {
        super(ParsedResultType.EMAIL_ADDRESS);
        emailAddress = s;
        subject = s1;
        body = s2;
        mailtoURI = s3;
    }

    public String getBody()
    {
        return body;
    }

    public String getDisplayResult()
    {
        StringBuilder stringbuilder = new StringBuilder(30);
        maybeAppend(emailAddress, stringbuilder);
        maybeAppend(subject, stringbuilder);
        maybeAppend(body, stringbuilder);
        return stringbuilder.toString();
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public String getMailtoURI()
    {
        return mailtoURI;
    }

    public String getSubject()
    {
        return subject;
    }
}
