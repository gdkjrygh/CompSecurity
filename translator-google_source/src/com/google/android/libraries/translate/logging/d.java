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
import java.util.Locale;

// Referenced classes of package com.google.android.libraries.translate.logging:
//            c, a

final class d extends k
{

    final com.google.android.libraries.translate.logging.c a;

    d(com.google.android.libraries.translate.logging.c c1)
    {
        a = c1;
        super();
    }

    private void a(String s)
    {
        publishProgress(new String[] {
            s
        });
    }

    protected final Object doInBackground(Object aobj[])
    {
        int i;
        int l;
        int i1;
        aobj = (String[])aobj;
        i1 = aobj.length;
        i = 0;
        l = 0;
_L2:
        Object obj;
        Object obj1;
        int j;
        if (i >= i1)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        obj = aobj[i];
        int j1 = a.a.getInt(((String) (obj)), 0);
        j = l;
        if (j1 > 0)
        {
            obj1 = t.a();
            ((StringBuilder) (obj1)).append("/gen204");
            obj1 = (new c(((StringBuilder) (obj1)).toString())).a(obj).a("count", Integer.toString(j1)).a("client", Singleton.c()).a("hl", Locale.getDefault().toString()).a("iid", o.b()).a(false);
            if (obj1 != null)
            {
                break; /* Loop/switch isn't completed */
            }
            a(((String) (obj)));
            j = l;
        }
_L4:
        i++;
        l = j;
        if (true) goto _L2; else goto _L1
_L1:
        if (com.google.android.libraries.translate.logging.a.a(((org.apache.http.client.methods.HttpRequestBase) (obj1))))
        {
            a(((String) (obj)));
        }
        l++;
        j = l;
        if (l < 50) goto _L4; else goto _L3
_L3:
        return Boolean.valueOf(false);
        return Boolean.valueOf(true);
    }

    protected final void onPostExecute(Object obj)
    {
        a.b = null;
    }

    protected final void onProgressUpdate(Object aobj[])
    {
        aobj = (String[])aobj;
        if (aobj.length > 0)
        {
            a.a.edit().remove(((String) (aobj[0]))).commit();
        }
    }
}
