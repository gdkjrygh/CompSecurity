// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            zzea

class zztf
    implements android.content.nterface.OnClickListener
{

    final zzea zztf;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = zztf.createIntent();
        zzea.zza(zztf).startActivity(dialoginterface);
    }

    Listener(zzea zzea1)
    {
        zztf = zzea1;
        super();
    }
}
