// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.api;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class UriIntents
{

    private static Intent configureIntent(Context context, Intent intent, Uri uri)
    {
        intent.addFlags(0x20000000).addFlags(0x4000000);
        if ("comgooglewallet".equals(uri.getScheme()))
        {
            intent.setPackage(context.getPackageName());
        }
        return intent;
    }

    public static Intent create(Context context, Uri uri)
    {
        return configureIntent(context, new Intent("android.intent.action.VIEW", uri), uri);
    }

    public static Intent create(Context context, Uri uri, String s)
    {
        return configureIntent(context, (new Intent("android.intent.action.VIEW")).setDataAndType(uri, s), uri);
    }

    public static Intent create(Context context, String s)
    {
        return create(context, Uri.parse(s));
    }
}
