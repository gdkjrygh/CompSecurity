// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import org.a.a.a.a.a;

public final class c
{

    public static final char a;
    public static final String b;

    public static int a(InputStream inputstream, OutputStream outputstream)
    {
        byte abyte0[] = new byte[4096];
        long l = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (-1 == i)
            {
                break;
            }
            outputstream.write(abyte0, 0, i);
            l += i;
        } while (true);
        if (l > 0x7fffffffL)
        {
            return -1;
        } else
        {
            return (int)l;
        }
    }

    private static long a(Reader reader, Writer writer)
    {
        char ac[] = new char[4096];
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

    public static void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        inputstream.close();
        return;
        inputstream;
    }

    public static void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        outputstream.close();
        return;
        outputstream;
    }

    public static byte[] b(InputStream inputstream)
    {
        a a1 = new a();
        a(inputstream, a1);
        return a1.a();
    }

    public static String c(InputStream inputstream)
    {
        StringWriter stringwriter = new StringWriter();
        a(new InputStreamReader(inputstream), stringwriter);
        return stringwriter.toString();
    }

    static 
    {
        a = File.separatorChar;
        StringWriter stringwriter = new StringWriter(4);
        (new PrintWriter(stringwriter)).println();
        b = stringwriter.toString();
    }
}
