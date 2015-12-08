// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class erm
{

    public String a;
    public String b;
    public List c;
    public List d;
    public List e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    private String q;
    private String r;
    private String s;
    private List t;
    private boolean u;
    private Set v;
    private String w;

    public erm()
    {
        q = "";
        r = "";
        s = "";
        a = "capture_timestamp DESC, _id DESC";
        b = erl.a();
        c = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
        t = new ArrayList();
        f = -1L;
        g = -1L;
        k = true;
        l = true;
        m = false;
        n = true;
        v = EnumSet.allOf(ern);
        o = true;
    }

    private erm a(long l1, long l2, ero ero1, ero ero2)
    {
        List list;
        String s1;
        String s2;
        String s3;
        boolean flag;
        if (!TextUtils.isEmpty(w))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            s2 = "search_results";
            list = t;
            s1 = b.b("search_results", "all_media_id");
        } else
        {
            s2 = "media";
            list = c;
            s1 = b.b("media", "_id");
        }
        s3 = String.valueOf(b.b(s2, "capture_timestamp"));
        ero1 = ero.a(ero1);
        s2 = String.valueOf(b.b(s2, "capture_timestamp"));
        ero2 = ero.a(ero2);
        ero1 = (new StringBuilder(String.valueOf(s3).length() + 23 + String.valueOf(ero1).length() + String.valueOf(s2).length() + String.valueOf(s1).length() + String.valueOf(ero2).length())).append("(").append(s3).append(" ").append(ero1).append(" ? OR (").append(s2).append(" = ? AND ").append(s1).append(" ").append(ero2).append(" ?))").toString();
        if (flag)
        {
            e(ero1);
        } else
        {
            c(ero1);
        }
        list.add(String.valueOf(l1));
        list.add(String.valueOf(l1));
        list.add(String.valueOf(l2));
        return this;
    }

    private static String a(String s1, String s2)
    {
        String s3 = s1;
        if (!TextUtils.isEmpty(s1))
        {
            s3 = String.valueOf(s1).concat(" AND ");
        }
        s1 = String.valueOf(s3);
        s2 = String.valueOf(s2);
        if (s2.length() != 0)
        {
            return s1.concat(s2);
        } else
        {
            return new String(s1);
        }
    }

    private String a(boolean flag)
    {
        if (!u)
        {
            if (i)
            {
                b("remote_url IS NOT NULL");
            }
            if (h)
            {
                c("has_local = 1");
            }
        }
        boolean flag1 = j;
        if (!flag)
        {
            for (Iterator iterator = v.iterator(); iterator.hasNext();)
            {
                flag1 = ern.b((ern)iterator.next()) | flag1;
            }

        }
        if (!l)
        {
            c("is_hidden = 0");
        }
        if (k)
        {
            c("is_deleted = 0");
            if (flag1)
            {
                v.add(ern.b);
                v.add(ern.a);
                b(erl.e());
            }
        }
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        boolean flag2;
        if (!TextUtils.isEmpty(r))
        {
            obj = String.valueOf(r);
            String s1;
            String s2;
            String s3;
            if (((String) (obj)).length() != 0)
            {
                obj = "WHERE ".concat(((String) (obj)));
            } else
            {
                obj = new String("WHERE ");
            }
        } else
        {
            obj = "";
        }
        if (!TextUtils.isEmpty(w))
        {
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = String.valueOf(obj).concat(" AND ");
            } else
            {
                obj = "WHERE ";
            }
            obj = String.valueOf(obj);
            obj1 = String.valueOf(b.b("media", "dedup_key"));
            obj2 = String.valueOf("dedup_key");
            obj3 = String.valueOf("search_results");
            s1 = s;
            s2 = String.valueOf("capture_timestamp");
            s3 = String.valueOf("all_media_id");
            obj1 = (new StringBuilder(String.valueOf(obj).length() + 48 + String.valueOf(obj1).length() + String.valueOf(obj2).length() + String.valueOf(obj3).length() + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(((String) (obj))).append(((String) (obj1))).append(" IN (SELECT ").append(((String) (obj2))).append(" FROM ").append(((String) (obj3))).append(" WHERE ").append(s1).append(" ORDER BY ").append(s2).append(" DESC, ").append(s3).append(" DESC)").toString();
        } else
        {
            obj1 = obj;
        }
        if (!TextUtils.isEmpty(q))
        {
            obj = String.valueOf(q);
            if (((String) (obj)).length() != 0)
            {
                obj = "WHERE ".concat(((String) (obj)));
            } else
            {
                obj = new String("WHERE ");
            }
            obj2 = obj;
        } else
        {
            obj2 = "";
        }
        if (n && (!i || h))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (f == -1L && g == -1L)
        {
            obj = "";
        } else
        {
            if (a == null && flag2)
            {
                throw new IllegalArgumentException("Cannot both skip inner ORDER BY and apply a media table limit.");
            }
            if (g != -1L)
            {
                long l1 = g;
                long l3 = f;
                obj = (new StringBuilder(48)).append("LIMIT ").append(l1).append(", ").append(l3).toString();
            } else
            {
                long l2 = f;
                obj = (new StringBuilder(26)).append("LIMIT ").append(l2).toString();
            }
        }
        obj3 = new StringBuilder();
        if (!flag || flag1)
        {
            if (flag)
            {
                ((StringBuilder) (obj3)).append("SELECT COUNT(*) FROM (");
            }
            if (!o && flag1)
            {
                obj = String.valueOf("Required that no join be performed, but required by selection: ");
                obj1 = String.valueOf(v);
                throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 17 + String.valueOf(obj2).length() + String.valueOf(obj1).length())).append(((String) (obj))).append(((String) (obj2))).append(" and/or columns: ").append(((String) (obj1))).toString());
            }
            obj1 = erl.a(erl.a(((StringBuilder) (obj3)).append("SELECT "), v), ((String) (obj1)), ((String) (obj2)), ((String) (obj)), a, flag2, flag1, b, m, p);
            obj = obj1;
            if (flag)
            {
                obj = ((StringBuilder) (obj1)).append(")");
            }
        } else
        {
            ((StringBuilder) (obj3)).append("SELECT COUNT(*) ");
            obj = erl.a(((StringBuilder) (obj3)), ((String) (obj1)), ((String) (obj2)), ((String) (obj)), a, flag2, false, b, m, p);
        }
        return ((StringBuilder) (obj)).toString();
    }

    private String[] b()
    {
        ArrayList arraylist = new ArrayList(c.size() + d.size() + e.size());
        arraylist.addAll(c);
        arraylist.addAll(t);
        arraylist.addAll(d);
        arraylist.addAll(e);
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    private void e(String s1)
    {
        s = a(s, s1);
    }

    public final long a(Context context, int i1)
    {
        return a(mvj.b(context, i1));
    }

    public final long a(SQLiteDatabase sqlitedatabase)
    {
        String s1 = a(true);
        String as[] = b();
        if (Log.isLoggable("AllMediaQuery", 2))
        {
            String s2 = String.valueOf(Arrays.toString(as));
            (new StringBuilder(String.valueOf(s1).length() + 22 + String.valueOf(s2).length())).append("count() query: ").append(s1).append(" args: ").append(s2);
        }
        return DatabaseUtils.longForQuery(sqlitedatabase, s1, as);
    }

    public final erm a()
    {
        k = false;
        n = false;
        v.add(ern.b);
        v.add(ern.a);
        b(erl.c());
        return this;
    }

    public final erm a(long l1)
    {
        c(String.valueOf(b.b("media", "capture_timestamp")).concat(" >= ?"));
        c.add(String.valueOf(l1));
        return this;
    }

    public final erm a(long l1, long l2)
    {
        return a(l1, l2, ero.b, ero.c);
    }

    public final erm a(eve eve1)
    {
        u = true;
        n = false;
        String s1 = String.valueOf("dedup_key IN (");
        String s2 = String.valueOf(eve1.a);
        c((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s2).length())).append(s1).append(s2).append(")").toString());
        c.addAll(eve1.b);
        return this;
    }

    public final erm a(String s1)
    {
        c(String.valueOf(b.b("media", "dedup_key")).concat(" = ?"));
        c.add(s1);
        return this;
    }

    public final erm a(Set set)
    {
        if (!set.isEmpty())
        {
            c(b.b("type", set.size()));
            euv euv1;
            for (set = set.iterator(); set.hasNext(); c.add(String.valueOf(euv1.f)))
            {
                euv1 = (euv)set.next();
            }

        }
        return this;
    }

    public final erm a(String as[])
    {
        int i1 = 0;
        boolean flag;
        if (as != null && as.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "projection must be non-null and non-empty");
        v = new HashSet(as.length);
        for (; i1 < as.length; i1++)
        {
            v.add(p.a(erl.b().get(as[i1])));
        }

        return this;
    }

    public final Cursor b(Context context, int i1)
    {
        return b(mvj.b(context, i1));
    }

    public final Cursor b(SQLiteDatabase sqlitedatabase)
    {
        String s1 = a(false);
        String as[] = b();
        if (Log.isLoggable("AllMediaQuery", 2))
        {
            String s2 = String.valueOf(Arrays.toString(as));
            (new StringBuilder(String.valueOf(s1).length() + 22 + String.valueOf(s2).length())).append("query() query: ").append(s1).append(" args: ").append(s2);
        }
        erl.d();
        return sqlitedatabase.rawQuery(s1, as);
    }

    public final erm b(long l1)
    {
        c(String.valueOf(b.b("media", "capture_timestamp")).concat(" <= ?"));
        c.add(String.valueOf(l1));
        return this;
    }

    public final erm b(long l1, long l2)
    {
        return a(l1, l2, ero.a, ero.a);
    }

    public final erm b(Set set)
    {
        p.a(set);
        boolean flag;
        if (!set.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        c(b.b(b.b("media", "dedup_key"), set.size()));
        c.addAll(set);
        return this;
    }

    public void b(String s1)
    {
        q = a(q, s1);
        j = true;
    }

    public final erm c(long l1)
    {
        c(String.valueOf(b.b("media", "_id")).concat(" = ?"));
        c.add(String.valueOf(l1));
        return this;
    }

    public void c(String s1)
    {
        r = a(r, s1);
    }

    public final erm d(String s1)
    {
        w = s1;
        e(b.b("search_results", "is_rejected = 0"));
        e(b.b("search_results", "search_query = ?"));
        t.add(s1);
        return this;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof erm)
        {
            obj = (erm)obj;
            flag = flag1;
            if (f == ((erm) (obj)).f)
            {
                flag = flag1;
                if (c.equals(((erm) (obj)).c))
                {
                    flag = flag1;
                    if (g == ((erm) (obj)).g)
                    {
                        flag = flag1;
                        if (r.equals(((erm) (obj)).r))
                        {
                            flag = flag1;
                            if (a.equals(((erm) (obj)).a))
                            {
                                flag = flag1;
                                if (d.equals(((erm) (obj)).d))
                                {
                                    flag = flag1;
                                    if (q.equals(((erm) (obj)).q))
                                    {
                                        flag = flag1;
                                        if (TextUtils.equals(w, ((erm) (obj)).w))
                                        {
                                            flag = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.a(q, c.a(r, c.a(a, c.a(c, c.a(d, c.a(f, c.a(g, c.a(w, 17))))))));
    }

    public final String toString()
    {
        String s1 = String.valueOf("AllMediaQuery{ query=");
        String s2 = String.valueOf(a(false));
        String s3 = String.valueOf(TextUtils.join(", ", b()));
        return (new StringBuilder(String.valueOf(s1).length() + 10 + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s1).append(s2).append(", args=[").append(s3).append("]}").toString();
    }
}
