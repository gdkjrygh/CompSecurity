// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import com.google.android.gms.b.V;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            j, s, v

public final class <init>
{

    final long a;
    final j b;
    private final String c;

    private String e()
    {
        return (new StringBuilder()).append(c).append(":start").toString();
    }

    final void a()
    {
        long l = ((s) (b)).i.c.a();
        android.content.edPreferences.Editor editor = b.a.edit();
        editor.remove(c());
        editor.remove(d());
        editor.putLong(e(), l);
        editor.commit();
    }

    final long b()
    {
        return b.a.getLong(e(), 0L);
    }

    final String c()
    {
        return (new StringBuilder()).append(c).append(":count").toString();
    }

    final String d()
    {
        return (new StringBuilder()).append(c).append(":value").toString();
    }

    private (j j1, String s1, long l)
    {
        b = j1;
        super();
        zzx.zzcs(s1);
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzZ(flag);
        c = s1;
        a = l;
    }

    a(j j1, String s1, long l, byte byte0)
    {
        this(j1, s1, l);
    }
}
