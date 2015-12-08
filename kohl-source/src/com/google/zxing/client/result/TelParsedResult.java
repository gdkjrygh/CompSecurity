// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;


// Referenced classes of package com.google.zxing.client.result:
//            ParsedResult, ParsedResultType

public final class TelParsedResult extends ParsedResult
{

    private final String number;
    private final String telURI;
    private final String title;

    public TelParsedResult(String s, String s1, String s2)
    {
        super(ParsedResultType.TEL);
        number = s;
        telURI = s1;
        title = s2;
    }

    public String getDisplayResult()
    {
        StringBuilder stringbuilder = new StringBuilder(20);
        maybeAppend(number, stringbuilder);
        maybeAppend(title, stringbuilder);
        return stringbuilder.toString();
    }

    public String getNumber()
    {
        return number;
    }

    public String getTelURI()
    {
        return telURI;
    }

    public String getTitle()
    {
        return title;
    }
}
