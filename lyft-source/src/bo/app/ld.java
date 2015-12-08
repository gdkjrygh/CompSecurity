// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            lj, lg, lk, lb, 
//            lf, le

public final class ld
{

    public static lf a(String s, String s1, le le)
    {
        le = new lj(le);
        s = ((String) (lg.a(s)));
        s1 = ((String) (lg.a(s1)));
        if ((s instanceof JSONObject) && (s1 instanceof JSONObject))
        {
            return le.a((JSONObject)s, (JSONObject)s1);
        }
        if ((s instanceof JSONArray) && (s1 instanceof JSONArray))
        {
            return le.a((JSONArray)s, (JSONArray)s1);
        }
        if ((s instanceof lb) && (s1 instanceof lb))
        {
            s = (lb)s;
            s1 = (lb)s1;
            le = new lf();
            if (!s.a().equals(s1.a()))
            {
                le.a("");
            }
            return le;
        }
        if (s instanceof JSONObject)
        {
            return (new lf()).a("", s, s1);
        } else
        {
            return (new lf()).a("", s, s1);
        }
    }
}
