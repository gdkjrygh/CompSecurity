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
//            c, d

final class a
    implements com.tinder.utils.
{

    final JSONObject a;
    final a b;

    public final Object a()
    {
        return c.a(a);
    }

    a(a a1, JSONObject jsonobject)
    {
        b = a1;
        a = jsonobject;
        super();
    }

    // Unreferenced inner class com/tinder/sunset/d$1

/* anonymous class */
    final class d._cls1
        implements com.android.volley.i.b
    {

        final Runnable a;
        final d b;

        public final void a(Object obj)
        {
            obj = e.a(new d._cls1._cls2(this, (JSONObject)obj));
            obj.a = new d._cls1._cls1();
            ((e) (obj)).a(false);
        }

            
            {
                b = d1;
                a = runnable;
                super();
            }

        // Unreferenced inner class com/tinder/sunset/d$1$1

/* anonymous class */
        final class d._cls1._cls1
            implements com.tinder.utils.e.c
        {

            final d._cls1 a;

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
                        a = d._cls1.this;
                        super();
                    }
        }

    }

}
