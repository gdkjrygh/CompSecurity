// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            dc

class qS
    implements android.content.gInterface.OnClickListener
{

    final dc qS;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = qS.createIntent();
        dc.a(qS).startActivity(dialoginterface);
    }

    ckListener(dc dc1)
    {
        qS = dc1;
        super();
    }
}
