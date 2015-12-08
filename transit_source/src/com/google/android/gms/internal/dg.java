// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public class dg
{

    private static final Uri lg;
    private static final Uri lh;

    private static Uri A(String s)
    {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", s).build();
    }

    public static Intent B(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(A(s));
        intent.setPackage("com.android.vending");
        intent.addFlags(0x80000);
        return intent;
    }

    public static Intent C(String s)
    {
        s = Uri.parse((new StringBuilder()).append("bazaar://search?q=pname:").append(s).toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(s);
        intent.setFlags(0x80000);
        return intent;
    }

    public static Intent bj()
    {
        return new Intent("android.settings.DATE_SETTINGS");
    }

    public static Intent z(String s)
    {
        s = Uri.fromParts("package", s, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(s);
        return intent;
    }

    static 
    {
        lg = Uri.parse("http://plus.google.com/");
        lh = lg.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
