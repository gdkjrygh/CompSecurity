// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk, PhotoGridActivity

final class dn
    implements android.content.DialogInterface.OnCancelListener
{

    final dk a;

    dn(dk dk1)
    {
        a = dk1;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface.dismiss();
        dk.b(a).K();
    }
}
