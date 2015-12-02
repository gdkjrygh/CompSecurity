// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.b;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class a
{

    public static byte[] a(byte abyte0[])
    {
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj = null;
        abyte0 = new InflaterInputStream(new ByteArrayInputStream(abyte0), new Inflater(true), 512);
        obj = new byte[512];
_L1:
        int i = abyte0.read(((byte []) (obj)), 0, obj.length);
label0:
        {
            {
                if (i >= 0)
                {
                    break label0;
                }
                if (abyte0 != null)
                {
                    try
                    {
                        abyte0.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (byte abyte0[]) { }
                }
            }
            return bytearrayoutputstream.toByteArray();
        }
        bytearrayoutputstream.write(((byte []) (obj)), 0, i);
          goto _L1
        obj;
_L5:
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
        }
        break MISSING_BLOCK_LABEL_64;
        abyte0;
_L3:
        if (obj != null)
        {
            try
            {
                ((InflaterInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw abyte0;
        Exception exception;
        exception;
        obj = abyte0;
        abyte0 = exception;
        if (true) goto _L3; else goto _L2
_L2:
        abyte0;
        abyte0 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
