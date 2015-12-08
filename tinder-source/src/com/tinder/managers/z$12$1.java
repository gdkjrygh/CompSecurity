// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.ab;
import com.tinder.e.n;
import com.tinder.f.ak;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            z, ManagerApp, d

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

    ror(ror ror)
    {
        a = ror;
        super();
    }

    // Unreferenced inner class com/tinder/managers/z$12

/* anonymous class */
    final class z._cls12
        implements com.android.volley.i.a
    {

        final ab a;
        final z b;

        public final void a(VolleyError volleyerror)
        {
            ManagerApp.h().g().a(volleyerror.getMessage(), new z._cls12._cls1(this));
            v.b((new StringBuilder("error loading user: ")).append(volleyerror).append(", ").append(volleyerror.getMessage()).toString());
            a.onProfileLoadFailed();
        }

            
            {
                b = z1;
                a = ab1;
                super();
            }
    }

}
