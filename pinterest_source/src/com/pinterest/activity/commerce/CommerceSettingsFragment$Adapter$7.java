// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.view.View;
import com.pinterest.activity.commerce.util.CommerceUtil;

class this._cls1
    implements android.view.Fragment.Adapter._cls7
{

    final this._cls1 this$1;

    public void onClick(View view)
    {
        CommerceUtil.goPaymentIntent(view.getContext());
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
