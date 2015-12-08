// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;


// Referenced classes of package com.google.zxing.client.result:
//            ParsedResult, ParsedResultType

public final class SMSParsedResult extends ParsedResult
{

    private final String body;
    private final String numbers[];
    private final String subject;
    private final String vias[];

    public SMSParsedResult(String s, String s1, String s2, String s3)
    {
        super(ParsedResultType.SMS);
        numbers = (new String[] {
            s
        });
        vias = (new String[] {
            s1
        });
        subject = s2;
        body = s3;
    }

    public SMSParsedResult(String as[], String as1[], String s, String s1)
    {
        super(ParsedResultType.SMS);
        numbers = as;
        vias = as1;
        subject = s;
        body = s1;
    }

    public String getBody()
    {
        return body;
    }

    public String getDisplayResult()
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        maybeAppend(numbers, stringbuilder);
        maybeAppend(subject, stringbuilder);
        maybeAppend(body, stringbuilder);
        return stringbuilder.toString();
    }

    public String[] getNumbers()
    {
        return numbers;
    }

    public String getSMSURI()
    {
        boolean flag2 = true;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("sms:");
        int i = 0;
        boolean flag1 = true;
        while (i < numbers.length) 
        {
            if (flag1)
            {
                flag1 = false;
            } else
            {
                stringbuilder.append(',');
            }
            stringbuilder.append(numbers[i]);
            if (vias != null && vias[i] != null)
            {
                stringbuilder.append(";via=");
                stringbuilder.append(vias[i]);
            }
            i++;
        }
        boolean flag;
        if (body != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (subject != null)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            stringbuilder.append('?');
            if (flag)
            {
                stringbuilder.append("body=");
                stringbuilder.append(body);
            }
            if (flag1)
            {
                if (flag)
                {
                    stringbuilder.append('&');
                }
                stringbuilder.append("subject=");
                stringbuilder.append(subject);
            }
        }
        return stringbuilder.toString();
    }

    public String getSubject()
    {
        return subject;
    }

    public String[] getVias()
    {
        return vias;
    }
}
