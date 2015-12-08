// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import com.artfulbits.aiCharts.Base.q;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            e, l, b, ChartLineType, 
//            g, ChartPieType, j, i, 
//            c, a, k, o, 
//            n, w, v, u, 
//            t, s, r, h, 
//            ChartHiLoOpenCloseType, d, q, p, 
//            ChartFunnelType, ChartPyramidType, m, f

public final class x
{

    public static final String A = "StepLine";
    public static final Class B = com/artfulbits/aiCharts/Types/w;
    public static final String C = "StepArea";
    public static final Class D = com/artfulbits/aiCharts/Types/v;
    public static final String E = "StackedColumn";
    public static final Class F = com/artfulbits/aiCharts/Types/u;
    public static final String G = "StackedColumn100";
    public static final Class H = com/artfulbits/aiCharts/Types/t;
    public static final String I = "StackedBar";
    public static final Class J = com/artfulbits/aiCharts/Types/s;
    public static final String K = "StackedBar100";
    public static final Class L = com/artfulbits/aiCharts/Types/r;
    public static final String M = "HiLo";
    public static final Class N = com/artfulbits/aiCharts/Types/h;
    public static final String O = "HiLoOpenClose";
    public static final Class P = com/artfulbits/aiCharts/Types/ChartHiLoOpenCloseType;
    public static final String Q = "CandleStick";
    public static final Class R = com/artfulbits/aiCharts/Types/d;
    public static final String S = "StackedArea";
    public static final Class T = com/artfulbits/aiCharts/Types/q;
    public static final String U = "StackedArea100";
    public static final Class V = com/artfulbits/aiCharts/Types/p;
    public static final String W = "Funnel";
    public static final Class X = com/artfulbits/aiCharts/Types/ChartFunnelType;
    public static final String Y = "Pyramid";
    public static final Class Z = com/artfulbits/aiCharts/Types/ChartPyramidType;
    public static final String a = "Column";
    public static final String aa = "Rose";
    public static final Class ab = com/artfulbits/aiCharts/Types/m;
    public static final String ac = "Doughnut";
    public static final Class ad = com/artfulbits/aiCharts/Types/f;
    private static final Hashtable ae;
    private static final WeakHashMap af = new WeakHashMap();
    public static final Class b = com/artfulbits/aiCharts/Types/e;
    public static final String c = "RangeColumn";
    public static final Class d = com/artfulbits/aiCharts/Types/l;
    public static final String e = "Bar";
    public static final Class f = com/artfulbits/aiCharts/Types/b;
    public static final String g = "Line";
    public static final Class h = com/artfulbits/aiCharts/Types/ChartLineType;
    public static final String i = "FastLine";
    public static final Class j = com/artfulbits/aiCharts/Types/g;
    public static final String k = "Pie";
    public static final Class l = com/artfulbits/aiCharts/Types/ChartPieType;
    public static final String m = "Polar";
    public static final Class n = com/artfulbits/aiCharts/Types/j;
    public static final String o = "Point";
    public static final Class p = com/artfulbits/aiCharts/Types/i;
    public static final String q = "Bubble";
    public static final Class r = com/artfulbits/aiCharts/Types/c;
    public static final String s = "Area";
    public static final Class t = com/artfulbits/aiCharts/Types/a;
    public static final String u = "RangeArea";
    public static final Class v = com/artfulbits/aiCharts/Types/k;
    public static final String w = "Spline";
    public static final Class x = com/artfulbits/aiCharts/Types/o;
    public static final String y = "SplineArea";
    public static final Class z = com/artfulbits/aiCharts/Types/n;

    public x()
    {
    }

    public static q a(String s1)
    {
        if (ae.containsKey(s1))
        {
            return b((Class)ae.get(s1));
        } else
        {
            return null;
        }
    }

    public static String a(Class class1)
    {
        for (Iterator iterator = ae.keySet().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            if (ae.get(s1) == class1)
            {
                return s1;
            }
        }

        return class1.getName();
    }

    public static Class[] a()
    {
        Class aclass[] = new Class[ae.size()];
        return (Class[])ae.values().toArray(aclass);
    }

    public static q b(Class class1)
    {
        if (af.containsKey(class1))
        {
            return (q)af.get(class1);
        }
        q q1;
        try
        {
            q1 = (q)class1.newInstance();
            af.put(class1, q1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new RuntimeException(class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new RuntimeException(class1);
        }
        return q1;
    }

    public static String[] b()
    {
        return (String[])ae.keySet().toArray(new String[0]);
    }

    public static q c()
    {
        return b(b);
    }

    static 
    {
        ae = new Hashtable();
        ae.put("Column", com/artfulbits/aiCharts/Types/e);
        ae.put("Bar", com/artfulbits/aiCharts/Types/b);
        ae.put("Line", com/artfulbits/aiCharts/Types/ChartLineType);
        ae.put("FastLine", com/artfulbits/aiCharts/Types/g);
        ae.put("Pie", com/artfulbits/aiCharts/Types/ChartPieType);
        ae.put("Polar", com/artfulbits/aiCharts/Types/j);
        ae.put("Point", com/artfulbits/aiCharts/Types/i);
        ae.put("Bubble", com/artfulbits/aiCharts/Types/c);
        ae.put("Area", com/artfulbits/aiCharts/Types/a);
        ae.put("Spline", com/artfulbits/aiCharts/Types/o);
        ae.put("SplineArea", com/artfulbits/aiCharts/Types/n);
        ae.put("StepLine", com/artfulbits/aiCharts/Types/w);
        ae.put("StackedColumn", com/artfulbits/aiCharts/Types/u);
        ae.put("StackedColumn100", com/artfulbits/aiCharts/Types/t);
        ae.put("StackedBar", com/artfulbits/aiCharts/Types/s);
        ae.put("StackedBar100", com/artfulbits/aiCharts/Types/r);
        ae.put("HiLo", com/artfulbits/aiCharts/Types/h);
        ae.put("HiLoOpenClose", com/artfulbits/aiCharts/Types/ChartHiLoOpenCloseType);
        ae.put("CandleStick", com/artfulbits/aiCharts/Types/d);
        ae.put("StackedArea", com/artfulbits/aiCharts/Types/q);
        ae.put("StackedArea100", com/artfulbits/aiCharts/Types/p);
        ae.put("Funnel", com/artfulbits/aiCharts/Types/ChartFunnelType);
        ae.put("Pyramid", com/artfulbits/aiCharts/Types/ChartPyramidType);
        ae.put("RangeColumn", com/artfulbits/aiCharts/Types/l);
        ae.put("RangeArea", com/artfulbits/aiCharts/Types/k);
        ae.put("StepArea", com/artfulbits/aiCharts/Types/v);
        ae.put("Doughnut", com/artfulbits/aiCharts/Types/f);
        ae.put("Rose", com/artfulbits/aiCharts/Types/m);
    }
}
