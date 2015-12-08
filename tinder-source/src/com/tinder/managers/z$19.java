// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.e.y;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            z

final class a
    implements com.android.volley.
{

    final y a;
    final z b;

    public final void a(VolleyError volleyerror)
    {
        v.b((new StringBuilder()).append(volleyerror).append(" : ").append(volleyerror.getMessage()).toString());
    }

    Error(z z1, y y)
    {
        b = z1;
        a = y;
        super();
    }
}
