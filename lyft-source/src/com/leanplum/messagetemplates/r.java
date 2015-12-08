// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.callbacks.ActionCallback;

// Referenced classes of package com.leanplum.messagetemplates:
//            s

final class r extends ActionCallback
{

    r()
    {
    }

    public final boolean onResponse(ActionContext actioncontext)
    {
        Leanplum.addOnceVariablesChangedAndNoDownloadsPendingHandler(new s(this, actioncontext));
        return true;
    }
}
