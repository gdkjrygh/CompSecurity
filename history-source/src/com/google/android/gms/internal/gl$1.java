// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            gl

class wL
    implements android.content.gInterface.OnClickListener
{

    final String wL;
    final gl wM;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        gl.a(wM).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", wL), "Share via"));
    }

    ckListener(gl gl1, String s)
    {
        wM = gl1;
        wL = s;
        super();
    }
}
