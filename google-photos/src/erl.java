// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class erl
{

    private static final oni a = new oni("debug.photos.explain_query_plan");
    private static final String b;
    private static final String c;
    private static final String d;
    private static final Map e;

    static String a()
    {
        return b;
    }

    static StringBuilder a(StringBuilder stringbuilder, String s, String s1, String s2, String s3, boolean flag, boolean flag1, String s4, 
            boolean flag2, boolean flag3)
    {
        if (flag2)
        {
            if (flag3)
            {
                throw new IllegalArgumentException("Cannot skip the inner join with a remote first query");
            }
            p.b(flag1, Boolean.valueOf(true));
            s = stringbuilder.append("FROM remote_media").append(" CROSS JOIN (SELECT * FROM media").append(" ").append(s);
            stringbuilder = s;
            if (s3 != null)
            {
                s = s.append(" ORDER BY ").append(s3).append(" ");
                if (flag)
                {
                    stringbuilder = s2;
                } else
                {
                    stringbuilder = "";
                }
                stringbuilder = s.append(stringbuilder);
            }
            s = a(stringbuilder.append(") AS media1").append(" USING (dedup_key").append(") "), s1, s4, flag, s2);
        } else
        {
            if (flag3)
            {
                stringbuilder = stringbuilder.append("FROM (SELECT  * FROM media").append(" ").append(s);
            } else
            {
                stringbuilder = stringbuilder.append("FROM (SELECT _id FROM media").append(" ").append(s);
            }
            s = stringbuilder;
            if (s3 != null)
            {
                s = stringbuilder.append(" ORDER BY ").append(s3).append(" ");
                if (flag)
                {
                    stringbuilder = s2;
                } else
                {
                    stringbuilder = "";
                }
                s = s.append(stringbuilder);
            }
            if (flag3)
            {
                stringbuilder = s.append(") AS media1").append(" ");
            } else
            {
                stringbuilder = s.append(") AS media2").append(" LEFT JOIN ").append("media AS ").append("media1 ON ").append(b.b("media2", "_id")).append(" = ").append(b.b("media1", "_id")).append(" ");
            }
            s = stringbuilder;
            if (flag1)
            {
                return a(stringbuilder.append("LEFT JOIN remote_media").append(" USING (").append("dedup_key) "), s1, s4, flag, s2);
            }
        }
        return s;
    }

    private static StringBuilder a(StringBuilder stringbuilder, String s, String s1, boolean flag, String s2)
    {
        s = stringbuilder.append("LEFT JOIN local_media").append(" USING (").append("dedup_key) ").append(s).append(" GROUP BY ").append("media1.").append("dedup_key ").append("ORDER BY ").append(s1);
        if (flag)
        {
            stringbuilder = "";
        } else
        {
            stringbuilder = String.valueOf(s2);
            if (stringbuilder.length() != 0)
            {
                stringbuilder = " ".concat(stringbuilder);
            } else
            {
                stringbuilder = new String(" ");
            }
        }
        return s.append(stringbuilder);
    }

    static StringBuilder a(StringBuilder stringbuilder, Set set)
    {
        String s;
        Object obj;
        for (set = set.iterator(); set.hasNext(); stringbuilder.append((new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(obj).length())).append(s).append(" AS ").append(((String) (obj))).toString()).append(", "))
        {
            obj = (ern)set.next();
            s = ((ern) (obj)).c;
            obj = ((ern) (obj)).d;
        }

        return stringbuilder.replace(stringbuilder.length() - 2, stringbuilder.length() - 1, "");
    }

    static Map b()
    {
        return e;
    }

    static String c()
    {
        return d;
    }

    static oni d()
    {
        return a;
    }

    static String e()
    {
        return c;
    }

    static 
    {
        Object obj = String.valueOf(b.b("media1", "capture_timestamp"));
        String s = String.valueOf(b.b("media1", "_id"));
        b = (new StringBuilder(String.valueOf(obj).length() + 12 + String.valueOf(s).length())).append(((String) (obj))).append(" DESC, ").append(s).append(" DESC").toString();
        obj = String.valueOf("(remote_state = ");
        int i = eun.a.c;
        s = String.valueOf("local_state");
        int l = eun.a.c;
        c = (new StringBuilder(String.valueOf(obj).length() + 30 + String.valueOf(s).length())).append(((String) (obj))).append(i).append(" OR ").append(s).append(" = ").append(l).append(")").toString();
        obj = String.valueOf("(remote_state = ");
        i = eun.b.c;
        s = String.valueOf("local_state");
        l = eun.b.c;
        d = (new StringBuilder(String.valueOf(obj).length() + 30 + String.valueOf(s).length())).append(((String) (obj))).append(i).append(" OR ").append(s).append(" = ").append(l).append(")").toString();
        obj = new HashMap();
        ern aern[] = ern.values();
        l = aern.length;
        for (int j = 0; j < l; j++)
        {
            ern ern1 = aern[j];
            ((Map) (obj)).put(ern.a(ern1), ern1);
        }

        obj = Collections.unmodifiableMap(((Map) (obj)));
        e = ((Map) (obj));
        if (((Map) (obj)).size() != ern.values().length)
        {
            int k = ern.values().length;
            int i1 = e.size();
            throw new IllegalStateException((new StringBuilder(58)).append("Expected ").append(k).append(" in column to enum but had ").append(i1).toString());
        }
    }
}
