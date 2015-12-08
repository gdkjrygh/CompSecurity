// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.libraries.translate.b.a;
import com.google.android.libraries.translate.c.h;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.logging.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            b, k, e, f, 
//            j, h

public final class t
{

    final Context a;
    final k b;
    private final Map c;
    private final b d;

    public t(Context context)
    {
        this(context, new b(context, true));
    }

    private t(Context context, b b1)
    {
        c = new HashMap();
        a = context;
        d = b1;
        b = new k(a);
    }

    private boolean a(h h1)
    {
        long l2 = System.currentTimeMillis();
        Object obj = d;
        obj = (List)(new com.google.android.libraries.translate.sync.e(((b) (obj)), ((b) (obj)).a)).a(com.google.android.libraries.translate.core.t.a(0L, ((b) (obj)).c, true, false, ((b) (obj)).b));
        if (obj == null)
        {
            return false;
        }
        List list = h1.c();
        Object obj1 = new HashSet();
        ((Set) (obj1)).addAll(list);
        ((Set) (obj1)).removeAll(((java.util.Collection) (obj)));
        if (((Set) (obj1)).removeAll(c.keySet()))
        {
            ArrayList arraylist = new ArrayList();
            long l = -1L;
            Iterator iterator = c.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (!((List) (obj)).contains(entry.getKey()))
                {
                    long l1 = l2 - ((Long)entry.getValue()).longValue();
                    arraylist.add(Long.valueOf(l1));
                    if (l < 0L || l1 < l)
                    {
                        l = l1;
                    }
                }
            } while (true);
            Singleton.b().a(-604, (new LogParams()).addParam("min_interval", Long.valueOf(l)).addParam("count", Integer.valueOf(c.size())));
        }
        for (obj1 = ((Set) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); h1.a((String)((Iterator) (obj1)).next())) { }
        ((List) (obj)).removeAll(list);
        if (((List) (obj)).size() == 0)
        {
            return true;
        }
        obj = d.a(((List) (obj)));
        if (obj == null)
        {
            return false;
        } else
        {
            return a(((List) (obj)), h1);
        }
    }

    private static boolean a(List list, h h1)
    {
        a a1;
        int i;
        a1 = com.google.android.libraries.translate.b.a.a(10D);
        list = list.iterator();
        i = 0;
_L8:
        if (!list.hasNext()) goto _L2; else goto _L1
_L1:
        Entry entry;
        entry = (Entry)list.next();
        a1.a();
        entry = com.google.android.libraries.translate.sync.b.b(entry);
        if (entry != null) goto _L4; else goto _L3
_L3:
        int l = i + 1;
        i = l;
        if (l <= 10)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        return false;
_L4:
        h1.b(entry);
        continue; /* Loop/switch isn't completed */
_L2:
        if (i != 0) goto _L6; else goto _L5
_L5:
        return true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    final long a(h h1, long l)
    {
        Object obj = com.google.android.libraries.translate.b.a.a(10D);
        String s;
        long l1;
        for (Iterator iterator = h1.a(h1.getReadableDatabase().query("entries", null, "id is null OR id = ''", null, null, null, "input COLLATE NOCASE ASC")).iterator(); iterator.hasNext(); c.put(s, Long.valueOf(l1)))
        {
            Entry entry = (Entry)iterator.next();
            ((a) (obj)).a();
            l1 = System.currentTimeMillis();
            s = d.a(entry);
            if (TextUtils.isEmpty(s))
            {
                return 0L;
            }
            entry.setId(s);
            h1.b(entry);
        }

        Object obj1;
        ArrayList arraylist;
        Iterator iterator1;
        int i;
        int i1;
        if (c.size() > 0)
        {
            try
            {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedexception) { }
        }
        obj = d;
        obj = (j)(new f(((b) (obj)), ((b) (obj)).a)).a(com.google.android.libraries.translate.core.t.a(l, ((b) (obj)).c, false, false, ((b) (obj)).b));
        if (obj == null)
        {
            return 0L;
        }
        obj1 = h1.c();
        arraylist = new ArrayList();
        iterator1 = ((j) (obj)).a.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Entry entry1 = (Entry)iterator1.next();
            if (!((List) (obj1)).contains(entry1.getId()))
            {
                arraylist.add(entry1);
            }
        } while (true);
        if (!a(((List) (arraylist)), h1))
        {
            return 0L;
        }
        obj1 = d;
        i = ((Integer)(new com.google.android.libraries.translate.sync.h(((b) (obj1)), ((b) (obj1)).a, Integer.valueOf(-1))).a(com.google.android.libraries.translate.core.t.a(0L, ((b) (obj1)).c, false, true, ((b) (obj1)).b))).intValue();
        if (i < 0)
        {
            return 0L;
        }
        obj1 = h1.getReadableDatabase().rawQuery(String.format(Locale.ENGLISH, "SELECT COUNT(*) FROM %s WHERE %s", new Object[] {
            "entries", h.e()
        }), null);
        ((Cursor) (obj1)).moveToFirst();
        i1 = ((Cursor) (obj1)).getInt(0);
        ((Cursor) (obj1)).close();
        if (i != i1 && !a(h1))
        {
            return 0L;
        } else
        {
            return ((j) (obj)).b;
        }
    }
}
