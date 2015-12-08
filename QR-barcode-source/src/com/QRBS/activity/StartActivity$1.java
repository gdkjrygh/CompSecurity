// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import com.google.android.gms.ads.AdListener;

// Referenced classes of package com.QRBS.activity:
//            StartActivity

class ner extends AdListener
{

    final StartActivity this$0;

    public void onAdLoaded()
    {
        StartActivity.access$0(StartActivity.this);
    }

    ner()
    {
        this$0 = StartActivity.this;
        super();
    }
}
