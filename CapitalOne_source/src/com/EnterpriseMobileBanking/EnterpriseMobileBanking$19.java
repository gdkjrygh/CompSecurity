// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import com.EnterpriseMobileBanking.Plugins.Components.SwipeCover;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

class er
    implements Runnable
{

    final EnterpriseMobileBanking this$0;
    final SwipeCover val$cover;

    public void run()
    {
        val$cover.clearLast();
    }

    er()
    {
        this$0 = final_enterprisemobilebanking;
        val$cover = SwipeCover.this;
        super();
    }
}
