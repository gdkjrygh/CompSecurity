// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.tinder.e.n;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            d

final class a
    implements n
{

    final a a;

    public final void a()
    {
        a.a.e();
    }

    public final void b()
    {
    }

    public final void c()
    {
    }

    ror(ror ror)
    {
        a = ror;
        super();
    }

    // Unreferenced inner class com/tinder/managers/d$17

/* anonymous class */
    final class d._cls17
        implements com.android.volley.i.a
    {

        final com.android.volley.i.a a = null;
        final d b;

        public final void a(VolleyError volleyerror)
        {
            if (a != null)
            {
                a.a(volleyerror);
            }
            v.b(v.a(volleyerror));
            if (volleyerror != null && volleyerror.a != null && volleyerror.a.a == 401)
            {
                b.a(volleyerror.getMessage(), new d._cls17._cls1(this));
            }
        }

            
            {
                b = d1;
                super();
            }
    }

}
