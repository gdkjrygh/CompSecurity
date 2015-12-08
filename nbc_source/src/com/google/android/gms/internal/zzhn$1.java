// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            zzhn

class zzGs
    implements android.content.nterface.OnClickListener
{

    final String zzGs;
    final zzhn zzGt;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        zzhn.zza(zzGt).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", zzGs), "Share via"));
    }

    Listener(zzhn zzhn1, String s)
    {
        zzGt = zzhn1;
        zzGs = s;
        super();
    }
}
