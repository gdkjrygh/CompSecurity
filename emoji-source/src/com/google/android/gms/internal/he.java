// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public class he
{

    private static final Uri GG;
    private static final Uri GH;

    public static Intent aB(String s)
    {
        s = Uri.fromParts("package", s, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(s);
        return intent;
    }

    private static Uri aC(String s)
    {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", s).build();
    }

    public static Intent aD(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(aC(s));
        intent.setPackage("com.android.vending");
        intent.addFlags(0x80000);
        return intent;
    }

    public static Intent fA()
    {
        return new Intent("android.settings.DATE_SETTINGS");
    }

    static 
    {
        GG = Uri.parse("http://plus.google.com/");
        GH = GG.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
