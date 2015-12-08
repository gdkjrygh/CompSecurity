// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.WeakReference;
import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.WeakHashMap;

final class amo
{

    private static final amo n[] = new amo[64];
    private static WeakHashMap o = new WeakHashMap();
    final String a[];
    final String b[];
    final String c[];
    final String d[];
    final String e[];
    final String f[];
    final TreeMap g;
    final TreeMap h;
    final TreeMap i;
    final int j;
    final int k;
    final int l;
    final int m;
    private final WeakReference p;

    private amo(Locale locale)
    {
        p = new WeakReference(locale);
        DateFormatSymbols dateformatsymbols = alv.a(locale);
        a = dateformatsymbols.getEras();
        b = b(dateformatsymbols.getWeekdays());
        c = b(dateformatsymbols.getShortWeekdays());
        d = a(dateformatsymbols.getMonths());
        e = a(dateformatsymbols.getShortMonths());
        f = dateformatsymbols.getAmPmStrings();
        Integer ainteger[] = new Integer[13];
        for (int i1 = 0; i1 < 13; i1++)
        {
            ainteger[i1] = Integer.valueOf(i1);
        }

        g = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        a(g, a, ainteger);
        if ("en".equals(locale.getLanguage()))
        {
            g.put("BCE", ainteger[0]);
            g.put("CE", ainteger[1]);
        }
        h = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        a(h, b, ainteger);
        a(h, c, ainteger);
        a(h, 7, ainteger);
        i = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        a(i, d, ainteger);
        a(i, e, ainteger);
        a(i, 12, ainteger);
        j = c(a);
        k = c(b);
        c(c);
        l = c(d);
        c(e);
        m = c(f);
    }

    public static amo a(Locale locale)
    {
        Locale locale1;
        int i1;
        locale1 = locale;
        if (locale == null)
        {
            locale1 = Locale.getDefault();
        }
        i1 = System.identityHashCode(locale1) & 0x3f;
        locale = n[i1];
        if (locale != null && ((amo) (locale)).p.get() == locale1)
        {
            return locale;
        }
        WeakHashMap weakhashmap = o;
        weakhashmap;
        JVM INSTR monitorenter ;
        amo amo1 = (amo)o.get(locale1);
        locale = amo1;
        if (amo1 != null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        locale = new amo(locale1);
        o.put(locale1, locale);
        weakhashmap;
        JVM INSTR monitorexit ;
        n[i1] = locale;
        return locale;
        locale;
        weakhashmap;
        JVM INSTR monitorexit ;
        throw locale;
    }

    private static void a(TreeMap treemap, int i1, Integer ainteger[])
    {
        for (int j1 = 1; j1 <= i1; j1++)
        {
            treemap.put(String.valueOf(j1).intern(), ainteger[j1]);
        }

    }

    private static void a(TreeMap treemap, String as[], Integer ainteger[])
    {
        int i1 = as.length;
        do
        {
            int j1 = i1 - 1;
            if (j1 < 0)
            {
                break;
            }
            String s = as[j1];
            i1 = j1;
            if (s != null)
            {
                treemap.put(s, ainteger[j1]);
                i1 = j1;
            }
        } while (true);
    }

    private static String[] a(String as[])
    {
        String as1[] = new String[13];
        for (int i1 = 1; i1 < 13; i1++)
        {
            as1[i1] = as[i1 - 1];
        }

        return as1;
    }

    private static String[] b(String as[])
    {
        String as1[] = new String[8];
        int i1 = 1;
        while (i1 < 8) 
        {
            int j1;
            if (i1 < 7)
            {
                j1 = i1 + 1;
            } else
            {
                j1 = 1;
            }
            as1[i1] = as[j1];
            i1++;
        }
        return as1;
    }

    private static int c(String as[])
    {
        int i1 = 0;
        int j1 = as.length;
        do
        {
            j1--;
            if (j1 < 0)
            {
                break;
            }
            String s = as[j1];
            if (s != null)
            {
                int k1 = s.length();
                if (k1 > i1)
                {
                    i1 = k1;
                }
            }
        } while (true);
        return i1;
    }

}
