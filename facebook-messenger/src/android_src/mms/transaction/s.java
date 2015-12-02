// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.transaction;

import android.os.Bundle;

public class s
{

    private final Bundle a;

    private s(int i)
    {
        a = new Bundle();
        a.putInt("type", i);
    }

    public s(int i, String s1)
    {
        this(i);
        a.putString("uri", s1);
    }

    public s(Bundle bundle)
    {
        a = bundle;
    }

    public int a()
    {
        return a.getInt("type");
    }

    public String b()
    {
        return a.getString("uri");
    }

    public byte[] c()
    {
        return a.getByteArray("mms-push-data");
    }

    public String d()
    {
        return a.getString("mmsc-url");
    }

    public String e()
    {
        return a.getString("proxy-address");
    }

    public int f()
    {
        return a.getInt("proxy-port");
    }

    public String toString()
    {
        return (new StringBuilder()).append("transactionType: ").append(a()).append(" uri: ").append(b()).append(" pushData: ").append(c()).append(" mmscUrl: ").append(d()).append(" proxyAddress: ").append(e()).append(" proxyPort: ").append(f()).toString();
    }
}
