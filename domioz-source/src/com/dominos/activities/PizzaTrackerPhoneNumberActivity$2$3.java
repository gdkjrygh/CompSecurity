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

    final val.orderIndex this$1;
    final int val$orderIndex;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        processStoreProfileJson(s, val$orderIndex);
    }

    (int i)
    {
        this$1 = final_;
        val$orderIndex = i;
        super(PowerCallback.this);
    }
}
