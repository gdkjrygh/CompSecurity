// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.VariablesChangedCallback;

// Referenced classes of package com.leanplum.messagetemplates:
//            CenterPopup, CenterPopupOptions, k

final class l extends VariablesChangedCallback
{

    private final ActionContext a;

    l(k k, ActionContext actioncontext)
    {
        a = actioncontext;
        super();
    }

    public final void variablesChanged()
    {
        (new CenterPopup(LeanplumActivityHelper.getCurrentActivity(), new CenterPopupOptions(a))).show();
    }
}
