// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.database.CharArrayBuffer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ik
{

    public static byte[] a(InputStream inputstream, boolean flag)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte0 = new byte[10000];
_L1:
        int i;
        try
        {
            i = inputstream.read(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new RuntimeException(inputstream);
        }
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        bytearrayoutputstream.write(abyte0, 0, i);
          goto _L1
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        inputstream.close();
        return bytearrayoutputstream.toByteArray();
    }

    public static void b(String s, CharArrayBuffer chararraybuffer)
    {
        if (chararraybuffer.data == null || chararraybuffer.data.length < s.length())
        {
            chararraybuffer.data = s.toCharArray();
        } else
        {
            s.getChars(0, s.length(), chararraybuffer.data, 0);
        }
        chararraybuffer.sizeCopied = s.length();
    }
}
