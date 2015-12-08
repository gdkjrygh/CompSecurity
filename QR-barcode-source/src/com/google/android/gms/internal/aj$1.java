// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            aj, gv

class nc
    implements Runnable
{

    final String nb;
    final JSONObject nc;
    final aj nd;

    public void run()
    {
        aj.a(nd).a(nb, nc);
    }

    (aj aj1, String s, JSONObject jsonobject)
    {
        nd = aj1;
        nb = s;
        nc = jsonobject;
        super();
    }
}
