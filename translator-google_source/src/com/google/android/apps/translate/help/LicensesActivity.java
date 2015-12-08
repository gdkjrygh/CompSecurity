// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.help;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.logging.e;

public class LicensesActivity extends Activity
    implements android.view.View.OnKeyListener
{

    public LicensesActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new WebView(this);
        setContentView(bundle);
        getWindow().setLayout(-1, -1);
        bundle.setOnKeyListener(this);
        bundle.loadUrl("file:///android_asset/licenses.html");
    }

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (i == 111)
        {
            finish();
            return true;
        } else
        {
            return false;
        }
    }

    protected void onStart()
    {
        super.onStart();
        Singleton.b().c("licenses");
    }
}
