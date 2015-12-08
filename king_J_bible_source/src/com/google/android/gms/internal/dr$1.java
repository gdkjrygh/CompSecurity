// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            dr

class rm
    implements android.content.gInterface.OnClickListener
{

    final String rm;
    final dr rn;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dr.a(rn).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", rm), "Share via"));
    }

    ckListener(dr dr1, String s)
    {
        rn = dr1;
        rm = s;
        super();
    }
}
