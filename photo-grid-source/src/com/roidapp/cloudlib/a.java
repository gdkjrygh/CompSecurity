// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.view.View;

// Referenced classes of package com.roidapp.cloudlib:
//            AccountMgrActivity

final class a
    implements android.view.View.OnClickListener
{

    final AccountMgrActivity a;

    a(AccountMgrActivity accountmgractivity)
    {
        a = accountmgractivity;
        super();
    }

    public final void onClick(View view)
    {
        a.finish();
    }
}
