// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.l;

// Referenced classes of package com.facebook.internal:
//            aw, bc, bd, bk

public class bi
{

    private Context a;
    private String b;
    private String c;
    private int d;
    private bk e;
    private Bundle f;
    private AccessToken g;

    public bi(Context context, String s, Bundle bundle)
    {
label0:
        {
            super();
            d = 0x1030010;
            g = AccessToken.a();
            if (g == null)
            {
                String s1 = aw.a(context);
                if (s1 == null)
                {
                    break label0;
                }
                b = s1;
            }
            a(context, s, bundle);
            return;
        }
        throw new l("Attempted to create a builder without a valid access token or a valid default Application ID.");
    }

    public bi(Context context, String s, String s1, Bundle bundle)
    {
        d = 0x1030010;
        String s2 = s;
        if (s == null)
        {
            s2 = aw.a(context);
        }
        bc.a(s2, "applicationId");
        b = s2;
        a(context, s1, bundle);
    }

    private void a(Context context, String s, Bundle bundle)
    {
        a = context;
        c = s;
        if (bundle != null)
        {
            f = bundle;
            return;
        } else
        {
            f = new Bundle();
            return;
        }
    }

    public bd a()
    {
        if (g != null)
        {
            f.putString("app_id", g.f());
            f.putString("access_token", g.b());
        } else
        {
            f.putString("app_id", b);
        }
        return new bd(a, c, f, d, e);
    }

    public final bi a(bk bk)
    {
        e = bk;
        return this;
    }

    public final String b()
    {
        return b;
    }

    public final Context c()
    {
        return a;
    }

    public final int d()
    {
        return d;
    }

    public final Bundle e()
    {
        return f;
    }

    public final bk f()
    {
        return e;
    }
}
