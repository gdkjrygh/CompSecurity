// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.release:
//            ab

final class ac
    implements android.content.DialogInterface.OnCancelListener
{

    final ab a;

    ac(ab ab)
    {
        a = ab;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface.dismiss();
    }
}
