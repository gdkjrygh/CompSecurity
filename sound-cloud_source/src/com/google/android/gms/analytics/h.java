// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.E;
import com.google.android.gms.analytics.internal.L;
import com.google.android.gms.analytics.internal.V;
import com.google.android.gms.analytics.internal.b;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.b.ag;
import com.google.android.gms.b.ai;

public class h extends ai
{

    public final v e;
    public boolean f;

    public h(v v1)
    {
        super(v1.b(), v1.c);
        e = v1;
    }

    protected final void a(ag ag1)
    {
        ag1 = (com.google.android.gms.b.h)ag1.b(com/google/android/gms/b/h);
        if (TextUtils.isEmpty(((com.google.android.gms.b.h) (ag1)).b))
        {
            ag1.b = e.f().b();
        }
        if (f && TextUtils.isEmpty(((com.google.android.gms.b.h) (ag1)).d))
        {
            Object obj = e;
            v.a(((v) (obj)).h);
            obj = ((v) (obj)).h;
            ag1.d = ((b) (obj)).c();
            ag1.e = ((b) (obj)).b();
        }
    }

    public final ag b()
    {
        ag ag1 = c().a();
        v v1 = e;
        v.a(v1.i);
        ag1.a(v1.i.b());
        ag1.a(e.j.b());
        e();
        return ag1;
    }
}
