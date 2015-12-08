// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.content.DialogInterface;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.common.a;

// Referenced classes of package com.roidapp.cloudlib:
//            g, AccountMgrActivity

final class h
    implements android.content.DialogInterface.OnClickListener
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        com.roidapp.cloudlib.common.a.o(a.b);
        l.d(a.b);
        AccountMgrActivity.d(a.b);
    }
}
