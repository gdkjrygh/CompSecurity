// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.os.Bundle;
import com.dominos.utils.ReadResourceFile;
import com.dominos.views.InfoWebView;

// Referenced classes of package com.dominos.activities:
//            BaseActivity

public class LoyaltyTermsWebActivity extends BaseActivity
{

    private InfoWebView infoWebView;

    public LoyaltyTermsWebActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300b5);
        infoWebView = (InfoWebView)findViewById(0x7f0f03bc);
        bundle = (new ReadResourceFile()).readText(getApplicationContext(), 0x7f070004);
        infoWebView.loadDataWithBaseURL(null, bundle, "text/html", "utf-8", null);
    }
}
