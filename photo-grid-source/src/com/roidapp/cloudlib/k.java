// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.content.DialogInterface;
import com.roidapp.baselib.e.l;

// Referenced classes of package com.roidapp.cloudlib:
//            j, AccountMgrActivity

final class k
    implements android.content.DialogInterface.OnClickListener
{

    final j a;

    k(j j1)
    {
        a = j1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        com.roidapp.cloudlib.flickr.k.a();
        com.roidapp.cloudlib.flickr.k.a(a.b);
        l.d(a.b);
        AccountMgrActivity.e(a.b);
    }
}
