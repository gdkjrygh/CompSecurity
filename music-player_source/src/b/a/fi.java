// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;

public final class fi
{

    public static int a;

    public static byte[] a(byte abyte0[])
    {
        Deflater deflater;
        if (abyte0 == null || abyte0.length <= 0)
        {
            return null;
        }
        deflater = new Deflater();
        deflater.setInput(abyte0);
        deflater.finish();
        abyte0 = new byte[8192];
        a = 0;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
_L1:
        if (!deflater.finished())
        {
            break MISSING_BLOCK_LABEL_66;
        }
        deflater.end();
        bytearrayoutputstream.close();
        return bytearrayoutputstream.toByteArray();
        int i = deflater.deflate(abyte0);
        a += i;
        bytearrayoutputstream.write(abyte0, 0, i);
          goto _L1
        abyte0;
_L3:
        if (bytearrayoutputstream != null)
        {
            bytearrayoutputstream.close();
        }
        throw abyte0;
        abyte0;
        bytearrayoutputstream = null;
        if (true) goto _L3; else goto _L2
_L2:
    }
}
