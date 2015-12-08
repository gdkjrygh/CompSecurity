// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public final class gg
{

    private static final Uri a;
    private static final Uri b;

    public static Intent a()
    {
        return new Intent("android.settings.DATE_SETTINGS");
    }

    public static Intent a(String s)
    {
        s = Uri.fromParts("package", s, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(s);
        return intent;
    }

    public static Intent b(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details").buildUpon().appendQueryParameter("id", s).build());
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
