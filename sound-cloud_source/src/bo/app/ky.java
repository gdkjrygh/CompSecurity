// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            le, lb, lf, kw, 
//            la, kz

public final class ky
{

    public static la a(String s, String s1, kz kz)
    {
        kz = new le(kz);
        s = ((String) (lb.a(s)));
        s1 = ((String) (lb.a(s1)));
        if ((s instanceof JSONObject) && (s1 instanceof JSONObject))
        {
            return kz.a((JSONObject)s, (JSONObject)s1);
        }
        if ((s instanceof JSONArray) && (s1 instanceof JSONArray))
        {
            return kz.a((JSONArray)s, (JSONArray)s1);
        }
        if ((s instanceof kw) && (s1 instanceof kw))
        {
            s = (kw)s;
            s1 = (kw)s1;
            kz = new la();
            if (!s.a().equals(s1.a()))
            {
                kz.a("");
            }
            return kz;
        }
        if (s instanceof JSONObject)
        {
            return (new la()).a("", s, s1);
        } else
        {
            return (new la()).a("", s, s1);
        }
    }
}
