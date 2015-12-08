// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import com.google.common.base.Predicate;

// Referenced classes of package com.google.android.apps.wallet.wobs.add:
//            UserDataPrompt

final class val.promptId
    implements Predicate
{

    final int val$promptId;

    private boolean apply(UserDataPrompt userdataprompt)
    {
        return userdataprompt.getId().intValue() == val$promptId;
    }

    public final volatile boolean apply(Object obj)
    {
        return apply((UserDataPrompt)obj);
    }

    ()
    {
        val$promptId = i;
        super();
    }
}
