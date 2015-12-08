// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.zzg;

public final class be extends bg.a
{

    private final zzg a;
    private final String b;
    private final String c;

    public be(zzg zzg1, String s, String s1)
    {
        a = zzg1;
        b = s;
        c = s1;
    }

    public String a()
    {
        return b;
    }

    public void a(a a1)
    {
        if (a1 == null)
        {
            return;
        } else
        {
            a.zzc((View)com.google.android.gms.a.b.a(a1));
            return;
        }
    }

    public String b()
    {
        return c;
    }

    public void c()
    {
        a.recordClick();
    }

    public void d()
    {
        a.recordImpression();
    }
}
