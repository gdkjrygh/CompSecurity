// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.sunset;

import android.support.v4.g.g;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.tinder.a.f;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.e;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.tinder.sunset:
//            c

public final class d
{

    private static d c;
    boolean a;
    List b;

    private d()
    {
        b = new ArrayList(0);
    }

    public static d a()
    {
        if (c == null)
        {
            c = new d();
        }
        return c;
    }

    public final void a(Runnable runnable)
    {
        f f1 = ManagerApp.h().m();
        f1.a("MY_MOMENTS");
        a = true;
        String s = (new StringBuilder()).append(f1.f).append("moments").toString();
        JSONObject jsonobject = new JSONObject();
        runnable = new com.android.volley.i.b(runnable) {

            final Runnable a;
            final d b;

            public final void a(Object obj)
            {
                obj = e.a(new com.tinder.utils.e.a(this, (JSONObject)obj) {

                    final JSONObject a;
                    final _cls1 b;

                    public final Object a()
                    {
                        return com.tinder.sunset.c.a(a);
                    }

            
            {
                b = _pcls1;
                a = jsonobject;
                super();
            }
                });
                obj.a = new com.tinder.utils.e.c(this) {

                    final _cls1 a;

                    public final void a(Object obj)
                    {
                        if (obj != null)
                        {
                            obj = (g)obj;
                            a.b.b = (List)((g) (obj)).b;
                        } else
                        {
                            v.b("Cannot parse moments");
                            a.b.a = false;
                        }
                        if (a.a != null)
                        {
                            a.a.run();
                        }
                    }

            
            {
                a = _pcls1;
                super();
            }
                };
                ((e) (obj)).a(false);
            }

            
            {
                b = d.this;
                a = runnable;
                super();
            }
        };
        com.android.volley.i.a a1 = new com.android.volley.i.a() {

            final d a;

            public final void a(VolleyError volleyerror)
            {
                a.a = false;
            }

            
            {
                a = d.this;
                super();
            }
        };
        ManagerApp.h().g();
        runnable = new com.tinder.a.d(1, s, jsonobject, runnable, a1, com.tinder.managers.d.b());
        runnable.l = "MY_MOMENTS";
        f1.a(runnable);
    }

    public final boolean b()
    {
        return b.size() > 0;
    }
}
