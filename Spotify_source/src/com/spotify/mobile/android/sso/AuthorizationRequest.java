// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.sso;

import android.text.TextUtils;
import ctz;

// Referenced classes of package com.spotify.mobile.android.sso:
//            ClientIdentity

public class AuthorizationRequest
{

    public final String a;
    public final String b;
    public final ResponseType c;
    public final ClientIdentity d;
    public String e[];

    public AuthorizationRequest(String s, ResponseType responsetype, String s1, ClientIdentity clientidentity, String as[])
    {
        boolean flag1 = true;
        int i = 0;
        super();
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag);
        if (!TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag);
        if (responsetype != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag);
        if (clientidentity != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ctz.a(flag);
        b = s;
        a = s1;
        c = responsetype;
        d = clientidentity;
        if (as != null)
        {
            e = new String[as.length];
            for (; i < as.length; i++)
            {
                e[i] = as[i].trim();
            }

        }
    }
}
