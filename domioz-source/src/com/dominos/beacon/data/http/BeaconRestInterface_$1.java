// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.data.http;

import org.c.c.c;

// Referenced classes of package com.dominos.beacon.data.http:
//            BeaconRestInterface_

class val.arg0 extends c
{

    final BeaconRestInterface_ this$0;
    final String val$arg0;

    public String getHeaderValue()
    {
        return (new StringBuilder("Bearer ")).append(val$arg0).toString();
    }

    _cls9()
    {
        this$0 = final_beaconrestinterface_;
        val$arg0 = String.this;
        super();
    }
}
