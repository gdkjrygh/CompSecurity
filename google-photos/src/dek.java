// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class dek
{

    private static final String a = dek.getName();

    private dek()
    {
    }

    private static long a(InputStream inputstream, OutputStream outputstream)
    {
        long l = 0L;
        byte abyte0[] = new byte[1024];
        do
        {
            int i = inputstream.read(abyte0, 0, 1024);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
                l += i;
            } else
            {
                outputstream.flush();
                return l;
            }
        } while (true);
    }

    public static void a(InputStream inputstream, byte abyte0[], int i)
    {
        int k = 0;
        int j;
        boolean flag;
        if (abyte0.length >= i + 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "Buffer is too small for the length/offset requested");
        for (j = 0; k >= 0 && j < i; j += k)
        {
            k = inputstream.read(abyte0, j + 0, i - j);
        }

        if (j < i)
        {
            Log.e(a, (new StringBuilder(104)).append("Reached end of stream before desired length reached. Wanted ").append(i).append(" bytes, but only read 0").toString());
            throw new IOException("Unable to read sufficient data");
        } else
        {
            return;
        }
    }

    public static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        a(inputstream, ((OutputStream) (bytearrayoutputstream)));
        inputstream = bytearrayoutputstream.toByteArray();
        b.a(bytearrayoutputstream);
        return inputstream;
        inputstream;
        b.a(bytearrayoutputstream);
        throw inputstream;
    }

    public static byte[] a(InputStream inputstream, int i)
    {
        int k = 0;
        byte abyte0[] = new byte[i];
        int j;
        boolean flag;
        if (abyte0.length >= i + 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "Buffer is too small for the length/offset requested");
        for (j = 0; k >= 0 && j < i; j += k)
        {
            k = inputstream.read(abyte0, j + 0, i - j);
        }

        if (j < i)
        {
            Log.e(a, (new StringBuilder(104)).append("Reached end of stream before desired length reached. Wanted ").append(i).append(" bytes, but only read 0").toString());
            throw new IOException("Unable to read sufficient data");
        } else
        {
            return abyte0;
        }
    }

}
