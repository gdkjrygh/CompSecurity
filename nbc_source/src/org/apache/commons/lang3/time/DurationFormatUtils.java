// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public class DurationFormatUtils
{
    static class Token
    {

        private int count;
        private final Object value;

        static boolean containsTokenWithValue(Token atoken[], Object obj)
        {
            int j = atoken.length;
            for (int i = 0; i < j; i++)
            {
                if (atoken[i].getValue() == obj)
                {
                    return true;
                }
            }

            return false;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof Token)
            {
                obj = (Token)obj;
                break MISSING_BLOCK_LABEL_12;
            }
_L1:
            return false;
            if (value.getClass() == ((Token) (obj)).value.getClass() && count == ((Token) (obj)).count)
            {
                if (value instanceof StringBuilder)
                {
                    return value.toString().equals(((Token) (obj)).value.toString());
                }
                if (value instanceof Number)
                {
                    return value.equals(((Token) (obj)).value);
                }
                if (value == ((Token) (obj)).value)
                {
                    return true;
                }
            }
              goto _L1
        }

        int getCount()
        {
            return count;
        }

        Object getValue()
        {
            return value;
        }

        public int hashCode()
        {
            return value.hashCode();
        }

        void increment()
        {
            count = count + 1;
        }

        public String toString()
        {
            return StringUtils.repeat(value.toString(), count);
        }

        Token(Object obj)
        {
            value = obj;
            count = 1;
        }
    }


    static final Object H = "H";
    static final Object M = "M";
    static final Object S = "S";
    static final Object d = "d";
    static final Object m = "m";
    static final Object s = "s";
    static final Object y = "y";

    static String format(Token atoken[], long l, long l1, long l2, long l3, long l4, long l5, long l6, 
            boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag1 = false;
        int k = atoken.length;
        int j = 0;
        do
        {
            if (j < k)
            {
                Token token = atoken[j];
                Object obj = token.getValue();
                int i1 = token.getCount();
                int i;
                if (obj instanceof StringBuilder)
                {
                    stringbuilder.append(obj.toString());
                    i = ((flag1) ? 1 : 0);
                } else
                if (obj == y)
                {
                    stringbuilder.append(paddedValue(l, flag, i1));
                    i = 0;
                } else
                if (obj == M)
                {
                    stringbuilder.append(paddedValue(l1, flag, i1));
                    i = 0;
                } else
                if (obj == d)
                {
                    stringbuilder.append(paddedValue(l2, flag, i1));
                    i = 0;
                } else
                if (obj == H)
                {
                    stringbuilder.append(paddedValue(l3, flag, i1));
                    i = 0;
                } else
                if (obj == m)
                {
                    stringbuilder.append(paddedValue(l4, flag, i1));
                    i = 0;
                } else
                if (obj == s)
                {
                    stringbuilder.append(paddedValue(l5, flag, i1));
                    i = 1;
                } else
                {
                    i = ((flag1) ? 1 : 0);
                    if (obj == S)
                    {
                        if (flag1)
                        {
                            if (flag)
                            {
                                i = Math.max(3, i1);
                            } else
                            {
                                i = 3;
                            }
                            stringbuilder.append(paddedValue(l6, true, i));
                        } else
                        {
                            stringbuilder.append(paddedValue(l6, flag, i1));
                        }
                        i = 0;
                    }
                }
            } else
            {
                return stringbuilder.toString();
            }
            j++;
            flag1 = i;
        } while (true);
    }

    public static String formatDuration(long l, String s1)
    {
        return formatDuration(l, s1, true);
    }

    public static String formatDuration(long l, String s1, boolean flag)
    {
        Validate.inclusiveBetween(0L, 0x7fffffffffffffffL, l, "durationMillis must not be negative");
        s1 = lexx(s1);
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        long l5 = 0L;
        long l1 = l;
        l = l1;
        if (Token.containsTokenWithValue(s1, d))
        {
            l2 = l1 / 0x5265c00L;
            l = l1 - 0x5265c00L * l2;
        }
        l1 = l;
        if (Token.containsTokenWithValue(s1, H))
        {
            l3 = l / 0x36ee80L;
            l1 = l - 0x36ee80L * l3;
        }
        l = l1;
        if (Token.containsTokenWithValue(s1, m))
        {
            l4 = l1 / 60000L;
            l = l1 - 60000L * l4;
        }
        l1 = l;
        if (Token.containsTokenWithValue(s1, s))
        {
            l5 = l / 1000L;
            l1 = l - 1000L * l5;
        }
        return format(s1, 0L, 0L, l2, l3, l4, l5, l1, flag);
    }

    public static String formatDurationHMS(long l)
    {
        return formatDuration(l, "HH:mm:ss.SSS");
    }

    static Token[] lexx(String s1)
    {
        StringBuilder stringbuilder;
        Token token;
        ArrayList arraylist;
        boolean flag;
        int i;
        arraylist = new ArrayList(s1.length());
        flag = false;
        stringbuilder = null;
        token = null;
        i = 0;
_L2:
        char c;
        Object obj1;
        boolean flag1;
        if (i >= s1.length())
        {
            break MISSING_BLOCK_LABEL_356;
        }
        c = s1.charAt(i);
        if (!flag || c == '\'')
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append(c);
        obj1 = token;
        flag1 = flag;
_L12:
        i++;
        flag = flag1;
        token = ((Token) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
        Object obj = null;
        c;
        JVM INSTR lookupswitch 8: default 160
    //                   39: 245
    //                   72: 307
    //                   77: 293
    //                   83: 328
    //                   100: 300
    //                   109: 314
    //                   115: 321
    //                   121: 286;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L7:
        break MISSING_BLOCK_LABEL_328;
_L3:
        obj1 = stringbuilder;
        if (stringbuilder == null)
        {
            obj1 = new StringBuilder();
            arraylist.add(new Token(obj1));
        }
        ((StringBuilder) (obj1)).append(c);
        stringbuilder = ((StringBuilder) (obj1));
_L13:
        flag1 = flag;
        obj1 = token;
        if (obj != null)
        {
            if (token != null && token.getValue() == obj)
            {
                token.increment();
            } else
            {
                token = new Token(obj);
                arraylist.add(token);
            }
            stringbuilder = null;
            flag1 = flag;
            obj1 = token;
        }
          goto _L12
_L4:
        if (flag)
        {
            stringbuilder = null;
            flag = false;
        } else
        {
            stringbuilder = new StringBuilder();
            arraylist.add(new Token(stringbuilder));
            flag = true;
        }
          goto _L13
_L11:
        obj = y;
          goto _L13
_L6:
        obj = M;
          goto _L13
_L8:
        obj = d;
          goto _L13
_L5:
        obj = H;
          goto _L13
_L9:
        obj = m;
          goto _L13
_L10:
        obj = s;
          goto _L13
        obj = S;
          goto _L13
        if (flag)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unmatched quote in format: ").append(s1).toString());
        }
        return (Token[])arraylist.toArray(new Token[arraylist.size()]);
          goto _L12
    }

    private static String paddedValue(long l, boolean flag, int i)
    {
        String s2 = Long.toString(l);
        String s1 = s2;
        if (flag)
        {
            s1 = StringUtils.leftPad(s2, i, '0');
        }
        return s1;
    }

}
