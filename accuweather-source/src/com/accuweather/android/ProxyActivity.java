// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.accuweather.android:
//            TermsAndConditionsActivity

public class ProxyActivity extends Activity
{

    public ProxyActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        startActivity((new Intent(this, com/accuweather/android/TermsAndConditionsActivity)).putExtras(getIntent().getExtras()));
        finish();
    }
}
