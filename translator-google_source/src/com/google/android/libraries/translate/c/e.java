// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.c;

import android.content.Context;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.sync.b;

// Referenced classes of package com.google.android.libraries.translate.c:
//            g, d

final class e extends g
{

    final Context a;
    final Entry b;
    final d c;

    e(d d1, Context context, Entry entry)
    {
        c = d1;
        a = context;
        b = entry;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = d.d(a).a(b);
        if (aobj != null)
        {
            c.a(a, b, ((String) (aobj)));
        }
        return null;
    }
}
