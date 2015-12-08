// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.ContentValues;
import android.database.Cursor;

public class s
    implements com.pandora.radio.util.h.b
{
    public static interface a
    {

        public abstract void a(String s1, Exception exception);
    }


    public static final a a = new a() {

        public void a(String s1, Exception exception)
        {
        }

    };
    private long b;
    private String c;
    private long d;
    private long e;
    private a f;

    public s(Cursor cursor)
    {
        if (!"pingUrl".equals(cursor.getString(1)))
        {
            throw new UnsupportedOperationException("PingUrl cursor must have type pingUrl");
        } else
        {
            b = cursor.getLong(0);
            c = cursor.getString(2);
            d = cursor.getLong(3);
            e = cursor.getLong(4);
            f = null;
            return;
        }
    }

    public s(String s1, long l, long l1, a a1)
    {
        b = -1L;
        c = s1;
        d = l;
        e = l1;
        f = a1;
    }

    public ContentValues a()
    {
        if (f != null)
        {
            throw new UnsupportedOperationException("Can't persist PingUrl with a callback");
        } else
        {
            ContentValues contentvalues = new ContentValues(2);
            contentvalues.put("url", c);
            contentvalues.put("type", "pingUrl");
            contentvalues.put("eventTime", Long.valueOf(d));
            contentvalues.put("ttl", Long.valueOf(e));
            return contentvalues;
        }
    }

    public void a(long l)
    {
        b = l;
    }

    public boolean b()
    {
        return d + e <= System.currentTimeMillis();
    }

    public long c()
    {
        return b;
    }

    public a d()
    {
        return f;
    }

    public String e()
    {
        return c;
    }

    public p.cx.t.a f()
    {
        return p.cx.t.a.b;
    }

    public String toString()
    {
        return c;
    }

}
