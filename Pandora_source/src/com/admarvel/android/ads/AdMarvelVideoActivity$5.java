// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.widget.LinearLayout;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

class this._cls0
    implements Runnable
{

    final AdMarvelVideoActivity this$0;

    public void run()
    {
        LinearLayout linearlayout = (LinearLayout)findViewById(AdMarvelVideoActivity.VIEW_ID);
        if (AdMarvelVideoActivity.access$7(AdMarvelVideoActivity.this) && linearlayout != null && linearlayout.getVisibility() == 0 && System.currentTimeMillis() - AdMarvelVideoActivity.access$17(AdMarvelVideoActivity.this) >= 3000L)
        {
            toolbarDisplayToggle(false);
        }
        AdMarvelVideoActivity.access$18(AdMarvelVideoActivity.this).stop();
    }

    Timer()
    {
        this$0 = AdMarvelVideoActivity.this;
        super();
    }
}
