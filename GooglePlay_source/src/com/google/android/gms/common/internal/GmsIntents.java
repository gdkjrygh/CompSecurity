// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

public final class GmsIntents
{

    private static final Uri FIND_PEOPLE_URI;
    private static final Uri PLUS_BASE_URI;

    public static Intent createAndroidWearUpdateIntent()
    {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    public static Intent createPlayStoreGamesIntent(Context context)
    {
        Intent intent1 = new Intent("android.intent.action.VIEW");
        intent1.setData(Uri.parse("http://play.google.com/store/apps/category/GAME"));
        intent1.addFlags(0x80000);
        intent1.setPackage("com.android.vending");
        Intent intent = intent1;
        if (context.getPackageManager().resolveActivity(intent1, 0x10000) == null)
        {
            intent = new Intent(intent1.getAction(), intent1.getData());
            intent.setFlags(intent1.getFlags());
        }
        return intent;
    }

    public static Intent createPlayStoreIntent(String s)
    {
        return createPlayStoreIntent(s, null);
    }

    public static Intent createPlayStoreIntent(String s, String s1)
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

    public static Intent createPlayStoreLightPurchaseFlowIntent(Context context, String s, String s1)
    {
        Intent intent = new Intent("com.android.vending.billing.PURCHASE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.android.vending");
        if (!TextUtils.isEmpty(s))
        {
            intent.putExtra("authAccount", s);
        }
        intent.putExtra("backend", 3);
        intent.putExtra("document_type", 1);
        intent.putExtra("full_docid", s1);
        intent.putExtra("backend_docid", s1);
        intent.putExtra("offer_type", 1);
        s = intent;
        if (!isIntentResolvable(context.getPackageManager(), intent))
        {
            s = new Intent("android.intent.action.VIEW");
            s.setData(Uri.parse(String.format("https://play.google.com/store/apps/details?id=%1$s&rdid=%1$s&rdot=%2$d", new Object[] {
                s1, Integer.valueOf(1)
            })));
            s.setPackage("com.android.vending");
            s.putExtra("use_direct_purchase", true);
        }
        return s;
    }

    public static Intent createSettingsIntent(String s)
    {
        s = Uri.fromParts("package", s, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(s);
        return intent;
    }

    public static Intent createShowProfileIntent(Context context, String s)
    {
        s = Uri.parse(String.format("http://plus.google.com/%s/about", new Object[] {
            s
        }));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(s);
        intent.setPackage("com.google.android.apps.plus");
        if (isIntentResolvable(context.getPackageManager(), intent))
        {
            return intent;
        } else
        {
            return createPlayStoreIntent("com.google.android.apps.plus", null);
        }
    }

    public static Uri getPlayStoreUri(String s)
    {
        return Uri.parse("https://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", s).build();
    }

    private static boolean isIntentResolvable(PackageManager packagemanager, Intent intent)
    {
        return packagemanager.resolveActivity(intent, 0x10000) != null;
    }

    static 
    {
        Uri uri = Uri.parse("http://plus.google.com/");
        PLUS_BASE_URI = uri;
        FIND_PEOPLE_URI = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
