// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class axe
{

    private static String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static String a(String s)
    {
        try
        {
            s = s.getBytes("US-ASCII");
            s = a(((byte []) (s)), 0, s.length);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    public static String a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public static String a(byte abyte0[], int i, int j)
    {
        StringBuilder stringbuilder;
        int k;
        int l;
        stringbuilder = new StringBuilder();
        k = 0;
        l = i;
_L6:
        if (l >= i + j)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        (l - i) % 3;
        JVM INSTR tableswitch 0 2: default 56
    //                   0 78
    //                   1 92
    //                   2 118;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_118;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L7:
        stringbuilder.append(a.charAt(k));
        l++;
        if (true) goto _L6; else goto _L5
_L5:
        k = abyte0[l] >> 2 & 0x3f;
          goto _L7
_L3:
        k = abyte0[l] >> 4 & 0xf | abyte0[l - 1] << 4 & 0x30;
          goto _L7
        k = abyte0[l];
        byte byte0 = abyte0[l - 1];
        stringbuilder.append(a.charAt(k >> 6 & 3 | byte0 << 2 & 0x3c));
        k = abyte0[l] & 0x3f;
          goto _L7
        (l - i) % 3;
        JVM INSTR tableswitch 0 2: default 204
    //                   0 204
    //                   1 209
    //                   2 243;
           goto _L8 _L8 _L9 _L10
_L8:
        return stringbuilder.toString();
_L9:
        i = abyte0[l - 1];
        stringbuilder.append(a.charAt(i << 4 & 0x30));
        stringbuilder.append("==");
        continue; /* Loop/switch isn't completed */
_L10:
        i = abyte0[l - 1];
        stringbuilder.append(a.charAt(i << 2 & 0x3c));
        stringbuilder.append('=');
        if (true) goto _L8; else goto _L11
_L11:
    }

}
