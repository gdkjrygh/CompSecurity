// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib:
//            p, AccountMgrActivity

final class r
    implements android.content.DialogInterface.OnClickListener
{

    final p a;

    r(p p1)
    {
        a = p1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        AccountMgrActivity.g(a.b);
    }
}
