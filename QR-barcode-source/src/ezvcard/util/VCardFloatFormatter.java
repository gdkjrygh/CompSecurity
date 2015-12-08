// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class VCardFloatFormatter extends DecimalFormat
{

    public VCardFloatFormatter()
    {
        this(6);
    }

    public VCardFloatFormatter(int i)
    {
        setMaximumFractionDigits(i);
        if (i > 0)
        {
            setMinimumFractionDigits(1);
        }
        DecimalFormatSymbols decimalformatsymbols = new DecimalFormatSymbols();
        decimalformatsymbols.setDecimalSeparator('.');
        decimalformatsymbols.setMinusSign('-');
        setDecimalFormatSymbols(decimalformatsymbols);
    }
}
