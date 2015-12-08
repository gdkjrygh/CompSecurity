// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.text.format.DateFormat;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.r;
import kik.a.h.j;
import kik.android.chat.KikApplication;

public final class cq
{
    public static final class a
    {

        public String a;
        public int b;

        public a()
        {
        }
    }


    private static String a[];
    private static Random b = new Random();

    public static String a()
    {
        String as[] = new String[6];
        as[0] = KikApplication.f(0x7f0900a6);
        as[1] = KikApplication.f(0x7f0900a7);
        as[2] = KikApplication.f(0x7f0900a8);
        as[3] = KikApplication.f(0x7f0900a9);
        as[4] = KikApplication.f(0x7f0900aa);
        as[5] = KikApplication.f(0x7f0900ab);
        a = as;
        return as[b.nextInt(a.length)];
    }

    public static String a(String s)
    {
        Object obj;
        int i;
        try
        {
            obj = MessageDigest.getInstance("MD5");
            ((MessageDigest) (obj)).update(s.getBytes());
            s = ((MessageDigest) (obj)).digest();
            obj = new StringBuffer();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        i = 0;
        if (i >= s.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuffer) (obj)).append(Integer.toHexString(s[i] & 0xff));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_29;
_L1:
        s = ((StringBuffer) (obj)).toString();
        return s;
    }

    public static String a(List list)
    {
        int i = 0;
        if (list.size() == 0)
        {
            return KikApplication.f(0x7f0902b7);
        }
        StringBuilder stringbuilder;
        boolean flag;
        int l;
        if (list.size() > 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder = new StringBuilder(list.size() * 7);
        l = list.size();
        while (i < l) 
        {
            String s = (String)list.get(i);
            if (stringbuilder.length() > 0)
            {
                if (flag || i < l - 1)
                {
                    stringbuilder.append(", ");
                } else
                {
                    stringbuilder.append(' ');
                }
                if (i == l - 1)
                {
                    stringbuilder.append("and ");
                }
            }
            stringbuilder.append(s);
            i++;
        }
        return stringbuilder.toString();
    }

    public static String a(List list, r r1)
    {
        if (list == null || list.size() == 0)
        {
            return KikApplication.f(0x7f0902b7);
        }
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(a(r1.a((String)list.next(), true)))) { }
        return a(((List) (arraylist)));
    }

    public static String a(List list, r r1, int i)
    {
        if (list == null || list.size() == 0)
        {
            return KikApplication.f(0x7f0902b7);
        }
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = list.iterator();
        int l = 0;
label0:
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                String s = (String)iterator.next();
                stringbuilder.append((new StringBuilder()).append(a(r1.a(s, true))).append(", ").toString());
            } while (i <= 0);
            l++;
        } while (l < i);
        if (stringbuilder.length() > 1)
        {
            stringbuilder.replace(stringbuilder.length() - 2, stringbuilder.length(), "");
        }
        if (i > 0 && list.size() > i)
        {
            stringbuilder.append("...");
        }
        return stringbuilder.toString();
    }

    public static String a(k k1)
    {
        if (k1.c() == null)
        {
            k1 = KikApplication.f(0x7f090202);
        } else
        {
            k1 = k1.c();
        }
        return b(k1);
    }

    public static String a(n n1, r r1)
    {
label0:
        {
            String s1 = n1.c();
            String s = s1;
            if (c(s1))
            {
                String s2 = r1.a(n1.b(), false).c();
                s = s2;
                if (c(s2))
                {
                    if (!n1.I())
                    {
                        break label0;
                    }
                    s = n1.J();
                }
            }
            return s;
        }
        return a(n1.w(), r1, -1);
    }

    public static String a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        int l = abyte0.length;
        for (int i = 0; i < l; i++)
        {
            byte byte0 = abyte0[i];
            stringbuilder.append("0123456789abcdef".charAt((byte0 & 0xf0) >> 4)).append("0123456789abcdef".charAt(byte0 & 0xf));
        }

        return stringbuilder.toString();
    }

    public static a a(long l, boolean flag)
    {
        a a1 = new a();
        a1.b = 0;
        long l1 = j.b() - l;
        if (l1 <= 0x1d4c0L)
        {
            if (flag)
            {
                a1.a = KikApplication.f(0x7f090197);
            } else
            {
                a1.a = KikApplication.f(0x7f090196);
            }
            return a1;
        }
        if (l1 < 0x36ee80L)
        {
            if (flag)
            {
                a1.a = KikApplication.a(0x7f09036f, new Object[] {
                    Long.valueOf(l1 / 60000L)
                });
            } else
            {
                a1.a = KikApplication.a(0x7f09036e, new Object[] {
                    Long.valueOf(l1 / 60000L)
                });
            }
            return a1;
        }
        if (l1 < 0x1ee62800L)
        {
            String s = (String)DateFormat.format("h:mm aa", l);
            String s2 = (String)DateFormat.format("E", l);
            if (s2.equals(DateFormat.format("E", j.b())))
            {
                if (flag)
                {
                    a1.a = s;
                    return a1;
                } else
                {
                    a1.a = KikApplication.a(0x7f09032e, new Object[] {
                        s
                    });
                    a1.b = a1.a.indexOf(s);
                    return a1;
                }
            }
            if (flag)
            {
                a1.a = s2;
                return a1;
            } else
            {
                a1.a = KikApplication.a(0x7f0900ad, new Object[] {
                    s2, s
                });
                a1.b = a1.a.indexOf(s);
                return a1;
            }
        }
        String s1 = (String)DateFormat.format("M/d/yyyy", l);
        if (flag)
        {
            a1.a = s1;
            return a1;
        } else
        {
            String s3 = (String)DateFormat.format("h:mm aa", l);
            a1.a = KikApplication.a(0x7f0900ad, new Object[] {
                s1, s3
            });
            a1.b = a1.a.indexOf(s3);
            return a1;
        }
    }

    public static String b(String s)
    {
        String s1 = s.trim();
        int i = s1.indexOf(" ");
        s = s1;
        if (i != -1)
        {
            s = s1.substring(0, i);
        }
        return s;
    }

    public static String b(k k1)
    {
        if (k1.c() != null)
        {
            k1 = k1.c().trim();
            int i = k1.indexOf(" ");
            if (i != -1)
            {
                return k1.substring(i + 1);
            }
        }
        return "";
    }

    public static boolean c(String s)
    {
        return s == null || "".equals(s);
    }

}
