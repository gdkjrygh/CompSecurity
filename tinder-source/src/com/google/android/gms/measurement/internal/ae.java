// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            j, ac, ab, u, 
//            c, h, w, z

class ae
{

    protected final ac h;

    ae(ac ac1)
    {
        u.a(ac1);
        h = ac1;
    }

    public void c()
    {
        if (com.google.android.gms.measurement.internal.j.z())
        {
            throw new IllegalStateException("Unexpected call on package side");
        } else
        {
            return;
        }
    }

    public void d()
    {
        h.f().d();
    }

    public void e()
    {
        h.f().e();
    }

    public com.google.android.gms.measurement.internal.u f()
    {
        return h.j();
    }

    public c g()
    {
        ac ac1 = h;
        ac.a(ac1.e);
        return ac1.e;
    }

    public ef h()
    {
        return h.d;
    }

    public Context i()
    {
        return h.a;
    }

    public h j()
    {
        return h.g();
    }

    public ab k()
    {
        return h.f();
    }

    public w l()
    {
        return h.e();
    }

    public z m()
    {
        return h.d();
    }

    public j n()
    {
        return h.b;
    }
}
