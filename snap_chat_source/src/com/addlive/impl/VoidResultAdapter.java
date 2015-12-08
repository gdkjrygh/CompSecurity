// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import com.addlive.service.Responder;

// Referenced classes of package com.addlive.impl:
//            BaseResultAdapter

class VoidResultAdapter extends BaseResultAdapter
{

    VoidResultAdapter(Responder responder)
    {
        super(responder);
    }

    void handleSuccess(Object obj)
    {
        if (responder != null)
        {
            responder.resultHandler(null);
        }
    }
}
