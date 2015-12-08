// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.sync.b;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.c:
//            b, g, f, h, 
//            e

public final class d extends com.google.android.libraries.translate.c.b
{

    private static h a;

    protected d()
    {
    }

    private static void a(g g1)
    {
        g1.a(new Void[0]);
    }

    private void a(List list, Context context)
    {
        if (list.isEmpty())
        {
            return;
        } else
        {
            a(((g) (new f(this, context, list))));
            return;
        }
    }

    public static d c()
    {
        return new d();
    }

    static b d(Context context)
    {
        return new b(context);
    }

    public static void e(Context context)
    {
        f(context);
        h h1 = (new d()).a(context);
        context = (new com.google.android.libraries.translate.c.b()).a(context);
        for (Iterator iterator = context.b().iterator(); iterator.hasNext(); h1.b((Entry)iterator.next())) { }
        context.d();
    }

    public static void f(Context context)
    {
        h h1 = (new d()).a(context);
        context = (new com.google.android.libraries.translate.c.b()).a(context);
        for (Iterator iterator = h1.a(h1.getReadableDatabase().query("entries", null, h.a(" OR ", "", new String[] {
    "LENGTH(input) > 300", "LENGTH(translation) > 300", "id = '_phrase_too_long_'"
}), null, null, null, "input COLLATE NOCASE ASC")).iterator(); iterator.hasNext(); context.b(new Entry((Entry)iterator.next()))) { }
        h1.d();
    }

    public final void a(Context context, Entry entry)
    {
        a(context, entry, "");
        a(((g) (new e(this, context, entry))));
    }

    public final void a(Context context, Entry entry, String s)
    {
        context = a(context);
        entry = entry.getEntryWithoutOnMemoryAttributes();
        entry.setId(s);
        context.b(entry);
    }

    public final void a(List list, h h1, Context context)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = ((Entry)iterator.next()).getId();
            if (!TextUtils.isEmpty(s))
            {
                arraylist.add(s);
            }
        } while (true);
        a(((List) (arraylist)), context);
        super.a(list, h1, context);
    }

    public final void b(Context context, Entry entry)
    {
        h h1 = a(context);
        Entry entry1 = h1.a(entry);
        h1.c(entry);
        if (entry1 != null && !TextUtils.isEmpty(entry1.getId()))
        {
            a(Lists.a(new String[] {
                entry1.getId()
            }), context);
        }
    }

    public final h c(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new h(context, "phrasebookdb");
        }
        context = a;
        this;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }
}
