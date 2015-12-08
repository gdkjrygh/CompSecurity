// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            dh

class rj
    implements android.content.gInterface.OnClickListener
{

    final dh rj;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = rj.createIntent();
        dh.a(rj).startActivity(dialoginterface);
    }

    ckListener(dh dh1)
    {
        rj = dh1;
        super();
    }
}
