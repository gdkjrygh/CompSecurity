// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            zzeo

class zzyt
    implements android.content.nterface.OnClickListener
{

    final zzeo zzyt;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = zzyt.createIntent();
        zzeo.zza(zzyt).startActivity(dialoginterface);
    }

    Listener(zzeo zzeo1)
    {
        zzyt = zzeo1;
        super();
    }
}
