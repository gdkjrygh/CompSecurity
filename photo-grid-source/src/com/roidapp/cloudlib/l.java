// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib:
//            j, AccountMgrActivity

final class l
    implements android.content.DialogInterface.OnClickListener
{

    final j a;

    l(j j1)
    {
        a = j1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        AccountMgrActivity.e(a.b);
    }
}
