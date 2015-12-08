// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

// Referenced classes of package com.millennialmedia.android:
//            MMAdView

class this._cls0
    implements Runnable
{

    final MMAdView this$0;

    public void run()
    {
        float f = getContext().getResources().getDisplayMetrics().density;
        if (width <= 0)
        {
            width = (int)((float)getWidth() / f);
        }
        if (height <= 0)
        {
            height = (int)((float)getHeight() / f);
        }
    }

    ()
    {
        this$0 = MMAdView.this;
        super();
    }
}
