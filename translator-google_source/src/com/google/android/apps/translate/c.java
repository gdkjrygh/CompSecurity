// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.translate.c.b;
import com.google.android.libraries.translate.c.h;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.e.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate:
//            HomeListView, a

final class c extends k
{

    final HomeListView a;

    c(HomeListView homelistview)
    {
        a = homelistview;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = new ArrayList();
        h h1 = b.b().b(a.getContext());
        Object obj = (new com.google.android.libraries.translate.c.c()).b(a.getContext());
        Entry entry;
        for (obj = ((h) (obj)).a(((h) (obj)).getReadableDatabase().query("entries", null, null, null, null, null, "created DESC")).iterator(); ((Iterator) (obj)).hasNext(); ((List) (aobj)).add(entry))
        {
            entry = (Entry)((Iterator) (obj)).next();
            if (isCancelled())
            {
                return null;
            }
            entry.isFavorite = h1.d(entry);
        }

        return ((Object) (aobj));
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (List)obj;
        if (obj != null)
        {
            com.google.android.apps.translate.HomeListView.b(a).a(((List) (obj)), HomeListView.a(a));
        }
    }
}
