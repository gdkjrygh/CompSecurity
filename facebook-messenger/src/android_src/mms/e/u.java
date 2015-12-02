// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.e;

import java.io.ByteArrayOutputStream;

public class u
{

    private static byte a = 61;

    public u()
    {
    }

    public static final byte[] a(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream;
        int i;
        if (abyte0 == null)
        {
            return null;
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        i = 0;
_L2:
        int j;
        if (i >= abyte0.length)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        j = abyte0[i];
        if (j != a)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if ('\r' == (char)abyte0[i + 1] && '\n' == (char)abyte0[i + 2])
        {
            i += 2;
            break MISSING_BLOCK_LABEL_135;
        }
        i++;
        int k;
        try
        {
            j = Character.digit((char)abyte0[i], 16);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        i++;
        k = Character.digit((char)abyte0[i], 16);
        if (j == -1 || k == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        bytearrayoutputstream.write((char)((j << 4) + k));
        break MISSING_BLOCK_LABEL_135;
        bytearrayoutputstream.write(j);
        break MISSING_BLOCK_LABEL_135;
        return bytearrayoutputstream.toByteArray();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

}
