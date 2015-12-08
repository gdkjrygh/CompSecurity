// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package me.lyft.android.ui.payment.cardinput:
//            ZipCodeFormat

public class ZipCodeFormatRegistry
{

    private static Map formats = initFormats();

    public ZipCodeFormatRegistry()
    {
    }

    public static ZipCodeFormat getZipCodeFormat(String s)
    {
        s = (ZipCodeFormat)formats.get(s);
        if (s != null)
        {
            return s;
        } else
        {
            return new USZipFormat();
        }
    }

    private static Map initFormats()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("en_US", new USZipFormat());
        hashmap.put("en_CA", new CanadaZipFormat());
        return hashmap;
    }


    private class USZipFormat extends ZipCodeFormat
    {

        public USZipFormat()
        {
            super(5, true, 0x7f020155);
        }
    }


    private class CanadaZipFormat extends ZipCodeFormat
    {

        public CanadaZipFormat()
        {
            super(6, false, 0x7f020154);
        }
    }

}
