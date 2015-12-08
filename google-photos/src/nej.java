// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public abstract class nej
{

    static final String a[] = {
        "count(*)"
    };
    public final String b = String.valueOf(a()).concat(" = ?");
    public final String c;
    public final String d;
    public final String e[];
    public final String f[];
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;

    public nej()
    {
        g = b.y(c());
        h = b.y("date_added");
        i = b.y("date_modified");
        String s = String.valueOf(a());
        String s1 = String.valueOf(b());
        j = (new StringBuilder(String.valueOf(s).length() + 23 + String.valueOf(s1).length())).append(s).append(" NOT NULL AND ").append(s1).append(" NOT NULL").toString();
        s = j;
        s1 = String.valueOf("_data LIKE '%/DCIM/%'");
        k = (new StringBuilder(String.valueOf(s).length() + 5 + String.valueOf(s1).length())).append(s).append(" AND ").append(s1).toString();
        s = j;
        s1 = String.valueOf("_data NOT LIKE '%/DCIM/%'");
        l = (new StringBuilder(String.valueOf(s).length() + 5 + String.valueOf(s1).length())).append(s).append(" AND ").append(s1).toString();
        s = String.valueOf(a());
        String s2;
        String s3;
        if (s.length() != 0)
        {
            s = ") GROUP BY (".concat(s);
        } else
        {
            s = new String(") GROUP BY (");
        }
        m = s;
        s = String.valueOf(j);
        s1 = String.valueOf(m);
        if (s1.length() != 0)
        {
            s.concat(s1);
        } else
        {
            new String(s);
        }
        s = String.valueOf(k);
        s1 = String.valueOf(m);
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        c = s;
        s = String.valueOf(l);
        s1 = String.valueOf(m);
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        d = s;
        s = a();
        s1 = b();
        s2 = String.valueOf(c());
        s3 = String.valueOf("latest_timestamp");
        e = (new String[] {
            s, s1, (new StringBuilder(String.valueOf(s2).length() + 9 + String.valueOf(s3).length())).append("MAX(").append(s2).append(") as ").append(s3).toString()
        });
        s = g;
        s1 = String.valueOf("corrected_date_taken");
        s = (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length())).append(s).append(" as ").append(s1).toString();
        s1 = String.valueOf(b.d(h, i));
        s2 = String.valueOf("corrected_added_modified");
        s1 = (new StringBuilder(String.valueOf(s1).length() + 4 + String.valueOf(s2).length())).append(s1).append(" as ").append(s2).toString();
        s2 = String.valueOf(d());
        s3 = String.valueOf("aliased_orientation");
        f = (new String[] {
            "_id", s, s1, "mime_type", "title", (new StringBuilder(String.valueOf(s2).length() + 4 + String.valueOf(s3).length())).append(s2).append(" as ").append(s3).toString()
        });
    }

    public static String[] b(List list)
    {
        boolean flag = true;
        boolean flag1 = false;
        String as[];
        int i1;
        if (list != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (list.size() <= 0)
        {
            flag = false;
        }
        p.a(i1 & flag);
        as = new String[list.size()];
        for (i1 = ((flag1) ? 1 : 0); i1 < as.length; i1++)
        {
            as[i1] = ((Integer)list.get(i1)).toString();
        }

        return as;
    }

    abstract String a();

    public final String a(List list)
    {
        return b.b(a(), list.size());
    }

    abstract String b();

    abstract String c();

    abstract String d();

}
