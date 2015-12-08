// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class bU extends SimpleDateFormat
{

    private static final String a = com/paypal/android/sdk/bU.getSimpleName();
    private static final long serialVersionUID = 0x4f3cb2c27f436bffL;

    public bU()
    {
        this(TimeZone.getTimeZone("UTC"));
    }

    private bU(TimeZone timezone)
    {
        super("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
        setTimeZone(timezone);
    }

    public static Date a(String s)
    {
        int i;
        if (s == null)
        {
            return null;
        }
        i = 0;
_L3:
        if (i >= 4) goto _L2; else goto _L1
_L1:
        String s1;
        Object obj;
        s1 = (new String[] {
            "yyyy-MM-dd'T'HH:mm:ssZ", "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ss'Z'"
        })[i];
        obj = new SimpleDateFormat(s1, Locale.US);
        ((SimpleDateFormat) (obj)).setLenient(true);
        obj = ((SimpleDateFormat) (obj)).parse(s);
        if (obj != null)
        {
            return ((Date) (obj));
        }
        continue; /* Loop/switch isn't completed */
        ParseException parseexception;
        parseexception;
        (new StringBuilder("unsuccessful attempt to parse date '")).append(s).append("': ").append(parseexception.getMessage()).append(" while using format:'").append(s1).append("'");
        i++;
          goto _L3
_L2:
        (new StringBuilder("couldn't parse '")).append(s).append("'");
        return null;
    }

}
