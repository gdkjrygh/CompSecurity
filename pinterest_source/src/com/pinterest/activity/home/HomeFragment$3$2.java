// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

class this._cls1
    implements android.view.ner
{

    final  this$1;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.CANCEL_BUTTON, ComponentType.NAG);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
