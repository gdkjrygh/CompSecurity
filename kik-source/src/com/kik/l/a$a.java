// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.ContentValues;
import android.database.Cursor;
import kik.a.a.a;

// Referenced classes of package com.kik.l:
//            y, a

private static class se.Cursor extends y
{

    public static ContentValues a(a a1)
    {
        ContentValues contentvalues1 = new ContentValues();
        ContentValues contentvalues;
        if (a1 == null)
        {
            contentvalues = null;
        } else
        {
            if (a1.a() != null)
            {
                contentvalues1.put("name", a1.a());
            }
            if (a1.b() != null)
            {
                contentvalues1.put("variant", a1.b());
            }
            contentvalues = contentvalues1;
            if (a1.c() != null)
            {
                contentvalues1.put("experiment_id", a1.b());
                return contentvalues1;
            }
        }
        return contentvalues;
    }

    public final a a()
    {
        Object obj = c("name");
        Object obj1 = c("variant");
        if (obj == null || obj1 == null)
        {
            obj = null;
        } else
        {
            obj1 = new a(((String) (obj)), ((String) (obj1)));
            String s = c("experiment_id");
            obj = obj1;
            if (s != null)
            {
                obj = obj1;
                if (s.length() > 0)
                {
                    ((a) (obj1)).a(s);
                    return ((a) (obj1));
                }
            }
        }
        return ((a) (obj));
    }

    public se.Cursor(Cursor cursor)
    {
        super(cursor);
    }
}
