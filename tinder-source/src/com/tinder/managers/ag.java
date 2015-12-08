// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.c;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.e.aj;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            d, ManagerApp, ae

public final class ag
{

    private com.tinder.managers.d a;
    private ae b;
    private f c;

    public ag(com.tinder.managers.d d1, ae ae, f f1)
    {
        a = d1;
        b = ae;
        c = f1;
    }

    private void a(List list, aj aj)
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray;
        jsonarray = new JSONArray();
        for (list = list.iterator(); list.hasNext(); jsonarray.put((String)list.next())) { }
          goto _L1
_L3:
        list = new d(1, c.P, jsonobject, new com.android.volley.i.b(aj) {

            final aj a;
            final ag b;

            public final void a(Object obj)
            {
                obj = (JSONObject)obj;
                (new StringBuilder("tutorial: ")).append(obj);
                a.a();
            }

            
            {
                b = ag.this;
                a = aj1;
                super();
            }
        }, new com.android.volley.i.a(aj) {

            final aj a;
            final ag b;

            public final void a(VolleyError volleyerror)
            {
                (new StringBuilder("tutorial: ")).append(volleyerror.getMessage());
            }

            
            {
                b = ag.this;
                a = aj;
                super();
            }
        }, d.b());
        list.j = new c(5000, 0, 1.0F);
        ManagerApp.b().a(list);
        return;
_L1:
        try
        {
            jsonobject.put("tutorials", jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            v.a("Failed to create JSON for viewed tutorial", list);
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final void a(String s, aj aj)
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(s);
        a(((List) (arraylist)), aj);
    }
}
