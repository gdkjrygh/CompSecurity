// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.logging;

import android.content.SharedPreferences;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.t;
import com.google.android.libraries.translate.e.c;
import com.google.android.libraries.translate.e.k;
import com.google.android.libraries.translate.e.o;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.translate.logging:
//            a

final class b extends k
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        Object obj = a.a.getAll();
        aobj = new StringBuilder();
        obj = ((Map) (obj)).entrySet().iterator();
        boolean flag1;
        for (boolean flag = false; ((Iterator) (obj)).hasNext(); flag = flag1)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            Object obj1 = entry.getValue();
            flag1 = flag;
            if (obj1 == null)
            {
                continue;
            }
            flag1 = flag;
            if (!(obj1 instanceof Integer))
            {
                continue;
            }
            int i = ((Integer)obj1).intValue();
            flag1 = flag;
            if (i <= 0)
            {
                continue;
            }
            if (flag)
            {
                ((StringBuilder) (aobj)).append(',');
            }
            flag1 = true;
            ((StringBuilder) (aobj)).append((String)entry.getKey()).append('=').append(i);
        }

        obj = t.a();
        ((StringBuilder) (obj)).append("/gen204?client=");
        ((StringBuilder) (obj)).append(Singleton.c());
        aobj = (new c(((StringBuilder) (obj)).toString())).a("iid", o.b()).a("ic", ((StringBuilder) (aobj)).toString()).a(false);
        if (aobj == null)
        {
            return Boolean.valueOf(false);
        } else
        {
            return Boolean.valueOf(com.google.android.libraries.translate.logging.a.a(((org.apache.http.client.methods.HttpRequestBase) (aobj))));
        }
    }
}
