// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            ep

class st
    implements android.content.gInterface.OnClickListener
{

    final String st;
    final ep su;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ep.a(su).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", st), "Share via"));
    }

    ckListener(ep ep1, String s)
    {
        su = ep1;
        st = s;
        super();
    }
}
