// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import android.preference.PreferenceManager;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.logging.LogParams;
import com.google.android.libraries.translate.logging.e;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.c:
//            h

public abstract class a
{

    public a()
    {
    }

    public final h a(Context context)
    {
        return c(context).a();
    }

    public abstract String a();

    public void a(Context context, Entry entry)
    {
        a(context).b(entry.getEntryWithoutOnMemoryAttributes());
    }

    public void a(List list, h h1, Context context)
    {
        for (list = list.iterator(); list.hasNext(); h1.c((Entry)list.next())) { }
    }

    public final h b(Context context)
    {
        h h1;
        try
        {
            h1 = c(context).a();
        }
        catch (SQLiteException sqliteexception)
        {
            String s = String.valueOf(a());
            SharedPreferences sharedpreferences;
            int i;
            if (s.length() != 0)
            {
                s = "sql_error_".concat(s);
            } else
            {
                s = new String("sql_error_");
            }
            sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
            i = sharedpreferences.getInt(s, 0) + 1;
            if (i > 1)
            {
                Singleton.b().a(-2003, LogParams.create(s).addParam("count", Integer.valueOf(i)));
            }
            sharedpreferences.edit().putInt(s, i).commit();
            return new h(context, null);
        }
        return h1;
    }

    public void b(Context context, Entry entry)
    {
        a(context).c(entry);
    }

    public abstract h c(Context context);
}
