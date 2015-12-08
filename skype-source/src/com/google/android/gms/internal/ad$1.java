// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            ad, hi

final class b
    implements Runnable
{

    final String a;
    final JSONObject b;
    final ad c;

    public final void run()
    {
        ad.a(c).b(a, b);
    }

    (ad ad1, String s, JSONObject jsonobject)
    {
        c = ad1;
        a = s;
        b = jsonobject;
        super();
    }
}
