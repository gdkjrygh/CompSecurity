// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            sg, sh, qd, ry, 
//            ad, dm

public final class sf
{

    public sf()
    {
    }

    public static ry a(Context context, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, ad ad, VersionInfoParcel versioninfoparcel)
    {
        return a(context, adsizeparcel, flag, flag1, ad, versioninfoparcel, null, null);
    }

    public static ry a(Context context, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, ad ad, VersionInfoParcel versioninfoparcel, dm dm, zzd zzd)
    {
        context = new sg(sh.a(context, adsizeparcel, flag, ad, versioninfoparcel, dm, zzd));
        context.setWebViewClient(zzp.zzbx().a(context, flag1));
        context.setWebChromeClient(zzp.zzbx().a(context));
        return context;
    }
}
