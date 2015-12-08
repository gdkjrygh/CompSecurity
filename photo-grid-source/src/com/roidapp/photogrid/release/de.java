// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.release:
//            dc, PhotoGridActivity

final class de
    implements android.content.DialogInterface.OnClickListener
{

    final dc a;

    de(dc dc1)
    {
        a = dc1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dc.d(a);
        dc.e(a).c(dc.e(a).n - 1);
    }
}
