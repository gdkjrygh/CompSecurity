// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.permissions.runtime;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import b;
import gss;
import gsv;
import gsw;
import olm;
import ome;

public class NoPermissionsActivity extends ome
{

    private gss d;

    public NoPermissionsActivity()
    {
    }

    public static void a(NoPermissionsActivity nopermissionsactivity)
    {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        String s = String.valueOf(nopermissionsactivity.getPackageName());
        if (s.length() != 0)
        {
            s = "package:".concat(s);
        } else
        {
            s = new String("package:");
        }
        intent.setData(Uri.parse(s));
        nopermissionsactivity.startActivity(intent);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        d = (gss)f.a(gss);
    }

    public void onBackPressed()
    {
        finishAffinity();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.tW);
        findViewById(b.tV).setOnClickListener(new gsv(this));
    }

    protected void onResume()
    {
        super.onResume();
        if (d.a(this, gsw.a))
        {
            setResult(-1);
            finish();
        }
    }
}
