// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge

final class gh
    implements android.content.DialogInterface.OnCancelListener
{

    final ge a;

    gh(ge ge1)
    {
        a = ge1;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        ge.t(a);
    }
}
