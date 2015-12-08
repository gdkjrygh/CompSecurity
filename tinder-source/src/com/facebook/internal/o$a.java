// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;

// Referenced classes of package com.facebook.internal:
//            o, m, n

public static class a
{

    public Context a;
    public String b;
    public int c;
    public d d;
    public Bundle e;
    private String f;
    private AccessToken g;

    private void a(Context context, String s, Bundle bundle)
    {
        a = context;
        f = s;
        if (bundle != null)
        {
            e = bundle;
            return;
        } else
        {
            e = new Bundle();
            return;
        }
    }

    public o a()
    {
        if (g != null)
        {
            e.putString("app_id", g.g);
            e.putString("access_token", g.d);
        } else
        {
            e.putString("app_id", b);
        }
        return new o(a, f, e, c, d);
    }

    public tion(Context context, String s, Bundle bundle)
    {
label0:
        {
            super();
            c = 0x1030010;
            g = AccessToken.a();
            if (g == null)
            {
                String s1 = m.a(context);
                if (s1 == null)
                {
                    break label0;
                }
                b = s1;
            }
            a(context, s, bundle);
            return;
        }
        throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
    }

    public tion(Context context, String s, String s1, Bundle bundle)
    {
        c = 0x1030010;
        String s2 = s;
        if (s == null)
        {
            s2 = m.a(context);
        }
        n.a(s2, "applicationId");
        b = s2;
        a(context, s1, bundle);
    }
}
