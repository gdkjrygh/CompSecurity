// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.json;

import com.google.a.b.ar;
import com.google.a.b.at;
import com.google.a.b.av;
import com.google.a.b.aw;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class JSONImmutableReader
{

    private static final Object ARRAY_END = new Object();
    private static final Object COLON = new Object();
    private static final Object COMMA = new Object();
    public static final int CURRENT = 1;
    public static final int FIRST = 0;
    public static final int NEXT = 2;
    private static final Object OBJECT_END = new Object();
    private static av escapes;
    private StringBuffer buf;
    private char c;
    private CharacterIterator it;
    private Object token;

    public JSONImmutableReader()
    {
        buf = new StringBuffer();
    }

    private void add()
    {
        add(c);
    }

    private void add(char c1)
    {
        buf.append(c1);
        next();
    }

    private int addDigits()
    {
        int i;
        for (i = 0; Character.isDigit(c); i++)
        {
            add();
        }

        return i;
    }

    private Object array()
    {
        at at1 = ar.g();
        Object obj = read();
        do
        {
            if (token == ARRAY_END)
            {
                break;
            }
            at1.c(obj);
            if (read() == COMMA)
            {
                obj = read();
            }
        } while (true);
        return at1.a();
    }

    private char next()
    {
        c = it.next();
        return c;
    }

    private Object number()
    {
        boolean flag = false;
        buf.setLength(0);
        if (c == '-')
        {
            add();
        }
        int j = addDigits() + 0;
        int i = j;
        if (c == '.')
        {
            add();
            i = addDigits() + j;
            flag = true;
        }
        if (c == 'e' || c == 'E')
        {
            add();
            if (c == '+' || c == '-')
            {
                add();
            }
            addDigits();
            flag = true;
        }
        String s = buf.toString();
        if (flag)
        {
            if (i < 17)
            {
                return Double.valueOf(s);
            } else
            {
                return new BigDecimal(s);
            }
        }
        if (i < 19)
        {
            return Long.valueOf(s);
        } else
        {
            return new BigInteger(s);
        }
    }

    private Object object()
    {
        aw aw1 = av.h();
        Object obj = read();
        do
        {
            if (token == OBJECT_END)
            {
                break;
            }
            read();
            if (token != OBJECT_END)
            {
                aw1.a(obj, read());
                if (read() == COMMA)
                {
                    obj = read();
                }
            }
        } while (true);
        return aw1.a();
    }

    private Object read()
    {
        char c1;
        skipWhiteSpace();
        c1 = c;
        next();
        c1;
        JVM INSTR lookupswitch 10: default 104
    //                   34: 149
    //                   44: 181
    //                   58: 212
    //                   91: 160
    //                   93: 171
    //                   102: 247
    //                   110: 277
    //                   116: 222
    //                   123: 191
    //                   125: 202;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        c = it.previous();
        if (Character.isDigit(c) || c == '-')
        {
            token = number();
        }
_L13:
        return token;
_L2:
        token = string();
        continue; /* Loop/switch isn't completed */
_L5:
        token = array();
        continue; /* Loop/switch isn't completed */
_L6:
        token = ARRAY_END;
        continue; /* Loop/switch isn't completed */
_L3:
        token = COMMA;
        continue; /* Loop/switch isn't completed */
_L10:
        token = object();
        continue; /* Loop/switch isn't completed */
_L11:
        token = OBJECT_END;
        continue; /* Loop/switch isn't completed */
_L4:
        token = COLON;
        continue; /* Loop/switch isn't completed */
_L9:
        next();
        next();
        next();
        token = Boolean.TRUE;
        continue; /* Loop/switch isn't completed */
_L7:
        next();
        next();
        next();
        next();
        token = Boolean.FALSE;
        continue; /* Loop/switch isn't completed */
_L8:
        next();
        next();
        next();
        token = null;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private void skipWhiteSpace()
    {
        for (; Character.isWhitespace(c); next()) { }
    }

    private Object string()
    {
        buf.setLength(0);
        do
        {
            if (c == '"')
            {
                break;
            }
            if (c == '\\')
            {
                next();
                if (c == 'u')
                {
                    add(unicode());
                } else
                {
                    Object obj = escapes.get(new Character(c));
                    if (obj != null)
                    {
                        add(((Character)obj).charValue());
                    }
                }
            } else
            {
                add();
            }
        } while (true);
        next();
        return buf.toString();
    }

    private char unicode()
    {
        int i;
        int j;
        i = 0;
        j = 0;
_L6:
        if (j >= 4)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        next();
        JVM INSTR lookupswitch 22: default 200
    //                   48: 207
    //                   49: 207
    //                   50: 207
    //                   51: 207
    //                   52: 207
    //                   53: 207
    //                   54: 207
    //                   55: 207
    //                   56: 207
    //                   57: 207
    //                   65: 237
    //                   66: 237
    //                   67: 237
    //                   68: 237
    //                   69: 237
    //                   70: 237
    //                   97: 222
    //                   98: 222
    //                   99: 222
    //                   100: 222
    //                   101: 222
    //                   102: 222;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L4 _L4 _L4 _L4 _L4 _L4
_L3:
        break MISSING_BLOCK_LABEL_237;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L7:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        i = ((i << 4) + c) - 48;
          goto _L7
_L4:
        i = ((i << 4) + c) - 107;
          goto _L7
        i = ((i << 4) + c) - 75;
          goto _L7
        return (char)i;
    }

    public Object read(String s)
    {
        return read(((CharacterIterator) (new StringCharacterIterator(s))), 0);
    }

    public Object read(CharacterIterator characteriterator)
    {
        return read(characteriterator, 2);
    }

    public Object read(CharacterIterator characteriterator, int i)
    {
        it = characteriterator;
        i;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 37
    //                   1 53
    //                   2 69;
           goto _L1 _L2 _L3 _L4
_L1:
        return read();
_L2:
        c = it.first();
        continue; /* Loop/switch isn't completed */
_L3:
        c = it.current();
        continue; /* Loop/switch isn't completed */
_L4:
        c = it.next();
        if (true) goto _L1; else goto _L5
_L5:
    }

    static 
    {
        aw aw1 = av.h();
        aw1.a(new Character('"'), new Character('"'));
        aw1.a(new Character('\\'), new Character('\\'));
        aw1.a(new Character('/'), new Character('/'));
        aw1.a(new Character('b'), new Character('\b'));
        aw1.a(new Character('f'), new Character('\f'));
        aw1.a(new Character('n'), new Character('\n'));
        aw1.a(new Character('r'), new Character('\r'));
        aw1.a(new Character('t'), new Character('\t'));
        escapes = aw1.a();
    }
}
