// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Intent;
import com.pandora.android.provider.b;

// Referenced classes of package com.pandora.android.activity:
//            InterstitialBaseActivity

class a
    implements Runnable
{

    final int a;
    final InterstitialBaseActivity b;

    public void run()
    {
        b.setResult(a);
        Intent intent = (Intent)b.getIntent().getParcelableExtra("intent_followon_intent");
        if (intent != null)
        {
            b.S();
            b.N();
            b.a.c(intent);
            return;
        } else
        {
            b.finish();
            return;
        }
    }

    (InterstitialBaseActivity interstitialbaseactivity, int i)
    {
        b = interstitialbaseactivity;
        a = i;
        super();
    }
}
