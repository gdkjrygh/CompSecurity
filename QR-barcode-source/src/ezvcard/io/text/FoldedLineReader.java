// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.text;

import ezvcard.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FoldedLineReader extends BufferedReader
{

    private static final Pattern foldedQuotedPrintableValueRegex = Pattern.compile("[^:]*?QUOTED-PRINTABLE.*?:.*?=", 2);
    private String lastLine;
    private int lastLineNum;
    private int lineCount;

    public FoldedLineReader(Reader reader)
    {
        super(reader);
        lastLineNum = 0;
        lineCount = 0;
    }

    public FoldedLineReader(String s)
    {
        this(((Reader) (new StringReader(s))));
    }

    private String readNonEmptyLine()
        throws IOException
    {
        String s;
        do
        {
            s = super.readLine();
            if (s != null)
            {
                lineCount = lineCount + 1;
            }
        } while (s != null && s.length() == 0);
        return s;
    }

    public int getLineNum()
    {
        return lastLineNum;
    }

    public String readLine()
        throws IOException
    {
        StringBuilder stringbuilder;
        boolean flag;
        String s;
        if (lastLine == null)
        {
            s = readNonEmptyLine();
        } else
        {
            s = lastLine;
        }
        lastLine = null;
        if (s == null)
        {
            return null;
        }
        flag = false;
        String s2 = s;
        if (foldedQuotedPrintableValueRegex.matcher(s).matches())
        {
            flag = true;
            s2 = s.substring(0, s.length() - 1);
        }
        lastLineNum = lineCount;
        stringbuilder = new StringBuilder(s2);
_L5:
        String s1;
        if (flag)
        {
            s1 = super.readLine();
        } else
        {
            s1 = readNonEmptyLine();
        }
        if (s1 != null) goto _L2; else goto _L1
_L1:
        return stringbuilder.toString();
_L2:
        if (!flag) goto _L4; else goto _L3
_L3:
        boolean flag1;
        String s3 = StringUtils.ltrim(s1);
        flag1 = s3.endsWith("=");
        s1 = s3;
        if (flag1)
        {
            s1 = s3.substring(0, s3.length() - 1);
        }
        stringbuilder.append(s1);
        if (!flag1) goto _L1; else goto _L5
_L4:
label0:
        {
            if (s1.length() <= 0 || !Character.isWhitespace(s1.charAt(0)))
            {
                break label0;
            }
            int i;
            for (i = 1; i < s1.length() && Character.isWhitespace(s1.charAt(i)); i++) { }
            stringbuilder.append(s1.substring(i));
        }
          goto _L5
        lastLine = s1;
          goto _L1
    }

}
