// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.tinder.e.ad;
import com.tinder.e.n;
import com.tinder.e.z;
import com.tinder.f.ak;
import com.tinder.utils.o;
import com.tinder.utils.v;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.tinder.managers:
//            ab, ManagerApp, g, d

final class a
    implements z
{

    final a a;

    public final void a()
    {
        a.a.b(false);
    }

    public final void b()
    {
    }

    public final void c()
    {
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/tinder/managers/ab$12

/* anonymous class */
    final class ab._cls12
        implements com.android.volley.i.a
    {

        final ab a;

        public final void a(VolleyError volleyerror)
        {
            (new StringBuilder()).append(volleyerror.getMessage()).append(' ').append(volleyerror);
            String s = v.a(volleyerror);
            int i;
            if (!TextUtils.isEmpty(s))
            {
                (new StringBuilder("Recs error : status code onErrorResponse: [")).append(volleyerror.a.a).append("]");
                i = volleyerror.a.a;
            } else
            {
                i = 0;
            }
            if (!TextUtils.isEmpty(s) && s.contains("you must have a registered position before getting recs"))
            {
                a.a(false);
                a.d = false;
                ManagerApp.h().l().a(new ab._cls12._cls1(this), true);
                return;
            }
            if (i == 403)
            {
                a.d = false;
                a.j();
                return;
            } else
            {
                a.o.a(volleyerror.getMessage(), new ab._cls12._cls2());
                return;
            }
        }

            
            {
                a = ab1;
                super();
            }

        // Unreferenced inner class com/tinder/managers/ab$12$2

/* anonymous class */
        final class ab._cls12._cls2
            implements n
        {

            final ab._cls12 a;

            public final void a()
            {
                a.a.d = false;
                a.a.c();
            }

            public final void b()
            {
                Iterator iterator = a.a.b.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    WeakReference weakreference = (WeakReference)iterator.next();
                    if (o.a(weakreference))
                    {
                        ((ad)weakreference.get()).e();
                    }
                } while (true);
            }

            public final void c()
            {
                a.a.d = false;
                a.a.b(false);
            }

                    
                    {
                        a = ab._cls12.this;
                        super();
                    }
        }

    }

}
