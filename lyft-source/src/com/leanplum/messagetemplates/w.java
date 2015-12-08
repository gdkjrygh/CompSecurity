// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.VariablesChangedCallback;

// Referenced classes of package com.leanplum.messagetemplates:
//            WebInterstitial, WebInterstitialOptions, v

final class w extends VariablesChangedCallback
{

    private final ActionContext a;

    w(v v, ActionContext actioncontext)
    {
        a = actioncontext;
        super();
    }

    public final void variablesChanged()
    {
        (new WebInterstitial(LeanplumActivityHelper.getCurrentActivity(), new WebInterstitialOptions(a))).show();
    }
}
