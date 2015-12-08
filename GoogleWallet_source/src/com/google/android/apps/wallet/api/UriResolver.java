// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.common.collect.ImmutableMap;

public class UriResolver
{

    private final Context context;
    private final ImmutableMap tapUriToActionMap;

    public UriResolver(Activity activity, ImmutableMap immutablemap)
    {
        context = activity;
        tapUriToActionMap = immutablemap;
    }

    private Intent createIntentFromUri(Uri uri)
    {
        uri = new Intent("android.intent.action.VIEW", uri);
        uri.addFlags(0x20000000);
        uri.addFlags(0x4000000);
        uri.addFlags(0x10000);
        uri.setPackage(context.getPackageName());
        return uri;
    }

    public final void resolve(Uri uri)
    {
        if (tapUriToActionMap.containsKey(uri))
        {
            ((Runnable)tapUriToActionMap.get(uri)).run();
            return;
        } else
        {
            context.startActivity(createIntentFromUri(uri));
            return;
        }
    }
}
