// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package au.com.bytecode.opencsv;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package au.com.bytecode.opencsv:
//            ResultSetHelperService, CSVWriteProc, ResultSetHelper

public class CSVWriter
    implements Closeable
{

    public static final char DEFAULT_ESCAPE_CHARACTER = 34;
    public static final String DEFAULT_LINE_END = "\n";
    public static final char DEFAULT_QUOTE_CHARACTER = 34;
    public static final char DEFAULT_SEPARATOR = 44;
    public static final int INITIAL_STRING_SIZE = 128;
    public static final char NO_ESCAPE_CHARACTER = 0;
    public static final char NO_QUOTE_CHARACTER = 0;
    private char escapechar;
    private String lineEnd;
    private PrintWriter pw;
    private char quotechar;
    private Writer rawWriter;
    private ResultSetHelper resultService;
    private char separator;

    public CSVWriter(Writer writer)
    {
        this(writer, ',');
    }

    public CSVWriter(Writer writer, char c)
    {
        this(writer, c, '"');
    }

    public CSVWriter(Writer writer, char c, char c1)
    {
        this(writer, c, c1, '"');
    }

    public CSVWriter(Writer writer, char c, char c1, char c2)
    {
        this(writer, c, c1, c2, "\n");
    }

    public CSVWriter(Writer writer, char c, char c1, char c2, String s)
    {
        resultService = new ResultSetHelperService();
        rawWriter = writer;
        pw = new PrintWriter(writer);
        separator = c;
        quotechar = c1;
        escapechar = c2;
        lineEnd = s;
    }

    public CSVWriter(Writer writer, char c, char c1, String s)
    {
        this(writer, c, c1, '"', s);
    }

    private boolean stringContainsSpecialCharacters(String s)
    {
        return s.indexOf(quotechar) != -1 || s.indexOf(escapechar) != -1;
    }

    public boolean checkError()
    {
        return pw.checkError();
    }

    public void close()
        throws IOException
    {
        flush();
        pw.close();
        rawWriter.close();
    }

    public void flush()
        throws IOException
    {
        pw.flush();
    }

    protected StringBuilder processLine(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        int i = 0;
        while (i < s.length()) 
        {
            char c = s.charAt(i);
            if (escapechar != 0 && c == quotechar)
            {
                stringbuilder.append(escapechar).append(c);
            } else
            if (escapechar != 0 && c == escapechar)
            {
                stringbuilder.append(escapechar).append(c);
            } else
            {
                stringbuilder.append(c);
            }
            i++;
        }
        return stringbuilder;
    }

    public void setResultService(ResultSetHelper resultsethelper)
    {
        resultService = resultsethelper;
    }

    public void write(CSVWriteProc csvwriteproc)
    {
        csvwriteproc.process(this);
    }

    public void writeAll(ResultSet resultset, boolean flag)
        throws SQLException, IOException
    {
        if (flag)
        {
            writeColumnNames(resultset);
        }
        for (; resultset.next(); writeNext(resultService.getColumnValues(resultset))) { }
    }

    public void writeAll(List list)
    {
        for (list = list.iterator(); list.hasNext(); writeNext((String[])list.next())) { }
    }

    protected void writeColumnNames(ResultSet resultset)
        throws SQLException
    {
        writeNext(resultService.getColumnNames(resultset));
    }

    public transient void writeNext(String as[])
    {
        if (as == null)
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder(128);
        int i = 0;
        while (i < as.length) 
        {
            if (i != 0)
            {
                stringbuilder.append(separator);
            }
            Object obj = as[i];
            if (obj != null)
            {
                if (quotechar != 0)
                {
                    stringbuilder.append(quotechar);
                }
                if (stringContainsSpecialCharacters(((String) (obj))))
                {
                    obj = processLine(((String) (obj)));
                }
                stringbuilder.append((CharSequence)obj);
                if (quotechar != 0)
                {
                    stringbuilder.append(quotechar);
                }
            }
            i++;
        }
        stringbuilder.append(lineEnd);
        pw.write(stringbuilder.toString());
    }
}
