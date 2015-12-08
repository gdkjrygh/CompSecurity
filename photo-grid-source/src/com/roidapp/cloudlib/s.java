// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.roidapp.cloudlib:
//            al, AccountMgrActivity

final class s
    implements android.view.View.OnClickListener
{

    final AccountMgrActivity a;

    s(AccountMgrActivity accountmgractivity)
    {
        a = accountmgractivity;
        super();
    }

    public final void onClick(View view)
    {
        a.startActivity(new Intent(a, al.g().b()));
    }
}
