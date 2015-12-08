// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class t
{

    public t()
    {
    }

    public static String a(InputStream inputstream)
        throws IOException
    {
        Object obj = null;
        if (inputstream != null)
        {
            inputstream = new BufferedInputStream(inputstream, 1024);
            obj = new byte[1024];
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            do
            {
                int i = inputstream.read(((byte []) (obj)));
                if (i == -1)
                {
                    break;
                }
                bytearrayoutputstream.write(((byte []) (obj)), 0, i);
            } while (true);
            obj = new String(bytearrayoutputstream.toByteArray());
        }
        return ((String) (obj));
    }
}
