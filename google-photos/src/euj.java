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

public final class euj
{

    private Set a;
    private String b;
    private List c;

    public euj()
    {
        a = new HashSet();
        b = "";
        c = new ArrayList();
    }

    private void a(String s)
    {
        b = DatabaseUtils.concatenateWhere(b, s);
    }

    public final Cursor a(Context context, int i)
    {
        return a(mvj.b(context, i));
    }

    public final Cursor a(SQLiteDatabase sqlitedatabase)
    {
        String as[] = (String[])c.toArray(new String[c.size()]);
        String as1[] = (String[])a.toArray(new String[a.size()]);
        if (Log.isLoggable("RemoteMediaQuery", 2))
        {
            String s = b;
            String s1 = String.valueOf(Arrays.toString(as));
            (new StringBuilder(String.valueOf(s).length() + 14 + String.valueOf(s1).length())).append("where: ").append(s).append(" args: ").append(s1);
        }
        return sqlitedatabase.query("remote_media", as1, b, as, null, null, null);
    }

    public final euj a(eun eun1)
    {
        p.b(eun1, "can not have null state");
        a("state = ?");
        c.add(String.valueOf(eun1.c));
        return this;
    }

    public final euj a(Collection collection)
    {
        boolean flag;
        if (collection != null && !collection.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not have empty mediaKey");
        p.a(collection, "can not have empty mediaKey");
        a(b.b("media_key", collection.size()));
        c.addAll(collection);
        return this;
    }

    public final euj a(String as[])
    {
        p.a(true, "projection must be non-null and non-empty");
        a = new HashSet(1);
        for (int i = 0; i <= 0; i++)
        {
            a.add(p.a(as[0], "can not have empty projection"));
        }

        return this;
    }

    public final euj b(Collection collection)
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
        c.addAll(collection);
        return this;
    }

    public final euj b(String as[])
    {
        int i = 0;
        boolean flag;
        if (as.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not have empty mediaKey");
        a(b.b("media_key", as.length));
        for (; i < as.length; i++)
        {
            c.add(p.a(as[i], "can not have empty mediaKey"));
        }

        return this;
    }

    public final String toString()
    {
        String s = String.valueOf("RemoteMediaQuery{ selection=");
        String s1 = b;
        String s2 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 8 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", args=").append(s2).append("}").toString();
    }
}
