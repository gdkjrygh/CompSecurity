// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            ld, la, le, kv, 
//            kz, ky

public final class kx
{

    public static kz a(String s, String s1, ky ky)
    {
        ky = new ld(ky);
        s = ((String) (la.a(s)));
        s1 = ((String) (la.a(s1)));
        if ((s instanceof JSONObject) && (s1 instanceof JSONObject))
        {
            return ky.a((JSONObject)s, (JSONObject)s1);
        }
        if ((s instanceof JSONArray) && (s1 instanceof JSONArray))
        {
            return ky.a((JSONArray)s, (JSONArray)s1);
        }
        if ((s instanceof kv) && (s1 instanceof kv))
        {
            s = (kv)s;
            s1 = (kv)s1;
            ky = new kz();
            if (!s.a().equals(s1.a()))
            {
                ky.a("");
            }
            return ky;
        }
        if (s instanceof JSONObject)
        {
            return (new kz()).a("", s, s1);
        } else
        {
            return (new kz()).a("", s, s1);
        }
    }
}
