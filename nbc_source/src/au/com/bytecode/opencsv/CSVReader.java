// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package au.com.bytecode.opencsv;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package au.com.bytecode.opencsv:
//            CSVParser, CSVReadProc, CSVRuntimeException

public class CSVReader
    implements Closeable
{

    public static final int DEFAULT_SKIP_LINES = 0;
    private BufferedReader br;
    private boolean hasNext;
    private boolean linesSkiped;
    private CSVParser parser;
    private int skipLines;

    public CSVReader(Reader reader)
    {
        this(reader, ',', '"', '\\');
    }

    public CSVReader(Reader reader, char c)
    {
        this(reader, c, '"', '\\');
    }

    public CSVReader(Reader reader, char c, char c1)
    {
        this(reader, c, c1, '\\', 0, false);
    }

    public CSVReader(Reader reader, char c, char c1, char c2)
    {
        this(reader, c, c1, c2, 0, false);
    }

    public CSVReader(Reader reader, char c, char c1, char c2, int i)
    {
        this(reader, c, c1, c2, i, false);
    }

    public CSVReader(Reader reader, char c, char c1, char c2, int i, boolean flag)
    {
        this(reader, c, c1, c2, i, flag, true);
    }

    public CSVReader(Reader reader, char c, char c1, char c2, int i, boolean flag, boolean flag1)
    {
        hasNext = true;
        br = new BufferedReader(reader);
        parser = new CSVParser(c, c1, c2, flag, flag1);
        skipLines = i;
    }

    public CSVReader(Reader reader, char c, char c1, int i)
    {
        this(reader, c, c1, '\\', i, false);
    }

    public CSVReader(Reader reader, char c, char c1, boolean flag)
    {
        this(reader, c, c1, '\\', 0, flag);
    }

    private String getNextLine()
        throws IOException
    {
        if (!linesSkiped)
        {
            for (int i = 0; i < skipLines; i++)
            {
                br.readLine();
            }

            linesSkiped = true;
        }
        String s = br.readLine();
        if (s == null)
        {
            hasNext = false;
        }
        if (hasNext)
        {
            return s;
        } else
        {
            return null;
        }
    }

    public void close()
        throws IOException
    {
        br.close();
    }

    public void read(CSVReadProc csvreadproc)
    {
        String as[];
        int i;
        try
        {
            as = readNext();
        }
        // Misplaced declaration of an exception variable
        catch (CSVReadProc csvreadproc)
        {
            throw new CSVRuntimeException(csvreadproc);
        }
        i = 0;
        if (as == null)
        {
            break; /* Loop/switch isn't completed */
        }
        csvreadproc.procRow(i, as);
        as = readNext();
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_7;
_L1:
    }

    public List readAll()
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        do
        {
            if (!hasNext)
            {
                break;
            }
            String as[] = readNext();
            if (as != null)
            {
                arraylist.add(as);
            }
        } while (true);
        return arraylist;
    }

    public String[] readNext()
        throws IOException
    {
        String as1[] = null;
        do
        {
            String s = getNextLine();
            if (!hasNext)
            {
                return as1;
            }
            String as2[] = parser.parseLineMulti(s);
            String as[] = as1;
            if (as2.length > 0)
            {
                if (as1 == null)
                {
                    as = as2;
                } else
                {
                    as = new String[as1.length + as2.length];
                    System.arraycopy(as1, 0, as, 0, as1.length);
                    System.arraycopy(as2, 0, as, as1.length, as2.length);
                }
            }
            as1 = as;
        } while (parser.isPending());
        return as;
    }
}
