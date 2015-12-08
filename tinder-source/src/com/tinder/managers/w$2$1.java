// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.n;
import com.tinder.e.t;
import com.tinder.model.Message;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            w, d

final class a
    implements n
{

    final a a;

    public final void a()
    {
    }

    public final void b()
    {
    }

    public final void c()
    {
    }

    rror(rror rror)
    {
        a = rror;
        super();
    }

    // Unreferenced inner class com/tinder/managers/w$2

/* anonymous class */
    final class w._cls2
        implements com.android.volley.i.a
    {

        final t a;
        final Message b;
        final w c;

        public final void a(VolleyError volleyerror)
        {
            v.b((new StringBuilder("error sending message: ")).append(volleyerror).append(", ").append(volleyerror.getMessage()).toString());
            c.b.a(volleyerror.getMessage(), new w._cls2._cls1(this));
            a.c(b);
        }

            
            {
                c = w1;
                a = t1;
                b = message;
                super();
            }
    }

}
