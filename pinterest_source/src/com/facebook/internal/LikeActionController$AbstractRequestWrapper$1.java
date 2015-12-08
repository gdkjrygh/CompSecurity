// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.Response;

class this._cls1
    implements com.facebook.rapper._cls1
{

    final ocessSuccess this$1;

    public void onCompleted(Response response)
    {
        ror = response.getError();
        if (ror != null)
        {
            ocessError(ror);
            return;
        } else
        {
            ocessSuccess(response);
            return;
        }
    }

    I()
    {
        this$1 = this._cls1.this;
        super();
    }
}
