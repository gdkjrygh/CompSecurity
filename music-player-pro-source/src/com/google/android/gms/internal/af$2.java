// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            af

class ne
    implements Runnable
{

    final af nd;
    final JSONObject ne;

    public void run()
    {
        nd.a(ne);
    }

    (af af1, JSONObject jsonobject)
    {
        nd = af1;
        ne = jsonobject;
        super();
    }
}
