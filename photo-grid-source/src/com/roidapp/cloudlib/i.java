// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib:
//            g, AccountMgrActivity

final class i
    implements android.content.DialogInterface.OnClickListener
{

    final g a;

    i(g g1)
    {
        a = g1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        AccountMgrActivity.d(a.b);
    }
}
