// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.json.simple.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// Referenced classes of package org.json.simple.parser:
//            ParseException, Yytoken

class Yylex
{

    public static final int STRING_BEGIN = 2;
    public static final int YYEOF = -1;
    public static final int YYINITIAL = 0;
    private static final int ZZ_ACTION[] = zzUnpackAction();
    private static final String ZZ_ACTION_PACKED_0 = "\002\000\002\001\001\002\001\003\001\004\003\001\001\005\001\006\001\007\001\b\001\t\001\n\001\013\001\f\001\r\005\000\001\f\001\016\001\017\001\020\001\021\001\022\001\023\001\024\001\000\001\025\001\000\001\025\004\000\001\026\001\027\002\000\001\030";
    private static final int ZZ_ATTRIBUTE[] = zzUnpackAttribute();
    private static final String ZZ_ATTRIBUTE_PACKED_0 = "\002\000\001\t\003\001\001\t\003\001\006\t\002\001\001\t\005\000\b\t\001\000\001\001\001\000\001\001\004\000\002\t\002\000\001\t";
    private static final int ZZ_BUFFERSIZE = 16384;
    private static final char ZZ_CMAP[] = zzUnpackCMap("\t\000\001\007\001\007\002\000\001\007\022\000\001\007\001\000\001\t\b\000\001\006\001\031\001\002\001\004\001\n\n\003\001\032\006\000\004\001\001\005\001\001\024\000\001\027\001\b\001\030\003\000\001\022\001\013\002\001\001\021\001\f\005\000\001\023\001\000\001\r\003\000\001\016\001\024\001\017\001\020\005\000\001\025\001\000\001\026\uFF82\0");
    private static final String ZZ_CMAP_PACKED = "\t\000\001\007\001\007\002\000\001\007\022\000\001\007\001\000\001\t\b\000\001\006\001\031\001\002\001\004\001\n\n\003\001\032\006\000\004\001\001\005\001\001\024\000\001\027\001\b\001\030\003\000\001\022\001\013\002\001\001\021\001\f\005\000\001\023\001\000\001\r\003\000\001\016\001\024\001\017\001\020\005\000\001\025\001\000\001\026\uFF82\0";
    private static final String ZZ_ERROR_MSG[] = {
        "Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"
    };
    private static final int ZZ_LEXSTATE[] = {
        0, 0, 1, 1
    };
    private static final int ZZ_NO_MATCH = 1;
    private static final int ZZ_PUSHBACK_2BIG = 2;
    private static final int ZZ_ROWMAP[] = zzUnpackRowMap();
    private static final String ZZ_ROWMAP_PACKED_0 = "\000\000\000\033\0006\000Q\000l\000\207\0006\000\242\000\275\000\330\0006\0006\0006\0006\0006\0006\000\363\000\u010E\0006\000\u0129\000\u0144\000\u015F\000\u017A\000\u0195\0006\0006\0006\0006\0006\0006\0006\0006\000\u01B0\000\u01CB\000\u01E6\000\u01E6\000\u0201\000\u021C\000\u0237\000\u0252\0006\0006\000\u026D\000\u0288\0006";
    private static final int ZZ_TRANS[] = {
        2, 2, 3, 4, 2, 2, 2, 5, 2, 6, 
        2, 2, 7, 8, 2, 9, 2, 2, 2, 2, 
        2, 10, 11, 12, 13, 14, 15, 16, 16, 16, 
        16, 16, 16, 16, 16, 17, 18, 16, 16, 16, 
        16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 
        16, 16, 16, 16, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, 4, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, 4, 19, 20, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        21, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        23, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, 16, 16, 16, 16, 16, 16, 16, 
        16, -1, -1, 16, 16, 16, 16, 16, 16, 16, 
        16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 
        -1, -1, -1, -1, -1, -1, -1, -1, 24, 25, 
        26, 27, 28, 29, 30, 31, 32, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        33, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, 34, 35, -1, -1, 
        34, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        36, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, 39, -1, 39, -1, 39, -1, -1, 
        -1, -1, -1, 39, 39, -1, -1, -1, -1, 39, 
        39, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, 33, -1, 20, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, 42, -1, 42, -1, 42, 
        -1, -1, -1, -1, -1, 42, 42, -1, -1, -1, 
        -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, 43, -1, 43, -1, 43, -1, -1, -1, 
        -1, -1, 43, 43, -1, -1, -1, -1, 43, 43, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, 
        -1, 44, -1, 44, -1, -1, -1, -1, -1, 44, 
        44, -1, -1, -1, -1, 44, 44, -1, -1, -1, 
        -1, -1, -1, -1, -1
    };
    private static final int ZZ_UNKNOWN_ERROR = 0;
    private StringBuffer sb;
    private int yychar;
    private int yycolumn;
    private int yyline;
    private boolean zzAtBOL;
    private boolean zzAtEOF;
    private char zzBuffer[];
    private int zzCurrentPos;
    private int zzEndRead;
    private int zzLexicalState;
    private int zzMarkedPos;
    private Reader zzReader;
    private int zzStartRead;
    private int zzState;

    Yylex(InputStream inputstream)
    {
        this(((Reader) (new InputStreamReader(inputstream))));
    }

    Yylex(Reader reader)
    {
        zzLexicalState = 0;
        zzBuffer = new char[16384];
        zzAtBOL = true;
        sb = new StringBuffer();
        zzReader = reader;
    }

    private boolean zzRefill()
        throws IOException
    {
        if (zzStartRead > 0)
        {
            System.arraycopy(zzBuffer, zzStartRead, zzBuffer, 0, zzEndRead - zzStartRead);
            zzEndRead = zzEndRead - zzStartRead;
            zzCurrentPos = zzCurrentPos - zzStartRead;
            zzMarkedPos = zzMarkedPos - zzStartRead;
            zzStartRead = 0;
        }
        if (zzCurrentPos >= zzBuffer.length)
        {
            char ac[] = new char[zzCurrentPos * 2];
            System.arraycopy(zzBuffer, 0, ac, 0, zzBuffer.length);
            zzBuffer = ac;
        }
        int i = zzReader.read(zzBuffer, zzEndRead, zzBuffer.length - zzEndRead);
        if (i > 0)
        {
            zzEndRead = zzEndRead + i;
            return false;
        }
        if (i == 0)
        {
            int j = zzReader.read();
            if (j == -1)
            {
                return true;
            } else
            {
                char ac1[] = zzBuffer;
                int k = zzEndRead;
                zzEndRead = k + 1;
                ac1[k] = (char)j;
                return false;
            }
        } else
        {
            return true;
        }
    }

    private void zzScanError(int i)
    {
        String s;
        try
        {
            s = ZZ_ERROR_MSG[i];
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            arrayindexoutofboundsexception = ZZ_ERROR_MSG[0];
        }
        throw new Error(s);
    }

    private static int zzUnpackAction(String s, int i, int ai[])
    {
        int j;
        int i1;
        i1 = s.length();
        j = 0;
_L2:
        int l;
        int j1;
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = j + 1;
        char c = s.charAt(j);
        l = j1 + 1;
        j1 = s.charAt(j1);
        j = i;
        i = c;
_L3:
        int k;
        k = j + 1;
        ai[j] = j1;
        i--;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        i = k;
        j = l;
        if (true) goto _L2; else goto _L1
_L1:
        return i;
        j = k;
          goto _L3
    }

    private static int[] zzUnpackAction()
    {
        int ai[] = new int[45];
        zzUnpackAction("\002\000\002\001\001\002\001\003\001\004\003\001\001\005\001\006\001\007\001\b\001\t\001\n\001\013\001\f\001\r\005\000\001\f\001\016\001\017\001\020\001\021\001\022\001\023\001\024\001\000\001\025\001\000\001\025\004\000\001\026\001\027\002\000\001\030", 0, ai);
        return ai;
    }

    private static int zzUnpackAttribute(String s, int i, int ai[])
    {
        int j;
        int i1;
        i1 = s.length();
        j = 0;
_L2:
        int l;
        int j1;
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = j + 1;
        char c = s.charAt(j);
        l = j1 + 1;
        j1 = s.charAt(j1);
        j = i;
        i = c;
_L3:
        int k;
        k = j + 1;
        ai[j] = j1;
        i--;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        i = k;
        j = l;
        if (true) goto _L2; else goto _L1
_L1:
        return i;
        j = k;
          goto _L3
    }

    private static int[] zzUnpackAttribute()
    {
        int ai[] = new int[45];
        zzUnpackAttribute("\002\000\001\t\003\001\001\t\003\001\006\t\002\001\001\t\005\000\b\t\001\000\001\001\001\000\001\001\004\000\002\t\002\000\001\t", 0, ai);
        return ai;
    }

    private static char[] zzUnpackCMap(String s)
    {
        char ac[];
        int i;
        int j;
        ac = new char[0x10000];
        i = 0;
        j = 0;
_L2:
        char c;
        int l;
        if (j >= 90)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = j + 1;
        char c1 = s.charAt(j);
        l = i1 + 1;
        c = s.charAt(i1);
        j = i;
        i = c1;
_L3:
        int k;
        k = j + 1;
        ac[j] = c;
        i--;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        i = k;
        j = l;
        if (true) goto _L2; else goto _L1
_L1:
        return ac;
        j = k;
          goto _L3
    }

    private static int zzUnpackRowMap(String s, int i, int ai[])
    {
        int k = s.length();
        for (int j = 0; j < k;)
        {
            int l = j + 1;
            char c = s.charAt(j);
            j = l + 1;
            ai[i] = s.charAt(l) | c << 16;
            i++;
        }

        return i;
    }

    private static int[] zzUnpackRowMap()
    {
        int ai[] = new int[45];
        zzUnpackRowMap("\000\000\000\033\0006\000Q\000l\000\207\0006\000\242\000\275\000\330\0006\0006\0006\0006\0006\0006\000\363\000\u010E\0006\000\u0129\000\u0144\000\u015F\000\u017A\000\u0195\0006\0006\0006\0006\0006\0006\0006\0006\000\u01B0\000\u01CB\000\u01E6\000\u01E6\000\u0201\000\u021C\000\u0237\000\u0252\0006\0006\000\u026D\000\u0288\0006", 0, ai);
        return ai;
    }

    int getPosition()
    {
        return yychar;
    }

    public final void yybegin(int i)
    {
        zzLexicalState = i;
    }

    public final char yycharat(int i)
    {
        return zzBuffer[zzStartRead + i];
    }

    public final void yyclose()
        throws IOException
    {
        zzAtEOF = true;
        zzEndRead = zzStartRead;
        if (zzReader != null)
        {
            zzReader.close();
        }
    }

    public final int yylength()
    {
        return zzMarkedPos - zzStartRead;
    }

    public Yytoken yylex()
        throws IOException, ParseException
    {
        char ac[];
        char ac1[];
        int ai[];
        int ai1[];
        int ai2[];
        int j1;
        j1 = zzEndRead;
        ac = zzBuffer;
        ac1 = ZZ_CMAP;
        ai = ZZ_TRANS;
        ai1 = ZZ_ROWMAP;
        ai2 = ZZ_ATTRIBUTE;
_L8:
        Object obj;
        int j;
        int l;
        int i1;
        j = zzMarkedPos;
        yychar = yychar + (j - zzStartRead);
        i1 = -1;
        zzStartRead = j;
        zzCurrentPos = j;
        zzState = ZZ_LEXSTATE[zzLexicalState];
        l = j;
        obj = ac;
_L6:
        int i;
        char c;
        if (l < j1)
        {
            int k1 = l + 1;
            c = obj[l];
            i = j;
            j = k1;
            ac = ((char []) (obj));
        } else
        {
            if (zzAtEOF)
            {
                c = '\uFFFF';
                i = j1;
                l = j;
                continue; /* Loop/switch isn't completed */
            }
            zzCurrentPos = l;
            zzMarkedPos = j;
            boolean flag = zzRefill();
            j = zzCurrentPos;
            l = zzMarkedPos;
            obj = zzBuffer;
            i = zzEndRead;
            if (flag)
            {
                c = '\uFFFF';
                continue; /* Loop/switch isn't completed */
            }
            c = obj[j];
            j++;
            ac = ((char []) (obj));
            j1 = i;
            i = l;
        }
        l = ai[ai1[zzState] + ac1[c]];
        if (l != -1) goto _L2; else goto _L1
_L1:
        l = i;
        i = j1;
        obj = ac;
_L4:
        zzMarkedPos = l;
        int l1;
        int i2;
        int j2;
        if (i1 >= 0)
        {
            i1 = ZZ_ACTION[i1];
        }
        ac = ((char []) (obj));
        j1 = i;
        switch (i1)
        {
        default:
            if (c == '\uFFFF' && zzStartRead == zzCurrentPos)
            {
                zzAtEOF = true;
                return null;
            }
            break;

        case 3: // '\003'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
        case 31: // '\037'
        case 32: // ' '
        case 33: // '!'
        case 34: // '"'
        case 35: // '#'
        case 36: // '$'
        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
        case 42: // '*'
        case 43: // '+'
        case 44: // ','
        case 45: // '-'
        case 46: // '.'
        case 47: // '/'
        case 48: // '0'
            continue; /* Loop/switch isn't completed */

        case 11: // '\013'
            sb.append(yytext());
            ac = ((char []) (obj));
            j1 = i;
            continue; /* Loop/switch isn't completed */

        case 4: // '\004'
            sb.delete(0, sb.length());
            yybegin(2);
            ac = ((char []) (obj));
            j1 = i;
            continue; /* Loop/switch isn't completed */

        case 16: // '\020'
            sb.append('\b');
            ac = ((char []) (obj));
            j1 = i;
            continue; /* Loop/switch isn't completed */

        case 6: // '\006'
            return new Yytoken(2, null);

        case 23: // '\027'
            return new Yytoken(0, Boolean.valueOf(yytext()));

        case 22: // '\026'
            return new Yytoken(0, null);

        case 13: // '\r'
            yybegin(0);
            return new Yytoken(0, sb.toString());

        case 12: // '\f'
            sb.append('\\');
            ac = ((char []) (obj));
            j1 = i;
            continue; /* Loop/switch isn't completed */

        case 21: // '\025'
            return new Yytoken(0, Double.valueOf(yytext()));

        case 1: // '\001'
            throw new ParseException(yychar, 0, new Character(yycharat(0)));

        case 8: // '\b'
            return new Yytoken(4, null);

        case 19: // '\023'
            sb.append('\r');
            ac = ((char []) (obj));
            j1 = i;
            continue; /* Loop/switch isn't completed */

        case 15: // '\017'
            sb.append('/');
            ac = ((char []) (obj));
            j1 = i;
            continue; /* Loop/switch isn't completed */

        case 10: // '\n'
            return new Yytoken(6, null);

        case 14: // '\016'
            sb.append('"');
            ac = ((char []) (obj));
            j1 = i;
            continue; /* Loop/switch isn't completed */

        case 5: // '\005'
            return new Yytoken(1, null);

        case 17: // '\021'
            sb.append('\f');
            ac = ((char []) (obj));
            j1 = i;
            continue; /* Loop/switch isn't completed */

        case 24: // '\030'
            try
            {
                int k = Integer.parseInt(yytext().substring(2), 16);
                sb.append((char)k);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new ParseException(yychar, 2, obj);
            }
            ac = ((char []) (obj));
            j1 = i;
            continue; /* Loop/switch isn't completed */

        case 20: // '\024'
            sb.append('\t');
            ac = ((char []) (obj));
            j1 = i;
            continue; /* Loop/switch isn't completed */

        case 7: // '\007'
            return new Yytoken(3, null);

        case 2: // '\002'
            return new Yytoken(0, Long.valueOf(yytext()));

        case 18: // '\022'
            sb.append('\n');
            ac = ((char []) (obj));
            j1 = i;
            continue; /* Loop/switch isn't completed */

        case 9: // '\t'
            return new Yytoken(5, null);
        }
        break; /* Loop/switch isn't completed */
_L2:
        zzState = l;
        j2 = ai2[zzState];
        if ((j2 & 1) != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        i2 = zzState;
        l1 = j;
        i1 = i2;
        obj = ac;
        i = j1;
        l = l1;
        if ((j2 & 8) == 8)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = l1;
        i1 = i2;
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        obj = ac;
        l = j;
        j = i;
        if (true) goto _L6; else goto _L5
_L5:
        zzScanError(1);
        ac = ((char []) (obj));
        j1 = i;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void yypushback(int i)
    {
        if (i > yylength())
        {
            zzScanError(2);
        }
        zzMarkedPos = zzMarkedPos - i;
    }

    public final void yyreset(Reader reader)
    {
        zzReader = reader;
        zzAtBOL = true;
        zzAtEOF = false;
        zzStartRead = 0;
        zzEndRead = 0;
        zzMarkedPos = 0;
        zzCurrentPos = 0;
        yycolumn = 0;
        yychar = 0;
        yyline = 0;
        zzLexicalState = 0;
    }

    public final int yystate()
    {
        return zzLexicalState;
    }

    public final String yytext()
    {
        return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
    }

}
