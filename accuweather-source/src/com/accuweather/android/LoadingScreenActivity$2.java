// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android;

import android.widget.TextView;

// Referenced classes of package com.accuweather.android:
//            LoadingScreenActivity

class this._cls0
    implements Runnable
{

    final LoadingScreenActivity this$0;

    public void run()
    {
        TextView textview = (TextView)findViewById();
        if (textview != null)
        {
            LoadingScreenActivity.access$200(LoadingScreenActivity.this, textview);
        }
    }

    ()
    {
        this$0 = LoadingScreenActivity.this;
        super();
    }
}
