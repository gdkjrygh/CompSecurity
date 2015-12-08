// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk, ei

final class dr
    implements android.content.DialogInterface.OnClickListener
{

    final dk a;

    dr(dk dk1)
    {
        a = dk1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        if (dk.d(a) != null && ei.a()[dk.d(a).getId()] == ei.e)
        {
            dk.d(a).setSelected(false);
            dk.a(a, -1);
        }
    }
}
