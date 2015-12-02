// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.abtest.qe.c;

import android.content.Context;
import com.facebook.auth.f.b;
import com.facebook.d.d.a;
import com.google.common.a.es;

// Referenced classes of package com.facebook.abtest.qe.c:
//            a

public class c extends a
    implements b
{

    private final com.facebook.abtest.qe.c.a a;

    public c(Context context, com.facebook.common.executors.a a1, com.facebook.d.b.a a2, com.facebook.abtest.qe.c.a a3)
    {
        super(context, a1, a2, es.a(a3), "qe_db", es.d());
        a = a3;
    }

    public void d()
    {
        a.b(e());
    }
}
