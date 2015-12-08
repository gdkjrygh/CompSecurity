// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class clc
{

    public clc()
    {
    }

    public static ckw a(Context context, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, bzm bzm, VersionInfoParcel versioninfoparcel)
    {
        return a(context, adsizeparcel, flag, flag1, bzm, versioninfoparcel, null, null);
    }

    public static ckw a(Context context, AdSizeParcel adsizeparcel, boolean flag, boolean flag1, bzm bzm, VersionInfoParcel versioninfoparcel, cbk cbk, bkf bkf)
    {
        context = new cld(cle.a(context, adsizeparcel, flag, bzm, versioninfoparcel, cbk, bkf));
        context.setWebViewClient(bkv.g().a(context, flag1));
        context.setWebChromeClient(bkv.g().a(context));
        return context;
    }
}
