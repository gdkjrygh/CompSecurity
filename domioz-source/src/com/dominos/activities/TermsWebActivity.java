// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Activity;
import android.os.Bundle;
import com.dominos.App;
import com.dominos.utils.ReadResourceFile;
import com.dominos.views.InfoWebView;

public class TermsWebActivity extends Activity
{

    private InfoWebView infoWebView;

    public TermsWebActivity()
    {
    }

    private String getResourceText()
    {
        ReadResourceFile readresourcefile = new ReadResourceFile();
        if (App.getInstance().getLangSetting().contains("es"))
        {
            return readresourcefile.readText(getApplicationContext(), 0x7f070015);
        } else
        {
            return readresourcefile.readText(getApplicationContext(), 0x7f070014);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300b5);
        infoWebView = (InfoWebView)findViewById(0x7f0f03bc);
        bundle = getResourceText();
        infoWebView.loadDataWithBaseURL(null, bundle, "text/html", "utf-8", null);
    }
}
