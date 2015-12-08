// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import org.json.JSONObject;

// Referenced classes of package com.leanplum:
//            aJ, aW

final class aK
    implements Runnable
{

    private aJ a;
    private final JSONObject b;

    aK(aJ aj, JSONObject jsonobject)
    {
        a = aj;
        b = jsonobject;
        super();
    }

    public final void run()
    {
        a.e.a(String.format("5:::%s", new Object[] {
            b.toString()
        }));
    }
}
