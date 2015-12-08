// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import com.dominos.android.sdk.common.BaseCallback;

// Referenced classes of package com.dominos.fordsync.service:
//            ProxyListener, AppLinkManager

class init> extends BaseCallback
{

    final ProxyListener this$0;

    public void onFinish()
    {
        ProxyListener.access$000(ProxyListener.this).performWelcomeInteraction();
    }

    ()
    {
        this$0 = ProxyListener.this;
        super();
    }
}
