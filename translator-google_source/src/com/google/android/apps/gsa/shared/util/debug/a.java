// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.debug;

import android.database.Cursor;
import android.util.Pair;
import com.google.android.apps.gsa.shared.util.d;
import com.google.android.apps.gsa.shared.util.m;
import com.google.common.b.a.c;
import com.google.common.base.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class a
{

    public final c a;
    private final String b;
    private final List c;

    a(String s, c c1, List list)
    {
        b = s;
        a = c1;
        c = m.a(list);
    }

    public static a a(Cursor cursor)
    {
        Object obj;
        String s;
        ArrayList arraylist;
        p.a(cursor);
        arraylist = new ArrayList();
        arraylist.addAll(m.a(null));
        obj = null;
        s = null;
_L2:
        String s1;
        boolean flag;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = d.a(cursor, "key");
        flag = s1.equals("state_dump_proto");
        if (flag)
        {
            try
            {
                obj = cursor.getBlob(cursor.getColumnIndexOrThrow("value"));
                obj = com.google.protobuf.nano.a.a(((byte []) (obj)), 0, obj.length);
                obj = (new c()).a(((com.google.protobuf.nano.a) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = null;
            }
            finally
            {
                cursor.close();
            }
            continue; /* Loop/switch isn't completed */
        }
        if (s1.equals("state_dump"))
        {
            s = d.a(cursor, "value");
            continue; /* Loop/switch isn't completed */
        }
        arraylist.add(new Pair(s1, d.a(cursor, "value")));
        if (true) goto _L2; else goto _L1
        throw obj;
_L1:
        obj = new a(s, ((c) (obj)), arraylist);
        cursor.close();
        return ((a) (obj));
    }
}
