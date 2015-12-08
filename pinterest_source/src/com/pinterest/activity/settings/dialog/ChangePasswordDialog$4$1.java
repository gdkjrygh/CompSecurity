// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import com.pinterest.api.ApiResponseHandler;

class this._cls1 extends com.pinterest.api.remote.se
{

    final this._cls1 this$1;

    public void onFinish()
    {
        super.onFinish();
        ApiResponseHandler.setForceUnauthedLogout(true);
    }

    (boolean flag)
    {
        this$1 = this._cls1.this;
        super(flag);
    }
}
