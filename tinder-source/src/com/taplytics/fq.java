// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.app.Activity;

// Referenced classes of package com.taplytics:
//            gs, cv, ci, turkey, 
//            dh, em

final class fq
    implements com.github.nkzawa.b.a.a
{

    final em a;

    fq(em em)
    {
        a = em;
        super();
    }

    public final transient void a(Object aobj[])
    {
        if (aobj != null)
        {
            if (gs.b())
            {
                gs.a((new StringBuilder("socketio reconnect: ")).append(aobj[0]).toString());
            }
            cv cv1 = cv.a();
            int i = ((Integer)aobj[0]).intValue();
            if (ci.b().g && ci.b().v != null && ci.b().l && cv1.j != null && cv1.d.equals(turkey.e) && cv1.b)
            {
                ci.b().v.runOnUiThread(new dh(cv1, i));
            }
        }
    }
}
