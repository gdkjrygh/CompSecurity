// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public final class ar
{

    private static final Uri a;
    private static final Uri b;

    public static Intent a()
    {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    public static Intent a(String s)
    {
        s = Uri.fromParts("package", s, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(s);
        return intent;
    }

    public static Intent a(String s, String s1)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        s = Uri.parse("market://details").buildUpon().appendQueryParameter("id", s);
        if (!TextUtils.isEmpty(s1))
        {
            s.appendQueryParameter("pcampaignid", s1);
        }
        intent.setData(s.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(0x80000);
        return intent;
    }

    static 
    {
        Uri uri = Uri.parse("http://plus.google.com/");
        a = uri;
        b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
