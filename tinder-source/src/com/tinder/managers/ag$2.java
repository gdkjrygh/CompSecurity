// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.aj;

// Referenced classes of package com.tinder.managers:
//            ag

final class a
    implements com.android.volley.
{

    final aj a;
    final ag b;

    public final void a(VolleyError volleyerror)
    {
        (new StringBuilder("tutorial: ")).append(volleyerror.getMessage());
    }

    Error(ag ag1, aj aj)
    {
        b = ag1;
        a = aj;
        super();
    }
}
