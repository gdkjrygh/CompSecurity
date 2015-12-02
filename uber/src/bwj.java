// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.math.BigDecimal;
import org.json.JSONArray;
import org.json.JSONObject;

public class bwj
{

    private String a;
    private Integer b;
    private BigDecimal c;
    private String d;
    private String e;

    public bwj(String s, Integer integer, BigDecimal bigdecimal, String s1, String s2)
    {
        a = s;
        b = integer;
        c = bigdecimal;
        d = s1;
        e = s2;
    }

    public static JSONArray a(bwj abwj[])
    {
        if (abwj != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((JSONArray) (obj));
_L2:
        JSONArray jsonarray = new JSONArray();
        int j = abwj.length;
        int i = 0;
        do
        {
            obj = jsonarray;
            if (i >= j)
            {
                continue;
            }
            obj = abwj[i];
            JSONObject jsonobject = new JSONObject();
            jsonobject.accumulate("quantity", Integer.toString(((bwj) (obj)).b.intValue()));
            jsonobject.accumulate("name", ((bwj) (obj)).a);
            jsonobject.accumulate("price", ((bwj) (obj)).c.toString());
            jsonobject.accumulate("currency", ((bwj) (obj)).d);
            jsonobject.accumulate("sku", ((bwj) (obj)).e);
            jsonarray.put(jsonobject);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        bwj.getSimpleName();
    }
}
