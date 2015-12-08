// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.accuweather.android.preferences.TermsOfUseActivity;

public class EmailAccuwx extends TermsOfUseActivity
{

    public EmailAccuwx()
    {
    }

    private String getManifestVersionName()
    {
        String s;
        try
        {
            s = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return "";
        }
        return s;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new Intent("android.intent.action.SEND");
        bundle.putExtra("android.intent.extra.SUBJECT", (new StringBuilder()).append("AccuWeather Android Application Version ").append(getManifestVersionName()).toString());
        bundle.putExtra("android.intent.extra.EMAIL", new String[] {
            "support@accuweather.com"
        });
        bundle.putExtra("android.intent.extra.TEXT", "");
        bundle.setType("message/rfc822");
        startActivity(Intent.createChooser(bundle, getString(R.string.ChooseFromList)));
        finish();
    }
}
