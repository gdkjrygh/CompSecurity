// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.ni;
import com.google.android.gms.internal.nj;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzd, AdRequestInfoParcel, zzj

public final class a extends zzd
{

    private final Context a;

    public final void zzfH()
    {
    }

    public final zzj zzfI()
    {
        Object obj = cy.b;
        obj = new cn((String)zzp.zzbE().a(((com.google.android.gms.internal.cq) (obj))));
        return nj.a(a, ((cn) (obj)), ni.a());
    }

    public tInfoParcel(Context context, AdRequestInfoParcel adrequestinfoparcel, tInfoParcel tinfoparcel)
    {
        super(adrequestinfoparcel, tinfoparcel);
        a = context;
    }
}
