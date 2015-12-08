// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.release:
//            ab

final class ae
    implements android.content.DialogInterface.OnClickListener
{

    final ab a;

    ae(ab ab1)
    {
        a = ab1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ab.a(ab.a(a), ab.b(a));
        dialoginterface.dismiss();
    }
}
