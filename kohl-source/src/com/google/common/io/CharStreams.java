// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.common.io:
//            AppendableWriter, InputSupplier, OutputSupplier, Closeables, 
//            LineReader, LineProcessor, MultiReader

public final class CharStreams
{

    private static final int BUF_SIZE = 2048;

    private CharStreams()
    {
    }

    public static Writer asWriter(Appendable appendable)
    {
        if (appendable instanceof Writer)
        {
            return (Writer)appendable;
        } else
        {
            return new AppendableWriter(appendable);
        }
    }

    public static long copy(InputSupplier inputsupplier, OutputSupplier outputsupplier)
        throws IOException
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        inputsupplier = (Readable)inputsupplier.getInput();
        flag = flag1;
        outputsupplier = (Appendable)outputsupplier.getOutput();
        long l = copy(((Readable) (inputsupplier)), ((Appendable) (outputsupplier)));
        flag = false;
        Closeables.close((Closeable)outputsupplier, false);
        Closeables.close((Closeable)inputsupplier, false);
        return l;
        Exception exception;
        exception;
        flag = flag1;
        Closeables.close((Closeable)outputsupplier, true);
        flag = flag1;
        throw exception;
        outputsupplier;
        Closeables.close((Closeable)inputsupplier, flag);
        throw outputsupplier;
    }

    public static long copy(InputSupplier inputsupplier, Appendable appendable)
        throws IOException
    {
        inputsupplier = (Readable)inputsupplier.getInput();
        long l = copy(((Readable) (inputsupplier)), appendable);
        Closeables.close((Closeable)inputsupplier, false);
        return l;
        appendable;
        Closeables.close((Closeable)inputsupplier, true);
        throw appendable;
    }

    public static long copy(Readable readable, Appendable appendable)
        throws IOException
    {
        CharBuffer charbuffer = CharBuffer.allocate(2048);
        long l = 0L;
        do
        {
            int i = readable.read(charbuffer);
            if (i == -1)
            {
                return l;
            }
            charbuffer.flip();
            appendable.append(charbuffer, 0, i);
            l += i;
        } while (true);
    }

    public static InputSupplier join(Iterable iterable)
    {
        return new InputSupplier(iterable) {

            final Iterable val$suppliers;

            public Reader getInput()
                throws IOException
            {
                return new MultiReader(suppliers.iterator());
            }

            public volatile Object getInput()
                throws IOException
            {
                return getInput();
            }

            
            {
                suppliers = iterable;
                super();
            }
        };
    }

    public static transient InputSupplier join(InputSupplier ainputsupplier[])
    {
        return join(((Iterable) (Arrays.asList(ainputsupplier))));
    }

    public static InputSupplier newReaderSupplier(InputSupplier inputsupplier, Charset charset)
    {
        Preconditions.checkNotNull(inputsupplier);
        Preconditions.checkNotNull(charset);
        return new InputSupplier(inputsupplier, charset) {

            final Charset val$charset;
            final InputSupplier val$in;

            public InputStreamReader getInput()
                throws IOException
            {
                return new InputStreamReader((InputStream)in.getInput(), charset);
            }

            public volatile Object getInput()
                throws IOException
            {
                return getInput();
            }

            
            {
                in = inputsupplier;
                charset = charset1;
                super();
            }
        };
    }

    public static InputSupplier newReaderSupplier(String s)
    {
        Preconditions.checkNotNull(s);
        return new InputSupplier(s) {

            final String val$value;

            public StringReader getInput()
            {
                return new StringReader(value);
            }

            public volatile Object getInput()
                throws IOException
            {
                return getInput();
            }

            
            {
                value = s;
                super();
            }
        };
    }

    public static OutputSupplier newWriterSupplier(OutputSupplier outputsupplier, Charset charset)
    {
        Preconditions.checkNotNull(outputsupplier);
        Preconditions.checkNotNull(charset);
        return new OutputSupplier(outputsupplier, charset) {

            final Charset val$charset;
            final OutputSupplier val$out;

            public OutputStreamWriter getOutput()
                throws IOException
            {
                return new OutputStreamWriter((OutputStream)out.getOutput(), charset);
            }

            public volatile Object getOutput()
                throws IOException
            {
                return getOutput();
            }

            
            {
                out = outputsupplier;
                charset = charset1;
                super();
            }
        };
    }

    public static String readFirstLine(InputSupplier inputsupplier)
        throws IOException
    {
        inputsupplier = (Readable)inputsupplier.getInput();
        String s = (new LineReader(inputsupplier)).readLine();
        Closeables.close((Closeable)inputsupplier, false);
        return s;
        Exception exception;
        exception;
        Closeables.close((Closeable)inputsupplier, true);
        throw exception;
    }

    public static Object readLines(InputSupplier inputsupplier, LineProcessor lineprocessor)
        throws IOException
    {
        inputsupplier = (Readable)inputsupplier.getInput();
        LineReader linereader = new LineReader(inputsupplier);
_L2:
        String s = linereader.readLine();
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = lineprocessor.processLine(s);
        if (flag) goto _L2; else goto _L1
_L1:
        Closeables.close((Closeable)inputsupplier, false);
        return lineprocessor.getResult();
        lineprocessor;
        Closeables.close((Closeable)inputsupplier, true);
        throw lineprocessor;
    }

    public static List readLines(InputSupplier inputsupplier)
        throws IOException
    {
        inputsupplier = (Readable)inputsupplier.getInput();
        List list = readLines(((Readable) (inputsupplier)));
        Closeables.close((Closeable)inputsupplier, false);
        return list;
        Exception exception;
        exception;
        Closeables.close((Closeable)inputsupplier, true);
        throw exception;
    }

    public static List readLines(Readable readable)
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        readable = new LineReader(readable);
        do
        {
            String s = readable.readLine();
            if (s != null)
            {
                arraylist.add(s);
            } else
            {
                return arraylist;
            }
        } while (true);
    }

    public static void skipFully(Reader reader, long l)
        throws IOException
    {
        while (l > 0L) 
        {
            long l1 = reader.skip(l);
            if (l1 == 0L)
            {
                if (reader.read() == -1)
                {
                    throw new EOFException();
                }
                l--;
            } else
            {
                l -= l1;
            }
        }
    }

    public static String toString(InputSupplier inputsupplier)
        throws IOException
    {
        return toStringBuilder(inputsupplier).toString();
    }

    public static String toString(Readable readable)
        throws IOException
    {
        return toStringBuilder(readable).toString();
    }

    private static StringBuilder toStringBuilder(InputSupplier inputsupplier)
        throws IOException
    {
        inputsupplier = (Readable)inputsupplier.getInput();
        StringBuilder stringbuilder = toStringBuilder(((Readable) (inputsupplier)));
        Closeables.close((Closeable)inputsupplier, false);
        return stringbuilder;
        Exception exception;
        exception;
        Closeables.close((Closeable)inputsupplier, true);
        throw exception;
    }

    private static StringBuilder toStringBuilder(Readable readable)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        copy(readable, stringbuilder);
        return stringbuilder;
    }

    public static void write(CharSequence charsequence, OutputSupplier outputsupplier)
        throws IOException
    {
        Preconditions.checkNotNull(charsequence);
        outputsupplier = (Appendable)outputsupplier.getOutput();
        outputsupplier.append(charsequence);
        Closeables.close((Closeable)outputsupplier, false);
        return;
        charsequence;
        Closeables.close((Closeable)outputsupplier, true);
        throw charsequence;
    }
}
