// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class ghp
{

    private static Map a;
    private static Map b;

    public static String a(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = "en";
        } else
        {
            if (s.length() < 2)
            {
                return "en";
            }
            String s2 = (String)a.get(s);
            s1 = s2;
            if (s2 == null)
            {
                String s3 = s.substring(0, 2);
                if (s3.charAt(0) < 'a' || s3.charAt(0) > 'z' || s3.charAt(1) < 'a' || s3.charAt(1) > 'z')
                {
                    return "en";
                }
                s = (String)b.get(s3);
                s1 = s;
                if (s == null)
                {
                    return s3;
                }
            }
        }
        return s1;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put("es_ES", "es");
        a.put("fr_CA", "fr-ca");
        hashmap = new HashMap();
        b = hashmap;
        hashmap.put("es", "es-419");
        b.put("pt", "pt-br");
        b.put("zh", "zh-tw");
        b.put("in", "id");
        b.put("ji", "yi");
        b.put("iw", "he");
    }
}
