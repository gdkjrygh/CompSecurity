// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.as;
import com.tinder.e.n;

// Referenced classes of package com.tinder.managers:
//            ab, d

final class a
    implements n
{

    final a a;

    public final void a()
    {
        a.a.d = false;
        a.a.a(a.a);
    }

    public final void b()
    {
        a.a.c();
    }

    public final void c()
    {
        a.a.c();
        a.a.d = false;
    }

    or(or or)
    {
        a = or;
        super();
    }

    // Unreferenced inner class com/tinder/managers/ab$10

/* anonymous class */
    final class ab._cls10
        implements com.android.volley.i.a
    {

        final as a;
        final ab b;

        public final void a(VolleyError volleyerror)
        {
            (new StringBuilder()).append(volleyerror.getMessage()).append(' ').append(volleyerror);
            b.o.a(volleyerror.getMessage(), new ab._cls10._cls1(this));
        }

            
            {
                b = ab1;
                a = as1;
                super();
            }
    }

}
