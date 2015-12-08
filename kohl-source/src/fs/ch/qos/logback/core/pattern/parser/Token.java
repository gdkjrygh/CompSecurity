// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.parser;


class Token
{

    static Token BARE_COMPOSITE_KEYWORD_TOKEN = new Token(1005, "BARE");
    static Token EOF_TOKEN = new Token(0x7fffffff, "EOF");
    static Token PERCENT_TOKEN = new Token(37);
    static Token RIGHT_PARENTHESIS_TOKEN = new Token(41);
    private final int type;
    private final Object value;

    public Token(int i)
    {
        this(i, null);
    }

    public Token(int i, Object obj)
    {
        type = i;
        value = obj;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Token))
            {
                return false;
            }
            obj = (Token)obj;
            if (type != ((Token) (obj)).type)
            {
                return false;
            }
            if (value == null ? ((Token) (obj)).value != null : !value.equals(((Token) (obj)).value))
            {
                return false;
            }
        }
        return true;
    }

    public int getType()
    {
        return type;
    }

    public Object getValue()
    {
        return value;
    }

    public int hashCode()
    {
        int j = type;
        int i;
        if (value != null)
        {
            i = value.hashCode();
        } else
        {
            i = 0;
        }
        return i + j * 29;
    }

    public String toString()
    {
        type;
        JVM INSTR lookupswitch 7: default 72
    //                   37: 107
    //                   41: 143
    //                   1000: 119
    //                   1002: 113
    //                   1004: 131
    //                   1005: 137
    //                   1006: 125;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        break MISSING_BLOCK_LABEL_143;
_L1:
        String s = "UNKNOWN";
_L9:
        if (value == null)
        {
            return (new StringBuilder()).append("Token(").append(s).append(")").toString();
        } else
        {
            return (new StringBuilder()).append("Token(").append(s).append(", \"").append(value).append("\")").toString();
        }
_L2:
        s = "%";
          goto _L9
_L5:
        s = "FormatModifier";
          goto _L9
_L4:
        s = "LITERAL";
          goto _L9
_L8:
        s = "OPTION";
          goto _L9
_L6:
        s = "SIMPLE_KEYWORD";
          goto _L9
_L7:
        s = "COMPOSITE_KEYWORD";
          goto _L9
        s = "RIGHT_PARENTHESIS";
          goto _L9
    }

}
