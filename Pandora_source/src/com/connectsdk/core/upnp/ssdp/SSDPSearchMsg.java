// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.core.upnp.ssdp;


public class SSDPSearchMsg
{

    static final String HOST = "HOST: 239.255.255.250:1900";
    static final String MAN = "MAN: \"ssdp:discover\"";
    static final String UDAP = "USER-AGENT: UDAP/2.0";
    int mMX;
    String mST;

    public SSDPSearchMsg(String s)
    {
        mMX = 5;
        mST = s;
    }

    public int getmMX()
    {
        return mMX;
    }

    public String getmST()
    {
        return mST;
    }

    public void setmMX(int i)
    {
        mMX = i;
    }

    public void setmST(String s)
    {
        mST = s;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("M-SEARCH * HTTP/1.1").append("\r\n");
        stringbuilder.append("HOST: 239.255.255.250:1900").append("\r\n");
        stringbuilder.append("MAN: \"ssdp:discover\"").append("\r\n");
        stringbuilder.append((new StringBuilder()).append("ST: ").append(mST).toString()).append("\r\n");
        stringbuilder.append((new StringBuilder()).append("MX: ").append(mMX).toString()).append("\r\n");
        if (mST.contains("udap"))
        {
            stringbuilder.append("USER-AGENT: UDAP/2.0").append("\r\n");
        }
        stringbuilder.append("\r\n");
        return stringbuilder.toString();
    }
}
