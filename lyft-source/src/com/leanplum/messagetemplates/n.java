// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;

// Referenced classes of package com.leanplum.messagetemplates:
//            o

final class n extends ActionCallback
{

    n()
    {
    }

    public final boolean onResponse(ActionContext actioncontext)
    {
        LeanplumActivityHelper.queueActionUponActive(new o(this, actioncontext));
        return true;
    }
}
