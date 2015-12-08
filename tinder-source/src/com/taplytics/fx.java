// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.util.Pair;
import android.view.ViewGroup;
import com.android.volley.Request;
import com.android.volley.h;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            cv, ci, gr, ca, 
//            gs, turkey, cy, dp, 
//            do, dv, dw, fw

final class fx
    implements Runnable
{

    final fw a;

    fx(fw fw)
    {
        a = fw;
        super();
    }

    public final void run()
    {
        cv cv1 = cv.a();
        if (cv1.h == null) goto _L2; else goto _L1
_L1:
        Object obj;
        cv1.h.put("viewKey", ci.b().v.getClass().getSimpleName());
        obj = gr.a(cv1.j.getChildAt(0));
        cv1.h.put("imgFileName", obj);
        obj = new JSONArray();
        for (Iterator iterator = ca.a().c.entrySet().iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((Pair)((java.util.Map.Entry)iterator.next()).getValue()).second)) { }
          goto _L3
        obj;
        gs.b("Getting Found Activity", ((Exception) (obj)));
        cv1.h = null;
_L8:
        cv1.d = turkey.a;
        cv1.d();
_L2:
        return;
_L3:
        Object obj1;
        JSONObject jsonobject1;
        cv1.h.put("fragments", obj);
        cv1.h.put("isAndroid", true);
        obj = ci.b().b;
        jsonobject1 = cv1.h;
        obj1 = new cy(cv1);
        if (!ci.b().j) goto _L5; else goto _L4
_L4:
        String s;
        JSONObject jsonobject;
        s = (new StringBuilder()).append(((dp) (obj)).e).append(((dp) (obj)).b).append("/api/v1/chosenView").toString().replaceAll(" ", "%20");
        jsonobject = new JSONObject();
        jsonobject.put("projectToken", ci.b().f);
        jsonobject.put("viewDic", jsonobject1);
_L6:
        if (jsonobject.length() != 0)
        {
            Date date = new Date();
            obj1 = new do(s, jsonobject, cv.a().g(), new dv(((dp) (obj)), date, ((el) (obj1))), new dw(((dp) (obj)), s, ((el) (obj1))));
            obj1.l = "post_chosenView";
            ((dp) (obj)).f.a(((Request) (obj1)));
        }
_L5:
        cv1.h = null;
        continue; /* Loop/switch isn't completed */
        JSONException jsonexception;
        jsonexception;
        gs.b("postChosenActivity", jsonexception);
          goto _L6
        Exception exception;
        exception;
        cv1.h = null;
        throw exception;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
