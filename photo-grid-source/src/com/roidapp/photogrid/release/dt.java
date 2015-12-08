// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk, ei

final class dt
    implements android.content.DialogInterface.OnCancelListener
{

    final dk a;

    dt(dk dk1)
    {
        a = dk1;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        if (dk.d(a) != null && ei.a()[dk.d(a).getId()] == ei.b)
        {
            dk.d(a).setSelected(false);
            dk.a(a, -1);
        }
    }
}
