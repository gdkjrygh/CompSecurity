// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.b.a;
import com.google.android.gms.b.d;

// Referenced classes of package com.google.android.gms.internal:
//            dq

public final class dn extends dq
{

    private final zzg a;
    private final String b;
    private final String c;

    public dn(zzg zzg1, String s, String s1)
    {
        a = zzg1;
        b = s;
        c = s1;
    }

    public final String a()
    {
        return b;
    }

    public final void a(a a1)
    {
        if (a1 == null)
        {
            return;
        } else
        {
            a.zzc((View)com.google.android.gms.b.d.a(a1));
            return;
        }
    }

    public final String b()
    {
        return c;
    }

    public final void c()
    {
        a.recordClick();
    }

    public final void d()
    {
        a.recordImpression();
    }
}
