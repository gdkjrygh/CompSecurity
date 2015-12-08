// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.tinder.a.f;
import com.tinder.e.m;
import com.tinder.utils.v;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            d

final class a
    implements com.android.volley.
{

    final m a;
    final d b;

    public final void a(VolleyError volleyerror)
    {
        String s = d.a(b).g;
        if (volleyerror.a == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        volleyerror = (new JSONObject(new String(volleyerror.a.b, "utf-8"))).getString("error");
        if (volleyerror == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (volleyerror.equalsIgnoreCase("Access Denied"))
        {
            a.onTinderLoginFailureAccessDenied();
            return;
        }
        try
        {
            a.onTinderLoginFailure();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (VolleyError volleyerror)
        {
            v.a("Failed to login to Tinder", volleyerror);
        }
        a.onTinderLoginFailure();
        return;
        a.onTinderLoginFailure();
        return;
    }

    yError(d d1, m m1)
    {
        b = d1;
        a = m1;
        super();
    }
}
