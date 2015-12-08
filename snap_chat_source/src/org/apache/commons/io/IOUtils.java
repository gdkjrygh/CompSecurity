// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.output.StringBuilderWriter;

// Referenced classes of package org.apache.commons.io:
//            Charsets

public class IOUtils
{

    public static final char DIR_SEPARATOR;
    public static final String LINE_SEPARATOR;

    public static void closeQuietly(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static void closeQuietly(InputStream inputstream)
    {
        closeQuietly(((Closeable) (inputstream)));
    }

    public static void closeQuietly(Reader reader)
    {
        closeQuietly(((Closeable) (reader)));
    }

    public static int copy(InputStream inputstream, OutputStream outputstream)
    {
        long l = copyLarge(inputstream, outputstream);
        if (l > 0x7fffffffL)
        {
            return -1;
        } else
        {
            return (int)l;
        }
    }

    public static int copy(Reader reader, Writer writer)
    {
        long l = copyLarge(reader, writer);
        if (l > 0x7fffffffL)
        {
            return -1;
        } else
        {
            return (int)l;
        }
    }

    public static void copy(InputStream inputstream, Writer writer, Charset charset)
    {
        copy(((Reader) (new InputStreamReader(inputstream, Charsets.toCharset(charset)))), writer);
    }

    public static long copyLarge(InputStream inputstream, OutputStream outputstream)
    {
        return copyLarge(inputstream, outputstream, new byte[4096]);
    }

    public static long copyLarge(InputStream inputstream, OutputStream outputstream, byte abyte0[])
    {
        long l = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (-1 != i)
            {
                outputstream.write(abyte0, 0, i);
                l += i;
            } else
            {
                return l;
            }
        } while (true);
    }

    public static long copyLarge(Reader reader, Writer writer)
    {
        return copyLarge(reader, writer, new char[4096]);
    }

    public static long copyLarge(Reader reader, Writer writer, char ac[])
    {
        long l = 0L;
        do
        {
            int i = reader.read(ac);
            if (-1 != i)
            {
                writer.write(ac, 0, i);
                l += i;
            } else
            {
                return l;
            }
        } while (true);
    }

    public static byte[] toByteArray(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        copy(inputstream, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] toByteArray(InputStream inputstream, int i)
    {
        int j = 0;
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Size must be equal or greater than zero: ")).append(i).toString());
        }
        if (i == 0)
        {
            inputstream = new byte[0];
        } else
        {
            byte abyte0[] = new byte[i];
            do
            {
                if (j >= i)
                {
                    break;
                }
                int k = inputstream.read(abyte0, j, i - j);
                if (k == -1)
                {
                    break;
                }
                j += k;
            } while (true);
            inputstream = abyte0;
            if (j != i)
            {
                throw new IOException((new StringBuilder("Unexpected readed size. current: ")).append(j).append(", excepted: ").append(i).toString());
            }
        }
        return inputstream;
    }

    public static byte[] toByteArray(InputStream inputstream, long l)
    {
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder("Size cannot be greater than Integer max value: ")).append(l).toString());
        } else
        {
            return toByteArray(inputstream, (int)l);
        }
    }

    public static String toString(InputStream inputstream, String s)
    {
        return toString(inputstream, Charsets.toCharset(s));
    }

    public static String toString(InputStream inputstream, Charset charset)
    {
        StringBuilderWriter stringbuilderwriter = new StringBuilderWriter();
        copy(inputstream, stringbuilderwriter, charset);
        return stringbuilderwriter.toString();
    }

    static 
    {
        DIR_SEPARATOR = File.separatorChar;
        StringBuilderWriter stringbuilderwriter = new StringBuilderWriter(4);
        PrintWriter printwriter = new PrintWriter(stringbuilderwriter);
        printwriter.println();
        LINE_SEPARATOR = stringbuilderwriter.toString();
        printwriter.close();
    }
}
