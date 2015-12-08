// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class ColognePhonetic
    implements StringEncoder
{
    private abstract class CologneBuffer
    {

        protected final char data[];
        protected int length;
        final ColognePhonetic this$0;

        protected abstract char[] copyData(int i, int j);

        public int length()
        {
            return length;
        }

        public String toString()
        {
            return new String(copyData(0, length));
        }

        public CologneBuffer(int i)
        {
            this$0 = ColognePhonetic.this;
            super();
            length = 0;
            data = new char[i];
            length = 0;
        }

        public CologneBuffer(char ac[])
        {
            this$0 = ColognePhonetic.this;
            super();
            length = 0;
            data = ac;
            length = ac.length;
        }
    }

    private class CologneInputBuffer extends CologneBuffer
    {

        final ColognePhonetic this$0;

        public void addLeft(char c)
        {
            length = length + 1;
            data[getNextPos()] = c;
        }

        protected char[] copyData(int i, int j)
        {
            char ac[] = new char[j];
            System.arraycopy(data, (data.length - length) + i, ac, 0, j);
            return ac;
        }

        public char getNextChar()
        {
            return data[getNextPos()];
        }

        protected int getNextPos()
        {
            return data.length - length;
        }

        public char removeNext()
        {
            char c = getNextChar();
            length = length - 1;
            return c;
        }

        public CologneInputBuffer(char ac[])
        {
            this$0 = ColognePhonetic.this;
            super(ac);
        }
    }

    private class CologneOutputBuffer extends CologneBuffer
    {

        final ColognePhonetic this$0;

        public void addRight(char c)
        {
            data[length] = c;
            length = length + 1;
        }

        protected char[] copyData(int i, int j)
        {
            char ac[] = new char[j];
            System.arraycopy(data, i, ac, 0, j);
            return ac;
        }

        public CologneOutputBuffer(int i)
        {
            this$0 = ColognePhonetic.this;
            super(i);
        }
    }


    private static final char PREPROCESS_MAP[][];

    public ColognePhonetic()
    {
    }

    private static boolean arrayContains(char ac[], char c)
    {
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            if (ac[i] == c)
            {
                return true;
            }
        }

        return false;
    }

    private String preprocess(String s)
    {
        int i;
        s = s.toUpperCase(Locale.GERMAN).toCharArray();
        i = 0;
_L10:
        if (i >= s.length) goto _L2; else goto _L1
_L1:
        if (s[i] <= 'Z') goto _L4; else goto _L3
_L3:
        char ac[][];
        int j;
        int k;
        ac = PREPROCESS_MAP;
        k = ac.length;
        j = 0;
_L8:
        if (j >= k) goto _L4; else goto _L5
_L5:
        char ac1[] = ac[j];
        if (s[i] != ac1[0]) goto _L7; else goto _L6
_L6:
        s[i] = ac1[1];
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L7:
        j++;
        if (true) goto _L8; else goto _L2
_L2:
        return new String(s);
        if (true) goto _L10; else goto _L9
_L9:
    }

    public String colognePhonetic(String s)
    {
        char c;
        Object obj;
        int i;
        char c3;
        if (s == null)
        {
            return null;
        }
        obj = preprocess(s);
        s = new CologneOutputBuffer(((String) (obj)).length() * 2);
        obj = new CologneInputBuffer(((String) (obj)).toCharArray());
        c = '-';
        c3 = '/';
        i = ((CologneInputBuffer) (obj)).length();
_L3:
        char c1;
        char c2;
        int j;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_741;
        }
        c1 = ((CologneInputBuffer) (obj)).removeNext();
        j = ((CologneInputBuffer) (obj)).length();
        if (j > 0)
        {
            c2 = ((CologneInputBuffer) (obj)).getNextChar();
        } else
        {
            c2 = '-';
        }
        if (!arrayContains(new char[] {
            'A', 'E', 'I', 'J', 'O', 'U', 'Y'
        }, c1)) goto _L2; else goto _L1
_L1:
        c = '0';
        i = j;
_L5:
        if (c != '-' && (c3 != c && (c != '0' || c3 == '/') || c < '0' || c > '8'))
        {
            s.addRight(c);
        }
        c3 = c;
        c = c1;
          goto _L3
_L2:
        if (c1 != 'H' && c1 >= 'A' && c1 <= 'Z')
        {
            break MISSING_BLOCK_LABEL_238;
        }
        i = j;
        if (c3 == '/') goto _L3; else goto _L4
_L4:
        c = '-';
        i = j;
          goto _L5
        if (c1 == 'B' || c1 == 'P' && c2 != 'H')
        {
            c = '1';
            i = j;
        } else
        if ((c1 == 'D' || c1 == 'T') && !arrayContains(new char[] {
    'S', 'C', 'Z'
}, c2))
        {
            c = '2';
            i = j;
        } else
        if (arrayContains(new char[] {
    'W', 'F', 'P', 'V'
}, c1))
        {
            c = '3';
            i = j;
        } else
        if (arrayContains(new char[] {
    'G', 'K', 'Q'
}, c1))
        {
            c = '4';
            i = j;
        } else
        if (c1 == 'X' && !arrayContains(new char[] {
    'C', 'K', 'Q'
}, c))
        {
            c = '4';
            ((CologneInputBuffer) (obj)).addLeft('S');
            i = j + 1;
        } else
        if (c1 == 'S' || c1 == 'Z')
        {
            c = '8';
            i = j;
        } else
        if (c1 == 'C')
        {
            if (c3 == '/')
            {
                if (arrayContains(new char[] {
    'A', 'H', 'K', 'L', 'O', 'Q', 'R', 'U', 'X'
}, c2))
                {
                    c = '4';
                    i = j;
                } else
                {
                    c = '8';
                    i = j;
                }
            } else
            if (arrayContains(new char[] {
    'S', 'Z'
}, c) || !arrayContains(new char[] {
    'A', 'H', 'O', 'U', 'K', 'Q', 'X'
}, c2))
            {
                c = '8';
                i = j;
            } else
            {
                c = '4';
                i = j;
            }
        } else
        if (arrayContains(new char[] {
    'T', 'D', 'X'
}, c1))
        {
            c = '8';
            i = j;
        } else
        if (c1 == 'R')
        {
            c = '7';
            i = j;
        } else
        if (c1 == 'L')
        {
            c = '5';
            i = j;
        } else
        if (c1 == 'M' || c1 == 'N')
        {
            c = '6';
            i = j;
        } else
        {
            c = c1;
            i = j;
        }
          goto _L5
        return s.toString();
    }

    public Object encode(Object obj)
        throws EncoderException
    {
        if (!(obj instanceof String))
        {
            throw new EncoderException((new StringBuilder()).append("This method's parameter was expected to be of the type ").append(java/lang/String.getName()).append(". But actually it was of the type ").append(obj.getClass().getName()).append(".").toString());
        } else
        {
            return encode((String)obj);
        }
    }

    public String encode(String s)
    {
        return colognePhonetic(s);
    }

    public boolean isEncodeEqual(String s, String s1)
    {
        return colognePhonetic(s).equals(colognePhonetic(s1));
    }

    static 
    {
        char ac[] = {
            '\334', 'U'
        };
        char ac1[] = {
            '\326', 'O'
        };
        char ac2[] = {
            '\337', 'S'
        };
        PREPROCESS_MAP = (new char[][] {
            new char[] {
                '\304', 'A'
            }, ac, ac1, ac2
        });
    }
}
