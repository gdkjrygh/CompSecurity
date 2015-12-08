// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.preferences;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.Preference;

// Referenced classes of package com.accuweather.android.preferences:
//            TermsOfUseActivity

class this._cls0
    implements android.preference.ceClickListener
{

    final TermsOfUseActivity this$0;

    public boolean onPreferenceClick(Preference preference)
    {
        try
        {
            TermsOfUseActivity.access$002(TermsOfUseActivity.this, getPackageManager().getPackageInfo(getPackageName(), 0));
            TermsOfUseActivity.access$102(TermsOfUseActivity.this, TermsOfUseActivity.access$000(TermsOfUseActivity.this).versionName);
        }
        // Misplaced declaration of an exception variable
        catch (Preference preference)
        {
            preference.printStackTrace();
        }
        preference = new Intent("android.intent.action.SENDTO");
        preference.putExtra("android.intent.extra.SUBJECT", (new StringBuilder()).append("AccuWeather Android Application Version ").append(TermsOfUseActivity.access$100(TermsOfUseActivity.this)).toString());
        preference.setData(Uri.parse("mailto:support@accuweather.com"));
        startActivity(Intent.createChooser(preference, getResources().getString(com.accuweather.android.st)));
        return true;
    }

    ()
    {
        this$0 = TermsOfUseActivity.this;
        super();
    }
}
