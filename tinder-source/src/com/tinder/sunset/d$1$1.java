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

final class a
    implements com.tinder.utils.
{

    final a a;

    public final void a(Object obj)
    {
        if (obj != null)
        {
            obj = (g)obj;
            a.a.b = (List)((g) (obj)).b;
        } else
        {
            v.b("Cannot parse moments");
            a.a.a = false;
        }
        if (a.a != null)
        {
            a.a.run();
        }
    }

    a(a a1)
    {
        a = a1;
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
            obj = e.a(new d._cls1._cls2((JSONObject)obj));
            obj.a = new d._cls1._cls1(this);
            ((e) (obj)).a(false);
        }

            
            {
                b = d1;
                a = runnable;
                super();
            }

        // Unreferenced inner class com/tinder/sunset/d$1$2

/* anonymous class */
        final class d._cls1._cls2
            implements com.tinder.utils.e.a
        {

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
        }

    }

}
