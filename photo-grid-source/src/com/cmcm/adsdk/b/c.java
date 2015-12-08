// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.b;

import android.os.AsyncTask;
import com.cmcm.adsdk.b.b.a;
import com.cmcm.adsdk.b.c.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cmcm.adsdk.b:
//            a, d

final class c extends AsyncTask
{

    final List a;
    final com.cmcm.adsdk.b.a b;

    c(com.cmcm.adsdk.b.a a1, List list)
    {
        b = a1;
        a = list;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        Object obj = com.cmcm.adsdk.b.b.a.a(com.cmcm.adsdk.b.a.a(b)).a();
        com.cmcm.adsdk.b.c.b.a("RequestConfig", (new StringBuilder("old posbean list:")).append(obj.toString()).toString());
        aobj = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((List) (aobj)).add(Integer.valueOf(((com.cmcm.adsdk.b.a.c)((Iterator) (obj)).next()).b))) { }
        boolean flag = com.cmcm.adsdk.b.b.a.a(com.cmcm.adsdk.b.a.a(b)).b(((List) (aobj)));
        com.cmcm.adsdk.b.c.b.a("RequestConfig", (new StringBuilder("delete mPositionId data status:")).append(flag).toString());
        flag = com.cmcm.adsdk.b.b.a.a(com.cmcm.adsdk.b.a.a(b)).a(a);
        com.cmcm.adsdk.b.c.b.a("RequestConfig", (new StringBuilder("save satus:")).append(flag).toString());
        return Boolean.valueOf(flag);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Boolean)obj;
        com.cmcm.adsdk.b.c.b.a("RequestConfig", (new StringBuilder("onPostExecute isSuccess:")).append(obj).toString());
        if (((Boolean) (obj)).booleanValue())
        {
            if (com.cmcm.adsdk.b.a.b(b) != null)
            {
                com.cmcm.adsdk.b.a.b(b).b();
            }
            com.cmcm.adsdk.b.a.c(b);
            b.notifyObservers();
        } else
        if (com.cmcm.adsdk.b.a.b(b) != null)
        {
            com.cmcm.adsdk.b.a.b(b).a();
            return;
        }
    }
}
