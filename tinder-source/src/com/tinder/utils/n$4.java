// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import com.android.volley.VolleyError;
import com.tinder.managers.ae;

// Referenced classes of package com.tinder.utils:
//            n, v

public final class t>
    implements com.android.volley.
{

    final n a;

    public final void a(VolleyError volleyerror)
    {
        v.b((new StringBuilder("error unregistering push with Tinder backend: ")).append(volleyerror).append(", ").append(volleyerror.getMessage()).append(", ").append(volleyerror.a).toString());
        ae.b(false);
    }

    public lleyError(n n1)
    {
        a = n1;
        super();
    }
}
