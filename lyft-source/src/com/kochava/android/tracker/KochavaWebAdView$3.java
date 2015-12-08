// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.app.Activity;
import android.content.DialogInterface;
import android.util.Log;

// Referenced classes of package com.kochava.android.tracker:
//            KochavaWebAdView, Global

class a
    implements android.content.ancelListener
{

    final KochavaWebAdView a;

    public void onCancel(DialogInterface dialoginterface)
    {
        if (Global.a)
        {
            Log.i("KochavaAds", "Back pressed during loading dialog.");
        }
        a.a.onBackPressed();
    }

    r(KochavaWebAdView kochavawebadview)
    {
        a = kochavawebadview;
        super();
    }
}
