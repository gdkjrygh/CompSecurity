// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import java.util.ArrayList;

// Referenced classes of package com.worklight.wlclient.api:
//            WLPush, WLResponse

class tagName extends tagName
{

    private String tagName;
    final WLPush this$0;

    public void onSuccess(WLResponse wlresponse)
    {
        if (!WLPush.access$1200(WLPush.this).contains(tagName))
        {
            WLPush.access$1200(WLPush.this).add(tagName);
        }
        super.uccess(wlresponse);
    }

    public (String s)
    {
        this$0 = WLPush.this;
        super(WLPush.this);
        tagName = s;
    }
}
