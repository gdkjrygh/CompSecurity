// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            bl, ry

final class bm
    implements Runnable
{

    final String a;
    final JSONObject b;
    final bl c;

    bm(bl bl1, String s, JSONObject jsonobject)
    {
        c = bl1;
        a = s;
        b = jsonobject;
        super();
    }

    public final void run()
    {
        bl.a(c).b(a, b);
    }
}
