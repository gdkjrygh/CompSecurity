// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package au.com.bytecode.opencsv;

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

// Referenced classes of package au.com.bytecode.opencsv:
//            CSVReader, CSVRuntimeException, CSVWriter, CSVReadProc, 
//            CSVWriteProc

public class CSV
{
    public static class Builder
    {

        private final CSV csv;

        private Builder setIgnoreLeadingWhiteSpace(boolean flag)
        {
            return new Builder(new CSV(csv.separator, csv.quotechar, csv.escapechar, csv.lineEnd, csv.skipLines, csv.strictQuotes, flag, csv.charset));
        }

        private Builder setStrictQuotes(boolean flag)
        {
            return new Builder(new CSV(csv.separator, csv.quotechar, csv.escapechar, csv.lineEnd, csv.skipLines, flag, csv.ignoreLeadingWhiteSpace, csv.charset));
        }

        public Builder charset(String s)
        {
            return charset(Charset.forName(s));
        }

        public Builder charset(Charset charset1)
        {
            return new Builder(new CSV(csv.separator, csv.quotechar, csv.escapechar, csv.lineEnd, csv.skipLines, csv.strictQuotes, csv.ignoreLeadingWhiteSpace, charset1));
        }

        public CSV create()
        {
            return csv;
        }

        public Builder escape(char c)
        {
            return new Builder(new CSV(csv.separator, csv.quotechar, c, csv.lineEnd, csv.skipLines, csv.strictQuotes, csv.ignoreLeadingWhiteSpace, csv.charset));
        }

        public Builder ignoreLeadingWhiteSpace()
        {
            return setIgnoreLeadingWhiteSpace(true);
        }

        public Builder lineEnd(String s)
        {
            return new Builder(new CSV(csv.separator, csv.quotechar, csv.escapechar, s, csv.skipLines, csv.strictQuotes, csv.ignoreLeadingWhiteSpace, csv.charset));
        }

        public Builder noEscape()
        {
            return escape('\0');
        }

        public Builder noQuote()
        {
            return quote('\0');
        }

        public Builder notIgnoreLeadingWhiteSpace()
        {
            return setIgnoreLeadingWhiteSpace(false);
        }

        public Builder notStrictQuotes()
        {
            return setStrictQuotes(false);
        }

        public Builder quote(char c)
        {
            return new Builder(new CSV(csv.separator, c, csv.escapechar, csv.lineEnd, csv.skipLines, csv.strictQuotes, csv.ignoreLeadingWhiteSpace, csv.charset));
        }

        public Builder separator(char c)
        {
            return new Builder(new CSV(c, csv.quotechar, csv.escapechar, csv.lineEnd, csv.skipLines, csv.strictQuotes, csv.ignoreLeadingWhiteSpace, csv.charset));
        }

        public Builder skipLines(int i)
        {
            return new Builder(new CSV(csv.separator, csv.quotechar, csv.escapechar, csv.lineEnd, i, csv.strictQuotes, csv.ignoreLeadingWhiteSpace, csv.charset));
        }

        public Builder strictQuotes()
        {
            return setStrictQuotes(true);
        }

        private Builder()
        {
            csv = new CSV();
        }


        private Builder(CSV csv1)
        {
            csv = csv1;
        }
    }


    private final Charset charset;
    private final char escapechar;
    private final boolean ignoreLeadingWhiteSpace;
    private final String lineEnd;
    private final char quotechar;
    private final char separator;
    private final int skipLines;
    private final boolean strictQuotes;

    private CSV()
    {
        this(',', '"', '\\', "\n", 0, false, true, Charset.defaultCharset());
    }

    private CSV(char c, char c1, char c2, String s, int i, boolean flag, boolean flag1, 
            Charset charset1)
    {
        separator = c;
        quotechar = c1;
        escapechar = c2;
        lineEnd = s;
        skipLines = i;
        strictQuotes = flag;
        ignoreLeadingWhiteSpace = flag1;
        charset = charset1;
    }



    public static Builder charset(String s)
    {
        return (new Builder()).charset(s);
    }

    public static Builder charset(Charset charset1)
    {
        return (new Builder()).charset(charset1);
    }

    public static CSV create()
    {
        return new CSV();
    }

    public static Builder escape(char c)
    {
        return (new Builder()).escape(c);
    }

    public static Builder ignoreLeadingWhiteSpace()
    {
        return (new Builder()).ignoreLeadingWhiteSpace();
    }

    public static Builder lineEnd(String s)
    {
        return (new Builder()).lineEnd(s);
    }

    public static Builder noEscape()
    {
        return (new Builder()).noEscape();
    }

    public static Builder noQuote()
    {
        return (new Builder()).noQuote();
    }

    public static Builder notIgnoreLeadingWhiteSpace()
    {
        return (new Builder()).notIgnoreLeadingWhiteSpace();
    }

    public static Builder notStrictQuotes()
    {
        return (new Builder()).notStrictQuotes();
    }

    public static Builder quote(char c)
    {
        return (new Builder()).quote(c);
    }

    public static Builder separator(char c)
    {
        return (new Builder()).separator(c);
    }

    public static Builder skipLines(int i)
    {
        return (new Builder()).skipLines(i);
    }

    public static Builder strictQuotes()
    {
        return (new Builder()).strictQuotes();
    }

    public void read(CSVReader csvreader, CSVReadProc csvreadproc)
    {
        csvreader.read(csvreadproc);
    }

    public void read(File file, CSVReadProc csvreadproc)
    {
        readAndClose(reader(file), csvreadproc);
    }

    public void read(InputStream inputstream, CSVReadProc csvreadproc)
    {
        read(reader(inputstream), csvreadproc);
    }

    public void read(Reader reader1, CSVReadProc csvreadproc)
    {
        read(reader(reader1), csvreadproc);
    }

    public void read(String s, CSVReadProc csvreadproc)
    {
        read(new File(s), csvreadproc);
    }

    public void readAndClose(CSVReader csvreader, CSVReadProc csvreadproc)
    {
        read(csvreader, csvreadproc);
        try
        {
            csvreader.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CSVReader csvreader)
        {
            return;
        }
        csvreadproc;
        try
        {
            csvreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (CSVReader csvreader) { }
        throw csvreadproc;
    }

    public void readAndClose(InputStream inputstream, CSVReadProc csvreadproc)
    {
        readAndClose(reader(inputstream), csvreadproc);
    }

    public void readAndClose(Reader reader1, CSVReadProc csvreadproc)
    {
        readAndClose(reader(reader1), csvreadproc);
    }

    public CSVReader reader(File file)
    {
        try
        {
            file = reader(((InputStream) (new FileInputStream(file))));
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new CSVRuntimeException(file);
        }
        return file;
    }

    public CSVReader reader(InputStream inputstream)
    {
        return reader(((Reader) (new InputStreamReader(inputstream, charset))));
    }

    public CSVReader reader(Reader reader1)
    {
        return new CSVReader(reader1, separator, quotechar, escapechar, skipLines, strictQuotes, ignoreLeadingWhiteSpace);
    }

    public CSVReader reader(String s)
    {
        return reader(new File(s));
    }

    public void write(CSVWriter csvwriter, CSVWriteProc csvwriteproc)
    {
        try
        {
            csvwriter.write(csvwriteproc);
            csvwriter.flush();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CSVWriter csvwriter)
        {
            throw new CSVRuntimeException(csvwriter);
        }
    }

    public void write(File file, CSVWriteProc csvwriteproc)
    {
        writeAndClose(writer(file), csvwriteproc);
    }

    public void write(OutputStream outputstream, CSVWriteProc csvwriteproc)
    {
        write(writer(outputstream), csvwriteproc);
    }

    public void write(Writer writer1, CSVWriteProc csvwriteproc)
    {
        write(writer(writer1), csvwriteproc);
    }

    public void write(String s, CSVWriteProc csvwriteproc)
    {
        write(new File(s), csvwriteproc);
    }

    public void writeAndClose(CSVWriter csvwriter, CSVWriteProc csvwriteproc)
    {
        try
        {
            csvwriter.write(csvwriteproc);
        }
        // Misplaced declaration of an exception variable
        catch (CSVWriteProc csvwriteproc)
        {
            try
            {
                csvwriter.close();
            }
            // Misplaced declaration of an exception variable
            catch (CSVWriter csvwriter) { }
            throw csvwriteproc;
        }
        try
        {
            csvwriter.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CSVWriter csvwriter)
        {
            throw new CSVRuntimeException(csvwriter);
        }
    }

    public void writeAndClose(OutputStream outputstream, CSVWriteProc csvwriteproc)
    {
        writeAndClose(writer(outputstream), csvwriteproc);
    }

    public void writeAndClose(Writer writer1, CSVWriteProc csvwriteproc)
    {
        writeAndClose(writer(writer1), csvwriteproc);
    }

    public CSVWriter writer(File file)
    {
        try
        {
            file = writer(((OutputStream) (new FileOutputStream(file))));
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new CSVRuntimeException(file);
        }
        return file;
    }

    public CSVWriter writer(OutputStream outputstream)
    {
        return writer(((Writer) (new OutputStreamWriter(outputstream, charset))));
    }

    public CSVWriter writer(Writer writer1)
    {
        return new CSVWriter(writer1, separator, quotechar, escapechar, lineEnd);
    }

    public CSVWriter writer(String s)
    {
        return writer(new File(s));
    }








}
