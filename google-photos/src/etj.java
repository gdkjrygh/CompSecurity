// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class etj
{

    static final String a;
    long b;
    long c;
    private Set d;
    private String e;
    private List f;

    public etj()
    {
        d = new HashSet();
        e = "";
        f = new ArrayList();
        b = -1L;
        c = -1L;
    }

    public etj(etj etj1)
    {
        d = new HashSet();
        e = "";
        f = new ArrayList();
        b = -1L;
        c = -1L;
        d.addAll(etj1.d);
        e = etj1.e;
        f.addAll(etj1.f);
    }

    public final Cursor a(Context context, int i)
    {
        return a(mvj.b(context, i));
    }

    public final Cursor a(SQLiteDatabase sqlitedatabase)
    {
        String as[] = (String[])f.toArray(new String[f.size()]);
        String as1[] = (String[])d.toArray(new String[d.size()]);
        String s;
        if (b == -1L && c == -1L)
        {
            s = null;
        } else
        if (c != -1L)
        {
            long l = c;
            long l1 = b;
            s = (new StringBuilder(41)).append(l).append(",").append(l1).toString();
        } else
        {
            s = String.valueOf(b);
        }
        if (Log.isLoggable("LocalMediaQuery", 2))
        {
            String s1 = e;
            String s2 = String.valueOf(Arrays.toString(as));
            (new StringBuilder(String.valueOf(s1).length() + 23 + String.valueOf(s2).length() + String.valueOf(s).length())).append("where: ").append(s1).append(" args: ").append(s2).append(" limits: ").append(s);
        }
        return sqlitedatabase.query("local_media", as1, e, as, null, null, null, s);
    }

    public final etj a(eun eun1)
    {
        p.b(eun1, "can not have null state");
        a("state = ?");
        f.add(String.valueOf(eun1.c));
        return this;
    }

    public final etj a(Collection collection)
    {
        boolean flag;
        if (collection != null && !collection.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not have empty contentUris");
        p.a(collection, "can not have empty contentUri");
        a(b.b("content_uri", collection.size()));
        f.addAll(collection);
        return this;
    }

    public final etj a(String as[])
    {
        int i = 0;
        boolean flag;
        if (as != null && as.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "projection must be non-null and non-empty");
        d = new HashSet(as.length);
        for (; i < as.length; i++)
        {
            d.add(p.a(as[i], "can not have empty projection"));
        }

        return this;
    }

    void a(String s)
    {
        e = DatabaseUtils.concatenateWhere(e, s);
    }

    public final etj b(Collection collection)
    {
        boolean flag;
        if (collection != null && !collection.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not have empty dedupKeys");
        p.a(collection, "can not have empty dedupKeys");
        a(b.b("dedup_key", collection.size()));
        f.addAll(collection);
        return this;
    }

    public final etj c(Collection collection)
    {
        boolean flag;
        if (collection != null && !collection.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not have empty buckets");
        a(b.b("bucket_id", collection.size()));
        f.addAll(collection);
        return this;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof etj)
        {
            obj = (etj)obj;
            flag = flag1;
            if (f.equals(((etj) (obj)).f))
            {
                flag = flag1;
                if (e.equals(((etj) (obj)).e))
                {
                    flag = flag1;
                    if (d.equals(((etj) (obj)).d))
                    {
                        flag = flag1;
                        if (b == ((etj) (obj)).b)
                        {
                            flag = flag1;
                            if (c == ((etj) (obj)).c)
                            {
                                flag = true;
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
        return c.a(e, c.a(f, c.a(d, c.a(b, c.a(c, 17)))));
    }

    public final String toString()
    {
        String s = String.valueOf("LocalMediaQuery{ selection=");
        String s1 = e;
        String s2 = String.valueOf(f);
        String s3 = String.valueOf(d);
        long l = b;
        long l1 = c;
        return (new StringBuilder(String.valueOf(s).length() + 79 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s1).append(", args=").append(s2).append(", projections=").append(s3).append(", limit=").append(l).append(", offset=").append(l1).append("}").toString();
    }

    static 
    {
        String s = String.valueOf("(auto_backup_state != ");
        int i = euu.e.g;
        String s1 = String.valueOf("auto_backup_state");
        int j = euu.d.g;
        a = (new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(s1).length())).append(s).append(i).append(" AND ").append(s1).append(" != ").append(j).append(")").toString();
    }
}
