// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.graphics.Typeface;
import com.google.android.libraries.a.a;
import com.google.android.libraries.translate.e.k;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.translate.e:
//            d

final class h extends k
{

    private final List a;
    private final String b;

    h(a a1, String s)
    {
        a = Lists.a(new a[] {
            a1
        });
        b = s;
    }

    static List a(h h1)
    {
        return h1.a;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return com.google.android.apps.translate.e.d.a(b);
    }

    protected final void onPostExecute(Object obj)
    {
        Typeface typeface = (Typeface)obj;
        obj = d.b();
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((a)iterator.next()).setTypeface(typeface)) { }
        break MISSING_BLOCK_LABEL_53;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        d.c().remove(b);
        obj;
        JVM INSTR monitorexit ;
    }
}
