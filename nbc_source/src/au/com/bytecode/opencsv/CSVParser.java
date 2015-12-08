// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package au.com.bytecode.opencsv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVParser
{

    public static final char DEFAULT_ESCAPE_CHARACTER = 92;
    public static final boolean DEFAULT_IGNORE_LEADING_WHITESPACE = true;
    public static final char DEFAULT_QUOTE_CHARACTER = 34;
    public static final char DEFAULT_SEPARATOR = 44;
    public static final boolean DEFAULT_STRICT_QUOTES = false;
    public static final int INITIAL_READ_SIZE = 128;
    public static final char NULL_CHARACTER = 0;
    private final char escape;
    private final boolean ignoreLeadingWhiteSpace;
    private boolean inField;
    private String pending;
    private final char quotechar;
    private final char separator;
    private final boolean strictQuotes;

    public CSVParser()
    {
        this(',', '"', '\\');
    }

    public CSVParser(char c)
    {
        this(c, '"', '\\');
    }

    public CSVParser(char c, char c1)
    {
        this(c, c1, '\\');
    }

    public CSVParser(char c, char c1, char c2)
    {
        this(c, c1, c2, false);
    }

    public CSVParser(char c, char c1, char c2, boolean flag)
    {
        this(c, c1, c2, flag, true);
    }

    public CSVParser(char c, char c1, char c2, boolean flag, boolean flag1)
    {
        inField = false;
        if (anyCharactersAreTheSame(c, c1, c2))
        {
            throw new UnsupportedOperationException("The separator, quote, and escape characters must be different!");
        }
        if (c == 0)
        {
            throw new UnsupportedOperationException("The separator character must be defined!");
        } else
        {
            separator = c;
            quotechar = c1;
            escape = c2;
            strictQuotes = flag;
            ignoreLeadingWhiteSpace = flag1;
            return;
        }
    }

    private boolean anyCharactersAreTheSame(char c, char c1, char c2)
    {
        return isSameCharacter(c, c1) || isSameCharacter(c, c2) || isSameCharacter(c1, c2);
    }

    private boolean isNextCharacterEscapedQuote(String s, boolean flag, int i)
    {
        return flag && s.length() > i + 1 && s.charAt(i + 1) == quotechar;
    }

    private boolean isSameCharacter(char c, char c1)
    {
        return c != 0 && c == c1;
    }

    private String[] parseLine(String s, boolean flag)
        throws IOException
    {
        Object obj;
        ArrayList arraylist;
        int i;
        boolean flag1;
        obj = null;
        if (!flag && pending != null)
        {
            pending = null;
        }
        if (s == null)
        {
            s = ((String) (obj));
            if (pending != null)
            {
                obj = pending;
                pending = null;
                s = new String[1];
                s[0] = obj;
            }
            return s;
        }
        arraylist = new ArrayList();
        obj = new StringBuilder(128);
        flag1 = false;
        if (pending != null)
        {
            ((StringBuilder) (obj)).append(pending);
            pending = null;
            flag1 = true;
        }
        i = 0;
_L2:
        char c;
        int j;
        boolean flag2;
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_506;
        }
        c = s.charAt(i);
        if (c != escape)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag3;
        if (flag1 || inField)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        j = i;
        flag2 = flag1;
        if (isNextCharacterEscapable(s, flag3, i))
        {
            ((StringBuilder) (obj)).append(s.charAt(i + 1));
            j = i + 1;
            flag2 = flag1;
        }
_L3:
        i = j + 1;
        flag1 = flag2;
        if (true) goto _L2; else goto _L1
_L1:
        if (c == quotechar)
        {
            boolean flag4;
            if (flag1 || inField)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (isNextCharacterEscapedQuote(s, flag4, i))
            {
                ((StringBuilder) (obj)).append(s.charAt(i + 1));
                i++;
            } else
            {
                if (!strictQuotes && i > 2 && s.charAt(i - 1) != separator && s.length() > i + 1 && s.charAt(i + 1) != separator)
                {
                    if (ignoreLeadingWhiteSpace && ((StringBuilder) (obj)).length() > 0 && isAllWhiteSpace(((CharSequence) (obj))))
                    {
                        ((StringBuilder) (obj)).setLength(0);
                    } else
                    {
                        ((StringBuilder) (obj)).append(c);
                    }
                }
                if (!flag1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            }
            if (!inField)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            inField = flag4;
            j = i;
            flag2 = flag1;
        } else
        {
label0:
            {
                if (c != separator || flag1)
                {
                    break label0;
                }
                arraylist.add(((StringBuilder) (obj)).toString());
                ((StringBuilder) (obj)).setLength(0);
                inField = false;
                j = i;
                flag2 = flag1;
            }
        }
          goto _L3
        if (!strictQuotes) goto _L5; else goto _L4
_L4:
        j = i;
        flag2 = flag1;
        if (!flag1) goto _L3; else goto _L5
_L5:
        ((StringBuilder) (obj)).append(c);
        inField = true;
        j = i;
        flag2 = flag1;
          goto _L3
label1:
        {
            s = ((String) (obj));
            if (flag1)
            {
                if (!flag)
                {
                    break label1;
                }
                ((StringBuilder) (obj)).append("\n");
                pending = ((StringBuilder) (obj)).toString();
                s = null;
            }
            if (s != null)
            {
                arraylist.add(s.toString());
            }
            return (String[])arraylist.toArray(new String[arraylist.size()]);
        }
        throw new IOException("Un-terminated quoted field at end of CSV line");
    }

    protected boolean isAllWhiteSpace(CharSequence charsequence)
    {
        boolean flag1 = true;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < charsequence.length())
                {
                    if (Character.isWhitespace(charsequence.charAt(i)))
                    {
                        break label0;
                    }
                    flag = false;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    protected boolean isNextCharacterEscapable(String s, boolean flag, int i)
    {
        return flag && s.length() > i + 1 && (s.charAt(i + 1) == quotechar || s.charAt(i + 1) == escape);
    }

    public boolean isPending()
    {
        return pending != null;
    }

    public String[] parseLine(String s)
        throws IOException
    {
        return parseLine(s, false);
    }

    public String[] parseLineMulti(String s)
        throws IOException
    {
        return parseLine(s, true);
    }
}
