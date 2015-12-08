// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            fe, em

final class ff
    implements Runnable
{

    final JSONObject a;
    final fe b;

    ff(fe fe1, JSONObject jsonobject)
    {
        b = fe1;
        a = jsonobject;
        super();
    }

    public final void run()
    {
        em.b(b.a, a);
    }
}
