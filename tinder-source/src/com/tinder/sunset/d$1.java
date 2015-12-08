// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.sunset;

import android.support.v4.g.g;
import com.tinder.utils.e;
import com.tinder.utils.v;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.tinder.sunset:
//            d, c

final class >
    implements com.android.volley.
{

    final Runnable a;
    final d b;

    public final void a(Object obj)
    {
        obj = e.a(new com.tinder.utils.e.a((JSONObject)obj) {

            final JSONObject a;
            final d._cls1 b;

            public final Object a()
            {
                return c.a(a);
            }

            
            {
                b = d._cls1.this;
                a = jsonobject;
                super();
            }
        });
        obj.a = new com.tinder.utils.e.c() {

            final d._cls1 a;

            public final void a(Object obj1)
            {
                if (obj1 != null)
                {
                    obj1 = (g)obj1;
                    a.b.b = (List)((g) (obj1)).b;
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
                a = d._cls1.this;
                super();
            }
        };
        ((e) (obj)).a(false);
    }

    >(d d1, Runnable runnable)
    {
        b = d1;
        a = runnable;
        super();
    }
}
