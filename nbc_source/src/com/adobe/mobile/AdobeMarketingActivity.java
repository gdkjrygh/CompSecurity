// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.adobe.mobile:
//            Config

public abstract class AdobeMarketingActivity extends Activity
{

    public AdobeMarketingActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Config.setContext(getApplicationContext());
    }

    public void onPause()
    {
        super.onPause();
        Config.pauseCollectingLifecycleData();
    }

    public void onResume()
    {
        super.onResume();
        Config.collectLifecycleData(this);
    }
}
