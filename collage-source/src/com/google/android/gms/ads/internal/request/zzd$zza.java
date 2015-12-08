// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.internal.ar;
import com.google.android.gms.internal.au;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.fm;
import com.google.android.gms.internal.fn;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzd, AdRequestInfoParcel, zzj

public static final class mContext extends zzd
{

    private final Context mContext;

    public void zzfx()
    {
    }

    public zzj zzfy()
    {
        ar ar1 = new ar((String)ay.b.c());
        return fn.a(mContext, ar1, fm.a());
    }

    public tInfoParcel(Context context, AdRequestInfoParcel adrequestinfoparcel, tInfoParcel tinfoparcel)
    {
        super(adrequestinfoparcel, tinfoparcel);
        mContext = context;
    }
}
