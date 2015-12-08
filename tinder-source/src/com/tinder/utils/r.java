// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.support.v4.g.a;
import com.a.a.a.a.f;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class r
{

    public static final Pattern a = Pattern.compile("^plus_subscription.*$");
    public static final Pattern b = Pattern.compile("^.*_(\\d+)m$");
    private static a c = null;

    public static f a(List list)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        obj = obj2;
        if (list == null) goto _L2; else goto _L1
_L1:
        if (!list.isEmpty()) goto _L4; else goto _L3
_L3:
        obj = obj2;
_L2:
        return ((f) (obj));
_L4:
        int i = 0;
        Iterator iterator = list.iterator();
        list = obj1;
        do
        {
            obj = list;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (f)iterator.next();
            int j = b(((f) (obj)).a);
            if (j > i)
            {
                list = ((List) (obj));
                i = j;
            }
        } while (true);
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static String a(BigDecimal bigdecimal, String s)
    {
        (new StringBuilder("Formatting ")).append(bigdecimal.toPlainString()).append(" into currency type: ").append(s);
        NumberFormat numberformat = NumberFormat.getCurrencyInstance();
        numberformat.setCurrency(Currency.getInstance(s));
        numberformat.setMinimumFractionDigits(2);
        return numberformat.format(bigdecimal.floatValue());
    }

    public static boolean a(String s)
    {
        return a.matcher(s).matches();
    }

    public static int b(String s)
    {
        boolean flag = true;
        Matcher matcher;
        int i;
        if (c == null)
        {
            c = new a((byte)0);
        } else
        if (c.containsKey(s))
        {
            return ((Integer)c.get(s)).intValue();
        }
        matcher = b.matcher(s);
        i = ((flag) ? 1 : 0);
        if (matcher.matches())
        {
            i = ((flag) ? 1 : 0);
            if (matcher.groupCount() == 1)
            {
                i = Integer.parseInt(matcher.group(1));
            }
        }
        c.put(s, Integer.valueOf(i));
        return i;
    }

    public static f b(List list)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        obj = obj2;
        if (list == null) goto _L2; else goto _L1
_L1:
        if (!list.isEmpty()) goto _L4; else goto _L3
_L3:
        obj = obj2;
_L2:
        return ((f) (obj));
_L4:
        Iterator iterator = list.iterator();
        list = obj1;
        do
        {
            obj = list;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (f)iterator.next();
            if (b(((f) (obj)).a) == 1)
            {
                list = ((List) (obj));
            }
        } while (true);
        if (true) goto _L2; else goto _L5
_L5:
    }

}
