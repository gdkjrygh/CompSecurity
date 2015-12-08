// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.b;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.fitbit.serverinteraction.b:
//            g

class b extends g
{

    b()
    {
    }

    public byte[] a(InputStream inputstream, String s)
        throws IOException, ServerCommunicationException
    {
        s = new ByteArrayOutputStream(1024);
        byte abyte0[] = new byte[1024];
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                s.write(abyte0, 0, i);
            } else
            {
                s.close();
                return s.toByteArray();
            }
        } while (true);
    }

    public Object b(InputStream inputstream, String s)
        throws Throwable, ServerCommunicationException
    {
        return a(inputstream, s);
    }
}
