// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge

final class gl
    implements android.content.DialogInterface.OnClickListener
{

    final ge a;

    gl(ge ge)
    {
        a = ge;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
