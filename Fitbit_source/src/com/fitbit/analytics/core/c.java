// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.core;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.fitbit.analytics.platforms.fitbit.d;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

// Referenced classes of package com.fitbit.analytics.core:
//            b, Interaction

public class c
{

    private final long a;
    private final Interaction b;
    private final String c;
    private final String d;
    private final UUID e;
    private d f;

    public c(b b1, d d1, Interaction interaction, long l)
    {
        a = l;
        c = b1.b();
        d = b1.d();
        e = b1.c();
        f = d1;
        b = interaction;
        g();
    }

    private void g()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ");
        b.a("cdt", simpledateformat.format(Long.valueOf(a)));
        if (!TextUtils.isEmpty(d))
        {
            b.a("env", d);
        }
        if (!TextUtils.isEmpty(android.os.Build.VERSION.RELEASE))
        {
            b.a("osv", android.os.Build.VERSION.RELEASE);
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER))
        {
            b.a("mfr", Build.MANUFACTURER);
        }
        if (!TextUtils.isEmpty(e()))
        {
            b.a("ses", e());
        }
        if (!TextUtils.isEmpty(c()))
        {
            b.a("uid", c());
        }
        if (!TextUtils.isEmpty(f.b()))
        {
            b.a("crv", f.b());
        }
        if (!TextUtils.isEmpty(f.c()))
        {
            b.a("model", f.c());
        }
        if (!TextUtils.isEmpty(f.d()))
        {
            b.a("carrier", f.d());
        }
    }

    public String a()
    {
        String s = b.a.name;
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https").authority("iedc.fitbit.com").appendPath(s).appendPath("trk");
        java.util.Map.Entry entry;
        for (Iterator iterator = b.d.entrySet().iterator(); iterator.hasNext(); builder.appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return builder.build().toString();
    }

    public Interaction b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public String e()
    {
        if (e != null)
        {
            return String.valueOf(e);
        } else
        {
            return null;
        }
    }

    public long f()
    {
        return a;
    }
}
