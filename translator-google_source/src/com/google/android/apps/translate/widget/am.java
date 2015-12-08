// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.android.libraries.translate.c.h;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.e.k;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.widget:
//            PhrasebookView, ap

final class am extends k
{

    final String a;
    final boolean b;
    final PhrasebookView c;

    am(PhrasebookView phrasebookview, String s, boolean flag)
    {
        c = phrasebookview;
        a = s;
        b = flag;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        if (com.google.android.libraries.translate.core.b.f(c.getContext()) == 1)
        {
            return com.google.android.libraries.translate.c.b.b().a(c.getContext()).a(0x7fffffff, a);
        }
        aobj = com.google.android.libraries.translate.c.b.b().a(c.getContext());
        String s = a;
        if (TextUtils.isEmpty(s))
        {
            return ((h) (aobj)).b();
        } else
        {
            return ((h) (aobj)).a(((h) (aobj)).getReadableDatabase().query("entries", null, h.a(" OR ", " LIKE '%' || ? || '%'", new String[] {
                "input", "translation"
            }), new String[] {
                s, s
            }, null, null, "input COLLATE NOCASE ASC"));
        }
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (List)obj;
        PhrasebookView.a(c).setNotifyOnChange(false);
        PhrasebookView.a(c).clear();
        Entry entry;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); PhrasebookView.a(c).add(entry))
        {
            entry = (Entry)((Iterator) (obj)).next();
        }

        PhrasebookView.a(c).setNotifyOnChange(true);
        PhrasebookView.a(c).notifyDataSetChanged();
        if (b)
        {
            com.google.android.apps.translate.widget.PhrasebookView.b(c);
        }
    }
}
