// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;


public class DeviceSecret
{

    public static final DeviceSecret EMPTY = new DeviceSecret();
    private final byte initVector[];
    private final byte key[];
    private final String name;

    private DeviceSecret()
    {
        name = "empty_key";
        byte abyte0[] = new byte[0];
        key = abyte0;
        initVector = abyte0;
    }

    public DeviceSecret(String s, byte abyte0[])
    {
        this(s, abyte0, null);
    }

    public DeviceSecret(String s, byte abyte0[], byte abyte1[])
    {
        name = s;
        key = arrayCopy(abyte0);
        initVector = arrayCopy(abyte1);
    }

    private byte[] arrayCopy(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            int i = abyte0.length;
            byte abyte1[] = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, abyte1, 0, i);
            return abyte1;
        }
    }

    public byte[] getInitVector()
    {
        return arrayCopy(initVector);
    }

    public byte[] getKey()
    {
        return arrayCopy(key);
    }

    public String getName()
    {
        return name;
    }

    public boolean hasInitVector()
    {
        return initVector != null && initVector.length != 0;
    }

}
