// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.tinder.e.ao;
import com.tinder.model.User;

// Referenced classes of package com.tinder.managers:
//            ab

final class c
    implements com.android.volley.
{

    final ao a;
    final String b;
    final User c;
    final ab d;

    public final void a(VolleyError volleyerror)
    {
        if (volleyerror == null)
        {
            a.a(b);
            return;
        }
        (new StringBuilder("undo superlike on ")).append(b).append(" FAILED ").append(volleyerror.getMessage());
        if (volleyerror.a != null)
        {
            switch (volleyerror.a.a)
            {
            case 402: 
            default:
                a.a(b);
                return;

            case 400: 
                a.a();
                return;

            case 401: 
                a.a(c);
                return;

            case 403: 
                a.b();
                break;
            }
            return;
        } else
        {
            a.a(b);
            return;
        }
    }

    rror(ab ab1, ao ao1, String s, User user)
    {
        d = ab1;
        a = ao1;
        b = s;
        c = user;
        super();
    }
}
