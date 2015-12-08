// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import com.leanplum.callbacks.StartCallback;
import java.util.HashMap;

// Referenced classes of package com.leanplum:
//            Leanplum

final class v extends StartCallback
{

    private final String a;
    private final HashMap b;

    v(String s, HashMap hashmap)
    {
        a = s;
        b = hashmap;
        super();
    }

    public final void onResponse(boolean flag)
    {
        Leanplum.a(a, b);
    }
}
