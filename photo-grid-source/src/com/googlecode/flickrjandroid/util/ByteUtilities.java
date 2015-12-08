// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.util;


public class ByteUtilities
{

    static char hexChar[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };

    public ByteUtilities()
    {
    }

    public static String toHexString(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 2);
        int i = 0;
        do
        {
            if (i >= abyte0.length)
            {
                return stringbuffer.toString();
            }
            stringbuffer.append(hexChar[(abyte0[i] & 0xf0) >>> 4]);
            stringbuffer.append(hexChar[abyte0[i] & 0xf]);
            i++;
        } while (true);
    }

}
