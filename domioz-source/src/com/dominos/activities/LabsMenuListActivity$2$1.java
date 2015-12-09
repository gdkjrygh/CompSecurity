// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.nina.dialog.agent.CartConfirmAgent;
import com.nuance.b.e.c;

class back extends com.dominos.utils.nCallback
{

    final edirection.MENULIST this$1;

    public void onAlertDismissed()
    {
        if (c.i())
        {
            CartConfirmAgent.redirection = com.dominos.nina.dialog.agent.ion.MENULIST;
        }
    }

    edirection()
    {
        this$1 = this._cls1.this;
        super();
    }
}
