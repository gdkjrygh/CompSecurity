// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.h;
import com.tinder.e.n;
import com.tinder.f.ak;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            i, ManagerApp, d

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

    // Unreferenced inner class com/tinder/managers/i$4

/* anonymous class */
    final class i._cls4
        implements com.android.volley.i.a
    {

        final h a;
        final i b;

        public final void a(VolleyError volleyerror)
        {
            (new StringBuilder("error=")).append(volleyerror);
            com.tinder.managers.ManagerApp.h().g().a(volleyerror.getMessage(), new i._cls4._cls1(this));
            v.b((new StringBuilder("error loading matches: ")).append(volleyerror).append(", ").append(volleyerror.getMessage()).toString());
            a.a();
            i.g(b);
            return;
            volleyerror;
            a.a();
            i.g(b);
            throw volleyerror;
        }

            
            {
                b = j;
                a = h1;
                super();
            }
    }

}
