// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.a.a.b.b;

public final class i
{

    private static final b a;
    private static final b b;
    private static final b c;
    private static final b d;
    private static final b e;
    private static final b f;
    private static final List g;
    private static Random h = new Random();
    private static StringBuffer i = new StringBuffer();

    public static int a(String s, String s1)
    {
        String s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return s2.compareTo(s);
    }

    public static String a()
    {
        StringBuffer stringbuffer = i;
        stringbuffer;
        JVM INSTR monitorenter ;
        String s1;
        i.setLength(0);
        s1 = Integer.toString(h.nextInt(), 16);
        String s = s1;
        if (s1.startsWith("-"))
        {
            s = s1.substring(1);
        }
        i.append(a(s, 8));
        i.append('-');
        i.append(a(Integer.toString(h.nextInt() & 0xffff, 16), 4));
        i.append('-');
        i.append(a(Integer.toString(h.nextInt() & 0xffff, 16), 4));
        i.append('-');
        i.append(a(Integer.toString(h.nextInt() & 0xffff, 16), 4));
        i.append('-');
        s1 = Long.toString(h.nextLong(), 16);
        s = s1;
        if (s1.startsWith("-"))
        {
            s = s1.substring(1);
        }
        i.append(a(s, 12).substring(0, 12));
        s = i.toString();
        stringbuffer;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        stringbuffer;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String a(long l)
    {
        NumberFormat numberformat = NumberFormat.getNumberInstance();
        numberformat.setMaximumFractionDigits(1);
        if (l < 500L)
        {
            return (new StringBuilder()).append(numberformat.format(l)).append("B").toString();
        }
        if (l < 0x7d000L)
        {
            numberformat.setMaximumFractionDigits(0);
            return (new StringBuilder()).append(numberformat.format(((double)l * 1.0D) / 1024D)).append("KB").toString();
        }
        if (l < 0x1f400000L)
        {
            return (new StringBuilder()).append(numberformat.format(((double)l * 1.0D) / 1024D / 1024D)).append("MB").toString();
        } else
        {
            return (new StringBuilder()).append(numberformat.format(((double)l * 1.0D) / 1024D / 1024D / 1024D)).append("GB").toString();
        }
    }

    private static String a(String s, int j)
    {
        for (; s.length() < j; s = (new StringBuilder("0")).append(s).toString()) { }
        return s;
    }

    public static String a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer(abyte0.length * 2);
        for (int j = 0; j < abyte0.length; j++)
        {
            byte byte0 = abyte0[j];
            stringbuffer.append("0123456789abcdef".charAt((byte0 & 0xf0) >> 4)).append("0123456789abcdef".charAt(byte0 & 0xf));
        }

        return stringbuffer.toString();
    }

    public static boolean a(CharSequence charsequence)
    {
        return charsequence == null || "".equals(charsequence);
    }

    public static byte[] a(String s)
    {
        byte abyte0[] = new byte[s.length() / 2 + s.length() % 2];
        for (int j = 0; j < s.length(); j += 2)
        {
            abyte0[j / 2] = (byte)Integer.parseInt(s.substring(j, Math.min(s.length(), j + 2)), 16);
        }

        return abyte0;
    }

    public static int b(String s)
    {
        int j = 1000;
        if (s != null)
        {
            try
            {
                j = Integer.parseInt(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return 1000;
            }
        }
        return j;
    }

    public static String c(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            s1 = s;
            if (s.length() > 255)
            {
                return s.substring(0, 255);
            }
        }
        return s1;
    }

    public static String d(String s)
    {
        while (s == null || 10 > e(s)) 
        {
            return null;
        }
        return s.substring(s.offsetByCodePoints(0, 0), s.offsetByCodePoints(0, 10));
    }

    public static int e(String s)
    {
        return s.codePointCount(0, s.length());
    }

    public static int f(String s)
    {
        int j = 0;
        int k;
        int l;
        for (k = 0; j < s.length(); k = l)
        {
            int i1 = s.codePointAt(j);
            Iterator iterator = g.iterator();
            do
            {
                l = k;
                if (!iterator.hasNext())
                {
                    break;
                }
                if (!((b)iterator.next()).a(Integer.valueOf(i1)))
                {
                    continue;
                }
                l = k + 1;
                break;
            } while (true);
            j = Character.charCount(i1) + j;
        }

        return k;
    }

    static 
    {
        a = org.a.a.b.b.a(Integer.valueOf(0x1f600), Integer.valueOf(0x1f64f));
        b = org.a.a.b.b.a(Integer.valueOf(9986), Integer.valueOf(10160));
        c = org.a.a.b.b.a(Integer.valueOf(0x1f680), Integer.valueOf(0x1f6c0));
        d = org.a.a.b.b.a(Integer.valueOf(0x1f170), Integer.valueOf(0x1f251));
        e = org.a.a.b.b.a(Integer.valueOf(0x1f600), Integer.valueOf(0x1f636));
        f = org.a.a.b.b.a(Integer.valueOf(0x1f300), Integer.valueOf(0x1f5ff));
        g = Arrays.asList(new b[] {
            a, b, c, d, e, f
        });
    }
}
