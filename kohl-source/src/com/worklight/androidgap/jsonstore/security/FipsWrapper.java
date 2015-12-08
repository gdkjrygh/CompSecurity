// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.security;

import com.worklight.nativeandroid.common.WLUtils;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;

public class FipsWrapper
{

    public FipsWrapper()
    {
    }

    private static native byte[] _decryptAES(byte abyte0[], int i, byte abyte1[], int j, byte abyte2[], int k);

    private static native int _disableFips();

    private static native int _enableFips();

    private static native byte[] _encryptAES(byte abyte0[], int i, byte abyte1[], int j, String s, int k);

    private static native int _getFipsMode();

    private static native int _setFips(int i);

    public static String decryptAES(String s, String s1, byte abyte0[])
    {
        s = WLUtils.hexStringToByteArray(s);
        s1 = WLUtils.hexStringToByteArray(s1);
        s1 = _decryptAES(s, s.length, s1, s1.length, abyte0, abyte0.length);
        try
        {
            Charset.forName("UTF-8").newDecoder().decode(ByteBuffer.wrap(s1));
            s = new String(s1, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = null;
        }
        Arrays.fill(s1, (byte)0);
        return s;
    }

    public static int disableFips()
    {
        return _disableFips();
    }

    public static int enableFips()
    {
        return _enableFips();
    }

    public static byte[] encryptAES(String s, String s1, String s2)
    {
        s = WLUtils.hexStringToByteArray(s);
        s1 = WLUtils.hexStringToByteArray(s1);
        return _encryptAES(s, s.length, s1, s1.length, s2, s2.length());
    }

    public static int getFipsMode()
    {
        return _getFipsMode();
    }

    public static int setFips(int i)
    {
        return _setFips(i);
    }

    static 
    {
        System.loadLibrary("openssl_fips");
    }
}
