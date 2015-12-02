// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.lite;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;

// Referenced classes of package com.qihoo.security.lite:
//            LicenseActivity

class a
    implements android.view.er
{

    final LicenseActivity a;

    public void onClick(View view)
    {
        if (!LicenseActivity.c(a))
        {
            try
            {
                view = new Intent("android.intent.action.VIEW", Uri.parse("http://www.360safe.com/m/privacy.html#ceip"));
                a.startActivity(view);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                LicenseActivity.b(a, true);
                LicenseActivity.d(a).setVisibility(8);
                LicenseActivity.e(a).setVisibility(0);
                LicenseActivity.b(a).loadUrl("http://www.360safe.com/m/privacy.html#ceip");
            }
            LicenseActivity.a(a, true);
            LicenseActivity.f(a).sendEmptyMessageDelayed(0, 1000L);
        }
    }

    (LicenseActivity licenseactivity)
    {
        a = licenseactivity;
        super();
    }
}
