// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.offline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader
{

    public static final char DEFAULT_QUOTE_CHARACTER = 34;
    public static final char DEFAULT_SEPARATOR = 44;
    public static final int DEFAULT_SKIP_LINES = 0;
    private BufferedReader br;
    private boolean hasNext;
    private boolean linesSkiped;
    private char quotechar;
    private char separator;
    private int skipLines;

    public CSVReader(Reader reader)
    {
        this(reader, ',', '"', 0);
    }

    public CSVReader(Reader reader, char c, char c1, int i)
    {
        hasNext = true;
        br = new BufferedReader(reader);
        separator = c;
        quotechar = c1;
        skipLines = i;
    }

    private String getNextLine()
        throws IOException
    {
        if (linesSkiped) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i < skipLines) goto _L4; else goto _L3
_L3:
        linesSkiped = true;
_L2:
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
_L4:
        br.readLine();
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private String[] parseLine(String s)
        throws IOException
    {
        String s1;
        ArrayList arraylist;
        int i;
        if (s == null)
        {
            return null;
        }
        arraylist = new ArrayList();
        StringBuffer stringbuffer = new StringBuffer();
        i = 0;
        s1 = s;
        s = stringbuffer;
_L6:
        if (i == 0) goto _L2; else goto _L1
_L1:
        String s2;
        s.append("\n");
        s2 = getNextLine();
        s1 = s2;
        if (s2 != null) goto _L2; else goto _L3
_L3:
        arraylist.add(s.toString());
        return (String[])arraylist.toArray(new String[0]);
_L2:
        boolean flag;
        boolean flag1 = false;
        flag = i;
        i = ((flag1) ? 1 : 0);
label0:
        do
        {
label1:
            {
label2:
                {
                    if (i < s1.length())
                    {
                        break label2;
                    }
                    if (flag)
                    {
                        break label1;
                    }
                }
                if (true)
                {
                    break label0;
                }
                char c = s1.charAt(i);
                Object obj;
                boolean flag2;
                int j;
                if (c == quotechar)
                {
                    if (flag && s1.length() > i + 1 && s1.charAt(i + 1) == quotechar)
                    {
                        s.append(s1.charAt(i + 1));
                        j = i + 1;
                        obj = s;
                        flag2 = flag;
                    } else
                    {
                        if (flag)
                        {
                            flag = false;
                        } else
                        {
                            flag = true;
                        }
                        j = i;
                        flag2 = flag;
                        obj = s;
                        if (i > 2)
                        {
                            j = i;
                            flag2 = flag;
                            obj = s;
                            if (s1.charAt(i - 1) != separator)
                            {
                                j = i;
                                flag2 = flag;
                                obj = s;
                                if (s1.length() > i + 1)
                                {
                                    j = i;
                                    flag2 = flag;
                                    obj = s;
                                    if (s1.charAt(i + 1) != separator)
                                    {
                                        s.append(c);
                                        j = i;
                                        flag2 = flag;
                                        obj = s;
                                    }
                                }
                            }
                        }
                    }
                } else
                if (c == separator && !flag)
                {
                    arraylist.add(s.toString());
                    obj = new StringBuffer();
                    j = i;
                    flag2 = flag;
                } else
                {
                    s.append(c);
                    j = i;
                    flag2 = flag;
                    obj = s;
                }
                i = j + 1;
                flag = flag2;
                s = ((String) (obj));
            }
        } while (true);
        if (true) goto _L3; else goto _L4
_L4:
        i = ((flag) ? 1 : 0);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void close()
        throws IOException
    {
        br.close();
    }

    public ArrayList getAllData()
    {
        ArrayList arraylist = new ArrayList();
_L1:
        String as[] = readNext();
        Object obj;
        obj = arraylist;
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        arraylist.add(as);
          goto _L1
        obj;
        ((IOException) (obj)).printStackTrace();
        obj = null;
        return ((ArrayList) (obj));
    }

    public String[] readNext()
        throws IOException
    {
        String s = getNextLine();
        if (hasNext)
        {
            return parseLine(s);
        } else
        {
            return null;
        }
    }
}
