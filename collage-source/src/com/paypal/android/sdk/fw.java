// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.math.BigDecimal;
import org.json.JSONArray;
import org.json.JSONObject;

public class fw
{

    private String a;
    private Integer b;
    private BigDecimal c;
    private String d;
    private String e;

    public fw(String s, Integer integer, BigDecimal bigdecimal, String s1, String s2)
    {
        a = s;
        b = integer;
        c = bigdecimal;
        d = s1;
        e = s2;
    }

    public static JSONArray a(fw afw[])
    {
        if (afw != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((JSONArray) (obj));
_L2:
        JSONArray jsonarray = new JSONArray();
        int j = afw.length;
        int i = 0;
        do
        {
            obj = jsonarray;
            if (i >= j)
            {
                continue;
            }
            obj = afw[i];
            JSONObject jsonobject = new JSONObject();
            jsonobject.accumulate("quantity", Integer.toString(((fw) (obj)).b.intValue()));
            jsonobject.accumulate("name", ((fw) (obj)).a);
            jsonobject.accumulate("price", ((fw) (obj)).c.toString());
            jsonobject.accumulate("currency", ((fw) (obj)).d);
            jsonobject.accumulate("sku", ((fw) (obj)).e);
            jsonarray.put(jsonobject);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        com/paypal/android/sdk/fw.getSimpleName();
    }
}
