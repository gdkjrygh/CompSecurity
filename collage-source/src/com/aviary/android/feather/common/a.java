// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class a
{

    public a()
    {
    }

    public static ComponentName a(Context context)
    {
        return new ComponentName(context.getPackageName(), "com.aviary.android.feather.SubscriptionActivity");
    }

    public static Intent a(Context context, String s, String s1)
    {
        Intent intent = new Intent("aviary.intent.action.CDS_DOWNLOAD_START");
        intent.putExtra("extra-api-key-secret", s);
        intent.putExtra("extra-billing-public-key", s1);
        intent.setComponent(b(context));
        return intent;
    }

    public static Intent a(Context context, String s, String s1, String s2)
    {
        Intent intent = new Intent("aviary.intent.action.VIEW_SUBSCRIPTIONS");
        intent.setComponent(a(context));
        intent.putExtra("extra-api-key-secret", s);
        intent.putExtra("extra-where-from", s2);
        intent.putExtra("extra-billing-public-key", s1);
        return intent;
    }

    private static ComponentName b(Context context)
    {
        return new ComponentName(context.getPackageName(), "com.aviary.android.feather.cds.AviaryCdsService");
    }

    public static Intent b(Context context, String s, String s1, String s2)
    {
        Intent intent = new Intent("aviary.intent.action.CDS_RESTORE_USER_ITEMS");
        intent.setComponent(b(context));
        intent.putExtra("extra-api-key-secret", s1);
        intent.putExtra("extra-billing-public-key", s2);
        intent.putExtra("type", s);
        return intent;
    }

    public static Intent c(Context context, String s, String s1, String s2)
    {
        Intent intent = new Intent("aviary.intent.action.CDS_RESTORE_OWNED_PACKS");
        intent.setComponent(b(context));
        intent.putExtra("extra-api-key-secret", s1);
        intent.putExtra("extra-billing-public-key", s2);
        intent.putExtra("type", s);
        return intent;
    }
}
