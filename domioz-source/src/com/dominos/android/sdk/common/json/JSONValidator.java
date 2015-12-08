// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.json;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

// Referenced classes of package com.dominos.android.sdk.common.json:
//            JSONErrorListener

public class JSONValidator
{

    private char c;
    private int col;
    private CharacterIterator it;
    private int line;
    private int lineCol;
    private JSONErrorListener listener;

    public JSONValidator(JSONErrorListener jsonerrorlistener)
    {
        listener = jsonerrorlistener;
    }

    private boolean aggregate(char c1, char c2, boolean flag)
    {
        if (c != c1)
        {
            return false;
        }
        nextCharacter();
        skipWhiteSpace();
        if (c == c2)
        {
            nextCharacter();
            return true;
        }
          goto _L1
_L5:
        nextCharacter();
        skipWhiteSpace();
_L3:
        if (!value())
        {
            break MISSING_BLOCK_LABEL_153;
        }
        skipWhiteSpace();
        if (c != ',')
        {
            break; /* Loop/switch isn't completed */
        }
        nextCharacter();
        skipWhiteSpace();
_L1:
        if (!flag) goto _L3; else goto _L2
_L2:
        c1 = col;
        if (!string())
        {
            return error("string", c1);
        }
        skipWhiteSpace();
        if (c != ':')
        {
            return error("colon", col);
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (c != c2)
        {
            return error((new StringBuilder("comma or ")).append(c2).toString(), col);
        } else
        {
            nextCharacter();
            return true;
        }
        return error("value", col);
    }

    private boolean array()
    {
        return aggregate('[', ']', false);
    }

    private boolean error(String s, int i)
    {
        if (listener != null)
        {
            listener.error(s, line, i - lineCol);
        }
        return false;
    }

    private boolean escape()
    {
        int i = col - 1;
        if ("\\\"/bfnrtu".indexOf(c) < 0)
        {
            return error("escape sequence \\\",\\\\,\\/,\\b,\\f,\\n,\\r,\\t or \\uxxxx", i);
        }
        if (c == 'u' && (!ishex(nextCharacter()) || !ishex(nextCharacter()) || !ishex(nextCharacter()) || !ishex(nextCharacter())))
        {
            return error("unicode escape sequence \\uxxxx", i);
        } else
        {
            return true;
        }
    }

    private boolean ishex(char c1)
    {
        return "0123456789abcdefABCDEF".indexOf(c) >= 0;
    }

    private boolean literal(String s)
    {
        StringCharacterIterator stringcharacteriterator;
        char c1;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        stringcharacteriterator = new StringCharacterIterator(s);
        c1 = stringcharacteriterator.first();
        if (c == c1) goto _L2; else goto _L1
_L1:
        return flag1;
_L2:
        int i;
        i = col;
        c1 = stringcharacteriterator.next();
_L5:
        if (c1 == '\uFFFF')
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (c1 == nextCharacter()) goto _L4; else goto _L3
_L3:
        nextCharacter();
        flag1 = flag;
        if (!flag)
        {
            error((new StringBuilder("literal ")).append(s).toString(), i);
            return flag;
        }
          goto _L1
_L4:
        c1 = stringcharacteriterator.next();
          goto _L5
        flag = true;
          goto _L3
    }

    private char nextCharacter()
    {
        c = it.next();
        col = col + 1;
        if (c == '\n')
        {
            line = line + 1;
            lineCol = col;
        }
        return c;
    }

    private boolean number()
    {
        if (!Character.isDigit(c) && c != '-')
        {
            return false;
        }
        int i = col;
        if (c == '-')
        {
            nextCharacter();
        }
        if (c == '0')
        {
            nextCharacter();
        } else
        if (Character.isDigit(c))
        {
            while (Character.isDigit(c)) 
            {
                nextCharacter();
            }
        } else
        {
            return error("number", i);
        }
        if (c == '.')
        {
            nextCharacter();
            if (Character.isDigit(c))
            {
                for (; Character.isDigit(c); nextCharacter()) { }
            } else
            {
                return error("number", i);
            }
        }
        if (c == 'e' || c == 'E')
        {
            nextCharacter();
            if (c == '+' || c == '-')
            {
                nextCharacter();
            }
            if (Character.isDigit(c))
            {
                for (; Character.isDigit(c); nextCharacter()) { }
            } else
            {
                return error("number", i);
            }
        }
        return true;
    }

    private boolean object()
    {
        return aggregate('{', '}', true);
    }

    private void skipWhiteSpace()
    {
        for (; Character.isWhitespace(c); nextCharacter()) { }
    }

    private boolean string()
    {
        if (c == '"') goto _L2; else goto _L1
_L1:
        return false;
_L2:
        boolean flag;
        int i;
        i = col;
        nextCharacter();
        flag = false;
_L4:
        if (c == '\uFFFF')
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (flag || c != '\\')
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
_L6:
        nextCharacter();
        if (true) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!escape()) goto _L1; else goto _L5
_L5:
        flag = false;
          goto _L6
        if (c != '"') goto _L6; else goto _L7
_L7:
        nextCharacter();
        return true;
        return error("quoted string", i);
    }

    private boolean valid(String s)
    {
        if (!"".equals(s))
        {
            it = new StringCharacterIterator(s);
            c = it.first();
            col = 1;
            line = 1;
            lineCol = 0;
            if (!value())
            {
                return error("value", 1);
            }
            skipWhiteSpace();
            if (c != '\uFFFF')
            {
                return error("end", col);
            }
        }
        return true;
    }

    private boolean value()
    {
        return literal("true") || literal("false") || literal("null") || string() || number() || object() || array();
    }

    public boolean validate(String s)
    {
        s = s.trim();
        listener.start(s);
        boolean flag = valid(s);
        listener.end();
        return flag;
    }
}
