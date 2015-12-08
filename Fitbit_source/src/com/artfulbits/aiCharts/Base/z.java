// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            v, ChartSeries, j, l

final class z
{
    static final class a
    {

        final int a;
        final int b;
        final String c;
        Format d;

        public a(int i, int k, String s)
        {
            d = null;
            a = i;
            b = k;
            c = s;
        }

        public a(String s)
        {
            d = null;
            a = 0;
            b = 0;
            c = s;
        }
    }


    private static final Hashtable b;
    private static final SimpleDateFormat c = new SimpleDateFormat();
    public final String a;
    private a d[];

    public z(String s)
    {
        a = s;
        int i = 0;
        int i1 = s.length();
        ArrayList arraylist = new ArrayList();
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            if (i >= i1)
            {
                break;
            }
            int k = i + 1;
            char c1 = s.charAt(i);
            if (c1 == '\'')
            {
                i = k + 1;
                c1 = s.charAt(k);
                if (c1 == '\'')
                {
                    stringbuilder.append('\'');
                    continue;
                }
                do
                {
                    k = i;
                    if (c1 == '\'')
                    {
                        break;
                    }
                    k = i;
                    if (i >= i1)
                    {
                        break;
                    }
                    stringbuilder.append(c1);
                    c1 = s.charAt(i);
                    i++;
                } while (true);
            } else
            {
                if (c1 == '{')
                {
                    arraylist.add(new a(stringbuilder.toString()));
                    stringbuilder = new StringBuilder();
                    i = k + 1;
                    for (c1 = s.charAt(k); c1 != '}';)
                    {
                        if (i >= i1)
                        {
                            throw new IllegalArgumentException("Missing element format");
                        }
                        stringbuilder.append(c1);
                        c1 = s.charAt(i);
                        i++;
                    }

                    arraylist.add(a(stringbuilder.toString()));
                    stringbuilder = new StringBuilder();
                    continue;
                }
                stringbuilder.append(c1);
            }
            i = k;
        } while (true);
        if (stringbuilder.length() != 0)
        {
            arraylist.add(new a(stringbuilder.toString()));
        }
        d = (a[])arraylist.toArray(new a[arraylist.size()]);
    }

    protected static double a(double d1)
    {
        if (d1 == 0.0D)
        {
            return 0.0D;
        }
        if (Math.abs(d1) >= 1.0D)
        {
            return Math.ceil(d1 * 100D) / 100D;
        } else
        {
            return v.a(d1, 2);
        }
    }

    private static a a(String s)
    {
        Object obj1 = null;
        String s1 = null;
        int i = 0;
        Iterator iterator = b.keySet().iterator();
        Object obj;
        do
        {
            obj = obj1;
            if (!iterator.hasNext())
            {
                break;
            }
            String s2 = (String)iterator.next();
            if (!s.startsWith(s2))
            {
                continue;
            }
            int k = s.indexOf(',');
            obj = s;
            if (k >= 0)
            {
                s1 = s.substring(k + 1);
                obj = s.substring(0, k);
            }
            if (((String) (obj)).length() > s2.length())
            {
                i = Integer.parseInt(((String) (obj)).substring(s2.length()));
            }
            obj = new a(((Integer)b.get(s2)).intValue(), i, s1);
            break;
        } while (true);
        return ((a) (obj));
    }

    private static void a(StringBuilder stringbuilder, double d1, a a1)
    {
        if (a1.c == null)
        {
            stringbuilder.append(a(d1));
            return;
        }
        if (a1.d == null)
        {
            a1.d = new DecimalFormat(a1.c);
        }
        stringbuilder.append(a1.d.format(Double.valueOf(d1)));
    }

    public final String a(ChartSeries chartseries)
    {
        StringBuilder stringbuilder;
        a aa[];
        int i;
        int k;
        stringbuilder = new StringBuilder();
        aa = d;
        k = aa.length;
        i = 0;
_L7:
        a a1;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        a1 = aa[i];
        a1.a;
        JVM INSTR lookupswitch 4: default 80
    //                   0: 89
    //                   1: 114
    //                   5: 102
    //                   12: 126;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_126;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L8:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        stringbuilder.append(a1.c);
          goto _L8
_L4:
        stringbuilder.append(chartseries.a());
          goto _L8
_L3:
        stringbuilder.append(chartseries.x());
          goto _L8
        if (chartseries.h() != null)
        {
            stringbuilder.append(chartseries.h().toString());
        }
          goto _L8
        return stringbuilder.toString();
    }

    public final String a(j j1)
    {
        StringBuilder stringbuilder;
        a aa[];
        int i;
        int k;
        stringbuilder = new StringBuilder();
        aa = d;
        k = aa.length;
        i = 0;
_L13:
        a a1;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        a1 = aa[i];
        a1.a;
        JVM INSTR tableswitch 0 12: default 108
    //                   0 117
    //                   1 131
    //                   2 144
    //                   3 158
    //                   4 238
    //                   5 257
    //                   6 273
    //                   7 293
    //                   8 306
    //                   9 108
    //                   10 108
    //                   11 108
    //                   12 345;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L1 _L1 _L1 _L11
_L11:
        break MISSING_BLOCK_LABEL_345;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L14:
        i++;
        if (true) goto _L13; else goto _L12
_L12:
        stringbuilder.append(a1.c);
          goto _L14
_L3:
        stringbuilder.append(j1.x());
          goto _L14
_L4:
        a(stringbuilder, j1.a(), a1);
          goto _L14
_L5:
        double d1 = j1.a();
        if (a1.c == null)
        {
            stringbuilder.append(c.format(Long.valueOf((long)d1)));
        } else
        {
            if (a1.d == null)
            {
                a1.d = new SimpleDateFormat(a1.c);
            }
            stringbuilder.append(a1.d.format(Long.valueOf((long)d1)));
        }
          goto _L14
_L6:
        a(stringbuilder, j1.a(a1.b), a1);
          goto _L14
_L7:
        stringbuilder.append(j1.c().a());
          goto _L14
_L8:
        stringbuilder.append(j1.c().F().a(j1));
          goto _L14
_L9:
        stringbuilder.append(j1.d());
          goto _L14
_L10:
        a(stringbuilder, (100D * j1.a(a1.b)) / j1.c().F().d(a1.b), a1);
          goto _L14
        if (j1.h() != null)
        {
            stringbuilder.append(j1.h().toString());
        }
          goto _L14
        return stringbuilder.toString();
    }

    public final String a(Object obj)
    {
        a aa[];
        int i;
        int k;
        if (obj instanceof j)
        {
            return a((j)obj);
        }
        if (obj instanceof ChartSeries)
        {
            return a((ChartSeries)obj);
        }
        obj = new StringBuilder();
        aa = d;
        k = aa.length;
        i = 0;
_L6:
        if (i >= k) goto _L2; else goto _L1
_L1:
        a a1 = aa[i];
        a1.a;
        JVM INSTR tableswitch 0 0: default 88
    //                   0 97;
           goto _L3 _L4
_L3:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        ((StringBuilder) (obj)).append(a1.c);
        if (true) goto _L3; else goto _L2
_L2:
        return ((StringBuilder) (obj)).toString();
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        b = new Hashtable();
        b.put("LABEL", Integer.valueOf(1));
        b.put("XVALUE", Integer.valueOf(2));
        b.put("YVALUE", Integer.valueOf(4));
        b.put("SERIESNAME", Integer.valueOf(5));
        b.put("XDATE", Integer.valueOf(3));
        b.put("INDEX", Integer.valueOf(6));
        b.put("AXISLABEL", Integer.valueOf(7));
        b.put("PERCENT", Integer.valueOf(8));
        b.put("AVERAGE", Integer.valueOf(9));
        b.put("MIN", Integer.valueOf(10));
        b.put("MAX", Integer.valueOf(11));
        b.put("TAG", Integer.valueOf(12));
    }
}
