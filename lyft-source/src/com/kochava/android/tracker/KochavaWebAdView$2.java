// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.view.View;

// Referenced classes of package com.kochava.android.tracker:
//            KochavaWebAdView

class a
    implements android.view.r
{

    final KochavaWebAdView a;

    public void onClick(View view)
    {
        a.onBackPressed();
    }

    (KochavaWebAdView kochavawebadview)
    {
        a = kochavawebadview;
        super();
    }
}
