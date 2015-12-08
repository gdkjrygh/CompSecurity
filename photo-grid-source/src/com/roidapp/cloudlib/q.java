// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.content.DialogInterface;
import com.roidapp.cloudlib.common.a;

// Referenced classes of package com.roidapp.cloudlib:
//            p, AccountMgrActivity

final class q
    implements android.content.DialogInterface.OnClickListener
{

    final p a;

    q(p p1)
    {
        a = p1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        com.roidapp.cloudlib.common.a.a(a.b);
        AccountMgrActivity.g(a.b);
    }
}
