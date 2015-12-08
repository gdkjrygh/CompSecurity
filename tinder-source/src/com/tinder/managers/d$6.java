// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.tinder.e.i;
import com.tinder.model.InstagramAuthError;

// Referenced classes of package com.tinder.managers:
//            d

final class a
    implements com.android.volley.
{

    final i a;
    final d b;

    public final void a(VolleyError volleyerror)
    {
        (new StringBuilder("failure: ")).append(volleyerror.getMessage());
        int j = -1;
        if (volleyerror.a != null)
        {
            j = volleyerror.a.a;
        }
        volleyerror = new InstagramAuthError(j, volleyerror.getMessage());
        a.a(volleyerror);
    }

    yError(d d1, i j)
    {
        b = d1;
        a = j;
        super();
    }
}
