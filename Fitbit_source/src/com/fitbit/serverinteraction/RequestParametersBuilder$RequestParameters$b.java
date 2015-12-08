// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import com.fitbit.e.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.fitbit.serverinteraction:
//            RequestParametersBuilder

private static final class c extends c
{

    private static final String a = com/fitbit/serverinteraction/RequestParametersBuilder$RequestParameters$b.getSimpleName();
    private final a b;
    private final int c;

    public InputStream a()
    {
        InputStream inputstream = b.a();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(1024);
        byte abyte0[];
        GZIPOutputStream gzipoutputstream;
        byte abyte1[];
        int i;
        int j;
        try
        {
            gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
            abyte1 = new byte[1024];
        }
        catch (IOException ioexception)
        {
            com.fitbit.e.a.f(a, "Gzip failed for entity", ioexception, new Object[0]);
            throw new RuntimeException("compression failed", ioexception);
        }
        i = 0;
        j = inputstream.read(abyte1);
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        gzipoutputstream.write(abyte1, 0, j);
        i += j;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_38;
_L1:
        gzipoutputstream.finish();
        gzipoutputstream.close();
        abyte0 = bytearrayoutputstream.toByteArray();
        com.fitbit.e.a.d(a, String.format("Http Request Compressed from %s to %s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(abyte0.length)
        }), new Object[0]);
        return new ByteArrayInputStream(abyte0);
    }

    public int b()
    {
        return c;
    }

    public String c()
    {
        return "gzip";
    }

    public c d()
    {
        return b;
    }

    public String toString()
    {
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        obj = b.a();
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte0 = new byte[1024];
_L1:
        int i;
        try
        {
            i = ((InputStream) (obj)).read(abyte0);
        }
        catch (IOException ioexception)
        {
            return "Zipped Payload";
        }
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        bytearrayoutputstream.write(abyte0, 0, i);
          goto _L1
        ioexception = String.format("zipped(%s)", new Object[] {
            new String(bytearrayoutputstream.toByteArray())
        });
        return ioexception;
    }


    public ( )
    {
        b = ;
         = a();
        if ( instanceof ByteArrayInputStream)
        {
            c = ((ByteArrayInputStream)).available();
            return;
        } else
        {
            c = -1;
            return;
        }
    }
}
