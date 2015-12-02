// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.d.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.base.Supplier;

// Referenced classes of package com.facebook.d.c:
//            b

public abstract class a
{

    private static final String c[] = {
        "value"
    };
    private final javax.inject.a a;
    private final String b;

    protected a(Supplier supplier, String s)
    {
        a = new b(this, supplier);
        b = s;
    }

    public long a(com.facebook.common.s.a a1, long l)
    {
        a1 = a(a1);
        if (a1 == null)
        {
            return l;
        }
        long l1;
        try
        {
            l1 = Long.parseLong(a1);
        }
        // Misplaced declaration of an exception variable
        catch (com.facebook.common.s.a a1)
        {
            return l;
        }
        return l1;
    }

    public String a(com.facebook.common.s.a a1)
    {
        a1 = ((SQLiteDatabase)a.b()).query(b, c, "key=?", new String[] {
            a1.a()
        }, null, null, null);
        String s;
        if (!a1.moveToNext())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        s = a1.getString(0);
        a1.close();
        return s;
        a1.close();
        return null;
        Exception exception;
        exception;
        a1.close();
        throw exception;
    }

    public String a(com.facebook.common.s.a a1, String s)
    {
        a1 = a(a1);
        if (a1 == null)
        {
            return s;
        } else
        {
            return a1;
        }
    }

    public void a(com.facebook.common.s.a a1, int i)
    {
        b(a1, Integer.toString(i));
    }

    public boolean a(com.facebook.common.s.a a1, boolean flag)
    {
        a1 = a(a1);
        if (a1 == null)
        {
            return flag;
        }
        long l;
        try
        {
            l = Long.parseLong(a1);
        }
        // Misplaced declaration of an exception variable
        catch (com.facebook.common.s.a a1)
        {
            return flag;
        }
        if (l != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public void b(com.facebook.common.s.a a1)
    {
        ((SQLiteDatabase)a.b()).delete(b, "key = ?", new String[] {
            a1.a()
        });
    }

    public void b(com.facebook.common.s.a a1, long l)
    {
        b(a1, Long.toString(l));
    }

    public void b(com.facebook.common.s.a a1, String s)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("key", a1.a());
        contentvalues.put("value", s);
        ((SQLiteDatabase)a.b()).replaceOrThrow(b, null, contentvalues);
    }

    public void b(com.facebook.common.s.a a1, boolean flag)
    {
        String s;
        if (flag)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        b(a1, s);
    }

    public void c(com.facebook.common.s.a a1)
    {
        ((SQLiteDatabase)a.b()).delete(b, "key LIKE ? ", new String[] {
            (new StringBuilder()).append(a1.a()).append("%").toString()
        });
    }

}
