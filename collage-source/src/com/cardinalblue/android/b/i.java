// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.apache.http.message.BasicNameValuePair;

public class i
{

    public i()
    {
    }

    public static String a(int j)
    {
        if (j <= 0)
        {
            return "0";
        }
        String as[] = new String[5];
        as[0] = "";
        as[1] = "K";
        as[2] = "M";
        as[3] = "B";
        as[4] = "T";
        DecimalFormat decimalformat = new DecimalFormat("###0");
        int k = (int)(Math.log10(j / 10) / 3D);
        if (k <= 0)
        {
            return decimalformat.format(j);
        }
        if (k >= as.length)
        {
            return (new DecimalFormatSymbols()).getInfinity();
        }
        double d = (double)j / Math.pow(1000D, k);
        if (d < 100D)
        {
            decimalformat = new DecimalFormat("##0.0");
        }
        decimalformat.setRoundingMode(RoundingMode.FLOOR);
        return (new StringBuilder()).append(decimalformat.format(d)).append(as[k]).toString();
    }

    public static String a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(s.substring(0, 1).toUpperCase(Locale.getDefault())).append(s.substring(1)).toString();
        }
    }

    public static String a(String s, int j)
    {
        if (s.length() <= j)
        {
            return s;
        } else
        {
            return s.substring(0, j);
        }
    }

    public static String a(Collection collection, String s)
    {
        if (collection == null)
        {
            throw new IllegalArgumentException("strings cannot be null.");
        } else
        {
            String as[] = new String[collection.size()];
            collection.toArray(as);
            return a(as, s);
        }
    }

    public static String a(String as[], String s)
    {
        if (as == null)
        {
            throw new IllegalArgumentException("strings cannot be null.");
        }
        s = new StringBuilder();
        int k = as.length;
        for (int j = 0; j < k; j++)
        {
            s.append(as[j]).append(",");
        }

        if (s.length() > 0)
        {
            s.deleteCharAt(s.length() - 1);
        }
        return s.toString();
    }

    public static transient List a(String as[])
    {
        ArrayList arraylist = new ArrayList();
        if (as == null)
        {
            return arraylist;
        }
        if (as.length >= 2)
        {
            for (int j = 0; j < as.length; j += 2)
            {
                arraylist.add(new BasicNameValuePair(as[j], as[j + 1]));
            }

        }
        return arraylist;
    }
}
