// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.database.Cursor;

// Referenced classes of package com.aviary.android.feather.cds:
//            n

public static final class a extends a
{

    final long a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    String k;
    String l;
    int m;
    int n;
    int o;
    int p;
    int q;
    int r;

    public static a a(Cursor cursor)
    {
        if (b(cursor))
        {
            a a1 = new <init>(cursor.getLong(cursor.getColumnIndex("content_id")), cursor.getLong(cursor.getColumnIndex("content_packId")));
            int i1 = cursor.getColumnIndex("content_previewURL");
            if (i1 > -1)
            {
                a1.c = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex("content_contentURL");
            if (i1 > -1)
            {
                a1.d = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex("content_iconUrl");
            if (i1 > -1)
            {
                a1.b = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex("content_displayName");
            if (i1 > -1)
            {
                a1.e = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex("content_displayDescription");
            if (i1 > -1)
            {
                a1.f = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex("content_iconPath");
            if (i1 > -1)
            {
                a1.i = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex("content_previewPath");
            if (i1 > -1)
            {
                a1.g = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex("content_contentPath");
            if (i1 > -1)
            {
                a1.h = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex("content_contentVersion");
            if (i1 > -1)
            {
                a1.j = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex("content_previewVersion");
            if (i1 > -1)
            {
                a1.k = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex("content_iconVersion");
            if (i1 > -1)
            {
                a1.l = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex("content_isFree");
            if (i1 > -1)
            {
                a1.q = cursor.getInt(i1);
            }
            i1 = cursor.getColumnIndex("content_purchased");
            if (i1 > -1)
            {
                a1.r = cursor.getInt(i1);
            }
            i1 = cursor.getColumnIndex("content_iconNeedDownload");
            if (i1 > -1)
            {
                a1.n = cursor.getInt(i1);
            }
            i1 = cursor.getColumnIndex("content_downloadRequested");
            if (i1 > -1)
            {
                a1.p = cursor.getInt(i1);
            }
            i1 = cursor.getColumnIndex("content_numItems");
            if (i1 > -1)
            {
                a1.m = cursor.getInt(i1);
            }
            return a1;
        } else
        {
            return null;
        }
    }

    public int a()
    {
        return n;
    }

    public long b()
    {
        return a;
    }

    public String c()
    {
        return b;
    }

    public Object clone()
    {
        b b1 = new <init>(s, a);
        b1.b = b;
        b1.c = c;
        b1.d = d;
        b1.e = e;
        b1.f = f;
        b1.g = g;
        b1.h = h;
        b1.i = i;
        b1.j = j;
        b1.k = k;
        b1.l = l;
        b1.n = n;
        b1.o = o;
        b1.p = p;
        b1.q = q;
        b1.r = r;
        b1.m = m;
        return b1;
    }

    public String d()
    {
        return c;
    }

    public String e()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof d))
        {
            obj = (d)obj;
            if (s == ((s) (obj)).s && a == ((a) (obj)).a)
            {
                return true;
            }
        }
        return false;
    }

    public String f()
    {
        return e;
    }

    public String g()
    {
        return f;
    }

    public String h()
    {
        return g;
    }

    public String i()
    {
        return h;
    }

    public String j()
    {
        return i;
    }

    public String k()
    {
        return j;
    }

    public String l()
    {
        return k;
    }

    public String m()
    {
        return l;
    }

    public int n()
    {
        return q;
    }

    public int o()
    {
        return r;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ContentColumns.Content{id: ").append(s).append(", packId: ").append(a).append(", displayName: ").append(e).append(", purchased: ").append(r).append(", contentPath: ").append(h).append("}").toString();
    }

    (long l1, long l2)
    {
        super(l1);
        a = l2;
    }
}
