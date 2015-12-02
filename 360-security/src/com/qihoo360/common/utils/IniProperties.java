// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class IniProperties
{
    private static class a
        implements Iterator
    {

        private Enumeration a;

        public boolean hasNext()
        {
            return a.hasMoreElements();
        }

        public Object next()
        {
            return a.nextElement();
        }

        public void remove()
        {
            throw new UnsupportedOperationException("Can't change underlying enumeration");
        }

        public a(Enumeration enumeration)
        {
            a = enumeration;
        }
    }

    static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b e[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/qihoo360/common/utils/IniProperties$b, s);
        }

        public static b[] values()
        {
            b ab[] = e;
            int i = ab.length;
            b ab1[] = new b[i];
            System.arraycopy(ab, 0, ab1, 0, i);
            return ab1;
        }

        static 
        {
            a = new b("NORMAL", 0);
            b = new b("ESCAPE", 1);
            c = new b("ESC_CRNL", 2);
            d = new b("COMMENT", 3);
            e = (new b[] {
                a, b, c, d
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    private Properties a;
    private Map b;

    public IniProperties()
    {
        a = new Properties();
        b = new HashMap();
    }

    public void dump(PrintStream printstream)
        throws IOException
    {
        Iterator iterator = properties();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        iterator = sections();
_L4:
        if (!iterator.hasNext())
        {
            return;
        }
        break MISSING_BLOCK_LABEL_65;
_L2:
        String s = (String)iterator.next();
        printstream.printf("%s=%s\n", new Object[] {
            s, getProperty(s)
        });
          goto _L3
        String s1 = (String)iterator.next();
        printstream.printf("\n[%s]\n", new Object[] {
            s1
        });
        Iterator iterator1 = properties(s1);
        while (iterator1.hasNext()) 
        {
            String s2 = (String)iterator1.next();
            printstream.printf("%s=%s\n", new Object[] {
                s2, getProperty(s1, s2)
            });
        }
          goto _L4
    }

    public String getProperty(String s)
    {
        return a.getProperty(s);
    }

    public String getProperty(String s, String s1)
    {
        s = (Properties)b.get(s);
        if (s == null)
        {
            return null;
        } else
        {
            return s.getProperty(s1);
        }
    }

    public void load(InputStream inputstream)
        throws IOException
    {
        StringBuilder stringbuilder1;
        Object obj;
        String s1;
        String s2;
        BufferedReader bufferedreader;
        char ac[];
        int i;
        boolean flag1;
        bufferedreader = new BufferedReader(new InputStreamReader(inputstream, "utf-8"));
        ac = new char[4096];
        i = bufferedreader.read(ac, 0, 4096);
        obj = b.a;
        flag1 = false;
        s1 = null;
        s2 = null;
        stringbuilder1 = new StringBuilder();
_L6:
        int j;
        if (i < 0)
        {
            if (stringbuilder1.length() > 0)
            {
                inputstream = stringbuilder1.toString().trim();
                new StringBuilder();
                if (s2 != null)
                {
                    if (s1 != null)
                    {
                        break MISSING_BLOCK_LABEL_713;
                    }
                    setProperty(s2, inputstream);
                }
            }
            return;
        }
        j = 0;
_L2:
        char c;
        StringBuilder stringbuilder;
        String s;
        String s3;
        boolean flag;
label0:
        {
            if (j >= i)
            {
                i = bufferedreader.read(ac, 0, 4096);
                continue; /* Loop/switch isn't completed */
            }
            c = ac[j];
            inputstream = ((InputStream) (obj));
            if (obj == b.d)
            {
                if (c != '\r')
                {
                    stringbuilder = stringbuilder1;
                    s = s2;
                    s3 = s1;
                    flag = flag1;
                    inputstream = ((InputStream) (obj));
                    if (c != '\n')
                    {
                        break label0;
                    }
                }
                inputstream = b.a;
            }
            if (inputstream != b.b)
            {
                break; /* Loop/switch isn't completed */
            }
            stringbuilder1.append(c);
            if (c == '\r')
            {
                inputstream = b.c;
                flag = flag1;
                s3 = s1;
                s = s2;
                stringbuilder = stringbuilder1;
            } else
            {
                inputstream = b.a;
                stringbuilder = stringbuilder1;
                s = s2;
                s3 = s1;
                flag = flag1;
            }
        }
_L4:
        j++;
        stringbuilder1 = stringbuilder;
        s2 = s;
        s1 = s3;
        flag1 = flag;
        obj = inputstream;
        if (true) goto _L2; else goto _L1
_L1:
        switch (c)
        {
        default:
            stringbuilder1.append(c);
            stringbuilder = stringbuilder1;
            s = s2;
            s3 = s1;
            flag = flag1;
            break;

        case 91: // '['
            stringbuilder = new StringBuilder();
            flag = true;
            s = s2;
            s3 = s1;
            break;

        case 93: // ']'
            if (flag1)
            {
                s3 = stringbuilder1.toString().trim();
                stringbuilder = new StringBuilder();
                b.put(s3, new Properties());
                flag = false;
                s = s2;
            } else
            {
                stringbuilder1.append(c);
                stringbuilder = stringbuilder1;
                s = s2;
                s3 = s1;
                flag = flag1;
            }
            break;

        case 92: // '\\'
            inputstream = b.b;
            stringbuilder = stringbuilder1;
            s = s2;
            s3 = s1;
            flag = flag1;
            break;

        case 35: // '#'
        case 59: // ';'
            inputstream = b.d;
            stringbuilder = stringbuilder1;
            s = s2;
            s3 = s1;
            flag = flag1;
            break;

        case 58: // ':'
        case 61: // '='
            if (s2 == null)
            {
                s = stringbuilder1.toString().trim();
                stringbuilder = new StringBuilder();
                s3 = s1;
                flag = flag1;
            } else
            {
                stringbuilder1.append(c);
                stringbuilder = stringbuilder1;
                s = s2;
                s3 = s1;
                flag = flag1;
            }
            break;

        case 10: // '\n'
        case 13: // '\r'
            if (inputstream == b.c && c == '\n')
            {
                stringbuilder1.append(c);
                inputstream = b.a;
                stringbuilder = stringbuilder1;
                s = s2;
                s3 = s1;
                flag = flag1;
            } else
            {
                stringbuilder = stringbuilder1;
                if (stringbuilder1.length() > 0)
                {
                    s = stringbuilder1.toString().trim();
                    stringbuilder1 = new StringBuilder();
                    stringbuilder = stringbuilder1;
                    if (s2 != null)
                    {
                        if (s1 == null)
                        {
                            setProperty(s2, s);
                            stringbuilder = stringbuilder1;
                        } else
                        {
                            setProperty(s1, s2, s);
                            stringbuilder = stringbuilder1;
                        }
                    }
                }
                s = null;
                s3 = s1;
                flag = flag1;
            }
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
        setProperty(s1, s2, inputstream);
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Iterator properties()
    {
        return new a(a.propertyNames());
    }

    public Iterator properties(String s)
    {
        s = (Properties)b.get(s);
        if (s == null)
        {
            return null;
        } else
        {
            return new a(s.propertyNames());
        }
    }

    public Iterator sections()
    {
        return b.keySet().iterator();
    }

    public void setProperty(String s, String s1)
    {
        a.setProperty(s, s1);
    }

    public void setProperty(String s, String s1, String s2)
    {
        Properties properties2 = (Properties)b.get(s);
        Properties properties1 = properties2;
        if (properties2 == null)
        {
            properties1 = new Properties();
            b.put(s, properties1);
        }
        properties1.setProperty(s1, s2);
    }
}
