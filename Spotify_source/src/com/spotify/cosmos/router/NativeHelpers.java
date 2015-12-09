// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.router;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class NativeHelpers
{

    private static final Charset sCharsetUtf8 = Charset.forName("UTF-8");

    protected NativeHelpers()
    {
        throw new UnsupportedOperationException("This class should not be directly instantiated");
    }

    public static Map byteArrayToMap(byte abyte0[])
    {
        HashMap hashmap = new HashMap();
        if (abyte0 == null)
        {
            return hashmap;
        }
        for (int i = 0; i < abyte0.length;)
        {
            int j = nextNull(abyte0, i);
            String s = new String(abyte0, i, j - i, sCharsetUtf8);
            i = j + 1;
            j = nextNull(abyte0, i);
            String s1 = new String(abyte0, i, j - i, sCharsetUtf8);
            i = j + 1;
            hashmap.put(s, s1);
        }

        return hashmap;
    }

    public static byte[] mapToByteArray(Map map)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        if (map != null)
        {
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); writeStringToStream(bytearrayoutputstream, (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
                writeStringToStream(bytearrayoutputstream, (String)entry.getKey());
            }

        }
        return bytearrayoutputstream.toByteArray();
    }

    private static int nextNull(byte abyte0[], int i)
    {
        for (; abyte0[i] != 0; i++) { }
        return i;
    }

    private static void writeStringToStream(ByteArrayOutputStream bytearrayoutputstream, String s)
    {
        bytearrayoutputstream.write(s.getBytes(sCharsetUtf8));
        bytearrayoutputstream.write(0);
    }

}
