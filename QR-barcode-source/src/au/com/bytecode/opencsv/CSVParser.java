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
        Object obj = null;
        if (!flag && pending != null)
        {
            pending = null;
        }
        if (s == null)
        {
            if (pending != null)
            {
                s = pending;
                pending = null;
                return (new String[] {
                    s
                });
            } else
            {
                return null;
            }
        }
        ArrayList arraylist = new ArrayList();
        StringBuilder stringbuilder = new StringBuilder(128);
        char c;
        int i;
        boolean flag1;
        int j;
        int k;
        boolean flag2;
        if (pending != null)
        {
            stringbuilder.append(pending);
            pending = null;
            i = 1;
        } else
        {
            i = 0;
        }
        j = 0;
        flag1 = i;
        i = j;
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_522;
        }
        c = s.charAt(i);
        if (c != escape)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag1 || inField)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        j = i;
        k = ((flag1) ? 1 : 0);
        if (isNextCharacterEscapable(s, flag2, i))
        {
            stringbuilder.append(s.charAt(i + 1));
            j = i + 1;
            k = ((flag1) ? 1 : 0);
        }
_L4:
        i = j + 1;
        flag1 = k;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_108;
_L1:
        if (c == quotechar)
        {
            if (flag1 || inField)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (isNextCharacterEscapedQuote(s, flag2, i))
            {
                stringbuilder.append(s.charAt(i + 1));
                j = i + 1;
                i = ((flag1) ? 1 : 0);
            } else
            {
                if (!strictQuotes && i > 2 && s.charAt(i - 1) != separator && s.length() > i + 1 && s.charAt(i + 1) != separator)
                {
                    if (ignoreLeadingWhiteSpace && stringbuilder.length() > 0 && isAllWhiteSpace(stringbuilder))
                    {
                        stringbuilder.setLength(0);
                    } else
                    {
                        stringbuilder.append(c);
                    }
                }
                if (!flag1)
                {
                    flag1 = true;
                    j = i;
                    i = ((flag1) ? 1 : 0);
                } else
                {
                    flag1 = false;
                    j = i;
                    i = ((flag1) ? 1 : 0);
                }
            }
            if (!inField)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            inField = flag2;
            k = i;
        } else
        {
label0:
            {
                if (c != separator || flag1)
                {
                    break label0;
                }
                arraylist.add(stringbuilder.toString());
                stringbuilder.setLength(0);
                inField = false;
                j = i;
                k = ((flag1) ? 1 : 0);
            }
        }
        continue; /* Loop/switch isn't completed */
        if (strictQuotes)
        {
            j = i;
            k = ((flag1) ? 1 : 0);
            if (!flag1)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        stringbuilder.append(c);
        inField = true;
        j = i;
        k = ((flag1) ? 1 : 0);
        if (true) goto _L4; else goto _L3
_L3:
        if (!flag1) goto _L6; else goto _L5
_L5:
        if (!flag) goto _L8; else goto _L7
_L7:
        stringbuilder.append("\n");
        pending = stringbuilder.toString();
        s = obj;
_L10:
        if (s != null)
        {
            arraylist.add(s.toString());
        }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
_L8:
        throw new IOException("Un-terminated quoted field at end of CSV line");
_L6:
        s = stringbuilder;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected boolean isAllWhiteSpace(CharSequence charsequence)
    {
        for (int i = 0; i < charsequence.length(); i++)
        {
            if (!Character.isWhitespace(charsequence.charAt(i)))
            {
                return false;
            }
        }

        return true;
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
