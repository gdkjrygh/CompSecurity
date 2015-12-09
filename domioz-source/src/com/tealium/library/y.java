// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.database.Cursor;

// Referenced classes of package com.tealium.library:
//            C, u

final class y
{

    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private C e;

    y(Cursor cursor)
    {
        Object obj = null;
        super();
        int i = cursor.getColumnIndex("queued");
        int j = cursor.getColumnIndex("js");
        int k = cursor.getColumnIndex("event");
        int l = cursor.getColumnIndex("json");
        int i1 = cursor.getColumnIndex("config_loaded");
        if (i != -1)
        {
            cursor.getLong(i);
        }
        String s;
        boolean flag;
        if (j == -1)
        {
            s = null;
        } else
        {
            s = cursor.getString(j);
        }
        a = s;
        if (k == -1)
        {
            s = null;
        } else
        {
            s = cursor.getString(k);
        }
        b = s;
        if (l == -1)
        {
            s = obj;
        } else
        {
            s = cursor.getString(l);
        }
        c = s;
        if (i1 == -1)
        {
            i = 0;
        } else
        {
            i = cursor.getInt(i1);
        }
        if (i == true)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }

    final String a()
    {
        return a;
    }

    final String b()
    {
        return b;
    }

    final C c()
    {
        C c1;
        try
        {
            if (e == null)
            {
                e = new C(c);
            }
            c1 = e;
        }
        catch (Throwable throwable)
        {
            u.b(throwable);
            return null;
        }
        return c1;
    }

    final boolean d()
    {
        return d;
    }
}
