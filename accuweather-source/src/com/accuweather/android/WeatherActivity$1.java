// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.accuweather.android:
//            WeatherActivity

class val.chooserIntent
    implements android.media.tion.OnScanCompletedListener
{

    final WeatherActivity this$0;
    final Intent val$chooserIntent;

    public void onScanCompleted(String s, Uri uri)
    {
        startActivity(val$chooserIntent);
    }

    nCompletedListener()
    {
        this$0 = final_weatheractivity;
        val$chooserIntent = Intent.this;
        super();
    }
}
