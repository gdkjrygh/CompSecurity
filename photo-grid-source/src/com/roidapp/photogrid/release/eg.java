// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk, ei

final class eg
    implements android.content.DialogInterface.OnDismissListener
{

    final dk a;

    eg(dk dk1)
    {
        a = dk1;
        super();
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        dk.a(a, -1);
        if (dk.b(a, ei.j) != null)
        {
            dk.b(a, ei.j).setSelected(false);
        }
    }
}
