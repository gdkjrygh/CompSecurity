// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.c;

import android.content.Context;
import com.google.android.libraries.translate.core.u;
import com.google.android.libraries.translate.e.c;
import com.google.android.libraries.translate.sync.b;
import com.google.android.libraries.translate.sync.d;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.translate.c:
//            g, d

final class f extends g
{

    final Context a;
    final List b;
    final com.google.android.libraries.translate.c.d c;

    f(com.google.android.libraries.translate.c.d d1, Context context, List list)
    {
        c = d1;
        a = context;
        b = list;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        Object obj1 = com.google.android.libraries.translate.c.d.d(a);
        Object obj = b;
        aobj = new d(((b) (obj1)), ((b) (obj1)).a);
        obj1 = u.a("d", ((b) (obj1)).b);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((c) (obj1)).b("id", (String)((Iterator) (obj)).next())) { }
        ((d) (aobj)).a(((c) (obj1)).a(false));
        return null;
    }
}
