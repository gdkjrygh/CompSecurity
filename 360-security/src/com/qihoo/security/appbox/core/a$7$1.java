// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.core;

import android.content.Context;
import com.qihoo.security.appbox.b.b;
import com.qihoo.security.appbox.b.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.appbox.core:
//            a, AppBoxResponse

class a
    implements Runnable
{

    final AppBoxResponse a;
    final Response b;

    public void run()
    {
        com.qihoo.security.appbox.core.a.b(b.b, a, b.b);
    }

    Response(Response response, AppBoxResponse appboxresponse)
    {
        b = response;
        a = appboxresponse;
        super();
    }

    // Unreferenced inner class com/qihoo/security/appbox/core/a$7

/* anonymous class */
    class a._cls7
        implements com.android.volley.k.b
    {

        final AtomicBoolean a;
        final b b;
        final boolean c;
        final AppBoxResponse d;
        final String e;
        final Context f;
        final WeakReference g;
        final a h;

        public volatile void a(Object obj)
        {
            a((JSONObject)obj);
        }

        public void a(JSONObject jsonobject)
        {
            a.set(false);
            jsonobject = b.a(jsonobject);
            if (jsonobject != null)
            {
                if (c)
                {
                    ArrayList arraylist = new ArrayList();
                    arraylist.addAll(d.appItems);
                    arraylist.addAll(((AppBoxResponse) (jsonobject)).appItems);
                    jsonobject.appItems = arraylist;
                    jsonobject.lastRequestTime = d.lastRequestTime;
                } else
                {
                    jsonobject.lastRequestTime = System.currentTimeMillis();
                }
                com.qihoo.security.appbox.core.a.a(h, jsonobject, e);
                h.a(new a._cls7._cls1(this, jsonobject));
            }
            com.qihoo.security.appbox.core.a.a(h, f, jsonobject, e, (c)g.get());
        }

            
            {
                h = a1;
                a = atomicboolean;
                b = b1;
                c = flag;
                d = appboxresponse;
                e = s;
                f = context;
                g = weakreference;
                super();
            }
    }

}
