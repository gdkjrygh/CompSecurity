// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.common.api.f;

// Referenced classes of package com.google.android.gms.internal:
//            hs

public abstract class cs
    implements f
{

    protected hs a;

    public cs(hs hs)
    {
        a = hs;
    }

    public abstract void a();

    protected void a(String s, String s1)
    {
        zza.zzIy.post(new zzdr._cls3(this, s, s1));
    }

    protected void a(String s, String s1, int i)
    {
        zza.zzIy.post(new zzdr._cls2(this, s, s1, i));
    }

    protected void a(String s, String s1, int i, int j, boolean flag)
    {
        zza.zzIy.post(new zzdr._cls1(this, s, s1, i, j, flag));
    }

    public abstract boolean a(String s);

    protected String b(String s)
    {
        return zzk.zzcE().zzaB(s);
    }

    public void b()
    {
    }
}
