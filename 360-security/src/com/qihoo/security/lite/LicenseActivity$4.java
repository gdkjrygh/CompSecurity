// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.lite;

import android.view.View;
import android.widget.CheckBox;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.mobilesafe.b.a;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.lite:
//            LicenseActivity

class a
    implements android.view.er
{

    final LicenseActivity a;

    public void onClick(View view)
    {
        SharedPref.a(SecurityApplication.a(), "license", true);
        SharedPref.a(SecurityApplication.a(), "user_ex", LicenseActivity.g(a).isChecked());
        com.qihoo360.mobilesafe.b.a.f(LicenseActivity.h(a));
    }

    (LicenseActivity licenseactivity)
    {
        a = licenseactivity;
        super();
    }
}
