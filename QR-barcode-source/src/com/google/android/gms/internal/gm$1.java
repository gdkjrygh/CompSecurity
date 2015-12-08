// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            gm

class ww
    implements android.content.gInterface.OnClickListener
{

    final String ww;
    final gm wx;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        gm.a(wx).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", ww), "Share via"));
    }

    ckListener(gm gm1, String s)
    {
        wx = gm1;
        ww = s;
        super();
    }
}
