// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;

public class zzo
{

    private static final Uri zzQo;
    private static final Uri zzQp;

    public static Intent zzbj(String s)
    {
        s = Uri.fromParts("package", s, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(s);
        return intent;
    }

    private static Uri zzbk(String s)
    {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", s).build();
    }

    public static Intent zzbl(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(zzbk(s));
        intent.setPackage("com.android.vending");
        intent.addFlags(0x80000);
        return intent;
    }

    public static Intent zzjl()
    {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    static 
    {
        Uri uri = Uri.parse("http://plus.google.com/");
        zzQo = uri;
        zzQp = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
