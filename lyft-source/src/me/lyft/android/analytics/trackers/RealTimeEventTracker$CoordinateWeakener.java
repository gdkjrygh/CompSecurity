// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

class 
{

    private static final DecimalFormat COORDINATE_FORMAT;

    private static Double weaken(Double double1)
    {
        if (double1 != null)
        {
            return Double.valueOf(COORDINATE_FORMAT.format(double1));
        } else
        {
            return null;
        }
    }

    static 
    {
        DecimalFormatSymbols decimalformatsymbols = new DecimalFormatSymbols(Locale.US);
        decimalformatsymbols.setDecimalSeparator('.');
        COORDINATE_FORMAT = new DecimalFormat("0.##", decimalformatsymbols);
    }


    private ()
    {
    }
}
