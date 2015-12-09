// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import org.c.c.c;

// Referenced classes of package com.dominos.android.sdk.data.http.power:
//            PowerRestInterface_

class val.arg0 extends c
{

    final PowerRestInterface_ this$0;
    final String val$arg0;

    public String getHeaderValue()
    {
        return (new StringBuilder("Bearer ")).append(val$arg0).toString();
    }

    ()
    {
        this$0 = final_powerrestinterface_;
        val$arg0 = String.this;
        super();
    }
}
