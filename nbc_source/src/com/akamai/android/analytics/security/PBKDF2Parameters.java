// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics.security;


public class PBKDF2Parameters
{

    protected byte derivedKey[];
    protected String hashAlgorithm;
    protected String hashCharset;
    protected int iterationCount;
    protected byte salt[];

    public PBKDF2Parameters()
    {
        hashAlgorithm = null;
        hashCharset = "UTF-8";
        salt = null;
        iterationCount = 1000;
        derivedKey = null;
    }

    public PBKDF2Parameters(String s, String s1, byte abyte0[], int i)
    {
        hashAlgorithm = s;
        hashCharset = s1;
        salt = abyte0;
        iterationCount = i;
        derivedKey = null;
    }

    public PBKDF2Parameters(String s, String s1, byte abyte0[], int i, byte abyte1[])
    {
        hashAlgorithm = s;
        hashCharset = s1;
        salt = abyte0;
        iterationCount = i;
        derivedKey = abyte1;
    }

    public byte[] getDerivedKey()
    {
        return derivedKey;
    }

    public String getHashAlgorithm()
    {
        return hashAlgorithm;
    }

    public String getHashCharset()
    {
        return hashCharset;
    }

    public int getIterationCount()
    {
        return iterationCount;
    }

    public byte[] getSalt()
    {
        return salt;
    }

    public void setDerivedKey(byte abyte0[])
    {
        derivedKey = abyte0;
    }

    public void setHashAlgorithm(String s)
    {
        hashAlgorithm = s;
    }

    public void setHashCharset(String s)
    {
        hashCharset = s;
    }

    public void setIterationCount(int i)
    {
        iterationCount = i;
    }

    public void setSalt(byte abyte0[])
    {
        salt = abyte0;
    }
}
