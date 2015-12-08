// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.VolleyError;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            z

final class a
    implements com.android.volley.
{

    final z a;

    public final void a(VolleyError volleyerror)
    {
        v.b((new StringBuilder("Failed to update profile: ")).append(v.a(volleyerror)).toString());
    }

    Error(z z1)
    {
        a = z1;
        super();
    }
}
