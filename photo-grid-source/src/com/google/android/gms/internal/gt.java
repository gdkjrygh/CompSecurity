// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.common.api.q;

// Referenced classes of package com.google.android.gms.internal:
//            gv, gw, ry

public abstract class gt
    implements q
{

    protected ry a;

    public gt(ry ry)
    {
        a = ry;
    }

    public abstract void a();

    protected final void a(String s, String s1, int i)
    {
        zza.zzJt.post(new gv(this, s, s1, i));
    }

    protected final void a(String s, String s1, String s2, String s3)
    {
        zza.zzJt.post(new gw(this, s, s1, s2, s3));
    }

    public abstract boolean a(String s);

    public final void b()
    {
    }
}
