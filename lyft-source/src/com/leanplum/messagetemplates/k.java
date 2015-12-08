// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.VariablesChangedCallback;

// Referenced classes of package com.leanplum.messagetemplates:
//            l, j

final class k extends VariablesChangedCallback
{

    private final ActionContext a;

    k(j j, ActionContext actioncontext)
    {
        a = actioncontext;
        super();
    }

    public final void variablesChanged()
    {
        LeanplumActivityHelper.queueActionUponActive(new l(this, a));
    }
}
