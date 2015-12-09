// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.data.http.power.DelegatingCallback;
import com.dominos.android.sdk.data.http.power.PowerCallback;

// Referenced classes of package com.dominos.activities:
//            PizzaTrackerPhoneNumberActivity

class <init> extends DelegatingCallback
{

    final essStoreProfileJson this$1;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        processStoreProfileJson(s, 0);
    }

    (PowerCallback powercallback)
    {
        this$1 = this._cls1.this;
        super(powercallback);
    }
}
