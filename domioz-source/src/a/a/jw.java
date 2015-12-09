// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            kc, jz, ke, ju, 
//            jy, jx

public final class jw
{

    public static jy a(String s, String s1, jx jx)
    {
        jx = new kc(jx);
        s = ((String) (jz.a(s)));
        s1 = ((String) (jz.a(s1)));
        if ((s instanceof JSONObject) && (s1 instanceof JSONObject))
        {
            return jx.a((JSONObject)s, (JSONObject)s1);
        }
        if ((s instanceof JSONArray) && (s1 instanceof JSONArray))
        {
            return jx.a((JSONArray)s, (JSONArray)s1);
        }
        if ((s instanceof ju) && (s1 instanceof ju))
        {
            s = (ju)s;
            s1 = (ju)s1;
            jx = new jy();
            if (!s.a().equals(s1.a()))
            {
                jx.a("");
            }
            return jx;
        }
        if (s instanceof JSONObject)
        {
            return (new jy()).a("", s, s1);
        } else
        {
            return (new jy()).a("", s, s1);
        }
    }
}
