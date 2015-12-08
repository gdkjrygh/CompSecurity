// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            eq

class sq
    implements android.content.gInterface.OnClickListener
{

    final String sq;
    final eq sr;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        eq.a(sr).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", sq), "Share via"));
    }

    ckListener(eq eq1, String s)
    {
        sr = eq1;
        sq = s;
        super();
    }
}
