// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

class AppCryptoManager
{

    public static final int ENCODING_SCHEME_Base16Text = 1;
    public static final int ENCODING_SCHEME_Base64Text = 0;
    private static final String a = "F1D3A567894BC2E0";
    private final String b = "AES/CBC/PKCS5Padding";
    private final String c = "AES";
    private Cipher d;
    private SecretKey e;
    private IvParameterSpec f;

    AppCryptoManager()
    {
        d = null;
        e = null;
        f = null;
    }

    private void a()
    {
        if (d != null && e != null && f != null)
        {
            return;
        } else
        {
            e = new SecretKeySpec(new byte[] {
                -91, 48, -17, -86, 80, 82, 118, -105, -121, 43, 
                23, -17, -17, -12, -85, -11, 56, -126, -114, -96, 
                -36, -122, 67, -71, 65, 64, 112, -69, 85, -40, 
                24, 112
            }, "AES");
            f = new IvParameterSpec("F1D3A567894BC2E0".getBytes("UTF-8"));
            d = Cipher.getInstance("AES/CBC/PKCS5Padding");
            return;
        }
    }

    private byte[] a(byte abyte0[])
    {
        a();
        d.init(1, e, f);
        return d.doFinal(abyte0);
    }

    private byte[] b(byte abyte0[])
    {
        a();
        d.init(2, e, f);
        return d.doFinal(abyte0);
    }

    public String decrypt(String s, int i)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 32
    //                   1 41;
           goto _L1 _L2 _L3
_L1:
        s = null;
_L5:
        if (s == null)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        s = Base64.decode(s, 0);
        continue; /* Loop/switch isn't completed */
_L3:
        s = AppBase16.decodeString(s).getBytes("UTF-8");
        if (true) goto _L5; else goto _L4
_L4:
        s = b(s);
        if (s == null)
        {
            throw new Exception("Could not get decrypted text from plain text");
        } else
        {
            return new String(s);
        }
    }

    public String encrypt(String s, int i)
    {
        s = a(s.getBytes());
        if (s == null)
        {
            throw new Exception("Could not get encrypted text from plain text");
        }
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return Base64.encodeToString(s, 0);

        case 1: // '\001'
            return AppBase16.encode(s);
        }
    }

    private class AppBase16
    {

        private static final String a = "0123456789ABCDEF";

        private static void a(StringBuffer stringbuffer, byte byte0)
        {
            stringbuffer.append("0123456789ABCDEF".charAt(byte0 >> 4 & 0xf)).append("0123456789ABCDEF".charAt(byte0 & 0xf));
        }

        public static byte[] decodeBytes(String s)
        {
            int j = s.length() / 2;
            byte abyte0[] = new byte[j];
            for (int i = 0; i < j; i++)
            {
                abyte0[i] = Integer.valueOf(s.substring(i * 2, i * 2 + 1), 16).byteValue();
            }

            return abyte0;
        }

        public static String decodeString(String s)
        {
            return new String(decodeBytes(s));
        }

        public static String encode(String s)
        {
            return encode(s.getBytes());
        }

        public static String encode(byte abyte0[])
        {
            if (abyte0 == null)
            {
                return "";
            }
            StringBuffer stringbuffer = new StringBuffer(abyte0.length * 2);
            for (int i = 0; i < abyte0.length; i++)
            {
                a(stringbuffer, abyte0[i]);
            }

            return stringbuffer.toString();
        }

        public AppBase16()
        {
        }
    }

}
