// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import java.util.Arrays;

public final class CharTypes
{

    private static final byte HEX_BYTES[];
    private static final char HEX_CHARS[];
    static final int sHexValues[];
    static final int sInputCodes[];
    static final int sInputCodesComment[];
    static final int sInputCodesJsNames[];
    static final int sInputCodesUtf8[];
    static final int sInputCodesUtf8JsNames[];
    static final int sOutputEscapes128[];

    public CharTypes()
    {
    }

    public static void appendQuoted(StringBuilder stringbuilder, String s)
    {
        int ai[] = sOutputEscapes128;
        int j = ai.length;
        int i = 0;
        int k = s.length();
        while (i < k) 
        {
            char c = s.charAt(i);
            if (c >= j || ai[c] == 0)
            {
                stringbuilder.append(c);
            } else
            {
                stringbuilder.append('\\');
                int l = ai[c];
                if (l < 0)
                {
                    stringbuilder.append('u');
                    stringbuilder.append('0');
                    stringbuilder.append('0');
                    l = -(l + 1);
                    stringbuilder.append(HEX_CHARS[l >> 4]);
                    stringbuilder.append(HEX_CHARS[l & 0xf]);
                } else
                {
                    stringbuilder.append((char)l);
                }
            }
            i++;
        }
    }

    public static int charToHex(int i)
    {
        if (i > 127)
        {
            return -1;
        } else
        {
            return sHexValues[i];
        }
    }

    public static byte[] copyHexBytes()
    {
        return (byte[])(byte[])HEX_BYTES.clone();
    }

    public static char[] copyHexChars()
    {
        return (char[])(char[])HEX_CHARS.clone();
    }

    public static int[] get7BitOutputEscapes()
    {
        return sOutputEscapes128;
    }

    public static int[] getInputCodeComment()
    {
        return sInputCodesComment;
    }

    public static int[] getInputCodeLatin1()
    {
        return sInputCodes;
    }

    public static int[] getInputCodeLatin1JsNames()
    {
        return sInputCodesJsNames;
    }

    public static int[] getInputCodeUtf8()
    {
        return sInputCodesUtf8;
    }

    public static int[] getInputCodeUtf8JsNames()
    {
        return sInputCodesUtf8JsNames;
    }

    static 
    {
        HEX_CHARS = "0123456789ABCDEF".toCharArray();
        int k1 = HEX_CHARS.length;
        HEX_BYTES = new byte[k1];
        for (int i = 0; i < k1; i++)
        {
            HEX_BYTES[i] = (byte)HEX_CHARS[i];
        }

        int ai[] = new int[256];
        for (int j = 0; j < 32; j++)
        {
            ai[j] = -1;
        }

        ai[34] = 1;
        ai[92] = 1;
        sInputCodes = ai;
        ai = new int[sInputCodes.length];
        System.arraycopy(sInputCodes, 0, ai, 0, sInputCodes.length);
        k1 = 128;
        while (k1 < 256) 
        {
            byte byte0;
            if ((k1 & 0xe0) == 192)
            {
                byte0 = 2;
            } else
            if ((k1 & 0xf0) == 224)
            {
                byte0 = 3;
            } else
            if ((k1 & 0xf8) == 240)
            {
                byte0 = 4;
            } else
            {
                byte0 = -1;
            }
            ai[k1] = byte0;
            k1++;
        }
        sInputCodesUtf8 = ai;
        ai = new int[256];
        Arrays.fill(ai, -1);
        for (int k = 33; k < 256; k++)
        {
            if (Character.isJavaIdentifierPart((char)k))
            {
                ai[k] = 0;
            }
        }

        ai[64] = 0;
        ai[35] = 0;
        ai[42] = 0;
        ai[45] = 0;
        ai[43] = 0;
        sInputCodesJsNames = ai;
        ai = new int[256];
        System.arraycopy(sInputCodesJsNames, 0, ai, 0, sInputCodesJsNames.length);
        Arrays.fill(ai, 128, 128, 0);
        sInputCodesUtf8JsNames = ai;
        sInputCodesComment = new int[256];
        System.arraycopy(sInputCodesUtf8, 128, sInputCodesComment, 128, 128);
        Arrays.fill(sInputCodesComment, 0, 32, -1);
        sInputCodesComment[9] = 0;
        sInputCodesComment[10] = 10;
        sInputCodesComment[13] = 13;
        sInputCodesComment[42] = 42;
        ai = new int[128];
        for (int l = 0; l < 32; l++)
        {
            ai[l] = -1;
        }

        ai[34] = 34;
        ai[92] = 92;
        ai[8] = 98;
        ai[9] = 116;
        ai[12] = 102;
        ai[10] = 110;
        ai[13] = 114;
        sOutputEscapes128 = ai;
        sHexValues = new int[128];
        Arrays.fill(sHexValues, -1);
        for (int i1 = 0; i1 < 10; i1++)
        {
            sHexValues[i1 + 48] = i1;
        }

        for (int j1 = 0; j1 < 6; j1++)
        {
            sHexValues[j1 + 97] = j1 + 10;
            sHexValues[j1 + 65] = j1 + 10;
        }

    }
}
