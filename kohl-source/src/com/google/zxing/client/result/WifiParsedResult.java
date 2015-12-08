// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;


// Referenced classes of package com.google.zxing.client.result:
//            ParsedResult, ParsedResultType

public final class WifiParsedResult extends ParsedResult
{

    private final boolean hidden;
    private final String networkEncryption;
    private final String password;
    private final String ssid;

    public WifiParsedResult(String s, String s1, String s2)
    {
        this(s, s1, s2, false);
    }

    public WifiParsedResult(String s, String s1, String s2, boolean flag)
    {
        super(ParsedResultType.WIFI);
        ssid = s1;
        networkEncryption = s;
        password = s2;
        hidden = flag;
    }

    public String getDisplayResult()
    {
        StringBuilder stringbuilder = new StringBuilder(80);
        maybeAppend(ssid, stringbuilder);
        maybeAppend(networkEncryption, stringbuilder);
        maybeAppend(password, stringbuilder);
        maybeAppend(Boolean.toString(hidden), stringbuilder);
        return stringbuilder.toString();
    }

    public String getNetworkEncryption()
    {
        return networkEncryption;
    }

    public String getPassword()
    {
        return password;
    }

    public String getSsid()
    {
        return ssid;
    }

    public boolean isHidden()
    {
        return hidden;
    }
}
