// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            zzhs

class zzzz
    implements android.content.nterface.OnClickListener
{

    final zzhs zzzA;
    final String zzzz;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        zzhs.zza(zzzA).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", zzzz), "Share via"));
    }

    Listener(zzhs zzhs1, String s)
    {
        zzzA = zzhs1;
        zzzz = s;
        super();
    }
}
