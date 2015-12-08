// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class IOUtils
{

    private static final Charset UTF8 = Charset.forName("UTF-8");

    private IOUtils()
    {
    }

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

    public static String getFileContents(File file)
        throws IOException
    {
        return getFileContents(file, Charset.defaultCharset().name());
    }

    public static String getFileContents(File file, String s)
        throws IOException
    {
        return new String(toByteArray(new FileInputStream(file), true), s);
    }

    public static String getFileExtension(File file)
    {
        file = file.getName();
        int i = file.lastIndexOf('.');
        if (i >= 0 && i < file.length() - 1)
        {
            return file.substring(i + 1);
        } else
        {
            return null;
        }
    }

    public static byte[] toByteArray(InputStream inputstream)
        throws IOException
    {
        return toByteArray(inputstream, false);
    }

    public static byte[] toByteArray(InputStream inputstream, boolean flag)
        throws IOException
    {
        Object obj;
        byte abyte1[];
        obj = new ByteArrayOutputStream();
        abyte1 = new byte[4096];
_L1:
        int i = inputstream.read(abyte1);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        ((ByteArrayOutputStream) (obj)).write(abyte1, 0, i);
          goto _L1
        obj;
        if (flag)
        {
            closeQuietly(inputstream);
        }
        throw obj;
        byte abyte0[] = ((ByteArrayOutputStream) (obj)).toByteArray();
        if (flag)
        {
            closeQuietly(inputstream);
        }
        return abyte0;
    }

    public static Reader utf8Reader(File file)
        throws FileNotFoundException
    {
        return utf8Reader(((InputStream) (new FileInputStream(file))));
    }

    public static Reader utf8Reader(InputStream inputstream)
    {
        return new InputStreamReader(inputstream, UTF8);
    }

    public static Writer utf8Writer(File file)
        throws FileNotFoundException
    {
        return utf8Writer(file, false);
    }

    public static Writer utf8Writer(File file, boolean flag)
        throws FileNotFoundException
    {
        return utf8Writer(((OutputStream) (new FileOutputStream(file, flag))));
    }

    public static Writer utf8Writer(OutputStream outputstream)
    {
        return new OutputStreamWriter(outputstream, UTF8);
    }

}
