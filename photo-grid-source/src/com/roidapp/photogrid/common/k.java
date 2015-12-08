// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.DialogInterface;
import com.roidapp.photogrid.release.PhotoGridActivity;

// Referenced classes of package com.roidapp.photogrid.common:
//            e

final class k
    implements android.content.DialogInterface.OnDismissListener
{

    final e a;

    k(e e1)
    {
        a = e1;
        super();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        if (e.b(a) instanceof PhotoGridActivity)
        {
            ((PhotoGridActivity)e.b(a)).c(e.c(a));
        }
    }
}
