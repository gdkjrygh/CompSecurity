// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.tinder.e.al;
import com.tinder.model.User;

// Referenced classes of package com.tinder.managers:
//            ab

public final class c
    implements com.android.volley.
{

    final al a;
    final User b;
    final String c;
    final ab d;

    public final void a(VolleyError volleyerror)
    {
        if (volleyerror == null)
        {
            a.a(b);
            return;
        }
        (new StringBuilder("superlike on ")).append(c).append(" FAILED ").append(volleyerror.getMessage());
        if (volleyerror.a != null)
        {
            switch (volleyerror.a.a)
            {
            case 402: 
            default:
                a.a(b);
                return;

            case 401: 
                a.b();
                return;

            case 403: 
                a.a();
                break;
            }
            return;
        } else
        {
            a.a(b);
            return;
        }
    }

    public Error(ab ab1, al al1, User user, String s)
    {
        d = ab1;
        a = al1;
        b = user;
        c = s;
        super();
    }
}
