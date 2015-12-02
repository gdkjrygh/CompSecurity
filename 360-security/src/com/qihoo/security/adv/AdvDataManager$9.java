// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.adv:
//            AdvDataManager, b

class d
    implements com.android.volley.r._cls9
{

    final vType a;
    final WeakReference b;
    final String c;
    final long d;
    final AdvDataManager e;

    public volatile void a(Object obj)
    {
        a((JSONObject)obj);
    }

    public void a(JSONObject jsonobject)
    {
        Object obj = (vType)b.get();
        if (jsonobject != null)
        {
            a a1;
            int i;
            try
            {
                jsonobject.put("responseTime", System.currentTimeMillis());
            }
            catch (JSONException jsonexception) { }
            i = jsonobject.optInt("result", -1);
            if (AdvDataManager.d().containsKey(Integer.valueOf(i)))
            {
                long l = (long)(jsonobject.optInt("expired") * 1000) + System.currentTimeMillis();
                AdvDataManager.a(e, c, l);
                if (obj != null)
                {
                    ((c) (obj)).a(a, Long.valueOf(l), i);
                }
                return;
            }
        }
        a1 = com.qihoo.security.adv.b.a(jsonobject);
        if (a1 != null && vType.a(a))
        {
            AdvDataManager.b(e).put(a, a1);
        }
        AdvDataManager.c(e, a1);
        e.a(((e) (obj)), new <init>(a1, 1), a, d);
        obj = new <init>(null);
        obj.c = a;
        obj.b = d;
        obj.d = jsonobject;
        obj.e = a1;
        AdvDataManager.c(e).sendMessage(AdvDataManager.c(e).obtainMessage(0, obj));
    }

    vType(AdvDataManager advdatamanager, vType vtype, WeakReference weakreference, String s, long l)
    {
        e = advdatamanager;
        a = vtype;
        b = weakreference;
        c = s;
        d = l;
        super();
    }
}
