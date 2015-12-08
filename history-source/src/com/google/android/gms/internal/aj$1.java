// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            aj, gu

class nm
    implements Runnable
{

    final String nl;
    final JSONObject nm;
    final aj nn;

    public void run()
    {
        aj.a(nn).a(nl, nm);
    }

    (aj aj1, String s, JSONObject jsonobject)
    {
        nn = aj1;
        nl = s;
        nm = jsonobject;
        super();
    }
}
