// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.crashlytics.android.Crashlytics;
import com.tinder.e.e;
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
        d.a(a.a, a.a, a.a - 1);
    }

    public final void b()
    {
        d.a(a.a, a.a, a.a - 1);
    }

    public final void c()
    {
        d.a(a.a, a.a, a.a - 1);
    }

    ror(ror ror)
    {
        a = ror;
        super();
    }

    // Unreferenced inner class com/tinder/managers/d$15

/* anonymous class */
    final class d._cls15
        implements com.android.volley.i.a
    {

        final int a;
        final e b;
        final d c;

        public final void a(VolleyError volleyerror)
        {
            if (volleyerror != null)
            {
                Crashlytics.a(volleyerror.toString());
                v.b(volleyerror.toString());
            }
            if (a > 0 && volleyerror != null)
            {
                c.a(volleyerror.getMessage(), new d._cls15._cls1(this));
                return;
            } else
            {
                b.d();
                return;
            }
        }

            
            {
                c = d1;
                a = i;
                b = e1;
                super();
            }
    }

}
