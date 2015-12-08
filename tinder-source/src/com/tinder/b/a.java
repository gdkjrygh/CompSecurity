// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.gson.e;
import com.tinder.enums.SqlDataType;
import com.tinder.model.SparksEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tinder.b:
//            b, c, l, f

public final class a extends b
{

    private static e a;
    private c b[];

    public a()
    {
        b = (new c[] {
            new c("timestamp", SqlDataType.INTEGER, true), new c("name", SqlDataType.TEXT, false), new c("params", SqlDataType.TEXT, false)
        });
        a = new e();
    }

    public static ArrayList a(int i)
    {
        Cursor cursor;
        Object obj;
        if (i == -1)
        {
            cursor = l.a().a("analytics_events", "timestamp ASC");
        } else
        {
            cursor = l.a().a("analytics_events", "timestamp ASC", i);
        }
        obj = new ArrayList(cursor.getCount());
        String s;
        String s1;
        HashMap hashmap;
        long l1;
        for (; cursor.moveToNext(); ((ArrayList) (obj)).add(new SparksEvent(s, l1, (HashMap)a.a(s1, hashmap.getClass()))))
        {
            l1 = cursor.getLong(0);
            s = cursor.getString(1);
            s1 = cursor.getString(2);
            hashmap = new HashMap(0);
        }

        break MISSING_BLOCK_LABEL_131;
        obj;
        f.a(cursor);
        throw obj;
        f.a(cursor);
        return ((ArrayList) (obj));
    }

    public static void a(SparksEvent sparksevent)
    {
        String.valueOf(sparksevent);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("timestamp", Long.valueOf(sparksevent.timestamp));
        contentvalues.put("name", sparksevent.name);
        contentvalues.put("params", a.a(sparksevent.params));
        l.a().a("analytics_events", contentvalues);
    }

    public static void a(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); arraylist.add(Long.valueOf(((SparksEvent)list.next()).timestamp))) { }
        l.a().a("analytics_events", "timestamp", arraylist);
    }

    protected final c[] a()
    {
        return b;
    }

    protected final String b()
    {
        return "analytics_events";
    }
}
