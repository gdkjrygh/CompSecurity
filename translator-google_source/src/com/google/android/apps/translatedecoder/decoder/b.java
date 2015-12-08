// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import com.google.android.apps.translatedecoder.util.DecoderRuntimeException;
import com.google.android.apps.translatedecoder.util.StringMap;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Logger;

public final class b
{

    private static final Logger a = Logger.getLogger("translate");
    private static StringMap b = null;
    private static StringMap c = null;
    private static StringMap d = null;
    private static StringMap e = null;

    private static StringMap a(String s, String s1)
    {
        Object obj1;
        if (s == null || s.isEmpty())
        {
            throw new DecoderRuntimeException("C2cdImNullFile");
        }
        obj1 = null;
        Object obj = (new RandomAccessFile(s, "r")).getChannel();
        obj1 = StringMap.readFromByteBuffer(((FileChannel) (obj)).map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, (int)((FileChannel) (obj)).size()));
        Exception exception;
        if (obj != null)
        {
            try
            {
                ((FileChannel) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                s1 = String.valueOf(s1);
                if (s1.length() != 0)
                {
                    s1 = "C2cdImFailed:".concat(s1);
                } else
                {
                    s1 = new String("C2cdImFailed:");
                }
                throw new DecoderRuntimeException(s1, ((Throwable) (obj)), s);
            }
            return ((StringMap) (obj1));
        } else
        {
            return ((StringMap) (obj1));
        }
_L2:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        ((FileChannel) (obj1)).close();
        throw obj;
        exception;
        obj1 = obj;
        obj = exception;
        break MISSING_BLOCK_LABEL_65;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String a(String s)
    {
        return a(s, b, c);
    }

    private static String a(String s, StringMap stringmap, StringMap stringmap1)
    {
        if (stringmap == null || stringmap1 == null)
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < s.length() - 1) 
        {
            String s1 = stringmap1.get(s.substring(i, i + 2));
            if (s1 != null)
            {
                i += 2;
            } else
            {
                s1 = s.substring(i, i + 1);
                String s2 = stringmap.get(s1);
                if (s2 != null)
                {
                    i++;
                    s1 = s2;
                } else
                {
                    i++;
                }
            }
            stringbuilder.append(s1);
        }
        if (i < s.length())
        {
            s = s.substring(i);
            stringmap = stringmap.get(s);
            if (stringmap != null)
            {
                s = stringmap;
            }
            stringbuilder.append(s);
        }
        return stringbuilder.toString();
    }

    public static void a(String s, String s1, String s2, String s3)
    {
        if (b == null)
        {
            b = a(s, "sc2tcu");
            c = a(s1, "sc2tcb");
            d = a(s2, "tc2scu");
            e = a(s3, "tc2scb");
        }
    }

    public static String b(String s)
    {
        return a(s, d, e);
    }

}
