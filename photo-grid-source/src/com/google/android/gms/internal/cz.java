// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cy, cx, qa, oa, 
//            ny

public final class cz
{

    private boolean a;
    private String b;
    private Map c;
    private Context d;
    private String e;

    public cz(Context context, String s)
    {
        d = null;
        e = null;
        d = context;
        e = s;
        s = cy.G;
        a = ((Boolean)zzp.zzbE().a(s)).booleanValue();
        s = cy.H;
        b = (String)zzp.zzbE().a(s);
        c = new LinkedHashMap();
        c.put("s", "gmob_sdk");
        c.put("v", "3");
        c.put("os", android.os.Build.VERSION.RELEASE);
        c.put("sdk", android.os.Build.VERSION.SDK);
        s = c;
        zzp.zzbv();
        s.put("device", qa.c());
        s = c;
        if (context.getApplicationContext() != null)
        {
            context = context.getApplicationContext().getPackageName();
        } else
        {
            context = context.getPackageName();
        }
        s.put("app", context);
        context = zzp.zzbB().a(d);
        c.put("network_coarse", Integer.toString(((ny) (context)).m));
        c.put("network_fine", Integer.toString(((ny) (context)).n));
    }

    final boolean a()
    {
        return a;
    }

    final String b()
    {
        return b;
    }

    final Context c()
    {
        return d;
    }

    final String d()
    {
        return e;
    }

    final Map e()
    {
        return c;
    }
}
