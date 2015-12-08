// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.c;

import org.json.JSONObject;

// Referenced classes of package com.kik.c:
//            b

final class c
    implements Runnable
{

    final JSONObject a;
    final b b;

    c(b b1, JSONObject jsonobject)
    {
        b = b1;
        a = jsonobject;
        super();
    }

    public final void run()
    {
        com.kik.c.b.a(b, a);
    }
}
