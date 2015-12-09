// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

// Referenced classes of package org.c.d:
//            a

public abstract class g
{

    public static final int BUFFER_SIZE = 4096;

    public g()
    {
    }

    public static int copy(File file, File file1)
    {
        a.notNull(file, "No input File specified");
        a.notNull(file1, "No output File specified");
        return copy(((InputStream) (new BufferedInputStream(new FileInputStream(file)))), ((OutputStream) (new BufferedOutputStream(new FileOutputStream(file1)))));
    }

    public static int copy(InputStream inputstream, OutputStream outputstream)
    {
        int i;
        i = 0;
        a.notNull(inputstream, "No InputStream specified");
        a.notNull(outputstream, "No OutputStream specified");
        byte abyte0[] = new byte[4096];
_L1:
        int j = inputstream.read(abyte0);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        outputstream.write(abyte0, 0, j);
        i += j;
          goto _L1
        outputstream.flush();
        Exception exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        try
        {
            outputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return i;
        }
        return i;
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        try
        {
            outputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        throw exception;
    }

    public static int copy(Reader reader, Writer writer)
    {
        int i;
        i = 0;
        a.notNull(reader, "No Reader specified");
        a.notNull(writer, "No Writer specified");
        char ac[] = new char[4096];
_L1:
        int j = reader.read(ac);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        writer.write(ac, 0, j);
        i += j;
          goto _L1
        writer.flush();
        Exception exception;
        try
        {
            reader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader) { }
        try
        {
            writer.close();
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            return i;
        }
        return i;
        exception;
        try
        {
            reader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader) { }
        try
        {
            writer.close();
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader) { }
        throw exception;
    }

    public static void copy(String s, Writer writer)
    {
        a.notNull(s, "No input String specified");
        a.notNull(writer, "No Writer specified");
        writer.write(s);
        try
        {
            writer.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        s;
        try
        {
            writer.close();
        }
        // Misplaced declaration of an exception variable
        catch (Writer writer) { }
        throw s;
    }

    public static void copy(byte abyte0[], File file)
    {
        a.notNull(abyte0, "No input byte array specified");
        a.notNull(file, "No output File specified");
        copy(((InputStream) (new ByteArrayInputStream(abyte0))), ((OutputStream) (new BufferedOutputStream(new FileOutputStream(file)))));
    }

    public static void copy(byte abyte0[], OutputStream outputstream)
    {
        a.notNull(abyte0, "No input byte array specified");
        a.notNull(outputstream, "No OutputStream specified");
        outputstream.write(abyte0);
        try
        {
            outputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return;
        }
        abyte0;
        try
        {
            outputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream) { }
        throw abyte0;
    }

    public static byte[] copyToByteArray(File file)
    {
        a.notNull(file, "No input File specified");
        return copyToByteArray(((InputStream) (new BufferedInputStream(new FileInputStream(file)))));
    }

    public static byte[] copyToByteArray(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(4096);
        copy(inputstream, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public static String copyToString(Reader reader)
    {
        StringWriter stringwriter = new StringWriter();
        copy(reader, stringwriter);
        return stringwriter.toString();
    }
}
