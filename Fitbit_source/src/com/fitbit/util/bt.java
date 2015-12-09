// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import com.fitbit.data.domain.r;
import com.fitbit.util.format.e;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Comparator;
import java.util.Locale;

public class bt
{

    public bt()
    {
    }

    public static double a(String s)
    {
        double d;
        try
        {
            d = NumberFormat.getInstance(Locale.getDefault()).parse(s).doubleValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0.0D;
        }
        return d;
    }

    public static String a(double d)
    {
        String s = e.b(d);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s);
        stringbuilder.append(" ");
        stringbuilder.append(r.e().getQuantityDisplayName(s));
        return stringbuilder.toString();
    }

    public static String a(double d, int i)
    {
        DecimalFormat decimalformat = new DecimalFormat();
        decimalformat.setMaximumFractionDigits(i);
        return decimalformat.format(d);
    }

    public static Comparator a()
    {
        return new _cls1();
    }

    /* member class not found */
    class _cls1 {}

}
