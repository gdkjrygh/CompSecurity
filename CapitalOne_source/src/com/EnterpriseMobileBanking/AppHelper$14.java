// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper, EnterpriseMobileBanking

static final class val.visibility
    implements Runnable
{

    final int val$visibility;

    public void run()
    {
        AppHelper.access$000().findViewById(0x7f0800af).setVisibility(val$visibility);
    }

    ileBanking(int i)
    {
        val$visibility = i;
        super();
    }
}
